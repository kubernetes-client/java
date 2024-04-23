package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NodeRuntimeHandlerFeaturesBuilder extends V1NodeRuntimeHandlerFeaturesFluent<V1NodeRuntimeHandlerFeaturesBuilder> implements VisitableBuilder<V1NodeRuntimeHandlerFeatures,V1NodeRuntimeHandlerFeaturesBuilder>{
  public V1NodeRuntimeHandlerFeaturesBuilder() {
    this(new V1NodeRuntimeHandlerFeatures());
  }
  
  public V1NodeRuntimeHandlerFeaturesBuilder(V1NodeRuntimeHandlerFeaturesFluent<?> fluent) {
    this(fluent, new V1NodeRuntimeHandlerFeatures());
  }
  
  public V1NodeRuntimeHandlerFeaturesBuilder(V1NodeRuntimeHandlerFeaturesFluent<?> fluent,V1NodeRuntimeHandlerFeatures instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NodeRuntimeHandlerFeaturesBuilder(V1NodeRuntimeHandlerFeatures instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NodeRuntimeHandlerFeaturesFluent<?> fluent;
  
  public V1NodeRuntimeHandlerFeatures build() {
    V1NodeRuntimeHandlerFeatures buildable = new V1NodeRuntimeHandlerFeatures();
    buildable.setRecursiveReadOnlyMounts(fluent.getRecursiveReadOnlyMounts());
    return buildable;
  }
  

}