package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1EndpointSliceFluent<A extends V1EndpointSliceFluent<A>> extends Fluent<A>{
  public String getAddressType();
  public A withAddressType(String addressType);
  public Boolean hasAddressType();
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToEndpoints(Integer index,V1Endpoint item);
  public A setToEndpoints(Integer index,V1Endpoint item);
  public A addToEndpoints(io.kubernetes.client.openapi.models.V1Endpoint... items);
  public A addAllToEndpoints(Collection<V1Endpoint> items);
  public A removeFromEndpoints(io.kubernetes.client.openapi.models.V1Endpoint... items);
  public A removeAllFromEndpoints(Collection<V1Endpoint> items);
  public A removeMatchingFromEndpoints(Predicate<V1EndpointBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildEndpoints instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Endpoint> getEndpoints();
  public List<V1Endpoint> buildEndpoints();
  public V1Endpoint buildEndpoint(Integer index);
  public V1Endpoint buildFirstEndpoint();
  public V1Endpoint buildLastEndpoint();
  public V1Endpoint buildMatchingEndpoint(Predicate<V1EndpointBuilder> predicate);
  public Boolean hasMatchingEndpoint(Predicate<V1EndpointBuilder> predicate);
  public A withEndpoints(List<V1Endpoint> endpoints);
  public A withEndpoints(io.kubernetes.client.openapi.models.V1Endpoint... endpoints);
  public Boolean hasEndpoints();
  public V1EndpointSliceFluent.EndpointsNested<A> addNewEndpoint();
  public V1EndpointSliceFluent.EndpointsNested<A> addNewEndpointLike(V1Endpoint item);
  public V1EndpointSliceFluent.EndpointsNested<A> setNewEndpointLike(Integer index,V1Endpoint item);
  public V1EndpointSliceFluent.EndpointsNested<A> editEndpoint(Integer index);
  public V1EndpointSliceFluent.EndpointsNested<A> editFirstEndpoint();
  public V1EndpointSliceFluent.EndpointsNested<A> editLastEndpoint();
  public V1EndpointSliceFluent.EndpointsNested<A> editMatchingEndpoint(Predicate<V1EndpointBuilder> predicate);
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();
  public V1ObjectMeta buildMetadata();
  public A withMetadata(V1ObjectMeta metadata);
  public Boolean hasMetadata();
  public V1EndpointSliceFluent.MetadataNested<A> withNewMetadata();
  public V1EndpointSliceFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1EndpointSliceFluent.MetadataNested<A> editMetadata();
  public V1EndpointSliceFluent.MetadataNested<A> editOrNewMetadata();
  public V1EndpointSliceFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  public A addToPorts(Integer index,DiscoveryV1EndpointPort item);
  public A setToPorts(Integer index,DiscoveryV1EndpointPort item);
  public A addToPorts(io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort... items);
  public A addAllToPorts(Collection<DiscoveryV1EndpointPort> items);
  public A removeFromPorts(io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort... items);
  public A removeAllFromPorts(Collection<DiscoveryV1EndpointPort> items);
  public A removeMatchingFromPorts(Predicate<DiscoveryV1EndpointPortBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildPorts instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<DiscoveryV1EndpointPort> getPorts();
  public List<DiscoveryV1EndpointPort> buildPorts();
  public DiscoveryV1EndpointPort buildPort(Integer index);
  public DiscoveryV1EndpointPort buildFirstPort();
  public DiscoveryV1EndpointPort buildLastPort();
  public DiscoveryV1EndpointPort buildMatchingPort(Predicate<DiscoveryV1EndpointPortBuilder> predicate);
  public Boolean hasMatchingPort(Predicate<DiscoveryV1EndpointPortBuilder> predicate);
  public A withPorts(List<DiscoveryV1EndpointPort> ports);
  public A withPorts(io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort... ports);
  public Boolean hasPorts();
  public V1EndpointSliceFluent.PortsNested<A> addNewPort();
  public V1EndpointSliceFluent.PortsNested<A> addNewPortLike(DiscoveryV1EndpointPort item);
  public V1EndpointSliceFluent.PortsNested<A> setNewPortLike(Integer index,DiscoveryV1EndpointPort item);
  public V1EndpointSliceFluent.PortsNested<A> editPort(Integer index);
  public V1EndpointSliceFluent.PortsNested<A> editFirstPort();
  public V1EndpointSliceFluent.PortsNested<A> editLastPort();
  public V1EndpointSliceFluent.PortsNested<A> editMatchingPort(Predicate<DiscoveryV1EndpointPortBuilder> predicate);
  public interface EndpointsNested<N> extends Nested<N>,V1EndpointFluent<V1EndpointSliceFluent.EndpointsNested<N>>{
    public N and();
    public N endEndpoint();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1EndpointSliceFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface PortsNested<N> extends Nested<N>,DiscoveryV1EndpointPortFluent<V1EndpointSliceFluent.PortsNested<N>>{
    public N and();
    public N endPort();
    
  }
  
}