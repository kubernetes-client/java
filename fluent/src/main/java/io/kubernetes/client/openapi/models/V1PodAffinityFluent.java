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
public interface V1PodAffinityFluent<A extends V1PodAffinityFluent<A>> extends Fluent<A>{
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(Integer index,V1WeightedPodAffinityTerm item);
  public A setToPreferredDuringSchedulingIgnoredDuringExecution(Integer index,V1WeightedPodAffinityTerm item);
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... items);
  public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(Collection<V1WeightedPodAffinityTerm> items);
  public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... items);
  public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(Collection<V1WeightedPodAffinityTerm> items);
  public A removeMatchingFromPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1WeightedPodAffinityTermBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildPreferredDuringSchedulingIgnoredDuringExecution instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1WeightedPodAffinityTerm> getPreferredDuringSchedulingIgnoredDuringExecution();
  public List<V1WeightedPodAffinityTerm> buildPreferredDuringSchedulingIgnoredDuringExecution();
  public V1WeightedPodAffinityTerm buildPreferredDuringSchedulingIgnoredDuringExecution(Integer index);
  public V1WeightedPodAffinityTerm buildFirstPreferredDuringSchedulingIgnoredDuringExecution();
  public V1WeightedPodAffinityTerm buildLastPreferredDuringSchedulingIgnoredDuringExecution();
  public V1WeightedPodAffinityTerm buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1WeightedPodAffinityTermBuilder> predicate);
  public Boolean hasMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1WeightedPodAffinityTermBuilder> predicate);
  public A withPreferredDuringSchedulingIgnoredDuringExecution(List<V1WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution);
  public A withPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... preferredDuringSchedulingIgnoredDuringExecution);
  public Boolean hasPreferredDuringSchedulingIgnoredDuringExecution();
  public V1PodAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecution();
  public V1PodAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(V1WeightedPodAffinityTerm item);
  public V1PodAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(Integer index,V1WeightedPodAffinityTerm item);
  public V1PodAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editPreferredDuringSchedulingIgnoredDuringExecution(Integer index);
  public V1PodAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstPreferredDuringSchedulingIgnoredDuringExecution();
  public V1PodAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editLastPreferredDuringSchedulingIgnoredDuringExecution();
  public V1PodAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1WeightedPodAffinityTermBuilder> predicate);
  public A addToRequiredDuringSchedulingIgnoredDuringExecution(Integer index,V1PodAffinityTerm item);
  public A setToRequiredDuringSchedulingIgnoredDuringExecution(Integer index,V1PodAffinityTerm item);
  public A addToRequiredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PodAffinityTerm... items);
  public A addAllToRequiredDuringSchedulingIgnoredDuringExecution(Collection<V1PodAffinityTerm> items);
  public A removeFromRequiredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PodAffinityTerm... items);
  public A removeAllFromRequiredDuringSchedulingIgnoredDuringExecution(Collection<V1PodAffinityTerm> items);
  public A removeMatchingFromRequiredDuringSchedulingIgnoredDuringExecution(Predicate<V1PodAffinityTermBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildRequiredDuringSchedulingIgnoredDuringExecution instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PodAffinityTerm> getRequiredDuringSchedulingIgnoredDuringExecution();
  public List<V1PodAffinityTerm> buildRequiredDuringSchedulingIgnoredDuringExecution();
  public V1PodAffinityTerm buildRequiredDuringSchedulingIgnoredDuringExecution(Integer index);
  public V1PodAffinityTerm buildFirstRequiredDuringSchedulingIgnoredDuringExecution();
  public V1PodAffinityTerm buildLastRequiredDuringSchedulingIgnoredDuringExecution();
  public V1PodAffinityTerm buildMatchingRequiredDuringSchedulingIgnoredDuringExecution(Predicate<V1PodAffinityTermBuilder> predicate);
  public Boolean hasMatchingRequiredDuringSchedulingIgnoredDuringExecution(Predicate<V1PodAffinityTermBuilder> predicate);
  public A withRequiredDuringSchedulingIgnoredDuringExecution(List<V1PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution);
  public A withRequiredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PodAffinityTerm... requiredDuringSchedulingIgnoredDuringExecution);
  public Boolean hasRequiredDuringSchedulingIgnoredDuringExecution();
  public V1PodAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> addNewRequiredDuringSchedulingIgnoredDuringExecution();
  public V1PodAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> addNewRequiredDuringSchedulingIgnoredDuringExecutionLike(V1PodAffinityTerm item);
  public V1PodAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(Integer index,V1PodAffinityTerm item);
  public V1PodAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editRequiredDuringSchedulingIgnoredDuringExecution(Integer index);
  public V1PodAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstRequiredDuringSchedulingIgnoredDuringExecution();
  public V1PodAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editLastRequiredDuringSchedulingIgnoredDuringExecution();
  public V1PodAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingRequiredDuringSchedulingIgnoredDuringExecution(Predicate<V1PodAffinityTermBuilder> predicate);
  public interface PreferredDuringSchedulingIgnoredDuringExecutionNested<N> extends Nested<N>,V1WeightedPodAffinityTermFluent<V1PodAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>>{
    public N and();
    public N endPreferredDuringSchedulingIgnoredDuringExecution();
    
  }
  public interface RequiredDuringSchedulingIgnoredDuringExecutionNested<N> extends Nested<N>,V1PodAffinityTermFluent<V1PodAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>>{
    public N and();
    public N endRequiredDuringSchedulingIgnoredDuringExecution();
    
  }
  
}