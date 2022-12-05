package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1EndpointSliceListBuilder extends V1EndpointSliceListFluentImpl<V1EndpointSliceListBuilder> implements VisitableBuilder<V1EndpointSliceList,V1EndpointSliceListBuilder>{
  public V1EndpointSliceListBuilder() {
    this(false);
  }
  public V1EndpointSliceListBuilder(Boolean validationEnabled) {
    this(new V1EndpointSliceList(), validationEnabled);
  }
  public V1EndpointSliceListBuilder(V1EndpointSliceListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EndpointSliceListBuilder(V1EndpointSliceListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1EndpointSliceList(), validationEnabled);
  }
  public V1EndpointSliceListBuilder(V1EndpointSliceListFluent<?> fluent,V1EndpointSliceList instance) {
    this(fluent, instance, false);
  }
  public V1EndpointSliceListBuilder(V1EndpointSliceListFluent<?> fluent,V1EndpointSliceList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1EndpointSliceListBuilder(V1EndpointSliceList instance) {
    this(instance,false);
  }
  public V1EndpointSliceListBuilder(V1EndpointSliceList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1EndpointSliceListFluent<?> fluent;
  Boolean validationEnabled;
  public V1EndpointSliceList build() {
    V1EndpointSliceList buildable = new V1EndpointSliceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}