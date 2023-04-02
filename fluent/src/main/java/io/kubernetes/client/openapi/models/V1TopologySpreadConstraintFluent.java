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
public interface V1TopologySpreadConstraintFluent<A extends V1TopologySpreadConstraintFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildLabelSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getLabelSelector();
  public V1LabelSelector buildLabelSelector();
  public A withLabelSelector(V1LabelSelector labelSelector);
  public Boolean hasLabelSelector();
  public V1TopologySpreadConstraintFluent.LabelSelectorNested<A> withNewLabelSelector();
  public V1TopologySpreadConstraintFluent.LabelSelectorNested<A> withNewLabelSelectorLike(V1LabelSelector item);
  public V1TopologySpreadConstraintFluent.LabelSelectorNested<A> editLabelSelector();
  public V1TopologySpreadConstraintFluent.LabelSelectorNested<A> editOrNewLabelSelector();
  public V1TopologySpreadConstraintFluent.LabelSelectorNested<A> editOrNewLabelSelectorLike(V1LabelSelector item);
  public A addToMatchLabelKeys(Integer index,String item);
  public A setToMatchLabelKeys(Integer index,String item);
  public A addToMatchLabelKeys(java.lang.String... items);
  public A addAllToMatchLabelKeys(Collection<String> items);
  public A removeFromMatchLabelKeys(java.lang.String... items);
  public A removeAllFromMatchLabelKeys(Collection<String> items);
  public List<String> getMatchLabelKeys();
  public String getMatchLabelKey(Integer index);
  public String getFirstMatchLabelKey();
  public String getLastMatchLabelKey();
  public String getMatchingMatchLabelKey(Predicate<String> predicate);
  public Boolean hasMatchingMatchLabelKey(Predicate<String> predicate);
  public A withMatchLabelKeys(List<String> matchLabelKeys);
  public A withMatchLabelKeys(java.lang.String... matchLabelKeys);
  public Boolean hasMatchLabelKeys();
  public Integer getMaxSkew();
  public A withMaxSkew(Integer maxSkew);
  public Boolean hasMaxSkew();
  public Integer getMinDomains();
  public A withMinDomains(Integer minDomains);
  public Boolean hasMinDomains();
  public String getNodeAffinityPolicy();
  public A withNodeAffinityPolicy(String nodeAffinityPolicy);
  public Boolean hasNodeAffinityPolicy();
  public String getNodeTaintsPolicy();
  public A withNodeTaintsPolicy(String nodeTaintsPolicy);
  public Boolean hasNodeTaintsPolicy();
  public String getTopologyKey();
  public A withTopologyKey(String topologyKey);
  public Boolean hasTopologyKey();
  public String getWhenUnsatisfiable();
  public A withWhenUnsatisfiable(String whenUnsatisfiable);
  public Boolean hasWhenUnsatisfiable();
  public interface LabelSelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1TopologySpreadConstraintFluent.LabelSelectorNested<N>>{
    public N and();
    public N endLabelSelector();
    
  }
  
}