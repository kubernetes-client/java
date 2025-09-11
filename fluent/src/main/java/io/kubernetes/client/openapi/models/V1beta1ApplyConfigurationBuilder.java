package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1ApplyConfigurationBuilder extends V1beta1ApplyConfigurationFluent<V1beta1ApplyConfigurationBuilder> implements VisitableBuilder<V1beta1ApplyConfiguration,V1beta1ApplyConfigurationBuilder>{
  public V1beta1ApplyConfigurationBuilder() {
    this(new V1beta1ApplyConfiguration());
  }
  
  public V1beta1ApplyConfigurationBuilder(V1beta1ApplyConfigurationFluent<?> fluent) {
    this(fluent, new V1beta1ApplyConfiguration());
  }
  
  public V1beta1ApplyConfigurationBuilder(V1beta1ApplyConfigurationFluent<?> fluent,V1beta1ApplyConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ApplyConfigurationBuilder(V1beta1ApplyConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ApplyConfigurationFluent<?> fluent;
  
  public V1beta1ApplyConfiguration build() {
    V1beta1ApplyConfiguration buildable = new V1beta1ApplyConfiguration();
    buildable.setExpression(fluent.getExpression());
    return buildable;
  }
  

}