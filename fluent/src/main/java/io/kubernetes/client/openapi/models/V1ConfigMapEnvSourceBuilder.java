package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ConfigMapEnvSourceBuilder extends V1ConfigMapEnvSourceFluentImpl<V1ConfigMapEnvSourceBuilder> implements VisitableBuilder<V1ConfigMapEnvSource,V1ConfigMapEnvSourceBuilder>{
  public V1ConfigMapEnvSourceBuilder() {
    this(false);
  }
  public V1ConfigMapEnvSourceBuilder(Boolean validationEnabled) {
    this(new V1ConfigMapEnvSource(), validationEnabled);
  }
  public V1ConfigMapEnvSourceBuilder(V1ConfigMapEnvSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ConfigMapEnvSourceBuilder(V1ConfigMapEnvSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ConfigMapEnvSource(), validationEnabled);
  }
  public V1ConfigMapEnvSourceBuilder(V1ConfigMapEnvSourceFluent<?> fluent,V1ConfigMapEnvSource instance) {
    this(fluent, instance, false);
  }
  public V1ConfigMapEnvSourceBuilder(V1ConfigMapEnvSourceFluent<?> fluent,V1ConfigMapEnvSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled; 
  }
  public V1ConfigMapEnvSourceBuilder(V1ConfigMapEnvSource instance) {
    this(instance,false);
  }
  public V1ConfigMapEnvSourceBuilder(V1ConfigMapEnvSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled; 
  }
  V1ConfigMapEnvSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1ConfigMapEnvSource build() {
    V1ConfigMapEnvSource buildable = new V1ConfigMapEnvSource();
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  
}