package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.Integer;
import java.util.Collection;
import java.util.Map;

 /**
  * Generated
  */
public interface V1NodeStatusFluent<A extends V1NodeStatusFluent<A>> extends Fluent<A>{
  public A addToAddresses(Integer index,V1NodeAddress item);
  public A setToAddresses(Integer index,V1NodeAddress item);
  public A addToAddresses(io.kubernetes.client.openapi.models.V1NodeAddress... items);
  public A addAllToAddresses(Collection<V1NodeAddress> items);
  public A removeFromAddresses(io.kubernetes.client.openapi.models.V1NodeAddress... items);
  public A removeAllFromAddresses(Collection<V1NodeAddress> items);
  public A removeMatchingFromAddresses(Predicate<V1NodeAddressBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildAddresses instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NodeAddress> getAddresses();
  public List<V1NodeAddress> buildAddresses();
  public V1NodeAddress buildAddress(Integer index);
  public V1NodeAddress buildFirstAddress();
  public V1NodeAddress buildLastAddress();
  public V1NodeAddress buildMatchingAddress(Predicate<V1NodeAddressBuilder> predicate);
  public Boolean hasMatchingAddress(Predicate<V1NodeAddressBuilder> predicate);
  public A withAddresses(List<V1NodeAddress> addresses);
  public A withAddresses(io.kubernetes.client.openapi.models.V1NodeAddress... addresses);
  public Boolean hasAddresses();
  public V1NodeStatusFluent.AddressesNested<A> addNewAddress();
  public V1NodeStatusFluent.AddressesNested<A> addNewAddressLike(V1NodeAddress item);
  public V1NodeStatusFluent.AddressesNested<A> setNewAddressLike(Integer index,V1NodeAddress item);
  public V1NodeStatusFluent.AddressesNested<A> editAddress(Integer index);
  public V1NodeStatusFluent.AddressesNested<A> editFirstAddress();
  public V1NodeStatusFluent.AddressesNested<A> editLastAddress();
  public V1NodeStatusFluent.AddressesNested<A> editMatchingAddress(Predicate<V1NodeAddressBuilder> predicate);
  public A addToAllocatable(String key,Quantity value);
  public A addToAllocatable(Map<String,Quantity> map);
  public A removeFromAllocatable(String key);
  public A removeFromAllocatable(Map<String,Quantity> map);
  public Map<String,Quantity> getAllocatable();
  public <K,V>A withAllocatable(Map<String,Quantity> allocatable);
  public Boolean hasAllocatable();
  public A addToCapacity(String key,Quantity value);
  public A addToCapacity(Map<String,Quantity> map);
  public A removeFromCapacity(String key);
  public A removeFromCapacity(Map<String,Quantity> map);
  public Map<String,Quantity> getCapacity();
  public <K,V>A withCapacity(Map<String,Quantity> capacity);
  public Boolean hasCapacity();
  public A addToConditions(Integer index,V1NodeCondition item);
  public A setToConditions(Integer index,V1NodeCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1NodeCondition... items);
  public A addAllToConditions(Collection<V1NodeCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1NodeCondition... items);
  public A removeAllFromConditions(Collection<V1NodeCondition> items);
  public A removeMatchingFromConditions(Predicate<V1NodeConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NodeCondition> getConditions();
  public List<V1NodeCondition> buildConditions();
  public V1NodeCondition buildCondition(Integer index);
  public V1NodeCondition buildFirstCondition();
  public V1NodeCondition buildLastCondition();
  public V1NodeCondition buildMatchingCondition(Predicate<V1NodeConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V1NodeConditionBuilder> predicate);
  public A withConditions(List<V1NodeCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1NodeCondition... conditions);
  public Boolean hasConditions();
  public V1NodeStatusFluent.ConditionsNested<A> addNewCondition();
  public V1NodeStatusFluent.ConditionsNested<A> addNewConditionLike(V1NodeCondition item);
  public V1NodeStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1NodeCondition item);
  public V1NodeStatusFluent.ConditionsNested<A> editCondition(Integer index);
  public V1NodeStatusFluent.ConditionsNested<A> editFirstCondition();
  public V1NodeStatusFluent.ConditionsNested<A> editLastCondition();
  public V1NodeStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1NodeConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConfig instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeConfigStatus getConfig();
  public V1NodeConfigStatus buildConfig();
  public A withConfig(V1NodeConfigStatus config);
  public Boolean hasConfig();
  public V1NodeStatusFluent.ConfigNested<A> withNewConfig();
  public V1NodeStatusFluent.ConfigNested<A> withNewConfigLike(V1NodeConfigStatus item);
  public V1NodeStatusFluent.ConfigNested<A> editConfig();
  public V1NodeStatusFluent.ConfigNested<A> editOrNewConfig();
  public V1NodeStatusFluent.ConfigNested<A> editOrNewConfigLike(V1NodeConfigStatus item);
  
  /**
   * This method has been deprecated, please use method buildDaemonEndpoints instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeDaemonEndpoints getDaemonEndpoints();
  public V1NodeDaemonEndpoints buildDaemonEndpoints();
  public A withDaemonEndpoints(V1NodeDaemonEndpoints daemonEndpoints);
  public Boolean hasDaemonEndpoints();
  public V1NodeStatusFluent.DaemonEndpointsNested<A> withNewDaemonEndpoints();
  public V1NodeStatusFluent.DaemonEndpointsNested<A> withNewDaemonEndpointsLike(V1NodeDaemonEndpoints item);
  public V1NodeStatusFluent.DaemonEndpointsNested<A> editDaemonEndpoints();
  public V1NodeStatusFluent.DaemonEndpointsNested<A> editOrNewDaemonEndpoints();
  public V1NodeStatusFluent.DaemonEndpointsNested<A> editOrNewDaemonEndpointsLike(V1NodeDaemonEndpoints item);
  public A addToImages(Integer index,V1ContainerImage item);
  public A setToImages(Integer index,V1ContainerImage item);
  public A addToImages(io.kubernetes.client.openapi.models.V1ContainerImage... items);
  public A addAllToImages(Collection<V1ContainerImage> items);
  public A removeFromImages(io.kubernetes.client.openapi.models.V1ContainerImage... items);
  public A removeAllFromImages(Collection<V1ContainerImage> items);
  public A removeMatchingFromImages(Predicate<V1ContainerImageBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildImages instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ContainerImage> getImages();
  public List<V1ContainerImage> buildImages();
  public V1ContainerImage buildImage(Integer index);
  public V1ContainerImage buildFirstImage();
  public V1ContainerImage buildLastImage();
  public V1ContainerImage buildMatchingImage(Predicate<V1ContainerImageBuilder> predicate);
  public Boolean hasMatchingImage(Predicate<V1ContainerImageBuilder> predicate);
  public A withImages(List<V1ContainerImage> images);
  public A withImages(io.kubernetes.client.openapi.models.V1ContainerImage... images);
  public Boolean hasImages();
  public V1NodeStatusFluent.ImagesNested<A> addNewImage();
  public V1NodeStatusFluent.ImagesNested<A> addNewImageLike(V1ContainerImage item);
  public V1NodeStatusFluent.ImagesNested<A> setNewImageLike(Integer index,V1ContainerImage item);
  public V1NodeStatusFluent.ImagesNested<A> editImage(Integer index);
  public V1NodeStatusFluent.ImagesNested<A> editFirstImage();
  public V1NodeStatusFluent.ImagesNested<A> editLastImage();
  public V1NodeStatusFluent.ImagesNested<A> editMatchingImage(Predicate<V1ContainerImageBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildNodeInfo instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSystemInfo getNodeInfo();
  public V1NodeSystemInfo buildNodeInfo();
  public A withNodeInfo(V1NodeSystemInfo nodeInfo);
  public Boolean hasNodeInfo();
  public V1NodeStatusFluent.NodeInfoNested<A> withNewNodeInfo();
  public V1NodeStatusFluent.NodeInfoNested<A> withNewNodeInfoLike(V1NodeSystemInfo item);
  public V1NodeStatusFluent.NodeInfoNested<A> editNodeInfo();
  public V1NodeStatusFluent.NodeInfoNested<A> editOrNewNodeInfo();
  public V1NodeStatusFluent.NodeInfoNested<A> editOrNewNodeInfoLike(V1NodeSystemInfo item);
  public String getPhase();
  public A withPhase(String phase);
  public Boolean hasPhase();
  public A addToVolumesAttached(Integer index,V1AttachedVolume item);
  public A setToVolumesAttached(Integer index,V1AttachedVolume item);
  public A addToVolumesAttached(io.kubernetes.client.openapi.models.V1AttachedVolume... items);
  public A addAllToVolumesAttached(Collection<V1AttachedVolume> items);
  public A removeFromVolumesAttached(io.kubernetes.client.openapi.models.V1AttachedVolume... items);
  public A removeAllFromVolumesAttached(Collection<V1AttachedVolume> items);
  public A removeMatchingFromVolumesAttached(Predicate<V1AttachedVolumeBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildVolumesAttached instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1AttachedVolume> getVolumesAttached();
  public List<V1AttachedVolume> buildVolumesAttached();
  public V1AttachedVolume buildVolumesAttached(Integer index);
  public V1AttachedVolume buildFirstVolumesAttached();
  public V1AttachedVolume buildLastVolumesAttached();
  public V1AttachedVolume buildMatchingVolumesAttached(Predicate<V1AttachedVolumeBuilder> predicate);
  public Boolean hasMatchingVolumesAttached(Predicate<V1AttachedVolumeBuilder> predicate);
  public A withVolumesAttached(List<V1AttachedVolume> volumesAttached);
  public A withVolumesAttached(io.kubernetes.client.openapi.models.V1AttachedVolume... volumesAttached);
  public Boolean hasVolumesAttached();
  public V1NodeStatusFluent.VolumesAttachedNested<A> addNewVolumesAttached();
  public V1NodeStatusFluent.VolumesAttachedNested<A> addNewVolumesAttachedLike(V1AttachedVolume item);
  public V1NodeStatusFluent.VolumesAttachedNested<A> setNewVolumesAttachedLike(Integer index,V1AttachedVolume item);
  public V1NodeStatusFluent.VolumesAttachedNested<A> editVolumesAttached(Integer index);
  public V1NodeStatusFluent.VolumesAttachedNested<A> editFirstVolumesAttached();
  public V1NodeStatusFluent.VolumesAttachedNested<A> editLastVolumesAttached();
  public V1NodeStatusFluent.VolumesAttachedNested<A> editMatchingVolumesAttached(Predicate<V1AttachedVolumeBuilder> predicate);
  public A addToVolumesInUse(Integer index,String item);
  public A setToVolumesInUse(Integer index,String item);
  public A addToVolumesInUse(java.lang.String... items);
  public A addAllToVolumesInUse(Collection<String> items);
  public A removeFromVolumesInUse(java.lang.String... items);
  public A removeAllFromVolumesInUse(Collection<String> items);
  public List<String> getVolumesInUse();
  public String getVolumesInUse(Integer index);
  public String getFirstVolumesInUse();
  public String getLastVolumesInUse();
  public String getMatchingVolumesInUse(Predicate<String> predicate);
  public Boolean hasMatchingVolumesInUse(Predicate<String> predicate);
  public A withVolumesInUse(List<String> volumesInUse);
  public A withVolumesInUse(java.lang.String... volumesInUse);
  public Boolean hasVolumesInUse();
  public interface AddressesNested<N> extends Nested<N>,V1NodeAddressFluent<V1NodeStatusFluent.AddressesNested<N>>{
    public N and();
    public N endAddress();
    
  }
  public interface ConditionsNested<N> extends Nested<N>,V1NodeConditionFluent<V1NodeStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  public interface ConfigNested<N> extends Nested<N>,V1NodeConfigStatusFluent<V1NodeStatusFluent.ConfigNested<N>>{
    public N and();
    public N endConfig();
    
  }
  public interface DaemonEndpointsNested<N> extends Nested<N>,V1NodeDaemonEndpointsFluent<V1NodeStatusFluent.DaemonEndpointsNested<N>>{
    public N and();
    public N endDaemonEndpoints();
    
  }
  public interface ImagesNested<N> extends Nested<N>,V1ContainerImageFluent<V1NodeStatusFluent.ImagesNested<N>>{
    public N and();
    public N endImage();
    
  }
  public interface NodeInfoNested<N> extends Nested<N>,V1NodeSystemInfoFluent<V1NodeStatusFluent.NodeInfoNested<N>>{
    public N and();
    public N endNodeInfo();
    
  }
  public interface VolumesAttachedNested<N> extends Nested<N>,V1AttachedVolumeFluent<V1NodeStatusFluent.VolumesAttachedNested<N>>{
    public N and();
    public N endVolumesAttached();
    
  }
  
}