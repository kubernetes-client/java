package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Integer;
import java.lang.Long;
import java.util.Collection;

 /**
  * Generated
  */
public interface V1PodSecurityContextFluent<A extends V1PodSecurityContextFluent<A>> extends Fluent<A>{
  public Long getFsGroup();
  public A withFsGroup(Long fsGroup);
  public Boolean hasFsGroup();
  public String getFsGroupChangePolicy();
  public A withFsGroupChangePolicy(String fsGroupChangePolicy);
  public Boolean hasFsGroupChangePolicy();
  public Long getRunAsGroup();
  public A withRunAsGroup(Long runAsGroup);
  public Boolean hasRunAsGroup();
  public Boolean getRunAsNonRoot();
  public A withRunAsNonRoot(Boolean runAsNonRoot);
  public Boolean hasRunAsNonRoot();
  public Long getRunAsUser();
  public A withRunAsUser(Long runAsUser);
  public Boolean hasRunAsUser();
  
  /**
   * This method has been deprecated, please use method buildSeLinuxOptions instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SELinuxOptions getSeLinuxOptions();
  public V1SELinuxOptions buildSeLinuxOptions();
  public A withSeLinuxOptions(V1SELinuxOptions seLinuxOptions);
  public Boolean hasSeLinuxOptions();
  public V1PodSecurityContextFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptions();
  public V1PodSecurityContextFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptionsLike(V1SELinuxOptions item);
  public V1PodSecurityContextFluent.SeLinuxOptionsNested<A> editSeLinuxOptions();
  public V1PodSecurityContextFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptions();
  public V1PodSecurityContextFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptionsLike(V1SELinuxOptions item);
  
  /**
   * This method has been deprecated, please use method buildSeccompProfile instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SeccompProfile getSeccompProfile();
  public V1SeccompProfile buildSeccompProfile();
  public A withSeccompProfile(V1SeccompProfile seccompProfile);
  public Boolean hasSeccompProfile();
  public V1PodSecurityContextFluent.SeccompProfileNested<A> withNewSeccompProfile();
  public V1PodSecurityContextFluent.SeccompProfileNested<A> withNewSeccompProfileLike(V1SeccompProfile item);
  public V1PodSecurityContextFluent.SeccompProfileNested<A> editSeccompProfile();
  public V1PodSecurityContextFluent.SeccompProfileNested<A> editOrNewSeccompProfile();
  public V1PodSecurityContextFluent.SeccompProfileNested<A> editOrNewSeccompProfileLike(V1SeccompProfile item);
  public A addToSupplementalGroups(Integer index,Long item);
  public A setToSupplementalGroups(Integer index,Long item);
  public A addToSupplementalGroups(java.lang.Long... items);
  public A addAllToSupplementalGroups(Collection<Long> items);
  public A removeFromSupplementalGroups(java.lang.Long... items);
  public A removeAllFromSupplementalGroups(Collection<Long> items);
  public List<Long> getSupplementalGroups();
  public Long getSupplementalGroup(Integer index);
  public Long getFirstSupplementalGroup();
  public Long getLastSupplementalGroup();
  public Long getMatchingSupplementalGroup(Predicate<Long> predicate);
  public Boolean hasMatchingSupplementalGroup(Predicate<Long> predicate);
  public A withSupplementalGroups(List<Long> supplementalGroups);
  public A withSupplementalGroups(java.lang.Long... supplementalGroups);
  public Boolean hasSupplementalGroups();
  public A addToSysctls(Integer index,V1Sysctl item);
  public A setToSysctls(Integer index,V1Sysctl item);
  public A addToSysctls(io.kubernetes.client.openapi.models.V1Sysctl... items);
  public A addAllToSysctls(Collection<V1Sysctl> items);
  public A removeFromSysctls(io.kubernetes.client.openapi.models.V1Sysctl... items);
  public A removeAllFromSysctls(Collection<V1Sysctl> items);
  public A removeMatchingFromSysctls(Predicate<V1SysctlBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildSysctls instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Sysctl> getSysctls();
  public List<V1Sysctl> buildSysctls();
  public V1Sysctl buildSysctl(Integer index);
  public V1Sysctl buildFirstSysctl();
  public V1Sysctl buildLastSysctl();
  public V1Sysctl buildMatchingSysctl(Predicate<V1SysctlBuilder> predicate);
  public Boolean hasMatchingSysctl(Predicate<V1SysctlBuilder> predicate);
  public A withSysctls(List<V1Sysctl> sysctls);
  public A withSysctls(io.kubernetes.client.openapi.models.V1Sysctl... sysctls);
  public Boolean hasSysctls();
  public V1PodSecurityContextFluent.SysctlsNested<A> addNewSysctl();
  public V1PodSecurityContextFluent.SysctlsNested<A> addNewSysctlLike(V1Sysctl item);
  public V1PodSecurityContextFluent.SysctlsNested<A> setNewSysctlLike(Integer index,V1Sysctl item);
  public V1PodSecurityContextFluent.SysctlsNested<A> editSysctl(Integer index);
  public V1PodSecurityContextFluent.SysctlsNested<A> editFirstSysctl();
  public V1PodSecurityContextFluent.SysctlsNested<A> editLastSysctl();
  public V1PodSecurityContextFluent.SysctlsNested<A> editMatchingSysctl(Predicate<V1SysctlBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildWindowsOptions instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1WindowsSecurityContextOptions getWindowsOptions();
  public V1WindowsSecurityContextOptions buildWindowsOptions();
  public A withWindowsOptions(V1WindowsSecurityContextOptions windowsOptions);
  public Boolean hasWindowsOptions();
  public V1PodSecurityContextFluent.WindowsOptionsNested<A> withNewWindowsOptions();
  public V1PodSecurityContextFluent.WindowsOptionsNested<A> withNewWindowsOptionsLike(V1WindowsSecurityContextOptions item);
  public V1PodSecurityContextFluent.WindowsOptionsNested<A> editWindowsOptions();
  public V1PodSecurityContextFluent.WindowsOptionsNested<A> editOrNewWindowsOptions();
  public V1PodSecurityContextFluent.WindowsOptionsNested<A> editOrNewWindowsOptionsLike(V1WindowsSecurityContextOptions item);
  public A withRunAsNonRoot();
  public interface SeLinuxOptionsNested<N> extends Nested<N>,V1SELinuxOptionsFluent<V1PodSecurityContextFluent.SeLinuxOptionsNested<N>>{
    public N and();
    public N endSeLinuxOptions();
    
  }
  public interface SeccompProfileNested<N> extends Nested<N>,V1SeccompProfileFluent<V1PodSecurityContextFluent.SeccompProfileNested<N>>{
    public N and();
    public N endSeccompProfile();
    
  }
  public interface SysctlsNested<N> extends Nested<N>,V1SysctlFluent<V1PodSecurityContextFluent.SysctlsNested<N>>{
    public N and();
    public N endSysctl();
    
  }
  public interface WindowsOptionsNested<N> extends Nested<N>,V1WindowsSecurityContextOptionsFluent<V1PodSecurityContextFluent.WindowsOptionsNested<N>>{
    public N and();
    public N endWindowsOptions();
    
  }
  
}