package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1AffinityFluent<A extends io.kubernetes.client.openapi.models.V1AffinityFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildNodeAffinity instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1NodeAffinity getNodeAffinity();
    public io.kubernetes.client.openapi.models.V1NodeAffinity buildNodeAffinity();
    public A withNodeAffinity(io.kubernetes.client.openapi.models.V1NodeAffinity nodeAffinity);
    public java.lang.Boolean hasNodeAffinity();
    public io.kubernetes.client.openapi.models.V1AffinityFluent.NodeAffinityNested<A> withNewNodeAffinity();
    public io.kubernetes.client.openapi.models.V1AffinityFluent.NodeAffinityNested<A> withNewNodeAffinityLike(io.kubernetes.client.openapi.models.V1NodeAffinity item);
    public io.kubernetes.client.openapi.models.V1AffinityFluent.NodeAffinityNested<A> editNodeAffinity();
    public io.kubernetes.client.openapi.models.V1AffinityFluent.NodeAffinityNested<A> editOrNewNodeAffinity();
    public io.kubernetes.client.openapi.models.V1AffinityFluent.NodeAffinityNested<A> editOrNewNodeAffinityLike(io.kubernetes.client.openapi.models.V1NodeAffinity item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPodAffinity instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1PodAffinity getPodAffinity();
    public io.kubernetes.client.openapi.models.V1PodAffinity buildPodAffinity();
    public A withPodAffinity(io.kubernetes.client.openapi.models.V1PodAffinity podAffinity);
    public java.lang.Boolean hasPodAffinity();
    public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAffinityNested<A> withNewPodAffinity();
    public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAffinityNested<A> withNewPodAffinityLike(io.kubernetes.client.openapi.models.V1PodAffinity item);
    public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAffinityNested<A> editPodAffinity();
    public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAffinityNested<A> editOrNewPodAffinity();
    public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAffinityNested<A> editOrNewPodAffinityLike(io.kubernetes.client.openapi.models.V1PodAffinity item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPodAntiAffinity instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1PodAntiAffinity getPodAntiAffinity();
    public io.kubernetes.client.openapi.models.V1PodAntiAffinity buildPodAntiAffinity();
    public A withPodAntiAffinity(io.kubernetes.client.openapi.models.V1PodAntiAffinity podAntiAffinity);
    public java.lang.Boolean hasPodAntiAffinity();
    public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAntiAffinityNested<A> withNewPodAntiAffinity();
    public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAntiAffinityNested<A> withNewPodAntiAffinityLike(io.kubernetes.client.openapi.models.V1PodAntiAffinity item);
    public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAntiAffinityNested<A> editPodAntiAffinity();
    public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAntiAffinityNested<A> editOrNewPodAntiAffinity();
    public io.kubernetes.client.openapi.models.V1AffinityFluent.PodAntiAffinityNested<A> editOrNewPodAntiAffinityLike(io.kubernetes.client.openapi.models.V1PodAntiAffinity item);
    public interface NodeAffinityNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1NodeAffinityFluent<io.kubernetes.client.openapi.models.V1AffinityFluent.NodeAffinityNested<N>> {

            public N and();
            public N endNodeAffinity();    }


    public interface PodAffinityNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PodAffinityFluent<io.kubernetes.client.openapi.models.V1AffinityFluent.PodAffinityNested<N>> {

            public N and();
            public N endPodAffinity();    }


    public interface PodAntiAffinityNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent<io.kubernetes.client.openapi.models.V1AffinityFluent.PodAntiAffinityNested<N>> {

            public N and();
            public N endPodAntiAffinity();    }


}
