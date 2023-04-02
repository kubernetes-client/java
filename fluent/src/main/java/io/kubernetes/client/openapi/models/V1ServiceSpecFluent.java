package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public interface V1ServiceSpecFluent<A extends V1ServiceSpecFluent<A>> extends Fluent<A>{
  public Boolean getAllocateLoadBalancerNodePorts();
  public A withAllocateLoadBalancerNodePorts(Boolean allocateLoadBalancerNodePorts);
  public Boolean hasAllocateLoadBalancerNodePorts();
  public String getClusterIP();
  public A withClusterIP(String clusterIP);
  public Boolean hasClusterIP();
  public A addToClusterIPs(Integer index,String item);
  public A setToClusterIPs(Integer index,String item);
  public A addToClusterIPs(java.lang.String... items);
  public A addAllToClusterIPs(Collection<String> items);
  public A removeFromClusterIPs(java.lang.String... items);
  public A removeAllFromClusterIPs(Collection<String> items);
  public List<String> getClusterIPs();
  public String getClusterIP(Integer index);
  public String getFirstClusterIP();
  public String getLastClusterIP();
  public String getMatchingClusterIP(Predicate<String> predicate);
  public Boolean hasMatchingClusterIP(Predicate<String> predicate);
  public A withClusterIPs(List<String> clusterIPs);
  public A withClusterIPs(java.lang.String... clusterIPs);
  public Boolean hasClusterIPs();
  public A addToExternalIPs(Integer index,String item);
  public A setToExternalIPs(Integer index,String item);
  public A addToExternalIPs(java.lang.String... items);
  public A addAllToExternalIPs(Collection<String> items);
  public A removeFromExternalIPs(java.lang.String... items);
  public A removeAllFromExternalIPs(Collection<String> items);
  public List<String> getExternalIPs();
  public String getExternalIP(Integer index);
  public String getFirstExternalIP();
  public String getLastExternalIP();
  public String getMatchingExternalIP(Predicate<String> predicate);
  public Boolean hasMatchingExternalIP(Predicate<String> predicate);
  public A withExternalIPs(List<String> externalIPs);
  public A withExternalIPs(java.lang.String... externalIPs);
  public Boolean hasExternalIPs();
  public String getExternalName();
  public A withExternalName(String externalName);
  public Boolean hasExternalName();
  public String getExternalTrafficPolicy();
  public A withExternalTrafficPolicy(String externalTrafficPolicy);
  public Boolean hasExternalTrafficPolicy();
  public Integer getHealthCheckNodePort();
  public A withHealthCheckNodePort(Integer healthCheckNodePort);
  public Boolean hasHealthCheckNodePort();
  public String getInternalTrafficPolicy();
  public A withInternalTrafficPolicy(String internalTrafficPolicy);
  public Boolean hasInternalTrafficPolicy();
  public A addToIpFamilies(Integer index,String item);
  public A setToIpFamilies(Integer index,String item);
  public A addToIpFamilies(java.lang.String... items);
  public A addAllToIpFamilies(Collection<String> items);
  public A removeFromIpFamilies(java.lang.String... items);
  public A removeAllFromIpFamilies(Collection<String> items);
  public List<String> getIpFamilies();
  public String getIpFamily(Integer index);
  public String getFirstIpFamily();
  public String getLastIpFamily();
  public String getMatchingIpFamily(Predicate<String> predicate);
  public Boolean hasMatchingIpFamily(Predicate<String> predicate);
  public A withIpFamilies(List<String> ipFamilies);
  public A withIpFamilies(java.lang.String... ipFamilies);
  public Boolean hasIpFamilies();
  public String getIpFamilyPolicy();
  public A withIpFamilyPolicy(String ipFamilyPolicy);
  public Boolean hasIpFamilyPolicy();
  public String getLoadBalancerClass();
  public A withLoadBalancerClass(String loadBalancerClass);
  public Boolean hasLoadBalancerClass();
  public String getLoadBalancerIP();
  public A withLoadBalancerIP(String loadBalancerIP);
  public Boolean hasLoadBalancerIP();
  public A addToLoadBalancerSourceRanges(Integer index,String item);
  public A setToLoadBalancerSourceRanges(Integer index,String item);
  public A addToLoadBalancerSourceRanges(java.lang.String... items);
  public A addAllToLoadBalancerSourceRanges(Collection<String> items);
  public A removeFromLoadBalancerSourceRanges(java.lang.String... items);
  public A removeAllFromLoadBalancerSourceRanges(Collection<String> items);
  public List<String> getLoadBalancerSourceRanges();
  public String getLoadBalancerSourceRange(Integer index);
  public String getFirstLoadBalancerSourceRange();
  public String getLastLoadBalancerSourceRange();
  public String getMatchingLoadBalancerSourceRange(Predicate<String> predicate);
  public Boolean hasMatchingLoadBalancerSourceRange(Predicate<String> predicate);
  public A withLoadBalancerSourceRanges(List<String> loadBalancerSourceRanges);
  public A withLoadBalancerSourceRanges(java.lang.String... loadBalancerSourceRanges);
  public Boolean hasLoadBalancerSourceRanges();
  public A addToPorts(Integer index,V1ServicePort item);
  public A setToPorts(Integer index,V1ServicePort item);
  public A addToPorts(io.kubernetes.client.openapi.models.V1ServicePort... items);
  public A addAllToPorts(Collection<V1ServicePort> items);
  public A removeFromPorts(io.kubernetes.client.openapi.models.V1ServicePort... items);
  public A removeAllFromPorts(Collection<V1ServicePort> items);
  public A removeMatchingFromPorts(Predicate<V1ServicePortBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildPorts instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ServicePort> getPorts();
  public List<V1ServicePort> buildPorts();
  public V1ServicePort buildPort(Integer index);
  public V1ServicePort buildFirstPort();
  public V1ServicePort buildLastPort();
  public V1ServicePort buildMatchingPort(Predicate<V1ServicePortBuilder> predicate);
  public Boolean hasMatchingPort(Predicate<V1ServicePortBuilder> predicate);
  public A withPorts(List<V1ServicePort> ports);
  public A withPorts(io.kubernetes.client.openapi.models.V1ServicePort... ports);
  public Boolean hasPorts();
  public V1ServiceSpecFluent.PortsNested<A> addNewPort();
  public V1ServiceSpecFluent.PortsNested<A> addNewPortLike(V1ServicePort item);
  public V1ServiceSpecFluent.PortsNested<A> setNewPortLike(Integer index,V1ServicePort item);
  public V1ServiceSpecFluent.PortsNested<A> editPort(Integer index);
  public V1ServiceSpecFluent.PortsNested<A> editFirstPort();
  public V1ServiceSpecFluent.PortsNested<A> editLastPort();
  public V1ServiceSpecFluent.PortsNested<A> editMatchingPort(Predicate<V1ServicePortBuilder> predicate);
  public Boolean getPublishNotReadyAddresses();
  public A withPublishNotReadyAddresses(Boolean publishNotReadyAddresses);
  public Boolean hasPublishNotReadyAddresses();
  public A addToSelector(String key,String value);
  public A addToSelector(Map<String,String> map);
  public A removeFromSelector(String key);
  public A removeFromSelector(Map<String,String> map);
  public Map<String,String> getSelector();
  public <K,V>A withSelector(Map<String,String> selector);
  public Boolean hasSelector();
  public String getSessionAffinity();
  public A withSessionAffinity(String sessionAffinity);
  public Boolean hasSessionAffinity();
  
  /**
   * This method has been deprecated, please use method buildSessionAffinityConfig instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SessionAffinityConfig getSessionAffinityConfig();
  public V1SessionAffinityConfig buildSessionAffinityConfig();
  public A withSessionAffinityConfig(V1SessionAffinityConfig sessionAffinityConfig);
  public Boolean hasSessionAffinityConfig();
  public V1ServiceSpecFluent.SessionAffinityConfigNested<A> withNewSessionAffinityConfig();
  public V1ServiceSpecFluent.SessionAffinityConfigNested<A> withNewSessionAffinityConfigLike(V1SessionAffinityConfig item);
  public V1ServiceSpecFluent.SessionAffinityConfigNested<A> editSessionAffinityConfig();
  public V1ServiceSpecFluent.SessionAffinityConfigNested<A> editOrNewSessionAffinityConfig();
  public V1ServiceSpecFluent.SessionAffinityConfigNested<A> editOrNewSessionAffinityConfigLike(V1SessionAffinityConfig item);
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  public A withAllocateLoadBalancerNodePorts();
  public A withPublishNotReadyAddresses();
  public interface PortsNested<N> extends Nested<N>,V1ServicePortFluent<V1ServiceSpecFluent.PortsNested<N>>{
    public N and();
    public N endPort();
    
  }
  public interface SessionAffinityConfigNested<N> extends Nested<N>,V1SessionAffinityConfigFluent<V1ServiceSpecFluent.SessionAffinityConfigNested<N>>{
    public N and();
    public N endSessionAffinityConfig();
    
  }
  
}