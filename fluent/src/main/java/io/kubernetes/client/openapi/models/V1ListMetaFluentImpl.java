package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1ListMetaFluentImpl<A extends io.kubernetes.client.openapi.models.V1ListMetaFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ListMetaFluent<A> {

    private java.lang.String _continue;
    private java.lang.Long remainingItemCount;
    private java.lang.String resourceVersion;
    private java.lang.String selfLink;

    public V1ListMetaFluentImpl() {
    }

    public V1ListMetaFluentImpl(io.kubernetes.client.openapi.models.V1ListMeta instance) {
        this.withContinue(instance.getContinue());
        
        this.withRemainingItemCount(instance.getRemainingItemCount());
        
        this.withResourceVersion(instance.getResourceVersion());
        
        this.withSelfLink(instance.getSelfLink());
    }

    public java.lang.String getContinue() {
        return this._continue;
    }

    public A withContinue(java.lang.String _continue) {
        this._continue=_continue; return (A) this;
    }

    public java.lang.Boolean hasContinue() {
        return this._continue != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withContinue instead.
     */
        public A withNewContinue(java.lang.String original) {
        return (A)withContinue(new String(original));
    }

    public java.lang.Long getRemainingItemCount() {
        return this.remainingItemCount;
    }

    public A withRemainingItemCount(java.lang.Long remainingItemCount) {
        this.remainingItemCount=remainingItemCount; return (A) this;
    }

    public java.lang.Boolean hasRemainingItemCount() {
        return this.remainingItemCount != null;
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

    public java.lang.String getSelfLink() {
        return this.selfLink;
    }

    public A withSelfLink(java.lang.String selfLink) {
        this.selfLink=selfLink; return (A) this;
    }

    public java.lang.Boolean hasSelfLink() {
        return this.selfLink != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSelfLink instead.
     */
        public A withNewSelfLink(java.lang.String original) {
        return (A)withSelfLink(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ListMetaFluentImpl that = (V1ListMetaFluentImpl) o;
        if (_continue != null ? !_continue.equals(that._continue) :that._continue != null) return false;
        if (remainingItemCount != null ? !remainingItemCount.equals(that.remainingItemCount) :that.remainingItemCount != null) return false;
        if (resourceVersion != null ? !resourceVersion.equals(that.resourceVersion) :that.resourceVersion != null) return false;
        if (selfLink != null ? !selfLink.equals(that.selfLink) :that.selfLink != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(_continue,  remainingItemCount,  resourceVersion,  selfLink,  super.hashCode());
    }

}
