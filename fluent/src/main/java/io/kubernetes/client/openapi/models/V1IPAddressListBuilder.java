package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1IPAddressListBuilder extends V1IPAddressListFluent<V1IPAddressListBuilder> implements VisitableBuilder<V1IPAddressList,V1IPAddressListBuilder>{
  public V1IPAddressListBuilder() {
    this(new V1IPAddressList());
  }
  
  public V1IPAddressListBuilder(V1IPAddressListFluent<?> fluent) {
    this(fluent, new V1IPAddressList());
  }
  
  public V1IPAddressListBuilder(V1IPAddressListFluent<?> fluent,V1IPAddressList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1IPAddressListBuilder(V1IPAddressList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1IPAddressListFluent<?> fluent;
  
  public V1IPAddressList build() {
    V1IPAddressList buildable = new V1IPAddressList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}