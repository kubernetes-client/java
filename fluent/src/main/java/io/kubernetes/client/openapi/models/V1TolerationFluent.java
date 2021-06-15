package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;

public interface V1TolerationFluent<A extends io.kubernetes.client.openapi.models.V1TolerationFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getEffect();
    public A withEffect(java.lang.String effect);
    public java.lang.Boolean hasEffect();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withEffect instead.
     */
        public A withNewEffect(java.lang.String original);
    public java.lang.String getKey();
    public A withKey(java.lang.String key);
    public java.lang.Boolean hasKey();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKey instead.
     */
        public A withNewKey(java.lang.String original);
    public java.lang.String getOperator();
    public A withOperator(java.lang.String operator);
    public java.lang.Boolean hasOperator();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withOperator instead.
     */
        public A withNewOperator(java.lang.String original);
    public java.lang.Long getTolerationSeconds();
    public A withTolerationSeconds(java.lang.Long tolerationSeconds);
    public java.lang.Boolean hasTolerationSeconds();
    public java.lang.String getValue();
    public A withValue(java.lang.String value);
    public java.lang.Boolean hasValue();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withValue instead.
     */
        public A withNewValue(java.lang.String original);
}
