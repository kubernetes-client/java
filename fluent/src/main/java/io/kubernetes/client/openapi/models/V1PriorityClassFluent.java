package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PriorityClassFluent<A extends V1PriorityClassFluent<A>> extends BaseFluent<A>{
  public V1PriorityClassFluent() {
  }
  
  public V1PriorityClassFluent(V1PriorityClass instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private String description;
  private Boolean globalDefault;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private String preemptionPolicy;
  private Integer value;
  
  protected void copyInstance(V1PriorityClass instance) {
    instance = (instance != null ? instance : new V1PriorityClass());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withDescription(instance.getDescription());
          this.withGlobalDefault(instance.getGlobalDefault());
          this.withKind(instance.getKind());
          this.withMetadata(instance.getMetadata());
          this.withPreemptionPolicy(instance.getPreemptionPolicy());
          this.withValue(instance.getValue());
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
  
  public String getDescription() {
    return this.description;
  }
  
  public A withDescription(String description) {
    this.description = description;
    return (A) this;
  }
  
  public boolean hasDescription() {
    return this.description != null;
  }
  
  public Boolean getGlobalDefault() {
    return this.globalDefault;
  }
  
  public A withGlobalDefault(Boolean globalDefault) {
    this.globalDefault = globalDefault;
    return (A) this;
  }
  
  public boolean hasGlobalDefault() {
    return this.globalDefault != null;
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
  
  public String getPreemptionPolicy() {
    return this.preemptionPolicy;
  }
  
  public A withPreemptionPolicy(String preemptionPolicy) {
    this.preemptionPolicy = preemptionPolicy;
    return (A) this;
  }
  
  public boolean hasPreemptionPolicy() {
    return this.preemptionPolicy != null;
  }
  
  public Integer getValue() {
    return this.value;
  }
  
  public A withValue(Integer value) {
    this.value = value;
    return (A) this;
  }
  
  public boolean hasValue() {
    return this.value != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PriorityClassFluent that = (V1PriorityClassFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(description, that.description)) return false;
    if (!java.util.Objects.equals(globalDefault, that.globalDefault)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(preemptionPolicy, that.preemptionPolicy)) return false;
    if (!java.util.Objects.equals(value, that.value)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  description,  globalDefault,  kind,  metadata,  preemptionPolicy,  value,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (description != null) { sb.append("description:"); sb.append(description + ","); }
    if (globalDefault != null) { sb.append("globalDefault:"); sb.append(globalDefault + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (preemptionPolicy != null) { sb.append("preemptionPolicy:"); sb.append(preemptionPolicy + ","); }
    if (value != null) { sb.append("value:"); sb.append(value); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withGlobalDefault() {
    return withGlobalDefault(true);
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1PriorityClassFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }

}