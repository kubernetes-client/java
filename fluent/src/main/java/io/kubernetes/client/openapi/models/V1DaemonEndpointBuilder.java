package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1DaemonEndpointBuilder extends V1DaemonEndpointFluentImpl<V1DaemonEndpointBuilder> implements VisitableBuilder<V1DaemonEndpoint,V1DaemonEndpointBuilder>{
  public V1DaemonEndpointBuilder() {
    this(false);
  }
  public V1DaemonEndpointBuilder(Boolean validationEnabled) {
    this(new V1DaemonEndpoint(), validationEnabled);
  }
  public V1DaemonEndpointBuilder(V1DaemonEndpointFluent<?> fluent) {
    this(fluent, false);
  }
  public V1DaemonEndpointBuilder(V1DaemonEndpointFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1DaemonEndpoint(), validationEnabled);
  }
  public V1DaemonEndpointBuilder(V1DaemonEndpointFluent<?> fluent,V1DaemonEndpoint instance) {
    this(fluent, instance, false);
  }
  public V1DaemonEndpointBuilder(V1DaemonEndpointFluent<?> fluent,V1DaemonEndpoint instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPort(instance.getPort());

    this.validationEnabled = validationEnabled; 
  }
  public V1DaemonEndpointBuilder(V1DaemonEndpoint instance) {
    this(instance,false);
  }
  public V1DaemonEndpointBuilder(V1DaemonEndpoint instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withPort(instance.getPort());

    this.validationEnabled = validationEnabled; 
  }
  V1DaemonEndpointFluent<?> fluent;
  Boolean validationEnabled;
  public V1DaemonEndpoint build() {
    V1DaemonEndpoint buildable = new V1DaemonEndpoint();
    buildable.setPort(fluent.getPort());
    return buildable;
  }
  
}