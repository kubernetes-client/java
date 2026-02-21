package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1alpha1PodGroupBuilder extends V1alpha1PodGroupFluent<V1alpha1PodGroupBuilder> implements VisitableBuilder<V1alpha1PodGroup,V1alpha1PodGroupBuilder>{

  V1alpha1PodGroupFluent<?> fluent;

  public V1alpha1PodGroupBuilder() {
    this(new V1alpha1PodGroup());
  }
  
  public V1alpha1PodGroupBuilder(V1alpha1PodGroupFluent<?> fluent) {
    this(fluent, new V1alpha1PodGroup());
  }
  
  public V1alpha1PodGroupBuilder(V1alpha1PodGroup instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1PodGroupBuilder(V1alpha1PodGroupFluent<?> fluent,V1alpha1PodGroup instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1PodGroup build() {
    V1alpha1PodGroup buildable = new V1alpha1PodGroup();
    buildable.setName(fluent.getName());
    buildable.setPolicy(fluent.buildPolicy());
    return buildable;
  }
  
}