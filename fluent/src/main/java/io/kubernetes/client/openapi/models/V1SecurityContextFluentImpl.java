package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1SecurityContextFluentImpl<A extends V1SecurityContextFluent<A>> extends BaseFluent<A> implements V1SecurityContextFluent<A>{
  public V1SecurityContextFluentImpl() {
  }
  public V1SecurityContextFluentImpl(V1SecurityContext instance) {
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
  private Boolean allowPrivilegeEscalation;
  private V1CapabilitiesBuilder capabilities;
  private Boolean privileged;
  private String procMount;
  private Boolean readOnlyRootFilesystem;
  private Long runAsGroup;
  private Boolean runAsNonRoot;
  private Long runAsUser;
  private V1SELinuxOptionsBuilder seLinuxOptions;
  private V1SeccompProfileBuilder seccompProfile;
  private V1WindowsSecurityContextOptionsBuilder windowsOptions;
  public Boolean getAllowPrivilegeEscalation() {
    return this.allowPrivilegeEscalation;
  }
  public A withAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation=allowPrivilegeEscalation; return (A) this;
  }
  public Boolean hasAllowPrivilegeEscalation() {
    return this.allowPrivilegeEscalation != null;
  }
  
  /**
   * This method has been deprecated, please use method buildCapabilities instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1Capabilities getCapabilities() {
    return this.capabilities!=null ?this.capabilities.build():null;
  }
  public V1Capabilities buildCapabilities() {
    return this.capabilities!=null ?this.capabilities.build():null;
  }
  public A withCapabilities(V1Capabilities capabilities) {
    _visitables.get("capabilities").remove(this.capabilities);
    if (capabilities!=null){ this.capabilities= new V1CapabilitiesBuilder(capabilities); _visitables.get("capabilities").add(this.capabilities);} else { this.capabilities = null; _visitables.get("capabilities").remove(this.capabilities); } return (A) this;
  }
  public Boolean hasCapabilities() {
    return this.capabilities != null;
  }
  public V1SecurityContextFluent.CapabilitiesNested<A> withNewCapabilities() {
    return new V1SecurityContextFluentImpl.CapabilitiesNestedImpl();
  }
  public V1SecurityContextFluent.CapabilitiesNested<A> withNewCapabilitiesLike(V1Capabilities item) {
    return new V1SecurityContextFluentImpl.CapabilitiesNestedImpl(item);
  }
  public V1SecurityContextFluent.CapabilitiesNested<A> editCapabilities() {
    return withNewCapabilitiesLike(getCapabilities());
  }
  public V1SecurityContextFluent.CapabilitiesNested<A> editOrNewCapabilities() {
    return withNewCapabilitiesLike(getCapabilities() != null ? getCapabilities(): new V1CapabilitiesBuilder().build());
  }
  public V1SecurityContextFluent.CapabilitiesNested<A> editOrNewCapabilitiesLike(V1Capabilities item) {
    return withNewCapabilitiesLike(getCapabilities() != null ? getCapabilities(): item);
  }
  public Boolean getPrivileged() {
    return this.privileged;
  }
  public A withPrivileged(Boolean privileged) {
    this.privileged=privileged; return (A) this;
  }
  public Boolean hasPrivileged() {
    return this.privileged != null;
  }
  public String getProcMount() {
    return this.procMount;
  }
  public A withProcMount(String procMount) {
    this.procMount=procMount; return (A) this;
  }
  public Boolean hasProcMount() {
    return this.procMount != null;
  }
  public Boolean getReadOnlyRootFilesystem() {
    return this.readOnlyRootFilesystem;
  }
  public A withReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem=readOnlyRootFilesystem; return (A) this;
  }
  public Boolean hasReadOnlyRootFilesystem() {
    return this.readOnlyRootFilesystem != null;
  }
  public Long getRunAsGroup() {
    return this.runAsGroup;
  }
  public A withRunAsGroup(Long runAsGroup) {
    this.runAsGroup=runAsGroup; return (A) this;
  }
  public Boolean hasRunAsGroup() {
    return this.runAsGroup != null;
  }
  public Boolean getRunAsNonRoot() {
    return this.runAsNonRoot;
  }
  public A withRunAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot=runAsNonRoot; return (A) this;
  }
  public Boolean hasRunAsNonRoot() {
    return this.runAsNonRoot != null;
  }
  public Long getRunAsUser() {
    return this.runAsUser;
  }
  public A withRunAsUser(Long runAsUser) {
    this.runAsUser=runAsUser; return (A) this;
  }
  public Boolean hasRunAsUser() {
    return this.runAsUser != null;
  }
  
  /**
   * This method has been deprecated, please use method buildSeLinuxOptions instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SELinuxOptions getSeLinuxOptions() {
    return this.seLinuxOptions!=null ?this.seLinuxOptions.build():null;
  }
  public V1SELinuxOptions buildSeLinuxOptions() {
    return this.seLinuxOptions!=null ?this.seLinuxOptions.build():null;
  }
  public A withSeLinuxOptions(V1SELinuxOptions seLinuxOptions) {
    _visitables.get("seLinuxOptions").remove(this.seLinuxOptions);
    if (seLinuxOptions!=null){ this.seLinuxOptions= new V1SELinuxOptionsBuilder(seLinuxOptions); _visitables.get("seLinuxOptions").add(this.seLinuxOptions);} else { this.seLinuxOptions = null; _visitables.get("seLinuxOptions").remove(this.seLinuxOptions); } return (A) this;
  }
  public Boolean hasSeLinuxOptions() {
    return this.seLinuxOptions != null;
  }
  public V1SecurityContextFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptions() {
    return new V1SecurityContextFluentImpl.SeLinuxOptionsNestedImpl();
  }
  public V1SecurityContextFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptionsLike(V1SELinuxOptions item) {
    return new V1SecurityContextFluentImpl.SeLinuxOptionsNestedImpl(item);
  }
  public V1SecurityContextFluent.SeLinuxOptionsNested<A> editSeLinuxOptions() {
    return withNewSeLinuxOptionsLike(getSeLinuxOptions());
  }
  public V1SecurityContextFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptions() {
    return withNewSeLinuxOptionsLike(getSeLinuxOptions() != null ? getSeLinuxOptions(): new V1SELinuxOptionsBuilder().build());
  }
  public V1SecurityContextFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptionsLike(V1SELinuxOptions item) {
    return withNewSeLinuxOptionsLike(getSeLinuxOptions() != null ? getSeLinuxOptions(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSeccompProfile instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SeccompProfile getSeccompProfile() {
    return this.seccompProfile!=null ?this.seccompProfile.build():null;
  }
  public V1SeccompProfile buildSeccompProfile() {
    return this.seccompProfile!=null ?this.seccompProfile.build():null;
  }
  public A withSeccompProfile(V1SeccompProfile seccompProfile) {
    _visitables.get("seccompProfile").remove(this.seccompProfile);
    if (seccompProfile!=null){ this.seccompProfile= new V1SeccompProfileBuilder(seccompProfile); _visitables.get("seccompProfile").add(this.seccompProfile);} else { this.seccompProfile = null; _visitables.get("seccompProfile").remove(this.seccompProfile); } return (A) this;
  }
  public Boolean hasSeccompProfile() {
    return this.seccompProfile != null;
  }
  public V1SecurityContextFluent.SeccompProfileNested<A> withNewSeccompProfile() {
    return new V1SecurityContextFluentImpl.SeccompProfileNestedImpl();
  }
  public V1SecurityContextFluent.SeccompProfileNested<A> withNewSeccompProfileLike(V1SeccompProfile item) {
    return new V1SecurityContextFluentImpl.SeccompProfileNestedImpl(item);
  }
  public V1SecurityContextFluent.SeccompProfileNested<A> editSeccompProfile() {
    return withNewSeccompProfileLike(getSeccompProfile());
  }
  public V1SecurityContextFluent.SeccompProfileNested<A> editOrNewSeccompProfile() {
    return withNewSeccompProfileLike(getSeccompProfile() != null ? getSeccompProfile(): new V1SeccompProfileBuilder().build());
  }
  public V1SecurityContextFluent.SeccompProfileNested<A> editOrNewSeccompProfileLike(V1SeccompProfile item) {
    return withNewSeccompProfileLike(getSeccompProfile() != null ? getSeccompProfile(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildWindowsOptions instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1WindowsSecurityContextOptions getWindowsOptions() {
    return this.windowsOptions!=null ?this.windowsOptions.build():null;
  }
  public V1WindowsSecurityContextOptions buildWindowsOptions() {
    return this.windowsOptions!=null ?this.windowsOptions.build():null;
  }
  public A withWindowsOptions(V1WindowsSecurityContextOptions windowsOptions) {
    _visitables.get("windowsOptions").remove(this.windowsOptions);
    if (windowsOptions!=null){ this.windowsOptions= new V1WindowsSecurityContextOptionsBuilder(windowsOptions); _visitables.get("windowsOptions").add(this.windowsOptions);} else { this.windowsOptions = null; _visitables.get("windowsOptions").remove(this.windowsOptions); } return (A) this;
  }
  public Boolean hasWindowsOptions() {
    return this.windowsOptions != null;
  }
  public V1SecurityContextFluent.WindowsOptionsNested<A> withNewWindowsOptions() {
    return new V1SecurityContextFluentImpl.WindowsOptionsNestedImpl();
  }
  public V1SecurityContextFluent.WindowsOptionsNested<A> withNewWindowsOptionsLike(V1WindowsSecurityContextOptions item) {
    return new V1SecurityContextFluentImpl.WindowsOptionsNestedImpl(item);
  }
  public V1SecurityContextFluent.WindowsOptionsNested<A> editWindowsOptions() {
    return withNewWindowsOptionsLike(getWindowsOptions());
  }
  public V1SecurityContextFluent.WindowsOptionsNested<A> editOrNewWindowsOptions() {
    return withNewWindowsOptionsLike(getWindowsOptions() != null ? getWindowsOptions(): new V1WindowsSecurityContextOptionsBuilder().build());
  }
  public V1SecurityContextFluent.WindowsOptionsNested<A> editOrNewWindowsOptionsLike(V1WindowsSecurityContextOptions item) {
    return withNewWindowsOptionsLike(getWindowsOptions() != null ? getWindowsOptions(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SecurityContextFluentImpl that = (V1SecurityContextFluentImpl) o;
    if (allowPrivilegeEscalation != null ? !allowPrivilegeEscalation.equals(that.allowPrivilegeEscalation) :that.allowPrivilegeEscalation != null) return false;
    if (capabilities != null ? !capabilities.equals(that.capabilities) :that.capabilities != null) return false;
    if (privileged != null ? !privileged.equals(that.privileged) :that.privileged != null) return false;
    if (procMount != null ? !procMount.equals(that.procMount) :that.procMount != null) return false;
    if (readOnlyRootFilesystem != null ? !readOnlyRootFilesystem.equals(that.readOnlyRootFilesystem) :that.readOnlyRootFilesystem != null) return false;
    if (runAsGroup != null ? !runAsGroup.equals(that.runAsGroup) :that.runAsGroup != null) return false;
    if (runAsNonRoot != null ? !runAsNonRoot.equals(that.runAsNonRoot) :that.runAsNonRoot != null) return false;
    if (runAsUser != null ? !runAsUser.equals(that.runAsUser) :that.runAsUser != null) return false;
    if (seLinuxOptions != null ? !seLinuxOptions.equals(that.seLinuxOptions) :that.seLinuxOptions != null) return false;
    if (seccompProfile != null ? !seccompProfile.equals(that.seccompProfile) :that.seccompProfile != null) return false;
    if (windowsOptions != null ? !windowsOptions.equals(that.windowsOptions) :that.windowsOptions != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(allowPrivilegeEscalation,  capabilities,  privileged,  procMount,  readOnlyRootFilesystem,  runAsGroup,  runAsNonRoot,  runAsUser,  seLinuxOptions,  seccompProfile,  windowsOptions,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (allowPrivilegeEscalation != null) { sb.append("allowPrivilegeEscalation:"); sb.append(allowPrivilegeEscalation + ","); }
    if (capabilities != null) { sb.append("capabilities:"); sb.append(capabilities + ","); }
    if (privileged != null) { sb.append("privileged:"); sb.append(privileged + ","); }
    if (procMount != null) { sb.append("procMount:"); sb.append(procMount + ","); }
    if (readOnlyRootFilesystem != null) { sb.append("readOnlyRootFilesystem:"); sb.append(readOnlyRootFilesystem + ","); }
    if (runAsGroup != null) { sb.append("runAsGroup:"); sb.append(runAsGroup + ","); }
    if (runAsNonRoot != null) { sb.append("runAsNonRoot:"); sb.append(runAsNonRoot + ","); }
    if (runAsUser != null) { sb.append("runAsUser:"); sb.append(runAsUser + ","); }
    if (seLinuxOptions != null) { sb.append("seLinuxOptions:"); sb.append(seLinuxOptions + ","); }
    if (seccompProfile != null) { sb.append("seccompProfile:"); sb.append(seccompProfile + ","); }
    if (windowsOptions != null) { sb.append("windowsOptions:"); sb.append(windowsOptions); }
    sb.append("}");
    return sb.toString();
  }
  public A withAllowPrivilegeEscalation() {
    return withAllowPrivilegeEscalation(true);
  }
  public A withPrivileged() {
    return withPrivileged(true);
  }
  public A withReadOnlyRootFilesystem() {
    return withReadOnlyRootFilesystem(true);
  }
  public A withRunAsNonRoot() {
    return withRunAsNonRoot(true);
  }
  class CapabilitiesNestedImpl<N> extends V1CapabilitiesFluentImpl<V1SecurityContextFluent.CapabilitiesNested<N>> implements V1SecurityContextFluent.CapabilitiesNested<N>,Nested<N>{
    CapabilitiesNestedImpl(V1Capabilities item) {
      this.builder = new V1CapabilitiesBuilder(this, item);
    }
    CapabilitiesNestedImpl() {
      this.builder = new V1CapabilitiesBuilder(this);
    }
    V1CapabilitiesBuilder builder;
    public N and() {
      return (N) V1SecurityContextFluentImpl.this.withCapabilities(builder.build());
    }
    public N endCapabilities() {
      return and();
    }
    
  }
  class SeLinuxOptionsNestedImpl<N> extends V1SELinuxOptionsFluentImpl<V1SecurityContextFluent.SeLinuxOptionsNested<N>> implements V1SecurityContextFluent.SeLinuxOptionsNested<N>,Nested<N>{
    SeLinuxOptionsNestedImpl(V1SELinuxOptions item) {
      this.builder = new V1SELinuxOptionsBuilder(this, item);
    }
    SeLinuxOptionsNestedImpl() {
      this.builder = new V1SELinuxOptionsBuilder(this);
    }
    V1SELinuxOptionsBuilder builder;
    public N and() {
      return (N) V1SecurityContextFluentImpl.this.withSeLinuxOptions(builder.build());
    }
    public N endSeLinuxOptions() {
      return and();
    }
    
  }
  class SeccompProfileNestedImpl<N> extends V1SeccompProfileFluentImpl<V1SecurityContextFluent.SeccompProfileNested<N>> implements V1SecurityContextFluent.SeccompProfileNested<N>,Nested<N>{
    SeccompProfileNestedImpl(V1SeccompProfile item) {
      this.builder = new V1SeccompProfileBuilder(this, item);
    }
    SeccompProfileNestedImpl() {
      this.builder = new V1SeccompProfileBuilder(this);
    }
    V1SeccompProfileBuilder builder;
    public N and() {
      return (N) V1SecurityContextFluentImpl.this.withSeccompProfile(builder.build());
    }
    public N endSeccompProfile() {
      return and();
    }
    
  }
  class WindowsOptionsNestedImpl<N> extends V1WindowsSecurityContextOptionsFluentImpl<V1SecurityContextFluent.WindowsOptionsNested<N>> implements V1SecurityContextFluent.WindowsOptionsNested<N>,Nested<N>{
    WindowsOptionsNestedImpl(V1WindowsSecurityContextOptions item) {
      this.builder = new V1WindowsSecurityContextOptionsBuilder(this, item);
    }
    WindowsOptionsNestedImpl() {
      this.builder = new V1WindowsSecurityContextOptionsBuilder(this);
    }
    V1WindowsSecurityContextOptionsBuilder builder;
    public N and() {
      return (N) V1SecurityContextFluentImpl.this.withWindowsOptions(builder.build());
    }
    public N endWindowsOptions() {
      return and();
    }
    
  }
  
}