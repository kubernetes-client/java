package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1WeightedPodAffinityTermBuilder extends io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluentImpl<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm,io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder> {

    io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1WeightedPodAffinityTermBuilder() {
        this(true);
    }

    public V1WeightedPodAffinityTermBuilder(java.lang.Boolean validationEnabled) {
        this(new V1WeightedPodAffinityTerm(), validationEnabled);
    }

    public V1WeightedPodAffinityTermBuilder(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent<?> fluent) {
        this(fluent, true);
    }

    public V1WeightedPodAffinityTermBuilder(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1WeightedPodAffinityTerm(), validationEnabled);
    }

    public V1WeightedPodAffinityTermBuilder(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent<?> fluent,io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm instance) {
        this(fluent, instance, true);
    }

    public V1WeightedPodAffinityTermBuilder(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent<?> fluent,io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withPodAffinityTerm(instance.getPodAffinityTerm());
        
        fluent.withWeight(instance.getWeight());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1WeightedPodAffinityTermBuilder(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm instance) {
        this(instance,true);
    }

    public V1WeightedPodAffinityTermBuilder(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withPodAffinityTerm(instance.getPodAffinityTerm());
        
        this.withWeight(instance.getWeight());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm build() {
        V1WeightedPodAffinityTerm buildable = new V1WeightedPodAffinityTerm();
        buildable.setPodAffinityTerm(fluent.getPodAffinityTerm());
        buildable.setWeight(fluent.getWeight());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1WeightedPodAffinityTermBuilder that = (V1WeightedPodAffinityTermBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
