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
package io.kubernetes.client.extended.kubectl.exception;

import io.kubernetes.client.openapi.models.V1Status;

/** KubectlException is thrown upon any failure from Kubectl helpers. */
public class KubectlException extends Exception {

  public KubectlException(String message) {
    super(message);
  }

  public KubectlException(V1Status status) {
    super(status.toString());
  }

  public KubectlException(Throwable cause) {
    super(cause);
  }
}
