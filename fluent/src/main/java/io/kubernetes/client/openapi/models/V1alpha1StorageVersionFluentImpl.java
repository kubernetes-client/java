package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1StorageVersionFluentImpl<A extends io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent<A> {

    private java.lang.String apiVersion;
    private java.lang.String kind;
    private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
    private java.lang.Object spec;
    private io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusBuilder status;

    public V1alpha1StorageVersionFluentImpl() {
    }

    public V1alpha1StorageVersionFluentImpl(io.kubernetes.client.openapi.models.V1alpha1StorageVersion instance) {
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withSpec(instance.getSpec());
        
        this.withStatus(instance.getStatus());
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

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.MetadataNested<A> withNewMetadata() {
        return new io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluentImpl.MetadataNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
        return new io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluentImpl.MetadataNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.MetadataNested<A> editMetadata() {
        return withNewMetadataLike(getMetadata());
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.MetadataNested<A> editOrNewMetadata() {
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public java.lang.Object getSpec() {
        return this.spec;
    }

    public A withSpec(java.lang.Object spec) {
        this.spec=spec; return (A) this;
    }

    public java.lang.Boolean hasSpec() {
        return this.spec != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildStatus instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus getStatus() {
        return this.status!=null?this.status.build():null;
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus buildStatus() {
        return this.status!=null?this.status.build():null;
    }

    public A withStatus(io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus status) {
        _visitables.get("status").remove(this.status);
        if (status!=null){ this.status= new io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusBuilder(status); _visitables.get("status").add(this.status);} return (A) this;
    }

    public java.lang.Boolean hasStatus() {
        return this.status != null;
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.StatusNested<A> withNewStatus() {
        return new io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluentImpl.StatusNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.StatusNested<A> withNewStatusLike(io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus item) {
        return new io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluentImpl.StatusNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.StatusNested<A> editStatus() {
        return withNewStatusLike(getStatus());
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.StatusNested<A> editOrNewStatus() {
        return withNewStatusLike(getStatus() != null ? getStatus(): new io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.StatusNested<A> editOrNewStatusLike(io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus item) {
        return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1alpha1StorageVersionFluentImpl that = (V1alpha1StorageVersionFluentImpl) o;
        if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
        if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
        if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
        if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
        if (status != null ? !status.equals(that.status) :that.status != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(apiVersion,  kind,  metadata,  spec,  status,  super.hashCode());
    }

    public class MetadataNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.MetadataNested<N>> implements io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.MetadataNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

            MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
                        
            }

            MetadataNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
                        
            }

            public N and() {
                return (N) V1alpha1StorageVersionFluentImpl.this.withMetadata(builder.build());
            }

            public N endMetadata() {
                return and();
            }
    }


    public class StatusNestedImpl<N> extends io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluentImpl<io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.StatusNested<N>> implements io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent.StatusNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusBuilder builder;

            StatusNestedImpl(io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus item) {
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusBuilder(this, item);
                        
            }

            StatusNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusBuilder(this);
                        
            }

            public N and() {
                return (N) V1alpha1StorageVersionFluentImpl.this.withStatus(builder.build());
            }

            public N endStatus() {
                return and();
            }
    }


}
