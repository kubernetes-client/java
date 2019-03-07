package io.kubernetes.client.informer;

/*
 * SharedInformer defines basic methods of a informer.
 */
public interface SharedInformer<ApiType> {

  /**
   * Add event handler.
   *
   * @param handler the handler
   */
  void addEventHandler(ResourceEventHandler<ApiType> handler);

  /**
   * addEventHandlerWithResyncPeriod adds an event handler to the shared informer using the
   * specified resync period. Events to a single handler are delivered sequentially, but there is no
   * coordination between different handlers.
   *
   * @param handler the event handler
   * @param resyncPeriod the specific resync period
   */
  void addEventHandlerWithResyncPeriod(ResourceEventHandler<ApiType> handler, long resyncPeriod);

  /** run starts the shared informer, which will be stopped until stop() is called. */
  void run();

  /** stop stops the shared informer. */
  void stop();

  /** hasSynced returns true if the shared informer's store has synced. */
  boolean hasSynced();

  /**
   * Last sync resource version string.
   *
   * @return the string
   */
  // LastSyncResourceVersion is the resource version observed when last synced with the underlying
  // store. The value returned is not synchronized with access to the underlying store and is not
  // thread-safe.
  String lastSyncResourceVersion();
}
