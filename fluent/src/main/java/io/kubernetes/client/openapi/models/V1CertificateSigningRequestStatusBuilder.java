package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1CertificateSigningRequestStatusBuilder extends io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluentImpl<io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus,io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusBuilder> {

    io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1CertificateSigningRequestStatusBuilder() {
        this(true);
    }

    public V1CertificateSigningRequestStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V1CertificateSigningRequestStatus(), validationEnabled);
    }

    public V1CertificateSigningRequestStatusBuilder(io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V1CertificateSigningRequestStatusBuilder(io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1CertificateSigningRequestStatus(), validationEnabled);
    }

    public V1CertificateSigningRequestStatusBuilder(io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus instance) {
        this(fluent, instance, true);
    }

    public V1CertificateSigningRequestStatusBuilder(io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withCertificate(instance.getCertificate());
        
        fluent.withConditions(instance.getConditions());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1CertificateSigningRequestStatusBuilder(io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus instance) {
        this(instance,true);
    }

    public V1CertificateSigningRequestStatusBuilder(io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withCertificate(instance.getCertificate());
        
        this.withConditions(instance.getConditions());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus build() {
        V1CertificateSigningRequestStatus buildable = new V1CertificateSigningRequestStatus();
        buildable.setCertificate(fluent.getCertificate());
        buildable.setConditions(fluent.getConditions());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1CertificateSigningRequestStatusBuilder that = (V1CertificateSigningRequestStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
