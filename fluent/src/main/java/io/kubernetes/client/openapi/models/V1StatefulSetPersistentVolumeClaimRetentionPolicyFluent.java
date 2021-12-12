package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<A extends io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getWhenDeleted();
  public A withWhenDeleted(java.lang.String whenDeleted);
  public java.lang.Boolean hasWhenDeleted();
  
  /**
   * Method is deprecated. use withWhenDeleted instead.
   */
  @java.lang.Deprecated
  public A withNewWhenDeleted(java.lang.String original);
  public java.lang.String getWhenScaled();
  public A withWhenScaled(java.lang.String whenScaled);
  public java.lang.Boolean hasWhenScaled();
  
  /**
   * Method is deprecated. use withWhenScaled instead.
   */
  @java.lang.Deprecated
  public A withNewWhenScaled(java.lang.String original);
  
}