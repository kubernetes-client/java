package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1VolumeAttributesClassFluent<A extends io.kubernetes.client.openapi.models.V1beta1VolumeAttributesClassFluent<A>> extends BaseFluent<A>{
  public V1beta1VolumeAttributesClassFluent() {
  }
  
  public V1beta1VolumeAttributesClassFluent(V1beta1VolumeAttributesClass instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private String driverName;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private Map<String,String> parameters;
  
  protected void copyInstance(V1beta1VolumeAttributesClass instance) {
    instance = instance != null ? instance : new V1beta1VolumeAttributesClass();
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
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(item));
  }
  
  public A addToParameters(String key,String value) {
    if (this.parameters == null && key != null && value != null) {
      this.parameters = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.parameters.put(key, value);
    }
    return (A) this;
  }
  
  public A addToParameters(Map<String,String> map) {
    if (this.parameters == null && map != null) {
      this.parameters = new LinkedHashMap();
    }
    if (map != null) {
      this.parameters.putAll(map);
    }
    return (A) this;
  }
  
  public A removeFromParameters(String key) {
    if (this.parameters == null) {
      return (A) this;
    }
    if (key != null && this.parameters != null) {
      this.parameters.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromParameters(Map<String,String> map) {
    if (this.parameters == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.parameters != null) {
          this.parameters.remove(key);
        }
      }
    }
    return (A) this;
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
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1beta1VolumeAttributesClassFluent that = (V1beta1VolumeAttributesClassFluent) o;
    if (!(Objects.equals(apiVersion, that.apiVersion))) {
      return false;
    }
    if (!(Objects.equals(driverName, that.driverName))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(metadata, that.metadata))) {
      return false;
    }
    if (!(Objects.equals(parameters, that.parameters))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(apiVersion, driverName, kind, metadata, parameters);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiVersion == null)) {
        sb.append("apiVersion:");
        sb.append(apiVersion);
        sb.append(",");
    }
    if (!(driverName == null)) {
        sb.append("driverName:");
        sb.append(driverName);
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
    if (!(parameters == null) && !(parameters.isEmpty())) {
        sb.append("parameters:");
        sb.append(parameters);
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
      return (N) V1beta1VolumeAttributesClassFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }

}