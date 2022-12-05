package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1HTTPIngressPathBuilder extends V1HTTPIngressPathFluentImpl<V1HTTPIngressPathBuilder> implements VisitableBuilder<V1HTTPIngressPath,V1HTTPIngressPathBuilder>{
  public V1HTTPIngressPathBuilder() {
    this(false);
  }
  public V1HTTPIngressPathBuilder(Boolean validationEnabled) {
    this(new V1HTTPIngressPath(), validationEnabled);
  }
  public V1HTTPIngressPathBuilder(V1HTTPIngressPathFluent<?> fluent) {
    this(fluent, false);
  }
  public V1HTTPIngressPathBuilder(V1HTTPIngressPathFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1HTTPIngressPath(), validationEnabled);
  }
  public V1HTTPIngressPathBuilder(V1HTTPIngressPathFluent<?> fluent,V1HTTPIngressPath instance) {
    this(fluent, instance, false);
  }
  public V1HTTPIngressPathBuilder(V1HTTPIngressPathFluent<?> fluent,V1HTTPIngressPath instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withBackend(instance.getBackend());

    fluent.withPath(instance.getPath());

    fluent.withPathType(instance.getPathType());

    this.validationEnabled = validationEnabled; 
  }
  public V1HTTPIngressPathBuilder(V1HTTPIngressPath instance) {
    this(instance,false);
  }
  public V1HTTPIngressPathBuilder(V1HTTPIngressPath instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withBackend(instance.getBackend());

    this.withPath(instance.getPath());

    this.withPathType(instance.getPathType());

    this.validationEnabled = validationEnabled; 
  }
  V1HTTPIngressPathFluent<?> fluent;
  Boolean validationEnabled;
  public V1HTTPIngressPath build() {
    V1HTTPIngressPath buildable = new V1HTTPIngressPath();
    buildable.setBackend(fluent.getBackend());
    buildable.setPath(fluent.getPath());
    buildable.setPathType(fluent.getPathType());
    return buildable;
  }
  
}