package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ParamRefBuilder extends V1beta1ParamRefFluent<V1beta1ParamRefBuilder> implements VisitableBuilder<V1beta1ParamRef,V1beta1ParamRefBuilder>{
  public V1beta1ParamRefBuilder() {
    this(new V1beta1ParamRef());
  }
  
  public V1beta1ParamRefBuilder(V1beta1ParamRefFluent<?> fluent) {
    this(fluent, new V1beta1ParamRef());
  }
  
  public V1beta1ParamRefBuilder(V1beta1ParamRefFluent<?> fluent,V1beta1ParamRef instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ParamRefBuilder(V1beta1ParamRef instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ParamRefFluent<?> fluent;
  
  public V1beta1ParamRef build() {
    V1beta1ParamRef buildable = new V1beta1ParamRef();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setParameterNotFoundAction(fluent.getParameterNotFoundAction());
    buildable.setSelector(fluent.buildSelector());
    return buildable;
  }
  

}