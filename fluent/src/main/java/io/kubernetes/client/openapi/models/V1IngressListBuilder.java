package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1IngressListBuilder extends V1IngressListFluentImpl<V1IngressListBuilder> implements VisitableBuilder<V1IngressList,V1IngressListBuilder>{
  public V1IngressListBuilder() {
    this(false);
  }
  public V1IngressListBuilder(Boolean validationEnabled) {
    this(new V1IngressList(), validationEnabled);
  }
  public V1IngressListBuilder(V1IngressListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IngressListBuilder(V1IngressListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1IngressList(), validationEnabled);
  }
  public V1IngressListBuilder(V1IngressListFluent<?> fluent,V1IngressList instance) {
    this(fluent, instance, false);
  }
  public V1IngressListBuilder(V1IngressListFluent<?> fluent,V1IngressList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1IngressListBuilder(V1IngressList instance) {
    this(instance,false);
  }
  public V1IngressListBuilder(V1IngressList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1IngressListFluent<?> fluent;
  Boolean validationEnabled;
  public V1IngressList build() {
    V1IngressList buildable = new V1IngressList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}