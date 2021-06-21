package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import java.time.OffsetDateTime;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public interface V1ManagedFieldsEntryFluent<A extends io.kubernetes.client.openapi.models.V1ManagedFieldsEntryFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getApiVersion();
    public A withApiVersion(java.lang.String apiVersion);
    public java.lang.Boolean hasApiVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original);
    public java.lang.String getFieldsType();
    public A withFieldsType(java.lang.String fieldsType);
    public java.lang.Boolean hasFieldsType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFieldsType instead.
     */
        public A withNewFieldsType(java.lang.String original);
    public java.lang.Object getFieldsV1();
    public A withFieldsV1(java.lang.Object fieldsV1);
    public java.lang.Boolean hasFieldsV1();
    public java.lang.String getManager();
    public A withManager(java.lang.String manager);
    public java.lang.Boolean hasManager();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withManager instead.
     */
        public A withNewManager(java.lang.String original);
    public java.lang.String getOperation();
    public A withOperation(java.lang.String operation);
    public java.lang.Boolean hasOperation();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withOperation instead.
     */
        public A withNewOperation(java.lang.String original);
    public java.time.OffsetDateTime getTime();
    public A withTime(java.time.OffsetDateTime time);
    public java.lang.Boolean hasTime();
}
