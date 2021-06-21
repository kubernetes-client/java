package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1TolerationBuilder extends io.kubernetes.client.openapi.models.V1TolerationFluentImpl<io.kubernetes.client.openapi.models.V1TolerationBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1Toleration,io.kubernetes.client.openapi.models.V1TolerationBuilder> {

    io.kubernetes.client.openapi.models.V1TolerationFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1TolerationBuilder() {
        this(true);
    }

    public V1TolerationBuilder(java.lang.Boolean validationEnabled) {
        this(new V1Toleration(), validationEnabled);
    }

    public V1TolerationBuilder(io.kubernetes.client.openapi.models.V1TolerationFluent<?> fluent) {
        this(fluent, true);
    }

    public V1TolerationBuilder(io.kubernetes.client.openapi.models.V1TolerationFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1Toleration(), validationEnabled);
    }

    public V1TolerationBuilder(io.kubernetes.client.openapi.models.V1TolerationFluent<?> fluent,io.kubernetes.client.openapi.models.V1Toleration instance) {
        this(fluent, instance, true);
    }

    public V1TolerationBuilder(io.kubernetes.client.openapi.models.V1TolerationFluent<?> fluent,io.kubernetes.client.openapi.models.V1Toleration instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withEffect(instance.getEffect());
        
        fluent.withKey(instance.getKey());
        
        fluent.withOperator(instance.getOperator());
        
        fluent.withTolerationSeconds(instance.getTolerationSeconds());
        
        fluent.withValue(instance.getValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1TolerationBuilder(io.kubernetes.client.openapi.models.V1Toleration instance) {
        this(instance,true);
    }

    public V1TolerationBuilder(io.kubernetes.client.openapi.models.V1Toleration instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withEffect(instance.getEffect());
        
        this.withKey(instance.getKey());
        
        this.withOperator(instance.getOperator());
        
        this.withTolerationSeconds(instance.getTolerationSeconds());
        
        this.withValue(instance.getValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1Toleration build() {
        V1Toleration buildable = new V1Toleration();
        buildable.setEffect(fluent.getEffect());
        buildable.setKey(fluent.getKey());
        buildable.setOperator(fluent.getOperator());
        buildable.setTolerationSeconds(fluent.getTolerationSeconds());
        buildable.setValue(fluent.getValue());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1TolerationBuilder that = (V1TolerationBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
