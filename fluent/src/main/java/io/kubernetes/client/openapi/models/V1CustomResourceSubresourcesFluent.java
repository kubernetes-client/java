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
public class V1CustomResourceSubresourcesFluent<A extends V1CustomResourceSubresourcesFluent<A>> extends BaseFluent<A>{
  public V1CustomResourceSubresourcesFluent() {
  }
  
  public V1CustomResourceSubresourcesFluent(V1CustomResourceSubresources instance) {
    this.copyInstance(instance);
  }
  private V1CustomResourceSubresourceScaleBuilder scale;
  private Object status;
  
  protected void copyInstance(V1CustomResourceSubresources instance) {
    instance = (instance != null ? instance : new V1CustomResourceSubresources());
    if (instance != null) {
          this.withScale(instance.getScale());
          this.withStatus(instance.getStatus());
        }
  }
  
  public V1CustomResourceSubresourceScale buildScale() {
    return this.scale != null ? this.scale.build() : null;
  }
  
  public A withScale(V1CustomResourceSubresourceScale scale) {
    this._visitables.remove("scale");
    if (scale != null) {
        this.scale = new V1CustomResourceSubresourceScaleBuilder(scale);
        this._visitables.get("scale").add(this.scale);
    } else {
        this.scale = null;
        this._visitables.get("scale").remove(this.scale);
    }
    return (A) this;
  }
  
  public boolean hasScale() {
    return this.scale != null;
  }
  
  public ScaleNested<A> withNewScale() {
    return new ScaleNested(null);
  }
  
  public ScaleNested<A> withNewScaleLike(V1CustomResourceSubresourceScale item) {
    return new ScaleNested(item);
  }
  
  public ScaleNested<A> editScale() {
    return withNewScaleLike(java.util.Optional.ofNullable(buildScale()).orElse(null));
  }
  
  public ScaleNested<A> editOrNewScale() {
    return withNewScaleLike(java.util.Optional.ofNullable(buildScale()).orElse(new V1CustomResourceSubresourceScaleBuilder().build()));
  }
  
  public ScaleNested<A> editOrNewScaleLike(V1CustomResourceSubresourceScale item) {
    return withNewScaleLike(java.util.Optional.ofNullable(buildScale()).orElse(item));
  }
  
  public Object getStatus() {
    return this.status;
  }
  
  public A withStatus(Object status) {
    this.status = status;
    return (A) this;
  }
  
  public boolean hasStatus() {
    return this.status != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CustomResourceSubresourcesFluent that = (V1CustomResourceSubresourcesFluent) o;
    if (!java.util.Objects.equals(scale, that.scale)) return false;
    if (!java.util.Objects.equals(status, that.status)) return false;
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
  public class ScaleNested<N> extends V1CustomResourceSubresourceScaleFluent<ScaleNested<N>> implements Nested<N>{
    ScaleNested(V1CustomResourceSubresourceScale item) {
      this.builder = new V1CustomResourceSubresourceScaleBuilder(this, item);
    }
    V1CustomResourceSubresourceScaleBuilder builder;
    
    public N and() {
      return (N) V1CustomResourceSubresourcesFluent.this.withScale(builder.build());
    }
    
    public N endScale() {
      return and();
    }
    
  
  }

}