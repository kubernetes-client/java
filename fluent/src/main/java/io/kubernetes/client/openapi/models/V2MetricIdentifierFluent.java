package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2MetricIdentifierFluent<A extends io.kubernetes.client.openapi.models.V2MetricIdentifierFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getSelector();
  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector();
  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector);
  public java.lang.Boolean hasSelector();
  public io.kubernetes.client.openapi.models.V2MetricIdentifierFluent.SelectorNested<A> withNewSelector();
  public io.kubernetes.client.openapi.models.V2MetricIdentifierFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public io.kubernetes.client.openapi.models.V2MetricIdentifierFluent.SelectorNested<A> editSelector();
  public io.kubernetes.client.openapi.models.V2MetricIdentifierFluent.SelectorNested<A> editOrNewSelector();
  public io.kubernetes.client.openapi.models.V2MetricIdentifierFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public interface SelectorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorFluent<io.kubernetes.client.openapi.models.V2MetricIdentifierFluent.SelectorNested<N>>{
    public N and();
    public N endSelector();
    
  }
  
}