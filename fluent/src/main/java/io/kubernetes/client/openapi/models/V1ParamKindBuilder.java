package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ParamKindBuilder extends V1ParamKindFluent<V1ParamKindBuilder> implements VisitableBuilder<V1ParamKind,V1ParamKindBuilder>{
  public V1ParamKindBuilder() {
    this(new V1ParamKind());
  }
  
  public V1ParamKindBuilder(V1ParamKindFluent<?> fluent) {
    this(fluent, new V1ParamKind());
  }
  
  public V1ParamKindBuilder(V1ParamKindFluent<?> fluent,V1ParamKind instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ParamKindBuilder(V1ParamKind instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ParamKindFluent<?> fluent;
  
  public V1ParamKind build() {
    V1ParamKind buildable = new V1ParamKind();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    return buildable;
  }
  

}