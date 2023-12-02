package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1APIServiceBuilder extends V1APIServiceFluent<V1APIServiceBuilder> implements VisitableBuilder<V1APIService,V1APIServiceBuilder>{
  public V1APIServiceBuilder() {
    this(new V1APIService());
  }
  
  public V1APIServiceBuilder(V1APIServiceFluent<?> fluent) {
    this(fluent, new V1APIService());
  }
  
  public V1APIServiceBuilder(V1APIServiceFluent<?> fluent,V1APIService instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1APIServiceBuilder(V1APIService instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1APIServiceFluent<?> fluent;
  
  public V1APIService build() {
    V1APIService buildable = new V1APIService();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}