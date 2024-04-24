package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2VendorParametersBuilder extends V1alpha2VendorParametersFluent<V1alpha2VendorParametersBuilder> implements VisitableBuilder<V1alpha2VendorParameters,V1alpha2VendorParametersBuilder>{
  public V1alpha2VendorParametersBuilder() {
    this(new V1alpha2VendorParameters());
  }
  
  public V1alpha2VendorParametersBuilder(V1alpha2VendorParametersFluent<?> fluent) {
    this(fluent, new V1alpha2VendorParameters());
  }
  
  public V1alpha2VendorParametersBuilder(V1alpha2VendorParametersFluent<?> fluent,V1alpha2VendorParameters instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2VendorParametersBuilder(V1alpha2VendorParameters instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2VendorParametersFluent<?> fluent;
  
  public V1alpha2VendorParameters build() {
    V1alpha2VendorParameters buildable = new V1alpha2VendorParameters();
    buildable.setDriverName(fluent.getDriverName());
    buildable.setParameters(fluent.getParameters());
    return buildable;
  }
  

}