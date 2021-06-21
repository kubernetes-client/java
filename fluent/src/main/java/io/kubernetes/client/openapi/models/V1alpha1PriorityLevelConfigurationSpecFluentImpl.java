package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1PriorityLevelConfigurationSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecFluent<A> {

    private io.kubernetes.client.openapi.models.V1alpha1LimitedPriorityLevelConfigurationBuilder limited;
    private java.lang.String type;

    public V1alpha1PriorityLevelConfigurationSpecFluentImpl() {
    }

    public V1alpha1PriorityLevelConfigurationSpecFluentImpl(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpec instance) {
        this.withLimited(instance.getLimited());
        
        this.withType(instance.getType());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildLimited instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1alpha1LimitedPriorityLevelConfiguration getLimited() {
        return this.limited!=null?this.limited.build():null;
    }

    public io.kubernetes.client.openapi.models.V1alpha1LimitedPriorityLevelConfiguration buildLimited() {
        return this.limited!=null?this.limited.build():null;
    }

    public A withLimited(io.kubernetes.client.openapi.models.V1alpha1LimitedPriorityLevelConfiguration limited) {
        _visitables.get("limited").remove(this.limited);
        if (limited!=null){ this.limited= new io.kubernetes.client.openapi.models.V1alpha1LimitedPriorityLevelConfigurationBuilder(limited); _visitables.get("limited").add(this.limited);} return (A) this;
    }

    public java.lang.Boolean hasLimited() {
        return this.limited != null;
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecFluent.LimitedNested<A> withNewLimited() {
        return new io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecFluentImpl.LimitedNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecFluent.LimitedNested<A> withNewLimitedLike(io.kubernetes.client.openapi.models.V1alpha1LimitedPriorityLevelConfiguration item) {
        return new io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecFluentImpl.LimitedNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecFluent.LimitedNested<A> editLimited() {
        return withNewLimitedLike(getLimited());
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecFluent.LimitedNested<A> editOrNewLimited() {
        return withNewLimitedLike(getLimited() != null ? getLimited(): new io.kubernetes.client.openapi.models.V1alpha1LimitedPriorityLevelConfigurationBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecFluent.LimitedNested<A> editOrNewLimitedLike(io.kubernetes.client.openapi.models.V1alpha1LimitedPriorityLevelConfiguration item) {
        return withNewLimitedLike(getLimited() != null ? getLimited(): item);
    }

    public java.lang.String getType() {
        return this.type;
    }

    public A withType(java.lang.String type) {
        this.type=type; return (A) this;
    }

    public java.lang.Boolean hasType() {
        return this.type != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original) {
        return (A)withType(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1alpha1PriorityLevelConfigurationSpecFluentImpl that = (V1alpha1PriorityLevelConfigurationSpecFluentImpl) o;
        if (limited != null ? !limited.equals(that.limited) :that.limited != null) return false;
        if (type != null ? !type.equals(that.type) :that.type != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(limited,  type,  super.hashCode());
    }

    public class LimitedNestedImpl<N> extends io.kubernetes.client.openapi.models.V1alpha1LimitedPriorityLevelConfigurationFluentImpl<io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecFluent.LimitedNested<N>> implements io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecFluent.LimitedNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1alpha1LimitedPriorityLevelConfigurationBuilder builder;

            LimitedNestedImpl(io.kubernetes.client.openapi.models.V1alpha1LimitedPriorityLevelConfiguration item) {
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1LimitedPriorityLevelConfigurationBuilder(this, item);
                        
            }

            LimitedNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1LimitedPriorityLevelConfigurationBuilder(this);
                        
            }

            public N and() {
                return (N) V1alpha1PriorityLevelConfigurationSpecFluentImpl.this.withLimited(builder.build());
            }

            public N endLimited() {
                return and();
            }
    }


}
