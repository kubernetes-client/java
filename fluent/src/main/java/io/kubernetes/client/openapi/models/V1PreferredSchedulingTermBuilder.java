package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PreferredSchedulingTermBuilder extends V1PreferredSchedulingTermFluent<V1PreferredSchedulingTermBuilder> implements VisitableBuilder<V1PreferredSchedulingTerm,V1PreferredSchedulingTermBuilder>{
  public V1PreferredSchedulingTermBuilder() {
    this(new V1PreferredSchedulingTerm());
  }
  
  public V1PreferredSchedulingTermBuilder(V1PreferredSchedulingTermFluent<?> fluent) {
    this(fluent, new V1PreferredSchedulingTerm());
  }
  
  public V1PreferredSchedulingTermBuilder(V1PreferredSchedulingTermFluent<?> fluent,V1PreferredSchedulingTerm instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PreferredSchedulingTermBuilder(V1PreferredSchedulingTerm instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PreferredSchedulingTermFluent<?> fluent;
  
  public V1PreferredSchedulingTerm build() {
    V1PreferredSchedulingTerm buildable = new V1PreferredSchedulingTerm();
    buildable.setPreference(fluent.buildPreference());
    buildable.setWeight(fluent.getWeight());
    return buildable;
  }
  

}