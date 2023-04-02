package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SELinuxOptionsBuilder extends V1SELinuxOptionsFluentImpl<V1SELinuxOptionsBuilder> implements VisitableBuilder<V1SELinuxOptions,V1SELinuxOptionsBuilder>{
  public V1SELinuxOptionsBuilder() {
    this(false);
  }
  public V1SELinuxOptionsBuilder(Boolean validationEnabled) {
    this(new V1SELinuxOptions(), validationEnabled);
  }
  public V1SELinuxOptionsBuilder(V1SELinuxOptionsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SELinuxOptionsBuilder(V1SELinuxOptionsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1SELinuxOptions(), validationEnabled);
  }
  public V1SELinuxOptionsBuilder(V1SELinuxOptionsFluent<?> fluent,V1SELinuxOptions instance) {
    this(fluent, instance, false);
  }
  public V1SELinuxOptionsBuilder(V1SELinuxOptionsFluent<?> fluent,V1SELinuxOptions instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLevel(instance.getLevel());

    fluent.withRole(instance.getRole());

    fluent.withType(instance.getType());

    fluent.withUser(instance.getUser());

    this.validationEnabled = validationEnabled; 
  }
  public V1SELinuxOptionsBuilder(V1SELinuxOptions instance) {
    this(instance,false);
  }
  public V1SELinuxOptionsBuilder(V1SELinuxOptions instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLevel(instance.getLevel());

    this.withRole(instance.getRole());

    this.withType(instance.getType());

    this.withUser(instance.getUser());

    this.validationEnabled = validationEnabled; 
  }
  V1SELinuxOptionsFluent<?> fluent;
  Boolean validationEnabled;
  public V1SELinuxOptions build() {
    V1SELinuxOptions buildable = new V1SELinuxOptions();
    buildable.setLevel(fluent.getLevel());
    buildable.setRole(fluent.getRole());
    buildable.setType(fluent.getType());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  
}