package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1PodDNSConfigOptionBuilder extends io.kubernetes.client.openapi.models.V1PodDNSConfigOptionFluentImpl<io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PodDNSConfigOption,io.kubernetes.client.openapi.models.V1PodDNSConfigOptionBuilder> {

    io.kubernetes.client.openapi.models.V1PodDNSConfigOptionFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1PodDNSConfigOptionBuilder() {
        this(true);
    }

    public V1PodDNSConfigOptionBuilder(java.lang.Boolean validationEnabled) {
        this(new V1PodDNSConfigOption(), validationEnabled);
    }

    public V1PodDNSConfigOptionBuilder(io.kubernetes.client.openapi.models.V1PodDNSConfigOptionFluent<?> fluent) {
        this(fluent, true);
    }

    public V1PodDNSConfigOptionBuilder(io.kubernetes.client.openapi.models.V1PodDNSConfigOptionFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1PodDNSConfigOption(), validationEnabled);
    }

    public V1PodDNSConfigOptionBuilder(io.kubernetes.client.openapi.models.V1PodDNSConfigOptionFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodDNSConfigOption instance) {
        this(fluent, instance, true);
    }

    public V1PodDNSConfigOptionBuilder(io.kubernetes.client.openapi.models.V1PodDNSConfigOptionFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodDNSConfigOption instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withName(instance.getName());
        
        fluent.withValue(instance.getValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1PodDNSConfigOptionBuilder(io.kubernetes.client.openapi.models.V1PodDNSConfigOption instance) {
        this(instance,true);
    }

    public V1PodDNSConfigOptionBuilder(io.kubernetes.client.openapi.models.V1PodDNSConfigOption instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withName(instance.getName());
        
        this.withValue(instance.getValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1PodDNSConfigOption build() {
        V1PodDNSConfigOption buildable = new V1PodDNSConfigOption();
        buildable.setName(fluent.getName());
        buildable.setValue(fluent.getValue());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1PodDNSConfigOptionBuilder that = (V1PodDNSConfigOptionBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
