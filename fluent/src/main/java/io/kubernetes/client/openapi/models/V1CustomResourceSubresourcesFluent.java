package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CustomResourceSubresourcesFluent<A extends io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent<A>> extends BaseFluent<A>{
  public V1CustomResourceSubresourcesFluent() {
  }
  
  public V1CustomResourceSubresourcesFluent(V1CustomResourceSubresources instance) {
    this.copyInstance(instance);
  }
  private V1CustomResourceSubresourceScaleBuilder scale;
  private Object status;
  
  protected void copyInstance(V1CustomResourceSubresources instance) {
    instance = instance != null ? instance : new V1CustomResourceSubresources();
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
    return this.withNewScaleLike(Optional.ofNullable(this.buildScale()).orElse(null));
  }
  
  public ScaleNested<A> editOrNewScale() {
    return this.withNewScaleLike(Optional.ofNullable(this.buildScale()).orElse(new V1CustomResourceSubresourceScaleBuilder().build()));
  }
  
  public ScaleNested<A> editOrNewScaleLike(V1CustomResourceSubresourceScale item) {
    return this.withNewScaleLike(Optional.ofNullable(this.buildScale()).orElse(item));
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
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1CustomResourceSubresourcesFluent that = (V1CustomResourceSubresourcesFluent) o;
    if (!(Objects.equals(scale, that.scale))) {
      return false;
    }
    if (!(Objects.equals(status, that.status))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(scale, status);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(scale == null)) {
        sb.append("scale:");
        sb.append(scale);
        sb.append(",");
    }
    if (!(status == null)) {
        sb.append("status:");
        sb.append(status);
    }
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