package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1StatefulSetOrdinalsBuilder extends V1StatefulSetOrdinalsFluentImpl<V1StatefulSetOrdinalsBuilder> implements VisitableBuilder<V1StatefulSetOrdinals,V1StatefulSetOrdinalsBuilder>{
  public V1StatefulSetOrdinalsBuilder() {
    this(false);
  }
  public V1StatefulSetOrdinalsBuilder(Boolean validationEnabled) {
    this(new V1StatefulSetOrdinals(), validationEnabled);
  }
  public V1StatefulSetOrdinalsBuilder(V1StatefulSetOrdinalsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1StatefulSetOrdinalsBuilder(V1StatefulSetOrdinalsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1StatefulSetOrdinals(), validationEnabled);
  }
  public V1StatefulSetOrdinalsBuilder(V1StatefulSetOrdinalsFluent<?> fluent,V1StatefulSetOrdinals instance) {
    this(fluent, instance, false);
  }
  public V1StatefulSetOrdinalsBuilder(V1StatefulSetOrdinalsFluent<?> fluent,V1StatefulSetOrdinals instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withStart(instance.getStart());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1StatefulSetOrdinalsBuilder(V1StatefulSetOrdinals instance) {
    this(instance,false);
  }
  public V1StatefulSetOrdinalsBuilder(V1StatefulSetOrdinals instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withStart(instance.getStart());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1StatefulSetOrdinalsFluent<?> fluent;
  Boolean validationEnabled;
  public V1StatefulSetOrdinals build() {
    V1StatefulSetOrdinals buildable = new V1StatefulSetOrdinals();
    buildable.setStart(fluent.getStart());
    return buildable;
  }
  
}