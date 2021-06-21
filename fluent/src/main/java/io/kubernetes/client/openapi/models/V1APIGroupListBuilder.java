package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1APIGroupListBuilder extends io.kubernetes.client.openapi.models.V1APIGroupListFluentImpl<io.kubernetes.client.openapi.models.V1APIGroupListBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1APIGroupList,io.kubernetes.client.openapi.models.V1APIGroupListBuilder> {

    io.kubernetes.client.openapi.models.V1APIGroupListFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1APIGroupListBuilder() {
        this(true);
    }

    public V1APIGroupListBuilder(java.lang.Boolean validationEnabled) {
        this(new V1APIGroupList(), validationEnabled);
    }

    public V1APIGroupListBuilder(io.kubernetes.client.openapi.models.V1APIGroupListFluent<?> fluent) {
        this(fluent, true);
    }

    public V1APIGroupListBuilder(io.kubernetes.client.openapi.models.V1APIGroupListFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1APIGroupList(), validationEnabled);
    }

    public V1APIGroupListBuilder(io.kubernetes.client.openapi.models.V1APIGroupListFluent<?> fluent,io.kubernetes.client.openapi.models.V1APIGroupList instance) {
        this(fluent, instance, true);
    }

    public V1APIGroupListBuilder(io.kubernetes.client.openapi.models.V1APIGroupListFluent<?> fluent,io.kubernetes.client.openapi.models.V1APIGroupList instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withGroups(instance.getGroups());
        
        fluent.withKind(instance.getKind());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1APIGroupListBuilder(io.kubernetes.client.openapi.models.V1APIGroupList instance) {
        this(instance,true);
    }

    public V1APIGroupListBuilder(io.kubernetes.client.openapi.models.V1APIGroupList instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withGroups(instance.getGroups());
        
        this.withKind(instance.getKind());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1APIGroupList build() {
        V1APIGroupList buildable = new V1APIGroupList();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setGroups(fluent.getGroups());
        buildable.setKind(fluent.getKind());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1APIGroupListBuilder that = (V1APIGroupListBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
