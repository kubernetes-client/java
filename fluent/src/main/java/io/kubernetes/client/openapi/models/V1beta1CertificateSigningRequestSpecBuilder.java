package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1CertificateSigningRequestSpecBuilder extends io.kubernetes.client.openapi.models.V1beta1CertificateSigningRequestSpecFluentImpl<io.kubernetes.client.openapi.models.V1beta1CertificateSigningRequestSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1CertificateSigningRequestSpec,io.kubernetes.client.openapi.models.V1beta1CertificateSigningRequestSpecBuilder> {

    io.kubernetes.client.openapi.models.V1beta1CertificateSigningRequestSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1CertificateSigningRequestSpecBuilder() {
        this(true);
    }

    public V1beta1CertificateSigningRequestSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1CertificateSigningRequestSpec(), validationEnabled);
    }

    public V1beta1CertificateSigningRequestSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CertificateSigningRequestSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1CertificateSigningRequestSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CertificateSigningRequestSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1CertificateSigningRequestSpec(), validationEnabled);
    }

    public V1beta1CertificateSigningRequestSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CertificateSigningRequestSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CertificateSigningRequestSpec instance) {
        this(fluent, instance, true);
    }

    public V1beta1CertificateSigningRequestSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CertificateSigningRequestSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CertificateSigningRequestSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withExtra(instance.getExtra());
        
        fluent.withGroups(instance.getGroups());
        
        fluent.withRequest(instance.getRequest());
        
        fluent.withSignerName(instance.getSignerName());
        
        fluent.withUid(instance.getUid());
        
        fluent.withUsages(instance.getUsages());
        
        fluent.withUsername(instance.getUsername());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1CertificateSigningRequestSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CertificateSigningRequestSpec instance) {
        this(instance,true);
    }

    public V1beta1CertificateSigningRequestSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CertificateSigningRequestSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withExtra(instance.getExtra());
        
        this.withGroups(instance.getGroups());
        
        this.withRequest(instance.getRequest());
        
        this.withSignerName(instance.getSignerName());
        
        this.withUid(instance.getUid());
        
        this.withUsages(instance.getUsages());
        
        this.withUsername(instance.getUsername());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1CertificateSigningRequestSpec build() {
        V1beta1CertificateSigningRequestSpec buildable = new V1beta1CertificateSigningRequestSpec();
        buildable.setExtra(fluent.getExtra());
        buildable.setGroups(fluent.getGroups());
        buildable.setRequest(fluent.getRequest());
        buildable.setSignerName(fluent.getSignerName());
        buildable.setUid(fluent.getUid());
        buildable.setUsages(fluent.getUsages());
        buildable.setUsername(fluent.getUsername());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1CertificateSigningRequestSpecBuilder that = (V1beta1CertificateSigningRequestSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
