package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1PodDNSConfigBuilder extends io.kubernetes.client.openapi.models.V1PodDNSConfigFluentImpl<io.kubernetes.client.openapi.models.V1PodDNSConfigBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PodDNSConfig,io.kubernetes.client.openapi.models.V1PodDNSConfigBuilder> {

    io.kubernetes.client.openapi.models.V1PodDNSConfigFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1PodDNSConfigBuilder() {
        this(true);
    }

    public V1PodDNSConfigBuilder(java.lang.Boolean validationEnabled) {
        this(new V1PodDNSConfig(), validationEnabled);
    }

    public V1PodDNSConfigBuilder(io.kubernetes.client.openapi.models.V1PodDNSConfigFluent<?> fluent) {
        this(fluent, true);
    }

    public V1PodDNSConfigBuilder(io.kubernetes.client.openapi.models.V1PodDNSConfigFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1PodDNSConfig(), validationEnabled);
    }

    public V1PodDNSConfigBuilder(io.kubernetes.client.openapi.models.V1PodDNSConfigFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodDNSConfig instance) {
        this(fluent, instance, true);
    }

    public V1PodDNSConfigBuilder(io.kubernetes.client.openapi.models.V1PodDNSConfigFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodDNSConfig instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withNameservers(instance.getNameservers());
        
        fluent.withOptions(instance.getOptions());
        
        fluent.withSearches(instance.getSearches());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1PodDNSConfigBuilder(io.kubernetes.client.openapi.models.V1PodDNSConfig instance) {
        this(instance,true);
    }

    public V1PodDNSConfigBuilder(io.kubernetes.client.openapi.models.V1PodDNSConfig instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withNameservers(instance.getNameservers());
        
        this.withOptions(instance.getOptions());
        
        this.withSearches(instance.getSearches());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1PodDNSConfig build() {
        V1PodDNSConfig buildable = new V1PodDNSConfig();
        buildable.setNameservers(fluent.getNameservers());
        buildable.setOptions(fluent.getOptions());
        buildable.setSearches(fluent.getSearches());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1PodDNSConfigBuilder that = (V1PodDNSConfigBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
