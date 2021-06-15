package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1VolumeAttachmentSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent<A> {

    private java.lang.String attacher;
    private java.lang.String nodeName;
    private io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceBuilder source;

    public V1VolumeAttachmentSpecFluentImpl() {
    }

    public V1VolumeAttachmentSpecFluentImpl(io.kubernetes.client.openapi.models.V1VolumeAttachmentSpec instance) {
        this.withAttacher(instance.getAttacher());
        
        this.withNodeName(instance.getNodeName());
        
        this.withSource(instance.getSource());
    }

    public java.lang.String getAttacher() {
        return this.attacher;
    }

    public A withAttacher(java.lang.String attacher) {
        this.attacher=attacher; return (A) this;
    }

    public java.lang.Boolean hasAttacher() {
        return this.attacher != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withAttacher instead.
     */
        public A withNewAttacher(java.lang.String original) {
        return (A)withAttacher(new String(original));
    }

    public java.lang.String getNodeName() {
        return this.nodeName;
    }

    public A withNodeName(java.lang.String nodeName) {
        this.nodeName=nodeName; return (A) this;
    }

    public java.lang.Boolean hasNodeName() {
        return this.nodeName != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withNodeName instead.
     */
        public A withNewNodeName(java.lang.String original) {
        return (A)withNodeName(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSource instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1VolumeAttachmentSource getSource() {
        return this.source!=null?this.source.build():null;
    }

    public io.kubernetes.client.openapi.models.V1VolumeAttachmentSource buildSource() {
        return this.source!=null?this.source.build():null;
    }

    public A withSource(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource source) {
        _visitables.get("source").remove(this.source);
        if (source!=null){ this.source= new io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceBuilder(source); _visitables.get("source").add(this.source);} return (A) this;
    }

    public java.lang.Boolean hasSource() {
        return this.source != null;
    }

    public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A> withNewSource() {
        return new io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluentImpl.SourceNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A> withNewSourceLike(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource item) {
        return new io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluentImpl.SourceNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A> editSource() {
        return withNewSourceLike(getSource());
    }

    public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A> editOrNewSource() {
        return withNewSourceLike(getSource() != null ? getSource(): new io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<A> editOrNewSourceLike(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource item) {
        return withNewSourceLike(getSource() != null ? getSource(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1VolumeAttachmentSpecFluentImpl that = (V1VolumeAttachmentSpecFluentImpl) o;
        if (attacher != null ? !attacher.equals(that.attacher) :that.attacher != null) return false;
        if (nodeName != null ? !nodeName.equals(that.nodeName) :that.nodeName != null) return false;
        if (source != null ? !source.equals(that.source) :that.source != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(attacher,  nodeName,  source,  super.hashCode());
    }

    public class SourceNestedImpl<N> extends io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluentImpl<io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<N>> implements io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent.SourceNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceBuilder builder;

            SourceNestedImpl(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource item) {
                this.builder = new io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceBuilder(this, item);
                        
            }

            SourceNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceBuilder(this);
                        
            }

            public N and() {
                return (N) V1VolumeAttachmentSpecFluentImpl.this.withSource(builder.build());
            }

            public N endSource() {
                return and();
            }
    }


}
