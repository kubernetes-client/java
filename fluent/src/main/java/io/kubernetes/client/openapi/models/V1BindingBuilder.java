package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1BindingBuilder extends V1BindingFluentImpl<V1BindingBuilder> implements VisitableBuilder<V1Binding,V1BindingBuilder>{
  public V1BindingBuilder() {
    this(false);
  }
  public V1BindingBuilder(Boolean validationEnabled) {
    this(new V1Binding(), validationEnabled);
  }
  public V1BindingBuilder(V1BindingFluent<?> fluent) {
    this(fluent, false);
  }
  public V1BindingBuilder(V1BindingFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Binding(), validationEnabled);
  }
  public V1BindingBuilder(V1BindingFluent<?> fluent,V1Binding instance) {
    this(fluent, instance, false);
  }
  public V1BindingBuilder(V1BindingFluent<?> fluent,V1Binding instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  public V1BindingBuilder(V1Binding instance) {
    this(instance,false);
  }
  public V1BindingBuilder(V1Binding instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  V1BindingFluent<?> fluent;
  Boolean validationEnabled;
  public V1Binding build() {
    V1Binding buildable = new V1Binding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
  
}