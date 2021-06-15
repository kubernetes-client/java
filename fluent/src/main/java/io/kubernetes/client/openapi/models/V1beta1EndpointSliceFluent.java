package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.util.Collection;

public interface V1beta1EndpointSliceFluent<A extends io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getAddressType();
    public A withAddressType(java.lang.String addressType);
    public java.lang.Boolean hasAddressType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withAddressType instead.
     */
        public A withNewAddressType(java.lang.String original);
    public java.lang.String getApiVersion();
    public A withApiVersion(java.lang.String apiVersion);
    public java.lang.Boolean hasApiVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original);
    public A addToEndpoints(int index,io.kubernetes.client.openapi.models.V1beta1Endpoint item);
    public A setToEndpoints(int index,io.kubernetes.client.openapi.models.V1beta1Endpoint item);
    public A addToEndpoints(io.kubernetes.client.openapi.models.V1beta1Endpoint... items);
    public A addAllToEndpoints(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1Endpoint> items);
    public A removeFromEndpoints(io.kubernetes.client.openapi.models.V1beta1Endpoint... items);
    public A removeAllFromEndpoints(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1Endpoint> items);
    public A removeMatchingFromEndpoints(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1EndpointBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildEndpoints instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1Endpoint> getEndpoints();
    public java.util.List<io.kubernetes.client.openapi.models.V1beta1Endpoint> buildEndpoints();
    public io.kubernetes.client.openapi.models.V1beta1Endpoint buildEndpoint(int index);
    public io.kubernetes.client.openapi.models.V1beta1Endpoint buildFirstEndpoint();
    public io.kubernetes.client.openapi.models.V1beta1Endpoint buildLastEndpoint();
    public io.kubernetes.client.openapi.models.V1beta1Endpoint buildMatchingEndpoint(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1EndpointBuilder> predicate);
    public java.lang.Boolean hasMatchingEndpoint(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1EndpointBuilder> predicate);
    public A withEndpoints(java.util.List<io.kubernetes.client.openapi.models.V1beta1Endpoint> endpoints);
    public A withEndpoints(io.kubernetes.client.openapi.models.V1beta1Endpoint... endpoints);
    public java.lang.Boolean hasEndpoints();
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.EndpointsNested<A> addNewEndpoint();
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.EndpointsNested<A> addNewEndpointLike(io.kubernetes.client.openapi.models.V1beta1Endpoint item);
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.EndpointsNested<A> setNewEndpointLike(int index,io.kubernetes.client.openapi.models.V1beta1Endpoint item);
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.EndpointsNested<A> editEndpoint(int index);
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.EndpointsNested<A> editFirstEndpoint();
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.EndpointsNested<A> editLastEndpoint();
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.EndpointsNested<A> editMatchingEndpoint(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1EndpointBuilder> predicate);
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();
    public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
    public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
    public java.lang.Boolean hasMetadata();
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.MetadataNested<A> withNewMetadata();
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.MetadataNested<A> editMetadata();
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.MetadataNested<A> editOrNewMetadata();
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public A addToPorts(int index,io.kubernetes.client.openapi.models.V1beta1EndpointPort item);
    public A setToPorts(int index,io.kubernetes.client.openapi.models.V1beta1EndpointPort item);
    public A addToPorts(io.kubernetes.client.openapi.models.V1beta1EndpointPort... items);
    public A addAllToPorts(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1EndpointPort> items);
    public A removeFromPorts(io.kubernetes.client.openapi.models.V1beta1EndpointPort... items);
    public A removeAllFromPorts(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1EndpointPort> items);
    public A removeMatchingFromPorts(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1EndpointPortBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPorts instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1EndpointPort> getPorts();
    public java.util.List<io.kubernetes.client.openapi.models.V1beta1EndpointPort> buildPorts();
    public io.kubernetes.client.openapi.models.V1beta1EndpointPort buildPort(int index);
    public io.kubernetes.client.openapi.models.V1beta1EndpointPort buildFirstPort();
    public io.kubernetes.client.openapi.models.V1beta1EndpointPort buildLastPort();
    public io.kubernetes.client.openapi.models.V1beta1EndpointPort buildMatchingPort(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1EndpointPortBuilder> predicate);
    public java.lang.Boolean hasMatchingPort(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1EndpointPortBuilder> predicate);
    public A withPorts(java.util.List<io.kubernetes.client.openapi.models.V1beta1EndpointPort> ports);
    public A withPorts(io.kubernetes.client.openapi.models.V1beta1EndpointPort... ports);
    public java.lang.Boolean hasPorts();
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.PortsNested<A> addNewPort();
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.PortsNested<A> addNewPortLike(io.kubernetes.client.openapi.models.V1beta1EndpointPort item);
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.PortsNested<A> setNewPortLike(int index,io.kubernetes.client.openapi.models.V1beta1EndpointPort item);
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.PortsNested<A> editPort(int index);
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.PortsNested<A> editFirstPort();
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.PortsNested<A> editLastPort();
    public io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.PortsNested<A> editMatchingPort(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1EndpointPortBuilder> predicate);
    public interface EndpointsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1EndpointFluent<io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.EndpointsNested<N>> {

            public N and();
            public N endEndpoint();    }


    public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.MetadataNested<N>> {

            public N and();
            public N endMetadata();    }


    public interface PortsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1EndpointPortFluent<io.kubernetes.client.openapi.models.V1beta1EndpointSliceFluent.PortsNested<N>> {

            public N and();
            public N endPort();    }


}
