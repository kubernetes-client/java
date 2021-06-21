package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1PodAffinityTermBuilder extends io.kubernetes.client.openapi.models.V1PodAffinityTermFluentImpl<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PodAffinityTerm,io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder> {

    io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1PodAffinityTermBuilder() {
        this(true);
    }

    public V1PodAffinityTermBuilder(java.lang.Boolean validationEnabled) {
        this(new V1PodAffinityTerm(), validationEnabled);
    }

    public V1PodAffinityTermBuilder(io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<?> fluent) {
        this(fluent, true);
    }

    public V1PodAffinityTermBuilder(io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1PodAffinityTerm(), validationEnabled);
    }

    public V1PodAffinityTermBuilder(io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodAffinityTerm instance) {
        this(fluent, instance, true);
    }

    public V1PodAffinityTermBuilder(io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodAffinityTerm instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withLabelSelector(instance.getLabelSelector());
        
        fluent.withNamespaces(instance.getNamespaces());
        
        fluent.withTopologyKey(instance.getTopologyKey());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1PodAffinityTermBuilder(io.kubernetes.client.openapi.models.V1PodAffinityTerm instance) {
        this(instance,true);
    }

    public V1PodAffinityTermBuilder(io.kubernetes.client.openapi.models.V1PodAffinityTerm instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withLabelSelector(instance.getLabelSelector());
        
        this.withNamespaces(instance.getNamespaces());
        
        this.withTopologyKey(instance.getTopologyKey());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1PodAffinityTerm build() {
        V1PodAffinityTerm buildable = new V1PodAffinityTerm();
        buildable.setLabelSelector(fluent.getLabelSelector());
        buildable.setNamespaces(fluent.getNamespaces());
        buildable.setTopologyKey(fluent.getTopologyKey());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1PodAffinityTermBuilder that = (V1PodAffinityTermBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
