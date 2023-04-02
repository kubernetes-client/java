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
  public class V1ConfigMapFluentImpl<A extends V1ConfigMapFluent<A>> extends BaseFluent<A> implements V1ConfigMapFluent<A>{
  public V1ConfigMapFluentImpl() {
  }
  public V1ConfigMapFluentImpl(V1ConfigMap instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withBinaryData(instance.getBinaryData());

    this.withData(instance.getData());

    this.withImmutable(instance.getImmutable());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

  }
  private String apiVersion;
  private Map<String,byte[]> binaryData;
  private Map<String,String> data;
  private Boolean immutable;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public A addToBinaryData(String key,byte[] value) {
    if(this.binaryData == null && key != null && value != null) { this.binaryData = new LinkedHashMap(); }
    if(key != null && value != null) {this.binaryData.put(key, value);} return (A)this;
  }
  public A addToBinaryData(Map<String,byte[]> map) {
    if(this.binaryData == null && map != null) { this.binaryData = new LinkedHashMap(); }
    if(map != null) { this.binaryData.putAll(map);} return (A)this;
  }
  public A removeFromBinaryData(String key) {
    if(this.binaryData == null) { return (A) this; }
    if(key != null && this.binaryData != null) {this.binaryData.remove(key);} return (A)this;
  }
  public A removeFromBinaryData(Map<String,byte[]> map) {
    if(this.binaryData == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.binaryData != null){this.binaryData.remove(key);}}} return (A)this;
  }
  public Map<String,byte[]> getBinaryData() {
    return this.binaryData;
  }
  public <K,V>A withBinaryData(Map<String,byte[]> binaryData) {
    if (binaryData == null) { this.binaryData =  null;} else {this.binaryData = new LinkedHashMap(binaryData);} return (A) this;
  }
  public Boolean hasBinaryData() {
    return this.binaryData != null;
  }
  public A addToData(String key,String value) {
    if(this.data == null && key != null && value != null) { this.data = new LinkedHashMap(); }
    if(key != null && value != null) {this.data.put(key, value);} return (A)this;
  }
  public A addToData(Map<String,String> map) {
    if(this.data == null && map != null) { this.data = new LinkedHashMap(); }
    if(map != null) { this.data.putAll(map);} return (A)this;
  }
  public A removeFromData(String key) {
    if(this.data == null) { return (A) this; }
    if(key != null && this.data != null) {this.data.remove(key);} return (A)this;
  }
  public A removeFromData(Map<String,String> map) {
    if(this.data == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.data != null){this.data.remove(key);}}} return (A)this;
  }
  public Map<String,String> getData() {
    return this.data;
  }
  public <K,V>A withData(Map<String,String> data) {
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
  public V1ConfigMapFluent.MetadataNested<A> withNewMetadata() {
    return new V1ConfigMapFluentImpl.MetadataNestedImpl();
  }
  public V1ConfigMapFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1ConfigMapFluentImpl.MetadataNestedImpl(item);
  }
  public V1ConfigMapFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1ConfigMapFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1ConfigMapFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ConfigMapFluentImpl that = (V1ConfigMapFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (binaryData != null ? !binaryData.equals(that.binaryData) :that.binaryData != null) return false;
    if (data != null ? !data.equals(that.data) :that.data != null) return false;
    if (immutable != null ? !immutable.equals(that.immutable) :that.immutable != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  binaryData,  data,  immutable,  kind,  metadata,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (binaryData != null && !binaryData.isEmpty()) { sb.append("binaryData:"); sb.append(binaryData + ","); }
    if (data != null && !data.isEmpty()) { sb.append("data:"); sb.append(data + ","); }
    if (immutable != null) { sb.append("immutable:"); sb.append(immutable + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata); }
    sb.append("}");
    return sb.toString();
  }
  public A withImmutable() {
    return withImmutable(true);
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1ConfigMapFluent.MetadataNested<N>> implements V1ConfigMapFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1ConfigMapFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  
}