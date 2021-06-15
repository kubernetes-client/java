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

public interface V1EndpointSubsetFluent<A extends io.kubernetes.client.openapi.models.V1EndpointSubsetFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToAddresses(int index,io.kubernetes.client.openapi.models.V1EndpointAddress item);
    public A setToAddresses(int index,io.kubernetes.client.openapi.models.V1EndpointAddress item);
    public A addToAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items);
    public A addAllToAddresses(java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointAddress> items);
    public A removeFromAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items);
    public A removeAllFromAddresses(java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointAddress> items);
    public A removeMatchingFromAddresses(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildAddresses instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress> getAddresses();
    public java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress> buildAddresses();
    public io.kubernetes.client.openapi.models.V1EndpointAddress buildAddress(int index);
    public io.kubernetes.client.openapi.models.V1EndpointAddress buildFirstAddress();
    public io.kubernetes.client.openapi.models.V1EndpointAddress buildLastAddress();
    public io.kubernetes.client.openapi.models.V1EndpointAddress buildMatchingAddress(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder> predicate);
    public java.lang.Boolean hasMatchingAddress(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder> predicate);
    public A withAddresses(java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress> addresses);
    public A withAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... addresses);
    public java.lang.Boolean hasAddresses();
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A> addNewAddress();
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A> addNewAddressLike(io.kubernetes.client.openapi.models.V1EndpointAddress item);
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A> setNewAddressLike(int index,io.kubernetes.client.openapi.models.V1EndpointAddress item);
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A> editAddress(int index);
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A> editFirstAddress();
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A> editLastAddress();
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A> editMatchingAddress(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder> predicate);
    public A addToNotReadyAddresses(int index,io.kubernetes.client.openapi.models.V1EndpointAddress item);
    public A setToNotReadyAddresses(int index,io.kubernetes.client.openapi.models.V1EndpointAddress item);
    public A addToNotReadyAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items);
    public A addAllToNotReadyAddresses(java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointAddress> items);
    public A removeFromNotReadyAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items);
    public A removeAllFromNotReadyAddresses(java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointAddress> items);
    public A removeMatchingFromNotReadyAddresses(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildNotReadyAddresses instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress> getNotReadyAddresses();
    public java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress> buildNotReadyAddresses();
    public io.kubernetes.client.openapi.models.V1EndpointAddress buildNotReadyAddress(int index);
    public io.kubernetes.client.openapi.models.V1EndpointAddress buildFirstNotReadyAddress();
    public io.kubernetes.client.openapi.models.V1EndpointAddress buildLastNotReadyAddress();
    public io.kubernetes.client.openapi.models.V1EndpointAddress buildMatchingNotReadyAddress(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder> predicate);
    public java.lang.Boolean hasMatchingNotReadyAddress(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder> predicate);
    public A withNotReadyAddresses(java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress> notReadyAddresses);
    public A withNotReadyAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... notReadyAddresses);
    public java.lang.Boolean hasNotReadyAddresses();
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A> addNewNotReadyAddress();
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A> addNewNotReadyAddressLike(io.kubernetes.client.openapi.models.V1EndpointAddress item);
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A> setNewNotReadyAddressLike(int index,io.kubernetes.client.openapi.models.V1EndpointAddress item);
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A> editNotReadyAddress(int index);
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A> editFirstNotReadyAddress();
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A> editLastNotReadyAddress();
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A> editMatchingNotReadyAddress(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder> predicate);
    public A addToPorts(int index,io.kubernetes.client.openapi.models.V1EndpointPort item);
    public A setToPorts(int index,io.kubernetes.client.openapi.models.V1EndpointPort item);
    public A addToPorts(io.kubernetes.client.openapi.models.V1EndpointPort... items);
    public A addAllToPorts(java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointPort> items);
    public A removeFromPorts(io.kubernetes.client.openapi.models.V1EndpointPort... items);
    public A removeAllFromPorts(java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointPort> items);
    public A removeMatchingFromPorts(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointPortBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPorts instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1EndpointPort> getPorts();
    public java.util.List<io.kubernetes.client.openapi.models.V1EndpointPort> buildPorts();
    public io.kubernetes.client.openapi.models.V1EndpointPort buildPort(int index);
    public io.kubernetes.client.openapi.models.V1EndpointPort buildFirstPort();
    public io.kubernetes.client.openapi.models.V1EndpointPort buildLastPort();
    public io.kubernetes.client.openapi.models.V1EndpointPort buildMatchingPort(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointPortBuilder> predicate);
    public java.lang.Boolean hasMatchingPort(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointPortBuilder> predicate);
    public A withPorts(java.util.List<io.kubernetes.client.openapi.models.V1EndpointPort> ports);
    public A withPorts(io.kubernetes.client.openapi.models.V1EndpointPort... ports);
    public java.lang.Boolean hasPorts();
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> addNewPort();
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> addNewPortLike(io.kubernetes.client.openapi.models.V1EndpointPort item);
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> setNewPortLike(int index,io.kubernetes.client.openapi.models.V1EndpointPort item);
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> editPort(int index);
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> editFirstPort();
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> editLastPort();
    public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> editMatchingPort(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointPortBuilder> predicate);
    public interface AddressesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1EndpointAddressFluent<io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<N>> {

            public N and();
            public N endAddress();    }


    public interface NotReadyAddressesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1EndpointAddressFluent<io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<N>> {

            public N and();
            public N endNotReadyAddress();    }


    public interface PortsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1EndpointPortFluent<io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<N>> {

            public N and();
            public N endPort();    }


}
