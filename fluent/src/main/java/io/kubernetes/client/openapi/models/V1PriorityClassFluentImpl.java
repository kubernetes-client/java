package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1PriorityClassFluentImpl<A extends io.kubernetes.client.openapi.models.V1PriorityClassFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1PriorityClassFluent<A> {

    private java.lang.String apiVersion;
    private java.lang.String description;
    private java.lang.Boolean globalDefault;
    private java.lang.String kind;
    private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
    private java.lang.String preemptionPolicy;
    private java.lang.Integer value;

    public V1PriorityClassFluentImpl() {
    }

    public V1PriorityClassFluentImpl(io.kubernetes.client.openapi.models.V1PriorityClass instance) {
        this.withApiVersion(instance.getApiVersion());
        
        this.withDescription(instance.getDescription());
        
        this.withGlobalDefault(instance.getGlobalDefault());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withPreemptionPolicy(instance.getPreemptionPolicy());
        
        this.withValue(instance.getValue());
    }

    public java.lang.String getApiVersion() {
        return this.apiVersion;
    }

    public A withApiVersion(java.lang.String apiVersion) {
        this.apiVersion=apiVersion; return (A) this;
    }

    public java.lang.Boolean hasApiVersion() {
        return this.apiVersion != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original) {
        return (A)withApiVersion(new String(original));
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

    public java.lang.Boolean getGlobalDefault() {
        return this.globalDefault;
    }

    public A withGlobalDefault(java.lang.Boolean globalDefault) {
        this.globalDefault=globalDefault; return (A) this;
    }

    public java.lang.Boolean hasGlobalDefault() {
        return this.globalDefault != null;
    }

    public java.lang.String getKind() {
        return this.kind;
    }

    public A withKind(java.lang.String kind) {
        this.kind=kind; return (A) this;
    }

    public java.lang.Boolean hasKind() {
        return this.kind != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original) {
        return (A)withKind(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
        return this.metadata!=null?this.metadata.build():null;
    }

    public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata() {
        return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
        _visitables.get("metadata").remove(this.metadata);
        if (metadata!=null){ this.metadata= new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} return (A) this;
    }

    public java.lang.Boolean hasMetadata() {
        return this.metadata != null;
    }

    public io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<A> withNewMetadata() {
        return new io.kubernetes.client.openapi.models.V1PriorityClassFluentImpl.MetadataNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
        return new io.kubernetes.client.openapi.models.V1PriorityClassFluentImpl.MetadataNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<A> editMetadata() {
        return withNewMetadataLike(getMetadata());
    }

    public io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<A> editOrNewMetadata() {
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public java.lang.String getPreemptionPolicy() {
        return this.preemptionPolicy;
    }

    public A withPreemptionPolicy(java.lang.String preemptionPolicy) {
        this.preemptionPolicy=preemptionPolicy; return (A) this;
    }

    public java.lang.Boolean hasPreemptionPolicy() {
        return this.preemptionPolicy != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPreemptionPolicy instead.
     */
        public A withNewPreemptionPolicy(java.lang.String original) {
        return (A)withPreemptionPolicy(new String(original));
    }

    public java.lang.Integer getValue() {
        return this.value;
    }

    public A withValue(java.lang.Integer value) {
        this.value=value; return (A) this;
    }

    public java.lang.Boolean hasValue() {
        return this.value != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1PriorityClassFluentImpl that = (V1PriorityClassFluentImpl) o;
        if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
        if (description != null ? !description.equals(that.description) :that.description != null) return false;
        if (globalDefault != null ? !globalDefault.equals(that.globalDefault) :that.globalDefault != null) return false;
        if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
        if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
        if (preemptionPolicy != null ? !preemptionPolicy.equals(that.preemptionPolicy) :that.preemptionPolicy != null) return false;
        if (value != null ? !value.equals(that.value) :that.value != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(apiVersion,  description,  globalDefault,  kind,  metadata,  preemptionPolicy,  value,  super.hashCode());
    }

    public class MetadataNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<N>> implements io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

            MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
                        
            }

            MetadataNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
                        
            }

            public N and() {
                return (N) V1PriorityClassFluentImpl.this.withMetadata(builder.build());
            }

            public N endMetadata() {
                return and();
            }
    }


}
