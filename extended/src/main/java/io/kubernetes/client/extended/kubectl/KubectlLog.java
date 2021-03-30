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

import static io.kubernetes.client.util.Strings.isNullOrEmpty;

import io.kubernetes.client.PodLogs;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1Pod;
import java.io.IOException;
import java.io.InputStream;

public class KubectlLog extends Kubectl.ResourceAndContainerBuilder<V1Pod, KubectlLog>
    implements Kubectl.Executable<InputStream> {

  KubectlLog() {
    super(V1Pod.class);
  }

  @Override
  public InputStream execute() throws KubectlException {
    validate();

    PodLogs logs = new PodLogs(apiClient);
    String ns = (this.namespace == null ? "default" : this.namespace);
    try {
      return logs.streamNamespacedPodLog(ns, this.name, this.container);
    } catch (ApiException | IOException ex) {
      throw new KubectlException(ex);
    }
  }

  private void validate() throws KubectlException {
    StringBuilder msg = new StringBuilder();
    if (isNullOrEmpty(name)) {
      msg.append("missing name! ");
    }
    if (isNullOrEmpty(container)) {
      msg.append("missing container!");
    }
    if (msg.length() > 0) {
      throw new KubectlException(msg.toString());
    }
  }
}
