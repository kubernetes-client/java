package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ApplyConfigurationBuilder extends V1alpha1ApplyConfigurationFluent<V1alpha1ApplyConfigurationBuilder> implements VisitableBuilder<V1alpha1ApplyConfiguration,V1alpha1ApplyConfigurationBuilder>{
  public V1alpha1ApplyConfigurationBuilder() {
    this(new V1alpha1ApplyConfiguration());
  }
  
  public V1alpha1ApplyConfigurationBuilder(V1alpha1ApplyConfigurationFluent<?> fluent) {
    this(fluent, new V1alpha1ApplyConfiguration());
  }
  
  public V1alpha1ApplyConfigurationBuilder(V1alpha1ApplyConfigurationFluent<?> fluent,V1alpha1ApplyConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ApplyConfigurationBuilder(V1alpha1ApplyConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ApplyConfigurationFluent<?> fluent;
  
  public V1alpha1ApplyConfiguration build() {
    V1alpha1ApplyConfiguration buildable = new V1alpha1ApplyConfiguration();
    buildable.setExpression(fluent.getExpression());
    return buildable;
  }
  

}