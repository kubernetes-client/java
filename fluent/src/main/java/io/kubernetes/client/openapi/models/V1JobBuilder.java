package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1JobBuilder extends V1JobFluent<V1JobBuilder> implements VisitableBuilder<V1Job,V1JobBuilder>{
  public V1JobBuilder() {
    this(new V1Job());
  }
  
  public V1JobBuilder(V1JobFluent<?> fluent) {
    this(fluent, new V1Job());
  }
  
  public V1JobBuilder(V1JobFluent<?> fluent,V1Job instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1JobBuilder(V1Job instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1JobFluent<?> fluent;
  
  public V1Job build() {
    V1Job buildable = new V1Job();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}