package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ParamRefBuilder extends V1ParamRefFluent<V1ParamRefBuilder> implements VisitableBuilder<V1ParamRef,V1ParamRefBuilder>{
  public V1ParamRefBuilder() {
    this(new V1ParamRef());
  }
  
  public V1ParamRefBuilder(V1ParamRefFluent<?> fluent) {
    this(fluent, new V1ParamRef());
  }
  
  public V1ParamRefBuilder(V1ParamRefFluent<?> fluent,V1ParamRef instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ParamRefBuilder(V1ParamRef instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ParamRefFluent<?> fluent;
  
  public V1ParamRef build() {
    V1ParamRef buildable = new V1ParamRef();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setParameterNotFoundAction(fluent.getParameterNotFoundAction());
    buildable.setSelector(fluent.buildSelector());
    return buildable;
  }
  

}