package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PersistentVolumeClaimVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getClaimName();
  public A withClaimName(java.lang.String claimName);
  public java.lang.Boolean hasClaimName();
  
  /**
   * Method is deprecated. use withClaimName instead.
   */
  @java.lang.Deprecated
  public A withNewClaimName(java.lang.String arg0);
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  
}