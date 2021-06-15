package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1ClusterRoleListBuilder extends io.kubernetes.client.openapi.models.V1beta1ClusterRoleListFluentImpl<io.kubernetes.client.openapi.models.V1beta1ClusterRoleListBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1ClusterRoleList,io.kubernetes.client.openapi.models.V1beta1ClusterRoleListBuilder> {

    io.kubernetes.client.openapi.models.V1beta1ClusterRoleListFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1ClusterRoleListBuilder() {
        this(true);
    }

    public V1beta1ClusterRoleListBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1ClusterRoleList(), validationEnabled);
    }

    public V1beta1ClusterRoleListBuilder(io.kubernetes.client.openapi.models.V1beta1ClusterRoleListFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1ClusterRoleListBuilder(io.kubernetes.client.openapi.models.V1beta1ClusterRoleListFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1ClusterRoleList(), validationEnabled);
    }

    public V1beta1ClusterRoleListBuilder(io.kubernetes.client.openapi.models.V1beta1ClusterRoleListFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1ClusterRoleList instance) {
        this(fluent, instance, true);
    }

    public V1beta1ClusterRoleListBuilder(io.kubernetes.client.openapi.models.V1beta1ClusterRoleListFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1ClusterRoleList instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withItems(instance.getItems());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1ClusterRoleListBuilder(io.kubernetes.client.openapi.models.V1beta1ClusterRoleList instance) {
        this(instance,true);
    }

    public V1beta1ClusterRoleListBuilder(io.kubernetes.client.openapi.models.V1beta1ClusterRoleList instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withItems(instance.getItems());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleList build() {
        V1beta1ClusterRoleList buildable = new V1beta1ClusterRoleList();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setItems(fluent.getItems());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1ClusterRoleListBuilder that = (V1beta1ClusterRoleListBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
