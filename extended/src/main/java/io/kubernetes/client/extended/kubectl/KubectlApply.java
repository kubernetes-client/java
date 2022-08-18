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
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.Namespaces;
import io.kubernetes.client.util.Strings;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import io.kubernetes.client.util.generic.options.PatchOptions;

public class KubectlApply<ApiType extends KubernetesObject>
    extends Kubectl.ResourceBuilder<ApiType, KubectlApply<ApiType>>
    implements Kubectl.Executable<ApiType> {

  private ApiType targetObj;
  private String fieldManager;
  private boolean forceConflict;

  public static final String DEFAULT_FIELD_MANAGER = "kubernetes-java-kubectl-apply";

  KubectlApply(Class<ApiType> apiTypeClass) {
    super(apiTypeClass);
    this.forceConflict = false;
    this.fieldManager = DEFAULT_FIELD_MANAGER;
  }

  public KubectlApply<ApiType> fieldManager(String fieldManager) {
    this.fieldManager = fieldManager;
    return this;
  }

  public KubectlApply<ApiType> forceConflict(boolean isForceConflict) {
    this.forceConflict = isForceConflict;
    return this;
  }

  public KubectlApply<ApiType> resource(ApiType obj) {
    this.targetObj = obj;
    return this;
  }

  private void validate() throws KubectlException {
    if (Strings.isNullOrEmpty(fieldManager)) {
      throw new KubectlException("Field-manager must not be empty for server-side-apply");
    }
  }

  @Override
  public ApiType execute() throws KubectlException {
    validate();
    return executeServerSideApply();
  }

  private ApiType executeServerSideApply() throws KubectlException {
    refreshDiscovery();

    GenericKubernetesApi<? extends KubernetesObject, ? extends KubernetesListObject> api =
        getGenericApi(this.targetObj);
    if (api == null) {
      api = getGenericApi();
    }

    PatchOptions patchOptions = new PatchOptions();
    patchOptions.setForce(this.forceConflict);
    patchOptions.setFieldManager(this.fieldManager);

    if (isNamespaced(this.targetObj)) {
      String targetNamespace =
          namespace != null
              ? namespace
              : Strings.isNullOrEmpty(targetObj.getMetadata().getNamespace())
                  ? Namespaces.NAMESPACE_DEFAULT
                  : targetObj.getMetadata().getNamespace();

      KubernetesApiResponse<KubernetesObject> response = null;
      try {
        return (ApiType)
            api.patch(
                    targetNamespace,
                    targetObj.getMetadata().getName(),
                    V1Patch.PATCH_FORMAT_APPLY_YAML,
                    new V1Patch(apiClient.getJSON().serialize(targetObj)),
                    patchOptions)
                .throwsApiException()
                .getObject();
      } catch (ApiException e) {
        throw new KubectlException(e);
      }
    } else {
      try {
        return (ApiType)
            api.patch(
                    targetObj.getMetadata().getName(),
                    V1Patch.PATCH_FORMAT_APPLY_YAML,
                    new V1Patch(apiClient.getJSON().serialize(targetObj)),
                    patchOptions)
                .throwsApiException()
                .getObject();
      } catch (ApiException e) {
        throw new KubectlException(e);
      }
    }
  }
}
