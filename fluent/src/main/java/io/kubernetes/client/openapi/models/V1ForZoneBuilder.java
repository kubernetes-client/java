package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ForZoneBuilder extends V1ForZoneFluentImpl<V1ForZoneBuilder> implements VisitableBuilder<V1ForZone,V1ForZoneBuilder>{
  public V1ForZoneBuilder() {
    this(false);
  }
  public V1ForZoneBuilder(Boolean validationEnabled) {
    this(new V1ForZone(), validationEnabled);
  }
  public V1ForZoneBuilder(V1ForZoneFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ForZoneBuilder(V1ForZoneFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ForZone(), validationEnabled);
  }
  public V1ForZoneBuilder(V1ForZoneFluent<?> fluent,V1ForZone instance) {
    this(fluent, instance, false);
  }
  public V1ForZoneBuilder(V1ForZoneFluent<?> fluent,V1ForZone instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1ForZoneBuilder(V1ForZone instance) {
    this(instance,false);
  }
  public V1ForZoneBuilder(V1ForZone instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V1ForZoneFluent<?> fluent;
  Boolean validationEnabled;
  public V1ForZone build() {
    V1ForZone buildable = new V1ForZone();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}