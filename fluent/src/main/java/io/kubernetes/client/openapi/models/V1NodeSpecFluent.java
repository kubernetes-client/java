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
public interface V1NodeSpecFluent<A extends V1NodeSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildConfigSource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeConfigSource getConfigSource();
  public V1NodeConfigSource buildConfigSource();
  public A withConfigSource(V1NodeConfigSource configSource);
  public Boolean hasConfigSource();
  public V1NodeSpecFluent.ConfigSourceNested<A> withNewConfigSource();
  public V1NodeSpecFluent.ConfigSourceNested<A> withNewConfigSourceLike(V1NodeConfigSource item);
  public V1NodeSpecFluent.ConfigSourceNested<A> editConfigSource();
  public V1NodeSpecFluent.ConfigSourceNested<A> editOrNewConfigSource();
  public V1NodeSpecFluent.ConfigSourceNested<A> editOrNewConfigSourceLike(V1NodeConfigSource item);
  public String getExternalID();
  public A withExternalID(String externalID);
  public Boolean hasExternalID();
  public String getPodCIDR();
  public A withPodCIDR(String podCIDR);
  public Boolean hasPodCIDR();
  public A addToPodCIDRs(Integer index,String item);
  public A setToPodCIDRs(Integer index,String item);
  public A addToPodCIDRs(java.lang.String... items);
  public A addAllToPodCIDRs(Collection<String> items);
  public A removeFromPodCIDRs(java.lang.String... items);
  public A removeAllFromPodCIDRs(Collection<String> items);
  public List<String> getPodCIDRs();
  public String getPodCIDR(Integer index);
  public String getFirstPodCIDR();
  public String getLastPodCIDR();
  public String getMatchingPodCIDR(Predicate<String> predicate);
  public Boolean hasMatchingPodCIDR(Predicate<String> predicate);
  public A withPodCIDRs(List<String> podCIDRs);
  public A withPodCIDRs(java.lang.String... podCIDRs);
  public Boolean hasPodCIDRs();
  public String getProviderID();
  public A withProviderID(String providerID);
  public Boolean hasProviderID();
  public A addToTaints(Integer index,V1Taint item);
  public A setToTaints(Integer index,V1Taint item);
  public A addToTaints(io.kubernetes.client.openapi.models.V1Taint... items);
  public A addAllToTaints(Collection<V1Taint> items);
  public A removeFromTaints(io.kubernetes.client.openapi.models.V1Taint... items);
  public A removeAllFromTaints(Collection<V1Taint> items);
  public A removeMatchingFromTaints(Predicate<V1TaintBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildTaints instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Taint> getTaints();
  public List<V1Taint> buildTaints();
  public V1Taint buildTaint(Integer index);
  public V1Taint buildFirstTaint();
  public V1Taint buildLastTaint();
  public V1Taint buildMatchingTaint(Predicate<V1TaintBuilder> predicate);
  public Boolean hasMatchingTaint(Predicate<V1TaintBuilder> predicate);
  public A withTaints(List<V1Taint> taints);
  public A withTaints(io.kubernetes.client.openapi.models.V1Taint... taints);
  public Boolean hasTaints();
  public V1NodeSpecFluent.TaintsNested<A> addNewTaint();
  public V1NodeSpecFluent.TaintsNested<A> addNewTaintLike(V1Taint item);
  public V1NodeSpecFluent.TaintsNested<A> setNewTaintLike(Integer index,V1Taint item);
  public V1NodeSpecFluent.TaintsNested<A> editTaint(Integer index);
  public V1NodeSpecFluent.TaintsNested<A> editFirstTaint();
  public V1NodeSpecFluent.TaintsNested<A> editLastTaint();
  public V1NodeSpecFluent.TaintsNested<A> editMatchingTaint(Predicate<V1TaintBuilder> predicate);
  public Boolean getUnschedulable();
  public A withUnschedulable(Boolean unschedulable);
  public Boolean hasUnschedulable();
  public A withUnschedulable();
  public interface ConfigSourceNested<N> extends Nested<N>,V1NodeConfigSourceFluent<V1NodeSpecFluent.ConfigSourceNested<N>>{
    public N and();
    public N endConfigSource();
    
  }
  public interface TaintsNested<N> extends Nested<N>,V1TaintFluent<V1NodeSpecFluent.TaintsNested<N>>{
    public N and();
    public N endTaint();
    
  }
  
}