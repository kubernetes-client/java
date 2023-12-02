package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ForZoneBuilder extends V1ForZoneFluent<V1ForZoneBuilder> implements VisitableBuilder<V1ForZone,V1ForZoneBuilder>{
  public V1ForZoneBuilder() {
    this(new V1ForZone());
  }
  
  public V1ForZoneBuilder(V1ForZoneFluent<?> fluent) {
    this(fluent, new V1ForZone());
  }
  
  public V1ForZoneBuilder(V1ForZoneFluent<?> fluent,V1ForZone instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ForZoneBuilder(V1ForZone instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ForZoneFluent<?> fluent;
  
  public V1ForZone build() {
    V1ForZone buildable = new V1ForZone();
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}