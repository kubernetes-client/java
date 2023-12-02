package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1StatusFluent<A extends V1StatusFluent<A>> extends BaseFluent<A>{
  public V1StatusFluent() {
  }
  
  public V1StatusFluent(V1Status instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private Integer code;
  private V1StatusDetailsBuilder details;
  private String kind;
  private String message;
  private V1ListMetaBuilder metadata;
  private String reason;
  private String status;
  
  protected void copyInstance(V1Status instance) {
    instance = (instance != null ? instance : new V1Status());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withCode(instance.getCode());
          this.withDetails(instance.getDetails());
          this.withKind(instance.getKind());
          this.withMessage(instance.getMessage());
          this.withMetadata(instance.getMetadata());
          this.withReason(instance.getReason());
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
  
  public Integer getCode() {
    return this.code;
  }
  
  public A withCode(Integer code) {
    this.code = code;
    return (A) this;
  }
  
  public boolean hasCode() {
    return this.code != null;
  }
  
  public V1StatusDetails buildDetails() {
    return this.details != null ? this.details.build() : null;
  }
  
  public A withDetails(V1StatusDetails details) {
    this._visitables.remove("details");
    if (details != null) {
        this.details = new V1StatusDetailsBuilder(details);
        this._visitables.get("details").add(this.details);
    } else {
        this.details = null;
        this._visitables.get("details").remove(this.details);
    }
    return (A) this;
  }
  
  public boolean hasDetails() {
    return this.details != null;
  }
  
  public DetailsNested<A> withNewDetails() {
    return new DetailsNested(null);
  }
  
  public DetailsNested<A> withNewDetailsLike(V1StatusDetails item) {
    return new DetailsNested(item);
  }
  
  public DetailsNested<A> editDetails() {
    return withNewDetailsLike(java.util.Optional.ofNullable(buildDetails()).orElse(null));
  }
  
  public DetailsNested<A> editOrNewDetails() {
    return withNewDetailsLike(java.util.Optional.ofNullable(buildDetails()).orElse(new V1StatusDetailsBuilder().build()));
  }
  
  public DetailsNested<A> editOrNewDetailsLike(V1StatusDetails item) {
    return withNewDetailsLike(java.util.Optional.ofNullable(buildDetails()).orElse(item));
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
  
  public String getMessage() {
    return this.message;
  }
  
  public A withMessage(String message) {
    this.message = message;
    return (A) this;
  }
  
  public boolean hasMessage() {
    return this.message != null;
  }
  
  public V1ListMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public A withMetadata(V1ListMeta metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new V1ListMetaBuilder(metadata);
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
  
  public MetadataNested<A> withNewMetadataLike(V1ListMeta item) {
    return new MetadataNested(item);
  }
  
  public MetadataNested<A> editMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new V1ListMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ListMeta item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public A withReason(String reason) {
    this.reason = reason;
    return (A) this;
  }
  
  public boolean hasReason() {
    return this.reason != null;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public A withStatus(String status) {
    this.status = status;
    return (A) this;
  }
  
  public boolean hasStatus() {
    return this.status != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1StatusFluent that = (V1StatusFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(code, that.code)) return false;
    if (!java.util.Objects.equals(details, that.details)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(message, that.message)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(reason, that.reason)) return false;
    if (!java.util.Objects.equals(status, that.status)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  code,  details,  kind,  message,  metadata,  reason,  status,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (code != null) { sb.append("code:"); sb.append(code + ","); }
    if (details != null) { sb.append("details:"); sb.append(details + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason + ","); }
    if (status != null) { sb.append("status:"); sb.append(status); }
    sb.append("}");
    return sb.toString();
  }
  public class DetailsNested<N> extends V1StatusDetailsFluent<DetailsNested<N>> implements Nested<N>{
    DetailsNested(V1StatusDetails item) {
      this.builder = new V1StatusDetailsBuilder(this, item);
    }
    V1StatusDetailsBuilder builder;
    
    public N and() {
      return (N) V1StatusFluent.this.withDetails(builder.build());
    }
    
    public N endDetails() {
      return and();
    }
    
  
  }
  public class MetadataNested<N> extends V1ListMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ListMeta item) {
      this.builder = new V1ListMetaBuilder(this, item);
    }
    V1ListMetaBuilder builder;
    
    public N and() {
      return (N) V1StatusFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }

}