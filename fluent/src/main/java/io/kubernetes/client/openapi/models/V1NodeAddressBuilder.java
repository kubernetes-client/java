package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1NodeAddressBuilder extends io.kubernetes.client.openapi.models.V1NodeAddressFluentImpl<io.kubernetes.client.openapi.models.V1NodeAddressBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1NodeAddress,io.kubernetes.client.openapi.models.V1NodeAddressBuilder> {

    io.kubernetes.client.openapi.models.V1NodeAddressFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1NodeAddressBuilder() {
        this(true);
    }

    public V1NodeAddressBuilder(java.lang.Boolean validationEnabled) {
        this(new V1NodeAddress(), validationEnabled);
    }

    public V1NodeAddressBuilder(io.kubernetes.client.openapi.models.V1NodeAddressFluent<?> fluent) {
        this(fluent, true);
    }

    public V1NodeAddressBuilder(io.kubernetes.client.openapi.models.V1NodeAddressFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1NodeAddress(), validationEnabled);
    }

    public V1NodeAddressBuilder(io.kubernetes.client.openapi.models.V1NodeAddressFluent<?> fluent,io.kubernetes.client.openapi.models.V1NodeAddress instance) {
        this(fluent, instance, true);
    }

    public V1NodeAddressBuilder(io.kubernetes.client.openapi.models.V1NodeAddressFluent<?> fluent,io.kubernetes.client.openapi.models.V1NodeAddress instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAddress(instance.getAddress());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1NodeAddressBuilder(io.kubernetes.client.openapi.models.V1NodeAddress instance) {
        this(instance,true);
    }

    public V1NodeAddressBuilder(io.kubernetes.client.openapi.models.V1NodeAddress instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAddress(instance.getAddress());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1NodeAddress build() {
        V1NodeAddress buildable = new V1NodeAddress();
        buildable.setAddress(fluent.getAddress());
        buildable.setType(fluent.getType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1NodeAddressBuilder that = (V1NodeAddressBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
