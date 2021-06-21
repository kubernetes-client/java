package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1NodeConfigStatusBuilder extends io.kubernetes.client.openapi.models.V1NodeConfigStatusFluentImpl<io.kubernetes.client.openapi.models.V1NodeConfigStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1NodeConfigStatus,io.kubernetes.client.openapi.models.V1NodeConfigStatusBuilder> {

    io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1NodeConfigStatusBuilder() {
        this(true);
    }

    public V1NodeConfigStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V1NodeConfigStatus(), validationEnabled);
    }

    public V1NodeConfigStatusBuilder(io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V1NodeConfigStatusBuilder(io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1NodeConfigStatus(), validationEnabled);
    }

    public V1NodeConfigStatusBuilder(io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1NodeConfigStatus instance) {
        this(fluent, instance, true);
    }

    public V1NodeConfigStatusBuilder(io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1NodeConfigStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withActive(instance.getActive());
        
        fluent.withAssigned(instance.getAssigned());
        
        fluent.withError(instance.getError());
        
        fluent.withLastKnownGood(instance.getLastKnownGood());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1NodeConfigStatusBuilder(io.kubernetes.client.openapi.models.V1NodeConfigStatus instance) {
        this(instance,true);
    }

    public V1NodeConfigStatusBuilder(io.kubernetes.client.openapi.models.V1NodeConfigStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withActive(instance.getActive());
        
        this.withAssigned(instance.getAssigned());
        
        this.withError(instance.getError());
        
        this.withLastKnownGood(instance.getLastKnownGood());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1NodeConfigStatus build() {
        V1NodeConfigStatus buildable = new V1NodeConfigStatus();
        buildable.setActive(fluent.getActive());
        buildable.setAssigned(fluent.getAssigned());
        buildable.setError(fluent.getError());
        buildable.setLastKnownGood(fluent.getLastKnownGood());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1NodeConfigStatusBuilder that = (V1NodeConfigStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
