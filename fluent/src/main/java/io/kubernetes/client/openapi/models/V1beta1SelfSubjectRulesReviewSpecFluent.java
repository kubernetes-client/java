package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1beta1SelfSubjectRulesReviewSpecFluent<A extends io.kubernetes.client.openapi.models.V1beta1SelfSubjectRulesReviewSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getNamespace();
    public A withNamespace(java.lang.String namespace);
    public java.lang.Boolean hasNamespace();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withNamespace instead.
     */
        public A withNewNamespace(java.lang.String original);
}
