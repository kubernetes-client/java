package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

public interface V1NodeSelectorRequirementFluent<A extends io.kubernetes.client.openapi.models.V1NodeSelectorRequirementFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


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
    public A addToValues(int index,java.lang.String item);
    public A setToValues(int index,java.lang.String item);
    public A addToValues(java.lang.String... items);
    public A addAllToValues(java.util.Collection<java.lang.String> items);
    public A removeFromValues(java.lang.String... items);
    public A removeAllFromValues(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getValues();
    public java.lang.String getValue(int index);
    public java.lang.String getFirstValue();
    public java.lang.String getLastValue();
    public java.lang.String getMatchingValue(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingValue(java.util.function.Predicate<java.lang.String> predicate);
    public A withValues(java.util.List<java.lang.String> values);
    public A withValues(java.lang.String... values);
    public java.lang.Boolean hasValues();
    public A addNewValue(java.lang.String original);
}
