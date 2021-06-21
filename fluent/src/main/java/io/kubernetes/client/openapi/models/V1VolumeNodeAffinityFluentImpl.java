package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1VolumeNodeAffinityFluentImpl<A extends io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<A> {

    private io.kubernetes.client.openapi.models.V1NodeSelectorBuilder required;

    public V1VolumeNodeAffinityFluentImpl() {
    }

    public V1VolumeNodeAffinityFluentImpl(io.kubernetes.client.openapi.models.V1VolumeNodeAffinity instance) {
        this.withRequired(instance.getRequired());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRequired instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1NodeSelector getRequired() {
        return this.required!=null?this.required.build():null;
    }

    public io.kubernetes.client.openapi.models.V1NodeSelector buildRequired() {
        return this.required!=null?this.required.build():null;
    }

    public A withRequired(io.kubernetes.client.openapi.models.V1NodeSelector required) {
        _visitables.get("required").remove(this.required);
        if (required!=null){ this.required= new io.kubernetes.client.openapi.models.V1NodeSelectorBuilder(required); _visitables.get("required").add(this.required);} return (A) this;
    }

    public java.lang.Boolean hasRequired() {
        return this.required != null;
    }

    public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A> withNewRequired() {
        return new io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluentImpl.RequiredNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A> withNewRequiredLike(io.kubernetes.client.openapi.models.V1NodeSelector item) {
        return new io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluentImpl.RequiredNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A> editRequired() {
        return withNewRequiredLike(getRequired());
    }

    public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A> editOrNewRequired() {
        return withNewRequiredLike(getRequired() != null ? getRequired(): new io.kubernetes.client.openapi.models.V1NodeSelectorBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A> editOrNewRequiredLike(io.kubernetes.client.openapi.models.V1NodeSelector item) {
        return withNewRequiredLike(getRequired() != null ? getRequired(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1VolumeNodeAffinityFluentImpl that = (V1VolumeNodeAffinityFluentImpl) o;
        if (required != null ? !required.equals(that.required) :that.required != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(required,  super.hashCode());
    }

    public class RequiredNestedImpl<N> extends io.kubernetes.client.openapi.models.V1NodeSelectorFluentImpl<io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<N>> implements io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1NodeSelectorBuilder builder;

            RequiredNestedImpl(io.kubernetes.client.openapi.models.V1NodeSelector item) {
                this.builder = new io.kubernetes.client.openapi.models.V1NodeSelectorBuilder(this, item);
                        
            }

            RequiredNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1NodeSelectorBuilder(this);
                        
            }

            public N and() {
                return (N) V1VolumeNodeAffinityFluentImpl.this.withRequired(builder.build());
            }

            public N endRequired() {
                return and();
            }
    }


}
