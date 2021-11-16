package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import java.time.OffsetDateTime;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ManagedFieldsEntryFluent<A extends io.kubernetes.client.openapi.models.V1ManagedFieldsEntryFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public java.lang.Boolean hasApiVersion();
  
  /**
   * Method is deprecated. use withApiVersion instead.
   */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String arg0);
  public java.lang.String getFieldsType();
  public A withFieldsType(java.lang.String fieldsType);
  public java.lang.Boolean hasFieldsType();
  
  /**
   * Method is deprecated. use withFieldsType instead.
   */
  @java.lang.Deprecated
  public A withNewFieldsType(java.lang.String arg0);
  public java.lang.Object getFieldsV1();
  public A withFieldsV1(java.lang.Object fieldsV1);
  public java.lang.Boolean hasFieldsV1();
  public java.lang.String getManager();
  public A withManager(java.lang.String manager);
  public java.lang.Boolean hasManager();
  
  /**
   * Method is deprecated. use withManager instead.
   */
  @java.lang.Deprecated
  public A withNewManager(java.lang.String arg0);
  public java.lang.String getOperation();
  public A withOperation(java.lang.String operation);
  public java.lang.Boolean hasOperation();
  
  /**
   * Method is deprecated. use withOperation instead.
   */
  @java.lang.Deprecated
  public A withNewOperation(java.lang.String arg0);
  public java.lang.String getSubresource();
  public A withSubresource(java.lang.String subresource);
  public java.lang.Boolean hasSubresource();
  
  /**
   * Method is deprecated. use withSubresource instead.
   */
  @java.lang.Deprecated
  public A withNewSubresource(java.lang.String arg0);
  public java.time.OffsetDateTime getTime();
  public A withTime(java.time.OffsetDateTime time);
  public java.lang.Boolean hasTime();
  
}