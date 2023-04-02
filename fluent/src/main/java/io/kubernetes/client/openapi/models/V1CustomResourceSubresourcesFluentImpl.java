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
  public class V1CustomResourceSubresourcesFluentImpl<A extends V1CustomResourceSubresourcesFluent<A>> extends BaseFluent<A> implements V1CustomResourceSubresourcesFluent<A>{
  public V1CustomResourceSubresourcesFluentImpl() {
  }
  public V1CustomResourceSubresourcesFluentImpl(V1CustomResourceSubresources instance) {
    this.withScale(instance.getScale());

    this.withStatus(instance.getStatus());

  }
  private V1CustomResourceSubresourceScaleBuilder scale;
  private Object status;
  
  /**
   * This method has been deprecated, please use method buildScale instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CustomResourceSubresourceScale getScale() {
    return this.scale!=null ?this.scale.build():null;
  }
  public V1CustomResourceSubresourceScale buildScale() {
    return this.scale!=null ?this.scale.build():null;
  }
  public A withScale(V1CustomResourceSubresourceScale scale) {
    _visitables.get("scale").remove(this.scale);
    if (scale!=null){ this.scale= new V1CustomResourceSubresourceScaleBuilder(scale); _visitables.get("scale").add(this.scale);} else { this.scale = null; _visitables.get("scale").remove(this.scale); } return (A) this;
  }
  public Boolean hasScale() {
    return this.scale != null;
  }
  public V1CustomResourceSubresourcesFluent.ScaleNested<A> withNewScale() {
    return new V1CustomResourceSubresourcesFluentImpl.ScaleNestedImpl();
  }
  public V1CustomResourceSubresourcesFluent.ScaleNested<A> withNewScaleLike(V1CustomResourceSubresourceScale item) {
    return new V1CustomResourceSubresourcesFluentImpl.ScaleNestedImpl(item);
  }
  public V1CustomResourceSubresourcesFluent.ScaleNested<A> editScale() {
    return withNewScaleLike(getScale());
  }
  public V1CustomResourceSubresourcesFluent.ScaleNested<A> editOrNewScale() {
    return withNewScaleLike(getScale() != null ? getScale(): new V1CustomResourceSubresourceScaleBuilder().build());
  }
  public V1CustomResourceSubresourcesFluent.ScaleNested<A> editOrNewScaleLike(V1CustomResourceSubresourceScale item) {
    return withNewScaleLike(getScale() != null ? getScale(): item);
  }
  public Object getStatus() {
    return this.status;
  }
  public A withStatus(Object status) {
    this.status=status; return (A) this;
  }
  public Boolean hasStatus() {
    return this.status != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CustomResourceSubresourcesFluentImpl that = (V1CustomResourceSubresourcesFluentImpl) o;
    if (scale != null ? !scale.equals(that.scale) :that.scale != null) return false;
    if (status != null ? !status.equals(that.status) :that.status != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(scale,  status,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (scale != null) { sb.append("scale:"); sb.append(scale + ","); }
    if (status != null) { sb.append("status:"); sb.append(status); }
    sb.append("}");
    return sb.toString();
  }
  class ScaleNestedImpl<N> extends V1CustomResourceSubresourceScaleFluentImpl<V1CustomResourceSubresourcesFluent.ScaleNested<N>> implements V1CustomResourceSubresourcesFluent.ScaleNested<N>,Nested<N>{
    ScaleNestedImpl(V1CustomResourceSubresourceScale item) {
      this.builder = new V1CustomResourceSubresourceScaleBuilder(this, item);
    }
    ScaleNestedImpl() {
      this.builder = new V1CustomResourceSubresourceScaleBuilder(this);
    }
    V1CustomResourceSubresourceScaleBuilder builder;
    public N and() {
      return (N) V1CustomResourceSubresourcesFluentImpl.this.withScale(builder.build());
    }
    public N endScale() {
      return and();
    }
    
  }
  
}