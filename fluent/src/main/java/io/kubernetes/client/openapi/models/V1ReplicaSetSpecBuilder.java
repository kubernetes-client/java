package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ReplicaSetSpecBuilder extends V1ReplicaSetSpecFluentImpl<V1ReplicaSetSpecBuilder> implements VisitableBuilder<V1ReplicaSetSpec,V1ReplicaSetSpecBuilder>{
  public V1ReplicaSetSpecBuilder() {
    this(false);
  }
  public V1ReplicaSetSpecBuilder(Boolean validationEnabled) {
    this(new V1ReplicaSetSpec(), validationEnabled);
  }
  public V1ReplicaSetSpecBuilder(V1ReplicaSetSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ReplicaSetSpecBuilder(V1ReplicaSetSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ReplicaSetSpec(), validationEnabled);
  }
  public V1ReplicaSetSpecBuilder(V1ReplicaSetSpecFluent<?> fluent,V1ReplicaSetSpec instance) {
    this(fluent, instance, false);
  }
  public V1ReplicaSetSpecBuilder(V1ReplicaSetSpecFluent<?> fluent,V1ReplicaSetSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMinReadySeconds(instance.getMinReadySeconds());

    fluent.withReplicas(instance.getReplicas());

    fluent.withSelector(instance.getSelector());

    fluent.withTemplate(instance.getTemplate());

    this.validationEnabled = validationEnabled; 
  }
  public V1ReplicaSetSpecBuilder(V1ReplicaSetSpec instance) {
    this(instance,false);
  }
  public V1ReplicaSetSpecBuilder(V1ReplicaSetSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withReplicas(instance.getReplicas());

    this.withSelector(instance.getSelector());

    this.withTemplate(instance.getTemplate());

    this.validationEnabled = validationEnabled; 
  }
  V1ReplicaSetSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1ReplicaSetSpec build() {
    V1ReplicaSetSpec buildable = new V1ReplicaSetSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setSelector(fluent.getSelector());
    buildable.setTemplate(fluent.getTemplate());
    return buildable;
  }
  
}