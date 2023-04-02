package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
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
public interface V1AggregationRuleFluent<A extends V1AggregationRuleFluent<A>> extends Fluent<A>{
  public A addToClusterRoleSelectors(Integer index,V1LabelSelector item);
  public A setToClusterRoleSelectors(Integer index,V1LabelSelector item);
  public A addToClusterRoleSelectors(io.kubernetes.client.openapi.models.V1LabelSelector... items);
  public A addAllToClusterRoleSelectors(Collection<V1LabelSelector> items);
  public A removeFromClusterRoleSelectors(io.kubernetes.client.openapi.models.V1LabelSelector... items);
  public A removeAllFromClusterRoleSelectors(Collection<V1LabelSelector> items);
  public A removeMatchingFromClusterRoleSelectors(Predicate<V1LabelSelectorBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildClusterRoleSelectors instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1LabelSelector> getClusterRoleSelectors();
  public List<V1LabelSelector> buildClusterRoleSelectors();
  public V1LabelSelector buildClusterRoleSelector(Integer index);
  public V1LabelSelector buildFirstClusterRoleSelector();
  public V1LabelSelector buildLastClusterRoleSelector();
  public V1LabelSelector buildMatchingClusterRoleSelector(Predicate<V1LabelSelectorBuilder> predicate);
  public Boolean hasMatchingClusterRoleSelector(Predicate<V1LabelSelectorBuilder> predicate);
  public A withClusterRoleSelectors(List<V1LabelSelector> clusterRoleSelectors);
  public A withClusterRoleSelectors(io.kubernetes.client.openapi.models.V1LabelSelector... clusterRoleSelectors);
  public Boolean hasClusterRoleSelectors();
  public V1AggregationRuleFluent.ClusterRoleSelectorsNested<A> addNewClusterRoleSelector();
  public V1AggregationRuleFluent.ClusterRoleSelectorsNested<A> addNewClusterRoleSelectorLike(V1LabelSelector item);
  public V1AggregationRuleFluent.ClusterRoleSelectorsNested<A> setNewClusterRoleSelectorLike(Integer index,V1LabelSelector item);
  public V1AggregationRuleFluent.ClusterRoleSelectorsNested<A> editClusterRoleSelector(Integer index);
  public V1AggregationRuleFluent.ClusterRoleSelectorsNested<A> editFirstClusterRoleSelector();
  public V1AggregationRuleFluent.ClusterRoleSelectorsNested<A> editLastClusterRoleSelector();
  public V1AggregationRuleFluent.ClusterRoleSelectorsNested<A> editMatchingClusterRoleSelector(Predicate<V1LabelSelectorBuilder> predicate);
  public interface ClusterRoleSelectorsNested<N> extends Nested<N>,V1LabelSelectorFluent<V1AggregationRuleFluent.ClusterRoleSelectorsNested<N>>{
    public N and();
    public N endClusterRoleSelector();
    
  }
  
}