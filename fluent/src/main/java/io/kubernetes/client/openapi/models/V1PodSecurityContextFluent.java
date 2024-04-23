package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PodSecurityContextFluent<A extends V1PodSecurityContextFluent<A>> extends BaseFluent<A>{
  public V1PodSecurityContextFluent() {
  }
  
  public V1PodSecurityContextFluent(V1PodSecurityContext instance) {
    this.copyInstance(instance);
  }
  private V1AppArmorProfileBuilder appArmorProfile;
  private Long fsGroup;
  private String fsGroupChangePolicy;
  private Long runAsGroup;
  private Boolean runAsNonRoot;
  private Long runAsUser;
  private V1SELinuxOptionsBuilder seLinuxOptions;
  private V1SeccompProfileBuilder seccompProfile;
  private List<Long> supplementalGroups;
  private ArrayList<V1SysctlBuilder> sysctls;
  private V1WindowsSecurityContextOptionsBuilder windowsOptions;
  
  protected void copyInstance(V1PodSecurityContext instance) {
    instance = (instance != null ? instance : new V1PodSecurityContext());
    if (instance != null) {
          this.withAppArmorProfile(instance.getAppArmorProfile());
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
  
  public Long getFsGroup() {
    return this.fsGroup;
  }
  
  public A withFsGroup(Long fsGroup) {
    this.fsGroup = fsGroup;
    return (A) this;
  }
  
  public boolean hasFsGroup() {
    return this.fsGroup != null;
  }
  
  public String getFsGroupChangePolicy() {
    return this.fsGroupChangePolicy;
  }
  
  public A withFsGroupChangePolicy(String fsGroupChangePolicy) {
    this.fsGroupChangePolicy = fsGroupChangePolicy;
    return (A) this;
  }
  
  public boolean hasFsGroupChangePolicy() {
    return this.fsGroupChangePolicy != null;
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
  
  public A addToSupplementalGroups(int index,Long item) {
    if (this.supplementalGroups == null) {this.supplementalGroups = new ArrayList<Long>();}
    this.supplementalGroups.add(index, item);
    return (A)this;
  }
  
  public A setToSupplementalGroups(int index,Long item) {
    if (this.supplementalGroups == null) {this.supplementalGroups = new ArrayList<Long>();}
    this.supplementalGroups.set(index, item); return (A)this;
  }
  
  public A addToSupplementalGroups(java.lang.Long... items) {
    if (this.supplementalGroups == null) {this.supplementalGroups = new ArrayList<Long>();}
    for (Long item : items) {this.supplementalGroups.add(item);} return (A)this;
  }
  
  public A addAllToSupplementalGroups(Collection<Long> items) {
    if (this.supplementalGroups == null) {this.supplementalGroups = new ArrayList<Long>();}
    for (Long item : items) {this.supplementalGroups.add(item);} return (A)this;
  }
  
  public A removeFromSupplementalGroups(java.lang.Long... items) {
    if (this.supplementalGroups == null) return (A)this;
    for (Long item : items) { this.supplementalGroups.remove(item);} return (A)this;
  }
  
  public A removeAllFromSupplementalGroups(Collection<Long> items) {
    if (this.supplementalGroups == null) return (A)this;
    for (Long item : items) { this.supplementalGroups.remove(item);} return (A)this;
  }
  
  public List<Long> getSupplementalGroups() {
    return this.supplementalGroups;
  }
  
  public Long getSupplementalGroup(int index) {
    return this.supplementalGroups.get(index);
  }
  
  public Long getFirstSupplementalGroup() {
    return this.supplementalGroups.get(0);
  }
  
  public Long getLastSupplementalGroup() {
    return this.supplementalGroups.get(supplementalGroups.size() - 1);
  }
  
  public Long getMatchingSupplementalGroup(Predicate<Long> predicate) {
      for (Long item : supplementalGroups) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingSupplementalGroup(Predicate<Long> predicate) {
      for (Long item : supplementalGroups) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withSupplementalGroups(List<Long> supplementalGroups) {
    if (supplementalGroups != null) {
        this.supplementalGroups = new ArrayList();
        for (Long item : supplementalGroups) {
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
        _visitables.remove("supplementalGroups");
    }
    if (supplementalGroups != null) {
      for (Long item : supplementalGroups) {
        this.addToSupplementalGroups(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasSupplementalGroups() {
    return this.supplementalGroups != null && !this.supplementalGroups.isEmpty();
  }
  
  public A addToSysctls(int index,V1Sysctl item) {
    if (this.sysctls == null) {this.sysctls = new ArrayList<V1SysctlBuilder>();}
    V1SysctlBuilder builder = new V1SysctlBuilder(item);
    if (index < 0 || index >= sysctls.size()) { _visitables.get("sysctls").add(builder); sysctls.add(builder); } else { _visitables.get("sysctls").add(index, builder); sysctls.add(index, builder);}
    return (A)this;
  }
  
  public A setToSysctls(int index,V1Sysctl item) {
    if (this.sysctls == null) {this.sysctls = new ArrayList<V1SysctlBuilder>();}
    V1SysctlBuilder builder = new V1SysctlBuilder(item);
    if (index < 0 || index >= sysctls.size()) { _visitables.get("sysctls").add(builder); sysctls.add(builder); } else { _visitables.get("sysctls").set(index, builder); sysctls.set(index, builder);}
    return (A)this;
  }
  
  public A addToSysctls(io.kubernetes.client.openapi.models.V1Sysctl... items) {
    if (this.sysctls == null) {this.sysctls = new ArrayList<V1SysctlBuilder>();}
    for (V1Sysctl item : items) {V1SysctlBuilder builder = new V1SysctlBuilder(item);_visitables.get("sysctls").add(builder);this.sysctls.add(builder);} return (A)this;
  }
  
  public A addAllToSysctls(Collection<V1Sysctl> items) {
    if (this.sysctls == null) {this.sysctls = new ArrayList<V1SysctlBuilder>();}
    for (V1Sysctl item : items) {V1SysctlBuilder builder = new V1SysctlBuilder(item);_visitables.get("sysctls").add(builder);this.sysctls.add(builder);} return (A)this;
  }
  
  public A removeFromSysctls(io.kubernetes.client.openapi.models.V1Sysctl... items) {
    if (this.sysctls == null) return (A)this;
    for (V1Sysctl item : items) {V1SysctlBuilder builder = new V1SysctlBuilder(item);_visitables.get("sysctls").remove(builder); this.sysctls.remove(builder);} return (A)this;
  }
  
  public A removeAllFromSysctls(Collection<V1Sysctl> items) {
    if (this.sysctls == null) return (A)this;
    for (V1Sysctl item : items) {V1SysctlBuilder builder = new V1SysctlBuilder(item);_visitables.get("sysctls").remove(builder); this.sysctls.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromSysctls(Predicate<V1SysctlBuilder> predicate) {
    if (sysctls == null) return (A) this;
    final Iterator<V1SysctlBuilder> each = sysctls.iterator();
    final List visitables = _visitables.get("sysctls");
    while (each.hasNext()) {
      V1SysctlBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1Sysctl> buildSysctls() {
    return this.sysctls != null ? build(sysctls) : null;
  }
  
  public V1Sysctl buildSysctl(int index) {
    return this.sysctls.get(index).build();
  }
  
  public V1Sysctl buildFirstSysctl() {
    return this.sysctls.get(0).build();
  }
  
  public V1Sysctl buildLastSysctl() {
    return this.sysctls.get(sysctls.size() - 1).build();
  }
  
  public V1Sysctl buildMatchingSysctl(Predicate<V1SysctlBuilder> predicate) {
      for (V1SysctlBuilder item : sysctls) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingSysctl(Predicate<V1SysctlBuilder> predicate) {
      for (V1SysctlBuilder item : sysctls) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withSysctls(List<V1Sysctl> sysctls) {
    if (this.sysctls != null) {
      this._visitables.get("sysctls").clear();
    }
    if (sysctls != null) {
        this.sysctls = new ArrayList();
        for (V1Sysctl item : sysctls) {
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
        _visitables.remove("sysctls");
    }
    if (sysctls != null) {
      for (V1Sysctl item : sysctls) {
        this.addToSysctls(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasSysctls() {
    return this.sysctls != null && !this.sysctls.isEmpty();
  }
  
  public SysctlsNested<A> addNewSysctl() {
    return new SysctlsNested(-1, null);
  }
  
  public SysctlsNested<A> addNewSysctlLike(V1Sysctl item) {
    return new SysctlsNested(-1, item);
  }
  
  public SysctlsNested<A> setNewSysctlLike(int index,V1Sysctl item) {
    return new SysctlsNested(index, item);
  }
  
  public SysctlsNested<A> editSysctl(int index) {
    if (sysctls.size() <= index) throw new RuntimeException("Can't edit sysctls. Index exceeds size.");
    return setNewSysctlLike(index, buildSysctl(index));
  }
  
  public SysctlsNested<A> editFirstSysctl() {
    if (sysctls.size() == 0) throw new RuntimeException("Can't edit first sysctls. The list is empty.");
    return setNewSysctlLike(0, buildSysctl(0));
  }
  
  public SysctlsNested<A> editLastSysctl() {
    int index = sysctls.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last sysctls. The list is empty.");
    return setNewSysctlLike(index, buildSysctl(index));
  }
  
  public SysctlsNested<A> editMatchingSysctl(Predicate<V1SysctlBuilder> predicate) {
    int index = -1;
    for (int i=0;i<sysctls.size();i++) { 
    if (predicate.test(sysctls.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching sysctls. No match found.");
    return setNewSysctlLike(index, buildSysctl(index));
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
    V1PodSecurityContextFluent that = (V1PodSecurityContextFluent) o;
    if (!java.util.Objects.equals(appArmorProfile, that.appArmorProfile)) return false;
    if (!java.util.Objects.equals(fsGroup, that.fsGroup)) return false;
    if (!java.util.Objects.equals(fsGroupChangePolicy, that.fsGroupChangePolicy)) return false;
    if (!java.util.Objects.equals(runAsGroup, that.runAsGroup)) return false;
    if (!java.util.Objects.equals(runAsNonRoot, that.runAsNonRoot)) return false;
    if (!java.util.Objects.equals(runAsUser, that.runAsUser)) return false;
    if (!java.util.Objects.equals(seLinuxOptions, that.seLinuxOptions)) return false;
    if (!java.util.Objects.equals(seccompProfile, that.seccompProfile)) return false;
    if (!java.util.Objects.equals(supplementalGroups, that.supplementalGroups)) return false;
    if (!java.util.Objects.equals(sysctls, that.sysctls)) return false;
    if (!java.util.Objects.equals(windowsOptions, that.windowsOptions)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(appArmorProfile,  fsGroup,  fsGroupChangePolicy,  runAsGroup,  runAsNonRoot,  runAsUser,  seLinuxOptions,  seccompProfile,  supplementalGroups,  sysctls,  windowsOptions,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (appArmorProfile != null) { sb.append("appArmorProfile:"); sb.append(appArmorProfile + ","); }
    if (fsGroup != null) { sb.append("fsGroup:"); sb.append(fsGroup + ","); }
    if (fsGroupChangePolicy != null) { sb.append("fsGroupChangePolicy:"); sb.append(fsGroupChangePolicy + ","); }
    if (runAsGroup != null) { sb.append("runAsGroup:"); sb.append(runAsGroup + ","); }
    if (runAsNonRoot != null) { sb.append("runAsNonRoot:"); sb.append(runAsNonRoot + ","); }
    if (runAsUser != null) { sb.append("runAsUser:"); sb.append(runAsUser + ","); }
    if (seLinuxOptions != null) { sb.append("seLinuxOptions:"); sb.append(seLinuxOptions + ","); }
    if (seccompProfile != null) { sb.append("seccompProfile:"); sb.append(seccompProfile + ","); }
    if (supplementalGroups != null && !supplementalGroups.isEmpty()) { sb.append("supplementalGroups:"); sb.append(supplementalGroups + ","); }
    if (sysctls != null && !sysctls.isEmpty()) { sb.append("sysctls:"); sb.append(sysctls + ","); }
    if (windowsOptions != null) { sb.append("windowsOptions:"); sb.append(windowsOptions); }
    sb.append("}");
    return sb.toString();
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
      return (N) V1PodSecurityContextFluent.this.withAppArmorProfile(builder.build());
    }
    
    public N endAppArmorProfile() {
      return and();
    }
    
  
  }
  public class SeLinuxOptionsNested<N> extends V1SELinuxOptionsFluent<SeLinuxOptionsNested<N>> implements Nested<N>{
    SeLinuxOptionsNested(V1SELinuxOptions item) {
      this.builder = new V1SELinuxOptionsBuilder(this, item);
    }
    V1SELinuxOptionsBuilder builder;
    
    public N and() {
      return (N) V1PodSecurityContextFluent.this.withSeLinuxOptions(builder.build());
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
      return (N) V1PodSecurityContextFluent.this.withSeccompProfile(builder.build());
    }
    
    public N endSeccompProfile() {
      return and();
    }
    
  
  }
  public class SysctlsNested<N> extends V1SysctlFluent<SysctlsNested<N>> implements Nested<N>{
    SysctlsNested(int index,V1Sysctl item) {
      this.index = index;
      this.builder = new V1SysctlBuilder(this, item);
    }
    V1SysctlBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodSecurityContextFluent.this.setToSysctls(index,builder.build());
    }
    
    public N endSysctl() {
      return and();
    }
    
  
  }
  public class WindowsOptionsNested<N> extends V1WindowsSecurityContextOptionsFluent<WindowsOptionsNested<N>> implements Nested<N>{
    WindowsOptionsNested(V1WindowsSecurityContextOptions item) {
      this.builder = new V1WindowsSecurityContextOptionsBuilder(this, item);
    }
    V1WindowsSecurityContextOptionsBuilder builder;
    
    public N and() {
      return (N) V1PodSecurityContextFluent.this.withWindowsOptions(builder.build());
    }
    
    public N endWindowsOptions() {
      return and();
    }
    
  
  }

}