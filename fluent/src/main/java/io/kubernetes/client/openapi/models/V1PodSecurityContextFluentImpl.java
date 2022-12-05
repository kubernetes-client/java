package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1PodSecurityContextFluentImpl<A extends V1PodSecurityContextFluent<A>> extends BaseFluent<A> implements V1PodSecurityContextFluent<A>{
  public V1PodSecurityContextFluentImpl() {
  }
  public V1PodSecurityContextFluentImpl(V1PodSecurityContext instance) {
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
  public Long getFsGroup() {
    return this.fsGroup;
  }
  public A withFsGroup(Long fsGroup) {
    this.fsGroup=fsGroup; return (A) this;
  }
  public Boolean hasFsGroup() {
    return this.fsGroup != null;
  }
  public String getFsGroupChangePolicy() {
    return this.fsGroupChangePolicy;
  }
  public A withFsGroupChangePolicy(String fsGroupChangePolicy) {
    this.fsGroupChangePolicy=fsGroupChangePolicy; return (A) this;
  }
  public Boolean hasFsGroupChangePolicy() {
    return this.fsGroupChangePolicy != null;
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
  public V1PodSecurityContextFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptions() {
    return new V1PodSecurityContextFluentImpl.SeLinuxOptionsNestedImpl();
  }
  public V1PodSecurityContextFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptionsLike(V1SELinuxOptions item) {
    return new V1PodSecurityContextFluentImpl.SeLinuxOptionsNestedImpl(item);
  }
  public V1PodSecurityContextFluent.SeLinuxOptionsNested<A> editSeLinuxOptions() {
    return withNewSeLinuxOptionsLike(getSeLinuxOptions());
  }
  public V1PodSecurityContextFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptions() {
    return withNewSeLinuxOptionsLike(getSeLinuxOptions() != null ? getSeLinuxOptions(): new V1SELinuxOptionsBuilder().build());
  }
  public V1PodSecurityContextFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptionsLike(V1SELinuxOptions item) {
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
  public V1PodSecurityContextFluent.SeccompProfileNested<A> withNewSeccompProfile() {
    return new V1PodSecurityContextFluentImpl.SeccompProfileNestedImpl();
  }
  public V1PodSecurityContextFluent.SeccompProfileNested<A> withNewSeccompProfileLike(V1SeccompProfile item) {
    return new V1PodSecurityContextFluentImpl.SeccompProfileNestedImpl(item);
  }
  public V1PodSecurityContextFluent.SeccompProfileNested<A> editSeccompProfile() {
    return withNewSeccompProfileLike(getSeccompProfile());
  }
  public V1PodSecurityContextFluent.SeccompProfileNested<A> editOrNewSeccompProfile() {
    return withNewSeccompProfileLike(getSeccompProfile() != null ? getSeccompProfile(): new V1SeccompProfileBuilder().build());
  }
  public V1PodSecurityContextFluent.SeccompProfileNested<A> editOrNewSeccompProfileLike(V1SeccompProfile item) {
    return withNewSeccompProfileLike(getSeccompProfile() != null ? getSeccompProfile(): item);
  }
  public A addToSupplementalGroups(Integer index,Long item) {
    if (this.supplementalGroups == null) {this.supplementalGroups = new ArrayList<Long>();}
    this.supplementalGroups.add(index, item);
    return (A)this;
  }
  public A setToSupplementalGroups(Integer index,Long item) {
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
    for (Long item : items) {if (this.supplementalGroups!= null){ this.supplementalGroups.remove(item);}} return (A)this;
  }
  public A removeAllFromSupplementalGroups(Collection<Long> items) {
    for (Long item : items) {if (this.supplementalGroups!= null){ this.supplementalGroups.remove(item);}} return (A)this;
  }
  public List<Long> getSupplementalGroups() {
    return this.supplementalGroups;
  }
  public Long getSupplementalGroup(Integer index) {
    return this.supplementalGroups.get(index);
  }
  public Long getFirstSupplementalGroup() {
    return this.supplementalGroups.get(0);
  }
  public Long getLastSupplementalGroup() {
    return this.supplementalGroups.get(supplementalGroups.size() - 1);
  }
  public Long getMatchingSupplementalGroup(Predicate<Long> predicate) {
    for (Long item: supplementalGroups) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingSupplementalGroup(Predicate<Long> predicate) {
    for (Long item: supplementalGroups) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withSupplementalGroups(List<Long> supplementalGroups) {
    if (supplementalGroups != null) {this.supplementalGroups = new ArrayList(); for (Long item : supplementalGroups){this.addToSupplementalGroups(item);}} else { this.supplementalGroups = null;} return (A) this;
  }
  public A withSupplementalGroups(java.lang.Long... supplementalGroups) {
    if (this.supplementalGroups != null) {this.supplementalGroups.clear();}
    if (supplementalGroups != null) {for (Long item :supplementalGroups){ this.addToSupplementalGroups(item);}} return (A) this;
  }
  public Boolean hasSupplementalGroups() {
    return supplementalGroups != null && !supplementalGroups.isEmpty();
  }
  public A addToSysctls(Integer index,V1Sysctl item) {
    if (this.sysctls == null) {this.sysctls = new ArrayList<V1SysctlBuilder>();}
    V1SysctlBuilder builder = new V1SysctlBuilder(item);_visitables.get("sysctls").add(index >= 0 ? index : _visitables.get("sysctls").size(), builder);this.sysctls.add(index >= 0 ? index : sysctls.size(), builder); return (A)this;
  }
  public A setToSysctls(Integer index,V1Sysctl item) {
    if (this.sysctls == null) {this.sysctls = new ArrayList<V1SysctlBuilder>();}
    V1SysctlBuilder builder = new V1SysctlBuilder(item);
    if (index < 0 || index >= _visitables.get("sysctls").size()) { _visitables.get("sysctls").add(builder); } else { _visitables.get("sysctls").set(index, builder);}
    if (index < 0 || index >= sysctls.size()) { sysctls.add(builder); } else { sysctls.set(index, builder);}
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
    for (V1Sysctl item : items) {V1SysctlBuilder builder = new V1SysctlBuilder(item);_visitables.get("sysctls").remove(builder);if (this.sysctls != null) {this.sysctls.remove(builder);}} return (A)this;
  }
  public A removeAllFromSysctls(Collection<V1Sysctl> items) {
    for (V1Sysctl item : items) {V1SysctlBuilder builder = new V1SysctlBuilder(item);_visitables.get("sysctls").remove(builder);if (this.sysctls != null) {this.sysctls.remove(builder);}} return (A)this;
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
  
  /**
   * This method has been deprecated, please use method buildSysctls instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Sysctl> getSysctls() {
    return sysctls != null ? build(sysctls) : null;
  }
  public List<V1Sysctl> buildSysctls() {
    return sysctls != null ? build(sysctls) : null;
  }
  public V1Sysctl buildSysctl(Integer index) {
    return this.sysctls.get(index).build();
  }
  public V1Sysctl buildFirstSysctl() {
    return this.sysctls.get(0).build();
  }
  public V1Sysctl buildLastSysctl() {
    return this.sysctls.get(sysctls.size() - 1).build();
  }
  public V1Sysctl buildMatchingSysctl(Predicate<V1SysctlBuilder> predicate) {
    for (V1SysctlBuilder item: sysctls) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingSysctl(Predicate<V1SysctlBuilder> predicate) {
    for (V1SysctlBuilder item: sysctls) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withSysctls(List<V1Sysctl> sysctls) {
    if (this.sysctls != null) { _visitables.get("sysctls").removeAll(this.sysctls);}
    if (sysctls != null) {this.sysctls = new ArrayList(); for (V1Sysctl item : sysctls){this.addToSysctls(item);}} else { this.sysctls = null;} return (A) this;
  }
  public A withSysctls(io.kubernetes.client.openapi.models.V1Sysctl... sysctls) {
    if (this.sysctls != null) {this.sysctls.clear();}
    if (sysctls != null) {for (V1Sysctl item :sysctls){ this.addToSysctls(item);}} return (A) this;
  }
  public Boolean hasSysctls() {
    return sysctls != null && !sysctls.isEmpty();
  }
  public V1PodSecurityContextFluent.SysctlsNested<A> addNewSysctl() {
    return new V1PodSecurityContextFluentImpl.SysctlsNestedImpl();
  }
  public V1PodSecurityContextFluent.SysctlsNested<A> addNewSysctlLike(V1Sysctl item) {
    return new V1PodSecurityContextFluentImpl.SysctlsNestedImpl(-1, item);
  }
  public V1PodSecurityContextFluent.SysctlsNested<A> setNewSysctlLike(Integer index,V1Sysctl item) {
    return new V1PodSecurityContextFluentImpl.SysctlsNestedImpl(index, item);
  }
  public V1PodSecurityContextFluent.SysctlsNested<A> editSysctl(Integer index) {
    if (sysctls.size() <= index) throw new RuntimeException("Can't edit sysctls. Index exceeds size.");
    return setNewSysctlLike(index, buildSysctl(index));
  }
  public V1PodSecurityContextFluent.SysctlsNested<A> editFirstSysctl() {
    if (sysctls.size() == 0) throw new RuntimeException("Can't edit first sysctls. The list is empty.");
    return setNewSysctlLike(0, buildSysctl(0));
  }
  public V1PodSecurityContextFluent.SysctlsNested<A> editLastSysctl() {
    int index = sysctls.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last sysctls. The list is empty.");
    return setNewSysctlLike(index, buildSysctl(index));
  }
  public V1PodSecurityContextFluent.SysctlsNested<A> editMatchingSysctl(Predicate<V1SysctlBuilder> predicate) {
    int index = -1;
    for (int i=0;i<sysctls.size();i++) { 
    if (predicate.test(sysctls.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching sysctls. No match found.");
    return setNewSysctlLike(index, buildSysctl(index));
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
  public V1PodSecurityContextFluent.WindowsOptionsNested<A> withNewWindowsOptions() {
    return new V1PodSecurityContextFluentImpl.WindowsOptionsNestedImpl();
  }
  public V1PodSecurityContextFluent.WindowsOptionsNested<A> withNewWindowsOptionsLike(V1WindowsSecurityContextOptions item) {
    return new V1PodSecurityContextFluentImpl.WindowsOptionsNestedImpl(item);
  }
  public V1PodSecurityContextFluent.WindowsOptionsNested<A> editWindowsOptions() {
    return withNewWindowsOptionsLike(getWindowsOptions());
  }
  public V1PodSecurityContextFluent.WindowsOptionsNested<A> editOrNewWindowsOptions() {
    return withNewWindowsOptionsLike(getWindowsOptions() != null ? getWindowsOptions(): new V1WindowsSecurityContextOptionsBuilder().build());
  }
  public V1PodSecurityContextFluent.WindowsOptionsNested<A> editOrNewWindowsOptionsLike(V1WindowsSecurityContextOptions item) {
    return withNewWindowsOptionsLike(getWindowsOptions() != null ? getWindowsOptions(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodSecurityContextFluentImpl that = (V1PodSecurityContextFluentImpl) o;
    if (fsGroup != null ? !fsGroup.equals(that.fsGroup) :that.fsGroup != null) return false;
    if (fsGroupChangePolicy != null ? !fsGroupChangePolicy.equals(that.fsGroupChangePolicy) :that.fsGroupChangePolicy != null) return false;
    if (runAsGroup != null ? !runAsGroup.equals(that.runAsGroup) :that.runAsGroup != null) return false;
    if (runAsNonRoot != null ? !runAsNonRoot.equals(that.runAsNonRoot) :that.runAsNonRoot != null) return false;
    if (runAsUser != null ? !runAsUser.equals(that.runAsUser) :that.runAsUser != null) return false;
    if (seLinuxOptions != null ? !seLinuxOptions.equals(that.seLinuxOptions) :that.seLinuxOptions != null) return false;
    if (seccompProfile != null ? !seccompProfile.equals(that.seccompProfile) :that.seccompProfile != null) return false;
    if (supplementalGroups != null ? !supplementalGroups.equals(that.supplementalGroups) :that.supplementalGroups != null) return false;
    if (sysctls != null ? !sysctls.equals(that.sysctls) :that.sysctls != null) return false;
    if (windowsOptions != null ? !windowsOptions.equals(that.windowsOptions) :that.windowsOptions != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fsGroup,  fsGroupChangePolicy,  runAsGroup,  runAsNonRoot,  runAsUser,  seLinuxOptions,  seccompProfile,  supplementalGroups,  sysctls,  windowsOptions,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
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
  class SeLinuxOptionsNestedImpl<N> extends V1SELinuxOptionsFluentImpl<V1PodSecurityContextFluent.SeLinuxOptionsNested<N>> implements V1PodSecurityContextFluent.SeLinuxOptionsNested<N>,Nested<N>{
    SeLinuxOptionsNestedImpl(V1SELinuxOptions item) {
      this.builder = new V1SELinuxOptionsBuilder(this, item);
    }
    SeLinuxOptionsNestedImpl() {
      this.builder = new V1SELinuxOptionsBuilder(this);
    }
    V1SELinuxOptionsBuilder builder;
    public N and() {
      return (N) V1PodSecurityContextFluentImpl.this.withSeLinuxOptions(builder.build());
    }
    public N endSeLinuxOptions() {
      return and();
    }
    
  }
  class SeccompProfileNestedImpl<N> extends V1SeccompProfileFluentImpl<V1PodSecurityContextFluent.SeccompProfileNested<N>> implements V1PodSecurityContextFluent.SeccompProfileNested<N>,Nested<N>{
    SeccompProfileNestedImpl(V1SeccompProfile item) {
      this.builder = new V1SeccompProfileBuilder(this, item);
    }
    SeccompProfileNestedImpl() {
      this.builder = new V1SeccompProfileBuilder(this);
    }
    V1SeccompProfileBuilder builder;
    public N and() {
      return (N) V1PodSecurityContextFluentImpl.this.withSeccompProfile(builder.build());
    }
    public N endSeccompProfile() {
      return and();
    }
    
  }
  class SysctlsNestedImpl<N> extends V1SysctlFluentImpl<V1PodSecurityContextFluent.SysctlsNested<N>> implements V1PodSecurityContextFluent.SysctlsNested<N>,Nested<N>{
    SysctlsNestedImpl(Integer index,V1Sysctl item) {
      this.index = index;
      this.builder = new V1SysctlBuilder(this, item);
    }
    SysctlsNestedImpl() {
      this.index = -1;
      this.builder = new V1SysctlBuilder(this);
    }
    V1SysctlBuilder builder;
    Integer index;
    public N and() {
      return (N) V1PodSecurityContextFluentImpl.this.setToSysctls(index,builder.build());
    }
    public N endSysctl() {
      return and();
    }
    
  }
  class WindowsOptionsNestedImpl<N> extends V1WindowsSecurityContextOptionsFluentImpl<V1PodSecurityContextFluent.WindowsOptionsNested<N>> implements V1PodSecurityContextFluent.WindowsOptionsNested<N>,Nested<N>{
    WindowsOptionsNestedImpl(V1WindowsSecurityContextOptions item) {
      this.builder = new V1WindowsSecurityContextOptionsBuilder(this, item);
    }
    WindowsOptionsNestedImpl() {
      this.builder = new V1WindowsSecurityContextOptionsBuilder(this);
    }
    V1WindowsSecurityContextOptionsBuilder builder;
    public N and() {
      return (N) V1PodSecurityContextFluentImpl.this.withWindowsOptions(builder.build());
    }
    public N endWindowsOptions() {
      return and();
    }
    
  }
  
}