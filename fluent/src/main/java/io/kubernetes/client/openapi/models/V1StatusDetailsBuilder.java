package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1StatusDetailsBuilder extends V1StatusDetailsFluent<V1StatusDetailsBuilder> implements VisitableBuilder<V1StatusDetails,V1StatusDetailsBuilder>{
  public V1StatusDetailsBuilder() {
    this(new V1StatusDetails());
  }
  
  public V1StatusDetailsBuilder(V1StatusDetailsFluent<?> fluent) {
    this(fluent, new V1StatusDetails());
  }
  
  public V1StatusDetailsBuilder(V1StatusDetailsFluent<?> fluent,V1StatusDetails instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1StatusDetailsBuilder(V1StatusDetails instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1StatusDetailsFluent<?> fluent;
  
  public V1StatusDetails build() {
    V1StatusDetails buildable = new V1StatusDetails();
    buildable.setCauses(fluent.buildCauses());
    buildable.setGroup(fluent.getGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setRetryAfterSeconds(fluent.getRetryAfterSeconds());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  

}