package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodDNSConfigOptionBuilder extends V1PodDNSConfigOptionFluentImpl<V1PodDNSConfigOptionBuilder> implements VisitableBuilder<V1PodDNSConfigOption,V1PodDNSConfigOptionBuilder>{
  public V1PodDNSConfigOptionBuilder() {
    this(false);
  }
  public V1PodDNSConfigOptionBuilder(Boolean validationEnabled) {
    this(new V1PodDNSConfigOption(), validationEnabled);
  }
  public V1PodDNSConfigOptionBuilder(V1PodDNSConfigOptionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodDNSConfigOptionBuilder(V1PodDNSConfigOptionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodDNSConfigOption(), validationEnabled);
  }
  public V1PodDNSConfigOptionBuilder(V1PodDNSConfigOptionFluent<?> fluent,V1PodDNSConfigOption instance) {
    this(fluent, instance, false);
  }
  public V1PodDNSConfigOptionBuilder(V1PodDNSConfigOptionFluent<?> fluent,V1PodDNSConfigOption instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodDNSConfigOptionBuilder(V1PodDNSConfigOption instance) {
    this(instance,false);
  }
  public V1PodDNSConfigOptionBuilder(V1PodDNSConfigOption instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  V1PodDNSConfigOptionFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodDNSConfigOption build() {
    V1PodDNSConfigOption buildable = new V1PodDNSConfigOption();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}