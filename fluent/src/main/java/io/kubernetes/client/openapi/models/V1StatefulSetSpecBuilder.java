package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1StatefulSetSpecBuilder extends io.kubernetes.client.openapi.models.V1StatefulSetSpecFluentImpl<io.kubernetes.client.openapi.models.V1StatefulSetSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1StatefulSetSpec,io.kubernetes.client.openapi.models.V1StatefulSetSpecBuilder> {

    io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1StatefulSetSpecBuilder() {
        this(true);
    }

    public V1StatefulSetSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1StatefulSetSpec(), validationEnabled);
    }

    public V1StatefulSetSpecBuilder(io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1StatefulSetSpecBuilder(io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1StatefulSetSpec(), validationEnabled);
    }

    public V1StatefulSetSpecBuilder(io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1StatefulSetSpec instance) {
        this(fluent, instance, true);
    }

    public V1StatefulSetSpecBuilder(io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1StatefulSetSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withPodManagementPolicy(instance.getPodManagementPolicy());
        
        fluent.withReplicas(instance.getReplicas());
        
        fluent.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());
        
        fluent.withSelector(instance.getSelector());
        
        fluent.withServiceName(instance.getServiceName());
        
        fluent.withTemplate(instance.getTemplate());
        
        fluent.withUpdateStrategy(instance.getUpdateStrategy());
        
        fluent.withVolumeClaimTemplates(instance.getVolumeClaimTemplates());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1StatefulSetSpecBuilder(io.kubernetes.client.openapi.models.V1StatefulSetSpec instance) {
        this(instance,true);
    }

    public V1StatefulSetSpecBuilder(io.kubernetes.client.openapi.models.V1StatefulSetSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withPodManagementPolicy(instance.getPodManagementPolicy());
        
        this.withReplicas(instance.getReplicas());
        
        this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());
        
        this.withSelector(instance.getSelector());
        
        this.withServiceName(instance.getServiceName());
        
        this.withTemplate(instance.getTemplate());
        
        this.withUpdateStrategy(instance.getUpdateStrategy());
        
        this.withVolumeClaimTemplates(instance.getVolumeClaimTemplates());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1StatefulSetSpec build() {
        V1StatefulSetSpec buildable = new V1StatefulSetSpec();
        buildable.setPodManagementPolicy(fluent.getPodManagementPolicy());
        buildable.setReplicas(fluent.getReplicas());
        buildable.setRevisionHistoryLimit(fluent.getRevisionHistoryLimit());
        buildable.setSelector(fluent.getSelector());
        buildable.setServiceName(fluent.getServiceName());
        buildable.setTemplate(fluent.getTemplate());
        buildable.setUpdateStrategy(fluent.getUpdateStrategy());
        buildable.setVolumeClaimTemplates(fluent.getVolumeClaimTemplates());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1StatefulSetSpecBuilder that = (V1StatefulSetSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
