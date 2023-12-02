package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CSIDriverSpecBuilder extends V1CSIDriverSpecFluent<V1CSIDriverSpecBuilder> implements VisitableBuilder<V1CSIDriverSpec,V1CSIDriverSpecBuilder>{
  public V1CSIDriverSpecBuilder() {
    this(new V1CSIDriverSpec());
  }
  
  public V1CSIDriverSpecBuilder(V1CSIDriverSpecFluent<?> fluent) {
    this(fluent, new V1CSIDriverSpec());
  }
  
  public V1CSIDriverSpecBuilder(V1CSIDriverSpecFluent<?> fluent,V1CSIDriverSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CSIDriverSpecBuilder(V1CSIDriverSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CSIDriverSpecFluent<?> fluent;
  
  public V1CSIDriverSpec build() {
    V1CSIDriverSpec buildable = new V1CSIDriverSpec();
    buildable.setAttachRequired(fluent.getAttachRequired());
    buildable.setFsGroupPolicy(fluent.getFsGroupPolicy());
    buildable.setPodInfoOnMount(fluent.getPodInfoOnMount());
    buildable.setRequiresRepublish(fluent.getRequiresRepublish());
    buildable.setSeLinuxMount(fluent.getSeLinuxMount());
    buildable.setStorageCapacity(fluent.getStorageCapacity());
    buildable.setTokenRequests(fluent.buildTokenRequests());
    buildable.setVolumeLifecycleModes(fluent.getVolumeLifecycleModes());
    return buildable;
  }
  

}