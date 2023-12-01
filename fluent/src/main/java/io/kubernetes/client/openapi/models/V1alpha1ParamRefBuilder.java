package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ParamRefBuilder extends V1alpha1ParamRefFluent<V1alpha1ParamRefBuilder> implements VisitableBuilder<V1alpha1ParamRef,V1alpha1ParamRefBuilder>{
  public V1alpha1ParamRefBuilder() {
    this(new V1alpha1ParamRef());
  }
  
  public V1alpha1ParamRefBuilder(V1alpha1ParamRefFluent<?> fluent) {
    this(fluent, new V1alpha1ParamRef());
  }
  
  public V1alpha1ParamRefBuilder(V1alpha1ParamRefFluent<?> fluent,V1alpha1ParamRef instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ParamRefBuilder(V1alpha1ParamRef instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ParamRefFluent<?> fluent;
  
  public V1alpha1ParamRef build() {
    V1alpha1ParamRef buildable = new V1alpha1ParamRef();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setParameterNotFoundAction(fluent.getParameterNotFoundAction());
    buildable.setSelector(fluent.buildSelector());
    return buildable;
  }
  

}