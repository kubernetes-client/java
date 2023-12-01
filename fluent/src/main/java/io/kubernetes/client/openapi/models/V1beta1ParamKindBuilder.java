package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ParamKindBuilder extends V1beta1ParamKindFluent<V1beta1ParamKindBuilder> implements VisitableBuilder<V1beta1ParamKind,V1beta1ParamKindBuilder>{
  public V1beta1ParamKindBuilder() {
    this(new V1beta1ParamKind());
  }
  
  public V1beta1ParamKindBuilder(V1beta1ParamKindFluent<?> fluent) {
    this(fluent, new V1beta1ParamKind());
  }
  
  public V1beta1ParamKindBuilder(V1beta1ParamKindFluent<?> fluent,V1beta1ParamKind instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ParamKindBuilder(V1beta1ParamKind instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ParamKindFluent<?> fluent;
  
  public V1beta1ParamKind build() {
    V1beta1ParamKind buildable = new V1beta1ParamKind();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    return buildable;
  }
  

}