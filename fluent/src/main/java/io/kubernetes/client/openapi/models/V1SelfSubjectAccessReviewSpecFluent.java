package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SelfSubjectAccessReviewSpecFluent<A extends V1SelfSubjectAccessReviewSpecFluent<A>> extends BaseFluent<A>{
  public V1SelfSubjectAccessReviewSpecFluent() {
  }
  
  public V1SelfSubjectAccessReviewSpecFluent(V1SelfSubjectAccessReviewSpec instance) {
    this.copyInstance(instance);
  }
  private V1NonResourceAttributesBuilder nonResourceAttributes;
  private V1ResourceAttributesBuilder resourceAttributes;
  
  protected void copyInstance(V1SelfSubjectAccessReviewSpec instance) {
    instance = (instance != null ? instance : new V1SelfSubjectAccessReviewSpec());
    if (instance != null) {
          this.withNonResourceAttributes(instance.getNonResourceAttributes());
          this.withResourceAttributes(instance.getResourceAttributes());
        }
  }
  
  public V1NonResourceAttributes buildNonResourceAttributes() {
    return this.nonResourceAttributes != null ? this.nonResourceAttributes.build() : null;
  }
  
  public A withNonResourceAttributes(V1NonResourceAttributes nonResourceAttributes) {
    this._visitables.remove("nonResourceAttributes");
    if (nonResourceAttributes != null) {
        this.nonResourceAttributes = new V1NonResourceAttributesBuilder(nonResourceAttributes);
        this._visitables.get("nonResourceAttributes").add(this.nonResourceAttributes);
    } else {
        this.nonResourceAttributes = null;
        this._visitables.get("nonResourceAttributes").remove(this.nonResourceAttributes);
    }
    return (A) this;
  }
  
  public boolean hasNonResourceAttributes() {
    return this.nonResourceAttributes != null;
  }
  
  public NonResourceAttributesNested<A> withNewNonResourceAttributes() {
    return new NonResourceAttributesNested(null);
  }
  
  public NonResourceAttributesNested<A> withNewNonResourceAttributesLike(V1NonResourceAttributes item) {
    return new NonResourceAttributesNested(item);
  }
  
  public NonResourceAttributesNested<A> editNonResourceAttributes() {
    return withNewNonResourceAttributesLike(java.util.Optional.ofNullable(buildNonResourceAttributes()).orElse(null));
  }
  
  public NonResourceAttributesNested<A> editOrNewNonResourceAttributes() {
    return withNewNonResourceAttributesLike(java.util.Optional.ofNullable(buildNonResourceAttributes()).orElse(new V1NonResourceAttributesBuilder().build()));
  }
  
  public NonResourceAttributesNested<A> editOrNewNonResourceAttributesLike(V1NonResourceAttributes item) {
    return withNewNonResourceAttributesLike(java.util.Optional.ofNullable(buildNonResourceAttributes()).orElse(item));
  }
  
  public V1ResourceAttributes buildResourceAttributes() {
    return this.resourceAttributes != null ? this.resourceAttributes.build() : null;
  }
  
  public A withResourceAttributes(V1ResourceAttributes resourceAttributes) {
    this._visitables.remove("resourceAttributes");
    if (resourceAttributes != null) {
        this.resourceAttributes = new V1ResourceAttributesBuilder(resourceAttributes);
        this._visitables.get("resourceAttributes").add(this.resourceAttributes);
    } else {
        this.resourceAttributes = null;
        this._visitables.get("resourceAttributes").remove(this.resourceAttributes);
    }
    return (A) this;
  }
  
  public boolean hasResourceAttributes() {
    return this.resourceAttributes != null;
  }
  
  public ResourceAttributesNested<A> withNewResourceAttributes() {
    return new ResourceAttributesNested(null);
  }
  
  public ResourceAttributesNested<A> withNewResourceAttributesLike(V1ResourceAttributes item) {
    return new ResourceAttributesNested(item);
  }
  
  public ResourceAttributesNested<A> editResourceAttributes() {
    return withNewResourceAttributesLike(java.util.Optional.ofNullable(buildResourceAttributes()).orElse(null));
  }
  
  public ResourceAttributesNested<A> editOrNewResourceAttributes() {
    return withNewResourceAttributesLike(java.util.Optional.ofNullable(buildResourceAttributes()).orElse(new V1ResourceAttributesBuilder().build()));
  }
  
  public ResourceAttributesNested<A> editOrNewResourceAttributesLike(V1ResourceAttributes item) {
    return withNewResourceAttributesLike(java.util.Optional.ofNullable(buildResourceAttributes()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SelfSubjectAccessReviewSpecFluent that = (V1SelfSubjectAccessReviewSpecFluent) o;
    if (!java.util.Objects.equals(nonResourceAttributes, that.nonResourceAttributes)) return false;
    if (!java.util.Objects.equals(resourceAttributes, that.resourceAttributes)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(nonResourceAttributes,  resourceAttributes,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (nonResourceAttributes != null) { sb.append("nonResourceAttributes:"); sb.append(nonResourceAttributes + ","); }
    if (resourceAttributes != null) { sb.append("resourceAttributes:"); sb.append(resourceAttributes); }
    sb.append("}");
    return sb.toString();
  }
  public class NonResourceAttributesNested<N> extends V1NonResourceAttributesFluent<NonResourceAttributesNested<N>> implements Nested<N>{
    NonResourceAttributesNested(V1NonResourceAttributes item) {
      this.builder = new V1NonResourceAttributesBuilder(this, item);
    }
    V1NonResourceAttributesBuilder builder;
    
    public N and() {
      return (N) V1SelfSubjectAccessReviewSpecFluent.this.withNonResourceAttributes(builder.build());
    }
    
    public N endNonResourceAttributes() {
      return and();
    }
    
  
  }
  public class ResourceAttributesNested<N> extends V1ResourceAttributesFluent<ResourceAttributesNested<N>> implements Nested<N>{
    ResourceAttributesNested(V1ResourceAttributes item) {
      this.builder = new V1ResourceAttributesBuilder(this, item);
    }
    V1ResourceAttributesBuilder builder;
    
    public N and() {
      return (N) V1SelfSubjectAccessReviewSpecFluent.this.withResourceAttributes(builder.build());
    }
    
    public N endResourceAttributes() {
      return and();
    }
    
  
  }

}