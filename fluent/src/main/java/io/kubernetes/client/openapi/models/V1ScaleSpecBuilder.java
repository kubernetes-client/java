package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ScaleSpecBuilder extends V1ScaleSpecFluentImpl<V1ScaleSpecBuilder> implements VisitableBuilder<V1ScaleSpec,V1ScaleSpecBuilder>{
  public V1ScaleSpecBuilder() {
    this(false);
  }
  public V1ScaleSpecBuilder(Boolean validationEnabled) {
    this(new V1ScaleSpec(), validationEnabled);
  }
  public V1ScaleSpecBuilder(V1ScaleSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ScaleSpecBuilder(V1ScaleSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ScaleSpec(), validationEnabled);
  }
  public V1ScaleSpecBuilder(V1ScaleSpecFluent<?> fluent,V1ScaleSpec instance) {
    this(fluent, instance, false);
  }
  public V1ScaleSpecBuilder(V1ScaleSpecFluent<?> fluent,V1ScaleSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withReplicas(instance.getReplicas());

    this.validationEnabled = validationEnabled; 
  }
  public V1ScaleSpecBuilder(V1ScaleSpec instance) {
    this(instance,false);
  }
  public V1ScaleSpecBuilder(V1ScaleSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withReplicas(instance.getReplicas());

    this.validationEnabled = validationEnabled; 
  }
  V1ScaleSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1ScaleSpec build() {
    V1ScaleSpec buildable = new V1ScaleSpec();
    buildable.setReplicas(fluent.getReplicas());
    return buildable;
  }
  
}