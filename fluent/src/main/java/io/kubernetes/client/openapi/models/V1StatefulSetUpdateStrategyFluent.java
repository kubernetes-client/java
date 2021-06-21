package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1StatefulSetUpdateStrategyFluent<A extends io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRollingUpdate instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategy getRollingUpdate();
    public io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategy buildRollingUpdate();
    public A withRollingUpdate(io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategy rollingUpdate);
    public java.lang.Boolean hasRollingUpdate();
    public io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate();
    public io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategy item);
    public io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editRollingUpdate();
    public io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate();
    public io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategy item);
    public java.lang.String getType();
    public A withType(java.lang.String type);
    public java.lang.Boolean hasType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original);
    public interface RollingUpdateNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategyFluent<io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<N>> {

            public N and();
            public N endRollingUpdate();    }


}
