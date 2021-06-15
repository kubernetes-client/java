package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1ExternalDocumentationFluentImpl<A extends io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<A> {

    private java.lang.String description;
    private java.lang.String url;

    public V1ExternalDocumentationFluentImpl() {
    }

    public V1ExternalDocumentationFluentImpl(io.kubernetes.client.openapi.models.V1ExternalDocumentation instance) {
        this.withDescription(instance.getDescription());
        
        this.withUrl(instance.getUrl());
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public A withDescription(java.lang.String description) {
        this.description=description; return (A) this;
    }

    public java.lang.Boolean hasDescription() {
        return this.description != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withDescription instead.
     */
        public A withNewDescription(java.lang.String original) {
        return (A)withDescription(new String(original));
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public A withUrl(java.lang.String url) {
        this.url=url; return (A) this;
    }

    public java.lang.Boolean hasUrl() {
        return this.url != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUrl instead.
     */
        public A withNewUrl(java.lang.String original) {
        return (A)withUrl(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ExternalDocumentationFluentImpl that = (V1ExternalDocumentationFluentImpl) o;
        if (description != null ? !description.equals(that.description) :that.description != null) return false;
        if (url != null ? !url.equals(that.url) :that.url != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(description,  url,  super.hashCode());
    }

}
