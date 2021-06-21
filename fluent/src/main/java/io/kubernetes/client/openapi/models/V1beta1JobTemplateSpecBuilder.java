package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1JobTemplateSpecBuilder extends io.kubernetes.client.openapi.models.V1beta1JobTemplateSpecFluentImpl<io.kubernetes.client.openapi.models.V1beta1JobTemplateSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1JobTemplateSpec,io.kubernetes.client.openapi.models.V1beta1JobTemplateSpecBuilder> {

    io.kubernetes.client.openapi.models.V1beta1JobTemplateSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1JobTemplateSpecBuilder() {
        this(true);
    }

    public V1beta1JobTemplateSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1JobTemplateSpec(), validationEnabled);
    }

    public V1beta1JobTemplateSpecBuilder(io.kubernetes.client.openapi.models.V1beta1JobTemplateSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1JobTemplateSpecBuilder(io.kubernetes.client.openapi.models.V1beta1JobTemplateSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1JobTemplateSpec(), validationEnabled);
    }

    public V1beta1JobTemplateSpecBuilder(io.kubernetes.client.openapi.models.V1beta1JobTemplateSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1JobTemplateSpec instance) {
        this(fluent, instance, true);
    }

    public V1beta1JobTemplateSpecBuilder(io.kubernetes.client.openapi.models.V1beta1JobTemplateSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1JobTemplateSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMetadata(instance.getMetadata());
        
        fluent.withSpec(instance.getSpec());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1JobTemplateSpecBuilder(io.kubernetes.client.openapi.models.V1beta1JobTemplateSpec instance) {
        this(instance,true);
    }

    public V1beta1JobTemplateSpecBuilder(io.kubernetes.client.openapi.models.V1beta1JobTemplateSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMetadata(instance.getMetadata());
        
        this.withSpec(instance.getSpec());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1JobTemplateSpec build() {
        V1beta1JobTemplateSpec buildable = new V1beta1JobTemplateSpec();
        buildable.setMetadata(fluent.getMetadata());
        buildable.setSpec(fluent.getSpec());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1JobTemplateSpecBuilder that = (V1beta1JobTemplateSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
