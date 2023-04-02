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
package io.kubernetes.client.extended.controller.reconciler;

/**
 * Reconciler defines interface for reconciling resource. Users are expected to implement this
 * interface to develop their own controllers watching events on resources. A reconciler works by
 * comparing the state specified in an object by a user against the actual cluster state, and then
 * perform operations to make the actual cluster state reflect the state specified by the user.
 * Typically, reconcile is triggered by a Controller in response to cluster Events (e.g. Creating,
 * Updating, Deleting Kubernetes objects) or external Events (GitHub Webhooks, polling external
 * sources, etc).
 *
 * <p>Example reconcile Logic:
 *
 * <p>1. Read an object and all the Pods it owns. 2. Observe that the object spec specifies 5
 * replicas but actual cluster contains only 1 Pod replica. 3. Create 4 Pods and set their
 * OwnerReferences to the object.
 *
 * <p>Reconciliation is level-based, meaning action isn't driven off changes in individual Events,
 * but instead is driven by actual cluster state read from the apiserver or a local cache. For
 * example if responding to a Pod Delete Event, the Request won't contain that a Pod was deleted,
 * instead the reconcile function observes this when reading the cluster state and seeing the Pod as
 * missing.
 */
public interface Reconciler {

  /**
   * Reconcile result.
   *
   * @param request the reconcile request, triggered by watch events
   * @return the result
   */
  Result reconcile(Request request);
}
