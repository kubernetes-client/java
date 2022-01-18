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
public interface V1PodSecurityContextFluent<
        A extends io.kubernetes.client.openapi.models.V1PodSecurityContextFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.Long getFsGroup();

  public A withFsGroup(java.lang.Long fsGroup);

  public java.lang.Boolean hasFsGroup();

  public java.lang.String getFsGroupChangePolicy();

  public A withFsGroupChangePolicy(java.lang.String fsGroupChangePolicy);

  public java.lang.Boolean hasFsGroupChangePolicy();

  /** Method is deprecated. use withFsGroupChangePolicy instead. */
  @java.lang.Deprecated
  public A withNewFsGroupChangePolicy(java.lang.String original);

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

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeLinuxOptionsNested<A>
      withNewSeLinuxOptions();

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeLinuxOptionsNested<A>
      withNewSeLinuxOptionsLike(io.kubernetes.client.openapi.models.V1SELinuxOptions item);

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeLinuxOptionsNested<A>
      editSeLinuxOptions();

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeLinuxOptionsNested<A>
      editOrNewSeLinuxOptions();

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeLinuxOptionsNested<A>
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

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeccompProfileNested<A>
      withNewSeccompProfile();

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeccompProfileNested<A>
      withNewSeccompProfileLike(io.kubernetes.client.openapi.models.V1SeccompProfile item);

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeccompProfileNested<A>
      editSeccompProfile();

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeccompProfileNested<A>
      editOrNewSeccompProfile();

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeccompProfileNested<A>
      editOrNewSeccompProfileLike(io.kubernetes.client.openapi.models.V1SeccompProfile item);

  public A addToSupplementalGroups(java.lang.Integer index, java.lang.Long item);

  public A setToSupplementalGroups(java.lang.Integer index, java.lang.Long item);

  public A addToSupplementalGroups(java.lang.Long... items);

  public A addAllToSupplementalGroups(java.util.Collection<java.lang.Long> items);

  public A removeFromSupplementalGroups(java.lang.Long... items);

  public A removeAllFromSupplementalGroups(java.util.Collection<java.lang.Long> items);

  public java.util.List<java.lang.Long> getSupplementalGroups();

  public java.lang.Long getSupplementalGroup(java.lang.Integer index);

  public java.lang.Long getFirstSupplementalGroup();

  public java.lang.Long getLastSupplementalGroup();

  public java.lang.Long getMatchingSupplementalGroup(
      java.util.function.Predicate<java.lang.Long> predicate);

  public java.lang.Boolean hasMatchingSupplementalGroup(
      java.util.function.Predicate<java.lang.Long> predicate);

  public A withSupplementalGroups(java.util.List<java.lang.Long> supplementalGroups);

  public A withSupplementalGroups(java.lang.Long... supplementalGroups);

  public java.lang.Boolean hasSupplementalGroups();

  public A addToSysctls(java.lang.Integer index, io.kubernetes.client.openapi.models.V1Sysctl item);

  public A setToSysctls(java.lang.Integer index, io.kubernetes.client.openapi.models.V1Sysctl item);

  public A addToSysctls(io.kubernetes.client.openapi.models.V1Sysctl... items);

  public A addAllToSysctls(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Sysctl> items);

  public A removeFromSysctls(io.kubernetes.client.openapi.models.V1Sysctl... items);

  public A removeAllFromSysctls(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Sysctl> items);

  public A removeMatchingFromSysctls(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1SysctlBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildSysctls instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1Sysctl> getSysctls();

  public java.util.List<io.kubernetes.client.openapi.models.V1Sysctl> buildSysctls();

  public io.kubernetes.client.openapi.models.V1Sysctl buildSysctl(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1Sysctl buildFirstSysctl();

  public io.kubernetes.client.openapi.models.V1Sysctl buildLastSysctl();

  public io.kubernetes.client.openapi.models.V1Sysctl buildMatchingSysctl(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1SysctlBuilder> predicate);

  public java.lang.Boolean hasMatchingSysctl(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1SysctlBuilder> predicate);

  public A withSysctls(java.util.List<io.kubernetes.client.openapi.models.V1Sysctl> sysctls);

  public A withSysctls(io.kubernetes.client.openapi.models.V1Sysctl... sysctls);

  public java.lang.Boolean hasSysctls();

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SysctlsNested<A>
      addNewSysctl();

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SysctlsNested<A>
      addNewSysctlLike(io.kubernetes.client.openapi.models.V1Sysctl item);

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SysctlsNested<A>
      setNewSysctlLike(java.lang.Integer index, io.kubernetes.client.openapi.models.V1Sysctl item);

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SysctlsNested<A> editSysctl(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SysctlsNested<A>
      editFirstSysctl();

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SysctlsNested<A>
      editLastSysctl();

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SysctlsNested<A>
      editMatchingSysctl(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1SysctlBuilder>
              predicate);

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

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.WindowsOptionsNested<A>
      withNewWindowsOptions();

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.WindowsOptionsNested<A>
      withNewWindowsOptionsLike(
          io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions item);

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.WindowsOptionsNested<A>
      editWindowsOptions();

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.WindowsOptionsNested<A>
      editOrNewWindowsOptions();

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.WindowsOptionsNested<A>
      editOrNewWindowsOptionsLike(
          io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions item);

  public interface SeLinuxOptionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1SELinuxOptionsFluent<
              io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeLinuxOptionsNested<
                  N>> {
    public N and();

    public N endSeLinuxOptions();
  }

  public interface SeccompProfileNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1SeccompProfileFluent<
              io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeccompProfileNested<
                  N>> {
    public N and();

    public N endSeccompProfile();
  }

  public interface SysctlsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1SysctlFluent<
              io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SysctlsNested<N>> {
    public N and();

    public N endSysctl();
  }

  public interface WindowsOptionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsFluent<
              io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.WindowsOptionsNested<
                  N>> {
    public N and();

    public N endWindowsOptions();
  }
}
