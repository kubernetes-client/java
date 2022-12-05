package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ServiceSpecFluentImpl<A extends V1ServiceSpecFluent<A>> extends BaseFluent<A> implements V1ServiceSpecFluent<A>{
  public V1ServiceSpecFluentImpl() {
  }
  public V1ServiceSpecFluentImpl(V1ServiceSpec instance) {
    this.withAllocateLoadBalancerNodePorts(instance.getAllocateLoadBalancerNodePorts());

    this.withClusterIP(instance.getClusterIP());

    this.withClusterIPs(instance.getClusterIPs());

    this.withExternalIPs(instance.getExternalIPs());

    this.withExternalName(instance.getExternalName());

    this.withExternalTrafficPolicy(instance.getExternalTrafficPolicy());

    this.withHealthCheckNodePort(instance.getHealthCheckNodePort());

    this.withInternalTrafficPolicy(instance.getInternalTrafficPolicy());

    this.withIpFamilies(instance.getIpFamilies());

    this.withIpFamilyPolicy(instance.getIpFamilyPolicy());

    this.withLoadBalancerClass(instance.getLoadBalancerClass());

    this.withLoadBalancerIP(instance.getLoadBalancerIP());

    this.withLoadBalancerSourceRanges(instance.getLoadBalancerSourceRanges());

    this.withPorts(instance.getPorts());

    this.withPublishNotReadyAddresses(instance.getPublishNotReadyAddresses());

    this.withSelector(instance.getSelector());

    this.withSessionAffinity(instance.getSessionAffinity());

    this.withSessionAffinityConfig(instance.getSessionAffinityConfig());

    this.withType(instance.getType());

  }
  private Boolean allocateLoadBalancerNodePorts;
  private String clusterIP;
  private List<String> clusterIPs;
  private List<String> externalIPs;
  private String externalName;
  private String externalTrafficPolicy;
  private Integer healthCheckNodePort;
  private String internalTrafficPolicy;
  private List<String> ipFamilies;
  private String ipFamilyPolicy;
  private String loadBalancerClass;
  private String loadBalancerIP;
  private List<String> loadBalancerSourceRanges;
  private ArrayList<V1ServicePortBuilder> ports;
  private Boolean publishNotReadyAddresses;
  private Map<String,String> selector;
  private String sessionAffinity;
  private V1SessionAffinityConfigBuilder sessionAffinityConfig;
  private String type;
  public Boolean getAllocateLoadBalancerNodePorts() {
    return this.allocateLoadBalancerNodePorts;
  }
  public A withAllocateLoadBalancerNodePorts(Boolean allocateLoadBalancerNodePorts) {
    this.allocateLoadBalancerNodePorts=allocateLoadBalancerNodePorts; return (A) this;
  }
  public Boolean hasAllocateLoadBalancerNodePorts() {
    return this.allocateLoadBalancerNodePorts != null;
  }
  public String getClusterIP() {
    return this.clusterIP;
  }
  public A withClusterIP(String clusterIP) {
    this.clusterIP=clusterIP; return (A) this;
  }
  public Boolean hasClusterIP() {
    return this.clusterIP != null;
  }
  public A addToClusterIPs(Integer index,String item) {
    if (this.clusterIPs == null) {this.clusterIPs = new ArrayList<String>();}
    this.clusterIPs.add(index, item);
    return (A)this;
  }
  public A setToClusterIPs(Integer index,String item) {
    if (this.clusterIPs == null) {this.clusterIPs = new ArrayList<String>();}
    this.clusterIPs.set(index, item); return (A)this;
  }
  public A addToClusterIPs(java.lang.String... items) {
    if (this.clusterIPs == null) {this.clusterIPs = new ArrayList<String>();}
    for (String item : items) {this.clusterIPs.add(item);} return (A)this;
  }
  public A addAllToClusterIPs(Collection<String> items) {
    if (this.clusterIPs == null) {this.clusterIPs = new ArrayList<String>();}
    for (String item : items) {this.clusterIPs.add(item);} return (A)this;
  }
  public A removeFromClusterIPs(java.lang.String... items) {
    for (String item : items) {if (this.clusterIPs!= null){ this.clusterIPs.remove(item);}} return (A)this;
  }
  public A removeAllFromClusterIPs(Collection<String> items) {
    for (String item : items) {if (this.clusterIPs!= null){ this.clusterIPs.remove(item);}} return (A)this;
  }
  public List<String> getClusterIPs() {
    return this.clusterIPs;
  }
  public String getClusterIP(Integer index) {
    return this.clusterIPs.get(index);
  }
  public String getFirstClusterIP() {
    return this.clusterIPs.get(0);
  }
  public String getLastClusterIP() {
    return this.clusterIPs.get(clusterIPs.size() - 1);
  }
  public String getMatchingClusterIP(Predicate<String> predicate) {
    for (String item: clusterIPs) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingClusterIP(Predicate<String> predicate) {
    for (String item: clusterIPs) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withClusterIPs(List<String> clusterIPs) {
    if (clusterIPs != null) {this.clusterIPs = new ArrayList(); for (String item : clusterIPs){this.addToClusterIPs(item);}} else { this.clusterIPs = null;} return (A) this;
  }
  public A withClusterIPs(java.lang.String... clusterIPs) {
    if (this.clusterIPs != null) {this.clusterIPs.clear();}
    if (clusterIPs != null) {for (String item :clusterIPs){ this.addToClusterIPs(item);}} return (A) this;
  }
  public Boolean hasClusterIPs() {
    return clusterIPs != null && !clusterIPs.isEmpty();
  }
  public A addToExternalIPs(Integer index,String item) {
    if (this.externalIPs == null) {this.externalIPs = new ArrayList<String>();}
    this.externalIPs.add(index, item);
    return (A)this;
  }
  public A setToExternalIPs(Integer index,String item) {
    if (this.externalIPs == null) {this.externalIPs = new ArrayList<String>();}
    this.externalIPs.set(index, item); return (A)this;
  }
  public A addToExternalIPs(java.lang.String... items) {
    if (this.externalIPs == null) {this.externalIPs = new ArrayList<String>();}
    for (String item : items) {this.externalIPs.add(item);} return (A)this;
  }
  public A addAllToExternalIPs(Collection<String> items) {
    if (this.externalIPs == null) {this.externalIPs = new ArrayList<String>();}
    for (String item : items) {this.externalIPs.add(item);} return (A)this;
  }
  public A removeFromExternalIPs(java.lang.String... items) {
    for (String item : items) {if (this.externalIPs!= null){ this.externalIPs.remove(item);}} return (A)this;
  }
  public A removeAllFromExternalIPs(Collection<String> items) {
    for (String item : items) {if (this.externalIPs!= null){ this.externalIPs.remove(item);}} return (A)this;
  }
  public List<String> getExternalIPs() {
    return this.externalIPs;
  }
  public String getExternalIP(Integer index) {
    return this.externalIPs.get(index);
  }
  public String getFirstExternalIP() {
    return this.externalIPs.get(0);
  }
  public String getLastExternalIP() {
    return this.externalIPs.get(externalIPs.size() - 1);
  }
  public String getMatchingExternalIP(Predicate<String> predicate) {
    for (String item: externalIPs) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingExternalIP(Predicate<String> predicate) {
    for (String item: externalIPs) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withExternalIPs(List<String> externalIPs) {
    if (externalIPs != null) {this.externalIPs = new ArrayList(); for (String item : externalIPs){this.addToExternalIPs(item);}} else { this.externalIPs = null;} return (A) this;
  }
  public A withExternalIPs(java.lang.String... externalIPs) {
    if (this.externalIPs != null) {this.externalIPs.clear();}
    if (externalIPs != null) {for (String item :externalIPs){ this.addToExternalIPs(item);}} return (A) this;
  }
  public Boolean hasExternalIPs() {
    return externalIPs != null && !externalIPs.isEmpty();
  }
  public String getExternalName() {
    return this.externalName;
  }
  public A withExternalName(String externalName) {
    this.externalName=externalName; return (A) this;
  }
  public Boolean hasExternalName() {
    return this.externalName != null;
  }
  public String getExternalTrafficPolicy() {
    return this.externalTrafficPolicy;
  }
  public A withExternalTrafficPolicy(String externalTrafficPolicy) {
    this.externalTrafficPolicy=externalTrafficPolicy; return (A) this;
  }
  public Boolean hasExternalTrafficPolicy() {
    return this.externalTrafficPolicy != null;
  }
  public Integer getHealthCheckNodePort() {
    return this.healthCheckNodePort;
  }
  public A withHealthCheckNodePort(Integer healthCheckNodePort) {
    this.healthCheckNodePort=healthCheckNodePort; return (A) this;
  }
  public Boolean hasHealthCheckNodePort() {
    return this.healthCheckNodePort != null;
  }
  public String getInternalTrafficPolicy() {
    return this.internalTrafficPolicy;
  }
  public A withInternalTrafficPolicy(String internalTrafficPolicy) {
    this.internalTrafficPolicy=internalTrafficPolicy; return (A) this;
  }
  public Boolean hasInternalTrafficPolicy() {
    return this.internalTrafficPolicy != null;
  }
  public A addToIpFamilies(Integer index,String item) {
    if (this.ipFamilies == null) {this.ipFamilies = new ArrayList<String>();}
    this.ipFamilies.add(index, item);
    return (A)this;
  }
  public A setToIpFamilies(Integer index,String item) {
    if (this.ipFamilies == null) {this.ipFamilies = new ArrayList<String>();}
    this.ipFamilies.set(index, item); return (A)this;
  }
  public A addToIpFamilies(java.lang.String... items) {
    if (this.ipFamilies == null) {this.ipFamilies = new ArrayList<String>();}
    for (String item : items) {this.ipFamilies.add(item);} return (A)this;
  }
  public A addAllToIpFamilies(Collection<String> items) {
    if (this.ipFamilies == null) {this.ipFamilies = new ArrayList<String>();}
    for (String item : items) {this.ipFamilies.add(item);} return (A)this;
  }
  public A removeFromIpFamilies(java.lang.String... items) {
    for (String item : items) {if (this.ipFamilies!= null){ this.ipFamilies.remove(item);}} return (A)this;
  }
  public A removeAllFromIpFamilies(Collection<String> items) {
    for (String item : items) {if (this.ipFamilies!= null){ this.ipFamilies.remove(item);}} return (A)this;
  }
  public List<String> getIpFamilies() {
    return this.ipFamilies;
  }
  public String getIpFamily(Integer index) {
    return this.ipFamilies.get(index);
  }
  public String getFirstIpFamily() {
    return this.ipFamilies.get(0);
  }
  public String getLastIpFamily() {
    return this.ipFamilies.get(ipFamilies.size() - 1);
  }
  public String getMatchingIpFamily(Predicate<String> predicate) {
    for (String item: ipFamilies) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingIpFamily(Predicate<String> predicate) {
    for (String item: ipFamilies) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withIpFamilies(List<String> ipFamilies) {
    if (ipFamilies != null) {this.ipFamilies = new ArrayList(); for (String item : ipFamilies){this.addToIpFamilies(item);}} else { this.ipFamilies = null;} return (A) this;
  }
  public A withIpFamilies(java.lang.String... ipFamilies) {
    if (this.ipFamilies != null) {this.ipFamilies.clear();}
    if (ipFamilies != null) {for (String item :ipFamilies){ this.addToIpFamilies(item);}} return (A) this;
  }
  public Boolean hasIpFamilies() {
    return ipFamilies != null && !ipFamilies.isEmpty();
  }
  public String getIpFamilyPolicy() {
    return this.ipFamilyPolicy;
  }
  public A withIpFamilyPolicy(String ipFamilyPolicy) {
    this.ipFamilyPolicy=ipFamilyPolicy; return (A) this;
  }
  public Boolean hasIpFamilyPolicy() {
    return this.ipFamilyPolicy != null;
  }
  public String getLoadBalancerClass() {
    return this.loadBalancerClass;
  }
  public A withLoadBalancerClass(String loadBalancerClass) {
    this.loadBalancerClass=loadBalancerClass; return (A) this;
  }
  public Boolean hasLoadBalancerClass() {
    return this.loadBalancerClass != null;
  }
  public String getLoadBalancerIP() {
    return this.loadBalancerIP;
  }
  public A withLoadBalancerIP(String loadBalancerIP) {
    this.loadBalancerIP=loadBalancerIP; return (A) this;
  }
  public Boolean hasLoadBalancerIP() {
    return this.loadBalancerIP != null;
  }
  public A addToLoadBalancerSourceRanges(Integer index,String item) {
    if (this.loadBalancerSourceRanges == null) {this.loadBalancerSourceRanges = new ArrayList<String>();}
    this.loadBalancerSourceRanges.add(index, item);
    return (A)this;
  }
  public A setToLoadBalancerSourceRanges(Integer index,String item) {
    if (this.loadBalancerSourceRanges == null) {this.loadBalancerSourceRanges = new ArrayList<String>();}
    this.loadBalancerSourceRanges.set(index, item); return (A)this;
  }
  public A addToLoadBalancerSourceRanges(java.lang.String... items) {
    if (this.loadBalancerSourceRanges == null) {this.loadBalancerSourceRanges = new ArrayList<String>();}
    for (String item : items) {this.loadBalancerSourceRanges.add(item);} return (A)this;
  }
  public A addAllToLoadBalancerSourceRanges(Collection<String> items) {
    if (this.loadBalancerSourceRanges == null) {this.loadBalancerSourceRanges = new ArrayList<String>();}
    for (String item : items) {this.loadBalancerSourceRanges.add(item);} return (A)this;
  }
  public A removeFromLoadBalancerSourceRanges(java.lang.String... items) {
    for (String item : items) {if (this.loadBalancerSourceRanges!= null){ this.loadBalancerSourceRanges.remove(item);}} return (A)this;
  }
  public A removeAllFromLoadBalancerSourceRanges(Collection<String> items) {
    for (String item : items) {if (this.loadBalancerSourceRanges!= null){ this.loadBalancerSourceRanges.remove(item);}} return (A)this;
  }
  public List<String> getLoadBalancerSourceRanges() {
    return this.loadBalancerSourceRanges;
  }
  public String getLoadBalancerSourceRange(Integer index) {
    return this.loadBalancerSourceRanges.get(index);
  }
  public String getFirstLoadBalancerSourceRange() {
    return this.loadBalancerSourceRanges.get(0);
  }
  public String getLastLoadBalancerSourceRange() {
    return this.loadBalancerSourceRanges.get(loadBalancerSourceRanges.size() - 1);
  }
  public String getMatchingLoadBalancerSourceRange(Predicate<String> predicate) {
    for (String item: loadBalancerSourceRanges) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingLoadBalancerSourceRange(Predicate<String> predicate) {
    for (String item: loadBalancerSourceRanges) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withLoadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {
    if (loadBalancerSourceRanges != null) {this.loadBalancerSourceRanges = new ArrayList(); for (String item : loadBalancerSourceRanges){this.addToLoadBalancerSourceRanges(item);}} else { this.loadBalancerSourceRanges = null;} return (A) this;
  }
  public A withLoadBalancerSourceRanges(java.lang.String... loadBalancerSourceRanges) {
    if (this.loadBalancerSourceRanges != null) {this.loadBalancerSourceRanges.clear();}
    if (loadBalancerSourceRanges != null) {for (String item :loadBalancerSourceRanges){ this.addToLoadBalancerSourceRanges(item);}} return (A) this;
  }
  public Boolean hasLoadBalancerSourceRanges() {
    return loadBalancerSourceRanges != null && !loadBalancerSourceRanges.isEmpty();
  }
  public A addToPorts(Integer index,V1ServicePort item) {
    if (this.ports == null) {this.ports = new ArrayList<V1ServicePortBuilder>();}
    V1ServicePortBuilder builder = new V1ServicePortBuilder(item);_visitables.get("ports").add(index >= 0 ? index : _visitables.get("ports").size(), builder);this.ports.add(index >= 0 ? index : ports.size(), builder); return (A)this;
  }
  public A setToPorts(Integer index,V1ServicePort item) {
    if (this.ports == null) {this.ports = new ArrayList<V1ServicePortBuilder>();}
    V1ServicePortBuilder builder = new V1ServicePortBuilder(item);
    if (index < 0 || index >= _visitables.get("ports").size()) { _visitables.get("ports").add(builder); } else { _visitables.get("ports").set(index, builder);}
    if (index < 0 || index >= ports.size()) { ports.add(builder); } else { ports.set(index, builder);}
     return (A)this;
  }
  public A addToPorts(io.kubernetes.client.openapi.models.V1ServicePort... items) {
    if (this.ports == null) {this.ports = new ArrayList<V1ServicePortBuilder>();}
    for (V1ServicePort item : items) {V1ServicePortBuilder builder = new V1ServicePortBuilder(item);_visitables.get("ports").add(builder);this.ports.add(builder);} return (A)this;
  }
  public A addAllToPorts(Collection<V1ServicePort> items) {
    if (this.ports == null) {this.ports = new ArrayList<V1ServicePortBuilder>();}
    for (V1ServicePort item : items) {V1ServicePortBuilder builder = new V1ServicePortBuilder(item);_visitables.get("ports").add(builder);this.ports.add(builder);} return (A)this;
  }
  public A removeFromPorts(io.kubernetes.client.openapi.models.V1ServicePort... items) {
    for (V1ServicePort item : items) {V1ServicePortBuilder builder = new V1ServicePortBuilder(item);_visitables.get("ports").remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
  }
  public A removeAllFromPorts(Collection<V1ServicePort> items) {
    for (V1ServicePort item : items) {V1ServicePortBuilder builder = new V1ServicePortBuilder(item);_visitables.get("ports").remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromPorts(Predicate<V1ServicePortBuilder> predicate) {
    if (ports == null) return (A) this;
    final Iterator<V1ServicePortBuilder> each = ports.iterator();
    final List visitables = _visitables.get("ports");
    while (each.hasNext()) {
      V1ServicePortBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildPorts instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ServicePort> getPorts() {
    return ports != null ? build(ports) : null;
  }
  public List<V1ServicePort> buildPorts() {
    return ports != null ? build(ports) : null;
  }
  public V1ServicePort buildPort(Integer index) {
    return this.ports.get(index).build();
  }
  public V1ServicePort buildFirstPort() {
    return this.ports.get(0).build();
  }
  public V1ServicePort buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }
  public V1ServicePort buildMatchingPort(Predicate<V1ServicePortBuilder> predicate) {
    for (V1ServicePortBuilder item: ports) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingPort(Predicate<V1ServicePortBuilder> predicate) {
    for (V1ServicePortBuilder item: ports) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withPorts(List<V1ServicePort> ports) {
    if (this.ports != null) { _visitables.get("ports").removeAll(this.ports);}
    if (ports != null) {this.ports = new ArrayList(); for (V1ServicePort item : ports){this.addToPorts(item);}} else { this.ports = null;} return (A) this;
  }
  public A withPorts(io.kubernetes.client.openapi.models.V1ServicePort... ports) {
    if (this.ports != null) {this.ports.clear();}
    if (ports != null) {for (V1ServicePort item :ports){ this.addToPorts(item);}} return (A) this;
  }
  public Boolean hasPorts() {
    return ports != null && !ports.isEmpty();
  }
  public V1ServiceSpecFluent.PortsNested<A> addNewPort() {
    return new V1ServiceSpecFluentImpl.PortsNestedImpl();
  }
  public V1ServiceSpecFluent.PortsNested<A> addNewPortLike(V1ServicePort item) {
    return new V1ServiceSpecFluentImpl.PortsNestedImpl(-1, item);
  }
  public V1ServiceSpecFluent.PortsNested<A> setNewPortLike(Integer index,V1ServicePort item) {
    return new V1ServiceSpecFluentImpl.PortsNestedImpl(index, item);
  }
  public V1ServiceSpecFluent.PortsNested<A> editPort(Integer index) {
    if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
    return setNewPortLike(index, buildPort(index));
  }
  public V1ServiceSpecFluent.PortsNested<A> editFirstPort() {
    if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
    return setNewPortLike(0, buildPort(0));
  }
  public V1ServiceSpecFluent.PortsNested<A> editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
    return setNewPortLike(index, buildPort(index));
  }
  public V1ServiceSpecFluent.PortsNested<A> editMatchingPort(Predicate<V1ServicePortBuilder> predicate) {
    int index = -1;
    for (int i=0;i<ports.size();i++) { 
    if (predicate.test(ports.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching ports. No match found.");
    return setNewPortLike(index, buildPort(index));
  }
  public Boolean getPublishNotReadyAddresses() {
    return this.publishNotReadyAddresses;
  }
  public A withPublishNotReadyAddresses(Boolean publishNotReadyAddresses) {
    this.publishNotReadyAddresses=publishNotReadyAddresses; return (A) this;
  }
  public Boolean hasPublishNotReadyAddresses() {
    return this.publishNotReadyAddresses != null;
  }
  public A addToSelector(String key,String value) {
    if(this.selector == null && key != null && value != null) { this.selector = new LinkedHashMap(); }
    if(key != null && value != null) {this.selector.put(key, value);} return (A)this;
  }
  public A addToSelector(Map<String,String> map) {
    if(this.selector == null && map != null) { this.selector = new LinkedHashMap(); }
    if(map != null) { this.selector.putAll(map);} return (A)this;
  }
  public A removeFromSelector(String key) {
    if(this.selector == null) { return (A) this; }
    if(key != null && this.selector != null) {this.selector.remove(key);} return (A)this;
  }
  public A removeFromSelector(Map<String,String> map) {
    if(this.selector == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.selector != null){this.selector.remove(key);}}} return (A)this;
  }
  public Map<String,String> getSelector() {
    return this.selector;
  }
  public <K,V>A withSelector(Map<String,String> selector) {
    if (selector == null) { this.selector =  null;} else {this.selector = new LinkedHashMap(selector);} return (A) this;
  }
  public Boolean hasSelector() {
    return this.selector != null;
  }
  public String getSessionAffinity() {
    return this.sessionAffinity;
  }
  public A withSessionAffinity(String sessionAffinity) {
    this.sessionAffinity=sessionAffinity; return (A) this;
  }
  public Boolean hasSessionAffinity() {
    return this.sessionAffinity != null;
  }
  
  /**
   * This method has been deprecated, please use method buildSessionAffinityConfig instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SessionAffinityConfig getSessionAffinityConfig() {
    return this.sessionAffinityConfig!=null ?this.sessionAffinityConfig.build():null;
  }
  public V1SessionAffinityConfig buildSessionAffinityConfig() {
    return this.sessionAffinityConfig!=null ?this.sessionAffinityConfig.build():null;
  }
  public A withSessionAffinityConfig(V1SessionAffinityConfig sessionAffinityConfig) {
    _visitables.get("sessionAffinityConfig").remove(this.sessionAffinityConfig);
    if (sessionAffinityConfig!=null){ this.sessionAffinityConfig= new V1SessionAffinityConfigBuilder(sessionAffinityConfig); _visitables.get("sessionAffinityConfig").add(this.sessionAffinityConfig);} else { this.sessionAffinityConfig = null; _visitables.get("sessionAffinityConfig").remove(this.sessionAffinityConfig); } return (A) this;
  }
  public Boolean hasSessionAffinityConfig() {
    return this.sessionAffinityConfig != null;
  }
  public V1ServiceSpecFluent.SessionAffinityConfigNested<A> withNewSessionAffinityConfig() {
    return new V1ServiceSpecFluentImpl.SessionAffinityConfigNestedImpl();
  }
  public V1ServiceSpecFluent.SessionAffinityConfigNested<A> withNewSessionAffinityConfigLike(V1SessionAffinityConfig item) {
    return new V1ServiceSpecFluentImpl.SessionAffinityConfigNestedImpl(item);
  }
  public V1ServiceSpecFluent.SessionAffinityConfigNested<A> editSessionAffinityConfig() {
    return withNewSessionAffinityConfigLike(getSessionAffinityConfig());
  }
  public V1ServiceSpecFluent.SessionAffinityConfigNested<A> editOrNewSessionAffinityConfig() {
    return withNewSessionAffinityConfigLike(getSessionAffinityConfig() != null ? getSessionAffinityConfig(): new V1SessionAffinityConfigBuilder().build());
  }
  public V1ServiceSpecFluent.SessionAffinityConfigNested<A> editOrNewSessionAffinityConfigLike(V1SessionAffinityConfig item) {
    return withNewSessionAffinityConfigLike(getSessionAffinityConfig() != null ? getSessionAffinityConfig(): item);
  }
  public String getType() {
    return this.type;
  }
  public A withType(String type) {
    this.type=type; return (A) this;
  }
  public Boolean hasType() {
    return this.type != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ServiceSpecFluentImpl that = (V1ServiceSpecFluentImpl) o;
    if (allocateLoadBalancerNodePorts != null ? !allocateLoadBalancerNodePorts.equals(that.allocateLoadBalancerNodePorts) :that.allocateLoadBalancerNodePorts != null) return false;
    if (clusterIP != null ? !clusterIP.equals(that.clusterIP) :that.clusterIP != null) return false;
    if (clusterIPs != null ? !clusterIPs.equals(that.clusterIPs) :that.clusterIPs != null) return false;
    if (externalIPs != null ? !externalIPs.equals(that.externalIPs) :that.externalIPs != null) return false;
    if (externalName != null ? !externalName.equals(that.externalName) :that.externalName != null) return false;
    if (externalTrafficPolicy != null ? !externalTrafficPolicy.equals(that.externalTrafficPolicy) :that.externalTrafficPolicy != null) return false;
    if (healthCheckNodePort != null ? !healthCheckNodePort.equals(that.healthCheckNodePort) :that.healthCheckNodePort != null) return false;
    if (internalTrafficPolicy != null ? !internalTrafficPolicy.equals(that.internalTrafficPolicy) :that.internalTrafficPolicy != null) return false;
    if (ipFamilies != null ? !ipFamilies.equals(that.ipFamilies) :that.ipFamilies != null) return false;
    if (ipFamilyPolicy != null ? !ipFamilyPolicy.equals(that.ipFamilyPolicy) :that.ipFamilyPolicy != null) return false;
    if (loadBalancerClass != null ? !loadBalancerClass.equals(that.loadBalancerClass) :that.loadBalancerClass != null) return false;
    if (loadBalancerIP != null ? !loadBalancerIP.equals(that.loadBalancerIP) :that.loadBalancerIP != null) return false;
    if (loadBalancerSourceRanges != null ? !loadBalancerSourceRanges.equals(that.loadBalancerSourceRanges) :that.loadBalancerSourceRanges != null) return false;
    if (ports != null ? !ports.equals(that.ports) :that.ports != null) return false;
    if (publishNotReadyAddresses != null ? !publishNotReadyAddresses.equals(that.publishNotReadyAddresses) :that.publishNotReadyAddresses != null) return false;
    if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
    if (sessionAffinity != null ? !sessionAffinity.equals(that.sessionAffinity) :that.sessionAffinity != null) return false;
    if (sessionAffinityConfig != null ? !sessionAffinityConfig.equals(that.sessionAffinityConfig) :that.sessionAffinityConfig != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(allocateLoadBalancerNodePorts,  clusterIP,  clusterIPs,  externalIPs,  externalName,  externalTrafficPolicy,  healthCheckNodePort,  internalTrafficPolicy,  ipFamilies,  ipFamilyPolicy,  loadBalancerClass,  loadBalancerIP,  loadBalancerSourceRanges,  ports,  publishNotReadyAddresses,  selector,  sessionAffinity,  sessionAffinityConfig,  type,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (allocateLoadBalancerNodePorts != null) { sb.append("allocateLoadBalancerNodePorts:"); sb.append(allocateLoadBalancerNodePorts + ","); }
    if (clusterIP != null) { sb.append("clusterIP:"); sb.append(clusterIP + ","); }
    if (clusterIPs != null && !clusterIPs.isEmpty()) { sb.append("clusterIPs:"); sb.append(clusterIPs + ","); }
    if (externalIPs != null && !externalIPs.isEmpty()) { sb.append("externalIPs:"); sb.append(externalIPs + ","); }
    if (externalName != null) { sb.append("externalName:"); sb.append(externalName + ","); }
    if (externalTrafficPolicy != null) { sb.append("externalTrafficPolicy:"); sb.append(externalTrafficPolicy + ","); }
    if (healthCheckNodePort != null) { sb.append("healthCheckNodePort:"); sb.append(healthCheckNodePort + ","); }
    if (internalTrafficPolicy != null) { sb.append("internalTrafficPolicy:"); sb.append(internalTrafficPolicy + ","); }
    if (ipFamilies != null && !ipFamilies.isEmpty()) { sb.append("ipFamilies:"); sb.append(ipFamilies + ","); }
    if (ipFamilyPolicy != null) { sb.append("ipFamilyPolicy:"); sb.append(ipFamilyPolicy + ","); }
    if (loadBalancerClass != null) { sb.append("loadBalancerClass:"); sb.append(loadBalancerClass + ","); }
    if (loadBalancerIP != null) { sb.append("loadBalancerIP:"); sb.append(loadBalancerIP + ","); }
    if (loadBalancerSourceRanges != null && !loadBalancerSourceRanges.isEmpty()) { sb.append("loadBalancerSourceRanges:"); sb.append(loadBalancerSourceRanges + ","); }
    if (ports != null && !ports.isEmpty()) { sb.append("ports:"); sb.append(ports + ","); }
    if (publishNotReadyAddresses != null) { sb.append("publishNotReadyAddresses:"); sb.append(publishNotReadyAddresses + ","); }
    if (selector != null && !selector.isEmpty()) { sb.append("selector:"); sb.append(selector + ","); }
    if (sessionAffinity != null) { sb.append("sessionAffinity:"); sb.append(sessionAffinity + ","); }
    if (sessionAffinityConfig != null) { sb.append("sessionAffinityConfig:"); sb.append(sessionAffinityConfig + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  public A withAllocateLoadBalancerNodePorts() {
    return withAllocateLoadBalancerNodePorts(true);
  }
  public A withPublishNotReadyAddresses() {
    return withPublishNotReadyAddresses(true);
  }
  class PortsNestedImpl<N> extends V1ServicePortFluentImpl<V1ServiceSpecFluent.PortsNested<N>> implements V1ServiceSpecFluent.PortsNested<N>,Nested<N>{
    PortsNestedImpl(Integer index,V1ServicePort item) {
      this.index = index;
      this.builder = new V1ServicePortBuilder(this, item);
    }
    PortsNestedImpl() {
      this.index = -1;
      this.builder = new V1ServicePortBuilder(this);
    }
    V1ServicePortBuilder builder;
    Integer index;
    public N and() {
      return (N) V1ServiceSpecFluentImpl.this.setToPorts(index,builder.build());
    }
    public N endPort() {
      return and();
    }
    
  }
  class SessionAffinityConfigNestedImpl<N> extends V1SessionAffinityConfigFluentImpl<V1ServiceSpecFluent.SessionAffinityConfigNested<N>> implements V1ServiceSpecFluent.SessionAffinityConfigNested<N>,Nested<N>{
    SessionAffinityConfigNestedImpl(V1SessionAffinityConfig item) {
      this.builder = new V1SessionAffinityConfigBuilder(this, item);
    }
    SessionAffinityConfigNestedImpl() {
      this.builder = new V1SessionAffinityConfigBuilder(this);
    }
    V1SessionAffinityConfigBuilder builder;
    public N and() {
      return (N) V1ServiceSpecFluentImpl.this.withSessionAffinityConfig(builder.build());
    }
    public N endSessionAffinityConfig() {
      return and();
    }
    
  }
  
}