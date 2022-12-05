package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2LimitResponseBuilder extends V1beta2LimitResponseFluentImpl<V1beta2LimitResponseBuilder> implements VisitableBuilder<V1beta2LimitResponse,V1beta2LimitResponseBuilder>{
  public V1beta2LimitResponseBuilder() {
    this(false);
  }
  public V1beta2LimitResponseBuilder(Boolean validationEnabled) {
    this(new V1beta2LimitResponse(), validationEnabled);
  }
  public V1beta2LimitResponseBuilder(V1beta2LimitResponseFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2LimitResponseBuilder(V1beta2LimitResponseFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2LimitResponse(), validationEnabled);
  }
  public V1beta2LimitResponseBuilder(V1beta2LimitResponseFluent<?> fluent,V1beta2LimitResponse instance) {
    this(fluent, instance, false);
  }
  public V1beta2LimitResponseBuilder(V1beta2LimitResponseFluent<?> fluent,V1beta2LimitResponse instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withQueuing(instance.getQueuing());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2LimitResponseBuilder(V1beta2LimitResponse instance) {
    this(instance,false);
  }
  public V1beta2LimitResponseBuilder(V1beta2LimitResponse instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withQueuing(instance.getQueuing());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2LimitResponseFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2LimitResponse build() {
    V1beta2LimitResponse buildable = new V1beta2LimitResponse();
    buildable.setQueuing(fluent.getQueuing());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}