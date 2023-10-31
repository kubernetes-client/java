package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1HostIPBuilder extends V1HostIPFluent<V1HostIPBuilder> implements VisitableBuilder<V1HostIP,V1HostIPBuilder>{
  public V1HostIPBuilder() {
    this(new V1HostIP());
  }
  
  public V1HostIPBuilder(V1HostIPFluent<?> fluent) {
    this(fluent, new V1HostIP());
  }
  
  public V1HostIPBuilder(V1HostIPFluent<?> fluent,V1HostIP instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1HostIPBuilder(V1HostIP instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1HostIPFluent<?> fluent;
  
  public V1HostIP build() {
    V1HostIP buildable = new V1HostIP();
    buildable.setIp(fluent.getIp());
    return buildable;
  }
  

}