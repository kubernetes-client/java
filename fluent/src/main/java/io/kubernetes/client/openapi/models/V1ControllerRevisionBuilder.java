package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ControllerRevisionBuilder extends V1ControllerRevisionFluent<V1ControllerRevisionBuilder> implements VisitableBuilder<V1ControllerRevision,V1ControllerRevisionBuilder>{
  public V1ControllerRevisionBuilder() {
    this(new V1ControllerRevision());
  }
  
  public V1ControllerRevisionBuilder(V1ControllerRevisionFluent<?> fluent) {
    this(fluent, new V1ControllerRevision());
  }
  
  public V1ControllerRevisionBuilder(V1ControllerRevisionFluent<?> fluent,V1ControllerRevision instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ControllerRevisionBuilder(V1ControllerRevision instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ControllerRevisionFluent<?> fluent;
  
  public V1ControllerRevision build() {
    V1ControllerRevision buildable = new V1ControllerRevision();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setData(fluent.getData());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setRevision(fluent.getRevision());
    return buildable;
  }
  

}