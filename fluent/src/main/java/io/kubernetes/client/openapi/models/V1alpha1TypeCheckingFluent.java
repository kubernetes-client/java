package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha1TypeCheckingFluent<A extends V1alpha1TypeCheckingFluent<A>> extends Fluent<A>{
  public A addToExpressionWarnings(int index,V1alpha1ExpressionWarning item);
  public A setToExpressionWarnings(int index,V1alpha1ExpressionWarning item);
  public A addToExpressionWarnings(io.kubernetes.client.openapi.models.V1alpha1ExpressionWarning... items);
  public A addAllToExpressionWarnings(Collection<V1alpha1ExpressionWarning> items);
  public A removeFromExpressionWarnings(io.kubernetes.client.openapi.models.V1alpha1ExpressionWarning... items);
  public A removeAllFromExpressionWarnings(Collection<V1alpha1ExpressionWarning> items);
  public A removeMatchingFromExpressionWarnings(Predicate<V1alpha1ExpressionWarningBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildExpressionWarnings instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha1ExpressionWarning> getExpressionWarnings();
  public List<V1alpha1ExpressionWarning> buildExpressionWarnings();
  public V1alpha1ExpressionWarning buildExpressionWarning(int index);
  public V1alpha1ExpressionWarning buildFirstExpressionWarning();
  public V1alpha1ExpressionWarning buildLastExpressionWarning();
  public V1alpha1ExpressionWarning buildMatchingExpressionWarning(Predicate<V1alpha1ExpressionWarningBuilder> predicate);
  public Boolean hasMatchingExpressionWarning(Predicate<V1alpha1ExpressionWarningBuilder> predicate);
  public A withExpressionWarnings(List<V1alpha1ExpressionWarning> expressionWarnings);
  public A withExpressionWarnings(io.kubernetes.client.openapi.models.V1alpha1ExpressionWarning... expressionWarnings);
  public Boolean hasExpressionWarnings();
  public V1alpha1TypeCheckingFluent.ExpressionWarningsNested<A> addNewExpressionWarning();
  public V1alpha1TypeCheckingFluent.ExpressionWarningsNested<A> addNewExpressionWarningLike(V1alpha1ExpressionWarning item);
  public V1alpha1TypeCheckingFluent.ExpressionWarningsNested<A> setNewExpressionWarningLike(int index,V1alpha1ExpressionWarning item);
  public V1alpha1TypeCheckingFluent.ExpressionWarningsNested<A> editExpressionWarning(int index);
  public V1alpha1TypeCheckingFluent.ExpressionWarningsNested<A> editFirstExpressionWarning();
  public V1alpha1TypeCheckingFluent.ExpressionWarningsNested<A> editLastExpressionWarning();
  public V1alpha1TypeCheckingFluent.ExpressionWarningsNested<A> editMatchingExpressionWarning(Predicate<V1alpha1ExpressionWarningBuilder> predicate);
  public interface ExpressionWarningsNested<N> extends Nested<N>,V1alpha1ExpressionWarningFluent<V1alpha1TypeCheckingFluent.ExpressionWarningsNested<N>>{
    public N and();
    public N endExpressionWarning();
    
  }
  
}