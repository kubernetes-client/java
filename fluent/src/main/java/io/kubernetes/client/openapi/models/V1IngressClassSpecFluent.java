package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1IngressClassSpecFluent<A extends io.kubernetes.client.openapi.models.V1IngressClassSpecFluent<A>> extends BaseFluent<A>{

  private String controller;
  private V1IngressClassParametersReferenceBuilder parameters;

  public V1IngressClassSpecFluent() {
  }
  
  public V1IngressClassSpecFluent(V1IngressClassSpec instance) {
    this.copyInstance(instance);
  }

  public V1IngressClassParametersReference buildParameters() {
    return this.parameters != null ? this.parameters.build() : null;
  }
  
  protected void copyInstance(V1IngressClassSpec instance) {
    instance = instance != null ? instance : new V1IngressClassSpec();
    if (instance != null) {
        this.withController(instance.getController());
        this.withParameters(instance.getParameters());
    }
  }
  
  public ParametersNested<A> editOrNewParameters() {
    return this.withNewParametersLike(Optional.ofNullable(this.buildParameters()).orElse(new V1IngressClassParametersReferenceBuilder().build()));
  }
  
  public ParametersNested<A> editOrNewParametersLike(V1IngressClassParametersReference item) {
    return this.withNewParametersLike(Optional.ofNullable(this.buildParameters()).orElse(item));
  }
  
  public ParametersNested<A> editParameters() {
    return this.withNewParametersLike(Optional.ofNullable(this.buildParameters()).orElse(null));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1IngressClassSpecFluent that = (V1IngressClassSpecFluent) o;
    if (!(Objects.equals(controller, that.controller))) {
      return false;
    }
    if (!(Objects.equals(parameters, that.parameters))) {
      return false;
    }
    return true;
  }
  
  public String getController() {
    return this.controller;
  }
  
  public boolean hasController() {
    return this.controller != null;
  }
  
  public boolean hasParameters() {
    return this.parameters != null;
  }
  
  public int hashCode() {
    return Objects.hash(controller, parameters);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(controller == null)) {
        sb.append("controller:");
        sb.append(controller);
        sb.append(",");
    }
    if (!(parameters == null)) {
        sb.append("parameters:");
        sb.append(parameters);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withController(String controller) {
    this.controller = controller;
    return (A) this;
  }
  
  public ParametersNested<A> withNewParameters() {
    return new ParametersNested(null);
  }
  
  public ParametersNested<A> withNewParametersLike(V1IngressClassParametersReference item) {
    return new ParametersNested(item);
  }
  
  public A withParameters(V1IngressClassParametersReference parameters) {
    this._visitables.remove("parameters");
    if (parameters != null) {
        this.parameters = new V1IngressClassParametersReferenceBuilder(parameters);
        this._visitables.get("parameters").add(this.parameters);
    } else {
        this.parameters = null;
        this._visitables.get("parameters").remove(this.parameters);
    }
    return (A) this;
  }
  public class ParametersNested<N> extends V1IngressClassParametersReferenceFluent<ParametersNested<N>> implements Nested<N>{
  
    V1IngressClassParametersReferenceBuilder builder;
  
    ParametersNested(V1IngressClassParametersReference item) {
      this.builder = new V1IngressClassParametersReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1IngressClassSpecFluent.this.withParameters(builder.build());
    }
    
    public N endParameters() {
      return and();
    }
    
  }
}