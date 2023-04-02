package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1TokenRequestStatusBuilder extends V1TokenRequestStatusFluentImpl<V1TokenRequestStatusBuilder> implements VisitableBuilder<V1TokenRequestStatus,V1TokenRequestStatusBuilder>{
  public V1TokenRequestStatusBuilder() {
    this(false);
  }
  public V1TokenRequestStatusBuilder(Boolean validationEnabled) {
    this(new V1TokenRequestStatus(), validationEnabled);
  }
  public V1TokenRequestStatusBuilder(V1TokenRequestStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1TokenRequestStatusBuilder(V1TokenRequestStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1TokenRequestStatus(), validationEnabled);
  }
  public V1TokenRequestStatusBuilder(V1TokenRequestStatusFluent<?> fluent,V1TokenRequestStatus instance) {
    this(fluent, instance, false);
  }
  public V1TokenRequestStatusBuilder(V1TokenRequestStatusFluent<?> fluent,V1TokenRequestStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withExpirationTimestamp(instance.getExpirationTimestamp());

    fluent.withToken(instance.getToken());

    this.validationEnabled = validationEnabled; 
  }
  public V1TokenRequestStatusBuilder(V1TokenRequestStatus instance) {
    this(instance,false);
  }
  public V1TokenRequestStatusBuilder(V1TokenRequestStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withExpirationTimestamp(instance.getExpirationTimestamp());

    this.withToken(instance.getToken());

    this.validationEnabled = validationEnabled; 
  }
  V1TokenRequestStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1TokenRequestStatus build() {
    V1TokenRequestStatus buildable = new V1TokenRequestStatus();
    buildable.setExpirationTimestamp(fluent.getExpirationTimestamp());
    buildable.setToken(fluent.getToken());
    return buildable;
  }
  
}