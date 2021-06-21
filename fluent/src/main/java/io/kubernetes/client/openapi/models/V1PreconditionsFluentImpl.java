package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1PreconditionsFluentImpl<A extends io.kubernetes.client.openapi.models.V1PreconditionsFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1PreconditionsFluent<A> {

    private java.lang.String resourceVersion;
    private java.lang.String uid;

    public V1PreconditionsFluentImpl() {
    }

    public V1PreconditionsFluentImpl(io.kubernetes.client.openapi.models.V1Preconditions instance) {
        this.withResourceVersion(instance.getResourceVersion());
        
        this.withUid(instance.getUid());
    }

    public java.lang.String getResourceVersion() {
        return this.resourceVersion;
    }

    public A withResourceVersion(java.lang.String resourceVersion) {
        this.resourceVersion=resourceVersion; return (A) this;
    }

    public java.lang.Boolean hasResourceVersion() {
        return this.resourceVersion != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withResourceVersion instead.
     */
        public A withNewResourceVersion(java.lang.String original) {
        return (A)withResourceVersion(new String(original));
    }

    public java.lang.String getUid() {
        return this.uid;
    }

    public A withUid(java.lang.String uid) {
        this.uid=uid; return (A) this;
    }

    public java.lang.Boolean hasUid() {
        return this.uid != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUid instead.
     */
        public A withNewUid(java.lang.String original) {
        return (A)withUid(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1PreconditionsFluentImpl that = (V1PreconditionsFluentImpl) o;
        if (resourceVersion != null ? !resourceVersion.equals(that.resourceVersion) :that.resourceVersion != null) return false;
        if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(resourceVersion,  uid,  super.hashCode());
    }

}
