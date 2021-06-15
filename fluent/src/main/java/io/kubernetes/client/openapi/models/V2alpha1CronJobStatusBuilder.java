package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2alpha1CronJobStatusBuilder extends io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluentImpl<io.kubernetes.client.openapi.models.V2alpha1CronJobStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2alpha1CronJobStatus,io.kubernetes.client.openapi.models.V2alpha1CronJobStatusBuilder> {

    io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2alpha1CronJobStatusBuilder() {
        this(true);
    }

    public V2alpha1CronJobStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V2alpha1CronJobStatus(), validationEnabled);
    }

    public V2alpha1CronJobStatusBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V2alpha1CronJobStatusBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2alpha1CronJobStatus(), validationEnabled);
    }

    public V2alpha1CronJobStatusBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2alpha1CronJobStatus instance) {
        this(fluent, instance, true);
    }

    public V2alpha1CronJobStatusBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2alpha1CronJobStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withActive(instance.getActive());
        
        fluent.withLastScheduleTime(instance.getLastScheduleTime());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2alpha1CronJobStatusBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobStatus instance) {
        this(instance,true);
    }

    public V2alpha1CronJobStatusBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withActive(instance.getActive());
        
        this.withLastScheduleTime(instance.getLastScheduleTime());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobStatus build() {
        V2alpha1CronJobStatus buildable = new V2alpha1CronJobStatus();
        buildable.setActive(fluent.getActive());
        buildable.setLastScheduleTime(fluent.getLastScheduleTime());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2alpha1CronJobStatusBuilder that = (V2alpha1CronJobStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
