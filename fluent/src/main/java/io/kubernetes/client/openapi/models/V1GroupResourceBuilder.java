package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1GroupResourceBuilder extends V1GroupResourceFluent<V1GroupResourceBuilder> implements VisitableBuilder<V1GroupResource,V1GroupResourceBuilder>{

  V1GroupResourceFluent<?> fluent;

  public V1GroupResourceBuilder() {
    this(new V1GroupResource());
  }
  
  public V1GroupResourceBuilder(V1GroupResourceFluent<?> fluent) {
    this(fluent, new V1GroupResource());
  }
  
  public V1GroupResourceBuilder(V1GroupResource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1GroupResourceBuilder(V1GroupResourceFluent<?> fluent,V1GroupResource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1GroupResource build() {
    V1GroupResource buildable = new V1GroupResource();
    buildable.setGroup(fluent.getGroup());
    buildable.setResource(fluent.getResource());
    return buildable;
  }
  
}