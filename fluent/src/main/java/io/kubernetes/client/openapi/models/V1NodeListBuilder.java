package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NodeListBuilder extends V1NodeListFluentImpl<V1NodeListBuilder> implements VisitableBuilder<V1NodeList,V1NodeListBuilder>{
  public V1NodeListBuilder() {
    this(false);
  }
  public V1NodeListBuilder(Boolean validationEnabled) {
    this(new V1NodeList(), validationEnabled);
  }
  public V1NodeListBuilder(V1NodeListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NodeListBuilder(V1NodeListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NodeList(), validationEnabled);
  }
  public V1NodeListBuilder(V1NodeListFluent<?> fluent,V1NodeList instance) {
    this(fluent, instance, false);
  }
  public V1NodeListBuilder(V1NodeListFluent<?> fluent,V1NodeList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1NodeListBuilder(V1NodeList instance) {
    this(instance,false);
  }
  public V1NodeListBuilder(V1NodeList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1NodeListFluent<?> fluent;
  Boolean validationEnabled;
  public V1NodeList build() {
    V1NodeList buildable = new V1NodeList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}