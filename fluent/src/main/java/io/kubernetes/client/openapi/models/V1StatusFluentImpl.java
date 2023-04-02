package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1StatusFluentImpl<A extends V1StatusFluent<A>> extends BaseFluent<A> implements V1StatusFluent<A>{
  public V1StatusFluentImpl() {
  }
  public V1StatusFluentImpl(V1Status instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withCode(instance.getCode());

    this.withDetails(instance.getDetails());

    this.withKind(instance.getKind());

    this.withMessage(instance.getMessage());

    this.withMetadata(instance.getMetadata());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

  }
  private String apiVersion;
  private Integer code;
  private V1StatusDetailsBuilder details;
  private String kind;
  private String message;
  private V1ListMetaBuilder metadata;
  private String reason;
  private String status;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public Integer getCode() {
    return this.code;
  }
  public A withCode(Integer code) {
    this.code=code; return (A) this;
  }
  public Boolean hasCode() {
    return this.code != null;
  }
  
  /**
   * This method has been deprecated, please use method buildDetails instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1StatusDetails getDetails() {
    return this.details!=null ?this.details.build():null;
  }
  public V1StatusDetails buildDetails() {
    return this.details!=null ?this.details.build():null;
  }
  public A withDetails(V1StatusDetails details) {
    _visitables.get("details").remove(this.details);
    if (details!=null){ this.details= new V1StatusDetailsBuilder(details); _visitables.get("details").add(this.details);} else { this.details = null; _visitables.get("details").remove(this.details); } return (A) this;
  }
  public Boolean hasDetails() {
    return this.details != null;
  }
  public V1StatusFluent.DetailsNested<A> withNewDetails() {
    return new V1StatusFluentImpl.DetailsNestedImpl();
  }
  public V1StatusFluent.DetailsNested<A> withNewDetailsLike(V1StatusDetails item) {
    return new V1StatusFluentImpl.DetailsNestedImpl(item);
  }
  public V1StatusFluent.DetailsNested<A> editDetails() {
    return withNewDetailsLike(getDetails());
  }
  public V1StatusFluent.DetailsNested<A> editOrNewDetails() {
    return withNewDetailsLike(getDetails() != null ? getDetails(): new V1StatusDetailsBuilder().build());
  }
  public V1StatusFluent.DetailsNested<A> editOrNewDetailsLike(V1StatusDetails item) {
    return withNewDetailsLike(getDetails() != null ? getDetails(): item);
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
  public String getMessage() {
    return this.message;
  }
  public A withMessage(String message) {
    this.message=message; return (A) this;
  }
  public Boolean hasMessage() {
    return this.message != null;
  }
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ListMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ListMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ListMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ListMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V1StatusFluent.MetadataNested<A> withNewMetadata() {
    return new V1StatusFluentImpl.MetadataNestedImpl();
  }
  public V1StatusFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item) {
    return new V1StatusFluentImpl.MetadataNestedImpl(item);
  }
  public V1StatusFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1StatusFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ListMetaBuilder().build());
  }
  public V1StatusFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public String getReason() {
    return this.reason;
  }
  public A withReason(String reason) {
    this.reason=reason; return (A) this;
  }
  public Boolean hasReason() {
    return this.reason != null;
  }
  public String getStatus() {
    return this.status;
  }
  public A withStatus(String status) {
    this.status=status; return (A) this;
  }
  public Boolean hasStatus() {
    return this.status != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1StatusFluentImpl that = (V1StatusFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (code != null ? !code.equals(that.code) :that.code != null) return false;
    if (details != null ? !details.equals(that.details) :that.details != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (message != null ? !message.equals(that.message) :that.message != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
    if (status != null ? !status.equals(that.status) :that.status != null) return false;
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
  class DetailsNestedImpl<N> extends V1StatusDetailsFluentImpl<V1StatusFluent.DetailsNested<N>> implements V1StatusFluent.DetailsNested<N>,Nested<N>{
    DetailsNestedImpl(V1StatusDetails item) {
      this.builder = new V1StatusDetailsBuilder(this, item);
    }
    DetailsNestedImpl() {
      this.builder = new V1StatusDetailsBuilder(this);
    }
    V1StatusDetailsBuilder builder;
    public N and() {
      return (N) V1StatusFluentImpl.this.withDetails(builder.build());
    }
    public N endDetails() {
      return and();
    }
    
  }
  class MetadataNestedImpl<N> extends V1ListMetaFluentImpl<V1StatusFluent.MetadataNested<N>> implements V1StatusFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ListMeta item) {
      this.builder = new V1ListMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ListMetaBuilder(this);
    }
    V1ListMetaBuilder builder;
    public N and() {
      return (N) V1StatusFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  
}