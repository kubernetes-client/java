package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1IPBlockBuilder extends V1IPBlockFluentImpl<V1IPBlockBuilder> implements VisitableBuilder<V1IPBlock,V1IPBlockBuilder>{
  public V1IPBlockBuilder() {
    this(false);
  }
  public V1IPBlockBuilder(Boolean validationEnabled) {
    this(new V1IPBlock(), validationEnabled);
  }
  public V1IPBlockBuilder(V1IPBlockFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IPBlockBuilder(V1IPBlockFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1IPBlock(), validationEnabled);
  }
  public V1IPBlockBuilder(V1IPBlockFluent<?> fluent,V1IPBlock instance) {
    this(fluent, instance, false);
  }
  public V1IPBlockBuilder(V1IPBlockFluent<?> fluent,V1IPBlock instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCidr(instance.getCidr());

    fluent.withExcept(instance.getExcept());

    this.validationEnabled = validationEnabled; 
  }
  public V1IPBlockBuilder(V1IPBlock instance) {
    this(instance,false);
  }
  public V1IPBlockBuilder(V1IPBlock instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCidr(instance.getCidr());

    this.withExcept(instance.getExcept());

    this.validationEnabled = validationEnabled; 
  }
  V1IPBlockFluent<?> fluent;
  Boolean validationEnabled;
  public V1IPBlock build() {
    V1IPBlock buildable = new V1IPBlock();
    buildable.setCidr(fluent.getCidr());
    buildable.setExcept(fluent.getExcept());
    return buildable;
  }
  
}