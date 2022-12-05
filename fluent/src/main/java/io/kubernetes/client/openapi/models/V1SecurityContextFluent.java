package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Long;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SecurityContextFluent<A extends V1SecurityContextFluent<A>> extends Fluent<A>{
  public Boolean getAllowPrivilegeEscalation();
  public A withAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation);
  public Boolean hasAllowPrivilegeEscalation();
  
  /**
   * This method has been deprecated, please use method buildCapabilities instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1Capabilities getCapabilities();
  public V1Capabilities buildCapabilities();
  public A withCapabilities(V1Capabilities capabilities);
  public Boolean hasCapabilities();
  public V1SecurityContextFluent.CapabilitiesNested<A> withNewCapabilities();
  public V1SecurityContextFluent.CapabilitiesNested<A> withNewCapabilitiesLike(V1Capabilities item);
  public V1SecurityContextFluent.CapabilitiesNested<A> editCapabilities();
  public V1SecurityContextFluent.CapabilitiesNested<A> editOrNewCapabilities();
  public V1SecurityContextFluent.CapabilitiesNested<A> editOrNewCapabilitiesLike(V1Capabilities item);
  public Boolean getPrivileged();
  public A withPrivileged(Boolean privileged);
  public Boolean hasPrivileged();
  public String getProcMount();
  public A withProcMount(String procMount);
  public Boolean hasProcMount();
  public Boolean getReadOnlyRootFilesystem();
  public A withReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem);
  public Boolean hasReadOnlyRootFilesystem();
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
  public V1SecurityContextFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptions();
  public V1SecurityContextFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptionsLike(V1SELinuxOptions item);
  public V1SecurityContextFluent.SeLinuxOptionsNested<A> editSeLinuxOptions();
  public V1SecurityContextFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptions();
  public V1SecurityContextFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptionsLike(V1SELinuxOptions item);
  
  /**
   * This method has been deprecated, please use method buildSeccompProfile instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SeccompProfile getSeccompProfile();
  public V1SeccompProfile buildSeccompProfile();
  public A withSeccompProfile(V1SeccompProfile seccompProfile);
  public Boolean hasSeccompProfile();
  public V1SecurityContextFluent.SeccompProfileNested<A> withNewSeccompProfile();
  public V1SecurityContextFluent.SeccompProfileNested<A> withNewSeccompProfileLike(V1SeccompProfile item);
  public V1SecurityContextFluent.SeccompProfileNested<A> editSeccompProfile();
  public V1SecurityContextFluent.SeccompProfileNested<A> editOrNewSeccompProfile();
  public V1SecurityContextFluent.SeccompProfileNested<A> editOrNewSeccompProfileLike(V1SeccompProfile item);
  
  /**
   * This method has been deprecated, please use method buildWindowsOptions instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1WindowsSecurityContextOptions getWindowsOptions();
  public V1WindowsSecurityContextOptions buildWindowsOptions();
  public A withWindowsOptions(V1WindowsSecurityContextOptions windowsOptions);
  public Boolean hasWindowsOptions();
  public V1SecurityContextFluent.WindowsOptionsNested<A> withNewWindowsOptions();
  public V1SecurityContextFluent.WindowsOptionsNested<A> withNewWindowsOptionsLike(V1WindowsSecurityContextOptions item);
  public V1SecurityContextFluent.WindowsOptionsNested<A> editWindowsOptions();
  public V1SecurityContextFluent.WindowsOptionsNested<A> editOrNewWindowsOptions();
  public V1SecurityContextFluent.WindowsOptionsNested<A> editOrNewWindowsOptionsLike(V1WindowsSecurityContextOptions item);
  public A withAllowPrivilegeEscalation();
  public A withPrivileged();
  public A withReadOnlyRootFilesystem();
  public A withRunAsNonRoot();
  public interface CapabilitiesNested<N> extends Nested<N>,V1CapabilitiesFluent<V1SecurityContextFluent.CapabilitiesNested<N>>{
    public N and();
    public N endCapabilities();
    
  }
  public interface SeLinuxOptionsNested<N> extends Nested<N>,V1SELinuxOptionsFluent<V1SecurityContextFluent.SeLinuxOptionsNested<N>>{
    public N and();
    public N endSeLinuxOptions();
    
  }
  public interface SeccompProfileNested<N> extends Nested<N>,V1SeccompProfileFluent<V1SecurityContextFluent.SeccompProfileNested<N>>{
    public N and();
    public N endSeccompProfile();
    
  }
  public interface WindowsOptionsNested<N> extends Nested<N>,V1WindowsSecurityContextOptionsFluent<V1SecurityContextFluent.WindowsOptionsNested<N>>{
    public N and();
    public N endWindowsOptions();
    
  }
  
}