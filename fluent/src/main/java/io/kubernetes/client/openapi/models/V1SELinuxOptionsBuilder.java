package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SELinuxOptionsBuilder extends V1SELinuxOptionsFluent<V1SELinuxOptionsBuilder> implements VisitableBuilder<V1SELinuxOptions,V1SELinuxOptionsBuilder>{
  public V1SELinuxOptionsBuilder() {
    this(new V1SELinuxOptions());
  }
  
  public V1SELinuxOptionsBuilder(V1SELinuxOptionsFluent<?> fluent) {
    this(fluent, new V1SELinuxOptions());
  }
  
  public V1SELinuxOptionsBuilder(V1SELinuxOptionsFluent<?> fluent,V1SELinuxOptions instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SELinuxOptionsBuilder(V1SELinuxOptions instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SELinuxOptionsFluent<?> fluent;
  
  public V1SELinuxOptions build() {
    V1SELinuxOptions buildable = new V1SELinuxOptions();
    buildable.setLevel(fluent.getLevel());
    buildable.setRole(fluent.getRole());
    buildable.setType(fluent.getType());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  

}