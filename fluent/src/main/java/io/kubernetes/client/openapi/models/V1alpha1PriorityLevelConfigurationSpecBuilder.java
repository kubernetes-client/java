package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1PriorityLevelConfigurationSpecBuilder extends io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecFluentImpl<io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpec,io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1PriorityLevelConfigurationSpecBuilder() {
        this(true);
    }

    public V1alpha1PriorityLevelConfigurationSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1PriorityLevelConfigurationSpec(), validationEnabled);
    }

    public V1alpha1PriorityLevelConfigurationSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1PriorityLevelConfigurationSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1PriorityLevelConfigurationSpec(), validationEnabled);
    }

    public V1alpha1PriorityLevelConfigurationSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpec instance) {
        this(fluent, instance, true);
    }

    public V1alpha1PriorityLevelConfigurationSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withLimited(instance.getLimited());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1PriorityLevelConfigurationSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpec instance) {
        this(instance,true);
    }

    public V1alpha1PriorityLevelConfigurationSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withLimited(instance.getLimited());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityLevelConfigurationSpec build() {
        V1alpha1PriorityLevelConfigurationSpec buildable = new V1alpha1PriorityLevelConfigurationSpec();
        buildable.setLimited(fluent.getLimited());
        buildable.setType(fluent.getType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1PriorityLevelConfigurationSpecBuilder that = (V1alpha1PriorityLevelConfigurationSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
