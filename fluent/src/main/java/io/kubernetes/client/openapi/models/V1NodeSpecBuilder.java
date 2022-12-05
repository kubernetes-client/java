package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NodeSpecBuilder extends V1NodeSpecFluentImpl<V1NodeSpecBuilder> implements VisitableBuilder<V1NodeSpec,V1NodeSpecBuilder>{
  public V1NodeSpecBuilder() {
    this(false);
  }
  public V1NodeSpecBuilder(Boolean validationEnabled) {
    this(new V1NodeSpec(), validationEnabled);
  }
  public V1NodeSpecBuilder(V1NodeSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NodeSpecBuilder(V1NodeSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NodeSpec(), validationEnabled);
  }
  public V1NodeSpecBuilder(V1NodeSpecFluent<?> fluent,V1NodeSpec instance) {
    this(fluent, instance, false);
  }
  public V1NodeSpecBuilder(V1NodeSpecFluent<?> fluent,V1NodeSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConfigSource(instance.getConfigSource());

    fluent.withExternalID(instance.getExternalID());

    fluent.withPodCIDR(instance.getPodCIDR());

    fluent.withPodCIDRs(instance.getPodCIDRs());

    fluent.withProviderID(instance.getProviderID());

    fluent.withTaints(instance.getTaints());

    fluent.withUnschedulable(instance.getUnschedulable());

    this.validationEnabled = validationEnabled; 
  }
  public V1NodeSpecBuilder(V1NodeSpec instance) {
    this(instance,false);
  }
  public V1NodeSpecBuilder(V1NodeSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConfigSource(instance.getConfigSource());

    this.withExternalID(instance.getExternalID());

    this.withPodCIDR(instance.getPodCIDR());

    this.withPodCIDRs(instance.getPodCIDRs());

    this.withProviderID(instance.getProviderID());

    this.withTaints(instance.getTaints());

    this.withUnschedulable(instance.getUnschedulable());

    this.validationEnabled = validationEnabled; 
  }
  V1NodeSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1NodeSpec build() {
    V1NodeSpec buildable = new V1NodeSpec();
    buildable.setConfigSource(fluent.getConfigSource());
    buildable.setExternalID(fluent.getExternalID());
    buildable.setPodCIDR(fluent.getPodCIDR());
    buildable.setPodCIDRs(fluent.getPodCIDRs());
    buildable.setProviderID(fluent.getProviderID());
    buildable.setTaints(fluent.getTaints());
    buildable.setUnschedulable(fluent.getUnschedulable());
    return buildable;
  }
  
}