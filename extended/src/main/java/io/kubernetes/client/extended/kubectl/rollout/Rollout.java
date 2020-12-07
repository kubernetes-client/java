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
package io.kubernetes.client.extended.kubectl.rollout;

import static com.google.common.base.Strings.isNullOrEmpty;

import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Rollout<ApiType extends KubernetesObject> implements RolloutAction {

  private String name;
  private String namespace;
  private GenericKubernetesApi<ApiType, ? extends KubernetesListObject> api;
  private ApiClient apiClient;

  private static final String RESTART_PATCH_TEMPLATE =
      "{\"spec\":{\"template\":{\"metadata\":{\"annotations\":{\"kubectl.kubernetes.io/restartedAt\":%s}}}}}";
  private static final String RESTART_ANNOTATION_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";

  public Rollout(GenericKubernetesApi<ApiType, ? extends KubernetesListObject> api, String name) {
    this.api = api;
    this.name = name;
  }

  public Rollout(
      GenericKubernetesApi<ApiType, ? extends KubernetesListObject> api,
      String name,
      String namespace) {
    this(api, name);
    this.namespace = namespace;
  }

  public String getName() {
    return name;
  }

  public String getNamespace() {
    return namespace;
  }

  public GenericKubernetesApi<ApiType, ? extends KubernetesListObject> getApi() {
    return api;
  }

  public void withApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  protected void validate() throws KubectlException {
    StringBuilder msg = new StringBuilder();
    if (isNullOrEmpty(name)) {
      msg.append("missing name! ");
    }
    if (msg.length() > 0) {
      throw new KubectlException(msg.toString());
    }
  }

  protected V1Patch getRestartPatch() {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(RESTART_ANNOTATION_DATE_FORMAT);
    return new V1Patch(String.format(RESTART_PATCH_TEMPLATE, simpleDateFormat.format(new Date())));
  }

  protected ApiType getResource() throws KubectlException {
    try {
      return getApi().get(getNamespace(), getName()).throwsApiException().getObject();
    } catch (ApiException e) {
      throw new KubectlException(e);
    }
  }

  protected ApiClient getApiClient() {
    return this.apiClient;
  }
}
