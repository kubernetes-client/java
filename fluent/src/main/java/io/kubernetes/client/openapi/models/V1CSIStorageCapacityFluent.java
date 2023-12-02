package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CSIStorageCapacityFluent<A extends V1CSIStorageCapacityFluent<A>> extends BaseFluent<A>{
  public V1CSIStorageCapacityFluent() {
  }
  
  public V1CSIStorageCapacityFluent(V1CSIStorageCapacity instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private Quantity capacity;
  private String kind;
  private Quantity maximumVolumeSize;
  private V1ObjectMetaBuilder metadata;
  private V1LabelSelectorBuilder nodeTopology;
  private String storageClassName;
  
  protected void copyInstance(V1CSIStorageCapacity instance) {
    instance = (instance != null ? instance : new V1CSIStorageCapacity());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withCapacity(instance.getCapacity());
          this.withKind(instance.getKind());
          this.withMaximumVolumeSize(instance.getMaximumVolumeSize());
          this.withMetadata(instance.getMetadata());
          this.withNodeTopology(instance.getNodeTopology());
          this.withStorageClassName(instance.getStorageClassName());
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
  
  public Quantity getCapacity() {
    return this.capacity;
  }
  
  public A withCapacity(Quantity capacity) {
    this.capacity = capacity;
    return (A) this;
  }
  
  public boolean hasCapacity() {
    return this.capacity != null;
  }
  
  public A withNewCapacity(String value) {
    return (A)withCapacity(new Quantity(value));
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
  
  public Quantity getMaximumVolumeSize() {
    return this.maximumVolumeSize;
  }
  
  public A withMaximumVolumeSize(Quantity maximumVolumeSize) {
    this.maximumVolumeSize = maximumVolumeSize;
    return (A) this;
  }
  
  public boolean hasMaximumVolumeSize() {
    return this.maximumVolumeSize != null;
  }
  
  public A withNewMaximumVolumeSize(String value) {
    return (A)withMaximumVolumeSize(new Quantity(value));
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
  
  public V1LabelSelector buildNodeTopology() {
    return this.nodeTopology != null ? this.nodeTopology.build() : null;
  }
  
  public A withNodeTopology(V1LabelSelector nodeTopology) {
    this._visitables.remove("nodeTopology");
    if (nodeTopology != null) {
        this.nodeTopology = new V1LabelSelectorBuilder(nodeTopology);
        this._visitables.get("nodeTopology").add(this.nodeTopology);
    } else {
        this.nodeTopology = null;
        this._visitables.get("nodeTopology").remove(this.nodeTopology);
    }
    return (A) this;
  }
  
  public boolean hasNodeTopology() {
    return this.nodeTopology != null;
  }
  
  public NodeTopologyNested<A> withNewNodeTopology() {
    return new NodeTopologyNested(null);
  }
  
  public NodeTopologyNested<A> withNewNodeTopologyLike(V1LabelSelector item) {
    return new NodeTopologyNested(item);
  }
  
  public NodeTopologyNested<A> editNodeTopology() {
    return withNewNodeTopologyLike(java.util.Optional.ofNullable(buildNodeTopology()).orElse(null));
  }
  
  public NodeTopologyNested<A> editOrNewNodeTopology() {
    return withNewNodeTopologyLike(java.util.Optional.ofNullable(buildNodeTopology()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public NodeTopologyNested<A> editOrNewNodeTopologyLike(V1LabelSelector item) {
    return withNewNodeTopologyLike(java.util.Optional.ofNullable(buildNodeTopology()).orElse(item));
  }
  
  public String getStorageClassName() {
    return this.storageClassName;
  }
  
  public A withStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
    return (A) this;
  }
  
  public boolean hasStorageClassName() {
    return this.storageClassName != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CSIStorageCapacityFluent that = (V1CSIStorageCapacityFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(capacity, that.capacity)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(maximumVolumeSize, that.maximumVolumeSize)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(nodeTopology, that.nodeTopology)) return false;
    if (!java.util.Objects.equals(storageClassName, that.storageClassName)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  capacity,  kind,  maximumVolumeSize,  metadata,  nodeTopology,  storageClassName,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (capacity != null) { sb.append("capacity:"); sb.append(capacity + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (maximumVolumeSize != null) { sb.append("maximumVolumeSize:"); sb.append(maximumVolumeSize + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (nodeTopology != null) { sb.append("nodeTopology:"); sb.append(nodeTopology + ","); }
    if (storageClassName != null) { sb.append("storageClassName:"); sb.append(storageClassName); }
    sb.append("}");
    return sb.toString();
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1CSIStorageCapacityFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class NodeTopologyNested<N> extends V1LabelSelectorFluent<NodeTopologyNested<N>> implements Nested<N>{
    NodeTopologyNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1CSIStorageCapacityFluent.this.withNodeTopology(builder.build());
    }
    
    public N endNodeTopology() {
      return and();
    }
    
  
  }

}