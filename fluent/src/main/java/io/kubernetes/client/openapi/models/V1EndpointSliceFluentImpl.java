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
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1EndpointSliceFluentImpl<A extends V1EndpointSliceFluent<A>> extends BaseFluent<A> implements V1EndpointSliceFluent<A>{
  public V1EndpointSliceFluentImpl() {
  }
  public V1EndpointSliceFluentImpl(V1EndpointSlice instance) {
    this.withAddressType(instance.getAddressType());

    this.withApiVersion(instance.getApiVersion());

    this.withEndpoints(instance.getEndpoints());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withPorts(instance.getPorts());

  }
  private String addressType;
  private String apiVersion;
  private ArrayList<V1EndpointBuilder> endpoints;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private ArrayList<DiscoveryV1EndpointPortBuilder> ports;
  public String getAddressType() {
    return this.addressType;
  }
  public A withAddressType(String addressType) {
    this.addressType=addressType; return (A) this;
  }
  public Boolean hasAddressType() {
    return this.addressType != null;
  }
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public A addToEndpoints(Integer index,V1Endpoint item) {
    if (this.endpoints == null) {this.endpoints = new ArrayList<V1EndpointBuilder>();}
    V1EndpointBuilder builder = new V1EndpointBuilder(item);_visitables.get("endpoints").add(index >= 0 ? index : _visitables.get("endpoints").size(), builder);this.endpoints.add(index >= 0 ? index : endpoints.size(), builder); return (A)this;
  }
  public A setToEndpoints(Integer index,V1Endpoint item) {
    if (this.endpoints == null) {this.endpoints = new ArrayList<V1EndpointBuilder>();}
    V1EndpointBuilder builder = new V1EndpointBuilder(item);
    if (index < 0 || index >= _visitables.get("endpoints").size()) { _visitables.get("endpoints").add(builder); } else { _visitables.get("endpoints").set(index, builder);}
    if (index < 0 || index >= endpoints.size()) { endpoints.add(builder); } else { endpoints.set(index, builder);}
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
    for (V1Endpoint item : items) {V1EndpointBuilder builder = new V1EndpointBuilder(item);_visitables.get("endpoints").remove(builder);if (this.endpoints != null) {this.endpoints.remove(builder);}} return (A)this;
  }
  public A removeAllFromEndpoints(Collection<V1Endpoint> items) {
    for (V1Endpoint item : items) {V1EndpointBuilder builder = new V1EndpointBuilder(item);_visitables.get("endpoints").remove(builder);if (this.endpoints != null) {this.endpoints.remove(builder);}} return (A)this;
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
  
  /**
   * This method has been deprecated, please use method buildEndpoints instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Endpoint> getEndpoints() {
    return endpoints != null ? build(endpoints) : null;
  }
  public List<V1Endpoint> buildEndpoints() {
    return endpoints != null ? build(endpoints) : null;
  }
  public V1Endpoint buildEndpoint(Integer index) {
    return this.endpoints.get(index).build();
  }
  public V1Endpoint buildFirstEndpoint() {
    return this.endpoints.get(0).build();
  }
  public V1Endpoint buildLastEndpoint() {
    return this.endpoints.get(endpoints.size() - 1).build();
  }
  public V1Endpoint buildMatchingEndpoint(Predicate<V1EndpointBuilder> predicate) {
    for (V1EndpointBuilder item: endpoints) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingEndpoint(Predicate<V1EndpointBuilder> predicate) {
    for (V1EndpointBuilder item: endpoints) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withEndpoints(List<V1Endpoint> endpoints) {
    if (this.endpoints != null) { _visitables.get("endpoints").removeAll(this.endpoints);}
    if (endpoints != null) {this.endpoints = new ArrayList(); for (V1Endpoint item : endpoints){this.addToEndpoints(item);}} else { this.endpoints = null;} return (A) this;
  }
  public A withEndpoints(io.kubernetes.client.openapi.models.V1Endpoint... endpoints) {
    if (this.endpoints != null) {this.endpoints.clear();}
    if (endpoints != null) {for (V1Endpoint item :endpoints){ this.addToEndpoints(item);}} return (A) this;
  }
  public Boolean hasEndpoints() {
    return endpoints != null && !endpoints.isEmpty();
  }
  public V1EndpointSliceFluent.EndpointsNested<A> addNewEndpoint() {
    return new V1EndpointSliceFluentImpl.EndpointsNestedImpl();
  }
  public V1EndpointSliceFluent.EndpointsNested<A> addNewEndpointLike(V1Endpoint item) {
    return new V1EndpointSliceFluentImpl.EndpointsNestedImpl(-1, item);
  }
  public V1EndpointSliceFluent.EndpointsNested<A> setNewEndpointLike(Integer index,V1Endpoint item) {
    return new V1EndpointSliceFluentImpl.EndpointsNestedImpl(index, item);
  }
  public V1EndpointSliceFluent.EndpointsNested<A> editEndpoint(Integer index) {
    if (endpoints.size() <= index) throw new RuntimeException("Can't edit endpoints. Index exceeds size.");
    return setNewEndpointLike(index, buildEndpoint(index));
  }
  public V1EndpointSliceFluent.EndpointsNested<A> editFirstEndpoint() {
    if (endpoints.size() == 0) throw new RuntimeException("Can't edit first endpoints. The list is empty.");
    return setNewEndpointLike(0, buildEndpoint(0));
  }
  public V1EndpointSliceFluent.EndpointsNested<A> editLastEndpoint() {
    int index = endpoints.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last endpoints. The list is empty.");
    return setNewEndpointLike(index, buildEndpoint(index));
  }
  public V1EndpointSliceFluent.EndpointsNested<A> editMatchingEndpoint(Predicate<V1EndpointBuilder> predicate) {
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
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ObjectMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V1EndpointSliceFluent.MetadataNested<A> withNewMetadata() {
    return new V1EndpointSliceFluentImpl.MetadataNestedImpl();
  }
  public V1EndpointSliceFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1EndpointSliceFluentImpl.MetadataNestedImpl(item);
  }
  public V1EndpointSliceFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1EndpointSliceFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1EndpointSliceFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public A addToPorts(Integer index,DiscoveryV1EndpointPort item) {
    if (this.ports == null) {this.ports = new ArrayList<DiscoveryV1EndpointPortBuilder>();}
    DiscoveryV1EndpointPortBuilder builder = new DiscoveryV1EndpointPortBuilder(item);_visitables.get("ports").add(index >= 0 ? index : _visitables.get("ports").size(), builder);this.ports.add(index >= 0 ? index : ports.size(), builder); return (A)this;
  }
  public A setToPorts(Integer index,DiscoveryV1EndpointPort item) {
    if (this.ports == null) {this.ports = new ArrayList<DiscoveryV1EndpointPortBuilder>();}
    DiscoveryV1EndpointPortBuilder builder = new DiscoveryV1EndpointPortBuilder(item);
    if (index < 0 || index >= _visitables.get("ports").size()) { _visitables.get("ports").add(builder); } else { _visitables.get("ports").set(index, builder);}
    if (index < 0 || index >= ports.size()) { ports.add(builder); } else { ports.set(index, builder);}
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
    for (DiscoveryV1EndpointPort item : items) {DiscoveryV1EndpointPortBuilder builder = new DiscoveryV1EndpointPortBuilder(item);_visitables.get("ports").remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
  }
  public A removeAllFromPorts(Collection<DiscoveryV1EndpointPort> items) {
    for (DiscoveryV1EndpointPort item : items) {DiscoveryV1EndpointPortBuilder builder = new DiscoveryV1EndpointPortBuilder(item);_visitables.get("ports").remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
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
  
  /**
   * This method has been deprecated, please use method buildPorts instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<DiscoveryV1EndpointPort> getPorts() {
    return ports != null ? build(ports) : null;
  }
  public List<DiscoveryV1EndpointPort> buildPorts() {
    return ports != null ? build(ports) : null;
  }
  public DiscoveryV1EndpointPort buildPort(Integer index) {
    return this.ports.get(index).build();
  }
  public DiscoveryV1EndpointPort buildFirstPort() {
    return this.ports.get(0).build();
  }
  public DiscoveryV1EndpointPort buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }
  public DiscoveryV1EndpointPort buildMatchingPort(Predicate<DiscoveryV1EndpointPortBuilder> predicate) {
    for (DiscoveryV1EndpointPortBuilder item: ports) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingPort(Predicate<DiscoveryV1EndpointPortBuilder> predicate) {
    for (DiscoveryV1EndpointPortBuilder item: ports) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withPorts(List<DiscoveryV1EndpointPort> ports) {
    if (this.ports != null) { _visitables.get("ports").removeAll(this.ports);}
    if (ports != null) {this.ports = new ArrayList(); for (DiscoveryV1EndpointPort item : ports){this.addToPorts(item);}} else { this.ports = null;} return (A) this;
  }
  public A withPorts(io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort... ports) {
    if (this.ports != null) {this.ports.clear();}
    if (ports != null) {for (DiscoveryV1EndpointPort item :ports){ this.addToPorts(item);}} return (A) this;
  }
  public Boolean hasPorts() {
    return ports != null && !ports.isEmpty();
  }
  public V1EndpointSliceFluent.PortsNested<A> addNewPort() {
    return new V1EndpointSliceFluentImpl.PortsNestedImpl();
  }
  public V1EndpointSliceFluent.PortsNested<A> addNewPortLike(DiscoveryV1EndpointPort item) {
    return new V1EndpointSliceFluentImpl.PortsNestedImpl(-1, item);
  }
  public V1EndpointSliceFluent.PortsNested<A> setNewPortLike(Integer index,DiscoveryV1EndpointPort item) {
    return new V1EndpointSliceFluentImpl.PortsNestedImpl(index, item);
  }
  public V1EndpointSliceFluent.PortsNested<A> editPort(Integer index) {
    if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
    return setNewPortLike(index, buildPort(index));
  }
  public V1EndpointSliceFluent.PortsNested<A> editFirstPort() {
    if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
    return setNewPortLike(0, buildPort(0));
  }
  public V1EndpointSliceFluent.PortsNested<A> editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
    return setNewPortLike(index, buildPort(index));
  }
  public V1EndpointSliceFluent.PortsNested<A> editMatchingPort(Predicate<DiscoveryV1EndpointPortBuilder> predicate) {
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
    V1EndpointSliceFluentImpl that = (V1EndpointSliceFluentImpl) o;
    if (addressType != null ? !addressType.equals(that.addressType) :that.addressType != null) return false;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (endpoints != null ? !endpoints.equals(that.endpoints) :that.endpoints != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (ports != null ? !ports.equals(that.ports) :that.ports != null) return false;
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
  class EndpointsNestedImpl<N> extends V1EndpointFluentImpl<V1EndpointSliceFluent.EndpointsNested<N>> implements V1EndpointSliceFluent.EndpointsNested<N>,Nested<N>{
    EndpointsNestedImpl(Integer index,V1Endpoint item) {
      this.index = index;
      this.builder = new V1EndpointBuilder(this, item);
    }
    EndpointsNestedImpl() {
      this.index = -1;
      this.builder = new V1EndpointBuilder(this);
    }
    V1EndpointBuilder builder;
    Integer index;
    public N and() {
      return (N) V1EndpointSliceFluentImpl.this.setToEndpoints(index,builder.build());
    }
    public N endEndpoint() {
      return and();
    }
    
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1EndpointSliceFluent.MetadataNested<N>> implements V1EndpointSliceFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1EndpointSliceFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class PortsNestedImpl<N> extends DiscoveryV1EndpointPortFluentImpl<V1EndpointSliceFluent.PortsNested<N>> implements V1EndpointSliceFluent.PortsNested<N>,Nested<N>{
    PortsNestedImpl(Integer index,DiscoveryV1EndpointPort item) {
      this.index = index;
      this.builder = new DiscoveryV1EndpointPortBuilder(this, item);
    }
    PortsNestedImpl() {
      this.index = -1;
      this.builder = new DiscoveryV1EndpointPortBuilder(this);
    }
    DiscoveryV1EndpointPortBuilder builder;
    Integer index;
    public N and() {
      return (N) V1EndpointSliceFluentImpl.this.setToPorts(index,builder.build());
    }
    public N endPort() {
      return and();
    }
    
  }
  
}