package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CSIDriverSpecBuilder extends V1CSIDriverSpecFluentImpl<V1CSIDriverSpecBuilder> implements VisitableBuilder<V1CSIDriverSpec,V1CSIDriverSpecBuilder>{
  public V1CSIDriverSpecBuilder() {
    this(false);
  }
  public V1CSIDriverSpecBuilder(Boolean validationEnabled) {
    this(new V1CSIDriverSpec(), validationEnabled);
  }
  public V1CSIDriverSpecBuilder(V1CSIDriverSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CSIDriverSpecBuilder(V1CSIDriverSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CSIDriverSpec(), validationEnabled);
  }
  public V1CSIDriverSpecBuilder(V1CSIDriverSpecFluent<?> fluent,V1CSIDriverSpec instance) {
    this(fluent, instance, false);
  }
  public V1CSIDriverSpecBuilder(V1CSIDriverSpecFluent<?> fluent,V1CSIDriverSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAttachRequired(instance.getAttachRequired());

    fluent.withFsGroupPolicy(instance.getFsGroupPolicy());

    fluent.withPodInfoOnMount(instance.getPodInfoOnMount());

    fluent.withRequiresRepublish(instance.getRequiresRepublish());

    fluent.withSeLinuxMount(instance.getSeLinuxMount());

    fluent.withStorageCapacity(instance.getStorageCapacity());

    fluent.withTokenRequests(instance.getTokenRequests());

    fluent.withVolumeLifecycleModes(instance.getVolumeLifecycleModes());

    this.validationEnabled = validationEnabled; 
  }
  public V1CSIDriverSpecBuilder(V1CSIDriverSpec instance) {
    this(instance,false);
  }
  public V1CSIDriverSpecBuilder(V1CSIDriverSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAttachRequired(instance.getAttachRequired());

    this.withFsGroupPolicy(instance.getFsGroupPolicy());

    this.withPodInfoOnMount(instance.getPodInfoOnMount());

    this.withRequiresRepublish(instance.getRequiresRepublish());

    this.withSeLinuxMount(instance.getSeLinuxMount());

    this.withStorageCapacity(instance.getStorageCapacity());

    this.withTokenRequests(instance.getTokenRequests());

    this.withVolumeLifecycleModes(instance.getVolumeLifecycleModes());

    this.validationEnabled = validationEnabled; 
  }
  V1CSIDriverSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1CSIDriverSpec build() {
    V1CSIDriverSpec buildable = new V1CSIDriverSpec();
    buildable.setAttachRequired(fluent.getAttachRequired());
    buildable.setFsGroupPolicy(fluent.getFsGroupPolicy());
    buildable.setPodInfoOnMount(fluent.getPodInfoOnMount());
    buildable.setRequiresRepublish(fluent.getRequiresRepublish());
    buildable.setSeLinuxMount(fluent.getSeLinuxMount());
    buildable.setStorageCapacity(fluent.getStorageCapacity());
    buildable.setTokenRequests(fluent.getTokenRequests());
    buildable.setVolumeLifecycleModes(fluent.getVolumeLifecycleModes());
    return buildable;
  }
  
}