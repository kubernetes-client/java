package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceClassListBuilder extends V1alpha3DeviceClassListFluent<V1alpha3DeviceClassListBuilder> implements VisitableBuilder<V1alpha3DeviceClassList,V1alpha3DeviceClassListBuilder>{
  public V1alpha3DeviceClassListBuilder() {
    this(new V1alpha3DeviceClassList());
  }
  
  public V1alpha3DeviceClassListBuilder(V1alpha3DeviceClassListFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceClassList());
  }
  
  public V1alpha3DeviceClassListBuilder(V1alpha3DeviceClassListFluent<?> fluent,V1alpha3DeviceClassList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceClassListBuilder(V1alpha3DeviceClassList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceClassListFluent<?> fluent;
  
  public V1alpha3DeviceClassList build() {
    V1alpha3DeviceClassList buildable = new V1alpha3DeviceClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}