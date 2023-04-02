package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1StatefulSetSpecBuilder extends V1StatefulSetSpecFluentImpl<V1StatefulSetSpecBuilder> implements VisitableBuilder<V1StatefulSetSpec,V1StatefulSetSpecBuilder>{
  public V1StatefulSetSpecBuilder() {
    this(false);
  }
  public V1StatefulSetSpecBuilder(Boolean validationEnabled) {
    this(new V1StatefulSetSpec(), validationEnabled);
  }
  public V1StatefulSetSpecBuilder(V1StatefulSetSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1StatefulSetSpecBuilder(V1StatefulSetSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1StatefulSetSpec(), validationEnabled);
  }
  public V1StatefulSetSpecBuilder(V1StatefulSetSpecFluent<?> fluent,V1StatefulSetSpec instance) {
    this(fluent, instance, false);
  }
  public V1StatefulSetSpecBuilder(V1StatefulSetSpecFluent<?> fluent,V1StatefulSetSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMinReadySeconds(instance.getMinReadySeconds());

    fluent.withPersistentVolumeClaimRetentionPolicy(instance.getPersistentVolumeClaimRetentionPolicy());

    fluent.withPodManagementPolicy(instance.getPodManagementPolicy());

    fluent.withReplicas(instance.getReplicas());

    fluent.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());

    fluent.withSelector(instance.getSelector());

    fluent.withServiceName(instance.getServiceName());

    fluent.withTemplate(instance.getTemplate());

    fluent.withUpdateStrategy(instance.getUpdateStrategy());

    fluent.withVolumeClaimTemplates(instance.getVolumeClaimTemplates());

    this.validationEnabled = validationEnabled; 
  }
  public V1StatefulSetSpecBuilder(V1StatefulSetSpec instance) {
    this(instance,false);
  }
  public V1StatefulSetSpecBuilder(V1StatefulSetSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withPersistentVolumeClaimRetentionPolicy(instance.getPersistentVolumeClaimRetentionPolicy());

    this.withPodManagementPolicy(instance.getPodManagementPolicy());

    this.withReplicas(instance.getReplicas());

    this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());

    this.withSelector(instance.getSelector());

    this.withServiceName(instance.getServiceName());

    this.withTemplate(instance.getTemplate());

    this.withUpdateStrategy(instance.getUpdateStrategy());

    this.withVolumeClaimTemplates(instance.getVolumeClaimTemplates());

    this.validationEnabled = validationEnabled; 
  }
  V1StatefulSetSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1StatefulSetSpec build() {
    V1StatefulSetSpec buildable = new V1StatefulSetSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setPersistentVolumeClaimRetentionPolicy(fluent.getPersistentVolumeClaimRetentionPolicy());
    buildable.setPodManagementPolicy(fluent.getPodManagementPolicy());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setRevisionHistoryLimit(fluent.getRevisionHistoryLimit());
    buildable.setSelector(fluent.getSelector());
    buildable.setServiceName(fluent.getServiceName());
    buildable.setTemplate(fluent.getTemplate());
    buildable.setUpdateStrategy(fluent.getUpdateStrategy());
    buildable.setVolumeClaimTemplates(fluent.getVolumeClaimTemplates());
    return buildable;
  }
  
}