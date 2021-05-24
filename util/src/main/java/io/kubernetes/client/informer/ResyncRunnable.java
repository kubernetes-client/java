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
package io.kubernetes.client.informer;

import io.kubernetes.client.informer.cache.DeltaFIFO;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ResyncRunnable class implements Runnable interface. It calls the resync function of {@link
 * DeltaFIFO}
 */
public class ResyncRunnable implements Runnable {

  private static final Logger log = LoggerFactory.getLogger(ResyncRunnable.class);

  private final DeltaFIFO store;
  private final Supplier<Boolean> shouldResyncFunc;

  public ResyncRunnable(DeltaFIFO store, Supplier<Boolean> shouldResyncFunc) {
    this.store = store;
    this.shouldResyncFunc = shouldResyncFunc;
  }

  public void run() {
    log.debug("ResyncRunnable#resync ticker tick");

    if (shouldResyncFunc == null || Boolean.TRUE.equals(shouldResyncFunc.get())) {
      log.debug("ResyncRunnable#force resync");
      this.store.resync();
    }
  }
}
