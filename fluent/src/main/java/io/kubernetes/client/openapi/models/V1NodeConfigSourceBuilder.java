package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NodeConfigSourceBuilder extends V1NodeConfigSourceFluentImpl<V1NodeConfigSourceBuilder> implements VisitableBuilder<V1NodeConfigSource,V1NodeConfigSourceBuilder>{
  public V1NodeConfigSourceBuilder() {
    this(false);
  }
  public V1NodeConfigSourceBuilder(Boolean validationEnabled) {
    this(new V1NodeConfigSource(), validationEnabled);
  }
  public V1NodeConfigSourceBuilder(V1NodeConfigSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NodeConfigSourceBuilder(V1NodeConfigSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NodeConfigSource(), validationEnabled);
  }
  public V1NodeConfigSourceBuilder(V1NodeConfigSourceFluent<?> fluent,V1NodeConfigSource instance) {
    this(fluent, instance, false);
  }
  public V1NodeConfigSourceBuilder(V1NodeConfigSourceFluent<?> fluent,V1NodeConfigSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConfigMap(instance.getConfigMap());

    this.validationEnabled = validationEnabled; 
  }
  public V1NodeConfigSourceBuilder(V1NodeConfigSource instance) {
    this(instance,false);
  }
  public V1NodeConfigSourceBuilder(V1NodeConfigSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConfigMap(instance.getConfigMap());

    this.validationEnabled = validationEnabled; 
  }
  V1NodeConfigSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1NodeConfigSource build() {
    V1NodeConfigSource buildable = new V1NodeConfigSource();
    buildable.setConfigMap(fluent.getConfigMap());
    return buildable;
  }
  
}