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
package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.ModelMapper;
import io.kubernetes.client.util.generic.GenericKubernetesApi;

public class KubectlPatch<ApiType extends KubernetesObject>
    extends Kubectl.ResourceBuilder<ApiType, KubectlPatch<ApiType>>
    implements Kubectl.Executable<ApiType> {

  private String patchType;
  private V1Patch patchContent;

  KubectlPatch(Class<ApiType> apiTypeClass) {
    super(apiTypeClass);
  }

  public KubectlPatch<ApiType> patchContent(V1Patch patchContent) {
    this.patchContent = patchContent;
    return this;
  }

  public KubectlPatch<ApiType> patchType(String patchType) {
    this.patchType = patchType;
    return this;
  }

  @Override
  public ApiType execute() throws KubectlException {
    refreshDiscovery();

    GenericKubernetesApi genericKubernetesApi = getGenericApi();
    try {
      if (ModelMapper.isNamespaced(apiTypeClass)) {
        return (ApiType)
            genericKubernetesApi
                .patch(namespace, name, patchType, patchContent)
                .throwsApiException()
                .getObject();
      } else {
        return (ApiType)
            genericKubernetesApi
                .patch(name, patchType, patchContent)
                .throwsApiException()
                .getObject();
      }
    } catch (ApiException e) {
      throw new KubectlException(e);
    }
  }
}
