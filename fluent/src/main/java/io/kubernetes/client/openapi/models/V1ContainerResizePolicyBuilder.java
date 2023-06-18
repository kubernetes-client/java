package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ContainerResizePolicyBuilder extends V1ContainerResizePolicyFluentImpl<V1ContainerResizePolicyBuilder> implements VisitableBuilder<V1ContainerResizePolicy,V1ContainerResizePolicyBuilder>{
  public V1ContainerResizePolicyBuilder() {
    this(false);
  }
  public V1ContainerResizePolicyBuilder(Boolean validationEnabled) {
    this(new V1ContainerResizePolicy(), validationEnabled);
  }
  public V1ContainerResizePolicyBuilder(V1ContainerResizePolicyFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ContainerResizePolicyBuilder(V1ContainerResizePolicyFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ContainerResizePolicy(), validationEnabled);
  }
  public V1ContainerResizePolicyBuilder(V1ContainerResizePolicyFluent<?> fluent,V1ContainerResizePolicy instance) {
    this(fluent, instance, false);
  }
  public V1ContainerResizePolicyBuilder(V1ContainerResizePolicyFluent<?> fluent,V1ContainerResizePolicy instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withResourceName(instance.getResourceName());
      fluent.withRestartPolicy(instance.getRestartPolicy());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1ContainerResizePolicyBuilder(V1ContainerResizePolicy instance) {
    this(instance,false);
  }
  public V1ContainerResizePolicyBuilder(V1ContainerResizePolicy instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withResourceName(instance.getResourceName());
      this.withRestartPolicy(instance.getRestartPolicy());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1ContainerResizePolicyFluent<?> fluent;
  Boolean validationEnabled;
  public V1ContainerResizePolicy build() {
    V1ContainerResizePolicy buildable = new V1ContainerResizePolicy();
    buildable.setResourceName(fluent.getResourceName());
    buildable.setRestartPolicy(fluent.getRestartPolicy());
    return buildable;
  }
  
}