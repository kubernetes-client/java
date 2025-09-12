package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Optional;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CertificateSigningRequestFluent<A extends io.kubernetes.client.openapi.models.V1CertificateSigningRequestFluent<A>> extends BaseFluent<A>{
  public V1CertificateSigningRequestFluent() {
  }
  
  public V1CertificateSigningRequestFluent(V1CertificateSigningRequest instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1CertificateSigningRequestSpecBuilder spec;
  private V1CertificateSigningRequestStatusBuilder status;
  
  protected void copyInstance(V1CertificateSigningRequest instance) {
    instance = instance != null ? instance : new V1CertificateSigningRequest();
    if (instance != null) {
        this.withApiVersion(instance.getApiVersion());
        this.withKind(instance.getKind());
        this.withMetadata(instance.getMetadata());
        this.withSpec(instance.getSpec());
        this.withStatus(instance.getStatus());
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
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(item));
  }
  
  public V1CertificateSigningRequestSpec buildSpec() {
    return this.spec != null ? this.spec.build() : null;
  }
  
  public A withSpec(V1CertificateSigningRequestSpec spec) {
    this._visitables.remove("spec");
    if (spec != null) {
        this.spec = new V1CertificateSigningRequestSpecBuilder(spec);
        this._visitables.get("spec").add(this.spec);
    } else {
        this.spec = null;
        this._visitables.get("spec").remove(this.spec);
    }
    return (A) this;
  }
  
  public boolean hasSpec() {
    return this.spec != null;
  }
  
  public SpecNested<A> withNewSpec() {
    return new SpecNested(null);
  }
  
  public SpecNested<A> withNewSpecLike(V1CertificateSigningRequestSpec item) {
    return new SpecNested(item);
  }
  
  public SpecNested<A> editSpec() {
    return this.withNewSpecLike(Optional.ofNullable(this.buildSpec()).orElse(null));
  }
  
  public SpecNested<A> editOrNewSpec() {
    return this.withNewSpecLike(Optional.ofNullable(this.buildSpec()).orElse(new V1CertificateSigningRequestSpecBuilder().build()));
  }
  
  public SpecNested<A> editOrNewSpecLike(V1CertificateSigningRequestSpec item) {
    return this.withNewSpecLike(Optional.ofNullable(this.buildSpec()).orElse(item));
  }
  
  public V1CertificateSigningRequestStatus buildStatus() {
    return this.status != null ? this.status.build() : null;
  }
  
  public A withStatus(V1CertificateSigningRequestStatus status) {
    this._visitables.remove("status");
    if (status != null) {
        this.status = new V1CertificateSigningRequestStatusBuilder(status);
        this._visitables.get("status").add(this.status);
    } else {
        this.status = null;
        this._visitables.get("status").remove(this.status);
    }
    return (A) this;
  }
  
  public boolean hasStatus() {
    return this.status != null;
  }
  
  public StatusNested<A> withNewStatus() {
    return new StatusNested(null);
  }
  
  public StatusNested<A> withNewStatusLike(V1CertificateSigningRequestStatus item) {
    return new StatusNested(item);
  }
  
  public StatusNested<A> editStatus() {
    return this.withNewStatusLike(Optional.ofNullable(this.buildStatus()).orElse(null));
  }
  
  public StatusNested<A> editOrNewStatus() {
    return this.withNewStatusLike(Optional.ofNullable(this.buildStatus()).orElse(new V1CertificateSigningRequestStatusBuilder().build()));
  }
  
  public StatusNested<A> editOrNewStatusLike(V1CertificateSigningRequestStatus item) {
    return this.withNewStatusLike(Optional.ofNullable(this.buildStatus()).orElse(item));
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
    V1CertificateSigningRequestFluent that = (V1CertificateSigningRequestFluent) o;
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
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1CertificateSigningRequestFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class SpecNested<N> extends V1CertificateSigningRequestSpecFluent<SpecNested<N>> implements Nested<N>{
    SpecNested(V1CertificateSigningRequestSpec item) {
      this.builder = new V1CertificateSigningRequestSpecBuilder(this, item);
    }
    V1CertificateSigningRequestSpecBuilder builder;
    
    public N and() {
      return (N) V1CertificateSigningRequestFluent.this.withSpec(builder.build());
    }
    
    public N endSpec() {
      return and();
    }
    
  
  }
  public class StatusNested<N> extends V1CertificateSigningRequestStatusFluent<StatusNested<N>> implements Nested<N>{
    StatusNested(V1CertificateSigningRequestStatus item) {
      this.builder = new V1CertificateSigningRequestStatusBuilder(this, item);
    }
    V1CertificateSigningRequestStatusBuilder builder;
    
    public N and() {
      return (N) V1CertificateSigningRequestFluent.this.withStatus(builder.build());
    }
    
    public N endStatus() {
      return and();
    }
    
  
  }

}