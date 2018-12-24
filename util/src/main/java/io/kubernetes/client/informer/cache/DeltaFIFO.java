package io.kubernetes.client.informer.cache;

import io.kubernetes.client.util.common.Collections;
import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.commons.lang3.tuple.MutablePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// DeltaFIFO is a java portable of k/client-go's DeltaFIFO

// NOTE(yue9944882): The DeltaFIFO inherits from a Object queue since that we are
// actually reading from it as Deltas but writing it as Kubernetes object. this is
// an issue existing in k/k.
public class DeltaFIFO<ApiType> implements Store<Object> {

  private static final Logger log = LoggerFactory.getLogger(DeltaFIFO.class);

  private Function<ApiType, String> keyFunc;

  // Mapping deltas w/ key by calling keyFunc
  private Map<String, Deque<MutablePair<DeltaType, Object>>> items;

  // an underlying queue storing incoming items' keys
  private Deque<String> queue;

  //
  private Store<ApiType> knownObjects;

  // populated is true if the first batch of items inserted by Replace() has
  // been populated or Delete/Add/Update was called first.
  private boolean populated = false;

  // initialPopulationCount is the number of items inserted by the first call
  // of Replace()
  private int initialPopulationCount;

  /** lock provides thread safety * */
  private ReadWriteLock lock = new ReentrantReadWriteLock();

  /** indicates if the store is empty * */
  private Condition notEmpty;

  /**
   * Constructor.
   *
   * @param keyFunc the key func
   * @param knownObjects the known objects
   */
  public DeltaFIFO(Function<ApiType, String> keyFunc, Store knownObjects) {
    this.keyFunc = keyFunc;
    this.knownObjects = knownObjects;
    this.items = new HashMap<>();
    this.queue = new LinkedList<>();
    this.notEmpty = lock.writeLock().newCondition();
  }

  /**
   * Add items to the delta FIFO.
   *
   * @param obj the obj
   */
  @Override
  public void add(Object obj) {
    lock.writeLock().lock();
    try {
      populated = true;
      this.queueActionLocked(DeltaType.Added, obj);
    } finally {
      lock.writeLock().unlock();
    }
  }

  /**
   * Update items in the delta FIFO.
   *
   * @param obj the obj
   */
  @Override
  public void update(Object obj) {
    lock.writeLock().lock();
    try {
      populated = true;
      this.queueActionLocked(DeltaType.Updated, obj);
    } finally {
      lock.writeLock().unlock();
    }
  }

  /**
   * Delete items from the delta FIFO.
   *
   * @param obj the obj
   */
  @Override
  public void delete(Object obj) {
    String id = this.keyOf(obj);
    lock.writeLock().lock();
    try {
      this.populated = true;
      if (this.knownObjects == null) {
        if (!this.items.containsKey(id)) {
          // Presumably, this was deleted when a relist happened.
          // Don't provide a second report of the same deletion.
          return;
        }
      } else {
        // We only want to skip the "deletion" action if the object doesn't
        // exist in knownObjects and it doesn't have corresponding item in items.
        if (this.knownObjects.getByKey(id) == null && !this.items.containsKey(id)) {
          return;
        }
      }
      this.queueActionLocked(DeltaType.Deleted, obj);
    } finally {
      lock.writeLock().unlock();
    }
  }

  /**
   * Replace the item forcibly.
   *
   * @param list the list
   * @param resourceVersion the resource version
   */
  @Override
  public void replace(List list, String resourceVersion) {
    lock.writeLock().lock();
    try {
      Set<String> keys = new HashSet<>();
      for (Object obj : list) {
        String key = this.keyOf(obj);
        keys.add(key);
        this.queueActionLocked(DeltaType.Sync, obj);
      }

      if (this.knownObjects == null) {
        for (Map.Entry<String, Deque<MutablePair<DeltaType, Object>>> entry :
            this.items.entrySet()) {
          if (keys.contains(entry.getKey())) {
            continue;
          }

          Object deletedObj = null;
          MutablePair<DeltaType, Object> delta = entry.getValue().peekLast(); // get newest
          if (delta != null) {
            deletedObj = delta.getRight();
          }
          this.queueActionLocked(
              DeltaType.Deleted, new DeletedFinalStateUnknown(entry.getKey(), deletedObj));
        }

        if (!this.populated) {
          this.populated = true;
          this.initialPopulationCount = list.size();
        }
        return;
      }

      // Detect deletions not already in the queue.
      List<String> knownKeys = this.knownObjects.listKeys();
      int queueDeletion = 0;
      for (String knownKey : knownKeys) {
        if (keys.contains(knownKey)) {
          continue;
        }

        Object deletedObj = this.knownObjects.getByKey(knownKey);
        if (deletedObj == null) {
          log.warn(
              "Key {} does not exist in known objects store, placing DeleteFinalStateUnknown marker without object",
              knownKey);
        }
        queueDeletion++;
        this.queueActionLocked(
            DeltaType.Deleted, new DeletedFinalStateUnknown<>(knownKey, deletedObj));
      }

      if (!this.populated) {
        this.populated = true;
        this.initialPopulationCount = list.size() + queueDeletion;
      }
    } finally {
      lock.writeLock().unlock();
    }
  }

  /**
   * Re-sync the delta FIFO. First, It locks the queue to block any more write operation until it
   * finishes processing all the pending items in the queue.
   */
  @Override
  public void resync() {
    lock.writeLock().lock();
    try {
      if (this.knownObjects == null) {
        return;
      }

      List<String> keys = this.knownObjects.listKeys();
      for (String key : keys) {
        syncKeyLocked(key);
      }
    } finally {
      lock.writeLock().unlock();
    }
  }

  /**
   * List keys list.
   *
   * @return the list
   */
  @Override
  public List<String> listKeys() {
    lock.readLock().lock();
    try {
      List<String> keyList = new ArrayList<>(items.size());
      for (Map.Entry<String, Deque<MutablePair<DeltaType, Object>>> entry : items.entrySet()) {
        keyList.add(entry.getKey());
      }
      return keyList;
    } finally {
      lock.readLock().unlock();
    }
  }

  /**
   * Get object.
   *
   * @param obj the obj
   * @return the object
   */
  @Override
  public Object get(Object obj) {
    String key = this.keyOf(obj);
    return this.getByKey(key);
  }

  /**
   * Gets get by key.
   *
   * @param key the key
   * @return the get by key
   */
  @Override
  public Deque<MutablePair<DeltaType, Object>> getByKey(String key) {
    lock.readLock().lock();
    try {
      Deque<MutablePair<DeltaType, Object>> deltas = this.items.get(key);
      if (deltas != null) {
        // returning a shallow copy
        return new LinkedList<>(deltas);
      }
    } finally {
      lock.readLock().unlock();
    }
    return null;
  }

  /**
   * List list.
   *
   * @return the list
   */
  @Override
  public List<Object> list() {
    lock.readLock().lock();
    List<Object> objects = new ArrayList<>();
    try {
      // TODO: make a generic deep copy utility
      for (Map.Entry<String, Deque<MutablePair<DeltaType, Object>>> entry : items.entrySet()) {
        Deque<MutablePair<DeltaType, Object>> copiedDeltas = new LinkedList<>(entry.getValue());
        objects.add(copiedDeltas);
      }
    } finally {
      lock.readLock().unlock();
    }
    return objects;
  }

  /**
   * Pop deltas.
   *
   * @param func the func
   * @return the deltas
   * @throws Exception the exception
   */
  public Deque<MutablePair<DeltaType, Object>> pop(
      Consumer<Deque<MutablePair<DeltaType, Object>>> func) throws InterruptedException {
    lock.writeLock().lock();
    try {
      while (true) {
        while (queue.isEmpty()) {
          notEmpty.await();
        }
        // there should have data now
        String id = this.queue.removeFirst();
        if (this.initialPopulationCount > 0) {
          this.initialPopulationCount--;
        }
        if (!this.items.containsKey(id)) {
          // Item may have been deleted subsequently.
          continue;
        }

        Deque<MutablePair<DeltaType, Object>> deltas = this.items.get(id);
        this.items.remove(id);
        func.accept(deltas);
        // Don't make any copyDeltas here
        return deltas;
      }
    } finally {
      lock.writeLock().unlock();
    }
  }

  /**
   * Has synced boolean.
   *
   * @return the boolean
   */
  public boolean hasSynced() {
    lock.readLock().lock();
    try {
      return this.populated && this.initialPopulationCount == 0;
    } finally {
      lock.readLock().unlock();
    }
  }

  /** queueActionLocked appends to the delta list for the object. Caller must hold the lock. */
  private void queueActionLocked(DeltaType actionType, Object obj) {
    String id = this.keyOf(obj);

    // If object is supposed to be deleted (last event is Deleted),
    // then we should ignore Sync events, because it would result in
    // recreation of this object.
    if (actionType == DeltaType.Sync && this.willObjectBeDeletedLocked(id)) {
      return;
    }

    Deque<MutablePair<DeltaType, Object>> deltas = items.get(id);
    if (deltas == null) {
      Deque<MutablePair<DeltaType, Object>> deltaList = new LinkedList<>();
      deltaList.add(new MutablePair(actionType, obj));
      deltas = new LinkedList<>(deltaList);
    } else {
      deltas.add(new MutablePair<DeltaType, Object>(actionType, obj));
    }

    // TODO(yue9944882): Eliminate the force class casting here
    Deque<MutablePair<DeltaType, Object>> combinedDeltaList =
        combineDeltas((LinkedList<MutablePair<DeltaType, Object>>) deltas);

    boolean exist = items.containsKey(id);
    if (combinedDeltaList != null && combinedDeltaList.size() > 0) {
      if (!exist) {
        this.queue.add(id);
      }
      this.items.put(id, new LinkedList<>(combinedDeltaList));
      notEmpty.signalAll();
    } else {
      this.items.remove(id);
    }
  }

  /**
   * willObjectBeDeletedLocked returns true only if the last delta for the give object is Deleted.
   * Caller must hold the lock.
   */
  private boolean willObjectBeDeletedLocked(String id) {
    if (!this.items.containsKey(id)) {
      return false;
    }
    Deque<MutablePair<DeltaType, Object>> deltas = this.items.get(id);
    return !(Collections.isEmptyCollection(deltas))
        && deltas.peekLast().getLeft().equals(DeltaType.Deleted);
  }

  // KeyOf exposes f's keyFunc, but also detects the key of a Deltas object or
  // DeletedFinalStateUnknown objects.
  private String keyOf(Object obj) {
    Object innerObj = obj;
    if (obj instanceof Deque) {
      Deque<MutablePair<DeltaType, Object>> deltas = (Deque<MutablePair<DeltaType, Object>>) obj;
      if (deltas.size() == 0) {
        throw new NoSuchElementException("0 length Deltas object; can't get key");
      }
      innerObj = deltas.peekLast().getRight();
    }
    if (innerObj instanceof DeletedFinalStateUnknown) {
      return ((DeletedFinalStateUnknown) innerObj).key;
    }
    return keyFunc.apply((ApiType) innerObj);
  }

  /** Add Sync delta. Caller must hold the lock. */
  private void syncKeyLocked(String key) {
    ApiType obj = this.knownObjects.getByKey(key);
    if (obj == null) {
      return;
    }

    String id = this.keyOf(obj);
    Deque<MutablePair<DeltaType, Object>> deltas = this.items.get(id);
    if (deltas != null && !(Collections.isEmptyCollection(deltas))) {
      return;
    }

    this.queueActionLocked(DeltaType.Sync, obj);
  }

  // re-listing and watching can deliver the same update multiple times in any
  // order. This will combine the most recent two deltas if they are the same.
  private Deque<MutablePair<DeltaType, Object>> combineDeltas(
      LinkedList<MutablePair<DeltaType, Object>> deltas) {
    if (deltas.size() < 2) {
      return deltas;
    }
    int size = deltas.size();
    MutablePair<DeltaType, Object> d1 = deltas.peekLast();
    MutablePair<DeltaType, Object> d2 = deltas.get(size - 2);
    MutablePair<DeltaType, Object> out = isDuplicate(d1, d2);
    if (out != null) {
      Deque<MutablePair<DeltaType, Object>> newDeltas = new LinkedList<>();
      newDeltas.addAll(deltas.subList(0, size - 2));
      newDeltas.add(out);
      return newDeltas;
    }
    return deltas;
  }

  /**
   * If d1 & d2 represent the same event, returns the delta that ought to be kept.
   *
   * @param d1 the elder one
   * @param d2 the most one
   * @return the one ought to be kept
   */
  private MutablePair<DeltaType, Object> isDuplicate(
      MutablePair<DeltaType, Object> d1, MutablePair<DeltaType, Object> d2) {
    MutablePair<DeltaType, Object> deletionDelta = isDeletionDup(d1, d2);
    if (deletionDelta != null) {
      return deletionDelta;
    }
    return null;
  }

  /**
   * keep the one with the most information if both are deletions.
   *
   * @param d1 the most one
   * @param d2 the elder one
   * @return the most one
   */
  private MutablePair<DeltaType, Object> isDeletionDup(
      MutablePair<DeltaType, Object> d1, MutablePair<DeltaType, Object> d2) {
    if (!d1.getLeft().equals(DeltaType.Deleted) || !d2.getLeft().equals(DeltaType.Deleted)) {
      return null;
    }
    Object obj = d2.getRight();
    if (obj instanceof DeletedFinalStateUnknown) {
      return d1;
    }
    return d2;
  }

  // Note: this should only used in test
  Map<String, Deque<MutablePair<DeltaType, Object>>> getItems() {
    return items;
  }

  // DeletedFinalStateUnknown is placed into a DeltaFIFO in the case where
  // an object was deleted but the watch deletion event was missed. In this
  // case we don't know the final "resting" state of the object, so there's
  // a chance the included `Obj` is stale.
  public static final class DeletedFinalStateUnknown<ApiType> {

    private String key;
    private ApiType obj;

    DeletedFinalStateUnknown(String key, ApiType obj) {
      this.key = key;
      this.obj = obj;
    }

    String getKey() {
      return key;
    }

    /**
     * Gets get obj.
     *
     * @return the get obj
     */
    public ApiType getObj() {
      return obj;
    }
  }

  public enum DeltaType {
    Added,

    Updated,

    Deleted,

    Sync
  }
}
