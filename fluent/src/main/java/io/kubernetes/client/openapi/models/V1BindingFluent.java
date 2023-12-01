package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1BindingFluent<A extends V1BindingFluent<A>> extends BaseFluent<A>{
  public V1BindingFluent() {
  }
  
  public V1BindingFluent(V1Binding instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1ObjectReferenceBuilder target;
  
  protected void copyInstance(V1Binding instance) {
    instance = (instance != null ? instance : new V1Binding());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withKind(instance.getKind());
          this.withMetadata(instance.getMetadata());
          this.withTarget(instance.getTarget());
        }
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public A withMetadata(V1ObjectMeta metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new V1ObjectMetaBuilder(metadata);
        this._visitables.get("metadata").add(this.metadata);
    } else {
        this.metadata = null;
        this._visitables.get("metadata").remove(this.metadata);
    }
    return (A) this;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new MetadataNested(item);
  }
  
  public MetadataNested<A> editMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
  }
  
  public V1ObjectReference buildTarget() {
    return this.target != null ? this.target.build() : null;
  }
  
  public A withTarget(V1ObjectReference target) {
    this._visitables.remove("target");
    if (target != null) {
        this.target = new V1ObjectReferenceBuilder(target);
        this._visitables.get("target").add(this.target);
    } else {
        this.target = null;
        this._visitables.get("target").remove(this.target);
    }
    return (A) this;
  }
  
  public boolean hasTarget() {
    return this.target != null;
  }
  
  public TargetNested<A> withNewTarget() {
    return new TargetNested(null);
  }
  
  public TargetNested<A> withNewTargetLike(V1ObjectReference item) {
    return new TargetNested(item);
  }
  
  public TargetNested<A> editTarget() {
    return withNewTargetLike(java.util.Optional.ofNullable(buildTarget()).orElse(null));
  }
  
  public TargetNested<A> editOrNewTarget() {
    return withNewTargetLike(java.util.Optional.ofNullable(buildTarget()).orElse(new V1ObjectReferenceBuilder().build()));
  }
  
  public TargetNested<A> editOrNewTargetLike(V1ObjectReference item) {
    return withNewTargetLike(java.util.Optional.ofNullable(buildTarget()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1BindingFluent that = (V1BindingFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(target, that.target)) return false;
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
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1BindingFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class TargetNested<N> extends V1ObjectReferenceFluent<TargetNested<N>> implements Nested<N>{
    TargetNested(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    V1ObjectReferenceBuilder builder;
    
    public N and() {
      return (N) V1BindingFluent.this.withTarget(builder.build());
    }
    
    public N endTarget() {
      return and();
    }
    
  
  }

}