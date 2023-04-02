package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1VolumeErrorBuilder extends V1VolumeErrorFluentImpl<V1VolumeErrorBuilder> implements VisitableBuilder<V1VolumeError,V1VolumeErrorBuilder>{
  public V1VolumeErrorBuilder() {
    this(false);
  }
  public V1VolumeErrorBuilder(Boolean validationEnabled) {
    this(new V1VolumeError(), validationEnabled);
  }
  public V1VolumeErrorBuilder(V1VolumeErrorFluent<?> fluent) {
    this(fluent, false);
  }
  public V1VolumeErrorBuilder(V1VolumeErrorFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1VolumeError(), validationEnabled);
  }
  public V1VolumeErrorBuilder(V1VolumeErrorFluent<?> fluent,V1VolumeError instance) {
    this(fluent, instance, false);
  }
  public V1VolumeErrorBuilder(V1VolumeErrorFluent<?> fluent,V1VolumeError instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMessage(instance.getMessage());

    fluent.withTime(instance.getTime());

    this.validationEnabled = validationEnabled; 
  }
  public V1VolumeErrorBuilder(V1VolumeError instance) {
    this(instance,false);
  }
  public V1VolumeErrorBuilder(V1VolumeError instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMessage(instance.getMessage());

    this.withTime(instance.getTime());

    this.validationEnabled = validationEnabled; 
  }
  V1VolumeErrorFluent<?> fluent;
  Boolean validationEnabled;
  public V1VolumeError build() {
    V1VolumeError buildable = new V1VolumeError();
    buildable.setMessage(fluent.getMessage());
    buildable.setTime(fluent.getTime());
    return buildable;
  }
  
}