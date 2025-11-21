package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1IPAddressSpecFluent<A extends io.kubernetes.client.openapi.models.V1IPAddressSpecFluent<A>> extends BaseFluent<A>{

  private V1ParentReferenceBuilder parentRef;

  public V1IPAddressSpecFluent() {
  }
  
  public V1IPAddressSpecFluent(V1IPAddressSpec instance) {
    this.copyInstance(instance);
  }

  public V1ParentReference buildParentRef() {
    return this.parentRef != null ? this.parentRef.build() : null;
  }
  
  protected void copyInstance(V1IPAddressSpec instance) {
    instance = instance != null ? instance : new V1IPAddressSpec();
    if (instance != null) {
      this.withParentRef(instance.getParentRef());
    }
  }
  
  public ParentRefNested<A> editOrNewParentRef() {
    return this.withNewParentRefLike(Optional.ofNullable(this.buildParentRef()).orElse(new V1ParentReferenceBuilder().build()));
  }
  
  public ParentRefNested<A> editOrNewParentRefLike(V1ParentReference item) {
    return this.withNewParentRefLike(Optional.ofNullable(this.buildParentRef()).orElse(item));
  }
  
  public ParentRefNested<A> editParentRef() {
    return this.withNewParentRefLike(Optional.ofNullable(this.buildParentRef()).orElse(null));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1IPAddressSpecFluent that = (V1IPAddressSpecFluent) o;
    if (!(Objects.equals(parentRef, that.parentRef))) {
      return false;
    }
    return true;
  }
  
  public boolean hasParentRef() {
    return this.parentRef != null;
  }
  
  public int hashCode() {
    return Objects.hash(parentRef);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(parentRef == null)) {
        sb.append("parentRef:");
        sb.append(parentRef);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public ParentRefNested<A> withNewParentRef() {
    return new ParentRefNested(null);
  }
  
  public ParentRefNested<A> withNewParentRefLike(V1ParentReference item) {
    return new ParentRefNested(item);
  }
  
  public A withParentRef(V1ParentReference parentRef) {
    this._visitables.remove("parentRef");
    if (parentRef != null) {
        this.parentRef = new V1ParentReferenceBuilder(parentRef);
        this._visitables.get("parentRef").add(this.parentRef);
    } else {
        this.parentRef = null;
        this._visitables.get("parentRef").remove(this.parentRef);
    }
    return (A) this;
  }
  public class ParentRefNested<N> extends V1ParentReferenceFluent<ParentRefNested<N>> implements Nested<N>{
  
    V1ParentReferenceBuilder builder;
  
    ParentRefNested(V1ParentReference item) {
      this.builder = new V1ParentReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1IPAddressSpecFluent.this.withParentRef(builder.build());
    }
    
    public N endParentRef() {
      return and();
    }
    
  }
}