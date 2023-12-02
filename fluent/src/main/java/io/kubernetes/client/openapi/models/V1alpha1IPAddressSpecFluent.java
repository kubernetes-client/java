package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1IPAddressSpecFluent<A extends V1alpha1IPAddressSpecFluent<A>> extends BaseFluent<A>{
  public V1alpha1IPAddressSpecFluent() {
  }
  
  public V1alpha1IPAddressSpecFluent(V1alpha1IPAddressSpec instance) {
    this.copyInstance(instance);
  }
  private V1alpha1ParentReferenceBuilder parentRef;
  
  protected void copyInstance(V1alpha1IPAddressSpec instance) {
    instance = (instance != null ? instance : new V1alpha1IPAddressSpec());
    if (instance != null) {
          this.withParentRef(instance.getParentRef());
        }
  }
  
  public V1alpha1ParentReference buildParentRef() {
    return this.parentRef != null ? this.parentRef.build() : null;
  }
  
  public A withParentRef(V1alpha1ParentReference parentRef) {
    this._visitables.remove("parentRef");
    if (parentRef != null) {
        this.parentRef = new V1alpha1ParentReferenceBuilder(parentRef);
        this._visitables.get("parentRef").add(this.parentRef);
    } else {
        this.parentRef = null;
        this._visitables.get("parentRef").remove(this.parentRef);
    }
    return (A) this;
  }
  
  public boolean hasParentRef() {
    return this.parentRef != null;
  }
  
  public ParentRefNested<A> withNewParentRef() {
    return new ParentRefNested(null);
  }
  
  public ParentRefNested<A> withNewParentRefLike(V1alpha1ParentReference item) {
    return new ParentRefNested(item);
  }
  
  public ParentRefNested<A> editParentRef() {
    return withNewParentRefLike(java.util.Optional.ofNullable(buildParentRef()).orElse(null));
  }
  
  public ParentRefNested<A> editOrNewParentRef() {
    return withNewParentRefLike(java.util.Optional.ofNullable(buildParentRef()).orElse(new V1alpha1ParentReferenceBuilder().build()));
  }
  
  public ParentRefNested<A> editOrNewParentRefLike(V1alpha1ParentReference item) {
    return withNewParentRefLike(java.util.Optional.ofNullable(buildParentRef()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1IPAddressSpecFluent that = (V1alpha1IPAddressSpecFluent) o;
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
  public class ParentRefNested<N> extends V1alpha1ParentReferenceFluent<ParentRefNested<N>> implements Nested<N>{
    ParentRefNested(V1alpha1ParentReference item) {
      this.builder = new V1alpha1ParentReferenceBuilder(this, item);
    }
    V1alpha1ParentReferenceBuilder builder;
    
    public N and() {
      return (N) V1alpha1IPAddressSpecFluent.this.withParentRef(builder.build());
    }
    
    public N endParentRef() {
      return and();
    }
    
  
  }

}