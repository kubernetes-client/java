package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ResourceFieldSelectorBuilder extends V1ResourceFieldSelectorFluentImpl<V1ResourceFieldSelectorBuilder> implements VisitableBuilder<V1ResourceFieldSelector,V1ResourceFieldSelectorBuilder>{
  public V1ResourceFieldSelectorBuilder() {
    this(false);
  }
  public V1ResourceFieldSelectorBuilder(Boolean validationEnabled) {
    this(new V1ResourceFieldSelector(), validationEnabled);
  }
  public V1ResourceFieldSelectorBuilder(V1ResourceFieldSelectorFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ResourceFieldSelectorBuilder(V1ResourceFieldSelectorFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ResourceFieldSelector(), validationEnabled);
  }
  public V1ResourceFieldSelectorBuilder(V1ResourceFieldSelectorFluent<?> fluent,V1ResourceFieldSelector instance) {
    this(fluent, instance, false);
  }
  public V1ResourceFieldSelectorBuilder(V1ResourceFieldSelectorFluent<?> fluent,V1ResourceFieldSelector instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withContainerName(instance.getContainerName());

    fluent.withDivisor(instance.getDivisor());

    fluent.withResource(instance.getResource());

    this.validationEnabled = validationEnabled; 
  }
  public V1ResourceFieldSelectorBuilder(V1ResourceFieldSelector instance) {
    this(instance,false);
  }
  public V1ResourceFieldSelectorBuilder(V1ResourceFieldSelector instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withContainerName(instance.getContainerName());

    this.withDivisor(instance.getDivisor());

    this.withResource(instance.getResource());

    this.validationEnabled = validationEnabled; 
  }
  V1ResourceFieldSelectorFluent<?> fluent;
  Boolean validationEnabled;
  public V1ResourceFieldSelector build() {
    V1ResourceFieldSelector buildable = new V1ResourceFieldSelector();
    buildable.setContainerName(fluent.getContainerName());
    buildable.setDivisor(fluent.getDivisor());
    buildable.setResource(fluent.getResource());
    return buildable;
  }
  
}