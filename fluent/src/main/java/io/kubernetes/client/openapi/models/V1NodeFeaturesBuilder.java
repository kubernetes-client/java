package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NodeFeaturesBuilder extends V1NodeFeaturesFluent<V1NodeFeaturesBuilder> implements VisitableBuilder<V1NodeFeatures,V1NodeFeaturesBuilder>{
  public V1NodeFeaturesBuilder() {
    this(new V1NodeFeatures());
  }
  
  public V1NodeFeaturesBuilder(V1NodeFeaturesFluent<?> fluent) {
    this(fluent, new V1NodeFeatures());
  }
  
  public V1NodeFeaturesBuilder(V1NodeFeaturesFluent<?> fluent,V1NodeFeatures instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NodeFeaturesBuilder(V1NodeFeatures instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NodeFeaturesFluent<?> fluent;
  
  public V1NodeFeatures build() {
    V1NodeFeatures buildable = new V1NodeFeatures();
    buildable.setSupplementalGroupsPolicy(fluent.getSupplementalGroupsPolicy());
    return buildable;
  }
  

}