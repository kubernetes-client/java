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

import java.util.Iterator;
import java.util.List;

/** Generated */
public class V1PodSecurityContextFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1PodSecurityContextFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1PodSecurityContextFluent<A> {
  public V1PodSecurityContextFluentImpl() {}

  public V1PodSecurityContextFluentImpl(
      io.kubernetes.client.openapi.models.V1PodSecurityContext instance) {
    this.withFsGroup(instance.getFsGroup());

    this.withFsGroupChangePolicy(instance.getFsGroupChangePolicy());

    this.withRunAsGroup(instance.getRunAsGroup());

    this.withRunAsNonRoot(instance.getRunAsNonRoot());

    this.withRunAsUser(instance.getRunAsUser());

    this.withSeLinuxOptions(instance.getSeLinuxOptions());

    this.withSeccompProfile(instance.getSeccompProfile());

    this.withSupplementalGroups(instance.getSupplementalGroups());

    this.withSysctls(instance.getSysctls());

    this.withWindowsOptions(instance.getWindowsOptions());
  }

  private java.lang.Long fsGroup;
  private java.lang.String fsGroupChangePolicy;
  private java.lang.Long runAsGroup;
  private java.lang.Boolean runAsNonRoot;
  private java.lang.Long runAsUser;
  private io.kubernetes.client.openapi.models.V1SELinuxOptionsBuilder seLinuxOptions;
  private io.kubernetes.client.openapi.models.V1SeccompProfileBuilder seccompProfile;
  private java.util.List<java.lang.Long> supplementalGroups;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1SysctlBuilder> sysctls;
  private io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsBuilder windowsOptions;

  public java.lang.Long getFsGroup() {
    return this.fsGroup;
  }

  public A withFsGroup(java.lang.Long fsGroup) {
    this.fsGroup = fsGroup;
    return (A) this;
  }

  public java.lang.Boolean hasFsGroup() {
    return this.fsGroup != null;
  }

  public java.lang.String getFsGroupChangePolicy() {
    return this.fsGroupChangePolicy;
  }

  public A withFsGroupChangePolicy(java.lang.String fsGroupChangePolicy) {
    this.fsGroupChangePolicy = fsGroupChangePolicy;
    return (A) this;
  }

  public java.lang.Boolean hasFsGroupChangePolicy() {
    return this.fsGroupChangePolicy != null;
  }

  /** Method is deprecated. use withFsGroupChangePolicy instead. */
  @java.lang.Deprecated
  public A withNewFsGroupChangePolicy(java.lang.String original) {
    return (A) withFsGroupChangePolicy(new String(original));
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

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeLinuxOptionsNested<A>
      withNewSeLinuxOptions() {
    return new io.kubernetes.client.openapi.models.V1PodSecurityContextFluentImpl
        .SeLinuxOptionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeLinuxOptionsNested<A>
      withNewSeLinuxOptionsLike(io.kubernetes.client.openapi.models.V1SELinuxOptions item) {
    return new io.kubernetes.client.openapi.models.V1PodSecurityContextFluentImpl
        .SeLinuxOptionsNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeLinuxOptionsNested<A>
      editSeLinuxOptions() {
    return withNewSeLinuxOptionsLike(getSeLinuxOptions());
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeLinuxOptionsNested<A>
      editOrNewSeLinuxOptions() {
    return withNewSeLinuxOptionsLike(
        getSeLinuxOptions() != null
            ? getSeLinuxOptions()
            : new io.kubernetes.client.openapi.models.V1SELinuxOptionsBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeLinuxOptionsNested<A>
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

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeccompProfileNested<A>
      withNewSeccompProfile() {
    return new io.kubernetes.client.openapi.models.V1PodSecurityContextFluentImpl
        .SeccompProfileNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeccompProfileNested<A>
      withNewSeccompProfileLike(io.kubernetes.client.openapi.models.V1SeccompProfile item) {
    return new io.kubernetes.client.openapi.models.V1PodSecurityContextFluentImpl
        .SeccompProfileNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeccompProfileNested<A>
      editSeccompProfile() {
    return withNewSeccompProfileLike(getSeccompProfile());
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeccompProfileNested<A>
      editOrNewSeccompProfile() {
    return withNewSeccompProfileLike(
        getSeccompProfile() != null
            ? getSeccompProfile()
            : new io.kubernetes.client.openapi.models.V1SeccompProfileBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeccompProfileNested<A>
      editOrNewSeccompProfileLike(io.kubernetes.client.openapi.models.V1SeccompProfile item) {
    return withNewSeccompProfileLike(getSeccompProfile() != null ? getSeccompProfile() : item);
  }

  public A addToSupplementalGroups(java.lang.Integer index, java.lang.Long item) {
    if (this.supplementalGroups == null) {
      this.supplementalGroups = new java.util.ArrayList<java.lang.Long>();
    }
    this.supplementalGroups.add(index, item);
    return (A) this;
  }

  public A setToSupplementalGroups(java.lang.Integer index, java.lang.Long item) {
    if (this.supplementalGroups == null) {
      this.supplementalGroups = new java.util.ArrayList<java.lang.Long>();
    }
    this.supplementalGroups.set(index, item);
    return (A) this;
  }

  public A addToSupplementalGroups(java.lang.Long... items) {
    if (this.supplementalGroups == null) {
      this.supplementalGroups = new java.util.ArrayList<java.lang.Long>();
    }
    for (java.lang.Long item : items) {
      this.supplementalGroups.add(item);
    }
    return (A) this;
  }

  public A addAllToSupplementalGroups(java.util.Collection<java.lang.Long> items) {
    if (this.supplementalGroups == null) {
      this.supplementalGroups = new java.util.ArrayList<java.lang.Long>();
    }
    for (java.lang.Long item : items) {
      this.supplementalGroups.add(item);
    }
    return (A) this;
  }

  public A removeFromSupplementalGroups(java.lang.Long... items) {
    for (java.lang.Long item : items) {
      if (this.supplementalGroups != null) {
        this.supplementalGroups.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromSupplementalGroups(java.util.Collection<java.lang.Long> items) {
    for (java.lang.Long item : items) {
      if (this.supplementalGroups != null) {
        this.supplementalGroups.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.Long> getSupplementalGroups() {
    return this.supplementalGroups;
  }

  public java.lang.Long getSupplementalGroup(java.lang.Integer index) {
    return this.supplementalGroups.get(index);
  }

  public java.lang.Long getFirstSupplementalGroup() {
    return this.supplementalGroups.get(0);
  }

  public java.lang.Long getLastSupplementalGroup() {
    return this.supplementalGroups.get(supplementalGroups.size() - 1);
  }

  public java.lang.Long getMatchingSupplementalGroup(
      java.util.function.Predicate<java.lang.Long> predicate) {
    for (java.lang.Long item : supplementalGroups) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingSupplementalGroup(
      java.util.function.Predicate<java.lang.Long> predicate) {
    for (java.lang.Long item : supplementalGroups) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withSupplementalGroups(java.util.List<java.lang.Long> supplementalGroups) {
    if (supplementalGroups != null) {
      this.supplementalGroups = new java.util.ArrayList();
      for (java.lang.Long item : supplementalGroups) {
        this.addToSupplementalGroups(item);
      }
    } else {
      this.supplementalGroups = null;
    }
    return (A) this;
  }

  public A withSupplementalGroups(java.lang.Long... supplementalGroups) {
    if (this.supplementalGroups != null) {
      this.supplementalGroups.clear();
    }
    if (supplementalGroups != null) {
      for (java.lang.Long item : supplementalGroups) {
        this.addToSupplementalGroups(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasSupplementalGroups() {
    return supplementalGroups != null && !supplementalGroups.isEmpty();
  }

  public A addToSysctls(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Sysctl item) {
    if (this.sysctls == null) {
      this.sysctls = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1SysctlBuilder>();
    }
    io.kubernetes.client.openapi.models.V1SysctlBuilder builder =
        new io.kubernetes.client.openapi.models.V1SysctlBuilder(item);
    _visitables.get("sysctls").add(index >= 0 ? index : _visitables.get("sysctls").size(), builder);
    this.sysctls.add(index >= 0 ? index : sysctls.size(), builder);
    return (A) this;
  }

  public A setToSysctls(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Sysctl item) {
    if (this.sysctls == null) {
      this.sysctls = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1SysctlBuilder>();
    }
    io.kubernetes.client.openapi.models.V1SysctlBuilder builder =
        new io.kubernetes.client.openapi.models.V1SysctlBuilder(item);
    if (index < 0 || index >= _visitables.get("sysctls").size()) {
      _visitables.get("sysctls").add(builder);
    } else {
      _visitables.get("sysctls").set(index, builder);
    }
    if (index < 0 || index >= sysctls.size()) {
      sysctls.add(builder);
    } else {
      sysctls.set(index, builder);
    }
    return (A) this;
  }

  public A addToSysctls(io.kubernetes.client.openapi.models.V1Sysctl... items) {
    if (this.sysctls == null) {
      this.sysctls = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1SysctlBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Sysctl item : items) {
      io.kubernetes.client.openapi.models.V1SysctlBuilder builder =
          new io.kubernetes.client.openapi.models.V1SysctlBuilder(item);
      _visitables.get("sysctls").add(builder);
      this.sysctls.add(builder);
    }
    return (A) this;
  }

  public A addAllToSysctls(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Sysctl> items) {
    if (this.sysctls == null) {
      this.sysctls = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1SysctlBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Sysctl item : items) {
      io.kubernetes.client.openapi.models.V1SysctlBuilder builder =
          new io.kubernetes.client.openapi.models.V1SysctlBuilder(item);
      _visitables.get("sysctls").add(builder);
      this.sysctls.add(builder);
    }
    return (A) this;
  }

  public A removeFromSysctls(io.kubernetes.client.openapi.models.V1Sysctl... items) {
    for (io.kubernetes.client.openapi.models.V1Sysctl item : items) {
      io.kubernetes.client.openapi.models.V1SysctlBuilder builder =
          new io.kubernetes.client.openapi.models.V1SysctlBuilder(item);
      _visitables.get("sysctls").remove(builder);
      if (this.sysctls != null) {
        this.sysctls.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromSysctls(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Sysctl> items) {
    for (io.kubernetes.client.openapi.models.V1Sysctl item : items) {
      io.kubernetes.client.openapi.models.V1SysctlBuilder builder =
          new io.kubernetes.client.openapi.models.V1SysctlBuilder(item);
      _visitables.get("sysctls").remove(builder);
      if (this.sysctls != null) {
        this.sysctls.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromSysctls(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1SysctlBuilder> predicate) {
    if (sysctls == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1SysctlBuilder> each = sysctls.iterator();
    final List visitables = _visitables.get("sysctls");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1SysctlBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildSysctls instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1Sysctl> getSysctls() {
    return sysctls != null ? build(sysctls) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1Sysctl> buildSysctls() {
    return sysctls != null ? build(sysctls) : null;
  }

  public io.kubernetes.client.openapi.models.V1Sysctl buildSysctl(java.lang.Integer index) {
    return this.sysctls.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1Sysctl buildFirstSysctl() {
    return this.sysctls.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1Sysctl buildLastSysctl() {
    return this.sysctls.get(sysctls.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1Sysctl buildMatchingSysctl(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1SysctlBuilder> predicate) {
    for (io.kubernetes.client.openapi.models.V1SysctlBuilder item : sysctls) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingSysctl(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1SysctlBuilder> predicate) {
    for (io.kubernetes.client.openapi.models.V1SysctlBuilder item : sysctls) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withSysctls(java.util.List<io.kubernetes.client.openapi.models.V1Sysctl> sysctls) {
    if (this.sysctls != null) {
      _visitables.get("sysctls").removeAll(this.sysctls);
    }
    if (sysctls != null) {
      this.sysctls = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1Sysctl item : sysctls) {
        this.addToSysctls(item);
      }
    } else {
      this.sysctls = null;
    }
    return (A) this;
  }

  public A withSysctls(io.kubernetes.client.openapi.models.V1Sysctl... sysctls) {
    if (this.sysctls != null) {
      this.sysctls.clear();
    }
    if (sysctls != null) {
      for (io.kubernetes.client.openapi.models.V1Sysctl item : sysctls) {
        this.addToSysctls(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasSysctls() {
    return sysctls != null && !sysctls.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SysctlsNested<A>
      addNewSysctl() {
    return new io.kubernetes.client.openapi.models.V1PodSecurityContextFluentImpl
        .SysctlsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SysctlsNested<A>
      addNewSysctlLike(io.kubernetes.client.openapi.models.V1Sysctl item) {
    return new io.kubernetes.client.openapi.models.V1PodSecurityContextFluentImpl.SysctlsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SysctlsNested<A>
      setNewSysctlLike(java.lang.Integer index, io.kubernetes.client.openapi.models.V1Sysctl item) {
    return new io.kubernetes.client.openapi.models.V1PodSecurityContextFluentImpl.SysctlsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SysctlsNested<A> editSysctl(
      java.lang.Integer index) {
    if (sysctls.size() <= index)
      throw new RuntimeException("Can't edit sysctls. Index exceeds size.");
    return setNewSysctlLike(index, buildSysctl(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SysctlsNested<A>
      editFirstSysctl() {
    if (sysctls.size() == 0)
      throw new RuntimeException("Can't edit first sysctls. The list is empty.");
    return setNewSysctlLike(0, buildSysctl(0));
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SysctlsNested<A>
      editLastSysctl() {
    int index = sysctls.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last sysctls. The list is empty.");
    return setNewSysctlLike(index, buildSysctl(index));
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SysctlsNested<A>
      editMatchingSysctl(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1SysctlBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < sysctls.size(); i++) {
      if (predicate.test(sysctls.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching sysctls. No match found.");
    return setNewSysctlLike(index, buildSysctl(index));
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

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.WindowsOptionsNested<A>
      withNewWindowsOptions() {
    return new io.kubernetes.client.openapi.models.V1PodSecurityContextFluentImpl
        .WindowsOptionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.WindowsOptionsNested<A>
      withNewWindowsOptionsLike(
          io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions item) {
    return new io.kubernetes.client.openapi.models.V1PodSecurityContextFluentImpl
        .WindowsOptionsNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.WindowsOptionsNested<A>
      editWindowsOptions() {
    return withNewWindowsOptionsLike(getWindowsOptions());
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.WindowsOptionsNested<A>
      editOrNewWindowsOptions() {
    return withNewWindowsOptionsLike(
        getWindowsOptions() != null
            ? getWindowsOptions()
            : new io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.WindowsOptionsNested<A>
      editOrNewWindowsOptionsLike(
          io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions item) {
    return withNewWindowsOptionsLike(getWindowsOptions() != null ? getWindowsOptions() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodSecurityContextFluentImpl that = (V1PodSecurityContextFluentImpl) o;
    if (fsGroup != null ? !fsGroup.equals(that.fsGroup) : that.fsGroup != null) return false;
    if (fsGroupChangePolicy != null
        ? !fsGroupChangePolicy.equals(that.fsGroupChangePolicy)
        : that.fsGroupChangePolicy != null) return false;
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
    if (supplementalGroups != null
        ? !supplementalGroups.equals(that.supplementalGroups)
        : that.supplementalGroups != null) return false;
    if (sysctls != null ? !sysctls.equals(that.sysctls) : that.sysctls != null) return false;
    if (windowsOptions != null
        ? !windowsOptions.equals(that.windowsOptions)
        : that.windowsOptions != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        fsGroup,
        fsGroupChangePolicy,
        runAsGroup,
        runAsNonRoot,
        runAsUser,
        seLinuxOptions,
        seccompProfile,
        supplementalGroups,
        sysctls,
        windowsOptions,
        super.hashCode());
  }

  public class SeLinuxOptionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1SELinuxOptionsFluentImpl<
          io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeLinuxOptionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodSecurityContextFluent
                  .SeLinuxOptionsNested<
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
      return (N) V1PodSecurityContextFluentImpl.this.withSeLinuxOptions(builder.build());
    }

    public N endSeLinuxOptions() {
      return and();
    }
  }

  public class SeccompProfileNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1SeccompProfileFluentImpl<
          io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SeccompProfileNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodSecurityContextFluent
                  .SeccompProfileNested<
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
      return (N) V1PodSecurityContextFluentImpl.this.withSeccompProfile(builder.build());
    }

    public N endSeccompProfile() {
      return and();
    }
  }

  public class SysctlsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1SysctlFluentImpl<
          io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SysctlsNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.SysctlsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SysctlsNestedImpl(java.lang.Integer index, io.kubernetes.client.openapi.models.V1Sysctl item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1SysctlBuilder(this, item);
    }

    SysctlsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1SysctlBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1SysctlBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1PodSecurityContextFluentImpl.this.setToSysctls(index, builder.build());
    }

    public N endSysctl() {
      return and();
    }
  }

  public class WindowsOptionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsFluentImpl<
          io.kubernetes.client.openapi.models.V1PodSecurityContextFluent.WindowsOptionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodSecurityContextFluent
                  .WindowsOptionsNested<
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
      return (N) V1PodSecurityContextFluentImpl.this.withWindowsOptions(builder.build());
    }

    public N endWindowsOptions() {
      return and();
    }
  }
}
