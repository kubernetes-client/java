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
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1EndpointSliceFluent<A extends V1EndpointSliceFluent<A>> extends BaseFluent<A>{
  public V1EndpointSliceFluent() {
  }
  
  public V1EndpointSliceFluent(V1EndpointSlice instance) {
    this.copyInstance(instance);
  }
  private String addressType;
  private String apiVersion;
  private ArrayList<V1EndpointBuilder> endpoints;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private ArrayList<DiscoveryV1EndpointPortBuilder> ports;
  
  protected void copyInstance(V1EndpointSlice instance) {
    instance = (instance != null ? instance : new V1EndpointSlice());
    if (instance != null) {
          this.withAddressType(instance.getAddressType());
          this.withApiVersion(instance.getApiVersion());
          this.withEndpoints(instance.getEndpoints());
          this.withKind(instance.getKind());
          this.withMetadata(instance.getMetadata());
          this.withPorts(instance.getPorts());
        }
  }
  
  public String getAddressType() {
    return this.addressType;
  }
  
  public A withAddressType(String addressType) {
    this.addressType = addressType;
    return (A) this;
  }
  
  public boolean hasAddressType() {
    return this.addressType != null;
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public A addToEndpoints(int index,V1Endpoint item) {
    if (this.endpoints == null) {this.endpoints = new ArrayList<V1EndpointBuilder>();}
    V1EndpointBuilder builder = new V1EndpointBuilder(item);
    if (index < 0 || index >= endpoints.size()) { _visitables.get("endpoints").add(builder); endpoints.add(builder); } else { _visitables.get("endpoints").add(index, builder); endpoints.add(index, builder);}
    return (A)this;
  }
  
  public A setToEndpoints(int index,V1Endpoint item) {
    if (this.endpoints == null) {this.endpoints = new ArrayList<V1EndpointBuilder>();}
    V1EndpointBuilder builder = new V1EndpointBuilder(item);
    if (index < 0 || index >= endpoints.size()) { _visitables.get("endpoints").add(builder); endpoints.add(builder); } else { _visitables.get("endpoints").set(index, builder); endpoints.set(index, builder);}
    return (A)this;
  }
  
  public A addToEndpoints(io.kubernetes.client.openapi.models.V1Endpoint... items) {
    if (this.endpoints == null) {this.endpoints = new ArrayList<V1EndpointBuilder>();}
    for (V1Endpoint item : items) {V1EndpointBuilder builder = new V1EndpointBuilder(item);_visitables.get("endpoints").add(builder);this.endpoints.add(builder);} return (A)this;
  }
  
  public A addAllToEndpoints(Collection<V1Endpoint> items) {
    if (this.endpoints == null) {this.endpoints = new ArrayList<V1EndpointBuilder>();}
    for (V1Endpoint item : items) {V1EndpointBuilder builder = new V1EndpointBuilder(item);_visitables.get("endpoints").add(builder);this.endpoints.add(builder);} return (A)this;
  }
  
  public A removeFromEndpoints(io.kubernetes.client.openapi.models.V1Endpoint... items) {
    if (this.endpoints == null) return (A)this;
    for (V1Endpoint item : items) {V1EndpointBuilder builder = new V1EndpointBuilder(item);_visitables.get("endpoints").remove(builder); this.endpoints.remove(builder);} return (A)this;
  }
  
  public A removeAllFromEndpoints(Collection<V1Endpoint> items) {
    if (this.endpoints == null) return (A)this;
    for (V1Endpoint item : items) {V1EndpointBuilder builder = new V1EndpointBuilder(item);_visitables.get("endpoints").remove(builder); this.endpoints.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromEndpoints(Predicate<V1EndpointBuilder> predicate) {
    if (endpoints == null) return (A) this;
    final Iterator<V1EndpointBuilder> each = endpoints.iterator();
    final List visitables = _visitables.get("endpoints");
    while (each.hasNext()) {
      V1EndpointBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1Endpoint> buildEndpoints() {
    return this.endpoints != null ? build(endpoints) : null;
  }
  
  public V1Endpoint buildEndpoint(int index) {
    return this.endpoints.get(index).build();
  }
  
  public V1Endpoint buildFirstEndpoint() {
    return this.endpoints.get(0).build();
  }
  
  public V1Endpoint buildLastEndpoint() {
    return this.endpoints.get(endpoints.size() - 1).build();
  }
  
  public V1Endpoint buildMatchingEndpoint(Predicate<V1EndpointBuilder> predicate) {
      for (V1EndpointBuilder item : endpoints) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingEndpoint(Predicate<V1EndpointBuilder> predicate) {
      for (V1EndpointBuilder item : endpoints) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withEndpoints(List<V1Endpoint> endpoints) {
    if (this.endpoints != null) {
      this._visitables.get("endpoints").clear();
    }
    if (endpoints != null) {
        this.endpoints = new ArrayList();
        for (V1Endpoint item : endpoints) {
          this.addToEndpoints(item);
        }
    } else {
      this.endpoints = null;
    }
    return (A) this;
  }
  
  public A withEndpoints(io.kubernetes.client.openapi.models.V1Endpoint... endpoints) {
    if (this.endpoints != null) {
        this.endpoints.clear();
        _visitables.remove("endpoints");
    }
    if (endpoints != null) {
      for (V1Endpoint item : endpoints) {
        this.addToEndpoints(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasEndpoints() {
    return this.endpoints != null && !this.endpoints.isEmpty();
  }
  
  public EndpointsNested<A> addNewEndpoint() {
    return new EndpointsNested(-1, null);
  }
  
  public EndpointsNested<A> addNewEndpointLike(V1Endpoint item) {
    return new EndpointsNested(-1, item);
  }
  
  public EndpointsNested<A> setNewEndpointLike(int index,V1Endpoint item) {
    return new EndpointsNested(index, item);
  }
  
  public EndpointsNested<A> editEndpoint(int index) {
    if (endpoints.size() <= index) throw new RuntimeException("Can't edit endpoints. Index exceeds size.");
    return setNewEndpointLike(index, buildEndpoint(index));
  }
  
  public EndpointsNested<A> editFirstEndpoint() {
    if (endpoints.size() == 0) throw new RuntimeException("Can't edit first endpoints. The list is empty.");
    return setNewEndpointLike(0, buildEndpoint(0));
  }
  
  public EndpointsNested<A> editLastEndpoint() {
    int index = endpoints.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last endpoints. The list is empty.");
    return setNewEndpointLike(index, buildEndpoint(index));
  }
  
  public EndpointsNested<A> editMatchingEndpoint(Predicate<V1EndpointBuilder> predicate) {
    int index = -1;
    for (int i=0;i<endpoints.size();i++) { 
    if (predicate.test(endpoints.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching endpoints. No match found.");
    return setNewEndpointLike(index, buildEndpoint(index));
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public A withMetadata(V1ObjectMeta metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new V1ObjectMetaBuilder(metadata);
        this._visitables.get("metadata").add(this.metadata);
    } else {
        this.metadata = null;
        this._visitables.get("metadata").remove(this.metadata);
    }
    return (A) this;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new MetadataNested(item);
  }
  
  public MetadataNested<A> editMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
  }
  
  public A addToPorts(int index,DiscoveryV1EndpointPort item) {
    if (this.ports == null) {this.ports = new ArrayList<DiscoveryV1EndpointPortBuilder>();}
    DiscoveryV1EndpointPortBuilder builder = new DiscoveryV1EndpointPortBuilder(item);
    if (index < 0 || index >= ports.size()) { _visitables.get("ports").add(builder); ports.add(builder); } else { _visitables.get("ports").add(index, builder); ports.add(index, builder);}
    return (A)this;
  }
  
  public A setToPorts(int index,DiscoveryV1EndpointPort item) {
    if (this.ports == null) {this.ports = new ArrayList<DiscoveryV1EndpointPortBuilder>();}
    DiscoveryV1EndpointPortBuilder builder = new DiscoveryV1EndpointPortBuilder(item);
    if (index < 0 || index >= ports.size()) { _visitables.get("ports").add(builder); ports.add(builder); } else { _visitables.get("ports").set(index, builder); ports.set(index, builder);}
    return (A)this;
  }
  
  public A addToPorts(io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort... items) {
    if (this.ports == null) {this.ports = new ArrayList<DiscoveryV1EndpointPortBuilder>();}
    for (DiscoveryV1EndpointPort item : items) {DiscoveryV1EndpointPortBuilder builder = new DiscoveryV1EndpointPortBuilder(item);_visitables.get("ports").add(builder);this.ports.add(builder);} return (A)this;
  }
  
  public A addAllToPorts(Collection<DiscoveryV1EndpointPort> items) {
    if (this.ports == null) {this.ports = new ArrayList<DiscoveryV1EndpointPortBuilder>();}
    for (DiscoveryV1EndpointPort item : items) {DiscoveryV1EndpointPortBuilder builder = new DiscoveryV1EndpointPortBuilder(item);_visitables.get("ports").add(builder);this.ports.add(builder);} return (A)this;
  }
  
  public A removeFromPorts(io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort... items) {
    if (this.ports == null) return (A)this;
    for (DiscoveryV1EndpointPort item : items) {DiscoveryV1EndpointPortBuilder builder = new DiscoveryV1EndpointPortBuilder(item);_visitables.get("ports").remove(builder); this.ports.remove(builder);} return (A)this;
  }
  
  public A removeAllFromPorts(Collection<DiscoveryV1EndpointPort> items) {
    if (this.ports == null) return (A)this;
    for (DiscoveryV1EndpointPort item : items) {DiscoveryV1EndpointPortBuilder builder = new DiscoveryV1EndpointPortBuilder(item);_visitables.get("ports").remove(builder); this.ports.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromPorts(Predicate<DiscoveryV1EndpointPortBuilder> predicate) {
    if (ports == null) return (A) this;
    final Iterator<DiscoveryV1EndpointPortBuilder> each = ports.iterator();
    final List visitables = _visitables.get("ports");
    while (each.hasNext()) {
      DiscoveryV1EndpointPortBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<DiscoveryV1EndpointPort> buildPorts() {
    return this.ports != null ? build(ports) : null;
  }
  
  public DiscoveryV1EndpointPort buildPort(int index) {
    return this.ports.get(index).build();
  }
  
  public DiscoveryV1EndpointPort buildFirstPort() {
    return this.ports.get(0).build();
  }
  
  public DiscoveryV1EndpointPort buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }
  
  public DiscoveryV1EndpointPort buildMatchingPort(Predicate<DiscoveryV1EndpointPortBuilder> predicate) {
      for (DiscoveryV1EndpointPortBuilder item : ports) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingPort(Predicate<DiscoveryV1EndpointPortBuilder> predicate) {
      for (DiscoveryV1EndpointPortBuilder item : ports) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPorts(List<DiscoveryV1EndpointPort> ports) {
    if (this.ports != null) {
      this._visitables.get("ports").clear();
    }
    if (ports != null) {
        this.ports = new ArrayList();
        for (DiscoveryV1EndpointPort item : ports) {
          this.addToPorts(item);
        }
    } else {
      this.ports = null;
    }
    return (A) this;
  }
  
  public A withPorts(io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort... ports) {
    if (this.ports != null) {
        this.ports.clear();
        _visitables.remove("ports");
    }
    if (ports != null) {
      for (DiscoveryV1EndpointPort item : ports) {
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
  
  public PortsNested<A> addNewPortLike(DiscoveryV1EndpointPort item) {
    return new PortsNested(-1, item);
  }
  
  public PortsNested<A> setNewPortLike(int index,DiscoveryV1EndpointPort item) {
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
  
  public PortsNested<A> editMatchingPort(Predicate<DiscoveryV1EndpointPortBuilder> predicate) {
    int index = -1;
    for (int i=0;i<ports.size();i++) { 
    if (predicate.test(ports.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching ports. No match found.");
    return setNewPortLike(index, buildPort(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EndpointSliceFluent that = (V1EndpointSliceFluent) o;
    if (!java.util.Objects.equals(addressType, that.addressType)) return false;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(endpoints, that.endpoints)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(ports, that.ports)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(addressType,  apiVersion,  endpoints,  kind,  metadata,  ports,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (addressType != null) { sb.append("addressType:"); sb.append(addressType + ","); }
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (endpoints != null && !endpoints.isEmpty()) { sb.append("endpoints:"); sb.append(endpoints + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (ports != null && !ports.isEmpty()) { sb.append("ports:"); sb.append(ports); }
    sb.append("}");
    return sb.toString();
  }
  public class EndpointsNested<N> extends V1EndpointFluent<EndpointsNested<N>> implements Nested<N>{
    EndpointsNested(int index,V1Endpoint item) {
      this.index = index;
      this.builder = new V1EndpointBuilder(this, item);
    }
    V1EndpointBuilder builder;
    int index;
    
    public N and() {
      return (N) V1EndpointSliceFluent.this.setToEndpoints(index,builder.build());
    }
    
    public N endEndpoint() {
      return and();
    }
    
  
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1EndpointSliceFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class PortsNested<N> extends DiscoveryV1EndpointPortFluent<PortsNested<N>> implements Nested<N>{
    PortsNested(int index,DiscoveryV1EndpointPort item) {
      this.index = index;
      this.builder = new DiscoveryV1EndpointPortBuilder(this, item);
    }
    DiscoveryV1EndpointPortBuilder builder;
    int index;
    
    public N and() {
      return (N) V1EndpointSliceFluent.this.setToPorts(index,builder.build());
    }
    
    public N endPort() {
      return and();
    }
    
  
  }

}