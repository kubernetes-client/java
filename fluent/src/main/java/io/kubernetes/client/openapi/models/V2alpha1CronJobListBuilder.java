package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2alpha1CronJobListBuilder extends io.kubernetes.client.openapi.models.V2alpha1CronJobListFluentImpl<io.kubernetes.client.openapi.models.V2alpha1CronJobListBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2alpha1CronJobList,io.kubernetes.client.openapi.models.V2alpha1CronJobListBuilder> {

    io.kubernetes.client.openapi.models.V2alpha1CronJobListFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2alpha1CronJobListBuilder() {
        this(true);
    }

    public V2alpha1CronJobListBuilder(java.lang.Boolean validationEnabled) {
        this(new V2alpha1CronJobList(), validationEnabled);
    }

    public V2alpha1CronJobListBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobListFluent<?> fluent) {
        this(fluent, true);
    }

    public V2alpha1CronJobListBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobListFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2alpha1CronJobList(), validationEnabled);
    }

    public V2alpha1CronJobListBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobListFluent<?> fluent,io.kubernetes.client.openapi.models.V2alpha1CronJobList instance) {
        this(fluent, instance, true);
    }

    public V2alpha1CronJobListBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobListFluent<?> fluent,io.kubernetes.client.openapi.models.V2alpha1CronJobList instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withItems(instance.getItems());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2alpha1CronJobListBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobList instance) {
        this(instance,true);
    }

    public V2alpha1CronJobListBuilder(io.kubernetes.client.openapi.models.V2alpha1CronJobList instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withItems(instance.getItems());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobList build() {
        V2alpha1CronJobList buildable = new V2alpha1CronJobList();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setItems(fluent.getItems());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2alpha1CronJobListBuilder that = (V2alpha1CronJobListBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
