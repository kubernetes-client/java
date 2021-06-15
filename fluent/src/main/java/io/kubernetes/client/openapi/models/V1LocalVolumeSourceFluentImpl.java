package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1LocalVolumeSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1LocalVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1LocalVolumeSourceFluent<A> {

    private java.lang.String fsType;
    private java.lang.String path;

    public V1LocalVolumeSourceFluentImpl() {
    }

    public V1LocalVolumeSourceFluentImpl(io.kubernetes.client.openapi.models.V1LocalVolumeSource instance) {
        this.withFsType(instance.getFsType());
        
        this.withPath(instance.getPath());
    }

    public java.lang.String getFsType() {
        return this.fsType;
    }

    public A withFsType(java.lang.String fsType) {
        this.fsType=fsType; return (A) this;
    }

    public java.lang.Boolean hasFsType() {
        return this.fsType != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFsType instead.
     */
        public A withNewFsType(java.lang.String original) {
        return (A)withFsType(new String(original));
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

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1LocalVolumeSourceFluentImpl that = (V1LocalVolumeSourceFluentImpl) o;
        if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
        if (path != null ? !path.equals(that.path) :that.path != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fsType,  path,  super.hashCode());
    }

}
