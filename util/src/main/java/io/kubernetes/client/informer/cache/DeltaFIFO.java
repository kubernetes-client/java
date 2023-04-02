/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.informer.cache;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.MutablePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// DeltaFIFO is a java portable of k/client-go's DeltaFIFO
public class DeltaFIFO {

  private static final Logger log = LoggerFactory.getLogger(DeltaFIFO.class);

  private Function<KubernetesObject, String> keyFunc;

  // `items` maps keys to Deltas.
  private Map<String, Deque<MutablePair<DeltaType, KubernetesObject>>> items;

  // `queue` maintains FIFO order of keys for consumption in Pop().
  // We maintain the property that keys in the `items` and `queue` are
  // strictly 1:1 mapping, and that all Deltas in `items` should have
  // at least one Delta.
  private Deque<String> queue;

  // knownObjects list keys that are "known" --- affecting Delete(),
  // Replace(), and Resync()
  private Store<? extends KubernetesObject> knownObjects;

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
  public DeltaFIFO(
      Function<KubernetesObject, String> keyFunc, Store<? extends KubernetesObject> knownObjects) {
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
  public void add(KubernetesObject obj) {
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
  public void update(KubernetesObject obj) {
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
  public void delete(KubernetesObject obj) {
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
  public void replace(List<KubernetesObject> list, String resourceVersion) {
    lock.writeLock().lock();
    try {
      Set<String> keys = new HashSet<>();
      for (KubernetesObject obj : list) {
        String key = this.keyOf(obj);
        keys.add(key);
        this.queueActionLocked(DeltaType.Sync, obj);
      }

      if (this.knownObjects == null) {
        for (Map.Entry<String, Deque<MutablePair<DeltaType, KubernetesObject>>> entry :
            this.items.entrySet()) {
          if (keys.contains(entry.getKey())) {
            continue;
          }

          KubernetesObject deletedObj = null;
          MutablePair<DeltaType, KubernetesObject> delta =
              entry.getValue().peekLast(); // get newest
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

        KubernetesObject deletedObj = this.knownObjects.getByKey(knownKey);
        if (deletedObj == null) {
          log.warn(
              "Key {} does not exist in known objects store, placing DeleteFinalStateUnknown marker without object",
              knownKey);
        }
        queueDeletion++;
        this.queueActionLocked(
            DeltaType.Deleted, new DeletedFinalStateUnknown(knownKey, deletedObj));
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
  public List<String> listKeys() {
    lock.readLock().lock();
    try {
      List<String> keyList = new ArrayList<>(items.size());
      for (Map.Entry<String, Deque<MutablePair<DeltaType, KubernetesObject>>> entry :
          items.entrySet()) {
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
  public Deque<MutablePair<DeltaType, KubernetesObject>> get(KubernetesObject obj) {
    String key = this.keyOf(obj);
    return this.getByKey(key);
  }

  /**
   * Gets get by key.
   *
   * @param key the key
   * @return the get by key
   */
  public Deque<MutablePair<DeltaType, KubernetesObject>> getByKey(String key) {
    lock.readLock().lock();
    try {
      Deque<MutablePair<DeltaType, KubernetesObject>> deltas = this.items.get(key);
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
  public List<Deque<MutablePair<DeltaType, KubernetesObject>>> list() {
    lock.readLock().lock();
    List<Deque<MutablePair<DeltaType, KubernetesObject>>> objects = new ArrayList<>();
    try {
      // TODO: make a generic deep copy utility
      for (Map.Entry<String, Deque<MutablePair<DeltaType, KubernetesObject>>> entry :
          items.entrySet()) {
        Deque<MutablePair<DeltaType, KubernetesObject>> copiedDeltas =
            new LinkedList<>(entry.getValue());
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
  public Deque<MutablePair<DeltaType, KubernetesObject>> pop(
      Consumer<Deque<MutablePair<DeltaType, KubernetesObject>>> func) throws InterruptedException {
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

        Deque<MutablePair<DeltaType, KubernetesObject>> deltas = this.items.get(id);
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
  private void queueActionLocked(DeltaType actionType, KubernetesObject obj) {
    String id = this.keyOf(obj);

    Deque<MutablePair<DeltaType, KubernetesObject>> deltas = items.get(id);
    if (deltas == null) {
      deltas = new LinkedList<>();
      deltas.add(new MutablePair(actionType, obj));
    } else {
      deltas.add(new MutablePair<DeltaType, KubernetesObject>(actionType, obj));
    }

    Deque<MutablePair<DeltaType, KubernetesObject>> combinedDeltaList = combineDeltas(deltas);

    boolean exist = items.containsKey(id);
    if (combinedDeltaList != null && combinedDeltaList.size() > 0) {
      if (!exist) {
        this.queue.add(id);
      }
      this.items.put(id, combinedDeltaList);
      notEmpty.signalAll();
    } else {
      this.items.remove(id);
    }
  }

  // KeyOf exposes f's keyFunc, but also detects the key of a Deltas object or
  // DeletedFinalStateUnknown objects.
  private String keyOf(KubernetesObject obj) {
    KubernetesObject innerObj = obj;
    if (obj instanceof Deque) {
      Deque<MutablePair<DeltaType, KubernetesObject>> deltas =
          (Deque<MutablePair<DeltaType, KubernetesObject>>) obj;
      if (deltas.size() == 0) {
        throw new NoSuchElementException("0 length Deltas object; can't get key");
      }
      innerObj = deltas.peekLast().getRight();
    }
    if (innerObj instanceof DeletedFinalStateUnknown) {
      return ((DeletedFinalStateUnknown) innerObj).key;
    }
    return keyFunc.apply(innerObj);
  }

  /** Add Sync delta. Caller must hold the lock. */
  private void syncKeyLocked(String key) {
    KubernetesObject obj = this.knownObjects.getByKey(key);
    if (obj == null) {
      return;
    }

    String id = this.keyOf(obj);
    Deque<MutablePair<DeltaType, KubernetesObject>> deltas = this.items.get(id);
    if (deltas != null && !(CollectionUtils.isEmpty(deltas))) {
      return;
    }

    this.queueActionLocked(DeltaType.Sync, obj);
  }

  // re-listing and watching can deliver the same update multiple times in any
  // order. This will combine the most recent two deltas if they are the same.
  private Deque<MutablePair<DeltaType, KubernetesObject>> combineDeltas(
      Deque<MutablePair<DeltaType, KubernetesObject>> deltas) {
    if (deltas.size() < 2) {
      return deltas;
    }
    int size = deltas.size();
    MutablePair<DeltaType, KubernetesObject> d1 = deltas.pollLast();
    MutablePair<DeltaType, KubernetesObject> d2 = deltas.pollLast();
    MutablePair<DeltaType, KubernetesObject> out = isDuplicate(d1, d2);
    if (out != null) {
      deltas.add(out);
    } else {
      deltas.add(d2);
      deltas.add(d1);
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
  private MutablePair<DeltaType, KubernetesObject> isDuplicate(
      MutablePair<DeltaType, KubernetesObject> d1, MutablePair<DeltaType, KubernetesObject> d2) {
    MutablePair<DeltaType, KubernetesObject> deletionDelta = isDeletionDup(d1, d2);

    // TODO: remove this after the cause of memory leakage is confirmed
    // Squashing deltas w/ the same resource version, note that is a temporary fix that eases memory
    // intensity.
    if (deletionDelta != null) {
      return deletionDelta;
    }
    if (d1.getLeft() != DeltaType.Deleted
        && d2.getLeft() != DeltaType.Deleted
        && StringUtils.equals(
            d1.getRight().getMetadata().getResourceVersion(),
            d2.getRight().getMetadata().getResourceVersion())) {
      return d1;
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
  private MutablePair<DeltaType, KubernetesObject> isDeletionDup(
      MutablePair<DeltaType, KubernetesObject> d1, MutablePair<DeltaType, KubernetesObject> d2) {
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
  Map<String, Deque<MutablePair<DeltaType, KubernetesObject>>> getItems() {
    return items;
  }

  // DeletedFinalStateUnknown is placed into a DeltaFIFO in the case where
  // an object was deleted but the watch deletion event was missed. In this
  // case we don't know the final "resting" state of the object, so there's
  // a chance the included `Obj` is stale.
  public static final class DeletedFinalStateUnknown<ApiType extends KubernetesObject>
      implements KubernetesObject {

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

    @Override
    public V1ObjectMeta getMetadata() {
      return this.obj.getMetadata();
    }

    @Override
    public String getApiVersion() {
      return this.obj.getApiVersion();
    }

    @Override
    public String getKind() {
      return this.obj.getKind();
    }
  }

  public enum DeltaType {
    Added,

    Updated,

    Deleted,

    Sync
  }
}
