package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1NamespaceStatusBuilder extends io.kubernetes.client.openapi.models.V1NamespaceStatusFluentImpl<io.kubernetes.client.openapi.models.V1NamespaceStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1NamespaceStatus,io.kubernetes.client.openapi.models.V1NamespaceStatusBuilder> {

    io.kubernetes.client.openapi.models.V1NamespaceStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1NamespaceStatusBuilder() {
        this(true);
    }

    public V1NamespaceStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V1NamespaceStatus(), validationEnabled);
    }

    public V1NamespaceStatusBuilder(io.kubernetes.client.openapi.models.V1NamespaceStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V1NamespaceStatusBuilder(io.kubernetes.client.openapi.models.V1NamespaceStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1NamespaceStatus(), validationEnabled);
    }

    public V1NamespaceStatusBuilder(io.kubernetes.client.openapi.models.V1NamespaceStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1NamespaceStatus instance) {
        this(fluent, instance, true);
    }

    public V1NamespaceStatusBuilder(io.kubernetes.client.openapi.models.V1NamespaceStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1NamespaceStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withConditions(instance.getConditions());
        
        fluent.withPhase(instance.getPhase());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1NamespaceStatusBuilder(io.kubernetes.client.openapi.models.V1NamespaceStatus instance) {
        this(instance,true);
    }

    public V1NamespaceStatusBuilder(io.kubernetes.client.openapi.models.V1NamespaceStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withConditions(instance.getConditions());
        
        this.withPhase(instance.getPhase());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1NamespaceStatus build() {
        V1NamespaceStatus buildable = new V1NamespaceStatus();
        buildable.setConditions(fluent.getConditions());
        buildable.setPhase(fluent.getPhase());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1NamespaceStatusBuilder that = (V1NamespaceStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
