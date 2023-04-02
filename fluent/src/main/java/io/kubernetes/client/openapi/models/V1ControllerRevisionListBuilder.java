package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ControllerRevisionListBuilder extends V1ControllerRevisionListFluentImpl<V1ControllerRevisionListBuilder> implements VisitableBuilder<V1ControllerRevisionList,V1ControllerRevisionListBuilder>{
  public V1ControllerRevisionListBuilder() {
    this(false);
  }
  public V1ControllerRevisionListBuilder(Boolean validationEnabled) {
    this(new V1ControllerRevisionList(), validationEnabled);
  }
  public V1ControllerRevisionListBuilder(V1ControllerRevisionListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ControllerRevisionListBuilder(V1ControllerRevisionListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ControllerRevisionList(), validationEnabled);
  }
  public V1ControllerRevisionListBuilder(V1ControllerRevisionListFluent<?> fluent,V1ControllerRevisionList instance) {
    this(fluent, instance, false);
  }
  public V1ControllerRevisionListBuilder(V1ControllerRevisionListFluent<?> fluent,V1ControllerRevisionList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1ControllerRevisionListBuilder(V1ControllerRevisionList instance) {
    this(instance,false);
  }
  public V1ControllerRevisionListBuilder(V1ControllerRevisionList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1ControllerRevisionListFluent<?> fluent;
  Boolean validationEnabled;
  public V1ControllerRevisionList build() {
    V1ControllerRevisionList buildable = new V1ControllerRevisionList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}