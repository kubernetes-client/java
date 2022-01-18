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
public interface V1SecurityContextFluent<
        A extends io.kubernetes.client.openapi.models.V1SecurityContextFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.Boolean getAllowPrivilegeEscalation();

  public A withAllowPrivilegeEscalation(java.lang.Boolean allowPrivilegeEscalation);

  public java.lang.Boolean hasAllowPrivilegeEscalation();

  /**
   * This method has been deprecated, please use method buildCapabilities instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1Capabilities getCapabilities();

  public io.kubernetes.client.openapi.models.V1Capabilities buildCapabilities();

  public A withCapabilities(io.kubernetes.client.openapi.models.V1Capabilities capabilities);

  public java.lang.Boolean hasCapabilities();

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.CapabilitiesNested<A>
      withNewCapabilities();

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.CapabilitiesNested<A>
      withNewCapabilitiesLike(io.kubernetes.client.openapi.models.V1Capabilities item);

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.CapabilitiesNested<A>
      editCapabilities();

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.CapabilitiesNested<A>
      editOrNewCapabilities();

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.CapabilitiesNested<A>
      editOrNewCapabilitiesLike(io.kubernetes.client.openapi.models.V1Capabilities item);

  public java.lang.Boolean getPrivileged();

  public A withPrivileged(java.lang.Boolean privileged);

  public java.lang.Boolean hasPrivileged();

  public java.lang.String getProcMount();

  public A withProcMount(java.lang.String procMount);

  public java.lang.Boolean hasProcMount();

  /** Method is deprecated. use withProcMount instead. */
  @java.lang.Deprecated
  public A withNewProcMount(java.lang.String original);

  public java.lang.Boolean getReadOnlyRootFilesystem();

  public A withReadOnlyRootFilesystem(java.lang.Boolean readOnlyRootFilesystem);

  public java.lang.Boolean hasReadOnlyRootFilesystem();

  public java.lang.Long getRunAsGroup();

  public A withRunAsGroup(java.lang.Long runAsGroup);

  public java.lang.Boolean hasRunAsGroup();

  public java.lang.Boolean getRunAsNonRoot();

  public A withRunAsNonRoot(java.lang.Boolean runAsNonRoot);

  public java.lang.Boolean hasRunAsNonRoot();

  public java.lang.Long getRunAsUser();

  public A withRunAsUser(java.lang.Long runAsUser);

  public java.lang.Boolean hasRunAsUser();

  /**
   * This method has been deprecated, please use method buildSeLinuxOptions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SELinuxOptions getSeLinuxOptions();

  public io.kubernetes.client.openapi.models.V1SELinuxOptions buildSeLinuxOptions();

  public A withSeLinuxOptions(io.kubernetes.client.openapi.models.V1SELinuxOptions seLinuxOptions);

  public java.lang.Boolean hasSeLinuxOptions();

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeLinuxOptionsNested<A>
      withNewSeLinuxOptions();

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeLinuxOptionsNested<A>
      withNewSeLinuxOptionsLike(io.kubernetes.client.openapi.models.V1SELinuxOptions item);

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeLinuxOptionsNested<A>
      editSeLinuxOptions();

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeLinuxOptionsNested<A>
      editOrNewSeLinuxOptions();

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeLinuxOptionsNested<A>
      editOrNewSeLinuxOptionsLike(io.kubernetes.client.openapi.models.V1SELinuxOptions item);

  /**
   * This method has been deprecated, please use method buildSeccompProfile instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SeccompProfile getSeccompProfile();

  public io.kubernetes.client.openapi.models.V1SeccompProfile buildSeccompProfile();

  public A withSeccompProfile(io.kubernetes.client.openapi.models.V1SeccompProfile seccompProfile);

  public java.lang.Boolean hasSeccompProfile();

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeccompProfileNested<A>
      withNewSeccompProfile();

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeccompProfileNested<A>
      withNewSeccompProfileLike(io.kubernetes.client.openapi.models.V1SeccompProfile item);

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeccompProfileNested<A>
      editSeccompProfile();

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeccompProfileNested<A>
      editOrNewSeccompProfile();

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeccompProfileNested<A>
      editOrNewSeccompProfileLike(io.kubernetes.client.openapi.models.V1SeccompProfile item);

  /**
   * This method has been deprecated, please use method buildWindowsOptions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions getWindowsOptions();

  public io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions buildWindowsOptions();

  public A withWindowsOptions(
      io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions windowsOptions);

  public java.lang.Boolean hasWindowsOptions();

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.WindowsOptionsNested<A>
      withNewWindowsOptions();

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.WindowsOptionsNested<A>
      withNewWindowsOptionsLike(
          io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions item);

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.WindowsOptionsNested<A>
      editWindowsOptions();

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.WindowsOptionsNested<A>
      editOrNewWindowsOptions();

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.WindowsOptionsNested<A>
      editOrNewWindowsOptionsLike(
          io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions item);

  public interface CapabilitiesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1CapabilitiesFluent<
              io.kubernetes.client.openapi.models.V1SecurityContextFluent.CapabilitiesNested<N>> {
    public N and();

    public N endCapabilities();
  }

  public interface SeLinuxOptionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1SELinuxOptionsFluent<
              io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeLinuxOptionsNested<N>> {
    public N and();

    public N endSeLinuxOptions();
  }

  public interface SeccompProfileNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1SeccompProfileFluent<
              io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeccompProfileNested<N>> {
    public N and();

    public N endSeccompProfile();
  }

  public interface WindowsOptionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsFluent<
              io.kubernetes.client.openapi.models.V1SecurityContextFluent.WindowsOptionsNested<N>> {
    public N and();

    public N endWindowsOptions();
  }
}
