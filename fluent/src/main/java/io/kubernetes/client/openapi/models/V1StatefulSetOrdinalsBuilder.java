package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1StatefulSetOrdinalsBuilder extends V1StatefulSetOrdinalsFluent<V1StatefulSetOrdinalsBuilder> implements VisitableBuilder<V1StatefulSetOrdinals,V1StatefulSetOrdinalsBuilder>{
  public V1StatefulSetOrdinalsBuilder() {
    this(new V1StatefulSetOrdinals());
  }
  
  public V1StatefulSetOrdinalsBuilder(V1StatefulSetOrdinalsFluent<?> fluent) {
    this(fluent, new V1StatefulSetOrdinals());
  }
  
  public V1StatefulSetOrdinalsBuilder(V1StatefulSetOrdinalsFluent<?> fluent,V1StatefulSetOrdinals instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1StatefulSetOrdinalsBuilder(V1StatefulSetOrdinals instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1StatefulSetOrdinalsFluent<?> fluent;
  
  public V1StatefulSetOrdinals build() {
    V1StatefulSetOrdinals buildable = new V1StatefulSetOrdinals();
    buildable.setStart(fluent.getStart());
    return buildable;
  }
  

}