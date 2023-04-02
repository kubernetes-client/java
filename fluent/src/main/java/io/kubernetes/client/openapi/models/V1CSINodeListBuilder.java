package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CSINodeListBuilder extends V1CSINodeListFluentImpl<V1CSINodeListBuilder> implements VisitableBuilder<V1CSINodeList,V1CSINodeListBuilder>{
  public V1CSINodeListBuilder() {
    this(false);
  }
  public V1CSINodeListBuilder(Boolean validationEnabled) {
    this(new V1CSINodeList(), validationEnabled);
  }
  public V1CSINodeListBuilder(V1CSINodeListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CSINodeListBuilder(V1CSINodeListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CSINodeList(), validationEnabled);
  }
  public V1CSINodeListBuilder(V1CSINodeListFluent<?> fluent,V1CSINodeList instance) {
    this(fluent, instance, false);
  }
  public V1CSINodeListBuilder(V1CSINodeListFluent<?> fluent,V1CSINodeList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1CSINodeListBuilder(V1CSINodeList instance) {
    this(instance,false);
  }
  public V1CSINodeListBuilder(V1CSINodeList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1CSINodeListFluent<?> fluent;
  Boolean validationEnabled;
  public V1CSINodeList build() {
    V1CSINodeList buildable = new V1CSINodeList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}