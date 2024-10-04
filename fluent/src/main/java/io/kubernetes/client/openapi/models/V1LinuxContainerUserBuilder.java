package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LinuxContainerUserBuilder extends V1LinuxContainerUserFluent<V1LinuxContainerUserBuilder> implements VisitableBuilder<V1LinuxContainerUser,V1LinuxContainerUserBuilder>{
  public V1LinuxContainerUserBuilder() {
    this(new V1LinuxContainerUser());
  }
  
  public V1LinuxContainerUserBuilder(V1LinuxContainerUserFluent<?> fluent) {
    this(fluent, new V1LinuxContainerUser());
  }
  
  public V1LinuxContainerUserBuilder(V1LinuxContainerUserFluent<?> fluent,V1LinuxContainerUser instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LinuxContainerUserBuilder(V1LinuxContainerUser instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LinuxContainerUserFluent<?> fluent;
  
  public V1LinuxContainerUser build() {
    V1LinuxContainerUser buildable = new V1LinuxContainerUser();
    buildable.setGid(fluent.getGid());
    buildable.setSupplementalGroups(fluent.getSupplementalGroups());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  

}