package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1IPAddressListBuilder extends V1alpha1IPAddressListFluent<V1alpha1IPAddressListBuilder> implements VisitableBuilder<V1alpha1IPAddressList,V1alpha1IPAddressListBuilder>{
  public V1alpha1IPAddressListBuilder() {
    this(new V1alpha1IPAddressList());
  }
  
  public V1alpha1IPAddressListBuilder(V1alpha1IPAddressListFluent<?> fluent) {
    this(fluent, new V1alpha1IPAddressList());
  }
  
  public V1alpha1IPAddressListBuilder(V1alpha1IPAddressListFluent<?> fluent,V1alpha1IPAddressList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1IPAddressListBuilder(V1alpha1IPAddressList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1IPAddressListFluent<?> fluent;
  
  public V1alpha1IPAddressList build() {
    V1alpha1IPAddressList buildable = new V1alpha1IPAddressList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}