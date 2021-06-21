package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1JobStatusBuilder extends io.kubernetes.client.openapi.models.V1JobStatusFluentImpl<io.kubernetes.client.openapi.models.V1JobStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1JobStatus,io.kubernetes.client.openapi.models.V1JobStatusBuilder> {

    io.kubernetes.client.openapi.models.V1JobStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1JobStatusBuilder() {
        this(true);
    }

    public V1JobStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V1JobStatus(), validationEnabled);
    }

    public V1JobStatusBuilder(io.kubernetes.client.openapi.models.V1JobStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V1JobStatusBuilder(io.kubernetes.client.openapi.models.V1JobStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1JobStatus(), validationEnabled);
    }

    public V1JobStatusBuilder(io.kubernetes.client.openapi.models.V1JobStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1JobStatus instance) {
        this(fluent, instance, true);
    }

    public V1JobStatusBuilder(io.kubernetes.client.openapi.models.V1JobStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1JobStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withActive(instance.getActive());
        
        fluent.withCompletionTime(instance.getCompletionTime());
        
        fluent.withConditions(instance.getConditions());
        
        fluent.withFailed(instance.getFailed());
        
        fluent.withStartTime(instance.getStartTime());
        
        fluent.withSucceeded(instance.getSucceeded());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1JobStatusBuilder(io.kubernetes.client.openapi.models.V1JobStatus instance) {
        this(instance,true);
    }

    public V1JobStatusBuilder(io.kubernetes.client.openapi.models.V1JobStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withActive(instance.getActive());
        
        this.withCompletionTime(instance.getCompletionTime());
        
        this.withConditions(instance.getConditions());
        
        this.withFailed(instance.getFailed());
        
        this.withStartTime(instance.getStartTime());
        
        this.withSucceeded(instance.getSucceeded());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1JobStatus build() {
        V1JobStatus buildable = new V1JobStatus();
        buildable.setActive(fluent.getActive());
        buildable.setCompletionTime(fluent.getCompletionTime());
        buildable.setConditions(fluent.getConditions());
        buildable.setFailed(fluent.getFailed());
        buildable.setStartTime(fluent.getStartTime());
        buildable.setSucceeded(fluent.getSucceeded());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1JobStatusBuilder that = (V1JobStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
