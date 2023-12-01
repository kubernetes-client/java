package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CustomResourceConversionBuilder extends V1CustomResourceConversionFluent<V1CustomResourceConversionBuilder> implements VisitableBuilder<V1CustomResourceConversion,V1CustomResourceConversionBuilder>{
  public V1CustomResourceConversionBuilder() {
    this(new V1CustomResourceConversion());
  }
  
  public V1CustomResourceConversionBuilder(V1CustomResourceConversionFluent<?> fluent) {
    this(fluent, new V1CustomResourceConversion());
  }
  
  public V1CustomResourceConversionBuilder(V1CustomResourceConversionFluent<?> fluent,V1CustomResourceConversion instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CustomResourceConversionBuilder(V1CustomResourceConversion instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CustomResourceConversionFluent<?> fluent;
  
  public V1CustomResourceConversion build() {
    V1CustomResourceConversion buildable = new V1CustomResourceConversion();
    buildable.setStrategy(fluent.getStrategy());
    buildable.setWebhook(fluent.buildWebhook());
    return buildable;
  }
  

}