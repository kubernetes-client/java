package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1VolumeNodeAffinityFluent<A extends io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRequired instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1NodeSelector getRequired();
    public io.kubernetes.client.openapi.models.V1NodeSelector buildRequired();
    public A withRequired(io.kubernetes.client.openapi.models.V1NodeSelector required);
    public java.lang.Boolean hasRequired();
    public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A> withNewRequired();
    public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A> withNewRequiredLike(io.kubernetes.client.openapi.models.V1NodeSelector item);
    public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A> editRequired();
    public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A> editOrNewRequired();
    public io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<A> editOrNewRequiredLike(io.kubernetes.client.openapi.models.V1NodeSelector item);
    public interface RequiredNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1NodeSelectorFluent<io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent.RequiredNested<N>> {

            public N and();
            public N endRequired();    }


}
