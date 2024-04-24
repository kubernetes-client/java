package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
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
@SuppressWarnings("unchecked")
public class V1ServiceSpecFluent<A extends V1ServiceSpecFluent<A>> extends BaseFluent<A>{
  public V1ServiceSpecFluent() {
  }
  
  public V1ServiceSpecFluent(V1ServiceSpec instance) {
    this.copyInstance(instance);
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
  private String trafficDistribution;
  private String type;
  
  protected void copyInstance(V1ServiceSpec instance) {
    instance = (instance != null ? instance : new V1ServiceSpec());
    if (instance != null) {
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
          this.withTrafficDistribution(instance.getTrafficDistribution());
          this.withType(instance.getType());
        }
  }
  
  public Boolean getAllocateLoadBalancerNodePorts() {
    return this.allocateLoadBalancerNodePorts;
  }
  
  public A withAllocateLoadBalancerNodePorts(Boolean allocateLoadBalancerNodePorts) {
    this.allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts;
    return (A) this;
  }
  
  public boolean hasAllocateLoadBalancerNodePorts() {
    return this.allocateLoadBalancerNodePorts != null;
  }
  
  public String getClusterIP() {
    return this.clusterIP;
  }
  
  public A withClusterIP(String clusterIP) {
    this.clusterIP = clusterIP;
    return (A) this;
  }
  
  public boolean hasClusterIP() {
    return this.clusterIP != null;
  }
  
  public A addToClusterIPs(int index,String item) {
    if (this.clusterIPs == null) {this.clusterIPs = new ArrayList<String>();}
    this.clusterIPs.add(index, item);
    return (A)this;
  }
  
  public A setToClusterIPs(int index,String item) {
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
    if (this.clusterIPs == null) return (A)this;
    for (String item : items) { this.clusterIPs.remove(item);} return (A)this;
  }
  
  public A removeAllFromClusterIPs(Collection<String> items) {
    if (this.clusterIPs == null) return (A)this;
    for (String item : items) { this.clusterIPs.remove(item);} return (A)this;
  }
  
  public List<String> getClusterIPs() {
    return this.clusterIPs;
  }
  
  public String getClusterIP(int index) {
    return this.clusterIPs.get(index);
  }
  
  public String getFirstClusterIP() {
    return this.clusterIPs.get(0);
  }
  
  public String getLastClusterIP() {
    return this.clusterIPs.get(clusterIPs.size() - 1);
  }
  
  public String getMatchingClusterIP(Predicate<String> predicate) {
      for (String item : clusterIPs) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingClusterIP(Predicate<String> predicate) {
      for (String item : clusterIPs) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withClusterIPs(List<String> clusterIPs) {
    if (clusterIPs != null) {
        this.clusterIPs = new ArrayList();
        for (String item : clusterIPs) {
          this.addToClusterIPs(item);
        }
    } else {
      this.clusterIPs = null;
    }
    return (A) this;
  }
  
  public A withClusterIPs(java.lang.String... clusterIPs) {
    if (this.clusterIPs != null) {
        this.clusterIPs.clear();
        _visitables.remove("clusterIPs");
    }
    if (clusterIPs != null) {
      for (String item : clusterIPs) {
        this.addToClusterIPs(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasClusterIPs() {
    return this.clusterIPs != null && !this.clusterIPs.isEmpty();
  }
  
  public A addToExternalIPs(int index,String item) {
    if (this.externalIPs == null) {this.externalIPs = new ArrayList<String>();}
    this.externalIPs.add(index, item);
    return (A)this;
  }
  
  public A setToExternalIPs(int index,String item) {
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
    if (this.externalIPs == null) return (A)this;
    for (String item : items) { this.externalIPs.remove(item);} return (A)this;
  }
  
  public A removeAllFromExternalIPs(Collection<String> items) {
    if (this.externalIPs == null) return (A)this;
    for (String item : items) { this.externalIPs.remove(item);} return (A)this;
  }
  
  public List<String> getExternalIPs() {
    return this.externalIPs;
  }
  
  public String getExternalIP(int index) {
    return this.externalIPs.get(index);
  }
  
  public String getFirstExternalIP() {
    return this.externalIPs.get(0);
  }
  
  public String getLastExternalIP() {
    return this.externalIPs.get(externalIPs.size() - 1);
  }
  
  public String getMatchingExternalIP(Predicate<String> predicate) {
      for (String item : externalIPs) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingExternalIP(Predicate<String> predicate) {
      for (String item : externalIPs) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withExternalIPs(List<String> externalIPs) {
    if (externalIPs != null) {
        this.externalIPs = new ArrayList();
        for (String item : externalIPs) {
          this.addToExternalIPs(item);
        }
    } else {
      this.externalIPs = null;
    }
    return (A) this;
  }
  
  public A withExternalIPs(java.lang.String... externalIPs) {
    if (this.externalIPs != null) {
        this.externalIPs.clear();
        _visitables.remove("externalIPs");
    }
    if (externalIPs != null) {
      for (String item : externalIPs) {
        this.addToExternalIPs(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasExternalIPs() {
    return this.externalIPs != null && !this.externalIPs.isEmpty();
  }
  
  public String getExternalName() {
    return this.externalName;
  }
  
  public A withExternalName(String externalName) {
    this.externalName = externalName;
    return (A) this;
  }
  
  public boolean hasExternalName() {
    return this.externalName != null;
  }
  
  public String getExternalTrafficPolicy() {
    return this.externalTrafficPolicy;
  }
  
  public A withExternalTrafficPolicy(String externalTrafficPolicy) {
    this.externalTrafficPolicy = externalTrafficPolicy;
    return (A) this;
  }
  
  public boolean hasExternalTrafficPolicy() {
    return this.externalTrafficPolicy != null;
  }
  
  public Integer getHealthCheckNodePort() {
    return this.healthCheckNodePort;
  }
  
  public A withHealthCheckNodePort(Integer healthCheckNodePort) {
    this.healthCheckNodePort = healthCheckNodePort;
    return (A) this;
  }
  
  public boolean hasHealthCheckNodePort() {
    return this.healthCheckNodePort != null;
  }
  
  public String getInternalTrafficPolicy() {
    return this.internalTrafficPolicy;
  }
  
  public A withInternalTrafficPolicy(String internalTrafficPolicy) {
    this.internalTrafficPolicy = internalTrafficPolicy;
    return (A) this;
  }
  
  public boolean hasInternalTrafficPolicy() {
    return this.internalTrafficPolicy != null;
  }
  
  public A addToIpFamilies(int index,String item) {
    if (this.ipFamilies == null) {this.ipFamilies = new ArrayList<String>();}
    this.ipFamilies.add(index, item);
    return (A)this;
  }
  
  public A setToIpFamilies(int index,String item) {
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
    if (this.ipFamilies == null) return (A)this;
    for (String item : items) { this.ipFamilies.remove(item);} return (A)this;
  }
  
  public A removeAllFromIpFamilies(Collection<String> items) {
    if (this.ipFamilies == null) return (A)this;
    for (String item : items) { this.ipFamilies.remove(item);} return (A)this;
  }
  
  public List<String> getIpFamilies() {
    return this.ipFamilies;
  }
  
  public String getIpFamily(int index) {
    return this.ipFamilies.get(index);
  }
  
  public String getFirstIpFamily() {
    return this.ipFamilies.get(0);
  }
  
  public String getLastIpFamily() {
    return this.ipFamilies.get(ipFamilies.size() - 1);
  }
  
  public String getMatchingIpFamily(Predicate<String> predicate) {
      for (String item : ipFamilies) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingIpFamily(Predicate<String> predicate) {
      for (String item : ipFamilies) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withIpFamilies(List<String> ipFamilies) {
    if (ipFamilies != null) {
        this.ipFamilies = new ArrayList();
        for (String item : ipFamilies) {
          this.addToIpFamilies(item);
        }
    } else {
      this.ipFamilies = null;
    }
    return (A) this;
  }
  
  public A withIpFamilies(java.lang.String... ipFamilies) {
    if (this.ipFamilies != null) {
        this.ipFamilies.clear();
        _visitables.remove("ipFamilies");
    }
    if (ipFamilies != null) {
      for (String item : ipFamilies) {
        this.addToIpFamilies(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasIpFamilies() {
    return this.ipFamilies != null && !this.ipFamilies.isEmpty();
  }
  
  public String getIpFamilyPolicy() {
    return this.ipFamilyPolicy;
  }
  
  public A withIpFamilyPolicy(String ipFamilyPolicy) {
    this.ipFamilyPolicy = ipFamilyPolicy;
    return (A) this;
  }
  
  public boolean hasIpFamilyPolicy() {
    return this.ipFamilyPolicy != null;
  }
  
  public String getLoadBalancerClass() {
    return this.loadBalancerClass;
  }
  
  public A withLoadBalancerClass(String loadBalancerClass) {
    this.loadBalancerClass = loadBalancerClass;
    return (A) this;
  }
  
  public boolean hasLoadBalancerClass() {
    return this.loadBalancerClass != null;
  }
  
  public String getLoadBalancerIP() {
    return this.loadBalancerIP;
  }
  
  public A withLoadBalancerIP(String loadBalancerIP) {
    this.loadBalancerIP = loadBalancerIP;
    return (A) this;
  }
  
  public boolean hasLoadBalancerIP() {
    return this.loadBalancerIP != null;
  }
  
  public A addToLoadBalancerSourceRanges(int index,String item) {
    if (this.loadBalancerSourceRanges == null) {this.loadBalancerSourceRanges = new ArrayList<String>();}
    this.loadBalancerSourceRanges.add(index, item);
    return (A)this;
  }
  
  public A setToLoadBalancerSourceRanges(int index,String item) {
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
    if (this.loadBalancerSourceRanges == null) return (A)this;
    for (String item : items) { this.loadBalancerSourceRanges.remove(item);} return (A)this;
  }
  
  public A removeAllFromLoadBalancerSourceRanges(Collection<String> items) {
    if (this.loadBalancerSourceRanges == null) return (A)this;
    for (String item : items) { this.loadBalancerSourceRanges.remove(item);} return (A)this;
  }
  
  public List<String> getLoadBalancerSourceRanges() {
    return this.loadBalancerSourceRanges;
  }
  
  public String getLoadBalancerSourceRange(int index) {
    return this.loadBalancerSourceRanges.get(index);
  }
  
  public String getFirstLoadBalancerSourceRange() {
    return this.loadBalancerSourceRanges.get(0);
  }
  
  public String getLastLoadBalancerSourceRange() {
    return this.loadBalancerSourceRanges.get(loadBalancerSourceRanges.size() - 1);
  }
  
  public String getMatchingLoadBalancerSourceRange(Predicate<String> predicate) {
      for (String item : loadBalancerSourceRanges) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingLoadBalancerSourceRange(Predicate<String> predicate) {
      for (String item : loadBalancerSourceRanges) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withLoadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {
    if (loadBalancerSourceRanges != null) {
        this.loadBalancerSourceRanges = new ArrayList();
        for (String item : loadBalancerSourceRanges) {
          this.addToLoadBalancerSourceRanges(item);
        }
    } else {
      this.loadBalancerSourceRanges = null;
    }
    return (A) this;
  }
  
  public A withLoadBalancerSourceRanges(java.lang.String... loadBalancerSourceRanges) {
    if (this.loadBalancerSourceRanges != null) {
        this.loadBalancerSourceRanges.clear();
        _visitables.remove("loadBalancerSourceRanges");
    }
    if (loadBalancerSourceRanges != null) {
      for (String item : loadBalancerSourceRanges) {
        this.addToLoadBalancerSourceRanges(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasLoadBalancerSourceRanges() {
    return this.loadBalancerSourceRanges != null && !this.loadBalancerSourceRanges.isEmpty();
  }
  
  public A addToPorts(int index,V1ServicePort item) {
    if (this.ports == null) {this.ports = new ArrayList<V1ServicePortBuilder>();}
    V1ServicePortBuilder builder = new V1ServicePortBuilder(item);
    if (index < 0 || index >= ports.size()) { _visitables.get("ports").add(builder); ports.add(builder); } else { _visitables.get("ports").add(index, builder); ports.add(index, builder);}
    return (A)this;
  }
  
  public A setToPorts(int index,V1ServicePort item) {
    if (this.ports == null) {this.ports = new ArrayList<V1ServicePortBuilder>();}
    V1ServicePortBuilder builder = new V1ServicePortBuilder(item);
    if (index < 0 || index >= ports.size()) { _visitables.get("ports").add(builder); ports.add(builder); } else { _visitables.get("ports").set(index, builder); ports.set(index, builder);}
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
    if (this.ports == null) return (A)this;
    for (V1ServicePort item : items) {V1ServicePortBuilder builder = new V1ServicePortBuilder(item);_visitables.get("ports").remove(builder); this.ports.remove(builder);} return (A)this;
  }
  
  public A removeAllFromPorts(Collection<V1ServicePort> items) {
    if (this.ports == null) return (A)this;
    for (V1ServicePort item : items) {V1ServicePortBuilder builder = new V1ServicePortBuilder(item);_visitables.get("ports").remove(builder); this.ports.remove(builder);} return (A)this;
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
  
  public List<V1ServicePort> buildPorts() {
    return this.ports != null ? build(ports) : null;
  }
  
  public V1ServicePort buildPort(int index) {
    return this.ports.get(index).build();
  }
  
  public V1ServicePort buildFirstPort() {
    return this.ports.get(0).build();
  }
  
  public V1ServicePort buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }
  
  public V1ServicePort buildMatchingPort(Predicate<V1ServicePortBuilder> predicate) {
      for (V1ServicePortBuilder item : ports) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingPort(Predicate<V1ServicePortBuilder> predicate) {
      for (V1ServicePortBuilder item : ports) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPorts(List<V1ServicePort> ports) {
    if (this.ports != null) {
      this._visitables.get("ports").clear();
    }
    if (ports != null) {
        this.ports = new ArrayList();
        for (V1ServicePort item : ports) {
          this.addToPorts(item);
        }
    } else {
      this.ports = null;
    }
    return (A) this;
  }
  
  public A withPorts(io.kubernetes.client.openapi.models.V1ServicePort... ports) {
    if (this.ports != null) {
        this.ports.clear();
        _visitables.remove("ports");
    }
    if (ports != null) {
      for (V1ServicePort item : ports) {
        this.addToPorts(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPorts() {
    return this.ports != null && !this.ports.isEmpty();
  }
  
  public PortsNested<A> addNewPort() {
    return new PortsNested(-1, null);
  }
  
  public PortsNested<A> addNewPortLike(V1ServicePort item) {
    return new PortsNested(-1, item);
  }
  
  public PortsNested<A> setNewPortLike(int index,V1ServicePort item) {
    return new PortsNested(index, item);
  }
  
  public PortsNested<A> editPort(int index) {
    if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
    return setNewPortLike(index, buildPort(index));
  }
  
  public PortsNested<A> editFirstPort() {
    if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
    return setNewPortLike(0, buildPort(0));
  }
  
  public PortsNested<A> editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
    return setNewPortLike(index, buildPort(index));
  }
  
  public PortsNested<A> editMatchingPort(Predicate<V1ServicePortBuilder> predicate) {
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
    this.publishNotReadyAddresses = publishNotReadyAddresses;
    return (A) this;
  }
  
  public boolean hasPublishNotReadyAddresses() {
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
    if (selector == null) {
      this.selector = null;
    } else {
      this.selector = new LinkedHashMap(selector);
    }
    return (A) this;
  }
  
  public boolean hasSelector() {
    return this.selector != null;
  }
  
  public String getSessionAffinity() {
    return this.sessionAffinity;
  }
  
  public A withSessionAffinity(String sessionAffinity) {
    this.sessionAffinity = sessionAffinity;
    return (A) this;
  }
  
  public boolean hasSessionAffinity() {
    return this.sessionAffinity != null;
  }
  
  public V1SessionAffinityConfig buildSessionAffinityConfig() {
    return this.sessionAffinityConfig != null ? this.sessionAffinityConfig.build() : null;
  }
  
  public A withSessionAffinityConfig(V1SessionAffinityConfig sessionAffinityConfig) {
    this._visitables.remove("sessionAffinityConfig");
    if (sessionAffinityConfig != null) {
        this.sessionAffinityConfig = new V1SessionAffinityConfigBuilder(sessionAffinityConfig);
        this._visitables.get("sessionAffinityConfig").add(this.sessionAffinityConfig);
    } else {
        this.sessionAffinityConfig = null;
        this._visitables.get("sessionAffinityConfig").remove(this.sessionAffinityConfig);
    }
    return (A) this;
  }
  
  public boolean hasSessionAffinityConfig() {
    return this.sessionAffinityConfig != null;
  }
  
  public SessionAffinityConfigNested<A> withNewSessionAffinityConfig() {
    return new SessionAffinityConfigNested(null);
  }
  
  public SessionAffinityConfigNested<A> withNewSessionAffinityConfigLike(V1SessionAffinityConfig item) {
    return new SessionAffinityConfigNested(item);
  }
  
  public SessionAffinityConfigNested<A> editSessionAffinityConfig() {
    return withNewSessionAffinityConfigLike(java.util.Optional.ofNullable(buildSessionAffinityConfig()).orElse(null));
  }
  
  public SessionAffinityConfigNested<A> editOrNewSessionAffinityConfig() {
    return withNewSessionAffinityConfigLike(java.util.Optional.ofNullable(buildSessionAffinityConfig()).orElse(new V1SessionAffinityConfigBuilder().build()));
  }
  
  public SessionAffinityConfigNested<A> editOrNewSessionAffinityConfigLike(V1SessionAffinityConfig item) {
    return withNewSessionAffinityConfigLike(java.util.Optional.ofNullable(buildSessionAffinityConfig()).orElse(item));
  }
  
  public String getTrafficDistribution() {
    return this.trafficDistribution;
  }
  
  public A withTrafficDistribution(String trafficDistribution) {
    this.trafficDistribution = trafficDistribution;
    return (A) this;
  }
  
  public boolean hasTrafficDistribution() {
    return this.trafficDistribution != null;
  }
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ServiceSpecFluent that = (V1ServiceSpecFluent) o;
    if (!java.util.Objects.equals(allocateLoadBalancerNodePorts, that.allocateLoadBalancerNodePorts)) return false;
    if (!java.util.Objects.equals(clusterIP, that.clusterIP)) return false;
    if (!java.util.Objects.equals(clusterIPs, that.clusterIPs)) return false;
    if (!java.util.Objects.equals(externalIPs, that.externalIPs)) return false;
    if (!java.util.Objects.equals(externalName, that.externalName)) return false;
    if (!java.util.Objects.equals(externalTrafficPolicy, that.externalTrafficPolicy)) return false;
    if (!java.util.Objects.equals(healthCheckNodePort, that.healthCheckNodePort)) return false;
    if (!java.util.Objects.equals(internalTrafficPolicy, that.internalTrafficPolicy)) return false;
    if (!java.util.Objects.equals(ipFamilies, that.ipFamilies)) return false;
    if (!java.util.Objects.equals(ipFamilyPolicy, that.ipFamilyPolicy)) return false;
    if (!java.util.Objects.equals(loadBalancerClass, that.loadBalancerClass)) return false;
    if (!java.util.Objects.equals(loadBalancerIP, that.loadBalancerIP)) return false;
    if (!java.util.Objects.equals(loadBalancerSourceRanges, that.loadBalancerSourceRanges)) return false;
    if (!java.util.Objects.equals(ports, that.ports)) return false;
    if (!java.util.Objects.equals(publishNotReadyAddresses, that.publishNotReadyAddresses)) return false;
    if (!java.util.Objects.equals(selector, that.selector)) return false;
    if (!java.util.Objects.equals(sessionAffinity, that.sessionAffinity)) return false;
    if (!java.util.Objects.equals(sessionAffinityConfig, that.sessionAffinityConfig)) return false;
    if (!java.util.Objects.equals(trafficDistribution, that.trafficDistribution)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(allocateLoadBalancerNodePorts,  clusterIP,  clusterIPs,  externalIPs,  externalName,  externalTrafficPolicy,  healthCheckNodePort,  internalTrafficPolicy,  ipFamilies,  ipFamilyPolicy,  loadBalancerClass,  loadBalancerIP,  loadBalancerSourceRanges,  ports,  publishNotReadyAddresses,  selector,  sessionAffinity,  sessionAffinityConfig,  trafficDistribution,  type,  super.hashCode());
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
    if (trafficDistribution != null) { sb.append("trafficDistribution:"); sb.append(trafficDistribution + ","); }
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
  public class PortsNested<N> extends V1ServicePortFluent<PortsNested<N>> implements Nested<N>{
    PortsNested(int index,V1ServicePort item) {
      this.index = index;
      this.builder = new V1ServicePortBuilder(this, item);
    }
    V1ServicePortBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ServiceSpecFluent.this.setToPorts(index,builder.build());
    }
    
    public N endPort() {
      return and();
    }
    
  
  }
  public class SessionAffinityConfigNested<N> extends V1SessionAffinityConfigFluent<SessionAffinityConfigNested<N>> implements Nested<N>{
    SessionAffinityConfigNested(V1SessionAffinityConfig item) {
      this.builder = new V1SessionAffinityConfigBuilder(this, item);
    }
    V1SessionAffinityConfigBuilder builder;
    
    public N and() {
      return (N) V1ServiceSpecFluent.this.withSessionAffinityConfig(builder.build());
    }
    
    public N endSessionAffinityConfig() {
      return and();
    }
    
  
  }

}