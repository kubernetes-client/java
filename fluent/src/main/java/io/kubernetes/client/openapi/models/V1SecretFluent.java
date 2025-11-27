package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SecretFluent<A extends io.kubernetes.client.openapi.models.V1SecretFluent<A>> extends BaseFluent<A>{

  private String apiVersion;
  private Map<String,byte[]> data;
  private Boolean immutable;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private Map<String,String> stringData;
  private String type;

  public V1SecretFluent() {
  }
  
  public V1SecretFluent(V1Secret instance) {
    this.copyInstance(instance);
  }

  public A addToData(Map<String,byte[]> map) {
    if (this.data == null && map != null) {
      this.data = new LinkedHashMap();
    }
    if (map != null) {
      this.data.putAll(map);
    }
    return (A) this;
  }
  
  public A addToData(String key,byte[] value) {
    if (this.data == null && key != null && value != null) {
      this.data = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.data.put(key, value);
    }
    return (A) this;
  }
  
  public A addToStringData(Map<String,String> map) {
    if (this.stringData == null && map != null) {
      this.stringData = new LinkedHashMap();
    }
    if (map != null) {
      this.stringData.putAll(map);
    }
    return (A) this;
  }
  
  public A addToStringData(String key,String value) {
    if (this.stringData == null && key != null && value != null) {
      this.stringData = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.stringData.put(key, value);
    }
    return (A) this;
  }
  
  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  protected void copyInstance(V1Secret instance) {
    instance = instance != null ? instance : new V1Secret();
    if (instance != null) {
        this.withApiVersion(instance.getApiVersion());
        this.withData(instance.getData());
        this.withImmutable(instance.getImmutable());
        this.withKind(instance.getKind());
        this.withMetadata(instance.getMetadata());
        this.withStringData(instance.getStringData());
        this.withType(instance.getType());
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
    V1SecretFluent that = (V1SecretFluent) o;
    if (!(Objects.equals(apiVersion, that.apiVersion))) {
      return false;
    }
    if (!(Objects.equals(data, that.data))) {
      return false;
    }
    if (!(Objects.equals(immutable, that.immutable))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(metadata, that.metadata))) {
      return false;
    }
    if (!(Objects.equals(stringData, that.stringData))) {
      return false;
    }
    if (!(Objects.equals(type, that.type))) {
      return false;
    }
    return true;
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public Map<String,byte[]> getData() {
    return this.data;
  }
  
  public Boolean getImmutable() {
    return this.immutable;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public Map<String,String> getStringData() {
    return this.stringData;
  }
  
  public String getType() {
    return this.type;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public boolean hasData() {
    return this.data != null;
  }
  
  public boolean hasImmutable() {
    return this.immutable != null;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public boolean hasStringData() {
    return this.stringData != null;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public int hashCode() {
    return Objects.hash(apiVersion, data, immutable, kind, metadata, stringData, type);
  }
  
  public A removeFromData(String key) {
    if (this.data == null) {
      return (A) this;
    }
    if (key != null && this.data != null) {
      this.data.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromData(Map<String,byte[]> map) {
    if (this.data == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.data != null) {
          this.data.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public A removeFromStringData(String key) {
    if (this.stringData == null) {
      return (A) this;
    }
    if (key != null && this.stringData != null) {
      this.stringData.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromStringData(Map<String,String> map) {
    if (this.stringData == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.stringData != null) {
          this.stringData.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiVersion == null)) {
        sb.append("apiVersion:");
        sb.append(apiVersion);
        sb.append(",");
    }
    if (!(data == null) && !(data.isEmpty())) {
        sb.append("data:");
        sb.append(data);
        sb.append(",");
    }
    if (!(immutable == null)) {
        sb.append("immutable:");
        sb.append(immutable);
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
    if (!(stringData == null) && !(stringData.isEmpty())) {
        sb.append("stringData:");
        sb.append(stringData);
        sb.append(",");
    }
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public <K,V>A withData(Map<String,byte[]> data) {
    if (data == null) {
      this.data = null;
    } else {
      this.data = new LinkedHashMap(data);
    }
    return (A) this;
  }
  
  public A withImmutable() {
    return withImmutable(true);
  }
  
  public A withImmutable(Boolean immutable) {
    this.immutable = immutable;
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
  
  public <K,V>A withStringData(Map<String,String> stringData) {
    if (stringData == null) {
      this.stringData = null;
    } else {
      this.stringData = new LinkedHashMap(stringData);
    }
    return (A) this;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
  
    V1ObjectMetaBuilder builder;
  
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
  
    public N and() {
      return (N) V1SecretFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  }
}