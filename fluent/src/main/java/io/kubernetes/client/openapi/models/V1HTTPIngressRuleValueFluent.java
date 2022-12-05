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
public interface V1HTTPIngressRuleValueFluent<A extends V1HTTPIngressRuleValueFluent<A>> extends Fluent<A>{
  public A addToPaths(Integer index,V1HTTPIngressPath item);
  public A setToPaths(Integer index,V1HTTPIngressPath item);
  public A addToPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... items);
  public A addAllToPaths(Collection<V1HTTPIngressPath> items);
  public A removeFromPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... items);
  public A removeAllFromPaths(Collection<V1HTTPIngressPath> items);
  public A removeMatchingFromPaths(Predicate<V1HTTPIngressPathBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildPaths instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1HTTPIngressPath> getPaths();
  public List<V1HTTPIngressPath> buildPaths();
  public V1HTTPIngressPath buildPath(Integer index);
  public V1HTTPIngressPath buildFirstPath();
  public V1HTTPIngressPath buildLastPath();
  public V1HTTPIngressPath buildMatchingPath(Predicate<V1HTTPIngressPathBuilder> predicate);
  public Boolean hasMatchingPath(Predicate<V1HTTPIngressPathBuilder> predicate);
  public A withPaths(List<V1HTTPIngressPath> paths);
  public A withPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... paths);
  public Boolean hasPaths();
  public V1HTTPIngressRuleValueFluent.PathsNested<A> addNewPath();
  public V1HTTPIngressRuleValueFluent.PathsNested<A> addNewPathLike(V1HTTPIngressPath item);
  public V1HTTPIngressRuleValueFluent.PathsNested<A> setNewPathLike(Integer index,V1HTTPIngressPath item);
  public V1HTTPIngressRuleValueFluent.PathsNested<A> editPath(Integer index);
  public V1HTTPIngressRuleValueFluent.PathsNested<A> editFirstPath();
  public V1HTTPIngressRuleValueFluent.PathsNested<A> editLastPath();
  public V1HTTPIngressRuleValueFluent.PathsNested<A> editMatchingPath(Predicate<V1HTTPIngressPathBuilder> predicate);
  public interface PathsNested<N> extends Nested<N>,V1HTTPIngressPathFluent<V1HTTPIngressRuleValueFluent.PathsNested<N>>{
    public N and();
    public N endPath();
    
  }
  
}