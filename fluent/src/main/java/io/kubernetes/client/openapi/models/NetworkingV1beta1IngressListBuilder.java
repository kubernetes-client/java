package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class NetworkingV1beta1IngressListBuilder extends io.kubernetes.client.openapi.models.NetworkingV1beta1IngressListFluentImpl<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressListBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressList,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressListBuilder> {

    io.kubernetes.client.openapi.models.NetworkingV1beta1IngressListFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public NetworkingV1beta1IngressListBuilder() {
        this(true);
    }

    public NetworkingV1beta1IngressListBuilder(java.lang.Boolean validationEnabled) {
        this(new NetworkingV1beta1IngressList(), validationEnabled);
    }

    public NetworkingV1beta1IngressListBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressListFluent<?> fluent) {
        this(fluent, true);
    }

    public NetworkingV1beta1IngressListBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressListFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new NetworkingV1beta1IngressList(), validationEnabled);
    }

    public NetworkingV1beta1IngressListBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressListFluent<?> fluent,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressList instance) {
        this(fluent, instance, true);
    }

    public NetworkingV1beta1IngressListBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressListFluent<?> fluent,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressList instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withItems(instance.getItems());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public NetworkingV1beta1IngressListBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressList instance) {
        this(instance,true);
    }

    public NetworkingV1beta1IngressListBuilder(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressList instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withItems(instance.getItems());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressList build() {
        NetworkingV1beta1IngressList buildable = new NetworkingV1beta1IngressList();
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
        NetworkingV1beta1IngressListBuilder that = (NetworkingV1beta1IngressListBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
