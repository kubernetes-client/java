package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1TopologySpreadConstraintBuilder extends V1TopologySpreadConstraintFluent<V1TopologySpreadConstraintBuilder> implements VisitableBuilder<V1TopologySpreadConstraint,V1TopologySpreadConstraintBuilder>{
  public V1TopologySpreadConstraintBuilder() {
    this(new V1TopologySpreadConstraint());
  }
  
  public V1TopologySpreadConstraintBuilder(V1TopologySpreadConstraintFluent<?> fluent) {
    this(fluent, new V1TopologySpreadConstraint());
  }
  
  public V1TopologySpreadConstraintBuilder(V1TopologySpreadConstraintFluent<?> fluent,V1TopologySpreadConstraint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1TopologySpreadConstraintBuilder(V1TopologySpreadConstraint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1TopologySpreadConstraintFluent<?> fluent;
  
  public V1TopologySpreadConstraint build() {
    V1TopologySpreadConstraint buildable = new V1TopologySpreadConstraint();
    buildable.setLabelSelector(fluent.buildLabelSelector());
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