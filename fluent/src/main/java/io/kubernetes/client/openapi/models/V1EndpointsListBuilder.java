package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1EndpointsListBuilder extends V1EndpointsListFluentImpl<V1EndpointsListBuilder> implements VisitableBuilder<V1EndpointsList,V1EndpointsListBuilder>{
  public V1EndpointsListBuilder() {
    this(false);
  }
  public V1EndpointsListBuilder(Boolean validationEnabled) {
    this(new V1EndpointsList(), validationEnabled);
  }
  public V1EndpointsListBuilder(V1EndpointsListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EndpointsListBuilder(V1EndpointsListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1EndpointsList(), validationEnabled);
  }
  public V1EndpointsListBuilder(V1EndpointsListFluent<?> fluent,V1EndpointsList instance) {
    this(fluent, instance, false);
  }
  public V1EndpointsListBuilder(V1EndpointsListFluent<?> fluent,V1EndpointsList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1EndpointsListBuilder(V1EndpointsList instance) {
    this(instance,false);
  }
  public V1EndpointsListBuilder(V1EndpointsList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1EndpointsListFluent<?> fluent;
  Boolean validationEnabled;
  public V1EndpointsList build() {
    V1EndpointsList buildable = new V1EndpointsList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}