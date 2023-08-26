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
  public class V1alpha2ResourceClaimTemplateSpecFluentImpl<A extends V1alpha2ResourceClaimTemplateSpecFluent<A>> extends BaseFluent<A> implements V1alpha2ResourceClaimTemplateSpecFluent<A>{
  public V1alpha2ResourceClaimTemplateSpecFluentImpl() {
  }
  public V1alpha2ResourceClaimTemplateSpecFluentImpl(V1alpha2ResourceClaimTemplateSpec instance) {
    if (instance != null) {
      this.withMetadata(instance.getMetadata());
      this.withSpec(instance.getSpec());
    }
  }
  private V1ObjectMetaBuilder metadata;
  private V1alpha2ResourceClaimSpecBuilder spec;
  
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
  public V1alpha2ResourceClaimTemplateSpecFluentImpl.MetadataNested<A> withNewMetadata() {
    return new V1alpha2ResourceClaimTemplateSpecFluentImpl.MetadataNestedImpl();
  }
  public V1alpha2ResourceClaimTemplateSpecFluentImpl.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1alpha2ResourceClaimTemplateSpecFluentImpl.MetadataNestedImpl(item);
  }
  public V1alpha2ResourceClaimTemplateSpecFluentImpl.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1alpha2ResourceClaimTemplateSpecFluentImpl.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1alpha2ResourceClaimTemplateSpecFluentImpl.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha2ResourceClaimSpec getSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public V1alpha2ResourceClaimSpec buildSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public A withSpec(V1alpha2ResourceClaimSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new V1alpha2ResourceClaimSpecBuilder(spec); _visitables.get("spec").add(this.spec);} else { this.spec = null; _visitables.get("spec").remove(this.spec); } return (A) this;
  }
  public Boolean hasSpec() {
    return this.spec != null;
  }
  public V1alpha2ResourceClaimTemplateSpecFluentImpl.SpecNested<A> withNewSpec() {
    return new V1alpha2ResourceClaimTemplateSpecFluentImpl.SpecNestedImpl();
  }
  public V1alpha2ResourceClaimTemplateSpecFluentImpl.SpecNested<A> withNewSpecLike(V1alpha2ResourceClaimSpec item) {
    return new V1alpha2ResourceClaimTemplateSpecFluentImpl.SpecNestedImpl(item);
  }
  public V1alpha2ResourceClaimTemplateSpecFluentImpl.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public V1alpha2ResourceClaimTemplateSpecFluentImpl.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new V1alpha2ResourceClaimSpecBuilder().build());
  }
  public V1alpha2ResourceClaimTemplateSpecFluentImpl.SpecNested<A> editOrNewSpecLike(V1alpha2ResourceClaimSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2ResourceClaimTemplateSpecFluentImpl that = (V1alpha2ResourceClaimTemplateSpecFluentImpl) o;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;

    if (!java.util.Objects.equals(spec, that.spec)) return false;

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
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1alpha2ResourceClaimTemplateSpecFluentImpl.MetadataNested<N>> implements V1alpha2ResourceClaimTemplateSpecFluentImpl.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1alpha2ResourceClaimTemplateSpecFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class SpecNestedImpl<N> extends V1alpha2ResourceClaimSpecFluentImpl<V1alpha2ResourceClaimTemplateSpecFluentImpl.SpecNested<N>> implements V1alpha2ResourceClaimTemplateSpecFluentImpl.SpecNested<N>,Nested<N>{
    SpecNestedImpl(V1alpha2ResourceClaimSpec item) {
      this.builder = new V1alpha2ResourceClaimSpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new V1alpha2ResourceClaimSpecBuilder(this);
    }
    V1alpha2ResourceClaimSpecBuilder builder;
    public N and() {
      return (N) V1alpha2ResourceClaimTemplateSpecFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  
}