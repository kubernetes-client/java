package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1DeploymentListBuilder extends V1DeploymentListFluent<V1DeploymentListBuilder> implements VisitableBuilder<V1DeploymentList,V1DeploymentListBuilder>{
  public V1DeploymentListBuilder() {
    this(new V1DeploymentList());
  }
  
  public V1DeploymentListBuilder(V1DeploymentListFluent<?> fluent) {
    this(fluent, new V1DeploymentList());
  }
  
  public V1DeploymentListBuilder(V1DeploymentListFluent<?> fluent,V1DeploymentList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeploymentListBuilder(V1DeploymentList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeploymentListFluent<?> fluent;
  
  public V1DeploymentList build() {
    V1DeploymentList buildable = new V1DeploymentList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}