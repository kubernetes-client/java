package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta2ResourceMetricSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent<A> {

    private java.lang.String name;
    private io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder target;

    public V2beta2ResourceMetricSourceFluentImpl() {
    }

    public V2beta2ResourceMetricSourceFluentImpl(io.kubernetes.client.openapi.models.V2beta2ResourceMetricSource instance) {
        this.withName(instance.getName());
        
        this.withTarget(instance.getTarget());
    }

    public java.lang.String getName() {
        return this.name;
    }

    public A withName(java.lang.String name) {
        this.name=name; return (A) this;
    }

    public java.lang.Boolean hasName() {
        return this.name != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original) {
        return (A)withName(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTarget instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2MetricTarget getTarget() {
        return this.target!=null?this.target.build():null;
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricTarget buildTarget() {
        return this.target!=null?this.target.build():null;
    }

    public A withTarget(io.kubernetes.client.openapi.models.V2beta2MetricTarget target) {
        _visitables.get("target").remove(this.target);
        if (target!=null){ this.target= new io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder(target); _visitables.get("target").add(this.target);} return (A) this;
    }

    public java.lang.Boolean hasTarget() {
        return this.target != null;
    }

    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A> withNewTarget() {
        return new io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluentImpl.TargetNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A> withNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item) {
        return new io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluentImpl.TargetNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A> editTarget() {
        return withNewTargetLike(getTarget());
    }

    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A> editOrNewTarget() {
        return withNewTargetLike(getTarget() != null ? getTarget(): new io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A> editOrNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item) {
        return withNewTargetLike(getTarget() != null ? getTarget(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V2beta2ResourceMetricSourceFluentImpl that = (V2beta2ResourceMetricSourceFluentImpl) o;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        if (target != null ? !target.equals(that.target) :that.target != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(name,  target,  super.hashCode());
    }

    public class TargetNestedImpl<N> extends io.kubernetes.client.openapi.models.V2beta2MetricTargetFluentImpl<io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<N>> implements io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder builder;

            TargetNestedImpl(io.kubernetes.client.openapi.models.V2beta2MetricTarget item) {
                this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder(this, item);
                        
            }

            TargetNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder(this);
                        
            }

            public N and() {
                return (N) V2beta2ResourceMetricSourceFluentImpl.this.withTarget(builder.build());
            }

            public N endTarget() {
                return and();
            }
    }


}
