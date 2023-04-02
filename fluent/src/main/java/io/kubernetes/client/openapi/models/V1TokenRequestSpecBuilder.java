package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1TokenRequestSpecBuilder extends V1TokenRequestSpecFluentImpl<V1TokenRequestSpecBuilder> implements VisitableBuilder<V1TokenRequestSpec,V1TokenRequestSpecBuilder>{
  public V1TokenRequestSpecBuilder() {
    this(false);
  }
  public V1TokenRequestSpecBuilder(Boolean validationEnabled) {
    this(new V1TokenRequestSpec(), validationEnabled);
  }
  public V1TokenRequestSpecBuilder(V1TokenRequestSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1TokenRequestSpecBuilder(V1TokenRequestSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1TokenRequestSpec(), validationEnabled);
  }
  public V1TokenRequestSpecBuilder(V1TokenRequestSpecFluent<?> fluent,V1TokenRequestSpec instance) {
    this(fluent, instance, false);
  }
  public V1TokenRequestSpecBuilder(V1TokenRequestSpecFluent<?> fluent,V1TokenRequestSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAudiences(instance.getAudiences());

    fluent.withBoundObjectRef(instance.getBoundObjectRef());

    fluent.withExpirationSeconds(instance.getExpirationSeconds());

    this.validationEnabled = validationEnabled; 
  }
  public V1TokenRequestSpecBuilder(V1TokenRequestSpec instance) {
    this(instance,false);
  }
  public V1TokenRequestSpecBuilder(V1TokenRequestSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAudiences(instance.getAudiences());

    this.withBoundObjectRef(instance.getBoundObjectRef());

    this.withExpirationSeconds(instance.getExpirationSeconds());

    this.validationEnabled = validationEnabled; 
  }
  V1TokenRequestSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1TokenRequestSpec build() {
    V1TokenRequestSpec buildable = new V1TokenRequestSpec();
    buildable.setAudiences(fluent.getAudiences());
    buildable.setBoundObjectRef(fluent.getBoundObjectRef());
    buildable.setExpirationSeconds(fluent.getExpirationSeconds());
    return buildable;
  }
  
}