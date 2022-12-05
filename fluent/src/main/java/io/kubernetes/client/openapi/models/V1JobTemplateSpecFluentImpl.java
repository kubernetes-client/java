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
  public class V1JobTemplateSpecFluentImpl<A extends V1JobTemplateSpecFluent<A>> extends BaseFluent<A> implements V1JobTemplateSpecFluent<A>{
  public V1JobTemplateSpecFluentImpl() {
  }
  public V1JobTemplateSpecFluentImpl(V1JobTemplateSpec instance) {
    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

  }
  private V1ObjectMetaBuilder metadata;
  private V1JobSpecBuilder spec;
  
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
  public V1JobTemplateSpecFluent.MetadataNested<A> withNewMetadata() {
    return new V1JobTemplateSpecFluentImpl.MetadataNestedImpl();
  }
  public V1JobTemplateSpecFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1JobTemplateSpecFluentImpl.MetadataNestedImpl(item);
  }
  public V1JobTemplateSpecFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1JobTemplateSpecFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1JobTemplateSpecFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1JobSpec getSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public V1JobSpec buildSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public A withSpec(V1JobSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new V1JobSpecBuilder(spec); _visitables.get("spec").add(this.spec);} else { this.spec = null; _visitables.get("spec").remove(this.spec); } return (A) this;
  }
  public Boolean hasSpec() {
    return this.spec != null;
  }
  public V1JobTemplateSpecFluent.SpecNested<A> withNewSpec() {
    return new V1JobTemplateSpecFluentImpl.SpecNestedImpl();
  }
  public V1JobTemplateSpecFluent.SpecNested<A> withNewSpecLike(V1JobSpec item) {
    return new V1JobTemplateSpecFluentImpl.SpecNestedImpl(item);
  }
  public V1JobTemplateSpecFluent.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public V1JobTemplateSpecFluent.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new V1JobSpecBuilder().build());
  }
  public V1JobTemplateSpecFluent.SpecNested<A> editOrNewSpecLike(V1JobSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1JobTemplateSpecFluentImpl that = (V1JobTemplateSpecFluentImpl) o;
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
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1JobTemplateSpecFluent.MetadataNested<N>> implements V1JobTemplateSpecFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1JobTemplateSpecFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class SpecNestedImpl<N> extends V1JobSpecFluentImpl<V1JobTemplateSpecFluent.SpecNested<N>> implements V1JobTemplateSpecFluent.SpecNested<N>,Nested<N>{
    SpecNestedImpl(V1JobSpec item) {
      this.builder = new V1JobSpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new V1JobSpecBuilder(this);
    }
    V1JobSpecBuilder builder;
    public N and() {
      return (N) V1JobTemplateSpecFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  
}