package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1SecretEnvSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1SecretEnvSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1SecretEnvSourceFluent<A> {

    private java.lang.String name;
    private java.lang.Boolean optional;

    public V1SecretEnvSourceFluentImpl() {
    }

    public V1SecretEnvSourceFluentImpl(io.kubernetes.client.openapi.models.V1SecretEnvSource instance) {
        this.withName(instance.getName());
        
        this.withOptional(instance.getOptional());
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

    public java.lang.Boolean getOptional() {
        return this.optional;
    }

    public A withOptional(java.lang.Boolean optional) {
        this.optional=optional; return (A) this;
    }

    public java.lang.Boolean hasOptional() {
        return this.optional != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1SecretEnvSourceFluentImpl that = (V1SecretEnvSourceFluentImpl) o;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        if (optional != null ? !optional.equals(that.optional) :that.optional != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(name,  optional,  super.hashCode());
    }

}
