package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1IPAddressListBuilder extends V1alpha1IPAddressListFluentImpl<V1alpha1IPAddressListBuilder> implements VisitableBuilder<V1alpha1IPAddressList,V1alpha1IPAddressListBuilder>{
  public V1alpha1IPAddressListBuilder() {
    this(false);
  }
  public V1alpha1IPAddressListBuilder(Boolean validationEnabled) {
    this(new V1alpha1IPAddressList(), validationEnabled);
  }
  public V1alpha1IPAddressListBuilder(V1alpha1IPAddressListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1IPAddressListBuilder(V1alpha1IPAddressListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1IPAddressList(), validationEnabled);
  }
  public V1alpha1IPAddressListBuilder(V1alpha1IPAddressListFluent<?> fluent,V1alpha1IPAddressList instance) {
    this(fluent, instance, false);
  }
  public V1alpha1IPAddressListBuilder(V1alpha1IPAddressListFluent<?> fluent,V1alpha1IPAddressList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withItems(instance.getItems());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1IPAddressListBuilder(V1alpha1IPAddressList instance) {
    this(instance,false);
  }
  public V1alpha1IPAddressListBuilder(V1alpha1IPAddressList instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withItems(instance.getItems());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1IPAddressListFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1IPAddressList build() {
    V1alpha1IPAddressList buildable = new V1alpha1IPAddressList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}