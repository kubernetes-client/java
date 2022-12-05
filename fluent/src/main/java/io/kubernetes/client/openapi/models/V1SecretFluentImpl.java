package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1SecretFluentImpl<A extends V1SecretFluent<A>> extends BaseFluent<A> implements V1SecretFluent<A>{
  public V1SecretFluentImpl() {
  }
  public V1SecretFluentImpl(V1Secret instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withData(instance.getData());

    this.withImmutable(instance.getImmutable());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withStringData(instance.getStringData());

    this.withType(instance.getType());

  }
  private String apiVersion;
  private Map<String,byte[]> data;
  private Boolean immutable;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private Map<String,String> stringData;
  private String type;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public A addToData(String key,byte[] value) {
    if(this.data == null && key != null && value != null) { this.data = new LinkedHashMap(); }
    if(key != null && value != null) {this.data.put(key, value);} return (A)this;
  }
  public A addToData(Map<String,byte[]> map) {
    if(this.data == null && map != null) { this.data = new LinkedHashMap(); }
    if(map != null) { this.data.putAll(map);} return (A)this;
  }
  public A removeFromData(String key) {
    if(this.data == null) { return (A) this; }
    if(key != null && this.data != null) {this.data.remove(key);} return (A)this;
  }
  public A removeFromData(Map<String,byte[]> map) {
    if(this.data == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.data != null){this.data.remove(key);}}} return (A)this;
  }
  public Map<String,byte[]> getData() {
    return this.data;
  }
  public <K,V>A withData(Map<String,byte[]> data) {
    if (data == null) { this.data =  null;} else {this.data = new LinkedHashMap(data);} return (A) this;
  }
  public Boolean hasData() {
    return this.data != null;
  }
  public Boolean getImmutable() {
    return this.immutable;
  }
  public A withImmutable(Boolean immutable) {
    this.immutable=immutable; return (A) this;
  }
  public Boolean hasImmutable() {
    return this.immutable != null;
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
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ObjectMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V1SecretFluent.MetadataNested<A> withNewMetadata() {
    return new V1SecretFluentImpl.MetadataNestedImpl();
  }
  public V1SecretFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1SecretFluentImpl.MetadataNestedImpl(item);
  }
  public V1SecretFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1SecretFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1SecretFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public A addToStringData(String key,String value) {
    if(this.stringData == null && key != null && value != null) { this.stringData = new LinkedHashMap(); }
    if(key != null && value != null) {this.stringData.put(key, value);} return (A)this;
  }
  public A addToStringData(Map<String,String> map) {
    if(this.stringData == null && map != null) { this.stringData = new LinkedHashMap(); }
    if(map != null) { this.stringData.putAll(map);} return (A)this;
  }
  public A removeFromStringData(String key) {
    if(this.stringData == null) { return (A) this; }
    if(key != null && this.stringData != null) {this.stringData.remove(key);} return (A)this;
  }
  public A removeFromStringData(Map<String,String> map) {
    if(this.stringData == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.stringData != null){this.stringData.remove(key);}}} return (A)this;
  }
  public Map<String,String> getStringData() {
    return this.stringData;
  }
  public <K,V>A withStringData(Map<String,String> stringData) {
    if (stringData == null) { this.stringData =  null;} else {this.stringData = new LinkedHashMap(stringData);} return (A) this;
  }
  public Boolean hasStringData() {
    return this.stringData != null;
  }
  public String getType() {
    return this.type;
  }
  public A withType(String type) {
    this.type=type; return (A) this;
  }
  public Boolean hasType() {
    return this.type != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SecretFluentImpl that = (V1SecretFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (data != null ? !data.equals(that.data) :that.data != null) return false;
    if (immutable != null ? !immutable.equals(that.immutable) :that.immutable != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (stringData != null ? !stringData.equals(that.stringData) :that.stringData != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  data,  immutable,  kind,  metadata,  stringData,  type,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (data != null && !data.isEmpty()) { sb.append("data:"); sb.append(data + ","); }
    if (immutable != null) { sb.append("immutable:"); sb.append(immutable + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (stringData != null && !stringData.isEmpty()) { sb.append("stringData:"); sb.append(stringData + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  public A withImmutable() {
    return withImmutable(true);
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1SecretFluent.MetadataNested<N>> implements V1SecretFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1SecretFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  
}