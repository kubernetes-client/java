package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1NetworkPolicyPeerFluent<A extends io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildIpBlock instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1IPBlock getIpBlock();
    public io.kubernetes.client.openapi.models.V1IPBlock buildIpBlock();
    public A withIpBlock(io.kubernetes.client.openapi.models.V1IPBlock ipBlock);
    public java.lang.Boolean hasIpBlock();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.IpBlockNested<A> withNewIpBlock();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.IpBlockNested<A> withNewIpBlockLike(io.kubernetes.client.openapi.models.V1IPBlock item);
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.IpBlockNested<A> editIpBlock();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.IpBlockNested<A> editOrNewIpBlock();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.IpBlockNested<A> editOrNewIpBlockLike(io.kubernetes.client.openapi.models.V1IPBlock item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildNamespaceSelector instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LabelSelector getNamespaceSelector();
    public io.kubernetes.client.openapi.models.V1LabelSelector buildNamespaceSelector();
    public A withNamespaceSelector(io.kubernetes.client.openapi.models.V1LabelSelector namespaceSelector);
    public java.lang.Boolean hasNamespaceSelector();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A> withNewNamespaceSelector();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A> withNewNamespaceSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A> editNamespaceSelector();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelector();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPodSelector instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LabelSelector getPodSelector();
    public io.kubernetes.client.openapi.models.V1LabelSelector buildPodSelector();
    public A withPodSelector(io.kubernetes.client.openapi.models.V1LabelSelector podSelector);
    public java.lang.Boolean hasPodSelector();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.PodSelectorNested<A> withNewPodSelector();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.PodSelectorNested<A> withNewPodSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.PodSelectorNested<A> editPodSelector();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.PodSelectorNested<A> editOrNewPodSelector();
    public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.PodSelectorNested<A> editOrNewPodSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public interface IpBlockNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1IPBlockFluent<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.IpBlockNested<N>> {

            public N and();
            public N endIpBlock();    }


    public interface NamespaceSelectorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorFluent<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.NamespaceSelectorNested<N>> {

            public N and();
            public N endNamespaceSelector();    }


    public interface PodSelectorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorFluent<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.PodSelectorNested<N>> {

            public N and();
            public N endPodSelector();    }


}
