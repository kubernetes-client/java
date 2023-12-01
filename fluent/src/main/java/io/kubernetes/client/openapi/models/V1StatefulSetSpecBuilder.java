package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1StatefulSetSpecBuilder extends V1StatefulSetSpecFluent<V1StatefulSetSpecBuilder> implements VisitableBuilder<V1StatefulSetSpec,V1StatefulSetSpecBuilder>{
  public V1StatefulSetSpecBuilder() {
    this(new V1StatefulSetSpec());
  }
  
  public V1StatefulSetSpecBuilder(V1StatefulSetSpecFluent<?> fluent) {
    this(fluent, new V1StatefulSetSpec());
  }
  
  public V1StatefulSetSpecBuilder(V1StatefulSetSpecFluent<?> fluent,V1StatefulSetSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1StatefulSetSpecBuilder(V1StatefulSetSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1StatefulSetSpecFluent<?> fluent;
  
  public V1StatefulSetSpec build() {
    V1StatefulSetSpec buildable = new V1StatefulSetSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setOrdinals(fluent.buildOrdinals());
    buildable.setPersistentVolumeClaimRetentionPolicy(fluent.buildPersistentVolumeClaimRetentionPolicy());
    buildable.setPodManagementPolicy(fluent.getPodManagementPolicy());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setRevisionHistoryLimit(fluent.getRevisionHistoryLimit());
    buildable.setSelector(fluent.buildSelector());
    buildable.setServiceName(fluent.getServiceName());
    buildable.setTemplate(fluent.buildTemplate());
    buildable.setUpdateStrategy(fluent.buildUpdateStrategy());
    buildable.setVolumeClaimTemplates(fluent.buildVolumeClaimTemplates());
    return buildable;
  }
  

}