package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2ResourceHandleBuilder extends V1alpha2ResourceHandleFluentImpl<V1alpha2ResourceHandleBuilder> implements VisitableBuilder<V1alpha2ResourceHandle,V1alpha2ResourceHandleBuilder>{
  public V1alpha2ResourceHandleBuilder() {
    this(false);
  }
  public V1alpha2ResourceHandleBuilder(Boolean validationEnabled) {
    this(new V1alpha2ResourceHandle(), validationEnabled);
  }
  public V1alpha2ResourceHandleBuilder(V1alpha2ResourceHandleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2ResourceHandleBuilder(V1alpha2ResourceHandleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2ResourceHandle(), validationEnabled);
  }
  public V1alpha2ResourceHandleBuilder(V1alpha2ResourceHandleFluent<?> fluent,V1alpha2ResourceHandle instance) {
    this(fluent, instance, false);
  }
  public V1alpha2ResourceHandleBuilder(V1alpha2ResourceHandleFluent<?> fluent,V1alpha2ResourceHandle instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withData(instance.getData());
      fluent.withDriverName(instance.getDriverName());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2ResourceHandleBuilder(V1alpha2ResourceHandle instance) {
    this(instance,false);
  }
  public V1alpha2ResourceHandleBuilder(V1alpha2ResourceHandle instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withData(instance.getData());
      this.withDriverName(instance.getDriverName());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2ResourceHandleFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2ResourceHandle build() {
    V1alpha2ResourceHandle buildable = new V1alpha2ResourceHandle();
    buildable.setData(fluent.getData());
    buildable.setDriverName(fluent.getDriverName());
    return buildable;
  }
  
}