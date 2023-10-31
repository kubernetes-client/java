package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1EndpointSliceListBuilder extends V1EndpointSliceListFluent<V1EndpointSliceListBuilder> implements VisitableBuilder<V1EndpointSliceList,V1EndpointSliceListBuilder>{
  public V1EndpointSliceListBuilder() {
    this(new V1EndpointSliceList());
  }
  
  public V1EndpointSliceListBuilder(V1EndpointSliceListFluent<?> fluent) {
    this(fluent, new V1EndpointSliceList());
  }
  
  public V1EndpointSliceListBuilder(V1EndpointSliceListFluent<?> fluent,V1EndpointSliceList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1EndpointSliceListBuilder(V1EndpointSliceList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1EndpointSliceListFluent<?> fluent;
  
  public V1EndpointSliceList build() {
    V1EndpointSliceList buildable = new V1EndpointSliceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}