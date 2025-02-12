package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1JSONPatchBuilder extends V1alpha1JSONPatchFluent<V1alpha1JSONPatchBuilder> implements VisitableBuilder<V1alpha1JSONPatch,V1alpha1JSONPatchBuilder>{
  public V1alpha1JSONPatchBuilder() {
    this(new V1alpha1JSONPatch());
  }
  
  public V1alpha1JSONPatchBuilder(V1alpha1JSONPatchFluent<?> fluent) {
    this(fluent, new V1alpha1JSONPatch());
  }
  
  public V1alpha1JSONPatchBuilder(V1alpha1JSONPatchFluent<?> fluent,V1alpha1JSONPatch instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1JSONPatchBuilder(V1alpha1JSONPatch instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1JSONPatchFluent<?> fluent;
  
  public V1alpha1JSONPatch build() {
    V1alpha1JSONPatch buildable = new V1alpha1JSONPatch();
    buildable.setExpression(fluent.getExpression());
    return buildable;
  }
  

}