package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1APIServiceSpecBuilder extends io.kubernetes.client.openapi.models.V1beta1APIServiceSpecFluentImpl<io.kubernetes.client.openapi.models.V1beta1APIServiceSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1APIServiceSpec,io.kubernetes.client.openapi.models.V1beta1APIServiceSpecBuilder> {

    io.kubernetes.client.openapi.models.V1beta1APIServiceSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1APIServiceSpecBuilder() {
        this(true);
    }

    public V1beta1APIServiceSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1APIServiceSpec(), validationEnabled);
    }

    public V1beta1APIServiceSpecBuilder(io.kubernetes.client.openapi.models.V1beta1APIServiceSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1APIServiceSpecBuilder(io.kubernetes.client.openapi.models.V1beta1APIServiceSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1APIServiceSpec(), validationEnabled);
    }

    public V1beta1APIServiceSpecBuilder(io.kubernetes.client.openapi.models.V1beta1APIServiceSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1APIServiceSpec instance) {
        this(fluent, instance, true);
    }

    public V1beta1APIServiceSpecBuilder(io.kubernetes.client.openapi.models.V1beta1APIServiceSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1APIServiceSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withCaBundle(instance.getCaBundle());
        
        fluent.withGroup(instance.getGroup());
        
        fluent.withGroupPriorityMinimum(instance.getGroupPriorityMinimum());
        
        fluent.withInsecureSkipTLSVerify(instance.getInsecureSkipTLSVerify());
        
        fluent.withService(instance.getService());
        
        fluent.withVersion(instance.getVersion());
        
        fluent.withVersionPriority(instance.getVersionPriority());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1APIServiceSpecBuilder(io.kubernetes.client.openapi.models.V1beta1APIServiceSpec instance) {
        this(instance,true);
    }

    public V1beta1APIServiceSpecBuilder(io.kubernetes.client.openapi.models.V1beta1APIServiceSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withCaBundle(instance.getCaBundle());
        
        this.withGroup(instance.getGroup());
        
        this.withGroupPriorityMinimum(instance.getGroupPriorityMinimum());
        
        this.withInsecureSkipTLSVerify(instance.getInsecureSkipTLSVerify());
        
        this.withService(instance.getService());
        
        this.withVersion(instance.getVersion());
        
        this.withVersionPriority(instance.getVersionPriority());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1APIServiceSpec build() {
        V1beta1APIServiceSpec buildable = new V1beta1APIServiceSpec();
        buildable.setCaBundle(fluent.getCaBundle());
        buildable.setGroup(fluent.getGroup());
        buildable.setGroupPriorityMinimum(fluent.getGroupPriorityMinimum());
        buildable.setInsecureSkipTLSVerify(fluent.getInsecureSkipTLSVerify());
        buildable.setService(fluent.getService());
        buildable.setVersion(fluent.getVersion());
        buildable.setVersionPriority(fluent.getVersionPriority());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1APIServiceSpecBuilder that = (V1beta1APIServiceSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
