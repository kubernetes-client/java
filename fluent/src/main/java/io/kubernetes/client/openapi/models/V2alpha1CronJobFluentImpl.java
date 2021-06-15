package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V2alpha1CronJobFluentImpl<A extends io.kubernetes.client.openapi.models.V2alpha1CronJobFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V2alpha1CronJobFluent<A> {

    private java.lang.String apiVersion;
    private java.lang.String kind;
    private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
    private io.kubernetes.client.openapi.models.V2alpha1CronJobSpecBuilder spec;
    private io.kubernetes.client.openapi.models.V2alpha1CronJobStatusBuilder status;

    public V2alpha1CronJobFluentImpl() {
    }

    public V2alpha1CronJobFluentImpl(io.kubernetes.client.openapi.models.V2alpha1CronJob instance) {
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

    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.MetadataNested<A> withNewMetadata() {
        return new io.kubernetes.client.openapi.models.V2alpha1CronJobFluentImpl.MetadataNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
        return new io.kubernetes.client.openapi.models.V2alpha1CronJobFluentImpl.MetadataNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.MetadataNested<A> editMetadata() {
        return withNewMetadataLike(getMetadata());
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.MetadataNested<A> editOrNewMetadata() {
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSpec instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2alpha1CronJobSpec getSpec() {
        return this.spec!=null?this.spec.build():null;
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobSpec buildSpec() {
        return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(io.kubernetes.client.openapi.models.V2alpha1CronJobSpec spec) {
        _visitables.get("spec").remove(this.spec);
        if (spec!=null){ this.spec= new io.kubernetes.client.openapi.models.V2alpha1CronJobSpecBuilder(spec); _visitables.get("spec").add(this.spec);} return (A) this;
    }

    public java.lang.Boolean hasSpec() {
        return this.spec != null;
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.SpecNested<A> withNewSpec() {
        return new io.kubernetes.client.openapi.models.V2alpha1CronJobFluentImpl.SpecNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V2alpha1CronJobSpec item) {
        return new io.kubernetes.client.openapi.models.V2alpha1CronJobFluentImpl.SpecNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.SpecNested<A> editSpec() {
        return withNewSpecLike(getSpec());
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.SpecNested<A> editOrNewSpec() {
        return withNewSpecLike(getSpec() != null ? getSpec(): new io.kubernetes.client.openapi.models.V2alpha1CronJobSpecBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V2alpha1CronJobSpec item) {
        return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildStatus instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2alpha1CronJobStatus getStatus() {
        return this.status!=null?this.status.build():null;
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobStatus buildStatus() {
        return this.status!=null?this.status.build():null;
    }

    public A withStatus(io.kubernetes.client.openapi.models.V2alpha1CronJobStatus status) {
        _visitables.get("status").remove(this.status);
        if (status!=null){ this.status= new io.kubernetes.client.openapi.models.V2alpha1CronJobStatusBuilder(status); _visitables.get("status").add(this.status);} return (A) this;
    }

    public java.lang.Boolean hasStatus() {
        return this.status != null;
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.StatusNested<A> withNewStatus() {
        return new io.kubernetes.client.openapi.models.V2alpha1CronJobFluentImpl.StatusNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.StatusNested<A> withNewStatusLike(io.kubernetes.client.openapi.models.V2alpha1CronJobStatus item) {
        return new io.kubernetes.client.openapi.models.V2alpha1CronJobFluentImpl.StatusNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.StatusNested<A> editStatus() {
        return withNewStatusLike(getStatus());
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.StatusNested<A> editOrNewStatus() {
        return withNewStatusLike(getStatus() != null ? getStatus(): new io.kubernetes.client.openapi.models.V2alpha1CronJobStatusBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.StatusNested<A> editOrNewStatusLike(io.kubernetes.client.openapi.models.V2alpha1CronJobStatus item) {
        return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V2alpha1CronJobFluentImpl that = (V2alpha1CronJobFluentImpl) o;
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

    public class MetadataNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.MetadataNested<N>> implements io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.MetadataNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

            MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
                        
            }

            MetadataNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
                        
            }

            public N and() {
                return (N) V2alpha1CronJobFluentImpl.this.withMetadata(builder.build());
            }

            public N endMetadata() {
                return and();
            }
    }


    public class SpecNestedImpl<N> extends io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluentImpl<io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.SpecNested<N>> implements io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.SpecNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V2alpha1CronJobSpecBuilder builder;

            SpecNestedImpl(io.kubernetes.client.openapi.models.V2alpha1CronJobSpec item) {
                this.builder = new io.kubernetes.client.openapi.models.V2alpha1CronJobSpecBuilder(this, item);
                        
            }

            SpecNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V2alpha1CronJobSpecBuilder(this);
                        
            }

            public N and() {
                return (N) V2alpha1CronJobFluentImpl.this.withSpec(builder.build());
            }

            public N endSpec() {
                return and();
            }
    }


    public class StatusNestedImpl<N> extends io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluentImpl<io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.StatusNested<N>> implements io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.StatusNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V2alpha1CronJobStatusBuilder builder;

            StatusNestedImpl(io.kubernetes.client.openapi.models.V2alpha1CronJobStatus item) {
                this.builder = new io.kubernetes.client.openapi.models.V2alpha1CronJobStatusBuilder(this, item);
                        
            }

            StatusNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V2alpha1CronJobStatusBuilder(this);
                        
            }

            public N and() {
                return (N) V2alpha1CronJobFluentImpl.this.withStatus(builder.build());
            }

            public N endStatus() {
                return and();
            }
    }


}
