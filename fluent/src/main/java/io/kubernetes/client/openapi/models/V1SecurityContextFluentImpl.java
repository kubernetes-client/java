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
public class V1SecurityContextFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1SecurityContextFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1SecurityContextFluent<A> {
  public V1SecurityContextFluentImpl() {}

  public V1SecurityContextFluentImpl(
      io.kubernetes.client.openapi.models.V1SecurityContext instance) {
    this.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation());

    this.withCapabilities(instance.getCapabilities());

    this.withPrivileged(instance.getPrivileged());

    this.withProcMount(instance.getProcMount());

    this.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem());

    this.withRunAsGroup(instance.getRunAsGroup());

    this.withRunAsNonRoot(instance.getRunAsNonRoot());

    this.withRunAsUser(instance.getRunAsUser());

    this.withSeLinuxOptions(instance.getSeLinuxOptions());

    this.withSeccompProfile(instance.getSeccompProfile());

    this.withWindowsOptions(instance.getWindowsOptions());
  }

  private java.lang.Boolean allowPrivilegeEscalation;
  private io.kubernetes.client.openapi.models.V1CapabilitiesBuilder capabilities;
  private java.lang.Boolean privileged;
  private java.lang.String procMount;
  private java.lang.Boolean readOnlyRootFilesystem;
  private java.lang.Long runAsGroup;
  private java.lang.Boolean runAsNonRoot;
  private java.lang.Long runAsUser;
  private io.kubernetes.client.openapi.models.V1SELinuxOptionsBuilder seLinuxOptions;
  private io.kubernetes.client.openapi.models.V1SeccompProfileBuilder seccompProfile;
  private io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsBuilder windowsOptions;

  public java.lang.Boolean getAllowPrivilegeEscalation() {
    return this.allowPrivilegeEscalation;
  }

  public A withAllowPrivilegeEscalation(java.lang.Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    return (A) this;
  }

  public java.lang.Boolean hasAllowPrivilegeEscalation() {
    return this.allowPrivilegeEscalation != null;
  }

  /**
   * This method has been deprecated, please use method buildCapabilities instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1Capabilities getCapabilities() {
    return this.capabilities != null ? this.capabilities.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1Capabilities buildCapabilities() {
    return this.capabilities != null ? this.capabilities.build() : null;
  }

  public A withCapabilities(io.kubernetes.client.openapi.models.V1Capabilities capabilities) {
    _visitables.get("capabilities").remove(this.capabilities);
    if (capabilities != null) {
      this.capabilities =
          new io.kubernetes.client.openapi.models.V1CapabilitiesBuilder(capabilities);
      _visitables.get("capabilities").add(this.capabilities);
    }
    return (A) this;
  }

  public java.lang.Boolean hasCapabilities() {
    return this.capabilities != null;
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.CapabilitiesNested<A>
      withNewCapabilities() {
    return new io.kubernetes.client.openapi.models.V1SecurityContextFluentImpl
        .CapabilitiesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.CapabilitiesNested<A>
      withNewCapabilitiesLike(io.kubernetes.client.openapi.models.V1Capabilities item) {
    return new io.kubernetes.client.openapi.models.V1SecurityContextFluentImpl
        .CapabilitiesNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.CapabilitiesNested<A>
      editCapabilities() {
    return withNewCapabilitiesLike(getCapabilities());
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.CapabilitiesNested<A>
      editOrNewCapabilities() {
    return withNewCapabilitiesLike(
        getCapabilities() != null
            ? getCapabilities()
            : new io.kubernetes.client.openapi.models.V1CapabilitiesBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.CapabilitiesNested<A>
      editOrNewCapabilitiesLike(io.kubernetes.client.openapi.models.V1Capabilities item) {
    return withNewCapabilitiesLike(getCapabilities() != null ? getCapabilities() : item);
  }

  public java.lang.Boolean getPrivileged() {
    return this.privileged;
  }

  public A withPrivileged(java.lang.Boolean privileged) {
    this.privileged = privileged;
    return (A) this;
  }

  public java.lang.Boolean hasPrivileged() {
    return this.privileged != null;
  }

  public java.lang.String getProcMount() {
    return this.procMount;
  }

  public A withProcMount(java.lang.String procMount) {
    this.procMount = procMount;
    return (A) this;
  }

  public java.lang.Boolean hasProcMount() {
    return this.procMount != null;
  }

  /** Method is deprecated. use withProcMount instead. */
  @java.lang.Deprecated
  public A withNewProcMount(java.lang.String original) {
    return (A) withProcMount(new String(original));
  }

  public java.lang.Boolean getReadOnlyRootFilesystem() {
    return this.readOnlyRootFilesystem;
  }

  public A withReadOnlyRootFilesystem(java.lang.Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    return (A) this;
  }

  public java.lang.Boolean hasReadOnlyRootFilesystem() {
    return this.readOnlyRootFilesystem != null;
  }

  public java.lang.Long getRunAsGroup() {
    return this.runAsGroup;
  }

  public A withRunAsGroup(java.lang.Long runAsGroup) {
    this.runAsGroup = runAsGroup;
    return (A) this;
  }

  public java.lang.Boolean hasRunAsGroup() {
    return this.runAsGroup != null;
  }

  public java.lang.Boolean getRunAsNonRoot() {
    return this.runAsNonRoot;
  }

  public A withRunAsNonRoot(java.lang.Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
    return (A) this;
  }

  public java.lang.Boolean hasRunAsNonRoot() {
    return this.runAsNonRoot != null;
  }

  public java.lang.Long getRunAsUser() {
    return this.runAsUser;
  }

  public A withRunAsUser(java.lang.Long runAsUser) {
    this.runAsUser = runAsUser;
    return (A) this;
  }

  public java.lang.Boolean hasRunAsUser() {
    return this.runAsUser != null;
  }

  /**
   * This method has been deprecated, please use method buildSeLinuxOptions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SELinuxOptions getSeLinuxOptions() {
    return this.seLinuxOptions != null ? this.seLinuxOptions.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1SELinuxOptions buildSeLinuxOptions() {
    return this.seLinuxOptions != null ? this.seLinuxOptions.build() : null;
  }

  public A withSeLinuxOptions(io.kubernetes.client.openapi.models.V1SELinuxOptions seLinuxOptions) {
    _visitables.get("seLinuxOptions").remove(this.seLinuxOptions);
    if (seLinuxOptions != null) {
      this.seLinuxOptions =
          new io.kubernetes.client.openapi.models.V1SELinuxOptionsBuilder(seLinuxOptions);
      _visitables.get("seLinuxOptions").add(this.seLinuxOptions);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSeLinuxOptions() {
    return this.seLinuxOptions != null;
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeLinuxOptionsNested<A>
      withNewSeLinuxOptions() {
    return new io.kubernetes.client.openapi.models.V1SecurityContextFluentImpl
        .SeLinuxOptionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeLinuxOptionsNested<A>
      withNewSeLinuxOptionsLike(io.kubernetes.client.openapi.models.V1SELinuxOptions item) {
    return new io.kubernetes.client.openapi.models.V1SecurityContextFluentImpl
        .SeLinuxOptionsNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeLinuxOptionsNested<A>
      editSeLinuxOptions() {
    return withNewSeLinuxOptionsLike(getSeLinuxOptions());
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeLinuxOptionsNested<A>
      editOrNewSeLinuxOptions() {
    return withNewSeLinuxOptionsLike(
        getSeLinuxOptions() != null
            ? getSeLinuxOptions()
            : new io.kubernetes.client.openapi.models.V1SELinuxOptionsBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeLinuxOptionsNested<A>
      editOrNewSeLinuxOptionsLike(io.kubernetes.client.openapi.models.V1SELinuxOptions item) {
    return withNewSeLinuxOptionsLike(getSeLinuxOptions() != null ? getSeLinuxOptions() : item);
  }

  /**
   * This method has been deprecated, please use method buildSeccompProfile instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SeccompProfile getSeccompProfile() {
    return this.seccompProfile != null ? this.seccompProfile.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1SeccompProfile buildSeccompProfile() {
    return this.seccompProfile != null ? this.seccompProfile.build() : null;
  }

  public A withSeccompProfile(io.kubernetes.client.openapi.models.V1SeccompProfile seccompProfile) {
    _visitables.get("seccompProfile").remove(this.seccompProfile);
    if (seccompProfile != null) {
      this.seccompProfile =
          new io.kubernetes.client.openapi.models.V1SeccompProfileBuilder(seccompProfile);
      _visitables.get("seccompProfile").add(this.seccompProfile);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSeccompProfile() {
    return this.seccompProfile != null;
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeccompProfileNested<A>
      withNewSeccompProfile() {
    return new io.kubernetes.client.openapi.models.V1SecurityContextFluentImpl
        .SeccompProfileNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeccompProfileNested<A>
      withNewSeccompProfileLike(io.kubernetes.client.openapi.models.V1SeccompProfile item) {
    return new io.kubernetes.client.openapi.models.V1SecurityContextFluentImpl
        .SeccompProfileNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeccompProfileNested<A>
      editSeccompProfile() {
    return withNewSeccompProfileLike(getSeccompProfile());
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeccompProfileNested<A>
      editOrNewSeccompProfile() {
    return withNewSeccompProfileLike(
        getSeccompProfile() != null
            ? getSeccompProfile()
            : new io.kubernetes.client.openapi.models.V1SeccompProfileBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeccompProfileNested<A>
      editOrNewSeccompProfileLike(io.kubernetes.client.openapi.models.V1SeccompProfile item) {
    return withNewSeccompProfileLike(getSeccompProfile() != null ? getSeccompProfile() : item);
  }

  /**
   * This method has been deprecated, please use method buildWindowsOptions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions getWindowsOptions() {
    return this.windowsOptions != null ? this.windowsOptions.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions buildWindowsOptions() {
    return this.windowsOptions != null ? this.windowsOptions.build() : null;
  }

  public A withWindowsOptions(
      io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions windowsOptions) {
    _visitables.get("windowsOptions").remove(this.windowsOptions);
    if (windowsOptions != null) {
      this.windowsOptions =
          new io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsBuilder(
              windowsOptions);
      _visitables.get("windowsOptions").add(this.windowsOptions);
    }
    return (A) this;
  }

  public java.lang.Boolean hasWindowsOptions() {
    return this.windowsOptions != null;
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.WindowsOptionsNested<A>
      withNewWindowsOptions() {
    return new io.kubernetes.client.openapi.models.V1SecurityContextFluentImpl
        .WindowsOptionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.WindowsOptionsNested<A>
      withNewWindowsOptionsLike(
          io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions item) {
    return new io.kubernetes.client.openapi.models.V1SecurityContextFluentImpl
        .WindowsOptionsNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.WindowsOptionsNested<A>
      editWindowsOptions() {
    return withNewWindowsOptionsLike(getWindowsOptions());
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.WindowsOptionsNested<A>
      editOrNewWindowsOptions() {
    return withNewWindowsOptionsLike(
        getWindowsOptions() != null
            ? getWindowsOptions()
            : new io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1SecurityContextFluent.WindowsOptionsNested<A>
      editOrNewWindowsOptionsLike(
          io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions item) {
    return withNewWindowsOptionsLike(getWindowsOptions() != null ? getWindowsOptions() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SecurityContextFluentImpl that = (V1SecurityContextFluentImpl) o;
    if (allowPrivilegeEscalation != null
        ? !allowPrivilegeEscalation.equals(that.allowPrivilegeEscalation)
        : that.allowPrivilegeEscalation != null) return false;
    if (capabilities != null ? !capabilities.equals(that.capabilities) : that.capabilities != null)
      return false;
    if (privileged != null ? !privileged.equals(that.privileged) : that.privileged != null)
      return false;
    if (procMount != null ? !procMount.equals(that.procMount) : that.procMount != null)
      return false;
    if (readOnlyRootFilesystem != null
        ? !readOnlyRootFilesystem.equals(that.readOnlyRootFilesystem)
        : that.readOnlyRootFilesystem != null) return false;
    if (runAsGroup != null ? !runAsGroup.equals(that.runAsGroup) : that.runAsGroup != null)
      return false;
    if (runAsNonRoot != null ? !runAsNonRoot.equals(that.runAsNonRoot) : that.runAsNonRoot != null)
      return false;
    if (runAsUser != null ? !runAsUser.equals(that.runAsUser) : that.runAsUser != null)
      return false;
    if (seLinuxOptions != null
        ? !seLinuxOptions.equals(that.seLinuxOptions)
        : that.seLinuxOptions != null) return false;
    if (seccompProfile != null
        ? !seccompProfile.equals(that.seccompProfile)
        : that.seccompProfile != null) return false;
    if (windowsOptions != null
        ? !windowsOptions.equals(that.windowsOptions)
        : that.windowsOptions != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        allowPrivilegeEscalation,
        capabilities,
        privileged,
        procMount,
        readOnlyRootFilesystem,
        runAsGroup,
        runAsNonRoot,
        runAsUser,
        seLinuxOptions,
        seccompProfile,
        windowsOptions,
        super.hashCode());
  }

  public class CapabilitiesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1CapabilitiesFluentImpl<
          io.kubernetes.client.openapi.models.V1SecurityContextFluent.CapabilitiesNested<N>>
      implements io.kubernetes.client.openapi.models.V1SecurityContextFluent.CapabilitiesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    CapabilitiesNestedImpl(io.kubernetes.client.openapi.models.V1Capabilities item) {
      this.builder = new io.kubernetes.client.openapi.models.V1CapabilitiesBuilder(this, item);
    }

    CapabilitiesNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1CapabilitiesBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1CapabilitiesBuilder builder;

    public N and() {
      return (N) V1SecurityContextFluentImpl.this.withCapabilities(builder.build());
    }

    public N endCapabilities() {
      return and();
    }
  }

  public class SeLinuxOptionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1SELinuxOptionsFluentImpl<
          io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeLinuxOptionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeLinuxOptionsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    SeLinuxOptionsNestedImpl(io.kubernetes.client.openapi.models.V1SELinuxOptions item) {
      this.builder = new io.kubernetes.client.openapi.models.V1SELinuxOptionsBuilder(this, item);
    }

    SeLinuxOptionsNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SELinuxOptionsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1SELinuxOptionsBuilder builder;

    public N and() {
      return (N) V1SecurityContextFluentImpl.this.withSeLinuxOptions(builder.build());
    }

    public N endSeLinuxOptions() {
      return and();
    }
  }

  public class SeccompProfileNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1SeccompProfileFluentImpl<
          io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeccompProfileNested<N>>
      implements io.kubernetes.client.openapi.models.V1SecurityContextFluent.SeccompProfileNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    SeccompProfileNestedImpl(io.kubernetes.client.openapi.models.V1SeccompProfile item) {
      this.builder = new io.kubernetes.client.openapi.models.V1SeccompProfileBuilder(this, item);
    }

    SeccompProfileNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SeccompProfileBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1SeccompProfileBuilder builder;

    public N and() {
      return (N) V1SecurityContextFluentImpl.this.withSeccompProfile(builder.build());
    }

    public N endSeccompProfile() {
      return and();
    }
  }

  public class WindowsOptionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsFluentImpl<
          io.kubernetes.client.openapi.models.V1SecurityContextFluent.WindowsOptionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1SecurityContextFluent.WindowsOptionsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    WindowsOptionsNestedImpl(
        io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsBuilder(
              this, item);
    }

    WindowsOptionsNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsBuilder builder;

    public N and() {
      return (N) V1SecurityContextFluentImpl.this.withWindowsOptions(builder.build());
    }

    public N endWindowsOptions() {
      return and();
    }
  }
}
