package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1RuntimeClassBuilder extends V1RuntimeClassFluentImpl<V1RuntimeClassBuilder> implements VisitableBuilder<V1RuntimeClass,V1RuntimeClassBuilder>{
  public V1RuntimeClassBuilder() {
    this(false);
  }
  public V1RuntimeClassBuilder(Boolean validationEnabled) {
    this(new V1RuntimeClass(), validationEnabled);
  }
  public V1RuntimeClassBuilder(V1RuntimeClassFluent<?> fluent) {
    this(fluent, false);
  }
  public V1RuntimeClassBuilder(V1RuntimeClassFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1RuntimeClass(), validationEnabled);
  }
  public V1RuntimeClassBuilder(V1RuntimeClassFluent<?> fluent,V1RuntimeClass instance) {
    this(fluent, instance, false);
  }
  public V1RuntimeClassBuilder(V1RuntimeClassFluent<?> fluent,V1RuntimeClass instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withHandler(instance.getHandler());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withOverhead(instance.getOverhead());

    fluent.withScheduling(instance.getScheduling());

    this.validationEnabled = validationEnabled; 
  }
  public V1RuntimeClassBuilder(V1RuntimeClass instance) {
    this(instance,false);
  }
  public V1RuntimeClassBuilder(V1RuntimeClass instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withHandler(instance.getHandler());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withOverhead(instance.getOverhead());

    this.withScheduling(instance.getScheduling());

    this.validationEnabled = validationEnabled; 
  }
  V1RuntimeClassFluent<?> fluent;
  Boolean validationEnabled;
  public V1RuntimeClass build() {
    V1RuntimeClass buildable = new V1RuntimeClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setHandler(fluent.getHandler());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setOverhead(fluent.getOverhead());
    buildable.setScheduling(fluent.getScheduling());
    return buildable;
  }
  
}