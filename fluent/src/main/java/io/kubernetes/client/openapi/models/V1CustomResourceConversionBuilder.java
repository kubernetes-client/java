package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CustomResourceConversionBuilder extends V1CustomResourceConversionFluentImpl<V1CustomResourceConversionBuilder> implements VisitableBuilder<V1CustomResourceConversion,V1CustomResourceConversionBuilder>{
  public V1CustomResourceConversionBuilder() {
    this(false);
  }
  public V1CustomResourceConversionBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceConversion(), validationEnabled);
  }
  public V1CustomResourceConversionBuilder(V1CustomResourceConversionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CustomResourceConversionBuilder(V1CustomResourceConversionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CustomResourceConversion(), validationEnabled);
  }
  public V1CustomResourceConversionBuilder(V1CustomResourceConversionFluent<?> fluent,V1CustomResourceConversion instance) {
    this(fluent, instance, false);
  }
  public V1CustomResourceConversionBuilder(V1CustomResourceConversionFluent<?> fluent,V1CustomResourceConversion instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withStrategy(instance.getStrategy());

    fluent.withWebhook(instance.getWebhook());

    this.validationEnabled = validationEnabled; 
  }
  public V1CustomResourceConversionBuilder(V1CustomResourceConversion instance) {
    this(instance,false);
  }
  public V1CustomResourceConversionBuilder(V1CustomResourceConversion instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withStrategy(instance.getStrategy());

    this.withWebhook(instance.getWebhook());

    this.validationEnabled = validationEnabled; 
  }
  V1CustomResourceConversionFluent<?> fluent;
  Boolean validationEnabled;
  public V1CustomResourceConversion build() {
    V1CustomResourceConversion buildable = new V1CustomResourceConversion();
    buildable.setStrategy(fluent.getStrategy());
    buildable.setWebhook(fluent.getWebhook());
    return buildable;
  }
  
}