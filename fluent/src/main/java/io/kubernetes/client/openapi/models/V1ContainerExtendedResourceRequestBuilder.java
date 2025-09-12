package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ContainerExtendedResourceRequestBuilder extends V1ContainerExtendedResourceRequestFluent<V1ContainerExtendedResourceRequestBuilder> implements VisitableBuilder<V1ContainerExtendedResourceRequest,V1ContainerExtendedResourceRequestBuilder>{
  public V1ContainerExtendedResourceRequestBuilder() {
    this(new V1ContainerExtendedResourceRequest());
  }
  
  public V1ContainerExtendedResourceRequestBuilder(V1ContainerExtendedResourceRequestFluent<?> fluent) {
    this(fluent, new V1ContainerExtendedResourceRequest());
  }
  
  public V1ContainerExtendedResourceRequestBuilder(V1ContainerExtendedResourceRequestFluent<?> fluent,V1ContainerExtendedResourceRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ContainerExtendedResourceRequestBuilder(V1ContainerExtendedResourceRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ContainerExtendedResourceRequestFluent<?> fluent;
  
  public V1ContainerExtendedResourceRequest build() {
    V1ContainerExtendedResourceRequest buildable = new V1ContainerExtendedResourceRequest();
    buildable.setContainerName(fluent.getContainerName());
    buildable.setRequestName(fluent.getRequestName());
    buildable.setResourceName(fluent.getResourceName());
    return buildable;
  }
  

}