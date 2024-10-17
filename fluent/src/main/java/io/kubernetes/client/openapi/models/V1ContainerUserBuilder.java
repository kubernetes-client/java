package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ContainerUserBuilder extends V1ContainerUserFluent<V1ContainerUserBuilder> implements VisitableBuilder<V1ContainerUser,V1ContainerUserBuilder>{
  public V1ContainerUserBuilder() {
    this(new V1ContainerUser());
  }
  
  public V1ContainerUserBuilder(V1ContainerUserFluent<?> fluent) {
    this(fluent, new V1ContainerUser());
  }
  
  public V1ContainerUserBuilder(V1ContainerUserFluent<?> fluent,V1ContainerUser instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ContainerUserBuilder(V1ContainerUser instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ContainerUserFluent<?> fluent;
  
  public V1ContainerUser build() {
    V1ContainerUser buildable = new V1ContainerUser();
    buildable.setLinux(fluent.buildLinux());
    return buildable;
  }
  

}