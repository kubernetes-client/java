package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CustomResourceSubresourcesBuilder extends V1CustomResourceSubresourcesFluent<V1CustomResourceSubresourcesBuilder> implements VisitableBuilder<V1CustomResourceSubresources,V1CustomResourceSubresourcesBuilder>{
  public V1CustomResourceSubresourcesBuilder() {
    this(new V1CustomResourceSubresources());
  }
  
  public V1CustomResourceSubresourcesBuilder(V1CustomResourceSubresourcesFluent<?> fluent) {
    this(fluent, new V1CustomResourceSubresources());
  }
  
  public V1CustomResourceSubresourcesBuilder(V1CustomResourceSubresourcesFluent<?> fluent,V1CustomResourceSubresources instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CustomResourceSubresourcesBuilder(V1CustomResourceSubresources instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CustomResourceSubresourcesFluent<?> fluent;
  
  public V1CustomResourceSubresources build() {
    V1CustomResourceSubresources buildable = new V1CustomResourceSubresources();
    buildable.setScale(fluent.buildScale());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  

}