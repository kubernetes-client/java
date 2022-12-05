package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SecretEnvSourceBuilder extends V1SecretEnvSourceFluentImpl<V1SecretEnvSourceBuilder> implements VisitableBuilder<V1SecretEnvSource,V1SecretEnvSourceBuilder>{
  public V1SecretEnvSourceBuilder() {
    this(false);
  }
  public V1SecretEnvSourceBuilder(Boolean validationEnabled) {
    this(new V1SecretEnvSource(), validationEnabled);
  }
  public V1SecretEnvSourceBuilder(V1SecretEnvSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SecretEnvSourceBuilder(V1SecretEnvSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1SecretEnvSource(), validationEnabled);
  }
  public V1SecretEnvSourceBuilder(V1SecretEnvSourceFluent<?> fluent,V1SecretEnvSource instance) {
    this(fluent, instance, false);
  }
  public V1SecretEnvSourceBuilder(V1SecretEnvSourceFluent<?> fluent,V1SecretEnvSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled; 
  }
  public V1SecretEnvSourceBuilder(V1SecretEnvSource instance) {
    this(instance,false);
  }
  public V1SecretEnvSourceBuilder(V1SecretEnvSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled; 
  }
  V1SecretEnvSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1SecretEnvSource build() {
    V1SecretEnvSource buildable = new V1SecretEnvSource();
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  
}