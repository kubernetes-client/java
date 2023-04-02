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

import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1Node;

public class KubectlCordon extends Kubectl.ResourceBuilder<V1Node, KubectlCordon>
    implements Kubectl.Executable<V1Node> {

  static final String CORDON_PATCH_STR =
      "[{\"op\":\"replace\",\"path\":\"/spec/unschedulable\",\"value\":true}]";
  static String UNCORDON_PATCH_STR =
      "[{\"op\":\"replace\",\"path\":\"/spec/unschedulable\",\"value\":false}]";

  private boolean cordon;

  KubectlCordon(boolean performCordon) {
    super(V1Node.class);
    this.cordon = performCordon;
  }

  @Override
  public V1Node execute() throws KubectlException {
    refreshDiscovery();
    return performCordon();
  }

  protected V1Node performCordon() throws KubectlException {
    String patch = this.cordon ? CORDON_PATCH_STR : UNCORDON_PATCH_STR;
    try {
      return getGenericApi()
          .patch(name, V1Patch.PATCH_FORMAT_JSON_PATCH, new V1Patch(patch))
          .throwsApiException()
          .getObject();
    } catch (ApiException e) {
      throw new KubectlException(e);
    }
  }
}
