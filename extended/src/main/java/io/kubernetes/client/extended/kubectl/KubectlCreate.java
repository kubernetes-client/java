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

import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.ModelMapper;
import io.kubernetes.client.util.Namespaces;
import io.kubernetes.client.util.Strings;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.options.CreateOptions;

public class KubectlCreate<ApiType extends KubernetesObject>
    extends Kubectl.ResourceBuilder<ApiType, KubectlCreate<ApiType>>
    implements Kubectl.Executable<ApiType> {

  KubectlCreate(Class<ApiType> apiTypeClass) {
    super(apiTypeClass);
  }

  private ApiType targetObj;

  public KubectlCreate<ApiType> resource(ApiType obj) {
    this.targetObj = obj;
    return this;
  }

  @Override
  public ApiType execute() throws KubectlException {
    refreshDiscovery();

    GenericKubernetesApi<ApiType, KubernetesListObject> api = getGenericApi();

    if (ModelMapper.isNamespaced(this.targetObj.getClass())) {
      String targetNamespace =
          namespace != null
              ? namespace
              : Strings.isNullOrEmpty(targetObj.getMetadata().getNamespace())
                  ? Namespaces.NAMESPACE_DEFAULT
                  : targetObj.getMetadata().getNamespace();
      try {
        return api.create(targetNamespace, targetObj, new CreateOptions())
            .throwsApiException()
            .getObject();
      } catch (ApiException e) {
        throw new KubectlException(e);
      }
    } else {
      try {
        return api.create(targetObj, new CreateOptions()).throwsApiException().getObject();
      } catch (ApiException e) {
        throw new KubectlException(e);
      }
    }
  }
}
