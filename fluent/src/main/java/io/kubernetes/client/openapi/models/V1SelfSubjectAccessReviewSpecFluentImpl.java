package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1SelfSubjectAccessReviewSpecFluentImpl<A extends V1SelfSubjectAccessReviewSpecFluent<A>> extends BaseFluent<A> implements V1SelfSubjectAccessReviewSpecFluent<A>{
  public V1SelfSubjectAccessReviewSpecFluentImpl() {
  }
  public V1SelfSubjectAccessReviewSpecFluentImpl(V1SelfSubjectAccessReviewSpec instance) {
    this.withNonResourceAttributes(instance.getNonResourceAttributes());

    this.withResourceAttributes(instance.getResourceAttributes());

  }
  private V1NonResourceAttributesBuilder nonResourceAttributes;
  private V1ResourceAttributesBuilder resourceAttributes;
  
  /**
   * This method has been deprecated, please use method buildNonResourceAttributes instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NonResourceAttributes getNonResourceAttributes() {
    return this.nonResourceAttributes!=null ?this.nonResourceAttributes.build():null;
  }
  public V1NonResourceAttributes buildNonResourceAttributes() {
    return this.nonResourceAttributes!=null ?this.nonResourceAttributes.build():null;
  }
  public A withNonResourceAttributes(V1NonResourceAttributes nonResourceAttributes) {
    _visitables.get("nonResourceAttributes").remove(this.nonResourceAttributes);
    if (nonResourceAttributes!=null){ this.nonResourceAttributes= new V1NonResourceAttributesBuilder(nonResourceAttributes); _visitables.get("nonResourceAttributes").add(this.nonResourceAttributes);} else { this.nonResourceAttributes = null; _visitables.get("nonResourceAttributes").remove(this.nonResourceAttributes); } return (A) this;
  }
  public Boolean hasNonResourceAttributes() {
    return this.nonResourceAttributes != null;
  }
  public V1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> withNewNonResourceAttributes() {
    return new V1SelfSubjectAccessReviewSpecFluentImpl.NonResourceAttributesNestedImpl();
  }
  public V1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> withNewNonResourceAttributesLike(V1NonResourceAttributes item) {
    return new V1SelfSubjectAccessReviewSpecFluentImpl.NonResourceAttributesNestedImpl(item);
  }
  public V1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editNonResourceAttributes() {
    return withNewNonResourceAttributesLike(getNonResourceAttributes());
  }
  public V1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editOrNewNonResourceAttributes() {
    return withNewNonResourceAttributesLike(getNonResourceAttributes() != null ? getNonResourceAttributes(): new V1NonResourceAttributesBuilder().build());
  }
  public V1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editOrNewNonResourceAttributesLike(V1NonResourceAttributes item) {
    return withNewNonResourceAttributesLike(getNonResourceAttributes() != null ? getNonResourceAttributes(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildResourceAttributes instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ResourceAttributes getResourceAttributes() {
    return this.resourceAttributes!=null ?this.resourceAttributes.build():null;
  }
  public V1ResourceAttributes buildResourceAttributes() {
    return this.resourceAttributes!=null ?this.resourceAttributes.build():null;
  }
  public A withResourceAttributes(V1ResourceAttributes resourceAttributes) {
    _visitables.get("resourceAttributes").remove(this.resourceAttributes);
    if (resourceAttributes!=null){ this.resourceAttributes= new V1ResourceAttributesBuilder(resourceAttributes); _visitables.get("resourceAttributes").add(this.resourceAttributes);} else { this.resourceAttributes = null; _visitables.get("resourceAttributes").remove(this.resourceAttributes); } return (A) this;
  }
  public Boolean hasResourceAttributes() {
    return this.resourceAttributes != null;
  }
  public V1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<A> withNewResourceAttributes() {
    return new V1SelfSubjectAccessReviewSpecFluentImpl.ResourceAttributesNestedImpl();
  }
  public V1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<A> withNewResourceAttributesLike(V1ResourceAttributes item) {
    return new V1SelfSubjectAccessReviewSpecFluentImpl.ResourceAttributesNestedImpl(item);
  }
  public V1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editResourceAttributes() {
    return withNewResourceAttributesLike(getResourceAttributes());
  }
  public V1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editOrNewResourceAttributes() {
    return withNewResourceAttributesLike(getResourceAttributes() != null ? getResourceAttributes(): new V1ResourceAttributesBuilder().build());
  }
  public V1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editOrNewResourceAttributesLike(V1ResourceAttributes item) {
    return withNewResourceAttributesLike(getResourceAttributes() != null ? getResourceAttributes(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SelfSubjectAccessReviewSpecFluentImpl that = (V1SelfSubjectAccessReviewSpecFluentImpl) o;
    if (nonResourceAttributes != null ? !nonResourceAttributes.equals(that.nonResourceAttributes) :that.nonResourceAttributes != null) return false;
    if (resourceAttributes != null ? !resourceAttributes.equals(that.resourceAttributes) :that.resourceAttributes != null) return false;
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
  class NonResourceAttributesNestedImpl<N> extends V1NonResourceAttributesFluentImpl<V1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<N>> implements V1SelfSubjectAccessReviewSpecFluent.NonResourceAttributesNested<N>,Nested<N>{
    NonResourceAttributesNestedImpl(V1NonResourceAttributes item) {
      this.builder = new V1NonResourceAttributesBuilder(this, item);
    }
    NonResourceAttributesNestedImpl() {
      this.builder = new V1NonResourceAttributesBuilder(this);
    }
    V1NonResourceAttributesBuilder builder;
    public N and() {
      return (N) V1SelfSubjectAccessReviewSpecFluentImpl.this.withNonResourceAttributes(builder.build());
    }
    public N endNonResourceAttributes() {
      return and();
    }
    
  }
  class ResourceAttributesNestedImpl<N> extends V1ResourceAttributesFluentImpl<V1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<N>> implements V1SelfSubjectAccessReviewSpecFluent.ResourceAttributesNested<N>,Nested<N>{
    ResourceAttributesNestedImpl(V1ResourceAttributes item) {
      this.builder = new V1ResourceAttributesBuilder(this, item);
    }
    ResourceAttributesNestedImpl() {
      this.builder = new V1ResourceAttributesBuilder(this);
    }
    V1ResourceAttributesBuilder builder;
    public N and() {
      return (N) V1SelfSubjectAccessReviewSpecFluentImpl.this.withResourceAttributes(builder.build());
    }
    public N endResourceAttributes() {
      return and();
    }
    
  }
  
}