package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PodDisruptionBudgetSpecFluent<A extends V1PodDisruptionBudgetSpecFluent<A>> extends Fluent<A>{
  public IntOrString getMaxUnavailable();
  public A withMaxUnavailable(IntOrString maxUnavailable);
  public Boolean hasMaxUnavailable();
  public A withNewMaxUnavailable(int value);
  public A withNewMaxUnavailable(String value);
  public IntOrString getMinAvailable();
  public A withMinAvailable(IntOrString minAvailable);
  public Boolean hasMinAvailable();
  public A withNewMinAvailable(int value);
  public A withNewMinAvailable(String value);
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getSelector();
  public V1LabelSelector buildSelector();
  public A withSelector(V1LabelSelector selector);
  public Boolean hasSelector();
  public V1PodDisruptionBudgetSpecFluent.SelectorNested<A> withNewSelector();
  public V1PodDisruptionBudgetSpecFluent.SelectorNested<A> withNewSelectorLike(V1LabelSelector item);
  public V1PodDisruptionBudgetSpecFluent.SelectorNested<A> editSelector();
  public V1PodDisruptionBudgetSpecFluent.SelectorNested<A> editOrNewSelector();
  public V1PodDisruptionBudgetSpecFluent.SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item);
  public interface SelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1PodDisruptionBudgetSpecFluent.SelectorNested<N>>{
    public N and();
    public N endSelector();
    
  }
  
}