package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1SelfSubjectAccessReviewSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluent<A> {

    private io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesBuilder nonResourceAttributes;
    private io.kubernetes.client.openapi.models.V1beta1ResourceAttributesBuilder resourceAttributes;

    public V1beta1SelfSubjectAccessReviewSpecFluentImpl() {
    }

    public V1beta1SelfSubjectAccessReviewSpecFluentImpl(io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpec instance) {
        this.withNonResourceAttributes(instance.getNonResourceAttributes());
        
        this.withResourceAttributes(instance.getResourceAttributes());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildNonResourceAttributes instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes getNonResourceAttributes() {
        return this.nonResourceAttributes!=null?this.nonResourceAttributes.build():null;
    }

    public io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes buildNonResourceAttributes() {
        return this.nonResourceAttributes!=null?this.nonResourceAttributes.build():null;
    }

    public A withNonResourceAttributes(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes nonResourceAttributes) {
        _visitables.get("nonResourceAttributes").remove(this.nonResourceAttributes);
        if (nonResourceAttributes!=null){ this.nonResourceAttributes= new io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesBuilder(nonResourceAttributes); _visitables.get("nonResourceAttributes").add(this.nonResourceAttributes);} return (A) this;
    }

    public java.lang.Boolean hasNonResourceAttributes() {
        return this.nonResourceAttributes != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> withNewNonResourceAttributes() {
        return new io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluentImpl.NonResourceAttributesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> withNewNonResourceAttributesLike(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes item) {
        return new io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluentImpl.NonResourceAttributesNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editNonResourceAttributes() {
        return withNewNonResourceAttributesLike(getNonResourceAttributes());
    }

    public io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editOrNewNonResourceAttributes() {
        return withNewNonResourceAttributesLike(getNonResourceAttributes() != null ? getNonResourceAttributes(): new io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editOrNewNonResourceAttributesLike(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes item) {
        return withNewNonResourceAttributesLike(getNonResourceAttributes() != null ? getNonResourceAttributes(): item);
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildResourceAttributes instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1ResourceAttributes getResourceAttributes() {
        return this.resourceAttributes!=null?this.resourceAttributes.build():null;
    }

    public io.kubernetes.client.openapi.models.V1beta1ResourceAttributes buildResourceAttributes() {
        return this.resourceAttributes!=null?this.resourceAttributes.build():null;
    }

    public A withResourceAttributes(io.kubernetes.client.openapi.models.V1beta1ResourceAttributes resourceAttributes) {
        _visitables.get("resourceAttributes").remove(this.resourceAttributes);
        if (resourceAttributes!=null){ this.resourceAttributes= new io.kubernetes.client.openapi.models.V1beta1ResourceAttributesBuilder(resourceAttributes); _visitables.get("resourceAttributes").add(this.resourceAttributes);} return (A) this;
    }

    public java.lang.Boolean hasResourceAttributes() {
        return this.resourceAttributes != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<A> withNewResourceAttributes() {
        return new io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluentImpl.ResourceAttributesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<A> withNewResourceAttributesLike(io.kubernetes.client.openapi.models.V1beta1ResourceAttributes item) {
        return new io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluentImpl.ResourceAttributesNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editResourceAttributes() {
        return withNewResourceAttributesLike(getResourceAttributes());
    }

    public io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editOrNewResourceAttributes() {
        return withNewResourceAttributesLike(getResourceAttributes() != null ? getResourceAttributes(): new io.kubernetes.client.openapi.models.V1beta1ResourceAttributesBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editOrNewResourceAttributesLike(io.kubernetes.client.openapi.models.V1beta1ResourceAttributes item) {
        return withNewResourceAttributesLike(getResourceAttributes() != null ? getResourceAttributes(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1SelfSubjectAccessReviewSpecFluentImpl that = (V1beta1SelfSubjectAccessReviewSpecFluentImpl) o;
        if (nonResourceAttributes != null ? !nonResourceAttributes.equals(that.nonResourceAttributes) :that.nonResourceAttributes != null) return false;
        if (resourceAttributes != null ? !resourceAttributes.equals(that.resourceAttributes) :that.resourceAttributes != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(nonResourceAttributes,  resourceAttributes,  super.hashCode());
    }

    public class NonResourceAttributesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesFluentImpl<io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<N>> implements io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesBuilder builder;

            NonResourceAttributesNestedImpl(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesBuilder(this, item);
                        
            }

            NonResourceAttributesNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1SelfSubjectAccessReviewSpecFluentImpl.this.withNonResourceAttributes(builder.build());
            }

            public N endNonResourceAttributes() {
                return and();
            }
    }


    public class ResourceAttributesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1ResourceAttributesFluentImpl<io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<N>> implements io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1ResourceAttributesBuilder builder;

            ResourceAttributesNestedImpl(io.kubernetes.client.openapi.models.V1beta1ResourceAttributes item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1ResourceAttributesBuilder(this, item);
                        
            }

            ResourceAttributesNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1ResourceAttributesBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1SelfSubjectAccessReviewSpecFluentImpl.this.withResourceAttributes(builder.build());
            }

            public N endResourceAttributes() {
                return and();
            }
    }


}
