package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ParamKindBuilder extends V1alpha1ParamKindFluent<V1alpha1ParamKindBuilder> implements VisitableBuilder<V1alpha1ParamKind,V1alpha1ParamKindBuilder>{
  public V1alpha1ParamKindBuilder() {
    this(new V1alpha1ParamKind());
  }
  
  public V1alpha1ParamKindBuilder(V1alpha1ParamKindFluent<?> fluent) {
    this(fluent, new V1alpha1ParamKind());
  }
  
  public V1alpha1ParamKindBuilder(V1alpha1ParamKindFluent<?> fluent,V1alpha1ParamKind instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ParamKindBuilder(V1alpha1ParamKind instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ParamKindFluent<?> fluent;
  
  public V1alpha1ParamKind build() {
    V1alpha1ParamKind buildable = new V1alpha1ParamKind();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    return buildable;
  }
  

}