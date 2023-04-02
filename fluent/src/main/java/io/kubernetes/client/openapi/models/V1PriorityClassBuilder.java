package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PriorityClassBuilder extends V1PriorityClassFluentImpl<V1PriorityClassBuilder> implements VisitableBuilder<V1PriorityClass,V1PriorityClassBuilder>{
  public V1PriorityClassBuilder() {
    this(false);
  }
  public V1PriorityClassBuilder(Boolean validationEnabled) {
    this(new V1PriorityClass(), validationEnabled);
  }
  public V1PriorityClassBuilder(V1PriorityClassFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PriorityClassBuilder(V1PriorityClassFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PriorityClass(), validationEnabled);
  }
  public V1PriorityClassBuilder(V1PriorityClassFluent<?> fluent,V1PriorityClass instance) {
    this(fluent, instance, false);
  }
  public V1PriorityClassBuilder(V1PriorityClassFluent<?> fluent,V1PriorityClass instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withDescription(instance.getDescription());

    fluent.withGlobalDefault(instance.getGlobalDefault());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withPreemptionPolicy(instance.getPreemptionPolicy());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  public V1PriorityClassBuilder(V1PriorityClass instance) {
    this(instance,false);
  }
  public V1PriorityClassBuilder(V1PriorityClass instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withDescription(instance.getDescription());

    this.withGlobalDefault(instance.getGlobalDefault());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withPreemptionPolicy(instance.getPreemptionPolicy());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  V1PriorityClassFluent<?> fluent;
  Boolean validationEnabled;
  public V1PriorityClass build() {
    V1PriorityClass buildable = new V1PriorityClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDescription(fluent.getDescription());
    buildable.setGlobalDefault(fluent.getGlobalDefault());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setPreemptionPolicy(fluent.getPreemptionPolicy());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}