package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ResourceQuotaStatusBuilder extends V1ResourceQuotaStatusFluentImpl<V1ResourceQuotaStatusBuilder> implements VisitableBuilder<V1ResourceQuotaStatus,V1ResourceQuotaStatusBuilder>{
  public V1ResourceQuotaStatusBuilder() {
    this(false);
  }
  public V1ResourceQuotaStatusBuilder(Boolean validationEnabled) {
    this(new V1ResourceQuotaStatus(), validationEnabled);
  }
  public V1ResourceQuotaStatusBuilder(V1ResourceQuotaStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ResourceQuotaStatusBuilder(V1ResourceQuotaStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ResourceQuotaStatus(), validationEnabled);
  }
  public V1ResourceQuotaStatusBuilder(V1ResourceQuotaStatusFluent<?> fluent,V1ResourceQuotaStatus instance) {
    this(fluent, instance, false);
  }
  public V1ResourceQuotaStatusBuilder(V1ResourceQuotaStatusFluent<?> fluent,V1ResourceQuotaStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withHard(instance.getHard());

    fluent.withUsed(instance.getUsed());

    this.validationEnabled = validationEnabled; 
  }
  public V1ResourceQuotaStatusBuilder(V1ResourceQuotaStatus instance) {
    this(instance,false);
  }
  public V1ResourceQuotaStatusBuilder(V1ResourceQuotaStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withHard(instance.getHard());

    this.withUsed(instance.getUsed());

    this.validationEnabled = validationEnabled; 
  }
  V1ResourceQuotaStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1ResourceQuotaStatus build() {
    V1ResourceQuotaStatus buildable = new V1ResourceQuotaStatus();
    buildable.setHard(fluent.getHard());
    buildable.setUsed(fluent.getUsed());
    return buildable;
  }
  
}