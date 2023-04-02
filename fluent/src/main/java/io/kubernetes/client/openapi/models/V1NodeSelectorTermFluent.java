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
public interface V1NodeSelectorTermFluent<A extends V1NodeSelectorTermFluent<A>> extends Fluent<A>{
  public A addToMatchExpressions(Integer index,V1NodeSelectorRequirement item);
  public A setToMatchExpressions(Integer index,V1NodeSelectorRequirement item);
  public A addToMatchExpressions(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... items);
  public A addAllToMatchExpressions(Collection<V1NodeSelectorRequirement> items);
  public A removeFromMatchExpressions(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... items);
  public A removeAllFromMatchExpressions(Collection<V1NodeSelectorRequirement> items);
  public A removeMatchingFromMatchExpressions(Predicate<V1NodeSelectorRequirementBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildMatchExpressions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NodeSelectorRequirement> getMatchExpressions();
  public List<V1NodeSelectorRequirement> buildMatchExpressions();
  public V1NodeSelectorRequirement buildMatchExpression(Integer index);
  public V1NodeSelectorRequirement buildFirstMatchExpression();
  public V1NodeSelectorRequirement buildLastMatchExpression();
  public V1NodeSelectorRequirement buildMatchingMatchExpression(Predicate<V1NodeSelectorRequirementBuilder> predicate);
  public Boolean hasMatchingMatchExpression(Predicate<V1NodeSelectorRequirementBuilder> predicate);
  public A withMatchExpressions(List<V1NodeSelectorRequirement> matchExpressions);
  public A withMatchExpressions(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... matchExpressions);
  public Boolean hasMatchExpressions();
  public V1NodeSelectorTermFluent.MatchExpressionsNested<A> addNewMatchExpression();
  public V1NodeSelectorTermFluent.MatchExpressionsNested<A> addNewMatchExpressionLike(V1NodeSelectorRequirement item);
  public V1NodeSelectorTermFluent.MatchExpressionsNested<A> setNewMatchExpressionLike(Integer index,V1NodeSelectorRequirement item);
  public V1NodeSelectorTermFluent.MatchExpressionsNested<A> editMatchExpression(Integer index);
  public V1NodeSelectorTermFluent.MatchExpressionsNested<A> editFirstMatchExpression();
  public V1NodeSelectorTermFluent.MatchExpressionsNested<A> editLastMatchExpression();
  public V1NodeSelectorTermFluent.MatchExpressionsNested<A> editMatchingMatchExpression(Predicate<V1NodeSelectorRequirementBuilder> predicate);
  public A addToMatchFields(Integer index,V1NodeSelectorRequirement item);
  public A setToMatchFields(Integer index,V1NodeSelectorRequirement item);
  public A addToMatchFields(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... items);
  public A addAllToMatchFields(Collection<V1NodeSelectorRequirement> items);
  public A removeFromMatchFields(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... items);
  public A removeAllFromMatchFields(Collection<V1NodeSelectorRequirement> items);
  public A removeMatchingFromMatchFields(Predicate<V1NodeSelectorRequirementBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildMatchFields instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NodeSelectorRequirement> getMatchFields();
  public List<V1NodeSelectorRequirement> buildMatchFields();
  public V1NodeSelectorRequirement buildMatchField(Integer index);
  public V1NodeSelectorRequirement buildFirstMatchField();
  public V1NodeSelectorRequirement buildLastMatchField();
  public V1NodeSelectorRequirement buildMatchingMatchField(Predicate<V1NodeSelectorRequirementBuilder> predicate);
  public Boolean hasMatchingMatchField(Predicate<V1NodeSelectorRequirementBuilder> predicate);
  public A withMatchFields(List<V1NodeSelectorRequirement> matchFields);
  public A withMatchFields(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... matchFields);
  public Boolean hasMatchFields();
  public V1NodeSelectorTermFluent.MatchFieldsNested<A> addNewMatchField();
  public V1NodeSelectorTermFluent.MatchFieldsNested<A> addNewMatchFieldLike(V1NodeSelectorRequirement item);
  public V1NodeSelectorTermFluent.MatchFieldsNested<A> setNewMatchFieldLike(Integer index,V1NodeSelectorRequirement item);
  public V1NodeSelectorTermFluent.MatchFieldsNested<A> editMatchField(Integer index);
  public V1NodeSelectorTermFluent.MatchFieldsNested<A> editFirstMatchField();
  public V1NodeSelectorTermFluent.MatchFieldsNested<A> editLastMatchField();
  public V1NodeSelectorTermFluent.MatchFieldsNested<A> editMatchingMatchField(Predicate<V1NodeSelectorRequirementBuilder> predicate);
  public interface MatchExpressionsNested<N> extends Nested<N>,V1NodeSelectorRequirementFluent<V1NodeSelectorTermFluent.MatchExpressionsNested<N>>{
    public N and();
    public N endMatchExpression();
    
  }
  public interface MatchFieldsNested<N> extends Nested<N>,V1NodeSelectorRequirementFluent<V1NodeSelectorTermFluent.MatchFieldsNested<N>>{
    public N and();
    public N endMatchField();
    
  }
  
}