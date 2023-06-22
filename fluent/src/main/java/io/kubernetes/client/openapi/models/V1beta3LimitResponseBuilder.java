package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3LimitResponseBuilder extends V1beta3LimitResponseFluentImpl<V1beta3LimitResponseBuilder> implements VisitableBuilder<V1beta3LimitResponse,V1beta3LimitResponseBuilder>{
  public V1beta3LimitResponseBuilder() {
    this(false);
  }
  public V1beta3LimitResponseBuilder(Boolean validationEnabled) {
    this(new V1beta3LimitResponse(), validationEnabled);
  }
  public V1beta3LimitResponseBuilder(V1beta3LimitResponseFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3LimitResponseBuilder(V1beta3LimitResponseFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3LimitResponse(), validationEnabled);
  }
  public V1beta3LimitResponseBuilder(V1beta3LimitResponseFluent<?> fluent,V1beta3LimitResponse instance) {
    this(fluent, instance, false);
  }
  public V1beta3LimitResponseBuilder(V1beta3LimitResponseFluent<?> fluent,V1beta3LimitResponse instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withQueuing(instance.getQueuing());
      fluent.withType(instance.getType());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3LimitResponseBuilder(V1beta3LimitResponse instance) {
    this(instance,false);
  }
  public V1beta3LimitResponseBuilder(V1beta3LimitResponse instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withQueuing(instance.getQueuing());
      this.withType(instance.getType());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3LimitResponseFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3LimitResponse build() {
    V1beta3LimitResponse buildable = new V1beta3LimitResponse();
    buildable.setQueuing(fluent.getQueuing());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}