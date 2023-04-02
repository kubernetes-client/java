package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CustomResourceSubresourcesBuilder extends V1CustomResourceSubresourcesFluentImpl<V1CustomResourceSubresourcesBuilder> implements VisitableBuilder<V1CustomResourceSubresources,V1CustomResourceSubresourcesBuilder>{
  public V1CustomResourceSubresourcesBuilder() {
    this(false);
  }
  public V1CustomResourceSubresourcesBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceSubresources(), validationEnabled);
  }
  public V1CustomResourceSubresourcesBuilder(V1CustomResourceSubresourcesFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CustomResourceSubresourcesBuilder(V1CustomResourceSubresourcesFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CustomResourceSubresources(), validationEnabled);
  }
  public V1CustomResourceSubresourcesBuilder(V1CustomResourceSubresourcesFluent<?> fluent,V1CustomResourceSubresources instance) {
    this(fluent, instance, false);
  }
  public V1CustomResourceSubresourcesBuilder(V1CustomResourceSubresourcesFluent<?> fluent,V1CustomResourceSubresources instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withScale(instance.getScale());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1CustomResourceSubresourcesBuilder(V1CustomResourceSubresources instance) {
    this(instance,false);
  }
  public V1CustomResourceSubresourcesBuilder(V1CustomResourceSubresources instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withScale(instance.getScale());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1CustomResourceSubresourcesFluent<?> fluent;
  Boolean validationEnabled;
  public V1CustomResourceSubresources build() {
    V1CustomResourceSubresources buildable = new V1CustomResourceSubresources();
    buildable.setScale(fluent.getScale());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}