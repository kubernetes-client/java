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
package io.kubernetes.client;

public final class KubernetesConstants {
  private KubernetesConstants() {}

  // V1Status values
  public static final String V1STATUS_SUCCESS = "Success";
  public static final String V1STATUS_FAILURE = "Failure";

  // V1Status reason values
  public static final String V1STATUS_REASON_NONZEROEXITCODE = "NonZeroExitCode";

  // V1Status cause reason values
  public static final String V1STATUS_CAUSE_REASON_EXITCODE = "ExitCode";
}
