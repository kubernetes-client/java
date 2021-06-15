package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1beta1FlowDistinguisherMethodFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethodFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethodFluent<A> {

    private java.lang.String type;

    public V1beta1FlowDistinguisherMethodFluentImpl() {
    }

    public V1beta1FlowDistinguisherMethodFluentImpl(io.kubernetes.client.openapi.models.V1beta1FlowDistinguisherMethod instance) {
        this.withType(instance.getType());
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
        V1beta1FlowDistinguisherMethodFluentImpl that = (V1beta1FlowDistinguisherMethodFluentImpl) o;
        if (type != null ? !type.equals(that.type) :that.type != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(type,  super.hashCode());
    }

}
