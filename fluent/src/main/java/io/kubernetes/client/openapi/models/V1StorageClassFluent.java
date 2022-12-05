package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public interface V1StorageClassFluent<A extends V1StorageClassFluent<A>> extends Fluent<A>{
  public Boolean getAllowVolumeExpansion();
  public A withAllowVolumeExpansion(Boolean allowVolumeExpansion);
  public Boolean hasAllowVolumeExpansion();
  public A addToAllowedTopologies(Integer index,V1TopologySelectorTerm item);
  public A setToAllowedTopologies(Integer index,V1TopologySelectorTerm item);
  public A addToAllowedTopologies(io.kubernetes.client.openapi.models.V1TopologySelectorTerm... items);
  public A addAllToAllowedTopologies(Collection<V1TopologySelectorTerm> items);
  public A removeFromAllowedTopologies(io.kubernetes.client.openapi.models.V1TopologySelectorTerm... items);
  public A removeAllFromAllowedTopologies(Collection<V1TopologySelectorTerm> items);
  public A removeMatchingFromAllowedTopologies(Predicate<V1TopologySelectorTermBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildAllowedTopologies instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1TopologySelectorTerm> getAllowedTopologies();
  public List<V1TopologySelectorTerm> buildAllowedTopologies();
  public V1TopologySelectorTerm buildAllowedTopology(Integer index);
  public V1TopologySelectorTerm buildFirstAllowedTopology();
  public V1TopologySelectorTerm buildLastAllowedTopology();
  public V1TopologySelectorTerm buildMatchingAllowedTopology(Predicate<V1TopologySelectorTermBuilder> predicate);
  public Boolean hasMatchingAllowedTopology(Predicate<V1TopologySelectorTermBuilder> predicate);
  public A withAllowedTopologies(List<V1TopologySelectorTerm> allowedTopologies);
  public A withAllowedTopologies(io.kubernetes.client.openapi.models.V1TopologySelectorTerm... allowedTopologies);
  public Boolean hasAllowedTopologies();
  public V1StorageClassFluent.AllowedTopologiesNested<A> addNewAllowedTopology();
  public V1StorageClassFluent.AllowedTopologiesNested<A> addNewAllowedTopologyLike(V1TopologySelectorTerm item);
  public V1StorageClassFluent.AllowedTopologiesNested<A> setNewAllowedTopologyLike(Integer index,V1TopologySelectorTerm item);
  public V1StorageClassFluent.AllowedTopologiesNested<A> editAllowedTopology(Integer index);
  public V1StorageClassFluent.AllowedTopologiesNested<A> editFirstAllowedTopology();
  public V1StorageClassFluent.AllowedTopologiesNested<A> editLastAllowedTopology();
  public V1StorageClassFluent.AllowedTopologiesNested<A> editMatchingAllowedTopology(Predicate<V1TopologySelectorTermBuilder> predicate);
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();
  public V1ObjectMeta buildMetadata();
  public A withMetadata(V1ObjectMeta metadata);
  public Boolean hasMetadata();
  public V1StorageClassFluent.MetadataNested<A> withNewMetadata();
  public V1StorageClassFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1StorageClassFluent.MetadataNested<A> editMetadata();
  public V1StorageClassFluent.MetadataNested<A> editOrNewMetadata();
  public V1StorageClassFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  public A addToMountOptions(Integer index,String item);
  public A setToMountOptions(Integer index,String item);
  public A addToMountOptions(java.lang.String... items);
  public A addAllToMountOptions(Collection<String> items);
  public A removeFromMountOptions(java.lang.String... items);
  public A removeAllFromMountOptions(Collection<String> items);
  public List<String> getMountOptions();
  public String getMountOption(Integer index);
  public String getFirstMountOption();
  public String getLastMountOption();
  public String getMatchingMountOption(Predicate<String> predicate);
  public Boolean hasMatchingMountOption(Predicate<String> predicate);
  public A withMountOptions(List<String> mountOptions);
  public A withMountOptions(java.lang.String... mountOptions);
  public Boolean hasMountOptions();
  public A addToParameters(String key,String value);
  public A addToParameters(Map<String,String> map);
  public A removeFromParameters(String key);
  public A removeFromParameters(Map<String,String> map);
  public Map<String,String> getParameters();
  public <K,V>A withParameters(Map<String,String> parameters);
  public Boolean hasParameters();
  public String getProvisioner();
  public A withProvisioner(String provisioner);
  public Boolean hasProvisioner();
  public String getReclaimPolicy();
  public A withReclaimPolicy(String reclaimPolicy);
  public Boolean hasReclaimPolicy();
  public String getVolumeBindingMode();
  public A withVolumeBindingMode(String volumeBindingMode);
  public Boolean hasVolumeBindingMode();
  public A withAllowVolumeExpansion();
  public interface AllowedTopologiesNested<N> extends Nested<N>,V1TopologySelectorTermFluent<V1StorageClassFluent.AllowedTopologiesNested<N>>{
    public N and();
    public N endAllowedTopology();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1StorageClassFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}