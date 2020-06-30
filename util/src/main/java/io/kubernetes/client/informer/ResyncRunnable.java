package io.kubernetes.client.informer;

import io.kubernetes.client.informer.cache.DeltaFIFO;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ResyncRunnable class implements Runnable interface. It calls the resync function of Store
 * interface which is actually always implemented by DeltaFIFO.
 */
public class ResyncRunnable implements Runnable {

  private static final Logger log = LoggerFactory.getLogger(ResyncRunnable.class);

  private DeltaFIFO store;
  private Supplier<Boolean> shouldResyncFunc;

  public ResyncRunnable(DeltaFIFO store, Supplier<Boolean> shouldResyncFunc) {
    this.store = store;
    this.shouldResyncFunc = shouldResyncFunc;
  }

  public void run() {
    if (log.isDebugEnabled()) {
      log.debug("ResyncRunnable#resync ticker tick");
    }

    if (shouldResyncFunc == null || shouldResyncFunc.get()) {
      if (log.isDebugEnabled()) {
        log.debug("ResyncRunnable#force resync");
      }
      this.store.resync();
    }
  }
}
