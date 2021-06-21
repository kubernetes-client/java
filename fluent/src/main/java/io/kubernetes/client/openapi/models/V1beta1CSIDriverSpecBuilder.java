package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1CSIDriverSpecBuilder extends io.kubernetes.client.openapi.models.V1beta1CSIDriverSpecFluentImpl<io.kubernetes.client.openapi.models.V1beta1CSIDriverSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1CSIDriverSpec,io.kubernetes.client.openapi.models.V1beta1CSIDriverSpecBuilder> {

    io.kubernetes.client.openapi.models.V1beta1CSIDriverSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1CSIDriverSpecBuilder() {
        this(true);
    }

    public V1beta1CSIDriverSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1CSIDriverSpec(), validationEnabled);
    }

    public V1beta1CSIDriverSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CSIDriverSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1CSIDriverSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CSIDriverSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1CSIDriverSpec(), validationEnabled);
    }

    public V1beta1CSIDriverSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CSIDriverSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CSIDriverSpec instance) {
        this(fluent, instance, true);
    }

    public V1beta1CSIDriverSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CSIDriverSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CSIDriverSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAttachRequired(instance.getAttachRequired());
        
        fluent.withFsGroupPolicy(instance.getFsGroupPolicy());
        
        fluent.withPodInfoOnMount(instance.getPodInfoOnMount());
        
        fluent.withRequiresRepublish(instance.getRequiresRepublish());
        
        fluent.withStorageCapacity(instance.getStorageCapacity());
        
        fluent.withTokenRequests(instance.getTokenRequests());
        
        fluent.withVolumeLifecycleModes(instance.getVolumeLifecycleModes());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1CSIDriverSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CSIDriverSpec instance) {
        this(instance,true);
    }

    public V1beta1CSIDriverSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CSIDriverSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAttachRequired(instance.getAttachRequired());
        
        this.withFsGroupPolicy(instance.getFsGroupPolicy());
        
        this.withPodInfoOnMount(instance.getPodInfoOnMount());
        
        this.withRequiresRepublish(instance.getRequiresRepublish());
        
        this.withStorageCapacity(instance.getStorageCapacity());
        
        this.withTokenRequests(instance.getTokenRequests());
        
        this.withVolumeLifecycleModes(instance.getVolumeLifecycleModes());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1CSIDriverSpec build() {
        V1beta1CSIDriverSpec buildable = new V1beta1CSIDriverSpec();
        buildable.setAttachRequired(fluent.getAttachRequired());
        buildable.setFsGroupPolicy(fluent.getFsGroupPolicy());
        buildable.setPodInfoOnMount(fluent.getPodInfoOnMount());
        buildable.setRequiresRepublish(fluent.getRequiresRepublish());
        buildable.setStorageCapacity(fluent.getStorageCapacity());
        buildable.setTokenRequests(fluent.getTokenRequests());
        buildable.setVolumeLifecycleModes(fluent.getVolumeLifecycleModes());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1CSIDriverSpecBuilder that = (V1beta1CSIDriverSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
