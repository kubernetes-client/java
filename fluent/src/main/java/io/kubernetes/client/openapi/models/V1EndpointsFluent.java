package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1EndpointsFluent<A extends V1EndpointsFluent<A>> extends Fluent<A>{
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
  public V1EndpointsFluent.MetadataNested<A> withNewMetadata();
  public V1EndpointsFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1EndpointsFluent.MetadataNested<A> editMetadata();
  public V1EndpointsFluent.MetadataNested<A> editOrNewMetadata();
  public V1EndpointsFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  public A addToSubsets(Integer index,V1EndpointSubset item);
  public A setToSubsets(Integer index,V1EndpointSubset item);
  public A addToSubsets(io.kubernetes.client.openapi.models.V1EndpointSubset... items);
  public A addAllToSubsets(Collection<V1EndpointSubset> items);
  public A removeFromSubsets(io.kubernetes.client.openapi.models.V1EndpointSubset... items);
  public A removeAllFromSubsets(Collection<V1EndpointSubset> items);
  public A removeMatchingFromSubsets(Predicate<V1EndpointSubsetBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildSubsets instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1EndpointSubset> getSubsets();
  public List<V1EndpointSubset> buildSubsets();
  public V1EndpointSubset buildSubset(Integer index);
  public V1EndpointSubset buildFirstSubset();
  public V1EndpointSubset buildLastSubset();
  public V1EndpointSubset buildMatchingSubset(Predicate<V1EndpointSubsetBuilder> predicate);
  public Boolean hasMatchingSubset(Predicate<V1EndpointSubsetBuilder> predicate);
  public A withSubsets(List<V1EndpointSubset> subsets);
  public A withSubsets(io.kubernetes.client.openapi.models.V1EndpointSubset... subsets);
  public Boolean hasSubsets();
  public V1EndpointsFluent.SubsetsNested<A> addNewSubset();
  public V1EndpointsFluent.SubsetsNested<A> addNewSubsetLike(V1EndpointSubset item);
  public V1EndpointsFluent.SubsetsNested<A> setNewSubsetLike(Integer index,V1EndpointSubset item);
  public V1EndpointsFluent.SubsetsNested<A> editSubset(Integer index);
  public V1EndpointsFluent.SubsetsNested<A> editFirstSubset();
  public V1EndpointsFluent.SubsetsNested<A> editLastSubset();
  public V1EndpointsFluent.SubsetsNested<A> editMatchingSubset(Predicate<V1EndpointSubsetBuilder> predicate);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1EndpointsFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SubsetsNested<N> extends Nested<N>,V1EndpointSubsetFluent<V1EndpointsFluent.SubsetsNested<N>>{
    public N and();
    public N endSubset();
    
  }
  
}