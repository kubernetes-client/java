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

/** Generated */
public class V1WindowsSecurityContextOptionsFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsFluent<A> {
  public V1WindowsSecurityContextOptionsFluentImpl() {}

  public V1WindowsSecurityContextOptionsFluentImpl(
      io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions instance) {
    this.withGmsaCredentialSpec(instance.getGmsaCredentialSpec());

    this.withGmsaCredentialSpecName(instance.getGmsaCredentialSpecName());

    this.withHostProcess(instance.getHostProcess());

    this.withRunAsUserName(instance.getRunAsUserName());
  }

  private java.lang.String gmsaCredentialSpec;
  private java.lang.String gmsaCredentialSpecName;
  private java.lang.Boolean hostProcess;
  private java.lang.String runAsUserName;

  public java.lang.String getGmsaCredentialSpec() {
    return this.gmsaCredentialSpec;
  }

  public A withGmsaCredentialSpec(java.lang.String gmsaCredentialSpec) {
    this.gmsaCredentialSpec = gmsaCredentialSpec;
    return (A) this;
  }

  public java.lang.Boolean hasGmsaCredentialSpec() {
    return this.gmsaCredentialSpec != null;
  }

  /** Method is deprecated. use withGmsaCredentialSpec instead. */
  @java.lang.Deprecated
  public A withNewGmsaCredentialSpec(java.lang.String original) {
    return (A) withGmsaCredentialSpec(new String(original));
  }

  public java.lang.String getGmsaCredentialSpecName() {
    return this.gmsaCredentialSpecName;
  }

  public A withGmsaCredentialSpecName(java.lang.String gmsaCredentialSpecName) {
    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    return (A) this;
  }

  public java.lang.Boolean hasGmsaCredentialSpecName() {
    return this.gmsaCredentialSpecName != null;
  }

  /** Method is deprecated. use withGmsaCredentialSpecName instead. */
  @java.lang.Deprecated
  public A withNewGmsaCredentialSpecName(java.lang.String original) {
    return (A) withGmsaCredentialSpecName(new String(original));
  }

  public java.lang.Boolean getHostProcess() {
    return this.hostProcess;
  }

  public A withHostProcess(java.lang.Boolean hostProcess) {
    this.hostProcess = hostProcess;
    return (A) this;
  }

  public java.lang.Boolean hasHostProcess() {
    return this.hostProcess != null;
  }

  public java.lang.String getRunAsUserName() {
    return this.runAsUserName;
  }

  public A withRunAsUserName(java.lang.String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return (A) this;
  }

  public java.lang.Boolean hasRunAsUserName() {
    return this.runAsUserName != null;
  }

  /** Method is deprecated. use withRunAsUserName instead. */
  @java.lang.Deprecated
  public A withNewRunAsUserName(java.lang.String original) {
    return (A) withRunAsUserName(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1WindowsSecurityContextOptionsFluentImpl that = (V1WindowsSecurityContextOptionsFluentImpl) o;
    if (gmsaCredentialSpec != null
        ? !gmsaCredentialSpec.equals(that.gmsaCredentialSpec)
        : that.gmsaCredentialSpec != null) return false;
    if (gmsaCredentialSpecName != null
        ? !gmsaCredentialSpecName.equals(that.gmsaCredentialSpecName)
        : that.gmsaCredentialSpecName != null) return false;
    if (hostProcess != null ? !hostProcess.equals(that.hostProcess) : that.hostProcess != null)
      return false;
    if (runAsUserName != null
        ? !runAsUserName.equals(that.runAsUserName)
        : that.runAsUserName != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        gmsaCredentialSpec, gmsaCredentialSpecName, hostProcess, runAsUserName, super.hashCode());
  }
}
