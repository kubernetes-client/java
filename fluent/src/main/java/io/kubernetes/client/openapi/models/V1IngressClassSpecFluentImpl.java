package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1IngressClassSpecFluentImpl<A extends V1IngressClassSpecFluent<A>> extends BaseFluent<A> implements V1IngressClassSpecFluent<A>{
  public V1IngressClassSpecFluentImpl() {
  }
  public V1IngressClassSpecFluentImpl(V1IngressClassSpec instance) {
    this.withController(instance.getController());

    this.withParameters(instance.getParameters());

  }
  private String controller;
  private V1IngressClassParametersReferenceBuilder parameters;
  public String getController() {
    return this.controller;
  }
  public A withController(String controller) {
    this.controller=controller; return (A) this;
  }
  public Boolean hasController() {
    return this.controller != null;
  }
  
  /**
   * This method has been deprecated, please use method buildParameters instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1IngressClassParametersReference getParameters() {
    return this.parameters!=null ?this.parameters.build():null;
  }
  public V1IngressClassParametersReference buildParameters() {
    return this.parameters!=null ?this.parameters.build():null;
  }
  public A withParameters(V1IngressClassParametersReference parameters) {
    _visitables.get("parameters").remove(this.parameters);
    if (parameters!=null){ this.parameters= new V1IngressClassParametersReferenceBuilder(parameters); _visitables.get("parameters").add(this.parameters);} else { this.parameters = null; _visitables.get("parameters").remove(this.parameters); } return (A) this;
  }
  public Boolean hasParameters() {
    return this.parameters != null;
  }
  public V1IngressClassSpecFluent.ParametersNested<A> withNewParameters() {
    return new V1IngressClassSpecFluentImpl.ParametersNestedImpl();
  }
  public V1IngressClassSpecFluent.ParametersNested<A> withNewParametersLike(V1IngressClassParametersReference item) {
    return new V1IngressClassSpecFluentImpl.ParametersNestedImpl(item);
  }
  public V1IngressClassSpecFluent.ParametersNested<A> editParameters() {
    return withNewParametersLike(getParameters());
  }
  public V1IngressClassSpecFluent.ParametersNested<A> editOrNewParameters() {
    return withNewParametersLike(getParameters() != null ? getParameters(): new V1IngressClassParametersReferenceBuilder().build());
  }
  public V1IngressClassSpecFluent.ParametersNested<A> editOrNewParametersLike(V1IngressClassParametersReference item) {
    return withNewParametersLike(getParameters() != null ? getParameters(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1IngressClassSpecFluentImpl that = (V1IngressClassSpecFluentImpl) o;
    if (controller != null ? !controller.equals(that.controller) :that.controller != null) return false;
    if (parameters != null ? !parameters.equals(that.parameters) :that.parameters != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(controller,  parameters,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (controller != null) { sb.append("controller:"); sb.append(controller + ","); }
    if (parameters != null) { sb.append("parameters:"); sb.append(parameters); }
    sb.append("}");
    return sb.toString();
  }
  class ParametersNestedImpl<N> extends V1IngressClassParametersReferenceFluentImpl<V1IngressClassSpecFluent.ParametersNested<N>> implements V1IngressClassSpecFluent.ParametersNested<N>,Nested<N>{
    ParametersNestedImpl(V1IngressClassParametersReference item) {
      this.builder = new V1IngressClassParametersReferenceBuilder(this, item);
    }
    ParametersNestedImpl() {
      this.builder = new V1IngressClassParametersReferenceBuilder(this);
    }
    V1IngressClassParametersReferenceBuilder builder;
    public N and() {
      return (N) V1IngressClassSpecFluentImpl.this.withParameters(builder.build());
    }
    public N endParameters() {
      return and();
    }
    
  }
  
}