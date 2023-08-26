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
  public class V1PodResourceClaimFluentImpl<A extends V1PodResourceClaimFluent<A>> extends BaseFluent<A> implements V1PodResourceClaimFluent<A>{
  public V1PodResourceClaimFluentImpl() {
  }
  public V1PodResourceClaimFluentImpl(V1PodResourceClaim instance) {
    if (instance != null) {
      this.withName(instance.getName());
      this.withSource(instance.getSource());
    }
  }
  private String name;
  private V1ClaimSourceBuilder source;
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * This method has been deprecated, please use method buildSource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ClaimSource getSource() {
    return this.source!=null ?this.source.build():null;
  }
  public V1ClaimSource buildSource() {
    return this.source!=null ?this.source.build():null;
  }
  public A withSource(V1ClaimSource source) {
    _visitables.get("source").remove(this.source);
    if (source!=null){ this.source= new V1ClaimSourceBuilder(source); _visitables.get("source").add(this.source);} else { this.source = null; _visitables.get("source").remove(this.source); } return (A) this;
  }
  public Boolean hasSource() {
    return this.source != null;
  }
  public V1PodResourceClaimFluentImpl.SourceNested<A> withNewSource() {
    return new V1PodResourceClaimFluentImpl.SourceNestedImpl();
  }
  public V1PodResourceClaimFluentImpl.SourceNested<A> withNewSourceLike(V1ClaimSource item) {
    return new V1PodResourceClaimFluentImpl.SourceNestedImpl(item);
  }
  public V1PodResourceClaimFluentImpl.SourceNested<A> editSource() {
    return withNewSourceLike(getSource());
  }
  public V1PodResourceClaimFluentImpl.SourceNested<A> editOrNewSource() {
    return withNewSourceLike(getSource() != null ? getSource(): new V1ClaimSourceBuilder().build());
  }
  public V1PodResourceClaimFluentImpl.SourceNested<A> editOrNewSourceLike(V1ClaimSource item) {
    return withNewSourceLike(getSource() != null ? getSource(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodResourceClaimFluentImpl that = (V1PodResourceClaimFluentImpl) o;
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
  class SourceNestedImpl<N> extends V1ClaimSourceFluentImpl<V1PodResourceClaimFluentImpl.SourceNested<N>> implements V1PodResourceClaimFluentImpl.SourceNested<N>,Nested<N>{
    SourceNestedImpl(V1ClaimSource item) {
      this.builder = new V1ClaimSourceBuilder(this, item);
    }
    SourceNestedImpl() {
      this.builder = new V1ClaimSourceBuilder(this);
    }
    V1ClaimSourceBuilder builder;
    public N and() {
      return (N) V1PodResourceClaimFluentImpl.this.withSource(builder.build());
    }
    public N endSource() {
      return and();
    }
    
  }
  
}