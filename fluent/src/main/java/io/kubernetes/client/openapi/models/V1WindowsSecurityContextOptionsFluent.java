/*
Copyright 2022 The Kubernetes Authors.
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
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;

/** Generated */
public interface V1WindowsSecurityContextOptionsFluent<
        A extends V1WindowsSecurityContextOptionsFluent<A>>
    extends Fluent<A> {
  public String getGmsaCredentialSpec();

  public A withGmsaCredentialSpec(String gmsaCredentialSpec);

  public Boolean hasGmsaCredentialSpec();

  public String getGmsaCredentialSpecName();

  public A withGmsaCredentialSpecName(String gmsaCredentialSpecName);

  public Boolean hasGmsaCredentialSpecName();

  public Boolean getHostProcess();

  public A withHostProcess(Boolean hostProcess);

  public Boolean hasHostProcess();

  public String getRunAsUserName();

  public A withRunAsUserName(String runAsUserName);

  public Boolean hasRunAsUserName();

  public A withHostProcess();
}
