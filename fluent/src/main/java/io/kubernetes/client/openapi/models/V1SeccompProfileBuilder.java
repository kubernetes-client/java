package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1SeccompProfileBuilder extends V1SeccompProfileFluent<V1SeccompProfileBuilder> implements VisitableBuilder<V1SeccompProfile,V1SeccompProfileBuilder>{

  V1SeccompProfileFluent<?> fluent;

  public V1SeccompProfileBuilder() {
    this(new V1SeccompProfile());
  }
  
  public V1SeccompProfileBuilder(V1SeccompProfileFluent<?> fluent) {
    this(fluent, new V1SeccompProfile());
  }
  
  public V1SeccompProfileBuilder(V1SeccompProfile instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SeccompProfileBuilder(V1SeccompProfileFluent<?> fluent,V1SeccompProfile instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1SeccompProfile build() {
    V1SeccompProfile buildable = new V1SeccompProfile();
    buildable.setLocalhostProfile(fluent.getLocalhostProfile());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}