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
  public class V1BindingFluentImpl<A extends V1BindingFluent<A>> extends BaseFluent<A> implements V1BindingFluent<A>{
  public V1BindingFluentImpl() {
  }
  public V1BindingFluentImpl(V1Binding instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withTarget(instance.getTarget());

  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1ObjectReferenceBuilder target;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  
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
  public V1BindingFluent.MetadataNested<A> withNewMetadata() {
    return new V1BindingFluentImpl.MetadataNestedImpl();
  }
  public V1BindingFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1BindingFluentImpl.MetadataNestedImpl(item);
  }
  public V1BindingFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1BindingFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1BindingFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildTarget instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getTarget() {
    return this.target!=null ?this.target.build():null;
  }
  public V1ObjectReference buildTarget() {
    return this.target!=null ?this.target.build():null;
  }
  public A withTarget(V1ObjectReference target) {
    _visitables.get("target").remove(this.target);
    if (target!=null){ this.target= new V1ObjectReferenceBuilder(target); _visitables.get("target").add(this.target);} else { this.target = null; _visitables.get("target").remove(this.target); } return (A) this;
  }
  public Boolean hasTarget() {
    return this.target != null;
  }
  public V1BindingFluent.TargetNested<A> withNewTarget() {
    return new V1BindingFluentImpl.TargetNestedImpl();
  }
  public V1BindingFluent.TargetNested<A> withNewTargetLike(V1ObjectReference item) {
    return new V1BindingFluentImpl.TargetNestedImpl(item);
  }
  public V1BindingFluent.TargetNested<A> editTarget() {
    return withNewTargetLike(getTarget());
  }
  public V1BindingFluent.TargetNested<A> editOrNewTarget() {
    return withNewTargetLike(getTarget() != null ? getTarget(): new V1ObjectReferenceBuilder().build());
  }
  public V1BindingFluent.TargetNested<A> editOrNewTargetLike(V1ObjectReference item) {
    return withNewTargetLike(getTarget() != null ? getTarget(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1BindingFluentImpl that = (V1BindingFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (target != null ? !target.equals(that.target) :that.target != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  metadata,  target,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (target != null) { sb.append("target:"); sb.append(target); }
    sb.append("}");
    return sb.toString();
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1BindingFluent.MetadataNested<N>> implements V1BindingFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1BindingFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class TargetNestedImpl<N> extends V1ObjectReferenceFluentImpl<V1BindingFluent.TargetNested<N>> implements V1BindingFluent.TargetNested<N>,Nested<N>{
    TargetNestedImpl(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    TargetNestedImpl() {
      this.builder = new V1ObjectReferenceBuilder(this);
    }
    V1ObjectReferenceBuilder builder;
    public N and() {
      return (N) V1BindingFluentImpl.this.withTarget(builder.build());
    }
    public N endTarget() {
      return and();
    }
    
  }
  
}