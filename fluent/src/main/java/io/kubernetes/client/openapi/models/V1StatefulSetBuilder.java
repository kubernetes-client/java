package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1StatefulSetBuilder extends V1StatefulSetFluentImpl<V1StatefulSetBuilder> implements VisitableBuilder<V1StatefulSet,V1StatefulSetBuilder>{
  public V1StatefulSetBuilder() {
    this(false);
  }
  public V1StatefulSetBuilder(Boolean validationEnabled) {
    this(new V1StatefulSet(), validationEnabled);
  }
  public V1StatefulSetBuilder(V1StatefulSetFluent<?> fluent) {
    this(fluent, false);
  }
  public V1StatefulSetBuilder(V1StatefulSetFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1StatefulSet(), validationEnabled);
  }
  public V1StatefulSetBuilder(V1StatefulSetFluent<?> fluent,V1StatefulSet instance) {
    this(fluent, instance, false);
  }
  public V1StatefulSetBuilder(V1StatefulSetFluent<?> fluent,V1StatefulSet instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1StatefulSetBuilder(V1StatefulSet instance) {
    this(instance,false);
  }
  public V1StatefulSetBuilder(V1StatefulSet instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1StatefulSetFluent<?> fluent;
  Boolean validationEnabled;
  public V1StatefulSet build() {
    V1StatefulSet buildable = new V1StatefulSet();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}