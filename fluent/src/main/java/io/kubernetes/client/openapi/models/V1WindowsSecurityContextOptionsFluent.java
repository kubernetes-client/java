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

  public A withGmsaCredentialSpec(java.lang.String gmsaCredentialSpec);

  public Boolean hasGmsaCredentialSpec();

  public java.lang.String getGmsaCredentialSpecName();

  public A withGmsaCredentialSpecName(java.lang.String gmsaCredentialSpecName);

  public java.lang.Boolean hasGmsaCredentialSpecName();

  public java.lang.Boolean getHostProcess();

  public A withHostProcess(java.lang.Boolean hostProcess);

  public java.lang.Boolean hasHostProcess();

  public java.lang.String getRunAsUserName();

  public A withRunAsUserName(java.lang.String runAsUserName);

  public java.lang.Boolean hasRunAsUserName();

  public A withHostProcess();
}
