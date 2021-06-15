package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1TopologySelectorTermBuilder extends io.kubernetes.client.openapi.models.V1TopologySelectorTermFluentImpl<io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1TopologySelectorTerm,io.kubernetes.client.openapi.models.V1TopologySelectorTermBuilder> {

    io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1TopologySelectorTermBuilder() {
        this(true);
    }

    public V1TopologySelectorTermBuilder(java.lang.Boolean validationEnabled) {
        this(new V1TopologySelectorTerm(), validationEnabled);
    }

    public V1TopologySelectorTermBuilder(io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent<?> fluent) {
        this(fluent, true);
    }

    public V1TopologySelectorTermBuilder(io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1TopologySelectorTerm(), validationEnabled);
    }

    public V1TopologySelectorTermBuilder(io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent<?> fluent,io.kubernetes.client.openapi.models.V1TopologySelectorTerm instance) {
        this(fluent, instance, true);
    }

    public V1TopologySelectorTermBuilder(io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent<?> fluent,io.kubernetes.client.openapi.models.V1TopologySelectorTerm instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMatchLabelExpressions(instance.getMatchLabelExpressions());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1TopologySelectorTermBuilder(io.kubernetes.client.openapi.models.V1TopologySelectorTerm instance) {
        this(instance,true);
    }

    public V1TopologySelectorTermBuilder(io.kubernetes.client.openapi.models.V1TopologySelectorTerm instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMatchLabelExpressions(instance.getMatchLabelExpressions());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1TopologySelectorTerm build() {
        V1TopologySelectorTerm buildable = new V1TopologySelectorTerm();
        buildable.setMatchLabelExpressions(fluent.getMatchLabelExpressions());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1TopologySelectorTermBuilder that = (V1TopologySelectorTermBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
