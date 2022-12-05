package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodOSBuilder extends V1PodOSFluentImpl<V1PodOSBuilder> implements VisitableBuilder<V1PodOS,V1PodOSBuilder>{
  public V1PodOSBuilder() {
    this(false);
  }
  public V1PodOSBuilder(Boolean validationEnabled) {
    this(new V1PodOS(), validationEnabled);
  }
  public V1PodOSBuilder(V1PodOSFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodOSBuilder(V1PodOSFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodOS(), validationEnabled);
  }
  public V1PodOSBuilder(V1PodOSFluent<?> fluent,V1PodOS instance) {
    this(fluent, instance, false);
  }
  public V1PodOSBuilder(V1PodOSFluent<?> fluent,V1PodOS instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodOSBuilder(V1PodOS instance) {
    this(instance,false);
  }
  public V1PodOSBuilder(V1PodOS instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V1PodOSFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodOS build() {
    V1PodOS buildable = new V1PodOS();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}