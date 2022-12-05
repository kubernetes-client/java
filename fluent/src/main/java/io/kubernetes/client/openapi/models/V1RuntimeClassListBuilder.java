package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1RuntimeClassListBuilder extends V1RuntimeClassListFluentImpl<V1RuntimeClassListBuilder> implements VisitableBuilder<V1RuntimeClassList,V1RuntimeClassListBuilder>{
  public V1RuntimeClassListBuilder() {
    this(false);
  }
  public V1RuntimeClassListBuilder(Boolean validationEnabled) {
    this(new V1RuntimeClassList(), validationEnabled);
  }
  public V1RuntimeClassListBuilder(V1RuntimeClassListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1RuntimeClassListBuilder(V1RuntimeClassListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1RuntimeClassList(), validationEnabled);
  }
  public V1RuntimeClassListBuilder(V1RuntimeClassListFluent<?> fluent,V1RuntimeClassList instance) {
    this(fluent, instance, false);
  }
  public V1RuntimeClassListBuilder(V1RuntimeClassListFluent<?> fluent,V1RuntimeClassList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1RuntimeClassListBuilder(V1RuntimeClassList instance) {
    this(instance,false);
  }
  public V1RuntimeClassListBuilder(V1RuntimeClassList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1RuntimeClassListFluent<?> fluent;
  Boolean validationEnabled;
  public V1RuntimeClassList build() {
    V1RuntimeClassList buildable = new V1RuntimeClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}