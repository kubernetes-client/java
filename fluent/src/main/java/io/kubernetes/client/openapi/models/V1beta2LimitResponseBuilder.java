package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta2LimitResponseBuilder extends io.kubernetes.client.openapi.models.V1beta2LimitResponseFluentImpl<io.kubernetes.client.openapi.models.V1beta2LimitResponseBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta2LimitResponse,io.kubernetes.client.openapi.models.V1beta2LimitResponseBuilder>{
  public V1beta2LimitResponseBuilder() {
    this(false);
  }
  public V1beta2LimitResponseBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta2LimitResponse(), validationEnabled);
  }
  public V1beta2LimitResponseBuilder(io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2LimitResponseBuilder(io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2LimitResponse(), validationEnabled);
  }
  public V1beta2LimitResponseBuilder(io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2LimitResponse instance) {
    this(fluent, instance, false);
  }
  public V1beta2LimitResponseBuilder(io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2LimitResponse instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withQueuing(instance.getQueuing());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2LimitResponseBuilder(io.kubernetes.client.openapi.models.V1beta2LimitResponse instance) {
    this(instance,false);
  }
  public V1beta2LimitResponseBuilder(io.kubernetes.client.openapi.models.V1beta2LimitResponse instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withQueuing(instance.getQueuing());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta2LimitResponse build() {
    V1beta2LimitResponse buildable = new V1beta2LimitResponse();
    buildable.setQueuing(fluent.getQueuing());
    buildable.setType(fluent.getType());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2LimitResponseBuilder that = (V1beta2LimitResponseBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}