package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class ExtensionsV1beta1IngressStatusBuilder extends io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressStatusFluentImpl<io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressStatus,io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressStatusBuilder> {

    io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public ExtensionsV1beta1IngressStatusBuilder() {
        this(true);
    }

    public ExtensionsV1beta1IngressStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new ExtensionsV1beta1IngressStatus(), validationEnabled);
    }

    public ExtensionsV1beta1IngressStatusBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public ExtensionsV1beta1IngressStatusBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new ExtensionsV1beta1IngressStatus(), validationEnabled);
    }

    public ExtensionsV1beta1IngressStatusBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressStatusFluent<?> fluent,io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressStatus instance) {
        this(fluent, instance, true);
    }

    public ExtensionsV1beta1IngressStatusBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressStatusFluent<?> fluent,io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withLoadBalancer(instance.getLoadBalancer());
        
        this.validationEnabled = validationEnabled; 
    }

    public ExtensionsV1beta1IngressStatusBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressStatus instance) {
        this(instance,true);
    }

    public ExtensionsV1beta1IngressStatusBuilder(io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withLoadBalancer(instance.getLoadBalancer());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressStatus build() {
        ExtensionsV1beta1IngressStatus buildable = new ExtensionsV1beta1IngressStatus();
        buildable.setLoadBalancer(fluent.getLoadBalancer());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ExtensionsV1beta1IngressStatusBuilder that = (ExtensionsV1beta1IngressStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
