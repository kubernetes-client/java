package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1IngressClassListBuilder extends V1IngressClassListFluentImpl<V1IngressClassListBuilder> implements VisitableBuilder<V1IngressClassList,V1IngressClassListBuilder>{
  public V1IngressClassListBuilder() {
    this(false);
  }
  public V1IngressClassListBuilder(Boolean validationEnabled) {
    this(new V1IngressClassList(), validationEnabled);
  }
  public V1IngressClassListBuilder(V1IngressClassListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IngressClassListBuilder(V1IngressClassListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1IngressClassList(), validationEnabled);
  }
  public V1IngressClassListBuilder(V1IngressClassListFluent<?> fluent,V1IngressClassList instance) {
    this(fluent, instance, false);
  }
  public V1IngressClassListBuilder(V1IngressClassListFluent<?> fluent,V1IngressClassList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1IngressClassListBuilder(V1IngressClassList instance) {
    this(instance,false);
  }
  public V1IngressClassListBuilder(V1IngressClassList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1IngressClassListFluent<?> fluent;
  Boolean validationEnabled;
  public V1IngressClassList build() {
    V1IngressClassList buildable = new V1IngressClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}