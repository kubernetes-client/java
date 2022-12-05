package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1TopologySpreadConstraintBuilder extends V1TopologySpreadConstraintFluentImpl<V1TopologySpreadConstraintBuilder> implements VisitableBuilder<V1TopologySpreadConstraint,V1TopologySpreadConstraintBuilder>{
  public V1TopologySpreadConstraintBuilder() {
    this(false);
  }
  public V1TopologySpreadConstraintBuilder(Boolean validationEnabled) {
    this(new V1TopologySpreadConstraint(), validationEnabled);
  }
  public V1TopologySpreadConstraintBuilder(V1TopologySpreadConstraintFluent<?> fluent) {
    this(fluent, false);
  }
  public V1TopologySpreadConstraintBuilder(V1TopologySpreadConstraintFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1TopologySpreadConstraint(), validationEnabled);
  }
  public V1TopologySpreadConstraintBuilder(V1TopologySpreadConstraintFluent<?> fluent,V1TopologySpreadConstraint instance) {
    this(fluent, instance, false);
  }
  public V1TopologySpreadConstraintBuilder(V1TopologySpreadConstraintFluent<?> fluent,V1TopologySpreadConstraint instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLabelSelector(instance.getLabelSelector());

    fluent.withMatchLabelKeys(instance.getMatchLabelKeys());

    fluent.withMaxSkew(instance.getMaxSkew());

    fluent.withMinDomains(instance.getMinDomains());

    fluent.withNodeAffinityPolicy(instance.getNodeAffinityPolicy());

    fluent.withNodeTaintsPolicy(instance.getNodeTaintsPolicy());

    fluent.withTopologyKey(instance.getTopologyKey());

    fluent.withWhenUnsatisfiable(instance.getWhenUnsatisfiable());

    this.validationEnabled = validationEnabled; 
  }
  public V1TopologySpreadConstraintBuilder(V1TopologySpreadConstraint instance) {
    this(instance,false);
  }
  public V1TopologySpreadConstraintBuilder(V1TopologySpreadConstraint instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLabelSelector(instance.getLabelSelector());

    this.withMatchLabelKeys(instance.getMatchLabelKeys());

    this.withMaxSkew(instance.getMaxSkew());

    this.withMinDomains(instance.getMinDomains());

    this.withNodeAffinityPolicy(instance.getNodeAffinityPolicy());

    this.withNodeTaintsPolicy(instance.getNodeTaintsPolicy());

    this.withTopologyKey(instance.getTopologyKey());

    this.withWhenUnsatisfiable(instance.getWhenUnsatisfiable());

    this.validationEnabled = validationEnabled; 
  }
  V1TopologySpreadConstraintFluent<?> fluent;
  Boolean validationEnabled;
  public V1TopologySpreadConstraint build() {
    V1TopologySpreadConstraint buildable = new V1TopologySpreadConstraint();
    buildable.setLabelSelector(fluent.getLabelSelector());
    buildable.setMatchLabelKeys(fluent.getMatchLabelKeys());
    buildable.setMaxSkew(fluent.getMaxSkew());
    buildable.setMinDomains(fluent.getMinDomains());
    buildable.setNodeAffinityPolicy(fluent.getNodeAffinityPolicy());
    buildable.setNodeTaintsPolicy(fluent.getNodeTaintsPolicy());
    buildable.setTopologyKey(fluent.getTopologyKey());
    buildable.setWhenUnsatisfiable(fluent.getWhenUnsatisfiable());
    return buildable;
  }
  
}