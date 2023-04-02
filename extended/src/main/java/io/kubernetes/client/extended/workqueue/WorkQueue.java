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
package io.kubernetes.client.extended.workqueue;

/** The workqueue interface defines the queue behavior. */
public interface WorkQueue<T> {

  /**
   * add marks item as needing processing.
   *
   * @param item item to add
   */
  void add(T item);

  /**
   * length returns the current queue length, for informational purposes only.
   *
   * @return current queue length
   */
  int length();

  /**
   * Get blocks until it can return an item to be processed. If shutdown = true, the caller should
   * end their process.
   *
   * @return the object
   */
  T get() throws InterruptedException;

  /**
   * Done marks item as done processing, and if it has been marked as dirty again,
   *
   * @param item specific item
   */
  void done(T item);

  /** ShutDown will cause q to ignore all new items added to it. */
  void shutDown();

  /**
   * returns whether the queue shutdown.
   *
   * @return returns {@code true} if the
   */
  boolean isShuttingDown();
}
