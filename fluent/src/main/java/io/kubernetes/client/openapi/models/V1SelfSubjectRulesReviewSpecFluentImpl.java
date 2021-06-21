package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1SelfSubjectRulesReviewSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewSpecFluent<A> {

    private java.lang.String namespace;

    public V1SelfSubjectRulesReviewSpecFluentImpl() {
    }

    public V1SelfSubjectRulesReviewSpecFluentImpl(io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewSpec instance) {
        this.withNamespace(instance.getNamespace());
    }

    public java.lang.String getNamespace() {
        return this.namespace;
    }

    public A withNamespace(java.lang.String namespace) {
        this.namespace=namespace; return (A) this;
    }

    public java.lang.Boolean hasNamespace() {
        return this.namespace != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withNamespace instead.
     */
        public A withNewNamespace(java.lang.String original) {
        return (A)withNamespace(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1SelfSubjectRulesReviewSpecFluentImpl that = (V1SelfSubjectRulesReviewSpecFluentImpl) o;
        if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(namespace,  super.hashCode());
    }

}
