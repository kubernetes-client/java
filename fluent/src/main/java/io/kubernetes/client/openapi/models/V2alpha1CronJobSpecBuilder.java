package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2alpha1CronJobSpecBuilder extends io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluentImpl<io.kubernetes.client.openapi.models.V2alpha1CronJobSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2alpha1CronJobSpec,io.kubernetes.client.openapi.models.V2alpha1CronJobSpecBuilder> {

    io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2alpha1CronJobSpecBuilder() {
        this(true);
    }

    public V2alpha1CronJobSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V2alpha1CronJobSpec(), validationEnabled);
    }

    public V2alpha1CronJobSpecBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V2alpha1CronJobSpecBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2alpha1CronJobSpec(), validationEnabled);
    }

    public V2alpha1CronJobSpecBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V2alpha1CronJobSpec instance) {
        this(fluent, instance, true);
    }

    public V2alpha1CronJobSpecBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V2alpha1CronJobSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withConcurrencyPolicy(instance.getConcurrencyPolicy());
        
        fluent.withFailedJobsHistoryLimit(instance.getFailedJobsHistoryLimit());
        
        fluent.withJobTemplate(instance.getJobTemplate());
        
        fluent.withSchedule(instance.getSchedule());
        
        fluent.withStartingDeadlineSeconds(instance.getStartingDeadlineSeconds());
        
        fluent.withSuccessfulJobsHistoryLimit(instance.getSuccessfulJobsHistoryLimit());
        
        fluent.withSuspend(instance.getSuspend());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2alpha1CronJobSpecBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobSpec instance) {
        this(instance,true);
    }

    public V2alpha1CronJobSpecBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withConcurrencyPolicy(instance.getConcurrencyPolicy());
        
        this.withFailedJobsHistoryLimit(instance.getFailedJobsHistoryLimit());
        
        this.withJobTemplate(instance.getJobTemplate());
        
        this.withSchedule(instance.getSchedule());
        
        this.withStartingDeadlineSeconds(instance.getStartingDeadlineSeconds());
        
        this.withSuccessfulJobsHistoryLimit(instance.getSuccessfulJobsHistoryLimit());
        
        this.withSuspend(instance.getSuspend());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobSpec build() {
        V2alpha1CronJobSpec buildable = new V2alpha1CronJobSpec();
        buildable.setConcurrencyPolicy(fluent.getConcurrencyPolicy());
        buildable.setFailedJobsHistoryLimit(fluent.getFailedJobsHistoryLimit());
        buildable.setJobTemplate(fluent.getJobTemplate());
        buildable.setSchedule(fluent.getSchedule());
        buildable.setStartingDeadlineSeconds(fluent.getStartingDeadlineSeconds());
        buildable.setSuccessfulJobsHistoryLimit(fluent.getSuccessfulJobsHistoryLimit());
        buildable.setSuspend(fluent.getSuspend());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2alpha1CronJobSpecBuilder that = (V2alpha1CronJobSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
