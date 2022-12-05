package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ConfigMapBuilder extends V1ConfigMapFluentImpl<V1ConfigMapBuilder> implements VisitableBuilder<V1ConfigMap,V1ConfigMapBuilder>{
  public V1ConfigMapBuilder() {
    this(false);
  }
  public V1ConfigMapBuilder(Boolean validationEnabled) {
    this(new V1ConfigMap(), validationEnabled);
  }
  public V1ConfigMapBuilder(V1ConfigMapFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ConfigMapBuilder(V1ConfigMapFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ConfigMap(), validationEnabled);
  }
  public V1ConfigMapBuilder(V1ConfigMapFluent<?> fluent,V1ConfigMap instance) {
    this(fluent, instance, false);
  }
  public V1ConfigMapBuilder(V1ConfigMapFluent<?> fluent,V1ConfigMap instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withBinaryData(instance.getBinaryData());

    fluent.withData(instance.getData());

    fluent.withImmutable(instance.getImmutable());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1ConfigMapBuilder(V1ConfigMap instance) {
    this(instance,false);
  }
  public V1ConfigMapBuilder(V1ConfigMap instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withBinaryData(instance.getBinaryData());

    this.withData(instance.getData());

    this.withImmutable(instance.getImmutable());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1ConfigMapFluent<?> fluent;
  Boolean validationEnabled;
  public V1ConfigMap build() {
    V1ConfigMap buildable = new V1ConfigMap();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setBinaryData(fluent.getBinaryData());
    buildable.setData(fluent.getData());
    buildable.setImmutable(fluent.getImmutable());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}