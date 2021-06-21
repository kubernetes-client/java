package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1WeightedPodAffinityTermFluentImpl<A extends io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent<A> {

    private io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder podAffinityTerm;
    private java.lang.Integer weight;

    public V1WeightedPodAffinityTermFluentImpl() {
    }

    public V1WeightedPodAffinityTermFluentImpl(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm instance) {
        this.withPodAffinityTerm(instance.getPodAffinityTerm());
        
        this.withWeight(instance.getWeight());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPodAffinityTerm instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1PodAffinityTerm getPodAffinityTerm() {
        return this.podAffinityTerm!=null?this.podAffinityTerm.build():null;
    }

    public io.kubernetes.client.openapi.models.V1PodAffinityTerm buildPodAffinityTerm() {
        return this.podAffinityTerm!=null?this.podAffinityTerm.build():null;
    }

    public A withPodAffinityTerm(io.kubernetes.client.openapi.models.V1PodAffinityTerm podAffinityTerm) {
        _visitables.get("podAffinityTerm").remove(this.podAffinityTerm);
        if (podAffinityTerm!=null){ this.podAffinityTerm= new io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder(podAffinityTerm); _visitables.get("podAffinityTerm").add(this.podAffinityTerm);} return (A) this;
    }

    public java.lang.Boolean hasPodAffinityTerm() {
        return this.podAffinityTerm != null;
    }

    public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> withNewPodAffinityTerm() {
        return new io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluentImpl.PodAffinityTermNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> withNewPodAffinityTermLike(io.kubernetes.client.openapi.models.V1PodAffinityTerm item) {
        return new io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluentImpl.PodAffinityTermNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editPodAffinityTerm() {
        return withNewPodAffinityTermLike(getPodAffinityTerm());
    }

    public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editOrNewPodAffinityTerm() {
        return withNewPodAffinityTermLike(getPodAffinityTerm() != null ? getPodAffinityTerm(): new io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editOrNewPodAffinityTermLike(io.kubernetes.client.openapi.models.V1PodAffinityTerm item) {
        return withNewPodAffinityTermLike(getPodAffinityTerm() != null ? getPodAffinityTerm(): item);
    }

    public java.lang.Integer getWeight() {
        return this.weight;
    }

    public A withWeight(java.lang.Integer weight) {
        this.weight=weight; return (A) this;
    }

    public java.lang.Boolean hasWeight() {
        return this.weight != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1WeightedPodAffinityTermFluentImpl that = (V1WeightedPodAffinityTermFluentImpl) o;
        if (podAffinityTerm != null ? !podAffinityTerm.equals(that.podAffinityTerm) :that.podAffinityTerm != null) return false;
        if (weight != null ? !weight.equals(that.weight) :that.weight != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(podAffinityTerm,  weight,  super.hashCode());
    }

    public class PodAffinityTermNestedImpl<N> extends io.kubernetes.client.openapi.models.V1PodAffinityTermFluentImpl<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<N>> implements io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder builder;

            PodAffinityTermNestedImpl(io.kubernetes.client.openapi.models.V1PodAffinityTerm item) {
                this.builder = new io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder(this, item);
                        
            }

            PodAffinityTermNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder(this);
                        
            }

            public N and() {
                return (N) V1WeightedPodAffinityTermFluentImpl.this.withPodAffinityTerm(builder.build());
            }

            public N endPodAffinityTerm() {
                return and();
            }
    }


}
