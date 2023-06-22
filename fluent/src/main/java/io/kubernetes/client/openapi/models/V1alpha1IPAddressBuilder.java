package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1IPAddressBuilder extends V1alpha1IPAddressFluentImpl<V1alpha1IPAddressBuilder> implements VisitableBuilder<V1alpha1IPAddress,V1alpha1IPAddressBuilder>{
  public V1alpha1IPAddressBuilder() {
    this(false);
  }
  public V1alpha1IPAddressBuilder(Boolean validationEnabled) {
    this(new V1alpha1IPAddress(), validationEnabled);
  }
  public V1alpha1IPAddressBuilder(V1alpha1IPAddressFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1IPAddressBuilder(V1alpha1IPAddressFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1IPAddress(), validationEnabled);
  }
  public V1alpha1IPAddressBuilder(V1alpha1IPAddressFluent<?> fluent,V1alpha1IPAddress instance) {
    this(fluent, instance, false);
  }
  public V1alpha1IPAddressBuilder(V1alpha1IPAddressFluent<?> fluent,V1alpha1IPAddress instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
      fluent.withSpec(instance.getSpec());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1IPAddressBuilder(V1alpha1IPAddress instance) {
    this(instance,false);
  }
  public V1alpha1IPAddressBuilder(V1alpha1IPAddress instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withSpec(instance.getSpec());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1IPAddressFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1IPAddress build() {
    V1alpha1IPAddress buildable = new V1alpha1IPAddress();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
  
}