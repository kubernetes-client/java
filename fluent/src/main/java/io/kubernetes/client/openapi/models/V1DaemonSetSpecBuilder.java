package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1DaemonSetSpecBuilder extends io.kubernetes.client.openapi.models.V1DaemonSetSpecFluentImpl<io.kubernetes.client.openapi.models.V1DaemonSetSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1DaemonSetSpec,io.kubernetes.client.openapi.models.V1DaemonSetSpecBuilder> {

    io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1DaemonSetSpecBuilder() {
        this(true);
    }

    public V1DaemonSetSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1DaemonSetSpec(), validationEnabled);
    }

    public V1DaemonSetSpecBuilder(io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1DaemonSetSpecBuilder(io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1DaemonSetSpec(), validationEnabled);
    }

    public V1DaemonSetSpecBuilder(io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1DaemonSetSpec instance) {
        this(fluent, instance, true);
    }

    public V1DaemonSetSpecBuilder(io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1DaemonSetSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMinReadySeconds(instance.getMinReadySeconds());
        
        fluent.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());
        
        fluent.withSelector(instance.getSelector());
        
        fluent.withTemplate(instance.getTemplate());
        
        fluent.withUpdateStrategy(instance.getUpdateStrategy());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1DaemonSetSpecBuilder(io.kubernetes.client.openapi.models.V1DaemonSetSpec instance) {
        this(instance,true);
    }

    public V1DaemonSetSpecBuilder(io.kubernetes.client.openapi.models.V1DaemonSetSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMinReadySeconds(instance.getMinReadySeconds());
        
        this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());
        
        this.withSelector(instance.getSelector());
        
        this.withTemplate(instance.getTemplate());
        
        this.withUpdateStrategy(instance.getUpdateStrategy());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1DaemonSetSpec build() {
        V1DaemonSetSpec buildable = new V1DaemonSetSpec();
        buildable.setMinReadySeconds(fluent.getMinReadySeconds());
        buildable.setRevisionHistoryLimit(fluent.getRevisionHistoryLimit());
        buildable.setSelector(fluent.getSelector());
        buildable.setTemplate(fluent.getTemplate());
        buildable.setUpdateStrategy(fluent.getUpdateStrategy());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1DaemonSetSpecBuilder that = (V1DaemonSetSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
