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

import io.kubernetes.client.common.KubernetesObject;

/*
 * SharedInformer defines basic methods of a informer.
 */
public interface SharedInformer<ApiType extends KubernetesObject> {

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

  /**
   * The TransformFunc is called for each object which is about to be stored. This function is
   * intended for you to take the opportunity to remove, transform, or normalize fields. One use
   * case is to strip unused metadata fields out of objects to save on RAM cost.
   *
   * <p>Must be set before starting the informer.
   *
   * <p>Note: Since the object given to the handler may be already shared with other goroutines, it
   * is advisable to copy the object being transform before mutating it at all and returning the
   * copy to prevent data races.
   *
   * @param transformFunc the transform function
   */
  void setTransform(TransformFunc transformFunc);
}
