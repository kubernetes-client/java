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

import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.VersionInfo;
import io.kubernetes.client.util.version.Version;
import java.io.IOException;

public class KubectlVersion extends Kubectl.ApiClientBuilder<KubectlVersion>
    implements Kubectl.Executable<VersionInfo> {

  @Override
  public VersionInfo execute() throws KubectlException {
    Version version = new Version(apiClient);
    try {
      return version.getVersion();
    } catch (ApiException | IOException e) {
      throw new KubectlException(e);
    }
  }
}
