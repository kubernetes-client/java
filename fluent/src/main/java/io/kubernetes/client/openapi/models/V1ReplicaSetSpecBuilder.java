package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ReplicaSetSpecBuilder extends io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluentImpl<io.kubernetes.client.openapi.models.V1ReplicaSetSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ReplicaSetSpec,io.kubernetes.client.openapi.models.V1ReplicaSetSpecBuilder> {

    io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ReplicaSetSpecBuilder() {
        this(true);
    }

    public V1ReplicaSetSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ReplicaSetSpec(), validationEnabled);
    }

    public V1ReplicaSetSpecBuilder(io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ReplicaSetSpecBuilder(io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ReplicaSetSpec(), validationEnabled);
    }

    public V1ReplicaSetSpecBuilder(io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1ReplicaSetSpec instance) {
        this(fluent, instance, true);
    }

    public V1ReplicaSetSpecBuilder(io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1ReplicaSetSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMinReadySeconds(instance.getMinReadySeconds());
        
        fluent.withReplicas(instance.getReplicas());
        
        fluent.withSelector(instance.getSelector());
        
        fluent.withTemplate(instance.getTemplate());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ReplicaSetSpecBuilder(io.kubernetes.client.openapi.models.V1ReplicaSetSpec instance) {
        this(instance,true);
    }

    public V1ReplicaSetSpecBuilder(io.kubernetes.client.openapi.models.V1ReplicaSetSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMinReadySeconds(instance.getMinReadySeconds());
        
        this.withReplicas(instance.getReplicas());
        
        this.withSelector(instance.getSelector());
        
        this.withTemplate(instance.getTemplate());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ReplicaSetSpec build() {
        V1ReplicaSetSpec buildable = new V1ReplicaSetSpec();
        buildable.setMinReadySeconds(fluent.getMinReadySeconds());
        buildable.setReplicas(fluent.getReplicas());
        buildable.setSelector(fluent.getSelector());
        buildable.setTemplate(fluent.getTemplate());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ReplicaSetSpecBuilder that = (V1ReplicaSetSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
