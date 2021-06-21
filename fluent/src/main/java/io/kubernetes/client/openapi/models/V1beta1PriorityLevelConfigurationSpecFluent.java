package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1beta1PriorityLevelConfigurationSpecFluent<A extends io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildLimited instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration getLimited();
    public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration buildLimited();
    public A withLimited(io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration limited);
    public java.lang.Boolean hasLimited();
    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<A> withNewLimited();
    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<A> withNewLimitedLike(io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration item);
    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<A> editLimited();
    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<A> editOrNewLimited();
    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<A> editOrNewLimitedLike(io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration item);
    public java.lang.String getType();
    public A withType(java.lang.String type);
    public java.lang.Boolean hasType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original);
    public interface LimitedNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<N>> {

            public N and();
            public N endLimited();    }


}
