package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SecurityContextFluent<A extends V1SecurityContextFluent<A>> extends BaseFluent<A>{
  public V1SecurityContextFluent() {
  }
  
  public V1SecurityContextFluent(V1SecurityContext instance) {
    this.copyInstance(instance);
  }
  private Boolean allowPrivilegeEscalation;
  private V1AppArmorProfileBuilder appArmorProfile;
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
  
  protected void copyInstance(V1SecurityContext instance) {
    instance = (instance != null ? instance : new V1SecurityContext());
    if (instance != null) {
          this.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation());
          this.withAppArmorProfile(instance.getAppArmorProfile());
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
  }
  
  public Boolean getAllowPrivilegeEscalation() {
    return this.allowPrivilegeEscalation;
  }
  
  public A withAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    return (A) this;
  }
  
  public boolean hasAllowPrivilegeEscalation() {
    return this.allowPrivilegeEscalation != null;
  }
  
  public V1AppArmorProfile buildAppArmorProfile() {
    return this.appArmorProfile != null ? this.appArmorProfile.build() : null;
  }
  
  public A withAppArmorProfile(V1AppArmorProfile appArmorProfile) {
    this._visitables.remove("appArmorProfile");
    if (appArmorProfile != null) {
        this.appArmorProfile = new V1AppArmorProfileBuilder(appArmorProfile);
        this._visitables.get("appArmorProfile").add(this.appArmorProfile);
    } else {
        this.appArmorProfile = null;
        this._visitables.get("appArmorProfile").remove(this.appArmorProfile);
    }
    return (A) this;
  }
  
  public boolean hasAppArmorProfile() {
    return this.appArmorProfile != null;
  }
  
  public AppArmorProfileNested<A> withNewAppArmorProfile() {
    return new AppArmorProfileNested(null);
  }
  
  public AppArmorProfileNested<A> withNewAppArmorProfileLike(V1AppArmorProfile item) {
    return new AppArmorProfileNested(item);
  }
  
  public AppArmorProfileNested<A> editAppArmorProfile() {
    return withNewAppArmorProfileLike(java.util.Optional.ofNullable(buildAppArmorProfile()).orElse(null));
  }
  
  public AppArmorProfileNested<A> editOrNewAppArmorProfile() {
    return withNewAppArmorProfileLike(java.util.Optional.ofNullable(buildAppArmorProfile()).orElse(new V1AppArmorProfileBuilder().build()));
  }
  
  public AppArmorProfileNested<A> editOrNewAppArmorProfileLike(V1AppArmorProfile item) {
    return withNewAppArmorProfileLike(java.util.Optional.ofNullable(buildAppArmorProfile()).orElse(item));
  }
  
  public V1Capabilities buildCapabilities() {
    return this.capabilities != null ? this.capabilities.build() : null;
  }
  
  public A withCapabilities(V1Capabilities capabilities) {
    this._visitables.remove("capabilities");
    if (capabilities != null) {
        this.capabilities = new V1CapabilitiesBuilder(capabilities);
        this._visitables.get("capabilities").add(this.capabilities);
    } else {
        this.capabilities = null;
        this._visitables.get("capabilities").remove(this.capabilities);
    }
    return (A) this;
  }
  
  public boolean hasCapabilities() {
    return this.capabilities != null;
  }
  
  public CapabilitiesNested<A> withNewCapabilities() {
    return new CapabilitiesNested(null);
  }
  
  public CapabilitiesNested<A> withNewCapabilitiesLike(V1Capabilities item) {
    return new CapabilitiesNested(item);
  }
  
  public CapabilitiesNested<A> editCapabilities() {
    return withNewCapabilitiesLike(java.util.Optional.ofNullable(buildCapabilities()).orElse(null));
  }
  
  public CapabilitiesNested<A> editOrNewCapabilities() {
    return withNewCapabilitiesLike(java.util.Optional.ofNullable(buildCapabilities()).orElse(new V1CapabilitiesBuilder().build()));
  }
  
  public CapabilitiesNested<A> editOrNewCapabilitiesLike(V1Capabilities item) {
    return withNewCapabilitiesLike(java.util.Optional.ofNullable(buildCapabilities()).orElse(item));
  }
  
  public Boolean getPrivileged() {
    return this.privileged;
  }
  
  public A withPrivileged(Boolean privileged) {
    this.privileged = privileged;
    return (A) this;
  }
  
  public boolean hasPrivileged() {
    return this.privileged != null;
  }
  
  public String getProcMount() {
    return this.procMount;
  }
  
  public A withProcMount(String procMount) {
    this.procMount = procMount;
    return (A) this;
  }
  
  public boolean hasProcMount() {
    return this.procMount != null;
  }
  
  public Boolean getReadOnlyRootFilesystem() {
    return this.readOnlyRootFilesystem;
  }
  
  public A withReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    return (A) this;
  }
  
  public boolean hasReadOnlyRootFilesystem() {
    return this.readOnlyRootFilesystem != null;
  }
  
  public Long getRunAsGroup() {
    return this.runAsGroup;
  }
  
  public A withRunAsGroup(Long runAsGroup) {
    this.runAsGroup = runAsGroup;
    return (A) this;
  }
  
  public boolean hasRunAsGroup() {
    return this.runAsGroup != null;
  }
  
  public Boolean getRunAsNonRoot() {
    return this.runAsNonRoot;
  }
  
  public A withRunAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
    return (A) this;
  }
  
  public boolean hasRunAsNonRoot() {
    return this.runAsNonRoot != null;
  }
  
  public Long getRunAsUser() {
    return this.runAsUser;
  }
  
  public A withRunAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
    return (A) this;
  }
  
  public boolean hasRunAsUser() {
    return this.runAsUser != null;
  }
  
  public V1SELinuxOptions buildSeLinuxOptions() {
    return this.seLinuxOptions != null ? this.seLinuxOptions.build() : null;
  }
  
  public A withSeLinuxOptions(V1SELinuxOptions seLinuxOptions) {
    this._visitables.remove("seLinuxOptions");
    if (seLinuxOptions != null) {
        this.seLinuxOptions = new V1SELinuxOptionsBuilder(seLinuxOptions);
        this._visitables.get("seLinuxOptions").add(this.seLinuxOptions);
    } else {
        this.seLinuxOptions = null;
        this._visitables.get("seLinuxOptions").remove(this.seLinuxOptions);
    }
    return (A) this;
  }
  
  public boolean hasSeLinuxOptions() {
    return this.seLinuxOptions != null;
  }
  
  public SeLinuxOptionsNested<A> withNewSeLinuxOptions() {
    return new SeLinuxOptionsNested(null);
  }
  
  public SeLinuxOptionsNested<A> withNewSeLinuxOptionsLike(V1SELinuxOptions item) {
    return new SeLinuxOptionsNested(item);
  }
  
  public SeLinuxOptionsNested<A> editSeLinuxOptions() {
    return withNewSeLinuxOptionsLike(java.util.Optional.ofNullable(buildSeLinuxOptions()).orElse(null));
  }
  
  public SeLinuxOptionsNested<A> editOrNewSeLinuxOptions() {
    return withNewSeLinuxOptionsLike(java.util.Optional.ofNullable(buildSeLinuxOptions()).orElse(new V1SELinuxOptionsBuilder().build()));
  }
  
  public SeLinuxOptionsNested<A> editOrNewSeLinuxOptionsLike(V1SELinuxOptions item) {
    return withNewSeLinuxOptionsLike(java.util.Optional.ofNullable(buildSeLinuxOptions()).orElse(item));
  }
  
  public V1SeccompProfile buildSeccompProfile() {
    return this.seccompProfile != null ? this.seccompProfile.build() : null;
  }
  
  public A withSeccompProfile(V1SeccompProfile seccompProfile) {
    this._visitables.remove("seccompProfile");
    if (seccompProfile != null) {
        this.seccompProfile = new V1SeccompProfileBuilder(seccompProfile);
        this._visitables.get("seccompProfile").add(this.seccompProfile);
    } else {
        this.seccompProfile = null;
        this._visitables.get("seccompProfile").remove(this.seccompProfile);
    }
    return (A) this;
  }
  
  public boolean hasSeccompProfile() {
    return this.seccompProfile != null;
  }
  
  public SeccompProfileNested<A> withNewSeccompProfile() {
    return new SeccompProfileNested(null);
  }
  
  public SeccompProfileNested<A> withNewSeccompProfileLike(V1SeccompProfile item) {
    return new SeccompProfileNested(item);
  }
  
  public SeccompProfileNested<A> editSeccompProfile() {
    return withNewSeccompProfileLike(java.util.Optional.ofNullable(buildSeccompProfile()).orElse(null));
  }
  
  public SeccompProfileNested<A> editOrNewSeccompProfile() {
    return withNewSeccompProfileLike(java.util.Optional.ofNullable(buildSeccompProfile()).orElse(new V1SeccompProfileBuilder().build()));
  }
  
  public SeccompProfileNested<A> editOrNewSeccompProfileLike(V1SeccompProfile item) {
    return withNewSeccompProfileLike(java.util.Optional.ofNullable(buildSeccompProfile()).orElse(item));
  }
  
  public V1WindowsSecurityContextOptions buildWindowsOptions() {
    return this.windowsOptions != null ? this.windowsOptions.build() : null;
  }
  
  public A withWindowsOptions(V1WindowsSecurityContextOptions windowsOptions) {
    this._visitables.remove("windowsOptions");
    if (windowsOptions != null) {
        this.windowsOptions = new V1WindowsSecurityContextOptionsBuilder(windowsOptions);
        this._visitables.get("windowsOptions").add(this.windowsOptions);
    } else {
        this.windowsOptions = null;
        this._visitables.get("windowsOptions").remove(this.windowsOptions);
    }
    return (A) this;
  }
  
  public boolean hasWindowsOptions() {
    return this.windowsOptions != null;
  }
  
  public WindowsOptionsNested<A> withNewWindowsOptions() {
    return new WindowsOptionsNested(null);
  }
  
  public WindowsOptionsNested<A> withNewWindowsOptionsLike(V1WindowsSecurityContextOptions item) {
    return new WindowsOptionsNested(item);
  }
  
  public WindowsOptionsNested<A> editWindowsOptions() {
    return withNewWindowsOptionsLike(java.util.Optional.ofNullable(buildWindowsOptions()).orElse(null));
  }
  
  public WindowsOptionsNested<A> editOrNewWindowsOptions() {
    return withNewWindowsOptionsLike(java.util.Optional.ofNullable(buildWindowsOptions()).orElse(new V1WindowsSecurityContextOptionsBuilder().build()));
  }
  
  public WindowsOptionsNested<A> editOrNewWindowsOptionsLike(V1WindowsSecurityContextOptions item) {
    return withNewWindowsOptionsLike(java.util.Optional.ofNullable(buildWindowsOptions()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SecurityContextFluent that = (V1SecurityContextFluent) o;
    if (!java.util.Objects.equals(allowPrivilegeEscalation, that.allowPrivilegeEscalation)) return false;
    if (!java.util.Objects.equals(appArmorProfile, that.appArmorProfile)) return false;
    if (!java.util.Objects.equals(capabilities, that.capabilities)) return false;
    if (!java.util.Objects.equals(privileged, that.privileged)) return false;
    if (!java.util.Objects.equals(procMount, that.procMount)) return false;
    if (!java.util.Objects.equals(readOnlyRootFilesystem, that.readOnlyRootFilesystem)) return false;
    if (!java.util.Objects.equals(runAsGroup, that.runAsGroup)) return false;
    if (!java.util.Objects.equals(runAsNonRoot, that.runAsNonRoot)) return false;
    if (!java.util.Objects.equals(runAsUser, that.runAsUser)) return false;
    if (!java.util.Objects.equals(seLinuxOptions, that.seLinuxOptions)) return false;
    if (!java.util.Objects.equals(seccompProfile, that.seccompProfile)) return false;
    if (!java.util.Objects.equals(windowsOptions, that.windowsOptions)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(allowPrivilegeEscalation,  appArmorProfile,  capabilities,  privileged,  procMount,  readOnlyRootFilesystem,  runAsGroup,  runAsNonRoot,  runAsUser,  seLinuxOptions,  seccompProfile,  windowsOptions,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (allowPrivilegeEscalation != null) { sb.append("allowPrivilegeEscalation:"); sb.append(allowPrivilegeEscalation + ","); }
    if (appArmorProfile != null) { sb.append("appArmorProfile:"); sb.append(appArmorProfile + ","); }
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
  public class AppArmorProfileNested<N> extends V1AppArmorProfileFluent<AppArmorProfileNested<N>> implements Nested<N>{
    AppArmorProfileNested(V1AppArmorProfile item) {
      this.builder = new V1AppArmorProfileBuilder(this, item);
    }
    V1AppArmorProfileBuilder builder;
    
    public N and() {
      return (N) V1SecurityContextFluent.this.withAppArmorProfile(builder.build());
    }
    
    public N endAppArmorProfile() {
      return and();
    }
    
  
  }
  public class CapabilitiesNested<N> extends V1CapabilitiesFluent<CapabilitiesNested<N>> implements Nested<N>{
    CapabilitiesNested(V1Capabilities item) {
      this.builder = new V1CapabilitiesBuilder(this, item);
    }
    V1CapabilitiesBuilder builder;
    
    public N and() {
      return (N) V1SecurityContextFluent.this.withCapabilities(builder.build());
    }
    
    public N endCapabilities() {
      return and();
    }
    
  
  }
  public class SeLinuxOptionsNested<N> extends V1SELinuxOptionsFluent<SeLinuxOptionsNested<N>> implements Nested<N>{
    SeLinuxOptionsNested(V1SELinuxOptions item) {
      this.builder = new V1SELinuxOptionsBuilder(this, item);
    }
    V1SELinuxOptionsBuilder builder;
    
    public N and() {
      return (N) V1SecurityContextFluent.this.withSeLinuxOptions(builder.build());
    }
    
    public N endSeLinuxOptions() {
      return and();
    }
    
  
  }
  public class SeccompProfileNested<N> extends V1SeccompProfileFluent<SeccompProfileNested<N>> implements Nested<N>{
    SeccompProfileNested(V1SeccompProfile item) {
      this.builder = new V1SeccompProfileBuilder(this, item);
    }
    V1SeccompProfileBuilder builder;
    
    public N and() {
      return (N) V1SecurityContextFluent.this.withSeccompProfile(builder.build());
    }
    
    public N endSeccompProfile() {
      return and();
    }
    
  
  }
  public class WindowsOptionsNested<N> extends V1WindowsSecurityContextOptionsFluent<WindowsOptionsNested<N>> implements Nested<N>{
    WindowsOptionsNested(V1WindowsSecurityContextOptions item) {
      this.builder = new V1WindowsSecurityContextOptionsBuilder(this, item);
    }
    V1WindowsSecurityContextOptionsBuilder builder;
    
    public N and() {
      return (N) V1SecurityContextFluent.this.withWindowsOptions(builder.build());
    }
    
    public N endWindowsOptions() {
      return and();
    }
    
  
  }

}