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
package io.kubernetes.client.common;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;

/** Common accessors for kubernetes list object. */
public interface KubernetesListObject extends KubernetesType {

  /**
   * Gets list metadata.
   *
   * <p>ListMeta describes metadata that synthetic resources must have, including lists and various
   * status objects. A resource may have only one of {ObjectMeta, ListMeta}.
   *
   * @return the metadata
   */
  V1ListMeta getMetadata();

  /**
   * Gets the object items.
   *
   * @return the items
   */
  List<? extends KubernetesObject> getItems();
}
