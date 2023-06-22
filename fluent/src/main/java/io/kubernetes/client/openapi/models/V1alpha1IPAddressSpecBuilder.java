package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1IPAddressSpecBuilder extends V1alpha1IPAddressSpecFluentImpl<V1alpha1IPAddressSpecBuilder> implements VisitableBuilder<V1alpha1IPAddressSpec,V1alpha1IPAddressSpecBuilder>{
  public V1alpha1IPAddressSpecBuilder() {
    this(false);
  }
  public V1alpha1IPAddressSpecBuilder(Boolean validationEnabled) {
    this(new V1alpha1IPAddressSpec(), validationEnabled);
  }
  public V1alpha1IPAddressSpecBuilder(V1alpha1IPAddressSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1IPAddressSpecBuilder(V1alpha1IPAddressSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1IPAddressSpec(), validationEnabled);
  }
  public V1alpha1IPAddressSpecBuilder(V1alpha1IPAddressSpecFluent<?> fluent,V1alpha1IPAddressSpec instance) {
    this(fluent, instance, false);
  }
  public V1alpha1IPAddressSpecBuilder(V1alpha1IPAddressSpecFluent<?> fluent,V1alpha1IPAddressSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withParentRef(instance.getParentRef());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1IPAddressSpecBuilder(V1alpha1IPAddressSpec instance) {
    this(instance,false);
  }
  public V1alpha1IPAddressSpecBuilder(V1alpha1IPAddressSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withParentRef(instance.getParentRef());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1IPAddressSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1IPAddressSpec build() {
    V1alpha1IPAddressSpec buildable = new V1alpha1IPAddressSpec();
    buildable.setParentRef(fluent.getParentRef());
    return buildable;
  }
  
}