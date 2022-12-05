package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1beta1CSIStorageCapacityFluentImpl<A extends V1beta1CSIStorageCapacityFluent<A>> extends BaseFluent<A> implements V1beta1CSIStorageCapacityFluent<A>{
  public V1beta1CSIStorageCapacityFluentImpl() {
  }
  public V1beta1CSIStorageCapacityFluentImpl(V1beta1CSIStorageCapacity instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withCapacity(instance.getCapacity());

    this.withKind(instance.getKind());

    this.withMaximumVolumeSize(instance.getMaximumVolumeSize());

    this.withMetadata(instance.getMetadata());

    this.withNodeTopology(instance.getNodeTopology());

    this.withStorageClassName(instance.getStorageClassName());

  }
  private String apiVersion;
  private Quantity capacity;
  private String kind;
  private Quantity maximumVolumeSize;
  private V1ObjectMetaBuilder metadata;
  private V1LabelSelectorBuilder nodeTopology;
  private String storageClassName;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public Quantity getCapacity() {
    return this.capacity;
  }
  public A withCapacity(Quantity capacity) {
    this.capacity=capacity; return (A) this;
  }
  public Boolean hasCapacity() {
    return this.capacity != null;
  }
  public A withNewCapacity(String value) {
    return (A)withCapacity(new Quantity(value));
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
  public Quantity getMaximumVolumeSize() {
    return this.maximumVolumeSize;
  }
  public A withMaximumVolumeSize(Quantity maximumVolumeSize) {
    this.maximumVolumeSize=maximumVolumeSize; return (A) this;
  }
  public Boolean hasMaximumVolumeSize() {
    return this.maximumVolumeSize != null;
  }
  public A withNewMaximumVolumeSize(String value) {
    return (A)withMaximumVolumeSize(new Quantity(value));
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
  public V1beta1CSIStorageCapacityFluent.MetadataNested<A> withNewMetadata() {
    return new V1beta1CSIStorageCapacityFluentImpl.MetadataNestedImpl();
  }
  public V1beta1CSIStorageCapacityFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1beta1CSIStorageCapacityFluentImpl.MetadataNestedImpl(item);
  }
  public V1beta1CSIStorageCapacityFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1beta1CSIStorageCapacityFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1beta1CSIStorageCapacityFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildNodeTopology instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getNodeTopology() {
    return this.nodeTopology!=null ?this.nodeTopology.build():null;
  }
  public V1LabelSelector buildNodeTopology() {
    return this.nodeTopology!=null ?this.nodeTopology.build():null;
  }
  public A withNodeTopology(V1LabelSelector nodeTopology) {
    _visitables.get("nodeTopology").remove(this.nodeTopology);
    if (nodeTopology!=null){ this.nodeTopology= new V1LabelSelectorBuilder(nodeTopology); _visitables.get("nodeTopology").add(this.nodeTopology);} else { this.nodeTopology = null; _visitables.get("nodeTopology").remove(this.nodeTopology); } return (A) this;
  }
  public Boolean hasNodeTopology() {
    return this.nodeTopology != null;
  }
  public V1beta1CSIStorageCapacityFluent.NodeTopologyNested<A> withNewNodeTopology() {
    return new V1beta1CSIStorageCapacityFluentImpl.NodeTopologyNestedImpl();
  }
  public V1beta1CSIStorageCapacityFluent.NodeTopologyNested<A> withNewNodeTopologyLike(V1LabelSelector item) {
    return new V1beta1CSIStorageCapacityFluentImpl.NodeTopologyNestedImpl(item);
  }
  public V1beta1CSIStorageCapacityFluent.NodeTopologyNested<A> editNodeTopology() {
    return withNewNodeTopologyLike(getNodeTopology());
  }
  public V1beta1CSIStorageCapacityFluent.NodeTopologyNested<A> editOrNewNodeTopology() {
    return withNewNodeTopologyLike(getNodeTopology() != null ? getNodeTopology(): new V1LabelSelectorBuilder().build());
  }
  public V1beta1CSIStorageCapacityFluent.NodeTopologyNested<A> editOrNewNodeTopologyLike(V1LabelSelector item) {
    return withNewNodeTopologyLike(getNodeTopology() != null ? getNodeTopology(): item);
  }
  public String getStorageClassName() {
    return this.storageClassName;
  }
  public A withStorageClassName(String storageClassName) {
    this.storageClassName=storageClassName; return (A) this;
  }
  public Boolean hasStorageClassName() {
    return this.storageClassName != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1CSIStorageCapacityFluentImpl that = (V1beta1CSIStorageCapacityFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (capacity != null ? !capacity.equals(that.capacity) :that.capacity != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (maximumVolumeSize != null ? !maximumVolumeSize.equals(that.maximumVolumeSize) :that.maximumVolumeSize != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (nodeTopology != null ? !nodeTopology.equals(that.nodeTopology) :that.nodeTopology != null) return false;
    if (storageClassName != null ? !storageClassName.equals(that.storageClassName) :that.storageClassName != null) return false;
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
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1beta1CSIStorageCapacityFluent.MetadataNested<N>> implements V1beta1CSIStorageCapacityFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1beta1CSIStorageCapacityFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class NodeTopologyNestedImpl<N> extends V1LabelSelectorFluentImpl<V1beta1CSIStorageCapacityFluent.NodeTopologyNested<N>> implements V1beta1CSIStorageCapacityFluent.NodeTopologyNested<N>,Nested<N>{
    NodeTopologyNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    NodeTopologyNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1beta1CSIStorageCapacityFluentImpl.this.withNodeTopology(builder.build());
    }
    public N endNodeTopology() {
      return and();
    }
    
  }
  
}