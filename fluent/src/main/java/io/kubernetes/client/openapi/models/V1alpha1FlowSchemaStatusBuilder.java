package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1FlowSchemaStatusBuilder extends io.kubernetes.client.openapi.models.V1alpha1FlowSchemaStatusFluentImpl<io.kubernetes.client.openapi.models.V1alpha1FlowSchemaStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1FlowSchemaStatus,io.kubernetes.client.openapi.models.V1alpha1FlowSchemaStatusBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1FlowSchemaStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1FlowSchemaStatusBuilder() {
        this(true);
    }

    public V1alpha1FlowSchemaStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1FlowSchemaStatus(), validationEnabled);
    }

    public V1alpha1FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowSchemaStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowSchemaStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1FlowSchemaStatus(), validationEnabled);
    }

    public V1alpha1FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowSchemaStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1FlowSchemaStatus instance) {
        this(fluent, instance, true);
    }

    public V1alpha1FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowSchemaStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1FlowSchemaStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withConditions(instance.getConditions());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowSchemaStatus instance) {
        this(instance,true);
    }

    public V1alpha1FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowSchemaStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withConditions(instance.getConditions());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1FlowSchemaStatus build() {
        V1alpha1FlowSchemaStatus buildable = new V1alpha1FlowSchemaStatus();
        buildable.setConditions(fluent.getConditions());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1FlowSchemaStatusBuilder that = (V1alpha1FlowSchemaStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
