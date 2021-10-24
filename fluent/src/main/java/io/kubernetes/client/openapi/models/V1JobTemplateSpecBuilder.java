package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1JobTemplateSpecBuilder extends io.kubernetes.client.openapi.models.V1JobTemplateSpecFluentImpl<io.kubernetes.client.openapi.models.V1JobTemplateSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1JobTemplateSpec,io.kubernetes.client.openapi.models.V1JobTemplateSpecBuilder>{
  public V1JobTemplateSpecBuilder() {
    this(false);
  }
  public V1JobTemplateSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1JobTemplateSpec(), validationEnabled);
  }
  public V1JobTemplateSpecBuilder(io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1JobTemplateSpecBuilder(io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1JobTemplateSpec(), validationEnabled);
  }
  public V1JobTemplateSpecBuilder(io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1JobTemplateSpec instance) {
    this(fluent, instance, false);
  }
  public V1JobTemplateSpecBuilder(io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1JobTemplateSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  public V1JobTemplateSpecBuilder(io.kubernetes.client.openapi.models.V1JobTemplateSpec instance) {
    this(instance,false);
  }
  public V1JobTemplateSpecBuilder(io.kubernetes.client.openapi.models.V1JobTemplateSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1JobTemplateSpec build() {
    V1JobTemplateSpec buildable = new V1JobTemplateSpec();
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1JobTemplateSpecBuilder that = (V1JobTemplateSpecBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}