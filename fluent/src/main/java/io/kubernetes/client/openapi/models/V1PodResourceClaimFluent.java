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
public class V1PodResourceClaimFluent<A extends V1PodResourceClaimFluent<A>> extends BaseFluent<A>{
  public V1PodResourceClaimFluent() {
  }
  
  public V1PodResourceClaimFluent(V1PodResourceClaim instance) {
    this.copyInstance(instance);
  }
  private String name;
  private V1ClaimSourceBuilder source;
  
  protected void copyInstance(V1PodResourceClaim instance) {
    instance = (instance != null ? instance : new V1PodResourceClaim());
    if (instance != null) {
          this.withName(instance.getName());
          this.withSource(instance.getSource());
        }
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public V1ClaimSource buildSource() {
    return this.source != null ? this.source.build() : null;
  }
  
  public A withSource(V1ClaimSource source) {
    this._visitables.remove("source");
    if (source != null) {
        this.source = new V1ClaimSourceBuilder(source);
        this._visitables.get("source").add(this.source);
    } else {
        this.source = null;
        this._visitables.get("source").remove(this.source);
    }
    return (A) this;
  }
  
  public boolean hasSource() {
    return this.source != null;
  }
  
  public SourceNested<A> withNewSource() {
    return new SourceNested(null);
  }
  
  public SourceNested<A> withNewSourceLike(V1ClaimSource item) {
    return new SourceNested(item);
  }
  
  public SourceNested<A> editSource() {
    return withNewSourceLike(java.util.Optional.ofNullable(buildSource()).orElse(null));
  }
  
  public SourceNested<A> editOrNewSource() {
    return withNewSourceLike(java.util.Optional.ofNullable(buildSource()).orElse(new V1ClaimSourceBuilder().build()));
  }
  
  public SourceNested<A> editOrNewSourceLike(V1ClaimSource item) {
    return withNewSourceLike(java.util.Optional.ofNullable(buildSource()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodResourceClaimFluent that = (V1PodResourceClaimFluent) o;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(source, that.source)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(name,  source,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (source != null) { sb.append("source:"); sb.append(source); }
    sb.append("}");
    return sb.toString();
  }
  public class SourceNested<N> extends V1ClaimSourceFluent<SourceNested<N>> implements Nested<N>{
    SourceNested(V1ClaimSource item) {
      this.builder = new V1ClaimSourceBuilder(this, item);
    }
    V1ClaimSourceBuilder builder;
    
    public N and() {
      return (N) V1PodResourceClaimFluent.this.withSource(builder.build());
    }
    
    public N endSource() {
      return and();
    }
    
  
  }

}