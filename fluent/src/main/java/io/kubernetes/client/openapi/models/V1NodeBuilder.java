package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NodeBuilder extends V1NodeFluentImpl<V1NodeBuilder> implements VisitableBuilder<V1Node,V1NodeBuilder>{
  public V1NodeBuilder() {
    this(false);
  }
  public V1NodeBuilder(Boolean validationEnabled) {
    this(new V1Node(), validationEnabled);
  }
  public V1NodeBuilder(V1NodeFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NodeBuilder(V1NodeFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Node(), validationEnabled);
  }
  public V1NodeBuilder(V1NodeFluent<?> fluent,V1Node instance) {
    this(fluent, instance, false);
  }
  public V1NodeBuilder(V1NodeFluent<?> fluent,V1Node instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1NodeBuilder(V1Node instance) {
    this(instance,false);
  }
  public V1NodeBuilder(V1Node instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1NodeFluent<?> fluent;
  Boolean validationEnabled;
  public V1Node build() {
    V1Node buildable = new V1Node();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}