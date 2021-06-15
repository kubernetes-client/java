package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1CustomResourceSubresourcesFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent<A> {

    private io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScaleBuilder scale;
    private java.lang.Object status;

    public V1beta1CustomResourceSubresourcesFluentImpl() {
    }

    public V1beta1CustomResourceSubresourcesFluentImpl(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresources instance) {
        this.withScale(instance.getScale());
        
        this.withStatus(instance.getStatus());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildScale instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScale getScale() {
        return this.scale!=null?this.scale.build():null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScale buildScale() {
        return this.scale!=null?this.scale.build():null;
    }

    public A withScale(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScale scale) {
        _visitables.get("scale").remove(this.scale);
        if (scale!=null){ this.scale= new io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScaleBuilder(scale); _visitables.get("scale").add(this.scale);} return (A) this;
    }

    public java.lang.Boolean hasScale() {
        return this.scale != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent.ScaleNested<A> withNewScale() {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluentImpl.ScaleNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent.ScaleNested<A> withNewScaleLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScale item) {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluentImpl.ScaleNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent.ScaleNested<A> editScale() {
        return withNewScaleLike(getScale());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent.ScaleNested<A> editOrNewScale() {
        return withNewScaleLike(getScale() != null ? getScale(): new io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScaleBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent.ScaleNested<A> editOrNewScaleLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScale item) {
        return withNewScaleLike(getScale() != null ? getScale(): item);
    }

    public java.lang.Object getStatus() {
        return this.status;
    }

    public A withStatus(java.lang.Object status) {
        this.status=status; return (A) this;
    }

    public java.lang.Boolean hasStatus() {
        return this.status != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1CustomResourceSubresourcesFluentImpl that = (V1beta1CustomResourceSubresourcesFluentImpl) o;
        if (scale != null ? !scale.equals(that.scale) :that.scale != null) return false;
        if (status != null ? !status.equals(that.status) :that.status != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(scale,  status,  super.hashCode());
    }

    public class ScaleNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScaleFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent.ScaleNested<N>> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent.ScaleNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScaleBuilder builder;

            ScaleNestedImpl(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScale item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScaleBuilder(this, item);
                        
            }

            ScaleNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScaleBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1CustomResourceSubresourcesFluentImpl.this.withScale(builder.build());
            }

            public N endScale() {
                return and();
            }
    }


}
