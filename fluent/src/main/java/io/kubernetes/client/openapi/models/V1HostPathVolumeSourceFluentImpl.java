package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1HostPathVolumeSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluent<A> {

    private java.lang.String path;
    private java.lang.String type;

    public V1HostPathVolumeSourceFluentImpl() {
    }

    public V1HostPathVolumeSourceFluentImpl(io.kubernetes.client.openapi.models.V1HostPathVolumeSource instance) {
        this.withPath(instance.getPath());
        
        this.withType(instance.getType());
    }

    public java.lang.String getPath() {
        return this.path;
    }

    public A withPath(java.lang.String path) {
        this.path=path; return (A) this;
    }

    public java.lang.Boolean hasPath() {
        return this.path != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPath instead.
     */
        public A withNewPath(java.lang.String original) {
        return (A)withPath(new String(original));
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
        V1HostPathVolumeSourceFluentImpl that = (V1HostPathVolumeSourceFluentImpl) o;
        if (path != null ? !path.equals(that.path) :that.path != null) return false;
        if (type != null ? !type.equals(that.type) :that.type != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(path,  type,  super.hashCode());
    }

}
