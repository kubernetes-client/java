package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CSINodeDriverFluent<A extends V1CSINodeDriverFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildAllocatable instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeNodeResources getAllocatable();
  public V1VolumeNodeResources buildAllocatable();
  public A withAllocatable(V1VolumeNodeResources allocatable);
  public Boolean hasAllocatable();
  public V1CSINodeDriverFluent.AllocatableNested<A> withNewAllocatable();
  public V1CSINodeDriverFluent.AllocatableNested<A> withNewAllocatableLike(V1VolumeNodeResources item);
  public V1CSINodeDriverFluent.AllocatableNested<A> editAllocatable();
  public V1CSINodeDriverFluent.AllocatableNested<A> editOrNewAllocatable();
  public V1CSINodeDriverFluent.AllocatableNested<A> editOrNewAllocatableLike(V1VolumeNodeResources item);
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public String getNodeID();
  public A withNodeID(String nodeID);
  public Boolean hasNodeID();
  public A addToTopologyKeys(Integer index,String item);
  public A setToTopologyKeys(Integer index,String item);
  public A addToTopologyKeys(java.lang.String... items);
  public A addAllToTopologyKeys(Collection<String> items);
  public A removeFromTopologyKeys(java.lang.String... items);
  public A removeAllFromTopologyKeys(Collection<String> items);
  public List<String> getTopologyKeys();
  public String getTopologyKey(Integer index);
  public String getFirstTopologyKey();
  public String getLastTopologyKey();
  public String getMatchingTopologyKey(Predicate<String> predicate);
  public Boolean hasMatchingTopologyKey(Predicate<String> predicate);
  public A withTopologyKeys(List<String> topologyKeys);
  public A withTopologyKeys(java.lang.String... topologyKeys);
  public Boolean hasTopologyKeys();
  public interface AllocatableNested<N> extends Nested<N>,V1VolumeNodeResourcesFluent<V1CSINodeDriverFluent.AllocatableNested<N>>{
    public N and();
    public N endAllocatable();
    
  }
  
}