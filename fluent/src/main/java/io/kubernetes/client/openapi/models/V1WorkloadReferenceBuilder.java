package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1WorkloadReferenceBuilder extends V1WorkloadReferenceFluent<V1WorkloadReferenceBuilder> implements VisitableBuilder<V1WorkloadReference,V1WorkloadReferenceBuilder>{

  V1WorkloadReferenceFluent<?> fluent;

  public V1WorkloadReferenceBuilder() {
    this(new V1WorkloadReference());
  }
  
  public V1WorkloadReferenceBuilder(V1WorkloadReferenceFluent<?> fluent) {
    this(fluent, new V1WorkloadReference());
  }
  
  public V1WorkloadReferenceBuilder(V1WorkloadReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1WorkloadReferenceBuilder(V1WorkloadReferenceFluent<?> fluent,V1WorkloadReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1WorkloadReference build() {
    V1WorkloadReference buildable = new V1WorkloadReference();
    buildable.setName(fluent.getName());
    buildable.setPodGroup(fluent.getPodGroup());
    buildable.setPodGroupReplicaKey(fluent.getPodGroupReplicaKey());
    return buildable;
  }
  
}