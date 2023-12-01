package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1HTTPIngressPathBuilder extends V1HTTPIngressPathFluent<V1HTTPIngressPathBuilder> implements VisitableBuilder<V1HTTPIngressPath,V1HTTPIngressPathBuilder>{
  public V1HTTPIngressPathBuilder() {
    this(new V1HTTPIngressPath());
  }
  
  public V1HTTPIngressPathBuilder(V1HTTPIngressPathFluent<?> fluent) {
    this(fluent, new V1HTTPIngressPath());
  }
  
  public V1HTTPIngressPathBuilder(V1HTTPIngressPathFluent<?> fluent,V1HTTPIngressPath instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1HTTPIngressPathBuilder(V1HTTPIngressPath instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1HTTPIngressPathFluent<?> fluent;
  
  public V1HTTPIngressPath build() {
    V1HTTPIngressPath buildable = new V1HTTPIngressPath();
    buildable.setBackend(fluent.buildBackend());
    buildable.setPath(fluent.getPath());
    buildable.setPathType(fluent.getPathType());
    return buildable;
  }
  

}