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
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.options.ListOptions;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class KubectlGet<ApiType extends KubernetesObject>
    extends Kubectl.ApiClientBuilder<KubectlGet<ApiType>>
    implements Kubectl.Executable<List<ApiType>> {

  private String namespace;
  private ListOptions listOptions;
  private Class<ApiType> apiTypeClass;
  private Class<? extends KubernetesListObject> apiTypeListClass;

  KubectlGet(Class<ApiType> apiTypeClass) {
    this.apiTypeClass = apiTypeClass;
    this.listOptions = new ListOptions();
  }

  public KubectlGet<ApiType> apiListTypeClass(
      Class<? extends KubernetesListObject> apiTypeListClass) {
    this.apiTypeListClass = apiTypeListClass;
    return this;
  }

  public KubectlGet<ApiType> options(ListOptions listOptions) {
    this.listOptions = listOptions;
    return this;
  }

  public KubectlGet<ApiType> namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  public KubectlGetSingle name(String name) {
    return new KubectlGetSingle(name);
  }

  @Override
  public List<ApiType> execute() throws KubectlException {
    refreshDiscovery();

    GenericKubernetesApi<ApiType, ? extends KubernetesListObject> api =
        apiTypeListClass == null
            ? getGenericApi(apiTypeClass)
            : getGenericApi(apiTypeClass, apiTypeListClass);
    try {
      if (isNamespaced()) {
        return (List<ApiType>)
            api.list(namespace, listOptions).throwsApiException().getObject().getItems();

      } else {
        return (List<ApiType>) api.list(listOptions).throwsApiException().getObject().getItems();
      }
    } catch (ApiException e) {
      throw new KubectlException(e);
    }
  }

  private boolean isNamespaced() {
    return !StringUtils.isEmpty(namespace);
  }

  public class KubectlGetSingle extends Kubectl.ResourceBuilder<ApiType, KubectlGetSingle>
      implements Kubectl.Executable<ApiType> {

    private KubectlGetSingle(String name) {
      super(KubectlGet.this.apiTypeClass);
      KubectlGetSingle.this.name = name;
      KubectlGetSingle.this.namespace = KubectlGet.this.namespace;
      KubectlGetSingle.this.apiClient = KubectlGet.this.apiClient;
      KubectlGetSingle.this.skipDiscovery = KubectlGet.this.skipDiscovery;
    }

    private boolean isNamespaced() {
      return !StringUtils.isEmpty(namespace);
    }

    @Override
    public ApiType execute() throws KubectlException {
      refreshDiscovery();

      GenericKubernetesApi<ApiType, ? extends KubernetesListObject> api =
          getGenericApi(KubectlGetSingle.this.apiTypeClass);
      try {
        if (isNamespaced()) {
          return api.get(KubectlGetSingle.this.namespace, KubectlGetSingle.this.name)
              .throwsApiException()
              .getObject();

        } else {
          return api.get(KubectlGetSingle.this.name).throwsApiException().getObject();
        }
      } catch (ApiException e) {
        throw new KubectlException(e);
      }
    }
  }
}
