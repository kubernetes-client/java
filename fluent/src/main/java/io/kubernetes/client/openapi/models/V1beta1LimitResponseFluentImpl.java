package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1LimitResponseFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent<A> {

    private io.kubernetes.client.openapi.models.V1beta1QueuingConfigurationBuilder queuing;
    private java.lang.String type;

    public V1beta1LimitResponseFluentImpl() {
    }

    public V1beta1LimitResponseFluentImpl(io.kubernetes.client.openapi.models.V1beta1LimitResponse instance) {
        this.withQueuing(instance.getQueuing());
        
        this.withType(instance.getType());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildQueuing instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1QueuingConfiguration getQueuing() {
        return this.queuing!=null?this.queuing.build():null;
    }

    public io.kubernetes.client.openapi.models.V1beta1QueuingConfiguration buildQueuing() {
        return this.queuing!=null?this.queuing.build():null;
    }

    public A withQueuing(io.kubernetes.client.openapi.models.V1beta1QueuingConfiguration queuing) {
        _visitables.get("queuing").remove(this.queuing);
        if (queuing!=null){ this.queuing= new io.kubernetes.client.openapi.models.V1beta1QueuingConfigurationBuilder(queuing); _visitables.get("queuing").add(this.queuing);} return (A) this;
    }

    public java.lang.Boolean hasQueuing() {
        return this.queuing != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent.QueuingNested<A> withNewQueuing() {
        return new io.kubernetes.client.openapi.models.V1beta1LimitResponseFluentImpl.QueuingNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent.QueuingNested<A> withNewQueuingLike(io.kubernetes.client.openapi.models.V1beta1QueuingConfiguration item) {
        return new io.kubernetes.client.openapi.models.V1beta1LimitResponseFluentImpl.QueuingNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent.QueuingNested<A> editQueuing() {
        return withNewQueuingLike(getQueuing());
    }

    public io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent.QueuingNested<A> editOrNewQueuing() {
        return withNewQueuingLike(getQueuing() != null ? getQueuing(): new io.kubernetes.client.openapi.models.V1beta1QueuingConfigurationBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent.QueuingNested<A> editOrNewQueuingLike(io.kubernetes.client.openapi.models.V1beta1QueuingConfiguration item) {
        return withNewQueuingLike(getQueuing() != null ? getQueuing(): item);
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
        V1beta1LimitResponseFluentImpl that = (V1beta1LimitResponseFluentImpl) o;
        if (queuing != null ? !queuing.equals(that.queuing) :that.queuing != null) return false;
        if (type != null ? !type.equals(that.type) :that.type != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(queuing,  type,  super.hashCode());
    }

    public class QueuingNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1QueuingConfigurationFluentImpl<io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent.QueuingNested<N>> implements io.kubernetes.client.openapi.models.V1beta1LimitResponseFluent.QueuingNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1QueuingConfigurationBuilder builder;

            QueuingNestedImpl(io.kubernetes.client.openapi.models.V1beta1QueuingConfiguration item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1QueuingConfigurationBuilder(this, item);
                        
            }

            QueuingNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1QueuingConfigurationBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1LimitResponseFluentImpl.this.withQueuing(builder.build());
            }

            public N endQueuing() {
                return and();
            }
    }


}
