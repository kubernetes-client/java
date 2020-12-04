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
import io.kubernetes.client.util.Strings;
import java.util.Collections;
import java.util.List;

/** A set of helper utilities for constructing a cache. */
public class Caches {

  /** NAMESPACE_INDEX is the default index function for caching objects */
  public static final String NAMESPACE_INDEX = "namespace";

  /**
   * deletionHandlingMetaNamespaceKeyFunc checks for DeletedFinalStateUnknown objects before calling
   * metaNamespaceKeyFunc.
   *
   * @param <ApiType> the type parameter
   * @param object specific object
   * @return the key
   */
  public static <ApiType extends KubernetesObject> String deletionHandlingMetaNamespaceKeyFunc(
      ApiType object) {
    if (object instanceof DeltaFIFO.DeletedFinalStateUnknown) {
      DeltaFIFO.DeletedFinalStateUnknown<ApiType> deleteObj =
          (DeltaFIFO.DeletedFinalStateUnknown<ApiType>) object;
      return deleteObj.getKey();
    }
    return metaNamespaceKeyFunc(object);
  }

  /**
   * MetaNamespaceKeyFunc is a convenient default KeyFunc which knows how to make keys for API
   * objects which implement HasMetadata Interface. The key uses the format <namespace>/<name>
   * unless <namespace> is empty, then it's just <name>.
   *
   * @param obj specific object
   * @return the key
   */
  public static String metaNamespaceKeyFunc(KubernetesObject obj) {
    V1ObjectMeta metadata = obj.getMetadata();
    if (!Strings.isNullOrEmpty(metadata.getNamespace())) {
      return metadata.getNamespace() + "/" + metadata.getName();
    }
    return metadata.getName();
  }

  /**
   * metaNamespaceIndexFunc is a default index function that indexes based on an object's namespace.
   *
   * @param obj specific object
   * @return the indexed value
   */
  public static List<String> metaNamespaceIndexFunc(KubernetesObject obj) {
    V1ObjectMeta metadata = obj.getMetadata();
    if (metadata == null) {
      return Collections.emptyList();
    }
    return Collections.singletonList(metadata.getNamespace());
  }
}
