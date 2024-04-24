package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1VolumeAttributesClassFluent<A extends V1alpha1VolumeAttributesClassFluent<A>> extends BaseFluent<A>{
  public V1alpha1VolumeAttributesClassFluent() {
  }
  
  public V1alpha1VolumeAttributesClassFluent(V1alpha1VolumeAttributesClass instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private String driverName;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private Map<String,String> parameters;
  
  protected void copyInstance(V1alpha1VolumeAttributesClass instance) {
    instance = (instance != null ? instance : new V1alpha1VolumeAttributesClass());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withDriverName(instance.getDriverName());
          this.withKind(instance.getKind());
          this.withMetadata(instance.getMetadata());
          this.withParameters(instance.getParameters());
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
  
  public String getDriverName() {
    return this.driverName;
  }
  
  public A withDriverName(String driverName) {
    this.driverName = driverName;
    return (A) this;
  }
  
  public boolean hasDriverName() {
    return this.driverName != null;
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
  
  public A addToParameters(String key,String value) {
    if(this.parameters == null && key != null && value != null) { this.parameters = new LinkedHashMap(); }
    if(key != null && value != null) {this.parameters.put(key, value);} return (A)this;
  }
  
  public A addToParameters(Map<String,String> map) {
    if(this.parameters == null && map != null) { this.parameters = new LinkedHashMap(); }
    if(map != null) { this.parameters.putAll(map);} return (A)this;
  }
  
  public A removeFromParameters(String key) {
    if(this.parameters == null) { return (A) this; }
    if(key != null && this.parameters != null) {this.parameters.remove(key);} return (A)this;
  }
  
  public A removeFromParameters(Map<String,String> map) {
    if(this.parameters == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.parameters != null){this.parameters.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getParameters() {
    return this.parameters;
  }
  
  public <K,V>A withParameters(Map<String,String> parameters) {
    if (parameters == null) {
      this.parameters = null;
    } else {
      this.parameters = new LinkedHashMap(parameters);
    }
    return (A) this;
  }
  
  public boolean hasParameters() {
    return this.parameters != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1VolumeAttributesClassFluent that = (V1alpha1VolumeAttributesClassFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(driverName, that.driverName)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(parameters, that.parameters)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  driverName,  kind,  metadata,  parameters,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (driverName != null) { sb.append("driverName:"); sb.append(driverName + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (parameters != null && !parameters.isEmpty()) { sb.append("parameters:"); sb.append(parameters); }
    sb.append("}");
    return sb.toString();
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1alpha1VolumeAttributesClassFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }

}