package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class FlowcontrolV1beta1SubjectBuilder extends io.kubernetes.client.openapi.models.FlowcontrolV1beta1SubjectFluentImpl<io.kubernetes.client.openapi.models.FlowcontrolV1beta1SubjectBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.FlowcontrolV1beta1Subject,io.kubernetes.client.openapi.models.FlowcontrolV1beta1SubjectBuilder> {

    io.kubernetes.client.openapi.models.FlowcontrolV1beta1SubjectFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public FlowcontrolV1beta1SubjectBuilder() {
        this(true);
    }

    public FlowcontrolV1beta1SubjectBuilder(java.lang.Boolean validationEnabled) {
        this(new FlowcontrolV1beta1Subject(), validationEnabled);
    }

    public FlowcontrolV1beta1SubjectBuilder(io.kubernetes.client.openapi.models.FlowcontrolV1beta1SubjectFluent<?> fluent) {
        this(fluent, true);
    }

    public FlowcontrolV1beta1SubjectBuilder(io.kubernetes.client.openapi.models.FlowcontrolV1beta1SubjectFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new FlowcontrolV1beta1Subject(), validationEnabled);
    }

    public FlowcontrolV1beta1SubjectBuilder(io.kubernetes.client.openapi.models.FlowcontrolV1beta1SubjectFluent<?> fluent,io.kubernetes.client.openapi.models.FlowcontrolV1beta1Subject instance) {
        this(fluent, instance, true);
    }

    public FlowcontrolV1beta1SubjectBuilder(io.kubernetes.client.openapi.models.FlowcontrolV1beta1SubjectFluent<?> fluent,io.kubernetes.client.openapi.models.FlowcontrolV1beta1Subject instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withGroup(instance.getGroup());
        
        fluent.withKind(instance.getKind());
        
        fluent.withServiceAccount(instance.getServiceAccount());
        
        fluent.withUser(instance.getUser());
        
        this.validationEnabled = validationEnabled; 
    }

    public FlowcontrolV1beta1SubjectBuilder(io.kubernetes.client.openapi.models.FlowcontrolV1beta1Subject instance) {
        this(instance,true);
    }

    public FlowcontrolV1beta1SubjectBuilder(io.kubernetes.client.openapi.models.FlowcontrolV1beta1Subject instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withGroup(instance.getGroup());
        
        this.withKind(instance.getKind());
        
        this.withServiceAccount(instance.getServiceAccount());
        
        this.withUser(instance.getUser());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1beta1Subject build() {
        FlowcontrolV1beta1Subject buildable = new FlowcontrolV1beta1Subject();
        buildable.setGroup(fluent.getGroup());
        buildable.setKind(fluent.getKind());
        buildable.setServiceAccount(fluent.getServiceAccount());
        buildable.setUser(fluent.getUser());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlowcontrolV1beta1SubjectBuilder that = (FlowcontrolV1beta1SubjectBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
