package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CSIStorageCapacityFluent<A extends V1CSIStorageCapacityFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public Quantity getCapacity();
  public A withCapacity(Quantity capacity);
  public Boolean hasCapacity();
  public A withNewCapacity(String value);
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  public Quantity getMaximumVolumeSize();
  public A withMaximumVolumeSize(Quantity maximumVolumeSize);
  public Boolean hasMaximumVolumeSize();
  public A withNewMaximumVolumeSize(String value);
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();
  public V1ObjectMeta buildMetadata();
  public A withMetadata(V1ObjectMeta metadata);
  public Boolean hasMetadata();
  public V1CSIStorageCapacityFluent.MetadataNested<A> withNewMetadata();
  public V1CSIStorageCapacityFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1CSIStorageCapacityFluent.MetadataNested<A> editMetadata();
  public V1CSIStorageCapacityFluent.MetadataNested<A> editOrNewMetadata();
  public V1CSIStorageCapacityFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildNodeTopology instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getNodeTopology();
  public V1LabelSelector buildNodeTopology();
  public A withNodeTopology(V1LabelSelector nodeTopology);
  public Boolean hasNodeTopology();
  public V1CSIStorageCapacityFluent.NodeTopologyNested<A> withNewNodeTopology();
  public V1CSIStorageCapacityFluent.NodeTopologyNested<A> withNewNodeTopologyLike(V1LabelSelector item);
  public V1CSIStorageCapacityFluent.NodeTopologyNested<A> editNodeTopology();
  public V1CSIStorageCapacityFluent.NodeTopologyNested<A> editOrNewNodeTopology();
  public V1CSIStorageCapacityFluent.NodeTopologyNested<A> editOrNewNodeTopologyLike(V1LabelSelector item);
  public String getStorageClassName();
  public A withStorageClassName(String storageClassName);
  public Boolean hasStorageClassName();
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1CSIStorageCapacityFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface NodeTopologyNested<N> extends Nested<N>,V1LabelSelectorFluent<V1CSIStorageCapacityFluent.NodeTopologyNested<N>>{
    public N and();
    public N endNodeTopology();
    
  }
  
}