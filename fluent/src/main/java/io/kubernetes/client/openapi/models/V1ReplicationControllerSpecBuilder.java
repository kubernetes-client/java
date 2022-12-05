package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ReplicationControllerSpecBuilder extends V1ReplicationControllerSpecFluentImpl<V1ReplicationControllerSpecBuilder> implements VisitableBuilder<V1ReplicationControllerSpec,V1ReplicationControllerSpecBuilder>{
  public V1ReplicationControllerSpecBuilder() {
    this(false);
  }
  public V1ReplicationControllerSpecBuilder(Boolean validationEnabled) {
    this(new V1ReplicationControllerSpec(), validationEnabled);
  }
  public V1ReplicationControllerSpecBuilder(V1ReplicationControllerSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ReplicationControllerSpecBuilder(V1ReplicationControllerSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ReplicationControllerSpec(), validationEnabled);
  }
  public V1ReplicationControllerSpecBuilder(V1ReplicationControllerSpecFluent<?> fluent,V1ReplicationControllerSpec instance) {
    this(fluent, instance, false);
  }
  public V1ReplicationControllerSpecBuilder(V1ReplicationControllerSpecFluent<?> fluent,V1ReplicationControllerSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMinReadySeconds(instance.getMinReadySeconds());

    fluent.withReplicas(instance.getReplicas());

    fluent.withSelector(instance.getSelector());

    fluent.withTemplate(instance.getTemplate());

    this.validationEnabled = validationEnabled; 
  }
  public V1ReplicationControllerSpecBuilder(V1ReplicationControllerSpec instance) {
    this(instance,false);
  }
  public V1ReplicationControllerSpecBuilder(V1ReplicationControllerSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withReplicas(instance.getReplicas());

    this.withSelector(instance.getSelector());

    this.withTemplate(instance.getTemplate());

    this.validationEnabled = validationEnabled; 
  }
  V1ReplicationControllerSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1ReplicationControllerSpec build() {
    V1ReplicationControllerSpec buildable = new V1ReplicationControllerSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setSelector(fluent.getSelector());
    buildable.setTemplate(fluent.getTemplate());
    return buildable;
  }
  
}