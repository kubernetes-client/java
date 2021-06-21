package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1JobSpecBuilder extends io.kubernetes.client.openapi.models.V1JobSpecFluentImpl<io.kubernetes.client.openapi.models.V1JobSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1JobSpec,io.kubernetes.client.openapi.models.V1JobSpecBuilder> {

    io.kubernetes.client.openapi.models.V1JobSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1JobSpecBuilder() {
        this(true);
    }

    public V1JobSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1JobSpec(), validationEnabled);
    }

    public V1JobSpecBuilder(io.kubernetes.client.openapi.models.V1JobSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1JobSpecBuilder(io.kubernetes.client.openapi.models.V1JobSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1JobSpec(), validationEnabled);
    }

    public V1JobSpecBuilder(io.kubernetes.client.openapi.models.V1JobSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1JobSpec instance) {
        this(fluent, instance, true);
    }

    public V1JobSpecBuilder(io.kubernetes.client.openapi.models.V1JobSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1JobSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds());
        
        fluent.withBackoffLimit(instance.getBackoffLimit());
        
        fluent.withCompletions(instance.getCompletions());
        
        fluent.withManualSelector(instance.getManualSelector());
        
        fluent.withParallelism(instance.getParallelism());
        
        fluent.withSelector(instance.getSelector());
        
        fluent.withTemplate(instance.getTemplate());
        
        fluent.withTtlSecondsAfterFinished(instance.getTtlSecondsAfterFinished());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1JobSpecBuilder(io.kubernetes.client.openapi.models.V1JobSpec instance) {
        this(instance,true);
    }

    public V1JobSpecBuilder(io.kubernetes.client.openapi.models.V1JobSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds());
        
        this.withBackoffLimit(instance.getBackoffLimit());
        
        this.withCompletions(instance.getCompletions());
        
        this.withManualSelector(instance.getManualSelector());
        
        this.withParallelism(instance.getParallelism());
        
        this.withSelector(instance.getSelector());
        
        this.withTemplate(instance.getTemplate());
        
        this.withTtlSecondsAfterFinished(instance.getTtlSecondsAfterFinished());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1JobSpec build() {
        V1JobSpec buildable = new V1JobSpec();
        buildable.setActiveDeadlineSeconds(fluent.getActiveDeadlineSeconds());
        buildable.setBackoffLimit(fluent.getBackoffLimit());
        buildable.setCompletions(fluent.getCompletions());
        buildable.setManualSelector(fluent.getManualSelector());
        buildable.setParallelism(fluent.getParallelism());
        buildable.setSelector(fluent.getSelector());
        buildable.setTemplate(fluent.getTemplate());
        buildable.setTtlSecondsAfterFinished(fluent.getTtlSecondsAfterFinished());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1JobSpecBuilder that = (V1JobSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
