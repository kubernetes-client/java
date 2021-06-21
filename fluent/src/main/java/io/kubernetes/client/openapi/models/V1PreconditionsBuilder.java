package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1PreconditionsBuilder extends io.kubernetes.client.openapi.models.V1PreconditionsFluentImpl<io.kubernetes.client.openapi.models.V1PreconditionsBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1Preconditions,io.kubernetes.client.openapi.models.V1PreconditionsBuilder> {

    io.kubernetes.client.openapi.models.V1PreconditionsFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1PreconditionsBuilder() {
        this(true);
    }

    public V1PreconditionsBuilder(java.lang.Boolean validationEnabled) {
        this(new V1Preconditions(), validationEnabled);
    }

    public V1PreconditionsBuilder(io.kubernetes.client.openapi.models.V1PreconditionsFluent<?> fluent) {
        this(fluent, true);
    }

    public V1PreconditionsBuilder(io.kubernetes.client.openapi.models.V1PreconditionsFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1Preconditions(), validationEnabled);
    }

    public V1PreconditionsBuilder(io.kubernetes.client.openapi.models.V1PreconditionsFluent<?> fluent,io.kubernetes.client.openapi.models.V1Preconditions instance) {
        this(fluent, instance, true);
    }

    public V1PreconditionsBuilder(io.kubernetes.client.openapi.models.V1PreconditionsFluent<?> fluent,io.kubernetes.client.openapi.models.V1Preconditions instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withResourceVersion(instance.getResourceVersion());
        
        fluent.withUid(instance.getUid());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1PreconditionsBuilder(io.kubernetes.client.openapi.models.V1Preconditions instance) {
        this(instance,true);
    }

    public V1PreconditionsBuilder(io.kubernetes.client.openapi.models.V1Preconditions instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withResourceVersion(instance.getResourceVersion());
        
        this.withUid(instance.getUid());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1Preconditions build() {
        V1Preconditions buildable = new V1Preconditions();
        buildable.setResourceVersion(fluent.getResourceVersion());
        buildable.setUid(fluent.getUid());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1PreconditionsBuilder that = (V1PreconditionsBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
