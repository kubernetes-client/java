package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1FlowSchemaStatusBuilder extends io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatusFluentImpl<io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatus,io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatusBuilder> {

    io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1FlowSchemaStatusBuilder() {
        this(true);
    }

    public V1beta1FlowSchemaStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1FlowSchemaStatus(), validationEnabled);
    }

    public V1beta1FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1FlowSchemaStatus(), validationEnabled);
    }

    public V1beta1FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatus instance) {
        this(fluent, instance, true);
    }

    public V1beta1FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withConditions(instance.getConditions());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatus instance) {
        this(instance,true);
    }

    public V1beta1FlowSchemaStatusBuilder(io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withConditions(instance.getConditions());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatus build() {
        V1beta1FlowSchemaStatus buildable = new V1beta1FlowSchemaStatus();
        buildable.setConditions(fluent.getConditions());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1FlowSchemaStatusBuilder that = (V1beta1FlowSchemaStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
