package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1ScaleStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V1ScaleStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ScaleStatusFluent<A> {

    private java.lang.Integer replicas;
    private java.lang.String selector;

    public V1ScaleStatusFluentImpl() {
    }

    public V1ScaleStatusFluentImpl(io.kubernetes.client.openapi.models.V1ScaleStatus instance) {
        this.withReplicas(instance.getReplicas());
        
        this.withSelector(instance.getSelector());
    }

    public java.lang.Integer getReplicas() {
        return this.replicas;
    }

    public A withReplicas(java.lang.Integer replicas) {
        this.replicas=replicas; return (A) this;
    }

    public java.lang.Boolean hasReplicas() {
        return this.replicas != null;
    }

    public java.lang.String getSelector() {
        return this.selector;
    }

    public A withSelector(java.lang.String selector) {
        this.selector=selector; return (A) this;
    }

    public java.lang.Boolean hasSelector() {
        return this.selector != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSelector instead.
     */
        public A withNewSelector(java.lang.String original) {
        return (A)withSelector(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ScaleStatusFluentImpl that = (V1ScaleStatusFluentImpl) o;
        if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
        if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(replicas,  selector,  super.hashCode());
    }

}
