package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1PodReadinessGateFluentImpl<A extends io.kubernetes.client.openapi.models.V1PodReadinessGateFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1PodReadinessGateFluent<A> {

    private java.lang.String conditionType;

    public V1PodReadinessGateFluentImpl() {
    }

    public V1PodReadinessGateFluentImpl(io.kubernetes.client.openapi.models.V1PodReadinessGate instance) {
        this.withConditionType(instance.getConditionType());
    }

    public java.lang.String getConditionType() {
        return this.conditionType;
    }

    public A withConditionType(java.lang.String conditionType) {
        this.conditionType=conditionType; return (A) this;
    }

    public java.lang.Boolean hasConditionType() {
        return this.conditionType != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withConditionType instead.
     */
        public A withNewConditionType(java.lang.String original) {
        return (A)withConditionType(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1PodReadinessGateFluentImpl that = (V1PodReadinessGateFluentImpl) o;
        if (conditionType != null ? !conditionType.equals(that.conditionType) :that.conditionType != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(conditionType,  super.hashCode());
    }

}
