package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NodeDaemonEndpointsBuilder extends V1NodeDaemonEndpointsFluentImpl<V1NodeDaemonEndpointsBuilder> implements VisitableBuilder<V1NodeDaemonEndpoints,V1NodeDaemonEndpointsBuilder>{
  public V1NodeDaemonEndpointsBuilder() {
    this(false);
  }
  public V1NodeDaemonEndpointsBuilder(Boolean validationEnabled) {
    this(new V1NodeDaemonEndpoints(), validationEnabled);
  }
  public V1NodeDaemonEndpointsBuilder(V1NodeDaemonEndpointsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NodeDaemonEndpointsBuilder(V1NodeDaemonEndpointsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NodeDaemonEndpoints(), validationEnabled);
  }
  public V1NodeDaemonEndpointsBuilder(V1NodeDaemonEndpointsFluent<?> fluent,V1NodeDaemonEndpoints instance) {
    this(fluent, instance, false);
  }
  public V1NodeDaemonEndpointsBuilder(V1NodeDaemonEndpointsFluent<?> fluent,V1NodeDaemonEndpoints instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withKubeletEndpoint(instance.getKubeletEndpoint());

    this.validationEnabled = validationEnabled; 
  }
  public V1NodeDaemonEndpointsBuilder(V1NodeDaemonEndpoints instance) {
    this(instance,false);
  }
  public V1NodeDaemonEndpointsBuilder(V1NodeDaemonEndpoints instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withKubeletEndpoint(instance.getKubeletEndpoint());

    this.validationEnabled = validationEnabled; 
  }
  V1NodeDaemonEndpointsFluent<?> fluent;
  Boolean validationEnabled;
  public V1NodeDaemonEndpoints build() {
    V1NodeDaemonEndpoints buildable = new V1NodeDaemonEndpoints();
    buildable.setKubeletEndpoint(fluent.getKubeletEndpoint());
    return buildable;
  }
  
}