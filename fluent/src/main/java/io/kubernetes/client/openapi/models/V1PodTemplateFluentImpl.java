package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1PodTemplateFluentImpl<A extends io.kubernetes.client.openapi.models.V1PodTemplateFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1PodTemplateFluent<A> {

    private java.lang.String apiVersion;
    private java.lang.String kind;
    private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
    private io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder template;

    public V1PodTemplateFluentImpl() {
    }

    public V1PodTemplateFluentImpl(io.kubernetes.client.openapi.models.V1PodTemplate instance) {
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withTemplate(instance.getTemplate());
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

    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.MetadataNested<A> withNewMetadata() {
        return new io.kubernetes.client.openapi.models.V1PodTemplateFluentImpl.MetadataNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
        return new io.kubernetes.client.openapi.models.V1PodTemplateFluentImpl.MetadataNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.MetadataNested<A> editMetadata() {
        return withNewMetadataLike(getMetadata());
    }

    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.MetadataNested<A> editOrNewMetadata() {
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTemplate instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1PodTemplateSpec getTemplate() {
        return this.template!=null?this.template.build():null;
    }

    public io.kubernetes.client.openapi.models.V1PodTemplateSpec buildTemplate() {
        return this.template!=null?this.template.build():null;
    }

    public A withTemplate(io.kubernetes.client.openapi.models.V1PodTemplateSpec template) {
        _visitables.get("template").remove(this.template);
        if (template!=null){ this.template= new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder(template); _visitables.get("template").add(this.template);} return (A) this;
    }

    public java.lang.Boolean hasTemplate() {
        return this.template != null;
    }

    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.TemplateNested<A> withNewTemplate() {
        return new io.kubernetes.client.openapi.models.V1PodTemplateFluentImpl.TemplateNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.TemplateNested<A> withNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
        return new io.kubernetes.client.openapi.models.V1PodTemplateFluentImpl.TemplateNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.TemplateNested<A> editTemplate() {
        return withNewTemplateLike(getTemplate());
    }

    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.TemplateNested<A> editOrNewTemplate() {
        return withNewTemplateLike(getTemplate() != null ? getTemplate(): new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.TemplateNested<A> editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
        return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1PodTemplateFluentImpl that = (V1PodTemplateFluentImpl) o;
        if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
        if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
        if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
        if (template != null ? !template.equals(that.template) :that.template != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(apiVersion,  kind,  metadata,  template,  super.hashCode());
    }

    public class MetadataNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<io.kubernetes.client.openapi.models.V1PodTemplateFluent.MetadataNested<N>> implements io.kubernetes.client.openapi.models.V1PodTemplateFluent.MetadataNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

            MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
                        
            }

            MetadataNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
                        
            }

            public N and() {
                return (N) V1PodTemplateFluentImpl.this.withMetadata(builder.build());
            }

            public N endMetadata() {
                return and();
            }
    }


    public class TemplateNestedImpl<N> extends io.kubernetes.client.openapi.models.V1PodTemplateSpecFluentImpl<io.kubernetes.client.openapi.models.V1PodTemplateFluent.TemplateNested<N>> implements io.kubernetes.client.openapi.models.V1PodTemplateFluent.TemplateNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder builder;

            TemplateNestedImpl(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
                this.builder = new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder(this, item);
                        
            }

            TemplateNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder(this);
                        
            }

            public N and() {
                return (N) V1PodTemplateFluentImpl.this.withTemplate(builder.build());
            }

            public N endTemplate() {
                return and();
            }
    }


}
