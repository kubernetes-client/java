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
public interface V1ScopeSelectorFluent<A extends V1ScopeSelectorFluent<A>> extends Fluent<A>{
  public A addToMatchExpressions(Integer index,V1ScopedResourceSelectorRequirement item);
  public A setToMatchExpressions(Integer index,V1ScopedResourceSelectorRequirement item);
  public A addToMatchExpressions(io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement... items);
  public A addAllToMatchExpressions(Collection<V1ScopedResourceSelectorRequirement> items);
  public A removeFromMatchExpressions(io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement... items);
  public A removeAllFromMatchExpressions(Collection<V1ScopedResourceSelectorRequirement> items);
  public A removeMatchingFromMatchExpressions(Predicate<V1ScopedResourceSelectorRequirementBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildMatchExpressions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ScopedResourceSelectorRequirement> getMatchExpressions();
  public List<V1ScopedResourceSelectorRequirement> buildMatchExpressions();
  public V1ScopedResourceSelectorRequirement buildMatchExpression(Integer index);
  public V1ScopedResourceSelectorRequirement buildFirstMatchExpression();
  public V1ScopedResourceSelectorRequirement buildLastMatchExpression();
  public V1ScopedResourceSelectorRequirement buildMatchingMatchExpression(Predicate<V1ScopedResourceSelectorRequirementBuilder> predicate);
  public Boolean hasMatchingMatchExpression(Predicate<V1ScopedResourceSelectorRequirementBuilder> predicate);
  public A withMatchExpressions(List<V1ScopedResourceSelectorRequirement> matchExpressions);
  public A withMatchExpressions(io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement... matchExpressions);
  public Boolean hasMatchExpressions();
  public V1ScopeSelectorFluent.MatchExpressionsNested<A> addNewMatchExpression();
  public V1ScopeSelectorFluent.MatchExpressionsNested<A> addNewMatchExpressionLike(V1ScopedResourceSelectorRequirement item);
  public V1ScopeSelectorFluent.MatchExpressionsNested<A> setNewMatchExpressionLike(Integer index,V1ScopedResourceSelectorRequirement item);
  public V1ScopeSelectorFluent.MatchExpressionsNested<A> editMatchExpression(Integer index);
  public V1ScopeSelectorFluent.MatchExpressionsNested<A> editFirstMatchExpression();
  public V1ScopeSelectorFluent.MatchExpressionsNested<A> editLastMatchExpression();
  public V1ScopeSelectorFluent.MatchExpressionsNested<A> editMatchingMatchExpression(Predicate<V1ScopedResourceSelectorRequirementBuilder> predicate);
  public interface MatchExpressionsNested<N> extends Nested<N>,V1ScopedResourceSelectorRequirementFluent<V1ScopeSelectorFluent.MatchExpressionsNested<N>>{
    public N and();
    public N endMatchExpression();
    
  }
  
}