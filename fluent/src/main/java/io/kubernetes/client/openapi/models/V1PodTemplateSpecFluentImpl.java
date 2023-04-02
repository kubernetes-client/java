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
  public class V1PodTemplateSpecFluentImpl<A extends V1PodTemplateSpecFluent<A>> extends BaseFluent<A> implements V1PodTemplateSpecFluent<A>{
  public V1PodTemplateSpecFluentImpl() {
  }
  public V1PodTemplateSpecFluentImpl(V1PodTemplateSpec instance) {
    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

  }
  private V1ObjectMetaBuilder metadata;
  private V1PodSpecBuilder spec;
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ObjectMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V1PodTemplateSpecFluent.MetadataNested<A> withNewMetadata() {
    return new V1PodTemplateSpecFluentImpl.MetadataNestedImpl();
  }
  public V1PodTemplateSpecFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1PodTemplateSpecFluentImpl.MetadataNestedImpl(item);
  }
  public V1PodTemplateSpecFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1PodTemplateSpecFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1PodTemplateSpecFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodSpec getSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public V1PodSpec buildSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public A withSpec(V1PodSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new V1PodSpecBuilder(spec); _visitables.get("spec").add(this.spec);} else { this.spec = null; _visitables.get("spec").remove(this.spec); } return (A) this;
  }
  public Boolean hasSpec() {
    return this.spec != null;
  }
  public V1PodTemplateSpecFluent.SpecNested<A> withNewSpec() {
    return new V1PodTemplateSpecFluentImpl.SpecNestedImpl();
  }
  public V1PodTemplateSpecFluent.SpecNested<A> withNewSpecLike(V1PodSpec item) {
    return new V1PodTemplateSpecFluentImpl.SpecNestedImpl(item);
  }
  public V1PodTemplateSpecFluent.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public V1PodTemplateSpecFluent.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new V1PodSpecBuilder().build());
  }
  public V1PodTemplateSpecFluent.SpecNested<A> editOrNewSpecLike(V1PodSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodTemplateSpecFluentImpl that = (V1PodTemplateSpecFluentImpl) o;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(metadata,  spec,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (spec != null) { sb.append("spec:"); sb.append(spec); }
    sb.append("}");
    return sb.toString();
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1PodTemplateSpecFluent.MetadataNested<N>> implements V1PodTemplateSpecFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1PodTemplateSpecFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class SpecNestedImpl<N> extends V1PodSpecFluentImpl<V1PodTemplateSpecFluent.SpecNested<N>> implements V1PodTemplateSpecFluent.SpecNested<N>,Nested<N>{
    SpecNestedImpl(V1PodSpec item) {
      this.builder = new V1PodSpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new V1PodSpecBuilder(this);
    }
    V1PodSpecBuilder builder;
    public N and() {
      return (N) V1PodTemplateSpecFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  
}