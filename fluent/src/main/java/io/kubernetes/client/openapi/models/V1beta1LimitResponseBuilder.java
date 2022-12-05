package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1LimitResponseBuilder extends V1beta1LimitResponseFluentImpl<V1beta1LimitResponseBuilder> implements VisitableBuilder<V1beta1LimitResponse,V1beta1LimitResponseBuilder>{
  public V1beta1LimitResponseBuilder() {
    this(false);
  }
  public V1beta1LimitResponseBuilder(Boolean validationEnabled) {
    this(new V1beta1LimitResponse(), validationEnabled);
  }
  public V1beta1LimitResponseBuilder(V1beta1LimitResponseFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1LimitResponseBuilder(V1beta1LimitResponseFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1LimitResponse(), validationEnabled);
  }
  public V1beta1LimitResponseBuilder(V1beta1LimitResponseFluent<?> fluent,V1beta1LimitResponse instance) {
    this(fluent, instance, false);
  }
  public V1beta1LimitResponseBuilder(V1beta1LimitResponseFluent<?> fluent,V1beta1LimitResponse instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withQueuing(instance.getQueuing());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1LimitResponseBuilder(V1beta1LimitResponse instance) {
    this(instance,false);
  }
  public V1beta1LimitResponseBuilder(V1beta1LimitResponse instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withQueuing(instance.getQueuing());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1LimitResponseFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1LimitResponse build() {
    V1beta1LimitResponse buildable = new V1beta1LimitResponse();
    buildable.setQueuing(fluent.getQueuing());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}