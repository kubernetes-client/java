package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
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
public interface V1ScopeSelectorFluent<A extends io.kubernetes.client.openapi.models.V1ScopeSelectorFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public A addToMatchExpressions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item);
  public A setToMatchExpressions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item);
  public A addToMatchExpressions(io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement... items);
  public A addAllToMatchExpressions(java.util.Collection<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement> items);
  public A removeFromMatchExpressions(io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement... items);
  public A removeAllFromMatchExpressions(java.util.Collection<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement> items);
  public A removeMatchingFromMatchExpressions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildMatchExpressions instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement> getMatchExpressions();
  public java.util.List<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement> buildMatchExpressions();
  public io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement buildMatchExpression(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement buildFirstMatchExpression();
  public io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement buildLastMatchExpression();
  public io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement buildMatchingMatchExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder> predicate);
  public java.lang.Boolean hasMatchingMatchExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder> predicate);
  public A withMatchExpressions(java.util.List<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement> matchExpressions);
  public A withMatchExpressions(io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement... matchExpressions);
  public java.lang.Boolean hasMatchExpressions();
  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A> addNewMatchExpression();
  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A> addNewMatchExpressionLike(io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item);
  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A> setNewMatchExpressionLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item);
  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A> editMatchExpression(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A> editFirstMatchExpression();
  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A> editLastMatchExpression();
  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A> editMatchingMatchExpression(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder> predicate);
  public interface MatchExpressionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementFluent<io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<N>>{
    public N and();
    public N endMatchExpression();
    
  }
  
}