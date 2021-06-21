package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1beta1SELinuxStrategyOptionsFluent<A extends io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getRule();
    public A withRule(java.lang.String rule);
    public java.lang.Boolean hasRule();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withRule instead.
     */
        public A withNewRule(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSeLinuxOptions instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1SELinuxOptions getSeLinuxOptions();
    public io.kubernetes.client.openapi.models.V1SELinuxOptions buildSeLinuxOptions();
    public A withSeLinuxOptions(io.kubernetes.client.openapi.models.V1SELinuxOptions seLinuxOptions);
    public java.lang.Boolean hasSeLinuxOptions();
    public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptions();
    public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> withNewSeLinuxOptionsLike(io.kubernetes.client.openapi.models.V1SELinuxOptions item);
    public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> editSeLinuxOptions();
    public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptions();
    public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<A> editOrNewSeLinuxOptionsLike(io.kubernetes.client.openapi.models.V1SELinuxOptions item);
    public interface SeLinuxOptionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1SELinuxOptionsFluent<io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent.SeLinuxOptionsNested<N>> {

            public N and();
            public N endSeLinuxOptions();    }


}
