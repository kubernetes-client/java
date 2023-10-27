package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ReplicationControllerSpecBuilder extends V1ReplicationControllerSpecFluent<V1ReplicationControllerSpecBuilder> implements VisitableBuilder<V1ReplicationControllerSpec,V1ReplicationControllerSpecBuilder>{
  public V1ReplicationControllerSpecBuilder() {
    this(new V1ReplicationControllerSpec());
  }
  
  public V1ReplicationControllerSpecBuilder(V1ReplicationControllerSpecFluent<?> fluent) {
    this(fluent, new V1ReplicationControllerSpec());
  }
  
  public V1ReplicationControllerSpecBuilder(V1ReplicationControllerSpecFluent<?> fluent,V1ReplicationControllerSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ReplicationControllerSpecBuilder(V1ReplicationControllerSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ReplicationControllerSpecFluent<?> fluent;
  
  public V1ReplicationControllerSpec build() {
    V1ReplicationControllerSpec buildable = new V1ReplicationControllerSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setSelector(fluent.getSelector());
    buildable.setTemplate(fluent.buildTemplate());
    return buildable;
  }
  

}