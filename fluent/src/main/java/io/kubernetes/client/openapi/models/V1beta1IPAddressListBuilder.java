package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1IPAddressListBuilder extends V1beta1IPAddressListFluent<V1beta1IPAddressListBuilder> implements VisitableBuilder<V1beta1IPAddressList,V1beta1IPAddressListBuilder>{
  public V1beta1IPAddressListBuilder() {
    this(new V1beta1IPAddressList());
  }
  
  public V1beta1IPAddressListBuilder(V1beta1IPAddressListFluent<?> fluent) {
    this(fluent, new V1beta1IPAddressList());
  }
  
  public V1beta1IPAddressListBuilder(V1beta1IPAddressListFluent<?> fluent,V1beta1IPAddressList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1IPAddressListBuilder(V1beta1IPAddressList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1IPAddressListFluent<?> fluent;
  
  public V1beta1IPAddressList build() {
    V1beta1IPAddressList buildable = new V1beta1IPAddressList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}