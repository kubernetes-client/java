package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1TaintBuilder extends io.kubernetes.client.openapi.models.V1TaintFluentImpl<io.kubernetes.client.openapi.models.V1TaintBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1Taint,io.kubernetes.client.openapi.models.V1TaintBuilder> {

    io.kubernetes.client.openapi.models.V1TaintFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1TaintBuilder() {
        this(true);
    }

    public V1TaintBuilder(java.lang.Boolean validationEnabled) {
        this(new V1Taint(), validationEnabled);
    }

    public V1TaintBuilder(io.kubernetes.client.openapi.models.V1TaintFluent<?> fluent) {
        this(fluent, true);
    }

    public V1TaintBuilder(io.kubernetes.client.openapi.models.V1TaintFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1Taint(), validationEnabled);
    }

    public V1TaintBuilder(io.kubernetes.client.openapi.models.V1TaintFluent<?> fluent,io.kubernetes.client.openapi.models.V1Taint instance) {
        this(fluent, instance, true);
    }

    public V1TaintBuilder(io.kubernetes.client.openapi.models.V1TaintFluent<?> fluent,io.kubernetes.client.openapi.models.V1Taint instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withEffect(instance.getEffect());
        
        fluent.withKey(instance.getKey());
        
        fluent.withTimeAdded(instance.getTimeAdded());
        
        fluent.withValue(instance.getValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1TaintBuilder(io.kubernetes.client.openapi.models.V1Taint instance) {
        this(instance,true);
    }

    public V1TaintBuilder(io.kubernetes.client.openapi.models.V1Taint instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withEffect(instance.getEffect());
        
        this.withKey(instance.getKey());
        
        this.withTimeAdded(instance.getTimeAdded());
        
        this.withValue(instance.getValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1Taint build() {
        V1Taint buildable = new V1Taint();
        buildable.setEffect(fluent.getEffect());
        buildable.setKey(fluent.getKey());
        buildable.setTimeAdded(fluent.getTimeAdded());
        buildable.setValue(fluent.getValue());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1TaintBuilder that = (V1TaintBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
