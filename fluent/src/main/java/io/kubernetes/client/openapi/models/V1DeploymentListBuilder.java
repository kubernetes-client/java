package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1DeploymentListBuilder extends V1DeploymentListFluentImpl<V1DeploymentListBuilder> implements VisitableBuilder<V1DeploymentList,V1DeploymentListBuilder>{
  public V1DeploymentListBuilder() {
    this(false);
  }
  public V1DeploymentListBuilder(Boolean validationEnabled) {
    this(new V1DeploymentList(), validationEnabled);
  }
  public V1DeploymentListBuilder(V1DeploymentListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1DeploymentListBuilder(V1DeploymentListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1DeploymentList(), validationEnabled);
  }
  public V1DeploymentListBuilder(V1DeploymentListFluent<?> fluent,V1DeploymentList instance) {
    this(fluent, instance, false);
  }
  public V1DeploymentListBuilder(V1DeploymentListFluent<?> fluent,V1DeploymentList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1DeploymentListBuilder(V1DeploymentList instance) {
    this(instance,false);
  }
  public V1DeploymentListBuilder(V1DeploymentList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1DeploymentListFluent<?> fluent;
  Boolean validationEnabled;
  public V1DeploymentList build() {
    V1DeploymentList buildable = new V1DeploymentList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}