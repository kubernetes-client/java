package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1EnvVarBuilder extends V1EnvVarFluentImpl<V1EnvVarBuilder> implements VisitableBuilder<V1EnvVar,V1EnvVarBuilder>{
  public V1EnvVarBuilder() {
    this(false);
  }
  public V1EnvVarBuilder(Boolean validationEnabled) {
    this(new V1EnvVar(), validationEnabled);
  }
  public V1EnvVarBuilder(V1EnvVarFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EnvVarBuilder(V1EnvVarFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1EnvVar(), validationEnabled);
  }
  public V1EnvVarBuilder(V1EnvVarFluent<?> fluent,V1EnvVar instance) {
    this(fluent, instance, false);
  }
  public V1EnvVarBuilder(V1EnvVarFluent<?> fluent,V1EnvVar instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withValue(instance.getValue());

    fluent.withValueFrom(instance.getValueFrom());

    this.validationEnabled = validationEnabled; 
  }
  public V1EnvVarBuilder(V1EnvVar instance) {
    this(instance,false);
  }
  public V1EnvVarBuilder(V1EnvVar instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withValue(instance.getValue());

    this.withValueFrom(instance.getValueFrom());

    this.validationEnabled = validationEnabled; 
  }
  V1EnvVarFluent<?> fluent;
  Boolean validationEnabled;
  public V1EnvVar build() {
    V1EnvVar buildable = new V1EnvVar();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    buildable.setValueFrom(fluent.getValueFrom());
    return buildable;
  }
  
}