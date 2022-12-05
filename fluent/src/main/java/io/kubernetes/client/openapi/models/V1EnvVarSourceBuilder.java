package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1EnvVarSourceBuilder extends V1EnvVarSourceFluentImpl<V1EnvVarSourceBuilder> implements VisitableBuilder<V1EnvVarSource,V1EnvVarSourceBuilder>{
  public V1EnvVarSourceBuilder() {
    this(false);
  }
  public V1EnvVarSourceBuilder(Boolean validationEnabled) {
    this(new V1EnvVarSource(), validationEnabled);
  }
  public V1EnvVarSourceBuilder(V1EnvVarSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EnvVarSourceBuilder(V1EnvVarSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1EnvVarSource(), validationEnabled);
  }
  public V1EnvVarSourceBuilder(V1EnvVarSourceFluent<?> fluent,V1EnvVarSource instance) {
    this(fluent, instance, false);
  }
  public V1EnvVarSourceBuilder(V1EnvVarSourceFluent<?> fluent,V1EnvVarSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConfigMapKeyRef(instance.getConfigMapKeyRef());

    fluent.withFieldRef(instance.getFieldRef());

    fluent.withResourceFieldRef(instance.getResourceFieldRef());

    fluent.withSecretKeyRef(instance.getSecretKeyRef());

    this.validationEnabled = validationEnabled; 
  }
  public V1EnvVarSourceBuilder(V1EnvVarSource instance) {
    this(instance,false);
  }
  public V1EnvVarSourceBuilder(V1EnvVarSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConfigMapKeyRef(instance.getConfigMapKeyRef());

    this.withFieldRef(instance.getFieldRef());

    this.withResourceFieldRef(instance.getResourceFieldRef());

    this.withSecretKeyRef(instance.getSecretKeyRef());

    this.validationEnabled = validationEnabled; 
  }
  V1EnvVarSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1EnvVarSource build() {
    V1EnvVarSource buildable = new V1EnvVarSource();
    buildable.setConfigMapKeyRef(fluent.getConfigMapKeyRef());
    buildable.setFieldRef(fluent.getFieldRef());
    buildable.setResourceFieldRef(fluent.getResourceFieldRef());
    buildable.setSecretKeyRef(fluent.getSecretKeyRef());
    return buildable;
  }
  
}