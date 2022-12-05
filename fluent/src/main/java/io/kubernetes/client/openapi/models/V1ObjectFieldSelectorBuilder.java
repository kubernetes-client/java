package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ObjectFieldSelectorBuilder extends V1ObjectFieldSelectorFluentImpl<V1ObjectFieldSelectorBuilder> implements VisitableBuilder<V1ObjectFieldSelector,V1ObjectFieldSelectorBuilder>{
  public V1ObjectFieldSelectorBuilder() {
    this(false);
  }
  public V1ObjectFieldSelectorBuilder(Boolean validationEnabled) {
    this(new V1ObjectFieldSelector(), validationEnabled);
  }
  public V1ObjectFieldSelectorBuilder(V1ObjectFieldSelectorFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ObjectFieldSelectorBuilder(V1ObjectFieldSelectorFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ObjectFieldSelector(), validationEnabled);
  }
  public V1ObjectFieldSelectorBuilder(V1ObjectFieldSelectorFluent<?> fluent,V1ObjectFieldSelector instance) {
    this(fluent, instance, false);
  }
  public V1ObjectFieldSelectorBuilder(V1ObjectFieldSelectorFluent<?> fluent,V1ObjectFieldSelector instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withFieldPath(instance.getFieldPath());

    this.validationEnabled = validationEnabled; 
  }
  public V1ObjectFieldSelectorBuilder(V1ObjectFieldSelector instance) {
    this(instance,false);
  }
  public V1ObjectFieldSelectorBuilder(V1ObjectFieldSelector instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withFieldPath(instance.getFieldPath());

    this.validationEnabled = validationEnabled; 
  }
  V1ObjectFieldSelectorFluent<?> fluent;
  Boolean validationEnabled;
  public V1ObjectFieldSelector build() {
    V1ObjectFieldSelector buildable = new V1ObjectFieldSelector();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setFieldPath(fluent.getFieldPath());
    return buildable;
  }
  
}