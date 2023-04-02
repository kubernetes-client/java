package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SecretListBuilder extends V1SecretListFluentImpl<V1SecretListBuilder> implements VisitableBuilder<V1SecretList,V1SecretListBuilder>{
  public V1SecretListBuilder() {
    this(false);
  }
  public V1SecretListBuilder(Boolean validationEnabled) {
    this(new V1SecretList(), validationEnabled);
  }
  public V1SecretListBuilder(V1SecretListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SecretListBuilder(V1SecretListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1SecretList(), validationEnabled);
  }
  public V1SecretListBuilder(V1SecretListFluent<?> fluent,V1SecretList instance) {
    this(fluent, instance, false);
  }
  public V1SecretListBuilder(V1SecretListFluent<?> fluent,V1SecretList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1SecretListBuilder(V1SecretList instance) {
    this(instance,false);
  }
  public V1SecretListBuilder(V1SecretList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1SecretListFluent<?> fluent;
  Boolean validationEnabled;
  public V1SecretList build() {
    V1SecretList buildable = new V1SecretList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}