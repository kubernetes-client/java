package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1EndpointsListBuilder extends V1EndpointsListFluent<V1EndpointsListBuilder> implements VisitableBuilder<V1EndpointsList,V1EndpointsListBuilder>{
  public V1EndpointsListBuilder() {
    this(new V1EndpointsList());
  }
  
  public V1EndpointsListBuilder(V1EndpointsListFluent<?> fluent) {
    this(fluent, new V1EndpointsList());
  }
  
  public V1EndpointsListBuilder(V1EndpointsListFluent<?> fluent,V1EndpointsList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1EndpointsListBuilder(V1EndpointsList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1EndpointsListFluent<?> fluent;
  
  public V1EndpointsList build() {
    V1EndpointsList buildable = new V1EndpointsList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}