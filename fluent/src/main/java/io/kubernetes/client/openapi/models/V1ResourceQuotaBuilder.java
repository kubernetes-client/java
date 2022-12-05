package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ResourceQuotaBuilder extends V1ResourceQuotaFluentImpl<V1ResourceQuotaBuilder> implements VisitableBuilder<V1ResourceQuota,V1ResourceQuotaBuilder>{
  public V1ResourceQuotaBuilder() {
    this(false);
  }
  public V1ResourceQuotaBuilder(Boolean validationEnabled) {
    this(new V1ResourceQuota(), validationEnabled);
  }
  public V1ResourceQuotaBuilder(V1ResourceQuotaFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ResourceQuotaBuilder(V1ResourceQuotaFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ResourceQuota(), validationEnabled);
  }
  public V1ResourceQuotaBuilder(V1ResourceQuotaFluent<?> fluent,V1ResourceQuota instance) {
    this(fluent, instance, false);
  }
  public V1ResourceQuotaBuilder(V1ResourceQuotaFluent<?> fluent,V1ResourceQuota instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1ResourceQuotaBuilder(V1ResourceQuota instance) {
    this(instance,false);
  }
  public V1ResourceQuotaBuilder(V1ResourceQuota instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1ResourceQuotaFluent<?> fluent;
  Boolean validationEnabled;
  public V1ResourceQuota build() {
    V1ResourceQuota buildable = new V1ResourceQuota();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}