package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1OverheadBuilder extends V1OverheadFluentImpl<V1OverheadBuilder> implements VisitableBuilder<V1Overhead,V1OverheadBuilder>{
  public V1OverheadBuilder() {
    this(false);
  }
  public V1OverheadBuilder(Boolean validationEnabled) {
    this(new V1Overhead(), validationEnabled);
  }
  public V1OverheadBuilder(V1OverheadFluent<?> fluent) {
    this(fluent, false);
  }
  public V1OverheadBuilder(V1OverheadFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Overhead(), validationEnabled);
  }
  public V1OverheadBuilder(V1OverheadFluent<?> fluent,V1Overhead instance) {
    this(fluent, instance, false);
  }
  public V1OverheadBuilder(V1OverheadFluent<?> fluent,V1Overhead instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withPodFixed(instance.getPodFixed());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1OverheadBuilder(V1Overhead instance) {
    this(instance,false);
  }
  public V1OverheadBuilder(V1Overhead instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withPodFixed(instance.getPodFixed());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1OverheadFluent<?> fluent;
  Boolean validationEnabled;
  public V1Overhead build() {
    V1Overhead buildable = new V1Overhead();
    buildable.setPodFixed(fluent.getPodFixed());
    return buildable;
  }
  
}