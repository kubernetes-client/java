package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1JSONPatchBuilder extends V1beta1JSONPatchFluent<V1beta1JSONPatchBuilder> implements VisitableBuilder<V1beta1JSONPatch,V1beta1JSONPatchBuilder>{
  public V1beta1JSONPatchBuilder() {
    this(new V1beta1JSONPatch());
  }
  
  public V1beta1JSONPatchBuilder(V1beta1JSONPatchFluent<?> fluent) {
    this(fluent, new V1beta1JSONPatch());
  }
  
  public V1beta1JSONPatchBuilder(V1beta1JSONPatchFluent<?> fluent,V1beta1JSONPatch instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1JSONPatchBuilder(V1beta1JSONPatch instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1JSONPatchFluent<?> fluent;
  
  public V1beta1JSONPatch build() {
    V1beta1JSONPatch buildable = new V1beta1JSONPatch();
    buildable.setExpression(fluent.getExpression());
    return buildable;
  }
  

}