package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2MetricIdentifierFluent<A extends V2MetricIdentifierFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getSelector();
  public V1LabelSelector buildSelector();
  public A withSelector(V1LabelSelector selector);
  public Boolean hasSelector();
  public V2MetricIdentifierFluent.SelectorNested<A> withNewSelector();
  public V2MetricIdentifierFluent.SelectorNested<A> withNewSelectorLike(V1LabelSelector item);
  public V2MetricIdentifierFluent.SelectorNested<A> editSelector();
  public V2MetricIdentifierFluent.SelectorNested<A> editOrNewSelector();
  public V2MetricIdentifierFluent.SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item);
  public interface SelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V2MetricIdentifierFluent.SelectorNested<N>>{
    public N and();
    public N endSelector();
    
  }
  
}