package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1APIResourceListBuilder extends V1APIResourceListFluentImpl<V1APIResourceListBuilder> implements VisitableBuilder<V1APIResourceList,V1APIResourceListBuilder>{
  public V1APIResourceListBuilder() {
    this(false);
  }
  public V1APIResourceListBuilder(Boolean validationEnabled) {
    this(new V1APIResourceList(), validationEnabled);
  }
  public V1APIResourceListBuilder(V1APIResourceListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1APIResourceListBuilder(V1APIResourceListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1APIResourceList(), validationEnabled);
  }
  public V1APIResourceListBuilder(V1APIResourceListFluent<?> fluent,V1APIResourceList instance) {
    this(fluent, instance, false);
  }
  public V1APIResourceListBuilder(V1APIResourceListFluent<?> fluent,V1APIResourceList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withGroupVersion(instance.getGroupVersion());

    fluent.withKind(instance.getKind());

    fluent.withResources(instance.getResources());

    this.validationEnabled = validationEnabled; 
  }
  public V1APIResourceListBuilder(V1APIResourceList instance) {
    this(instance,false);
  }
  public V1APIResourceListBuilder(V1APIResourceList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withGroupVersion(instance.getGroupVersion());

    this.withKind(instance.getKind());

    this.withResources(instance.getResources());

    this.validationEnabled = validationEnabled; 
  }
  V1APIResourceListFluent<?> fluent;
  Boolean validationEnabled;
  public V1APIResourceList build() {
    V1APIResourceList buildable = new V1APIResourceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setGroupVersion(fluent.getGroupVersion());
    buildable.setKind(fluent.getKind());
    buildable.setResources(fluent.getResources());
    return buildable;
  }
  
}