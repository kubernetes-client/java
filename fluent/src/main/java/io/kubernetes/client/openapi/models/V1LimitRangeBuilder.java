package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1LimitRangeBuilder extends V1LimitRangeFluentImpl<V1LimitRangeBuilder> implements VisitableBuilder<V1LimitRange,V1LimitRangeBuilder>{
  public V1LimitRangeBuilder() {
    this(false);
  }
  public V1LimitRangeBuilder(Boolean validationEnabled) {
    this(new V1LimitRange(), validationEnabled);
  }
  public V1LimitRangeBuilder(V1LimitRangeFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LimitRangeBuilder(V1LimitRangeFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1LimitRange(), validationEnabled);
  }
  public V1LimitRangeBuilder(V1LimitRangeFluent<?> fluent,V1LimitRange instance) {
    this(fluent, instance, false);
  }
  public V1LimitRangeBuilder(V1LimitRangeFluent<?> fluent,V1LimitRange instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  public V1LimitRangeBuilder(V1LimitRange instance) {
    this(instance,false);
  }
  public V1LimitRangeBuilder(V1LimitRange instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  V1LimitRangeFluent<?> fluent;
  Boolean validationEnabled;
  public V1LimitRange build() {
    V1LimitRange buildable = new V1LimitRange();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
  
}