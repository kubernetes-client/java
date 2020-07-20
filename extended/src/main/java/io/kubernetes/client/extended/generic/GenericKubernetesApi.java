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
package io.kubernetes.client.extended.generic;

import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.apis.CustomObjectsApi;

/**
 * A user-friendly placeholder for backward-compatibility. Moved to {@link
 * io.kubernetes.client.util.generic.GenericKubernetesApi}
 */
@Deprecated
public class GenericKubernetesApi<
        ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
    extends io.kubernetes.client.util.generic.GenericKubernetesApi<ApiType, ApiListType> {
  public GenericKubernetesApi(
      Class<ApiType> apiTypeClass,
      Class<ApiListType> apiListTypeClass,
      String apiGroup,
      String apiVersion,
      String resourcePlural) {
    super(apiTypeClass, apiListTypeClass, apiGroup, apiVersion, resourcePlural);
  }

  public GenericKubernetesApi(
      Class<ApiType> apiTypeClass,
      Class<ApiListType> apiListTypeClass,
      String apiGroup,
      String apiVersion,
      String resourcePlural,
      ApiClient apiClient) {
    super(apiTypeClass, apiListTypeClass, apiGroup, apiVersion, resourcePlural, apiClient);
  }

  public GenericKubernetesApi(
      Class<ApiType> apiTypeClass,
      Class<ApiListType> apiListTypeClass,
      String apiGroup,
      String apiVersion,
      String resourcePlural,
      CustomObjectsApi customObjectsApi) {
    super(apiTypeClass, apiListTypeClass, apiGroup, apiVersion, resourcePlural, customObjectsApi);
  }
}
