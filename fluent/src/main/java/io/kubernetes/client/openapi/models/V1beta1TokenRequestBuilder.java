package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1TokenRequestBuilder extends io.kubernetes.client.openapi.models.V1beta1TokenRequestFluentImpl<io.kubernetes.client.openapi.models.V1beta1TokenRequestBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1TokenRequest,io.kubernetes.client.openapi.models.V1beta1TokenRequestBuilder> {

    io.kubernetes.client.openapi.models.V1beta1TokenRequestFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1TokenRequestBuilder() {
        this(true);
    }

    public V1beta1TokenRequestBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1TokenRequest(), validationEnabled);
    }

    public V1beta1TokenRequestBuilder(io.kubernetes.client.openapi.models.V1beta1TokenRequestFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1TokenRequestBuilder(io.kubernetes.client.openapi.models.V1beta1TokenRequestFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1TokenRequest(), validationEnabled);
    }

    public V1beta1TokenRequestBuilder(io.kubernetes.client.openapi.models.V1beta1TokenRequestFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1TokenRequest instance) {
        this(fluent, instance, true);
    }

    public V1beta1TokenRequestBuilder(io.kubernetes.client.openapi.models.V1beta1TokenRequestFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1TokenRequest instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAudience(instance.getAudience());
        
        fluent.withExpirationSeconds(instance.getExpirationSeconds());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1TokenRequestBuilder(io.kubernetes.client.openapi.models.V1beta1TokenRequest instance) {
        this(instance,true);
    }

    public V1beta1TokenRequestBuilder(io.kubernetes.client.openapi.models.V1beta1TokenRequest instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAudience(instance.getAudience());
        
        this.withExpirationSeconds(instance.getExpirationSeconds());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1TokenRequest build() {
        V1beta1TokenRequest buildable = new V1beta1TokenRequest();
        buildable.setAudience(fluent.getAudience());
        buildable.setExpirationSeconds(fluent.getExpirationSeconds());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1TokenRequestBuilder that = (V1beta1TokenRequestBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
