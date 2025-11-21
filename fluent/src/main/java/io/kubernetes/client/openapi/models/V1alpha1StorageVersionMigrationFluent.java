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
public class V1alpha1StorageVersionMigrationFluent<A extends io.kubernetes.client.openapi.models.V1alpha1StorageVersionMigrationFluent<A>> extends BaseFluent<A>{

  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1alpha1StorageVersionMigrationSpecBuilder spec;
  private V1alpha1StorageVersionMigrationStatusBuilder status;

  public V1alpha1StorageVersionMigrationFluent() {
  }
  
  public V1alpha1StorageVersionMigrationFluent(V1alpha1StorageVersionMigration instance) {
    this.copyInstance(instance);
  }

  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public V1alpha1StorageVersionMigrationSpec buildSpec() {
    return this.spec != null ? this.spec.build() : null;
  }
  
  public V1alpha1StorageVersionMigrationStatus buildStatus() {
    return this.status != null ? this.status.build() : null;
  }
  
  protected void copyInstance(V1alpha1StorageVersionMigration instance) {
    instance = instance != null ? instance : new V1alpha1StorageVersionMigration();
    if (instance != null) {
        this.withApiVersion(instance.getApiVersion());
        this.withKind(instance.getKind());
        this.withMetadata(instance.getMetadata());
        this.withSpec(instance.getSpec());
        this.withStatus(instance.getStatus());
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
    return this.withNewSpecLike(Optional.ofNullable(this.buildSpec()).orElse(new V1alpha1StorageVersionMigrationSpecBuilder().build()));
  }
  
  public SpecNested<A> editOrNewSpecLike(V1alpha1StorageVersionMigrationSpec item) {
    return this.withNewSpecLike(Optional.ofNullable(this.buildSpec()).orElse(item));
  }
  
  public StatusNested<A> editOrNewStatus() {
    return this.withNewStatusLike(Optional.ofNullable(this.buildStatus()).orElse(new V1alpha1StorageVersionMigrationStatusBuilder().build()));
  }
  
  public StatusNested<A> editOrNewStatusLike(V1alpha1StorageVersionMigrationStatus item) {
    return this.withNewStatusLike(Optional.ofNullable(this.buildStatus()).orElse(item));
  }
  
  public SpecNested<A> editSpec() {
    return this.withNewSpecLike(Optional.ofNullable(this.buildSpec()).orElse(null));
  }
  
  public StatusNested<A> editStatus() {
    return this.withNewStatusLike(Optional.ofNullable(this.buildStatus()).orElse(null));
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
    V1alpha1StorageVersionMigrationFluent that = (V1alpha1StorageVersionMigrationFluent) o;
    if (!(Objects.equals(apiVersion, that.apiVersion))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(metadata, that.metadata))) {
      return false;
    }
    if (!(Objects.equals(spec, that.spec))) {
      return false;
    }
    if (!(Objects.equals(status, that.status))) {
      return false;
    }
    return true;
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public boolean hasSpec() {
    return this.spec != null;
  }
  
  public boolean hasStatus() {
    return this.status != null;
  }
  
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiVersion == null)) {
        sb.append("apiVersion:");
        sb.append(apiVersion);
        sb.append(",");
    }
    if (!(kind == null)) {
        sb.append("kind:");
        sb.append(kind);
        sb.append(",");
    }
    if (!(metadata == null)) {
        sb.append("metadata:");
        sb.append(metadata);
        sb.append(",");
    }
    if (!(spec == null)) {
        sb.append("spec:");
        sb.append(spec);
        sb.append(",");
    }
    if (!(status == null)) {
        sb.append("status:");
        sb.append(status);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
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
  
  public SpecNested<A> withNewSpecLike(V1alpha1StorageVersionMigrationSpec item) {
    return new SpecNested(item);
  }
  
  public StatusNested<A> withNewStatus() {
    return new StatusNested(null);
  }
  
  public StatusNested<A> withNewStatusLike(V1alpha1StorageVersionMigrationStatus item) {
    return new StatusNested(item);
  }
  
  public A withSpec(V1alpha1StorageVersionMigrationSpec spec) {
    this._visitables.remove("spec");
    if (spec != null) {
        this.spec = new V1alpha1StorageVersionMigrationSpecBuilder(spec);
        this._visitables.get("spec").add(this.spec);
    } else {
        this.spec = null;
        this._visitables.get("spec").remove(this.spec);
    }
    return (A) this;
  }
  
  public A withStatus(V1alpha1StorageVersionMigrationStatus status) {
    this._visitables.remove("status");
    if (status != null) {
        this.status = new V1alpha1StorageVersionMigrationStatusBuilder(status);
        this._visitables.get("status").add(this.status);
    } else {
        this.status = null;
        this._visitables.get("status").remove(this.status);
    }
    return (A) this;
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
  
    V1ObjectMetaBuilder builder;
  
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha1StorageVersionMigrationFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  }
  public class SpecNested<N> extends V1alpha1StorageVersionMigrationSpecFluent<SpecNested<N>> implements Nested<N>{
  
    V1alpha1StorageVersionMigrationSpecBuilder builder;
  
    SpecNested(V1alpha1StorageVersionMigrationSpec item) {
      this.builder = new V1alpha1StorageVersionMigrationSpecBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha1StorageVersionMigrationFluent.this.withSpec(builder.build());
    }
    
    public N endSpec() {
      return and();
    }
    
  }
  public class StatusNested<N> extends V1alpha1StorageVersionMigrationStatusFluent<StatusNested<N>> implements Nested<N>{
  
    V1alpha1StorageVersionMigrationStatusBuilder builder;
  
    StatusNested(V1alpha1StorageVersionMigrationStatus item) {
      this.builder = new V1alpha1StorageVersionMigrationStatusBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha1StorageVersionMigrationFluent.this.withStatus(builder.build());
    }
    
    public N endStatus() {
      return and();
    }
    
  }
}