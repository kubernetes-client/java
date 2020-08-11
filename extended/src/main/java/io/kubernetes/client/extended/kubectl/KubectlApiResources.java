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

import io.kubernetes.client.Discovery;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import java.util.Set;

public class KubectlApiResources implements Kubectl.Executable<Set<Discovery.APIResource>> {

  private final Discovery discovery;

  KubectlApiResources(ApiClient apiClient) {
    this.discovery = new Discovery(apiClient);
  }

  @Override
  public Set<Discovery.APIResource> execute() throws KubectlException {
    try {
      return this.discovery.findAll();
    } catch (ApiException e) {
      throw new KubectlException(e);
    }
  }
}
