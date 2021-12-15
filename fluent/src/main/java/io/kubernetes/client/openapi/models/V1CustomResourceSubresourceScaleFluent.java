package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CustomResourceSubresourceScaleFluent<A extends io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getLabelSelectorPath();
  public A withLabelSelectorPath(java.lang.String labelSelectorPath);
  public java.lang.Boolean hasLabelSelectorPath();
  
  /**
   * Method is deprecated. use withLabelSelectorPath instead.
   */
  @java.lang.Deprecated
  public A withNewLabelSelectorPath(java.lang.String original);
  public java.lang.String getSpecReplicasPath();
  public A withSpecReplicasPath(java.lang.String specReplicasPath);
  public java.lang.Boolean hasSpecReplicasPath();
  
  /**
   * Method is deprecated. use withSpecReplicasPath instead.
   */
  @java.lang.Deprecated
  public A withNewSpecReplicasPath(java.lang.String original);
  public java.lang.String getStatusReplicasPath();
  public A withStatusReplicasPath(java.lang.String statusReplicasPath);
  public java.lang.Boolean hasStatusReplicasPath();
  
  /**
   * Method is deprecated. use withStatusReplicasPath instead.
   */
  @java.lang.Deprecated
  public A withNewStatusReplicasPath(java.lang.String original);
  
}