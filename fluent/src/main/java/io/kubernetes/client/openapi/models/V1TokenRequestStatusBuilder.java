package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1TokenRequestStatusBuilder extends V1TokenRequestStatusFluent<V1TokenRequestStatusBuilder> implements VisitableBuilder<V1TokenRequestStatus,V1TokenRequestStatusBuilder>{
  public V1TokenRequestStatusBuilder() {
    this(new V1TokenRequestStatus());
  }
  
  public V1TokenRequestStatusBuilder(V1TokenRequestStatusFluent<?> fluent) {
    this(fluent, new V1TokenRequestStatus());
  }
  
  public V1TokenRequestStatusBuilder(V1TokenRequestStatusFluent<?> fluent,V1TokenRequestStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1TokenRequestStatusBuilder(V1TokenRequestStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1TokenRequestStatusFluent<?> fluent;
  
  public V1TokenRequestStatus build() {
    V1TokenRequestStatus buildable = new V1TokenRequestStatus();
    buildable.setExpirationTimestamp(fluent.getExpirationTimestamp());
    buildable.setToken(fluent.getToken());
    return buildable;
  }
  

}