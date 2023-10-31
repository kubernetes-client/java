package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1APIResourceListBuilder extends V1APIResourceListFluent<V1APIResourceListBuilder> implements VisitableBuilder<V1APIResourceList,V1APIResourceListBuilder>{
  public V1APIResourceListBuilder() {
    this(new V1APIResourceList());
  }
  
  public V1APIResourceListBuilder(V1APIResourceListFluent<?> fluent) {
    this(fluent, new V1APIResourceList());
  }
  
  public V1APIResourceListBuilder(V1APIResourceListFluent<?> fluent,V1APIResourceList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1APIResourceListBuilder(V1APIResourceList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1APIResourceListFluent<?> fluent;
  
  public V1APIResourceList build() {
    V1APIResourceList buildable = new V1APIResourceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setGroupVersion(fluent.getGroupVersion());
    buildable.setKind(fluent.getKind());
    buildable.setResources(fluent.buildResources());
    return buildable;
  }
  

}