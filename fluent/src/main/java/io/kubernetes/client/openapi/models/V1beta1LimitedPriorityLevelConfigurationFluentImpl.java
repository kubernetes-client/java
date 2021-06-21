package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1LimitedPriorityLevelConfigurationFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent<A> {

    private java.lang.Integer assuredConcurrencyShares;
    private io.kubernetes.client.openapi.models.V1beta1LimitResponseBuilder limitResponse;

    public V1beta1LimitedPriorityLevelConfigurationFluentImpl() {
    }

    public V1beta1LimitedPriorityLevelConfigurationFluentImpl(io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration instance) {
        this.withAssuredConcurrencyShares(instance.getAssuredConcurrencyShares());
        
        this.withLimitResponse(instance.getLimitResponse());
    }

    public java.lang.Integer getAssuredConcurrencyShares() {
        return this.assuredConcurrencyShares;
    }

    public A withAssuredConcurrencyShares(java.lang.Integer assuredConcurrencyShares) {
        this.assuredConcurrencyShares=assuredConcurrencyShares; return (A) this;
    }

    public java.lang.Boolean hasAssuredConcurrencyShares() {
        return this.assuredConcurrencyShares != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildLimitResponse instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1LimitResponse getLimitResponse() {
        return this.limitResponse!=null?this.limitResponse.build():null;
    }

    public io.kubernetes.client.openapi.models.V1beta1LimitResponse buildLimitResponse() {
        return this.limitResponse!=null?this.limitResponse.build():null;
    }

    public A withLimitResponse(io.kubernetes.client.openapi.models.V1beta1LimitResponse limitResponse) {
        _visitables.get("limitResponse").remove(this.limitResponse);
        if (limitResponse!=null){ this.limitResponse= new io.kubernetes.client.openapi.models.V1beta1LimitResponseBuilder(limitResponse); _visitables.get("limitResponse").add(this.limitResponse);} return (A) this;
    }

    public java.lang.Boolean hasLimitResponse() {
        return this.limitResponse != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> withNewLimitResponse() {
        return new io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluentImpl.LimitResponseNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> withNewLimitResponseLike(io.kubernetes.client.openapi.models.V1beta1LimitResponse item) {
        return new io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluentImpl.LimitResponseNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editLimitResponse() {
        return withNewLimitResponseLike(getLimitResponse());
    }

    public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editOrNewLimitResponse() {
        return withNewLimitResponseLike(getLimitResponse() != null ? getLimitResponse(): new io.kubernetes.client.openapi.models.V1beta1LimitResponseBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editOrNewLimitResponseLike(io.kubernetes.client.openapi.models.V1beta1LimitResponse item) {
        return withNewLimitResponseLike(getLimitResponse() != null ? getLimitResponse(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1LimitedPriorityLevelConfigurationFluentImpl that = (V1beta1LimitedPriorityLevelConfigurationFluentImpl) o;
        if (assuredConcurrencyShares != null ? !assuredConcurrencyShares.equals(that.assuredConcurrencyShares) :that.assuredConcurrencyShares != null) return false;
        if (limitResponse != null ? !limitResponse.equals(that.limitResponse) :that.limitResponse != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(assuredConcurrencyShares,  limitResponse,  super.hashCode());
    }

    public class LimitResponseNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1LimitResponseFluentImpl<io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<N>> implements io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1LimitResponseBuilder builder;

            LimitResponseNestedImpl(io.kubernetes.client.openapi.models.V1beta1LimitResponse item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1LimitResponseBuilder(this, item);
                        
            }

            LimitResponseNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1LimitResponseBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1LimitedPriorityLevelConfigurationFluentImpl.this.withLimitResponse(builder.build());
            }

            public N endLimitResponse() {
                return and();
            }
    }


}
