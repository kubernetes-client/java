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
public class V1beta1PodSecurityPolicySpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent<A> {
  public V1beta1PodSecurityPolicySpecFluentImpl() {}

  public V1beta1PodSecurityPolicySpecFluentImpl(
      io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpec instance) {
    this.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation());

    this.withAllowedCSIDrivers(instance.getAllowedCSIDrivers());

    this.withAllowedCapabilities(instance.getAllowedCapabilities());

    this.withAllowedFlexVolumes(instance.getAllowedFlexVolumes());

    this.withAllowedHostPaths(instance.getAllowedHostPaths());

    this.withAllowedProcMountTypes(instance.getAllowedProcMountTypes());

    this.withAllowedUnsafeSysctls(instance.getAllowedUnsafeSysctls());

    this.withDefaultAddCapabilities(instance.getDefaultAddCapabilities());

    this.withDefaultAllowPrivilegeEscalation(instance.getDefaultAllowPrivilegeEscalation());

    this.withForbiddenSysctls(instance.getForbiddenSysctls());

    this.withFsGroup(instance.getFsGroup());

    this.withHostIPC(instance.getHostIPC());

    this.withHostNetwork(instance.getHostNetwork());

    this.withHostPID(instance.getHostPID());

    this.withHostPorts(instance.getHostPorts());

    this.withPrivileged(instance.getPrivileged());

    this.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem());

    this.withRequiredDropCapabilities(instance.getRequiredDropCapabilities());

    this.withRunAsGroup(instance.getRunAsGroup());

    this.withRunAsUser(instance.getRunAsUser());

    this.withRuntimeClass(instance.getRuntimeClass());

    this.withSeLinux(instance.getSeLinux());

    this.withSupplementalGroups(instance.getSupplementalGroups());

    this.withVolumes(instance.getVolumes());
  }

  private java.lang.Boolean allowPrivilegeEscalation;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder>
      allowedCSIDrivers;
  private java.util.List<java.lang.String> allowedCapabilities;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder>
      allowedFlexVolumes;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder>
      allowedHostPaths;
  private java.util.List<java.lang.String> allowedProcMountTypes;
  private java.util.List<java.lang.String> allowedUnsafeSysctls;
  private java.util.List<java.lang.String> defaultAddCapabilities;
  private java.lang.Boolean defaultAllowPrivilegeEscalation;
  private java.util.List<java.lang.String> forbiddenSysctls;
  private io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptionsBuilder fsGroup;
  private java.lang.Boolean hostIPC;
  private java.lang.Boolean hostNetwork;
  private java.lang.Boolean hostPID;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder>
      hostPorts;
  private java.lang.Boolean privileged;
  private java.lang.Boolean readOnlyRootFilesystem;
  private java.util.List<java.lang.String> requiredDropCapabilities;
  private io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsBuilder runAsGroup;
  private io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsBuilder runAsUser;
  private io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptionsBuilder
      runtimeClass;
  private io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsBuilder seLinux;
  private io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsBuilder
      supplementalGroups;
  private java.util.List<java.lang.String> volumes;

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

  public A addToAllowedCSIDrivers(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver item) {
    if (this.allowedCSIDrivers == null) {
      this.allowedCSIDrivers =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder(item);
    _visitables
        .get("allowedCSIDrivers")
        .add(index >= 0 ? index : _visitables.get("allowedCSIDrivers").size(), builder);
    this.allowedCSIDrivers.add(index >= 0 ? index : allowedCSIDrivers.size(), builder);
    return (A) this;
  }

  public A setToAllowedCSIDrivers(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver item) {
    if (this.allowedCSIDrivers == null) {
      this.allowedCSIDrivers =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder(item);
    if (index < 0 || index >= _visitables.get("allowedCSIDrivers").size()) {
      _visitables.get("allowedCSIDrivers").add(builder);
    } else {
      _visitables.get("allowedCSIDrivers").set(index, builder);
    }
    if (index < 0 || index >= allowedCSIDrivers.size()) {
      allowedCSIDrivers.add(builder);
    } else {
      allowedCSIDrivers.set(index, builder);
    }
    return (A) this;
  }

  public A addToAllowedCSIDrivers(
      io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver... items) {
    if (this.allowedCSIDrivers == null) {
      this.allowedCSIDrivers =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver item : items) {
      io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder(item);
      _visitables.get("allowedCSIDrivers").add(builder);
      this.allowedCSIDrivers.add(builder);
    }
    return (A) this;
  }

  public A addAllToAllowedCSIDrivers(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver> items) {
    if (this.allowedCSIDrivers == null) {
      this.allowedCSIDrivers =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver item : items) {
      io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder(item);
      _visitables.get("allowedCSIDrivers").add(builder);
      this.allowedCSIDrivers.add(builder);
    }
    return (A) this;
  }

  public A removeFromAllowedCSIDrivers(
      io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver... items) {
    for (io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver item : items) {
      io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder(item);
      _visitables.get("allowedCSIDrivers").remove(builder);
      if (this.allowedCSIDrivers != null) {
        this.allowedCSIDrivers.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromAllowedCSIDrivers(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver> items) {
    for (io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver item : items) {
      io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder(item);
      _visitables.get("allowedCSIDrivers").remove(builder);
      if (this.allowedCSIDrivers != null) {
        this.allowedCSIDrivers.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromAllowedCSIDrivers(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder>
          predicate) {
    if (allowedCSIDrivers == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder> each =
        allowedCSIDrivers.iterator();
    final List visitables = _visitables.get("allowedCSIDrivers");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildAllowedCSIDrivers instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver>
      getAllowedCSIDrivers() {
    return allowedCSIDrivers != null ? build(allowedCSIDrivers) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver>
      buildAllowedCSIDrivers() {
    return allowedCSIDrivers != null ? build(allowedCSIDrivers) : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver buildAllowedCSIDriver(
      java.lang.Integer index) {
    return this.allowedCSIDrivers.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver buildFirstAllowedCSIDriver() {
    return this.allowedCSIDrivers.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver buildLastAllowedCSIDriver() {
    return this.allowedCSIDrivers.get(allowedCSIDrivers.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver buildMatchingAllowedCSIDriver(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder item :
        allowedCSIDrivers) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingAllowedCSIDriver(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder item :
        allowedCSIDrivers) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAllowedCSIDrivers(
      java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver>
          allowedCSIDrivers) {
    if (this.allowedCSIDrivers != null) {
      _visitables.get("allowedCSIDrivers").removeAll(this.allowedCSIDrivers);
    }
    if (allowedCSIDrivers != null) {
      this.allowedCSIDrivers = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver item : allowedCSIDrivers) {
        this.addToAllowedCSIDrivers(item);
      }
    } else {
      this.allowedCSIDrivers = null;
    }
    return (A) this;
  }

  public A withAllowedCSIDrivers(
      io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver... allowedCSIDrivers) {
    if (this.allowedCSIDrivers != null) {
      this.allowedCSIDrivers.clear();
    }
    if (allowedCSIDrivers != null) {
      for (io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver item : allowedCSIDrivers) {
        this.addToAllowedCSIDrivers(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAllowedCSIDrivers() {
    return allowedCSIDrivers != null && !allowedCSIDrivers.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedCSIDriversNested<
          A>
      addNewAllowedCSIDriver() {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .AllowedCSIDriversNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedCSIDriversNested<
          A>
      addNewAllowedCSIDriverLike(io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .AllowedCSIDriversNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedCSIDriversNested<
          A>
      setNewAllowedCSIDriverLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .AllowedCSIDriversNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedCSIDriversNested<
          A>
      editAllowedCSIDriver(java.lang.Integer index) {
    if (allowedCSIDrivers.size() <= index)
      throw new RuntimeException("Can't edit allowedCSIDrivers. Index exceeds size.");
    return setNewAllowedCSIDriverLike(index, buildAllowedCSIDriver(index));
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedCSIDriversNested<
          A>
      editFirstAllowedCSIDriver() {
    if (allowedCSIDrivers.size() == 0)
      throw new RuntimeException("Can't edit first allowedCSIDrivers. The list is empty.");
    return setNewAllowedCSIDriverLike(0, buildAllowedCSIDriver(0));
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedCSIDriversNested<
          A>
      editLastAllowedCSIDriver() {
    int index = allowedCSIDrivers.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last allowedCSIDrivers. The list is empty.");
    return setNewAllowedCSIDriverLike(index, buildAllowedCSIDriver(index));
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedCSIDriversNested<
          A>
      editMatchingAllowedCSIDriver(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < allowedCSIDrivers.size(); i++) {
      if (predicate.test(allowedCSIDrivers.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching allowedCSIDrivers. No match found.");
    return setNewAllowedCSIDriverLike(index, buildAllowedCSIDriver(index));
  }

  public A addToAllowedCapabilities(java.lang.Integer index, java.lang.String item) {
    if (this.allowedCapabilities == null) {
      this.allowedCapabilities = new java.util.ArrayList<java.lang.String>();
    }
    this.allowedCapabilities.add(index, item);
    return (A) this;
  }

  public A setToAllowedCapabilities(java.lang.Integer index, java.lang.String item) {
    if (this.allowedCapabilities == null) {
      this.allowedCapabilities = new java.util.ArrayList<java.lang.String>();
    }
    this.allowedCapabilities.set(index, item);
    return (A) this;
  }

  public A addToAllowedCapabilities(java.lang.String... items) {
    if (this.allowedCapabilities == null) {
      this.allowedCapabilities = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.allowedCapabilities.add(item);
    }
    return (A) this;
  }

  public A addAllToAllowedCapabilities(java.util.Collection<java.lang.String> items) {
    if (this.allowedCapabilities == null) {
      this.allowedCapabilities = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.allowedCapabilities.add(item);
    }
    return (A) this;
  }

  public A removeFromAllowedCapabilities(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.allowedCapabilities != null) {
        this.allowedCapabilities.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromAllowedCapabilities(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.allowedCapabilities != null) {
        this.allowedCapabilities.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getAllowedCapabilities() {
    return this.allowedCapabilities;
  }

  public java.lang.String getAllowedCapability(java.lang.Integer index) {
    return this.allowedCapabilities.get(index);
  }

  public java.lang.String getFirstAllowedCapability() {
    return this.allowedCapabilities.get(0);
  }

  public java.lang.String getLastAllowedCapability() {
    return this.allowedCapabilities.get(allowedCapabilities.size() - 1);
  }

  public java.lang.String getMatchingAllowedCapability(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : allowedCapabilities) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingAllowedCapability(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : allowedCapabilities) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAllowedCapabilities(java.util.List<java.lang.String> allowedCapabilities) {
    if (allowedCapabilities != null) {
      this.allowedCapabilities = new java.util.ArrayList();
      for (java.lang.String item : allowedCapabilities) {
        this.addToAllowedCapabilities(item);
      }
    } else {
      this.allowedCapabilities = null;
    }
    return (A) this;
  }

  public A withAllowedCapabilities(java.lang.String... allowedCapabilities) {
    if (this.allowedCapabilities != null) {
      this.allowedCapabilities.clear();
    }
    if (allowedCapabilities != null) {
      for (java.lang.String item : allowedCapabilities) {
        this.addToAllowedCapabilities(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAllowedCapabilities() {
    return allowedCapabilities != null && !allowedCapabilities.isEmpty();
  }

  public A addNewAllowedCapability(java.lang.String original) {
    return (A) addToAllowedCapabilities(new String(original));
  }

  public A addToAllowedFlexVolumes(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume item) {
    if (this.allowedFlexVolumes == null) {
      this.allowedFlexVolumes =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder(item);
    _visitables
        .get("allowedFlexVolumes")
        .add(index >= 0 ? index : _visitables.get("allowedFlexVolumes").size(), builder);
    this.allowedFlexVolumes.add(index >= 0 ? index : allowedFlexVolumes.size(), builder);
    return (A) this;
  }

  public A setToAllowedFlexVolumes(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume item) {
    if (this.allowedFlexVolumes == null) {
      this.allowedFlexVolumes =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder(item);
    if (index < 0 || index >= _visitables.get("allowedFlexVolumes").size()) {
      _visitables.get("allowedFlexVolumes").add(builder);
    } else {
      _visitables.get("allowedFlexVolumes").set(index, builder);
    }
    if (index < 0 || index >= allowedFlexVolumes.size()) {
      allowedFlexVolumes.add(builder);
    } else {
      allowedFlexVolumes.set(index, builder);
    }
    return (A) this;
  }

  public A addToAllowedFlexVolumes(
      io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume... items) {
    if (this.allowedFlexVolumes == null) {
      this.allowedFlexVolumes =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume item : items) {
      io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder(item);
      _visitables.get("allowedFlexVolumes").add(builder);
      this.allowedFlexVolumes.add(builder);
    }
    return (A) this;
  }

  public A addAllToAllowedFlexVolumes(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume> items) {
    if (this.allowedFlexVolumes == null) {
      this.allowedFlexVolumes =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume item : items) {
      io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder(item);
      _visitables.get("allowedFlexVolumes").add(builder);
      this.allowedFlexVolumes.add(builder);
    }
    return (A) this;
  }

  public A removeFromAllowedFlexVolumes(
      io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume... items) {
    for (io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume item : items) {
      io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder(item);
      _visitables.get("allowedFlexVolumes").remove(builder);
      if (this.allowedFlexVolumes != null) {
        this.allowedFlexVolumes.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromAllowedFlexVolumes(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume> items) {
    for (io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume item : items) {
      io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder(item);
      _visitables.get("allowedFlexVolumes").remove(builder);
      if (this.allowedFlexVolumes != null) {
        this.allowedFlexVolumes.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromAllowedFlexVolumes(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder>
          predicate) {
    if (allowedFlexVolumes == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder> each =
        allowedFlexVolumes.iterator();
    final List visitables = _visitables.get("allowedFlexVolumes");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildAllowedFlexVolumes instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume>
      getAllowedFlexVolumes() {
    return allowedFlexVolumes != null ? build(allowedFlexVolumes) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume>
      buildAllowedFlexVolumes() {
    return allowedFlexVolumes != null ? build(allowedFlexVolumes) : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume buildAllowedFlexVolume(
      java.lang.Integer index) {
    return this.allowedFlexVolumes.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume
      buildFirstAllowedFlexVolume() {
    return this.allowedFlexVolumes.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume buildLastAllowedFlexVolume() {
    return this.allowedFlexVolumes.get(allowedFlexVolumes.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume
      buildMatchingAllowedFlexVolume(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder>
              predicate) {
    for (io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder item :
        allowedFlexVolumes) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingAllowedFlexVolume(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder item :
        allowedFlexVolumes) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAllowedFlexVolumes(
      java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume>
          allowedFlexVolumes) {
    if (this.allowedFlexVolumes != null) {
      _visitables.get("allowedFlexVolumes").removeAll(this.allowedFlexVolumes);
    }
    if (allowedFlexVolumes != null) {
      this.allowedFlexVolumes = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume item : allowedFlexVolumes) {
        this.addToAllowedFlexVolumes(item);
      }
    } else {
      this.allowedFlexVolumes = null;
    }
    return (A) this;
  }

  public A withAllowedFlexVolumes(
      io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume... allowedFlexVolumes) {
    if (this.allowedFlexVolumes != null) {
      this.allowedFlexVolumes.clear();
    }
    if (allowedFlexVolumes != null) {
      for (io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume item : allowedFlexVolumes) {
        this.addToAllowedFlexVolumes(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAllowedFlexVolumes() {
    return allowedFlexVolumes != null && !allowedFlexVolumes.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedFlexVolumesNested<
          A>
      addNewAllowedFlexVolume() {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .AllowedFlexVolumesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedFlexVolumesNested<
          A>
      addNewAllowedFlexVolumeLike(
          io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .AllowedFlexVolumesNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedFlexVolumesNested<
          A>
      setNewAllowedFlexVolumeLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .AllowedFlexVolumesNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedFlexVolumesNested<
          A>
      editAllowedFlexVolume(java.lang.Integer index) {
    if (allowedFlexVolumes.size() <= index)
      throw new RuntimeException("Can't edit allowedFlexVolumes. Index exceeds size.");
    return setNewAllowedFlexVolumeLike(index, buildAllowedFlexVolume(index));
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedFlexVolumesNested<
          A>
      editFirstAllowedFlexVolume() {
    if (allowedFlexVolumes.size() == 0)
      throw new RuntimeException("Can't edit first allowedFlexVolumes. The list is empty.");
    return setNewAllowedFlexVolumeLike(0, buildAllowedFlexVolume(0));
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedFlexVolumesNested<
          A>
      editLastAllowedFlexVolume() {
    int index = allowedFlexVolumes.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last allowedFlexVolumes. The list is empty.");
    return setNewAllowedFlexVolumeLike(index, buildAllowedFlexVolume(index));
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedFlexVolumesNested<
          A>
      editMatchingAllowedFlexVolume(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < allowedFlexVolumes.size(); i++) {
      if (predicate.test(allowedFlexVolumes.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching allowedFlexVolumes. No match found.");
    return setNewAllowedFlexVolumeLike(index, buildAllowedFlexVolume(index));
  }

  public A addToAllowedHostPaths(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1AllowedHostPath item) {
    if (this.allowedHostPaths == null) {
      this.allowedHostPaths =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder(item);
    _visitables
        .get("allowedHostPaths")
        .add(index >= 0 ? index : _visitables.get("allowedHostPaths").size(), builder);
    this.allowedHostPaths.add(index >= 0 ? index : allowedHostPaths.size(), builder);
    return (A) this;
  }

  public A setToAllowedHostPaths(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1AllowedHostPath item) {
    if (this.allowedHostPaths == null) {
      this.allowedHostPaths =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder(item);
    if (index < 0 || index >= _visitables.get("allowedHostPaths").size()) {
      _visitables.get("allowedHostPaths").add(builder);
    } else {
      _visitables.get("allowedHostPaths").set(index, builder);
    }
    if (index < 0 || index >= allowedHostPaths.size()) {
      allowedHostPaths.add(builder);
    } else {
      allowedHostPaths.set(index, builder);
    }
    return (A) this;
  }

  public A addToAllowedHostPaths(
      io.kubernetes.client.openapi.models.V1beta1AllowedHostPath... items) {
    if (this.allowedHostPaths == null) {
      this.allowedHostPaths =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta1AllowedHostPath item : items) {
      io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder(item);
      _visitables.get("allowedHostPaths").add(builder);
      this.allowedHostPaths.add(builder);
    }
    return (A) this;
  }

  public A addAllToAllowedHostPaths(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1AllowedHostPath> items) {
    if (this.allowedHostPaths == null) {
      this.allowedHostPaths =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta1AllowedHostPath item : items) {
      io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder(item);
      _visitables.get("allowedHostPaths").add(builder);
      this.allowedHostPaths.add(builder);
    }
    return (A) this;
  }

  public A removeFromAllowedHostPaths(
      io.kubernetes.client.openapi.models.V1beta1AllowedHostPath... items) {
    for (io.kubernetes.client.openapi.models.V1beta1AllowedHostPath item : items) {
      io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder(item);
      _visitables.get("allowedHostPaths").remove(builder);
      if (this.allowedHostPaths != null) {
        this.allowedHostPaths.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromAllowedHostPaths(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1AllowedHostPath> items) {
    for (io.kubernetes.client.openapi.models.V1beta1AllowedHostPath item : items) {
      io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder(item);
      _visitables.get("allowedHostPaths").remove(builder);
      if (this.allowedHostPaths != null) {
        this.allowedHostPaths.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromAllowedHostPaths(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder>
          predicate) {
    if (allowedHostPaths == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder> each =
        allowedHostPaths.iterator();
    final List visitables = _visitables.get("allowedHostPaths");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildAllowedHostPaths instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedHostPath>
      getAllowedHostPaths() {
    return allowedHostPaths != null ? build(allowedHostPaths) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedHostPath>
      buildAllowedHostPaths() {
    return allowedHostPaths != null ? build(allowedHostPaths) : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1AllowedHostPath buildAllowedHostPath(
      java.lang.Integer index) {
    return this.allowedHostPaths.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1AllowedHostPath buildFirstAllowedHostPath() {
    return this.allowedHostPaths.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1AllowedHostPath buildLastAllowedHostPath() {
    return this.allowedHostPaths.get(allowedHostPaths.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1AllowedHostPath buildMatchingAllowedHostPath(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder item :
        allowedHostPaths) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingAllowedHostPath(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder item :
        allowedHostPaths) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAllowedHostPaths(
      java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedHostPath> allowedHostPaths) {
    if (this.allowedHostPaths != null) {
      _visitables.get("allowedHostPaths").removeAll(this.allowedHostPaths);
    }
    if (allowedHostPaths != null) {
      this.allowedHostPaths = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1beta1AllowedHostPath item : allowedHostPaths) {
        this.addToAllowedHostPaths(item);
      }
    } else {
      this.allowedHostPaths = null;
    }
    return (A) this;
  }

  public A withAllowedHostPaths(
      io.kubernetes.client.openapi.models.V1beta1AllowedHostPath... allowedHostPaths) {
    if (this.allowedHostPaths != null) {
      this.allowedHostPaths.clear();
    }
    if (allowedHostPaths != null) {
      for (io.kubernetes.client.openapi.models.V1beta1AllowedHostPath item : allowedHostPaths) {
        this.addToAllowedHostPaths(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAllowedHostPaths() {
    return allowedHostPaths != null && !allowedHostPaths.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedHostPathsNested<
          A>
      addNewAllowedHostPath() {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .AllowedHostPathsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedHostPathsNested<
          A>
      addNewAllowedHostPathLike(io.kubernetes.client.openapi.models.V1beta1AllowedHostPath item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .AllowedHostPathsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedHostPathsNested<
          A>
      setNewAllowedHostPathLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1beta1AllowedHostPath item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .AllowedHostPathsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedHostPathsNested<
          A>
      editAllowedHostPath(java.lang.Integer index) {
    if (allowedHostPaths.size() <= index)
      throw new RuntimeException("Can't edit allowedHostPaths. Index exceeds size.");
    return setNewAllowedHostPathLike(index, buildAllowedHostPath(index));
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedHostPathsNested<
          A>
      editFirstAllowedHostPath() {
    if (allowedHostPaths.size() == 0)
      throw new RuntimeException("Can't edit first allowedHostPaths. The list is empty.");
    return setNewAllowedHostPathLike(0, buildAllowedHostPath(0));
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedHostPathsNested<
          A>
      editLastAllowedHostPath() {
    int index = allowedHostPaths.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last allowedHostPaths. The list is empty.");
    return setNewAllowedHostPathLike(index, buildAllowedHostPath(index));
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .AllowedHostPathsNested<
          A>
      editMatchingAllowedHostPath(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < allowedHostPaths.size(); i++) {
      if (predicate.test(allowedHostPaths.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching allowedHostPaths. No match found.");
    return setNewAllowedHostPathLike(index, buildAllowedHostPath(index));
  }

  public A addToAllowedProcMountTypes(java.lang.Integer index, java.lang.String item) {
    if (this.allowedProcMountTypes == null) {
      this.allowedProcMountTypes = new java.util.ArrayList<java.lang.String>();
    }
    this.allowedProcMountTypes.add(index, item);
    return (A) this;
  }

  public A setToAllowedProcMountTypes(java.lang.Integer index, java.lang.String item) {
    if (this.allowedProcMountTypes == null) {
      this.allowedProcMountTypes = new java.util.ArrayList<java.lang.String>();
    }
    this.allowedProcMountTypes.set(index, item);
    return (A) this;
  }

  public A addToAllowedProcMountTypes(java.lang.String... items) {
    if (this.allowedProcMountTypes == null) {
      this.allowedProcMountTypes = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.allowedProcMountTypes.add(item);
    }
    return (A) this;
  }

  public A addAllToAllowedProcMountTypes(java.util.Collection<java.lang.String> items) {
    if (this.allowedProcMountTypes == null) {
      this.allowedProcMountTypes = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.allowedProcMountTypes.add(item);
    }
    return (A) this;
  }

  public A removeFromAllowedProcMountTypes(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.allowedProcMountTypes != null) {
        this.allowedProcMountTypes.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromAllowedProcMountTypes(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.allowedProcMountTypes != null) {
        this.allowedProcMountTypes.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getAllowedProcMountTypes() {
    return this.allowedProcMountTypes;
  }

  public java.lang.String getAllowedProcMountType(java.lang.Integer index) {
    return this.allowedProcMountTypes.get(index);
  }

  public java.lang.String getFirstAllowedProcMountType() {
    return this.allowedProcMountTypes.get(0);
  }

  public java.lang.String getLastAllowedProcMountType() {
    return this.allowedProcMountTypes.get(allowedProcMountTypes.size() - 1);
  }

  public java.lang.String getMatchingAllowedProcMountType(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : allowedProcMountTypes) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingAllowedProcMountType(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : allowedProcMountTypes) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAllowedProcMountTypes(java.util.List<java.lang.String> allowedProcMountTypes) {
    if (allowedProcMountTypes != null) {
      this.allowedProcMountTypes = new java.util.ArrayList();
      for (java.lang.String item : allowedProcMountTypes) {
        this.addToAllowedProcMountTypes(item);
      }
    } else {
      this.allowedProcMountTypes = null;
    }
    return (A) this;
  }

  public A withAllowedProcMountTypes(java.lang.String... allowedProcMountTypes) {
    if (this.allowedProcMountTypes != null) {
      this.allowedProcMountTypes.clear();
    }
    if (allowedProcMountTypes != null) {
      for (java.lang.String item : allowedProcMountTypes) {
        this.addToAllowedProcMountTypes(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAllowedProcMountTypes() {
    return allowedProcMountTypes != null && !allowedProcMountTypes.isEmpty();
  }

  public A addNewAllowedProcMountType(java.lang.String original) {
    return (A) addToAllowedProcMountTypes(new String(original));
  }

  public A addToAllowedUnsafeSysctls(java.lang.Integer index, java.lang.String item) {
    if (this.allowedUnsafeSysctls == null) {
      this.allowedUnsafeSysctls = new java.util.ArrayList<java.lang.String>();
    }
    this.allowedUnsafeSysctls.add(index, item);
    return (A) this;
  }

  public A setToAllowedUnsafeSysctls(java.lang.Integer index, java.lang.String item) {
    if (this.allowedUnsafeSysctls == null) {
      this.allowedUnsafeSysctls = new java.util.ArrayList<java.lang.String>();
    }
    this.allowedUnsafeSysctls.set(index, item);
    return (A) this;
  }

  public A addToAllowedUnsafeSysctls(java.lang.String... items) {
    if (this.allowedUnsafeSysctls == null) {
      this.allowedUnsafeSysctls = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.allowedUnsafeSysctls.add(item);
    }
    return (A) this;
  }

  public A addAllToAllowedUnsafeSysctls(java.util.Collection<java.lang.String> items) {
    if (this.allowedUnsafeSysctls == null) {
      this.allowedUnsafeSysctls = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.allowedUnsafeSysctls.add(item);
    }
    return (A) this;
  }

  public A removeFromAllowedUnsafeSysctls(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.allowedUnsafeSysctls != null) {
        this.allowedUnsafeSysctls.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromAllowedUnsafeSysctls(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.allowedUnsafeSysctls != null) {
        this.allowedUnsafeSysctls.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getAllowedUnsafeSysctls() {
    return this.allowedUnsafeSysctls;
  }

  public java.lang.String getAllowedUnsafeSysctl(java.lang.Integer index) {
    return this.allowedUnsafeSysctls.get(index);
  }

  public java.lang.String getFirstAllowedUnsafeSysctl() {
    return this.allowedUnsafeSysctls.get(0);
  }

  public java.lang.String getLastAllowedUnsafeSysctl() {
    return this.allowedUnsafeSysctls.get(allowedUnsafeSysctls.size() - 1);
  }

  public java.lang.String getMatchingAllowedUnsafeSysctl(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : allowedUnsafeSysctls) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingAllowedUnsafeSysctl(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : allowedUnsafeSysctls) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAllowedUnsafeSysctls(java.util.List<java.lang.String> allowedUnsafeSysctls) {
    if (allowedUnsafeSysctls != null) {
      this.allowedUnsafeSysctls = new java.util.ArrayList();
      for (java.lang.String item : allowedUnsafeSysctls) {
        this.addToAllowedUnsafeSysctls(item);
      }
    } else {
      this.allowedUnsafeSysctls = null;
    }
    return (A) this;
  }

  public A withAllowedUnsafeSysctls(java.lang.String... allowedUnsafeSysctls) {
    if (this.allowedUnsafeSysctls != null) {
      this.allowedUnsafeSysctls.clear();
    }
    if (allowedUnsafeSysctls != null) {
      for (java.lang.String item : allowedUnsafeSysctls) {
        this.addToAllowedUnsafeSysctls(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAllowedUnsafeSysctls() {
    return allowedUnsafeSysctls != null && !allowedUnsafeSysctls.isEmpty();
  }

  public A addNewAllowedUnsafeSysctl(java.lang.String original) {
    return (A) addToAllowedUnsafeSysctls(new String(original));
  }

  public A addToDefaultAddCapabilities(java.lang.Integer index, java.lang.String item) {
    if (this.defaultAddCapabilities == null) {
      this.defaultAddCapabilities = new java.util.ArrayList<java.lang.String>();
    }
    this.defaultAddCapabilities.add(index, item);
    return (A) this;
  }

  public A setToDefaultAddCapabilities(java.lang.Integer index, java.lang.String item) {
    if (this.defaultAddCapabilities == null) {
      this.defaultAddCapabilities = new java.util.ArrayList<java.lang.String>();
    }
    this.defaultAddCapabilities.set(index, item);
    return (A) this;
  }

  public A addToDefaultAddCapabilities(java.lang.String... items) {
    if (this.defaultAddCapabilities == null) {
      this.defaultAddCapabilities = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.defaultAddCapabilities.add(item);
    }
    return (A) this;
  }

  public A addAllToDefaultAddCapabilities(java.util.Collection<java.lang.String> items) {
    if (this.defaultAddCapabilities == null) {
      this.defaultAddCapabilities = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.defaultAddCapabilities.add(item);
    }
    return (A) this;
  }

  public A removeFromDefaultAddCapabilities(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.defaultAddCapabilities != null) {
        this.defaultAddCapabilities.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromDefaultAddCapabilities(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.defaultAddCapabilities != null) {
        this.defaultAddCapabilities.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getDefaultAddCapabilities() {
    return this.defaultAddCapabilities;
  }

  public java.lang.String getDefaultAddCapability(java.lang.Integer index) {
    return this.defaultAddCapabilities.get(index);
  }

  public java.lang.String getFirstDefaultAddCapability() {
    return this.defaultAddCapabilities.get(0);
  }

  public java.lang.String getLastDefaultAddCapability() {
    return this.defaultAddCapabilities.get(defaultAddCapabilities.size() - 1);
  }

  public java.lang.String getMatchingDefaultAddCapability(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : defaultAddCapabilities) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingDefaultAddCapability(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : defaultAddCapabilities) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withDefaultAddCapabilities(java.util.List<java.lang.String> defaultAddCapabilities) {
    if (defaultAddCapabilities != null) {
      this.defaultAddCapabilities = new java.util.ArrayList();
      for (java.lang.String item : defaultAddCapabilities) {
        this.addToDefaultAddCapabilities(item);
      }
    } else {
      this.defaultAddCapabilities = null;
    }
    return (A) this;
  }

  public A withDefaultAddCapabilities(java.lang.String... defaultAddCapabilities) {
    if (this.defaultAddCapabilities != null) {
      this.defaultAddCapabilities.clear();
    }
    if (defaultAddCapabilities != null) {
      for (java.lang.String item : defaultAddCapabilities) {
        this.addToDefaultAddCapabilities(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasDefaultAddCapabilities() {
    return defaultAddCapabilities != null && !defaultAddCapabilities.isEmpty();
  }

  public A addNewDefaultAddCapability(java.lang.String original) {
    return (A) addToDefaultAddCapabilities(new String(original));
  }

  public java.lang.Boolean getDefaultAllowPrivilegeEscalation() {
    return this.defaultAllowPrivilegeEscalation;
  }

  public A withDefaultAllowPrivilegeEscalation(java.lang.Boolean defaultAllowPrivilegeEscalation) {
    this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
    return (A) this;
  }

  public java.lang.Boolean hasDefaultAllowPrivilegeEscalation() {
    return this.defaultAllowPrivilegeEscalation != null;
  }

  public A addToForbiddenSysctls(java.lang.Integer index, java.lang.String item) {
    if (this.forbiddenSysctls == null) {
      this.forbiddenSysctls = new java.util.ArrayList<java.lang.String>();
    }
    this.forbiddenSysctls.add(index, item);
    return (A) this;
  }

  public A setToForbiddenSysctls(java.lang.Integer index, java.lang.String item) {
    if (this.forbiddenSysctls == null) {
      this.forbiddenSysctls = new java.util.ArrayList<java.lang.String>();
    }
    this.forbiddenSysctls.set(index, item);
    return (A) this;
  }

  public A addToForbiddenSysctls(java.lang.String... items) {
    if (this.forbiddenSysctls == null) {
      this.forbiddenSysctls = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.forbiddenSysctls.add(item);
    }
    return (A) this;
  }

  public A addAllToForbiddenSysctls(java.util.Collection<java.lang.String> items) {
    if (this.forbiddenSysctls == null) {
      this.forbiddenSysctls = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.forbiddenSysctls.add(item);
    }
    return (A) this;
  }

  public A removeFromForbiddenSysctls(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.forbiddenSysctls != null) {
        this.forbiddenSysctls.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromForbiddenSysctls(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.forbiddenSysctls != null) {
        this.forbiddenSysctls.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getForbiddenSysctls() {
    return this.forbiddenSysctls;
  }

  public java.lang.String getForbiddenSysctl(java.lang.Integer index) {
    return this.forbiddenSysctls.get(index);
  }

  public java.lang.String getFirstForbiddenSysctl() {
    return this.forbiddenSysctls.get(0);
  }

  public java.lang.String getLastForbiddenSysctl() {
    return this.forbiddenSysctls.get(forbiddenSysctls.size() - 1);
  }

  public java.lang.String getMatchingForbiddenSysctl(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : forbiddenSysctls) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingForbiddenSysctl(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : forbiddenSysctls) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withForbiddenSysctls(java.util.List<java.lang.String> forbiddenSysctls) {
    if (forbiddenSysctls != null) {
      this.forbiddenSysctls = new java.util.ArrayList();
      for (java.lang.String item : forbiddenSysctls) {
        this.addToForbiddenSysctls(item);
      }
    } else {
      this.forbiddenSysctls = null;
    }
    return (A) this;
  }

  public A withForbiddenSysctls(java.lang.String... forbiddenSysctls) {
    if (this.forbiddenSysctls != null) {
      this.forbiddenSysctls.clear();
    }
    if (forbiddenSysctls != null) {
      for (java.lang.String item : forbiddenSysctls) {
        this.addToForbiddenSysctls(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasForbiddenSysctls() {
    return forbiddenSysctls != null && !forbiddenSysctls.isEmpty();
  }

  public A addNewForbiddenSysctl(java.lang.String original) {
    return (A) addToForbiddenSysctls(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildFsGroup instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptions getFsGroup() {
    return this.fsGroup != null ? this.fsGroup.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptions buildFsGroup() {
    return this.fsGroup != null ? this.fsGroup.build() : null;
  }

  public A withFsGroup(io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptions fsGroup) {
    _visitables.get("fsGroup").remove(this.fsGroup);
    if (fsGroup != null) {
      this.fsGroup =
          new io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptionsBuilder(fsGroup);
      _visitables.get("fsGroup").add(this.fsGroup);
    }
    return (A) this;
  }

  public java.lang.Boolean hasFsGroup() {
    return this.fsGroup != null;
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.FsGroupNested<A>
      withNewFsGroup() {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .FsGroupNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.FsGroupNested<A>
      withNewFsGroupLike(io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptions item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .FsGroupNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.FsGroupNested<A>
      editFsGroup() {
    return withNewFsGroupLike(getFsGroup());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.FsGroupNested<A>
      editOrNewFsGroup() {
    return withNewFsGroupLike(
        getFsGroup() != null
            ? getFsGroup()
            : new io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptionsBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.FsGroupNested<A>
      editOrNewFsGroupLike(io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptions item) {
    return withNewFsGroupLike(getFsGroup() != null ? getFsGroup() : item);
  }

  public java.lang.Boolean getHostIPC() {
    return this.hostIPC;
  }

  public A withHostIPC(java.lang.Boolean hostIPC) {
    this.hostIPC = hostIPC;
    return (A) this;
  }

  public java.lang.Boolean hasHostIPC() {
    return this.hostIPC != null;
  }

  public java.lang.Boolean getHostNetwork() {
    return this.hostNetwork;
  }

  public A withHostNetwork(java.lang.Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
    return (A) this;
  }

  public java.lang.Boolean hasHostNetwork() {
    return this.hostNetwork != null;
  }

  public java.lang.Boolean getHostPID() {
    return this.hostPID;
  }

  public A withHostPID(java.lang.Boolean hostPID) {
    this.hostPID = hostPID;
    return (A) this;
  }

  public java.lang.Boolean hasHostPID() {
    return this.hostPID != null;
  }

  public A addToHostPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1HostPortRange item) {
    if (this.hostPorts == null) {
      this.hostPorts =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder(item);
    _visitables
        .get("hostPorts")
        .add(index >= 0 ? index : _visitables.get("hostPorts").size(), builder);
    this.hostPorts.add(index >= 0 ? index : hostPorts.size(), builder);
    return (A) this;
  }

  public A setToHostPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1HostPortRange item) {
    if (this.hostPorts == null) {
      this.hostPorts =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder(item);
    if (index < 0 || index >= _visitables.get("hostPorts").size()) {
      _visitables.get("hostPorts").add(builder);
    } else {
      _visitables.get("hostPorts").set(index, builder);
    }
    if (index < 0 || index >= hostPorts.size()) {
      hostPorts.add(builder);
    } else {
      hostPorts.set(index, builder);
    }
    return (A) this;
  }

  public A addToHostPorts(io.kubernetes.client.openapi.models.V1beta1HostPortRange... items) {
    if (this.hostPorts == null) {
      this.hostPorts =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta1HostPortRange item : items) {
      io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder(item);
      _visitables.get("hostPorts").add(builder);
      this.hostPorts.add(builder);
    }
    return (A) this;
  }

  public A addAllToHostPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1HostPortRange> items) {
    if (this.hostPorts == null) {
      this.hostPorts =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta1HostPortRange item : items) {
      io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder(item);
      _visitables.get("hostPorts").add(builder);
      this.hostPorts.add(builder);
    }
    return (A) this;
  }

  public A removeFromHostPorts(io.kubernetes.client.openapi.models.V1beta1HostPortRange... items) {
    for (io.kubernetes.client.openapi.models.V1beta1HostPortRange item : items) {
      io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder(item);
      _visitables.get("hostPorts").remove(builder);
      if (this.hostPorts != null) {
        this.hostPorts.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromHostPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1HostPortRange> items) {
    for (io.kubernetes.client.openapi.models.V1beta1HostPortRange item : items) {
      io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder(item);
      _visitables.get("hostPorts").remove(builder);
      if (this.hostPorts != null) {
        this.hostPorts.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromHostPorts(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder>
          predicate) {
    if (hostPorts == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder> each =
        hostPorts.iterator();
    final List visitables = _visitables.get("hostPorts");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildHostPorts instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1beta1HostPortRange> getHostPorts() {
    return hostPorts != null ? build(hostPorts) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1beta1HostPortRange> buildHostPorts() {
    return hostPorts != null ? build(hostPorts) : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1HostPortRange buildHostPort(
      java.lang.Integer index) {
    return this.hostPorts.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1HostPortRange buildFirstHostPort() {
    return this.hostPorts.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1HostPortRange buildLastHostPort() {
    return this.hostPorts.get(hostPorts.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1HostPortRange buildMatchingHostPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder item : hostPorts) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingHostPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder item : hostPorts) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withHostPorts(
      java.util.List<io.kubernetes.client.openapi.models.V1beta1HostPortRange> hostPorts) {
    if (this.hostPorts != null) {
      _visitables.get("hostPorts").removeAll(this.hostPorts);
    }
    if (hostPorts != null) {
      this.hostPorts = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1beta1HostPortRange item : hostPorts) {
        this.addToHostPorts(item);
      }
    } else {
      this.hostPorts = null;
    }
    return (A) this;
  }

  public A withHostPorts(io.kubernetes.client.openapi.models.V1beta1HostPortRange... hostPorts) {
    if (this.hostPorts != null) {
      this.hostPorts.clear();
    }
    if (hostPorts != null) {
      for (io.kubernetes.client.openapi.models.V1beta1HostPortRange item : hostPorts) {
        this.addToHostPorts(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasHostPorts() {
    return hostPorts != null && !hostPorts.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.HostPortsNested<A>
      addNewHostPort() {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .HostPortsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.HostPortsNested<A>
      addNewHostPortLike(io.kubernetes.client.openapi.models.V1beta1HostPortRange item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .HostPortsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.HostPortsNested<A>
      setNewHostPortLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1HostPortRange item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .HostPortsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.HostPortsNested<A>
      editHostPort(java.lang.Integer index) {
    if (hostPorts.size() <= index)
      throw new RuntimeException("Can't edit hostPorts. Index exceeds size.");
    return setNewHostPortLike(index, buildHostPort(index));
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.HostPortsNested<A>
      editFirstHostPort() {
    if (hostPorts.size() == 0)
      throw new RuntimeException("Can't edit first hostPorts. The list is empty.");
    return setNewHostPortLike(0, buildHostPort(0));
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.HostPortsNested<A>
      editLastHostPort() {
    int index = hostPorts.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last hostPorts. The list is empty.");
    return setNewHostPortLike(index, buildHostPort(index));
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.HostPortsNested<A>
      editMatchingHostPort(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < hostPorts.size(); i++) {
      if (predicate.test(hostPorts.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching hostPorts. No match found.");
    return setNewHostPortLike(index, buildHostPort(index));
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

  public A addToRequiredDropCapabilities(java.lang.Integer index, java.lang.String item) {
    if (this.requiredDropCapabilities == null) {
      this.requiredDropCapabilities = new java.util.ArrayList<java.lang.String>();
    }
    this.requiredDropCapabilities.add(index, item);
    return (A) this;
  }

  public A setToRequiredDropCapabilities(java.lang.Integer index, java.lang.String item) {
    if (this.requiredDropCapabilities == null) {
      this.requiredDropCapabilities = new java.util.ArrayList<java.lang.String>();
    }
    this.requiredDropCapabilities.set(index, item);
    return (A) this;
  }

  public A addToRequiredDropCapabilities(java.lang.String... items) {
    if (this.requiredDropCapabilities == null) {
      this.requiredDropCapabilities = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.requiredDropCapabilities.add(item);
    }
    return (A) this;
  }

  public A addAllToRequiredDropCapabilities(java.util.Collection<java.lang.String> items) {
    if (this.requiredDropCapabilities == null) {
      this.requiredDropCapabilities = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.requiredDropCapabilities.add(item);
    }
    return (A) this;
  }

  public A removeFromRequiredDropCapabilities(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.requiredDropCapabilities != null) {
        this.requiredDropCapabilities.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromRequiredDropCapabilities(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.requiredDropCapabilities != null) {
        this.requiredDropCapabilities.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getRequiredDropCapabilities() {
    return this.requiredDropCapabilities;
  }

  public java.lang.String getRequiredDropCapability(java.lang.Integer index) {
    return this.requiredDropCapabilities.get(index);
  }

  public java.lang.String getFirstRequiredDropCapability() {
    return this.requiredDropCapabilities.get(0);
  }

  public java.lang.String getLastRequiredDropCapability() {
    return this.requiredDropCapabilities.get(requiredDropCapabilities.size() - 1);
  }

  public java.lang.String getMatchingRequiredDropCapability(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : requiredDropCapabilities) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingRequiredDropCapability(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : requiredDropCapabilities) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withRequiredDropCapabilities(java.util.List<java.lang.String> requiredDropCapabilities) {
    if (requiredDropCapabilities != null) {
      this.requiredDropCapabilities = new java.util.ArrayList();
      for (java.lang.String item : requiredDropCapabilities) {
        this.addToRequiredDropCapabilities(item);
      }
    } else {
      this.requiredDropCapabilities = null;
    }
    return (A) this;
  }

  public A withRequiredDropCapabilities(java.lang.String... requiredDropCapabilities) {
    if (this.requiredDropCapabilities != null) {
      this.requiredDropCapabilities.clear();
    }
    if (requiredDropCapabilities != null) {
      for (java.lang.String item : requiredDropCapabilities) {
        this.addToRequiredDropCapabilities(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasRequiredDropCapabilities() {
    return requiredDropCapabilities != null && !requiredDropCapabilities.isEmpty();
  }

  public A addNewRequiredDropCapability(java.lang.String original) {
    return (A) addToRequiredDropCapabilities(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildRunAsGroup instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions getRunAsGroup() {
    return this.runAsGroup != null ? this.runAsGroup.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions buildRunAsGroup() {
    return this.runAsGroup != null ? this.runAsGroup.build() : null;
  }

  public A withRunAsGroup(
      io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions runAsGroup) {
    _visitables.get("runAsGroup").remove(this.runAsGroup);
    if (runAsGroup != null) {
      this.runAsGroup =
          new io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsBuilder(
              runAsGroup);
      _visitables.get("runAsGroup").add(this.runAsGroup);
    }
    return (A) this;
  }

  public java.lang.Boolean hasRunAsGroup() {
    return this.runAsGroup != null;
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsGroupNested<A>
      withNewRunAsGroup() {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .RunAsGroupNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsGroupNested<A>
      withNewRunAsGroupLike(
          io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .RunAsGroupNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsGroupNested<A>
      editRunAsGroup() {
    return withNewRunAsGroupLike(getRunAsGroup());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsGroupNested<A>
      editOrNewRunAsGroup() {
    return withNewRunAsGroupLike(
        getRunAsGroup() != null
            ? getRunAsGroup()
            : new io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsGroupNested<A>
      editOrNewRunAsGroupLike(
          io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions item) {
    return withNewRunAsGroupLike(getRunAsGroup() != null ? getRunAsGroup() : item);
  }

  /**
   * This method has been deprecated, please use method buildRunAsUser instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions getRunAsUser() {
    return this.runAsUser != null ? this.runAsUser.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions buildRunAsUser() {
    return this.runAsUser != null ? this.runAsUser.build() : null;
  }

  public A withRunAsUser(
      io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions runAsUser) {
    _visitables.get("runAsUser").remove(this.runAsUser);
    if (runAsUser != null) {
      this.runAsUser =
          new io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsBuilder(runAsUser);
      _visitables.get("runAsUser").add(this.runAsUser);
    }
    return (A) this;
  }

  public java.lang.Boolean hasRunAsUser() {
    return this.runAsUser != null;
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsUserNested<A>
      withNewRunAsUser() {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .RunAsUserNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsUserNested<A>
      withNewRunAsUserLike(
          io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .RunAsUserNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsUserNested<A>
      editRunAsUser() {
    return withNewRunAsUserLike(getRunAsUser());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsUserNested<A>
      editOrNewRunAsUser() {
    return withNewRunAsUserLike(
        getRunAsUser() != null
            ? getRunAsUser()
            : new io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsUserNested<A>
      editOrNewRunAsUserLike(
          io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions item) {
    return withNewRunAsUserLike(getRunAsUser() != null ? getRunAsUser() : item);
  }

  /**
   * This method has been deprecated, please use method buildRuntimeClass instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions getRuntimeClass() {
    return this.runtimeClass != null ? this.runtimeClass.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions
      buildRuntimeClass() {
    return this.runtimeClass != null ? this.runtimeClass.build() : null;
  }

  public A withRuntimeClass(
      io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions runtimeClass) {
    _visitables.get("runtimeClass").remove(this.runtimeClass);
    if (runtimeClass != null) {
      this.runtimeClass =
          new io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptionsBuilder(
              runtimeClass);
      _visitables.get("runtimeClass").add(this.runtimeClass);
    }
    return (A) this;
  }

  public java.lang.Boolean hasRuntimeClass() {
    return this.runtimeClass != null;
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RuntimeClassNested<
          A>
      withNewRuntimeClass() {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .RuntimeClassNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RuntimeClassNested<
          A>
      withNewRuntimeClassLike(
          io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .RuntimeClassNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RuntimeClassNested<
          A>
      editRuntimeClass() {
    return withNewRuntimeClassLike(getRuntimeClass());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RuntimeClassNested<
          A>
      editOrNewRuntimeClass() {
    return withNewRuntimeClassLike(
        getRuntimeClass() != null
            ? getRuntimeClass()
            : new io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptionsBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RuntimeClassNested<
          A>
      editOrNewRuntimeClassLike(
          io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions item) {
    return withNewRuntimeClassLike(getRuntimeClass() != null ? getRuntimeClass() : item);
  }

  /**
   * This method has been deprecated, please use method buildSeLinux instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions getSeLinux() {
    return this.seLinux != null ? this.seLinux.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions buildSeLinux() {
    return this.seLinux != null ? this.seLinux.build() : null;
  }

  public A withSeLinux(io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions seLinux) {
    _visitables.get("seLinux").remove(this.seLinux);
    if (seLinux != null) {
      this.seLinux =
          new io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsBuilder(seLinux);
      _visitables.get("seLinux").add(this.seLinux);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSeLinux() {
    return this.seLinux != null;
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SeLinuxNested<A>
      withNewSeLinux() {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .SeLinuxNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SeLinuxNested<A>
      withNewSeLinuxLike(io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .SeLinuxNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SeLinuxNested<A>
      editSeLinux() {
    return withNewSeLinuxLike(getSeLinux());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SeLinuxNested<A>
      editOrNewSeLinux() {
    return withNewSeLinuxLike(
        getSeLinux() != null
            ? getSeLinux()
            : new io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SeLinuxNested<A>
      editOrNewSeLinuxLike(io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions item) {
    return withNewSeLinuxLike(getSeLinux() != null ? getSeLinux() : item);
  }

  /**
   * This method has been deprecated, please use method buildSupplementalGroups instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions
      getSupplementalGroups() {
    return this.supplementalGroups != null ? this.supplementalGroups.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions
      buildSupplementalGroups() {
    return this.supplementalGroups != null ? this.supplementalGroups.build() : null;
  }

  public A withSupplementalGroups(
      io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions
          supplementalGroups) {
    _visitables.get("supplementalGroups").remove(this.supplementalGroups);
    if (supplementalGroups != null) {
      this.supplementalGroups =
          new io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsBuilder(
              supplementalGroups);
      _visitables.get("supplementalGroups").add(this.supplementalGroups);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSupplementalGroups() {
    return this.supplementalGroups != null;
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .SupplementalGroupsNested<
          A>
      withNewSupplementalGroups() {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .SupplementalGroupsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .SupplementalGroupsNested<
          A>
      withNewSupplementalGroupsLike(
          io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl
        .SupplementalGroupsNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .SupplementalGroupsNested<
          A>
      editSupplementalGroups() {
    return withNewSupplementalGroupsLike(getSupplementalGroups());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .SupplementalGroupsNested<
          A>
      editOrNewSupplementalGroups() {
    return withNewSupplementalGroupsLike(
        getSupplementalGroups() != null
            ? getSupplementalGroups()
            : new io.kubernetes.client.openapi.models
                    .V1beta1SupplementalGroupsStrategyOptionsBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
              .SupplementalGroupsNested<
          A>
      editOrNewSupplementalGroupsLike(
          io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions item) {
    return withNewSupplementalGroupsLike(
        getSupplementalGroups() != null ? getSupplementalGroups() : item);
  }

  public A addToVolumes(java.lang.Integer index, java.lang.String item) {
    if (this.volumes == null) {
      this.volumes = new java.util.ArrayList<java.lang.String>();
    }
    this.volumes.add(index, item);
    return (A) this;
  }

  public A setToVolumes(java.lang.Integer index, java.lang.String item) {
    if (this.volumes == null) {
      this.volumes = new java.util.ArrayList<java.lang.String>();
    }
    this.volumes.set(index, item);
    return (A) this;
  }

  public A addToVolumes(java.lang.String... items) {
    if (this.volumes == null) {
      this.volumes = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.volumes.add(item);
    }
    return (A) this;
  }

  public A addAllToVolumes(java.util.Collection<java.lang.String> items) {
    if (this.volumes == null) {
      this.volumes = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.volumes.add(item);
    }
    return (A) this;
  }

  public A removeFromVolumes(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.volumes != null) {
        this.volumes.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromVolumes(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.volumes != null) {
        this.volumes.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getVolumes() {
    return this.volumes;
  }

  public java.lang.String getVolume(java.lang.Integer index) {
    return this.volumes.get(index);
  }

  public java.lang.String getFirstVolume() {
    return this.volumes.get(0);
  }

  public java.lang.String getLastVolume() {
    return this.volumes.get(volumes.size() - 1);
  }

  public java.lang.String getMatchingVolume(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : volumes) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingVolume(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : volumes) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withVolumes(java.util.List<java.lang.String> volumes) {
    if (volumes != null) {
      this.volumes = new java.util.ArrayList();
      for (java.lang.String item : volumes) {
        this.addToVolumes(item);
      }
    } else {
      this.volumes = null;
    }
    return (A) this;
  }

  public A withVolumes(java.lang.String... volumes) {
    if (this.volumes != null) {
      this.volumes.clear();
    }
    if (volumes != null) {
      for (java.lang.String item : volumes) {
        this.addToVolumes(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasVolumes() {
    return volumes != null && !volumes.isEmpty();
  }

  public A addNewVolume(java.lang.String original) {
    return (A) addToVolumes(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1PodSecurityPolicySpecFluentImpl that = (V1beta1PodSecurityPolicySpecFluentImpl) o;
    if (allowPrivilegeEscalation != null
        ? !allowPrivilegeEscalation.equals(that.allowPrivilegeEscalation)
        : that.allowPrivilegeEscalation != null) return false;
    if (allowedCSIDrivers != null
        ? !allowedCSIDrivers.equals(that.allowedCSIDrivers)
        : that.allowedCSIDrivers != null) return false;
    if (allowedCapabilities != null
        ? !allowedCapabilities.equals(that.allowedCapabilities)
        : that.allowedCapabilities != null) return false;
    if (allowedFlexVolumes != null
        ? !allowedFlexVolumes.equals(that.allowedFlexVolumes)
        : that.allowedFlexVolumes != null) return false;
    if (allowedHostPaths != null
        ? !allowedHostPaths.equals(that.allowedHostPaths)
        : that.allowedHostPaths != null) return false;
    if (allowedProcMountTypes != null
        ? !allowedProcMountTypes.equals(that.allowedProcMountTypes)
        : that.allowedProcMountTypes != null) return false;
    if (allowedUnsafeSysctls != null
        ? !allowedUnsafeSysctls.equals(that.allowedUnsafeSysctls)
        : that.allowedUnsafeSysctls != null) return false;
    if (defaultAddCapabilities != null
        ? !defaultAddCapabilities.equals(that.defaultAddCapabilities)
        : that.defaultAddCapabilities != null) return false;
    if (defaultAllowPrivilegeEscalation != null
        ? !defaultAllowPrivilegeEscalation.equals(that.defaultAllowPrivilegeEscalation)
        : that.defaultAllowPrivilegeEscalation != null) return false;
    if (forbiddenSysctls != null
        ? !forbiddenSysctls.equals(that.forbiddenSysctls)
        : that.forbiddenSysctls != null) return false;
    if (fsGroup != null ? !fsGroup.equals(that.fsGroup) : that.fsGroup != null) return false;
    if (hostIPC != null ? !hostIPC.equals(that.hostIPC) : that.hostIPC != null) return false;
    if (hostNetwork != null ? !hostNetwork.equals(that.hostNetwork) : that.hostNetwork != null)
      return false;
    if (hostPID != null ? !hostPID.equals(that.hostPID) : that.hostPID != null) return false;
    if (hostPorts != null ? !hostPorts.equals(that.hostPorts) : that.hostPorts != null)
      return false;
    if (privileged != null ? !privileged.equals(that.privileged) : that.privileged != null)
      return false;
    if (readOnlyRootFilesystem != null
        ? !readOnlyRootFilesystem.equals(that.readOnlyRootFilesystem)
        : that.readOnlyRootFilesystem != null) return false;
    if (requiredDropCapabilities != null
        ? !requiredDropCapabilities.equals(that.requiredDropCapabilities)
        : that.requiredDropCapabilities != null) return false;
    if (runAsGroup != null ? !runAsGroup.equals(that.runAsGroup) : that.runAsGroup != null)
      return false;
    if (runAsUser != null ? !runAsUser.equals(that.runAsUser) : that.runAsUser != null)
      return false;
    if (runtimeClass != null ? !runtimeClass.equals(that.runtimeClass) : that.runtimeClass != null)
      return false;
    if (seLinux != null ? !seLinux.equals(that.seLinux) : that.seLinux != null) return false;
    if (supplementalGroups != null
        ? !supplementalGroups.equals(that.supplementalGroups)
        : that.supplementalGroups != null) return false;
    if (volumes != null ? !volumes.equals(that.volumes) : that.volumes != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        allowPrivilegeEscalation,
        allowedCSIDrivers,
        allowedCapabilities,
        allowedFlexVolumes,
        allowedHostPaths,
        allowedProcMountTypes,
        allowedUnsafeSysctls,
        defaultAddCapabilities,
        defaultAllowPrivilegeEscalation,
        forbiddenSysctls,
        fsGroup,
        hostIPC,
        hostNetwork,
        hostPID,
        hostPorts,
        privileged,
        readOnlyRootFilesystem,
        requiredDropCapabilities,
        runAsGroup,
        runAsUser,
        runtimeClass,
        seLinux,
        supplementalGroups,
        volumes,
        super.hashCode());
  }

  public class AllowedCSIDriversNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
                  .AllowedCSIDriversNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
                  .AllowedCSIDriversNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    AllowedCSIDriversNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder(this, item);
    }

    AllowedCSIDriversNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N)
          V1beta1PodSecurityPolicySpecFluentImpl.this.setToAllowedCSIDrivers(
              index, builder.build());
    }

    public N endAllowedCSIDriver() {
      return and();
    }
  }

  public class AllowedFlexVolumesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
                  .AllowedFlexVolumesNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
                  .AllowedFlexVolumesNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    AllowedFlexVolumesNestedImpl(
        java.lang.Integer index,
        io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder(this, item);
    }

    AllowedFlexVolumesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N)
          V1beta1PodSecurityPolicySpecFluentImpl.this.setToAllowedFlexVolumes(
              index, builder.build());
    }

    public N endAllowedFlexVolume() {
      return and();
    }
  }

  public class AllowedHostPathsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
                  .AllowedHostPathsNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
                  .AllowedHostPathsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    AllowedHostPathsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1AllowedHostPath item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder(this, item);
    }

    AllowedHostPathsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N)
          V1beta1PodSecurityPolicySpecFluentImpl.this.setToAllowedHostPaths(index, builder.build());
    }

    public N endAllowedHostPath() {
      return and();
    }
  }

  public class FsGroupNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptionsFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.FsGroupNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
                  .FsGroupNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    FsGroupNestedImpl(io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptions item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptionsBuilder(this, item);
    }

    FsGroupNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptionsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptionsBuilder builder;

    public N and() {
      return (N) V1beta1PodSecurityPolicySpecFluentImpl.this.withFsGroup(builder.build());
    }

    public N endFsGroup() {
      return and();
    }
  }

  public class HostPortsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta1HostPortRangeFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.HostPortsNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
                  .HostPortsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    HostPortsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1HostPortRange item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder(this, item);
    }

    HostPortsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1beta1PodSecurityPolicySpecFluentImpl.this.setToHostPorts(index, builder.build());
    }

    public N endHostPort() {
      return and();
    }
  }

  public class RunAsGroupNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsGroupNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
                  .RunAsGroupNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    RunAsGroupNestedImpl(
        io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsBuilder(
              this, item);
    }

    RunAsGroupNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsBuilder builder;

    public N and() {
      return (N) V1beta1PodSecurityPolicySpecFluentImpl.this.withRunAsGroup(builder.build());
    }

    public N endRunAsGroup() {
      return and();
    }
  }

  public class RunAsUserNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsUserNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
                  .RunAsUserNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    RunAsUserNestedImpl(io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsBuilder(
              this, item);
    }

    RunAsUserNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsBuilder builder;

    public N and() {
      return (N) V1beta1PodSecurityPolicySpecFluentImpl.this.withRunAsUser(builder.build());
    }

    public N endRunAsUser() {
      return and();
    }
  }

  public class RuntimeClassNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptionsFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RuntimeClassNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
                  .RuntimeClassNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    RuntimeClassNestedImpl(
        io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptionsBuilder(
              this, item);
    }

    RuntimeClassNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptionsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptionsBuilder builder;

    public N and() {
      return (N) V1beta1PodSecurityPolicySpecFluentImpl.this.withRuntimeClass(builder.build());
    }

    public N endRuntimeClass() {
      return and();
    }
  }

  public class SeLinuxNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SeLinuxNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
                  .SeLinuxNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    SeLinuxNestedImpl(io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsBuilder(this, item);
    }

    SeLinuxNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsBuilder builder;

    public N and() {
      return (N) V1beta1PodSecurityPolicySpecFluentImpl.this.withSeLinux(builder.build());
    }

    public N endSeLinux() {
      return and();
    }
  }

  public class SupplementalGroupsNestedImpl<N>
      extends io.kubernetes.client.openapi.models
              .V1beta1SupplementalGroupsStrategyOptionsFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
                  .SupplementalGroupsNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent
                  .SupplementalGroupsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    SupplementalGroupsNestedImpl(
        io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsBuilder(
              this, item);
    }

    SupplementalGroupsNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsBuilder(
              this);
    }

    io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsBuilder builder;

    public N and() {
      return (N)
          V1beta1PodSecurityPolicySpecFluentImpl.this.withSupplementalGroups(builder.build());
    }

    public N endSupplementalGroups() {
      return and();
    }
  }
}
