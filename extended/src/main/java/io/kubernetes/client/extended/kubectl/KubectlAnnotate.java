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
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.annotations.Annotations;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.StringUtils;

public class KubectlAnnotate<ApiType extends KubernetesObject>
    extends Kubectl.ResourceBuilder<ApiType, KubectlAnnotate<ApiType>>
    implements Kubectl.Executable<ApiType> {

  private final ApiClient apiClient;
  private final Class<ApiType> apiTypeClass;
  private final Map<String, String> addingAnnotations;

  private String apiGroup;
  private String apiVersion;
  private String resourceNamePlural;

  KubectlAnnotate(ApiClient apiClient, Class<ApiType> apiTypeClass) {
    super(apiClient, apiTypeClass);
    this.addingAnnotations = new HashMap<>();
    this.apiTypeClass = apiTypeClass;
    this.apiClient = apiClient;
  }

  public KubectlAnnotate<ApiType> apiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
    return this;
  }

  public KubectlAnnotate<ApiType> apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  public KubectlAnnotate<ApiType> resourceNamePlural(String resourceNamePlural) {
    this.resourceNamePlural = resourceNamePlural;
    return this;
  }

  public KubectlAnnotate<ApiType> addAnnotation(String key, String value) {
    this.addingAnnotations.put(key, value);
    return this;
  }

  private boolean isNamespaced() {
    return !StringUtils.isEmpty(namespace);
  }

  @Override
  public ApiType execute() throws KubectlException {
    verifyArguments();
    GenericKubernetesApi<ApiType, KubernetesListObject> api =
        new GenericKubernetesApi<>(
            apiTypeClass,
            KubernetesListObject.class,
            apiGroup,
            apiVersion,
            resourceNamePlural,
            apiClient);

    try {
      final KubernetesApiResponse<ApiType> getResponse;
      if (isNamespaced()) {
        getResponse = api.get(namespace, name);
      } else {
        getResponse = api.get(name);
      }
      if (!getResponse.isSuccess()) {
        throw new KubectlException(getResponse.getStatus());
      }
      ApiType obj = getResponse.getObject();

      Annotations.addAnnotations(obj, addingAnnotations);

      final KubernetesApiResponse<ApiType> updateResponse;
      updateResponse = api.update(obj);
      if (!updateResponse.isSuccess()) {
        throw new KubectlException(updateResponse.getStatus());
      }
      return updateResponse.getObject();
    } catch (Throwable t) {
      throw new KubectlException(t);
    }
  }

  private void verifyArguments() throws KubectlException {
    if (null == apiGroup) {
      throw new KubectlException("missing apiGroup argument");
    }
    if (null == apiVersion) {
      throw new KubectlException("missing apiVersion argument");
    }
    if (null == resourceNamePlural) {
      throw new KubectlException("missing resourceNamePlural argument");
    }
    if (null == name) {
      throw new KubectlException("missing name argument");
    }
  }
}
