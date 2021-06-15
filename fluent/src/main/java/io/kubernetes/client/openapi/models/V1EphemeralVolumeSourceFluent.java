package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1EphemeralVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Boolean getReadOnly();
    public A withReadOnly(java.lang.Boolean readOnly);
    public java.lang.Boolean hasReadOnly();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildVolumeClaimTemplate instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate getVolumeClaimTemplate();
    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate buildVolumeClaimTemplate();
    public A withVolumeClaimTemplate(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate volumeClaimTemplate);
    public java.lang.Boolean hasVolumeClaimTemplate();
    public io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<A> withNewVolumeClaimTemplate();
    public io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<A> withNewVolumeClaimTemplateLike(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate item);
    public io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<A> editVolumeClaimTemplate();
    public io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<A> editOrNewVolumeClaimTemplate();
    public io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<A> editOrNewVolumeClaimTemplateLike(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate item);
    public interface VolumeClaimTemplateNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent<io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<N>> {

            public N and();
            public N endVolumeClaimTemplate();    }


}
