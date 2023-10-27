package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ServiceAccountBuilder extends V1ServiceAccountFluent<V1ServiceAccountBuilder> implements VisitableBuilder<V1ServiceAccount,V1ServiceAccountBuilder>{
  public V1ServiceAccountBuilder() {
    this(new V1ServiceAccount());
  }
  
  public V1ServiceAccountBuilder(V1ServiceAccountFluent<?> fluent) {
    this(fluent, new V1ServiceAccount());
  }
  
  public V1ServiceAccountBuilder(V1ServiceAccountFluent<?> fluent,V1ServiceAccount instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ServiceAccountBuilder(V1ServiceAccount instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ServiceAccountFluent<?> fluent;
  
  public V1ServiceAccount build() {
    V1ServiceAccount buildable = new V1ServiceAccount();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setAutomountServiceAccountToken(fluent.getAutomountServiceAccountToken());
    buildable.setImagePullSecrets(fluent.buildImagePullSecrets());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSecrets(fluent.buildSecrets());
    return buildable;
  }
  

}