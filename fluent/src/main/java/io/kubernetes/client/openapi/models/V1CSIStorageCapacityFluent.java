package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CSIStorageCapacityFluent<A extends io.kubernetes.client.openapi.models.V1CSIStorageCapacityFluent<A>> extends BaseFluent<A>{

  private String apiVersion;
  private Quantity capacity;
  private String kind;
  private Quantity maximumVolumeSize;
  private V1ObjectMetaBuilder metadata;
  private V1LabelSelectorBuilder nodeTopology;
  private String storageClassName;

  public V1CSIStorageCapacityFluent() {
  }
  
  public V1CSIStorageCapacityFluent(V1CSIStorageCapacity instance) {
    this.copyInstance(instance);
  }

  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public V1LabelSelector buildNodeTopology() {
    return this.nodeTopology != null ? this.nodeTopology.build() : null;
  }
  
  protected void copyInstance(V1CSIStorageCapacity instance) {
    instance = instance != null ? instance : new V1CSIStorageCapacity();
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
  
  public MetadataNested<A> editMetadata() {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(null));
  }
  
  public NodeTopologyNested<A> editNodeTopology() {
    return this.withNewNodeTopologyLike(Optional.ofNullable(this.buildNodeTopology()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(item));
  }
  
  public NodeTopologyNested<A> editOrNewNodeTopology() {
    return this.withNewNodeTopologyLike(Optional.ofNullable(this.buildNodeTopology()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public NodeTopologyNested<A> editOrNewNodeTopologyLike(V1LabelSelector item) {
    return this.withNewNodeTopologyLike(Optional.ofNullable(this.buildNodeTopology()).orElse(item));
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
    V1CSIStorageCapacityFluent that = (V1CSIStorageCapacityFluent) o;
    if (!(Objects.equals(apiVersion, that.apiVersion))) {
      return false;
    }
    if (!(Objects.equals(capacity, that.capacity))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(maximumVolumeSize, that.maximumVolumeSize))) {
      return false;
    }
    if (!(Objects.equals(metadata, that.metadata))) {
      return false;
    }
    if (!(Objects.equals(nodeTopology, that.nodeTopology))) {
      return false;
    }
    if (!(Objects.equals(storageClassName, that.storageClassName))) {
      return false;
    }
    return true;
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public Quantity getCapacity() {
    return this.capacity;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public Quantity getMaximumVolumeSize() {
    return this.maximumVolumeSize;
  }
  
  public String getStorageClassName() {
    return this.storageClassName;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public boolean hasCapacity() {
    return this.capacity != null;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public boolean hasMaximumVolumeSize() {
    return this.maximumVolumeSize != null;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public boolean hasNodeTopology() {
    return this.nodeTopology != null;
  }
  
  public boolean hasStorageClassName() {
    return this.storageClassName != null;
  }
  
  public int hashCode() {
    return Objects.hash(apiVersion, capacity, kind, maximumVolumeSize, metadata, nodeTopology, storageClassName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiVersion == null)) {
        sb.append("apiVersion:");
        sb.append(apiVersion);
        sb.append(",");
    }
    if (!(capacity == null)) {
        sb.append("capacity:");
        sb.append(capacity);
        sb.append(",");
    }
    if (!(kind == null)) {
        sb.append("kind:");
        sb.append(kind);
        sb.append(",");
    }
    if (!(maximumVolumeSize == null)) {
        sb.append("maximumVolumeSize:");
        sb.append(maximumVolumeSize);
        sb.append(",");
    }
    if (!(metadata == null)) {
        sb.append("metadata:");
        sb.append(metadata);
        sb.append(",");
    }
    if (!(nodeTopology == null)) {
        sb.append("nodeTopology:");
        sb.append(nodeTopology);
        sb.append(",");
    }
    if (!(storageClassName == null)) {
        sb.append("storageClassName:");
        sb.append(storageClassName);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public A withCapacity(Quantity capacity) {
    this.capacity = capacity;
    return (A) this;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public A withMaximumVolumeSize(Quantity maximumVolumeSize) {
    this.maximumVolumeSize = maximumVolumeSize;
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
  
  public A withNewCapacity(String value) {
    return (A) this.withCapacity(new Quantity(value));
  }
  
  public A withNewMaximumVolumeSize(String value) {
    return (A) this.withMaximumVolumeSize(new Quantity(value));
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new MetadataNested(item);
  }
  
  public NodeTopologyNested<A> withNewNodeTopology() {
    return new NodeTopologyNested(null);
  }
  
  public NodeTopologyNested<A> withNewNodeTopologyLike(V1LabelSelector item) {
    return new NodeTopologyNested(item);
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
  
  public A withStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
    return (A) this;
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
  
    V1ObjectMetaBuilder builder;
  
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
  
    public N and() {
      return (N) V1CSIStorageCapacityFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  }
  public class NodeTopologyNested<N> extends V1LabelSelectorFluent<NodeTopologyNested<N>> implements Nested<N>{
  
    V1LabelSelectorBuilder builder;
  
    NodeTopologyNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1CSIStorageCapacityFluent.this.withNodeTopology(builder.build());
    }
    
    public N endNodeTopology() {
      return and();
    }
    
  }
}