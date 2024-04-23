package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SelectableFieldBuilder extends V1SelectableFieldFluent<V1SelectableFieldBuilder> implements VisitableBuilder<V1SelectableField,V1SelectableFieldBuilder>{
  public V1SelectableFieldBuilder() {
    this(new V1SelectableField());
  }
  
  public V1SelectableFieldBuilder(V1SelectableFieldFluent<?> fluent) {
    this(fluent, new V1SelectableField());
  }
  
  public V1SelectableFieldBuilder(V1SelectableFieldFluent<?> fluent,V1SelectableField instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SelectableFieldBuilder(V1SelectableField instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SelectableFieldFluent<?> fluent;
  
  public V1SelectableField build() {
    V1SelectableField buildable = new V1SelectableField();
    buildable.setJsonPath(fluent.getJsonPath());
    return buildable;
  }
  

}