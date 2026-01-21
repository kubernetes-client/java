package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PodTemplateSpecFluent<A extends io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent<A>> extends BaseFluent<A>{

  private V1ObjectMetaBuilder metadata;
  private V1PodSpecBuilder spec;

  public V1PodTemplateSpecFluent() {
  }
  
  public V1PodTemplateSpecFluent(V1PodTemplateSpec instance) {
    this.copyInstance(instance);
  }

  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public V1PodSpec buildSpec() {
    return this.spec != null ? this.spec.build() : null;
  }
  
  protected void copyInstance(V1PodTemplateSpec instance) {
    instance = instance != null ? instance : new V1PodTemplateSpec();
    if (instance != null) {
        this.withMetadata(instance.getMetadata());
        this.withSpec(instance.getSpec());
    }
  }
  
  public MetadataNested<A> editMetadata() {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(item));
  }
  
  public SpecNested<A> editOrNewSpec() {
    return this.withNewSpecLike(Optional.ofNullable(this.buildSpec()).orElse(new V1PodSpecBuilder().build()));
  }
  
  public SpecNested<A> editOrNewSpecLike(V1PodSpec item) {
    return this.withNewSpecLike(Optional.ofNullable(this.buildSpec()).orElse(item));
  }
  
  public SpecNested<A> editSpec() {
    return this.withNewSpecLike(Optional.ofNullable(this.buildSpec()).orElse(null));
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
    V1PodTemplateSpecFluent that = (V1PodTemplateSpecFluent) o;
    if (!(Objects.equals(metadata, that.metadata))) {
      return false;
    }
    if (!(Objects.equals(spec, that.spec))) {
      return false;
    }
    return true;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public boolean hasSpec() {
    return this.spec != null;
  }
  
  public int hashCode() {
    return Objects.hash(metadata, spec);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(metadata == null)) {
        sb.append("metadata:");
        sb.append(metadata);
        sb.append(",");
    }
    if (!(spec == null)) {
        sb.append("spec:");
        sb.append(spec);
    }
    sb.append("}");
    return sb.toString();
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
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new MetadataNested(item);
  }
  
  public SpecNested<A> withNewSpec() {
    return new SpecNested(null);
  }
  
  public SpecNested<A> withNewSpecLike(V1PodSpec item) {
    return new SpecNested(item);
  }
  
  public A withSpec(V1PodSpec spec) {
    this._visitables.remove("spec");
    if (spec != null) {
        this.spec = new V1PodSpecBuilder(spec);
        this._visitables.get("spec").add(this.spec);
    } else {
        this.spec = null;
        this._visitables.get("spec").remove(this.spec);
    }
    return (A) this;
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
  
    V1ObjectMetaBuilder builder;
  
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
  
    public N and() {
      return (N) V1PodTemplateSpecFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  }
  public class SpecNested<N> extends V1PodSpecFluent<SpecNested<N>> implements Nested<N>{
  
    V1PodSpecBuilder builder;
  
    SpecNested(V1PodSpec item) {
      this.builder = new V1PodSpecBuilder(this, item);
    }
  
    public N and() {
      return (N) V1PodTemplateSpecFluent.this.withSpec(builder.build());
    }
    
    public N endSpec() {
      return and();
    }
    
  }
}