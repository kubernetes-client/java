package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1FileKeySelectorBuilder extends V1FileKeySelectorFluent<V1FileKeySelectorBuilder> implements VisitableBuilder<V1FileKeySelector,V1FileKeySelectorBuilder>{
  public V1FileKeySelectorBuilder() {
    this(new V1FileKeySelector());
  }
  
  public V1FileKeySelectorBuilder(V1FileKeySelectorFluent<?> fluent) {
    this(fluent, new V1FileKeySelector());
  }
  
  public V1FileKeySelectorBuilder(V1FileKeySelectorFluent<?> fluent,V1FileKeySelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1FileKeySelectorBuilder(V1FileKeySelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1FileKeySelectorFluent<?> fluent;
  
  public V1FileKeySelector build() {
    V1FileKeySelector buildable = new V1FileKeySelector();
    buildable.setKey(fluent.getKey());
    buildable.setOptional(fluent.getOptional());
    buildable.setPath(fluent.getPath());
    buildable.setVolumeName(fluent.getVolumeName());
    return buildable;
  }
  

}