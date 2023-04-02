package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1JobListBuilder extends V1JobListFluentImpl<V1JobListBuilder> implements VisitableBuilder<V1JobList,V1JobListBuilder>{
  public V1JobListBuilder() {
    this(false);
  }
  public V1JobListBuilder(Boolean validationEnabled) {
    this(new V1JobList(), validationEnabled);
  }
  public V1JobListBuilder(V1JobListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1JobListBuilder(V1JobListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1JobList(), validationEnabled);
  }
  public V1JobListBuilder(V1JobListFluent<?> fluent,V1JobList instance) {
    this(fluent, instance, false);
  }
  public V1JobListBuilder(V1JobListFluent<?> fluent,V1JobList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1JobListBuilder(V1JobList instance) {
    this(instance,false);
  }
  public V1JobListBuilder(V1JobList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1JobListFluent<?> fluent;
  Boolean validationEnabled;
  public V1JobList build() {
    V1JobList buildable = new V1JobList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}