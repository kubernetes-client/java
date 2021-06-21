package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1NetworkPolicyIngressRuleFluent<A extends io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToFrom(int index,io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item);
    public A setToFrom(int index,io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item);
    public A addToFrom(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items);
    public A addAllToFrom(java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> items);
    public A removeFromFrom(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items);
    public A removeAllFromFrom(java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> items);
    public A removeMatchingFromFrom(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildFrom instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> getFrom();
    public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> buildFrom();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildFrom(int index);
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildFirstFrom();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildLastFrom();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildMatchingFrom(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder> predicate);
    public java.lang.Boolean hasMatchingFrom(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder> predicate);
    public A withFrom(java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> from);
    public A withFrom(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... from);
    public java.lang.Boolean hasFrom();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A> addNewFrom();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A> addNewFromLike(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item);
    public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A> setNewFromLike(int index,io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item);
    public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A> editFrom(int index);
    public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A> editFirstFrom();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A> editLastFrom();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A> editMatchingFrom(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder> predicate);
    public A addToPorts(int index,io.kubernetes.client.openapi.models.V1NetworkPolicyPort item);
    public A setToPorts(int index,io.kubernetes.client.openapi.models.V1NetworkPolicyPort item);
    public A addToPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... items);
    public A addAllToPorts(java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPort> items);
    public A removeFromPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... items);
    public A removeAllFromPorts(java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPort> items);
    public A removeMatchingFromPorts(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPorts instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPort> getPorts();
    public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPort> buildPorts();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPort buildPort(int index);
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPort buildFirstPort();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPort buildLastPort();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPort buildMatchingPort(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder> predicate);
    public java.lang.Boolean hasMatchingPort(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder> predicate);
    public A withPorts(java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPort> ports);
    public A withPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... ports);
    public java.lang.Boolean hasPorts();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A> addNewPort();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A> addNewPortLike(io.kubernetes.client.openapi.models.V1NetworkPolicyPort item);
    public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A> setNewPortLike(int index,io.kubernetes.client.openapi.models.V1NetworkPolicyPort item);
    public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A> editPort(int index);
    public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A> editFirstPort();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A> editLastPort();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A> editMatchingPort(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder> predicate);
    public interface FromNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent<io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<N>> {

            public N and();
            public N endFrom();    }


    public interface PortsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1NetworkPolicyPortFluent<io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<N>> {

            public N and();
            public N endPort();    }


}
