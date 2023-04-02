package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SecretBuilder extends V1SecretFluentImpl<V1SecretBuilder> implements VisitableBuilder<V1Secret,V1SecretBuilder>{
  public V1SecretBuilder() {
    this(false);
  }
  public V1SecretBuilder(Boolean validationEnabled) {
    this(new V1Secret(), validationEnabled);
  }
  public V1SecretBuilder(V1SecretFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SecretBuilder(V1SecretFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Secret(), validationEnabled);
  }
  public V1SecretBuilder(V1SecretFluent<?> fluent,V1Secret instance) {
    this(fluent, instance, false);
  }
  public V1SecretBuilder(V1SecretFluent<?> fluent,V1Secret instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withData(instance.getData());

    fluent.withImmutable(instance.getImmutable());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withStringData(instance.getStringData());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1SecretBuilder(V1Secret instance) {
    this(instance,false);
  }
  public V1SecretBuilder(V1Secret instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withData(instance.getData());

    this.withImmutable(instance.getImmutable());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withStringData(instance.getStringData());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1SecretFluent<?> fluent;
  Boolean validationEnabled;
  public V1Secret build() {
    V1Secret buildable = new V1Secret();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setData(fluent.getData());
    buildable.setImmutable(fluent.getImmutable());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setStringData(fluent.getStringData());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}