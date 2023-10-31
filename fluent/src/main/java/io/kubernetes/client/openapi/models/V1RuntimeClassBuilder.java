package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1RuntimeClassBuilder extends V1RuntimeClassFluent<V1RuntimeClassBuilder> implements VisitableBuilder<V1RuntimeClass,V1RuntimeClassBuilder>{
  public V1RuntimeClassBuilder() {
    this(new V1RuntimeClass());
  }
  
  public V1RuntimeClassBuilder(V1RuntimeClassFluent<?> fluent) {
    this(fluent, new V1RuntimeClass());
  }
  
  public V1RuntimeClassBuilder(V1RuntimeClassFluent<?> fluent,V1RuntimeClass instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1RuntimeClassBuilder(V1RuntimeClass instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1RuntimeClassFluent<?> fluent;
  
  public V1RuntimeClass build() {
    V1RuntimeClass buildable = new V1RuntimeClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setHandler(fluent.getHandler());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setOverhead(fluent.buildOverhead());
    buildable.setScheduling(fluent.buildScheduling());
    return buildable;
  }
  

}