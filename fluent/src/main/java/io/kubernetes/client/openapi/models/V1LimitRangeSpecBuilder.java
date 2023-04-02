package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1LimitRangeSpecBuilder extends V1LimitRangeSpecFluentImpl<V1LimitRangeSpecBuilder> implements VisitableBuilder<V1LimitRangeSpec,V1LimitRangeSpecBuilder>{
  public V1LimitRangeSpecBuilder() {
    this(false);
  }
  public V1LimitRangeSpecBuilder(Boolean validationEnabled) {
    this(new V1LimitRangeSpec(), validationEnabled);
  }
  public V1LimitRangeSpecBuilder(V1LimitRangeSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LimitRangeSpecBuilder(V1LimitRangeSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1LimitRangeSpec(), validationEnabled);
  }
  public V1LimitRangeSpecBuilder(V1LimitRangeSpecFluent<?> fluent,V1LimitRangeSpec instance) {
    this(fluent, instance, false);
  }
  public V1LimitRangeSpecBuilder(V1LimitRangeSpecFluent<?> fluent,V1LimitRangeSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLimits(instance.getLimits());

    this.validationEnabled = validationEnabled; 
  }
  public V1LimitRangeSpecBuilder(V1LimitRangeSpec instance) {
    this(instance,false);
  }
  public V1LimitRangeSpecBuilder(V1LimitRangeSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLimits(instance.getLimits());

    this.validationEnabled = validationEnabled; 
  }
  V1LimitRangeSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1LimitRangeSpec build() {
    V1LimitRangeSpec buildable = new V1LimitRangeSpec();
    buildable.setLimits(fluent.getLimits());
    return buildable;
  }
  
}