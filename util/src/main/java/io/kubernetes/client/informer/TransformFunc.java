/*
Copyright 2022 The Kubernetes Authors.
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
import io.kubernetes.client.informer.exception.ObjectTransformException;

/*
 * TransformFunc allows for transforming an object before it will be processed
 * and put into the controller cache and before the corresponding handlers will
 * be called on it.
 * TransformFunc (similarly to ResourceEventHandler functions) should be able
 * to correctly handle the tombstone of type DeletedFinalStateUnknown
 *
 * The most common usage pattern is to clean-up some parts of the object to
 * reduce component memory usage if a given component doesn't care about them.
 * given controller doesn't care for them
 */
public interface TransformFunc {

  /**
   * @param the original object to be transformed
   * @return the transformed object
   */
  KubernetesObject transform(KubernetesObject object) throws ObjectTransformException;
}
