package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1EvictionBuilder extends V1EvictionFluentImpl<V1EvictionBuilder> implements VisitableBuilder<V1Eviction,V1EvictionBuilder>{
  public V1EvictionBuilder() {
    this(false);
  }
  public V1EvictionBuilder(Boolean validationEnabled) {
    this(new V1Eviction(), validationEnabled);
  }
  public V1EvictionBuilder(V1EvictionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EvictionBuilder(V1EvictionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Eviction(), validationEnabled);
  }
  public V1EvictionBuilder(V1EvictionFluent<?> fluent,V1Eviction instance) {
    this(fluent, instance, false);
  }
  public V1EvictionBuilder(V1EvictionFluent<?> fluent,V1Eviction instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withDeleteOptions(instance.getDeleteOptions());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1EvictionBuilder(V1Eviction instance) {
    this(instance,false);
  }
  public V1EvictionBuilder(V1Eviction instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withDeleteOptions(instance.getDeleteOptions());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1EvictionFluent<?> fluent;
  Boolean validationEnabled;
  public V1Eviction build() {
    V1Eviction buildable = new V1Eviction();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDeleteOptions(fluent.getDeleteOptions());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}