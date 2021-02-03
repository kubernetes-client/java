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
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.ModelMapper;
import io.kubernetes.client.util.generic.options.UpdateOptions;
import org.apache.commons.lang3.StringUtils;

public class KubectlReplace<ApiType extends KubernetesObject>
    extends Kubectl.ResourceBuilder<ApiType, KubectlReplace<ApiType>>
    implements Kubectl.Executable<ApiType> {
  ApiType updateObject;
  UpdateOptions options = new UpdateOptions();

  KubectlReplace(Class<ApiType> apiTypeClass) {
    super(apiTypeClass);
  }

  public KubectlReplace<ApiType> resource(ApiType resource) {
    this.updateObject = resource;
    return this;
  }

  public KubectlReplace<ApiType> options(UpdateOptions options) {
    this.options = options;
    return this;
  }

  @Override
  public ApiType execute() throws KubectlException {
    verifyArguments();
    refreshDiscovery();

    if (isNamespaced(apiTypeClass)) {
      try {
        return getGenericApi().update(updateObject, options).throwsApiException().getObject();
      } catch (ApiException e) {
        throw new KubectlException(e);
      }
    } else {
      try {
        return getGenericApi().update(updateObject, options).throwsApiException().getObject();
      } catch (ApiException e) {
        throw new KubectlException(e);
      }
    }
  }

  public boolean isNamespaced(Class<ApiType> apiTypeClass) {
    Boolean isNamespaced = ModelMapper.isNamespaced(apiTypeClass);
    if (isNamespaced == null) { // unknown
      return false;
    }

    return isNamespaced || !StringUtils.isEmpty(namespace);
  }

  private void verifyArguments() throws KubectlException {
    if (null == updateObject) {
      throw new KubectlException("missing new resource");
    }
  }
}
