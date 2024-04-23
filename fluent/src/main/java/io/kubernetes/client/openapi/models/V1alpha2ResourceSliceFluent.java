package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2ResourceSliceFluent<A extends V1alpha2ResourceSliceFluent<A>> extends BaseFluent<A>{
  public V1alpha2ResourceSliceFluent() {
  }
  
  public V1alpha2ResourceSliceFluent(V1alpha2ResourceSlice instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private String driverName;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1alpha2NamedResourcesResourcesBuilder namedResources;
  private String nodeName;
  
  protected void copyInstance(V1alpha2ResourceSlice instance) {
    instance = (instance != null ? instance : new V1alpha2ResourceSlice());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withDriverName(instance.getDriverName());
          this.withKind(instance.getKind());
          this.withMetadata(instance.getMetadata());
          this.withNamedResources(instance.getNamedResources());
          this.withNodeName(instance.getNodeName());
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
  
  public V1alpha2NamedResourcesResources buildNamedResources() {
    return this.namedResources != null ? this.namedResources.build() : null;
  }
  
  public A withNamedResources(V1alpha2NamedResourcesResources namedResources) {
    this._visitables.remove("namedResources");
    if (namedResources != null) {
        this.namedResources = new V1alpha2NamedResourcesResourcesBuilder(namedResources);
        this._visitables.get("namedResources").add(this.namedResources);
    } else {
        this.namedResources = null;
        this._visitables.get("namedResources").remove(this.namedResources);
    }
    return (A) this;
  }
  
  public boolean hasNamedResources() {
    return this.namedResources != null;
  }
  
  public NamedResourcesNested<A> withNewNamedResources() {
    return new NamedResourcesNested(null);
  }
  
  public NamedResourcesNested<A> withNewNamedResourcesLike(V1alpha2NamedResourcesResources item) {
    return new NamedResourcesNested(item);
  }
  
  public NamedResourcesNested<A> editNamedResources() {
    return withNewNamedResourcesLike(java.util.Optional.ofNullable(buildNamedResources()).orElse(null));
  }
  
  public NamedResourcesNested<A> editOrNewNamedResources() {
    return withNewNamedResourcesLike(java.util.Optional.ofNullable(buildNamedResources()).orElse(new V1alpha2NamedResourcesResourcesBuilder().build()));
  }
  
  public NamedResourcesNested<A> editOrNewNamedResourcesLike(V1alpha2NamedResourcesResources item) {
    return withNewNamedResourcesLike(java.util.Optional.ofNullable(buildNamedResources()).orElse(item));
  }
  
  public String getNodeName() {
    return this.nodeName;
  }
  
  public A withNodeName(String nodeName) {
    this.nodeName = nodeName;
    return (A) this;
  }
  
  public boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2ResourceSliceFluent that = (V1alpha2ResourceSliceFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(driverName, that.driverName)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(namedResources, that.namedResources)) return false;
    if (!java.util.Objects.equals(nodeName, that.nodeName)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  driverName,  kind,  metadata,  namedResources,  nodeName,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (driverName != null) { sb.append("driverName:"); sb.append(driverName + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (namedResources != null) { sb.append("namedResources:"); sb.append(namedResources + ","); }
    if (nodeName != null) { sb.append("nodeName:"); sb.append(nodeName); }
    sb.append("}");
    return sb.toString();
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1alpha2ResourceSliceFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class NamedResourcesNested<N> extends V1alpha2NamedResourcesResourcesFluent<NamedResourcesNested<N>> implements Nested<N>{
    NamedResourcesNested(V1alpha2NamedResourcesResources item) {
      this.builder = new V1alpha2NamedResourcesResourcesBuilder(this, item);
    }
    V1alpha2NamedResourcesResourcesBuilder builder;
    
    public N and() {
      return (N) V1alpha2ResourceSliceFluent.this.withNamedResources(builder.build());
    }
    
    public N endNamedResources() {
      return and();
    }
    
  
  }

}