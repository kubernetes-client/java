package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1QueuingConfigurationBuilder extends io.kubernetes.client.openapi.models.V1alpha1QueuingConfigurationFluentImpl<io.kubernetes.client.openapi.models.V1alpha1QueuingConfigurationBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1QueuingConfiguration,io.kubernetes.client.openapi.models.V1alpha1QueuingConfigurationBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1QueuingConfigurationFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1QueuingConfigurationBuilder() {
        this(true);
    }

    public V1alpha1QueuingConfigurationBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1QueuingConfiguration(), validationEnabled);
    }

    public V1alpha1QueuingConfigurationBuilder(io.kubernetes.client.openapi.models.V1alpha1QueuingConfigurationFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1QueuingConfigurationBuilder(io.kubernetes.client.openapi.models.V1alpha1QueuingConfigurationFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1QueuingConfiguration(), validationEnabled);
    }

    public V1alpha1QueuingConfigurationBuilder(io.kubernetes.client.openapi.models.V1alpha1QueuingConfigurationFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1QueuingConfiguration instance) {
        this(fluent, instance, true);
    }

    public V1alpha1QueuingConfigurationBuilder(io.kubernetes.client.openapi.models.V1alpha1QueuingConfigurationFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1QueuingConfiguration instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withHandSize(instance.getHandSize());
        
        fluent.withQueueLengthLimit(instance.getQueueLengthLimit());
        
        fluent.withQueues(instance.getQueues());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1QueuingConfigurationBuilder(io.kubernetes.client.openapi.models.V1alpha1QueuingConfiguration instance) {
        this(instance,true);
    }

    public V1alpha1QueuingConfigurationBuilder(io.kubernetes.client.openapi.models.V1alpha1QueuingConfiguration instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withHandSize(instance.getHandSize());
        
        this.withQueueLengthLimit(instance.getQueueLengthLimit());
        
        this.withQueues(instance.getQueues());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1QueuingConfiguration build() {
        V1alpha1QueuingConfiguration buildable = new V1alpha1QueuingConfiguration();
        buildable.setHandSize(fluent.getHandSize());
        buildable.setQueueLengthLimit(fluent.getQueueLengthLimit());
        buildable.setQueues(fluent.getQueues());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1QueuingConfigurationBuilder that = (V1alpha1QueuingConfigurationBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
