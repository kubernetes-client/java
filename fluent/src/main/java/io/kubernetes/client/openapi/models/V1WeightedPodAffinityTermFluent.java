package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1WeightedPodAffinityTermFluent<A extends io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPodAffinityTerm instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1PodAffinityTerm getPodAffinityTerm();
    public io.kubernetes.client.openapi.models.V1PodAffinityTerm buildPodAffinityTerm();
    public A withPodAffinityTerm(io.kubernetes.client.openapi.models.V1PodAffinityTerm podAffinityTerm);
    public java.lang.Boolean hasPodAffinityTerm();
    public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> withNewPodAffinityTerm();
    public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> withNewPodAffinityTermLike(io.kubernetes.client.openapi.models.V1PodAffinityTerm item);
    public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editPodAffinityTerm();
    public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editOrNewPodAffinityTerm();
    public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editOrNewPodAffinityTermLike(io.kubernetes.client.openapi.models.V1PodAffinityTerm item);
    public java.lang.Integer getWeight();
    public A withWeight(java.lang.Integer weight);
    public java.lang.Boolean hasWeight();
    public interface PodAffinityTermNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<N>> {

            public N and();
            public N endPodAffinityTerm();    }


}
