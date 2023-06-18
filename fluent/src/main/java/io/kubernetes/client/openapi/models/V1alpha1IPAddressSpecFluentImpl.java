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
  public class V1alpha1IPAddressSpecFluentImpl<A extends V1alpha1IPAddressSpecFluent<A>> extends BaseFluent<A> implements V1alpha1IPAddressSpecFluent<A>{
  public V1alpha1IPAddressSpecFluentImpl() {
  }
  public V1alpha1IPAddressSpecFluentImpl(V1alpha1IPAddressSpec instance) {
    if (instance != null) {
      this.withParentRef(instance.getParentRef());
    }
  }
  private V1alpha1ParentReferenceBuilder parentRef;
  
  /**
   * This method has been deprecated, please use method buildParentRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1ParentReference getParentRef() {
    return this.parentRef!=null ?this.parentRef.build():null;
  }
  public V1alpha1ParentReference buildParentRef() {
    return this.parentRef!=null ?this.parentRef.build():null;
  }
  public A withParentRef(V1alpha1ParentReference parentRef) {
    _visitables.get("parentRef").remove(this.parentRef);
    if (parentRef!=null){ this.parentRef= new V1alpha1ParentReferenceBuilder(parentRef); _visitables.get("parentRef").add(this.parentRef);} else { this.parentRef = null; _visitables.get("parentRef").remove(this.parentRef); } return (A) this;
  }
  public Boolean hasParentRef() {
    return this.parentRef != null;
  }
  public V1alpha1IPAddressSpecFluentImpl.ParentRefNested<A> withNewParentRef() {
    return new V1alpha1IPAddressSpecFluentImpl.ParentRefNestedImpl();
  }
  public V1alpha1IPAddressSpecFluentImpl.ParentRefNested<A> withNewParentRefLike(V1alpha1ParentReference item) {
    return new V1alpha1IPAddressSpecFluentImpl.ParentRefNestedImpl(item);
  }
  public V1alpha1IPAddressSpecFluentImpl.ParentRefNested<A> editParentRef() {
    return withNewParentRefLike(getParentRef());
  }
  public V1alpha1IPAddressSpecFluentImpl.ParentRefNested<A> editOrNewParentRef() {
    return withNewParentRefLike(getParentRef() != null ? getParentRef(): new V1alpha1ParentReferenceBuilder().build());
  }
  public V1alpha1IPAddressSpecFluentImpl.ParentRefNested<A> editOrNewParentRefLike(V1alpha1ParentReference item) {
    return withNewParentRefLike(getParentRef() != null ? getParentRef(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1IPAddressSpecFluentImpl that = (V1alpha1IPAddressSpecFluentImpl) o;
    if (!java.util.Objects.equals(parentRef, that.parentRef)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(parentRef,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (parentRef != null) { sb.append("parentRef:"); sb.append(parentRef); }
    sb.append("}");
    return sb.toString();
  }
  class ParentRefNestedImpl<N> extends V1alpha1ParentReferenceFluentImpl<V1alpha1IPAddressSpecFluentImpl.ParentRefNested<N>> implements V1alpha1IPAddressSpecFluentImpl.ParentRefNested<N>,Nested<N>{
    ParentRefNestedImpl(V1alpha1ParentReference item) {
      this.builder = new V1alpha1ParentReferenceBuilder(this, item);
    }
    ParentRefNestedImpl() {
      this.builder = new V1alpha1ParentReferenceBuilder(this);
    }
    V1alpha1ParentReferenceBuilder builder;
    public N and() {
      return (N) V1alpha1IPAddressSpecFluentImpl.this.withParentRef(builder.build());
    }
    public N endParentRef() {
      return and();
    }
    
  }
  
}