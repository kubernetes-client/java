package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1FlowDistinguisherMethodBuilder extends io.kubernetes.client.openapi.models.V1alpha1FlowDistinguisherMethodFluentImpl<io.kubernetes.client.openapi.models.V1alpha1FlowDistinguisherMethodBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1FlowDistinguisherMethod,io.kubernetes.client.openapi.models.V1alpha1FlowDistinguisherMethodBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1FlowDistinguisherMethodFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1FlowDistinguisherMethodBuilder() {
        this(true);
    }

    public V1alpha1FlowDistinguisherMethodBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1FlowDistinguisherMethod(), validationEnabled);
    }

    public V1alpha1FlowDistinguisherMethodBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowDistinguisherMethodFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1FlowDistinguisherMethodBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowDistinguisherMethodFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1FlowDistinguisherMethod(), validationEnabled);
    }

    public V1alpha1FlowDistinguisherMethodBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowDistinguisherMethodFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1FlowDistinguisherMethod instance) {
        this(fluent, instance, true);
    }

    public V1alpha1FlowDistinguisherMethodBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowDistinguisherMethodFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1FlowDistinguisherMethod instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1FlowDistinguisherMethodBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowDistinguisherMethod instance) {
        this(instance,true);
    }

    public V1alpha1FlowDistinguisherMethodBuilder(io.kubernetes.client.openapi.models.V1alpha1FlowDistinguisherMethod instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1FlowDistinguisherMethod build() {
        V1alpha1FlowDistinguisherMethod buildable = new V1alpha1FlowDistinguisherMethod();
        buildable.setType(fluent.getType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1FlowDistinguisherMethodBuilder that = (V1alpha1FlowDistinguisherMethodBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
