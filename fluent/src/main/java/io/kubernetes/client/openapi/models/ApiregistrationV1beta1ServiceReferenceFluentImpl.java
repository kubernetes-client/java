package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ApiregistrationV1beta1ServiceReferenceFluentImpl<A extends io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReferenceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReferenceFluent<A> {

    private java.lang.String name;
    private java.lang.String namespace;
    private java.lang.Integer port;

    public ApiregistrationV1beta1ServiceReferenceFluentImpl() {
    }

    public ApiregistrationV1beta1ServiceReferenceFluentImpl(io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReference instance) {
        this.withName(instance.getName());
        
        this.withNamespace(instance.getNamespace());
        
        this.withPort(instance.getPort());
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

    public java.lang.Integer getPort() {
        return this.port;
    }

    public A withPort(java.lang.Integer port) {
        this.port=port; return (A) this;
    }

    public java.lang.Boolean hasPort() {
        return this.port != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApiregistrationV1beta1ServiceReferenceFluentImpl that = (ApiregistrationV1beta1ServiceReferenceFluentImpl) o;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
        if (port != null ? !port.equals(that.port) :that.port != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(name,  namespace,  port,  super.hashCode());
    }

}
