package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1VolumeMountFluent<A extends io.kubernetes.client.openapi.models.V1VolumeMountFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getMountPath();
  public A withMountPath(java.lang.String mountPath);
  public java.lang.Boolean hasMountPath();
  
  /**
   * Method is deprecated. use withMountPath instead.
   */
  @java.lang.Deprecated
  public A withNewMountPath(java.lang.String arg0);
  public java.lang.String getMountPropagation();
  public A withMountPropagation(java.lang.String mountPropagation);
  public java.lang.Boolean hasMountPropagation();
  
  /**
   * Method is deprecated. use withMountPropagation instead.
   */
  @java.lang.Deprecated
  public A withNewMountPropagation(java.lang.String arg0);
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String arg0);
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  public java.lang.String getSubPath();
  public A withSubPath(java.lang.String subPath);
  public java.lang.Boolean hasSubPath();
  
  /**
   * Method is deprecated. use withSubPath instead.
   */
  @java.lang.Deprecated
  public A withNewSubPath(java.lang.String arg0);
  public java.lang.String getSubPathExpr();
  public A withSubPathExpr(java.lang.String subPathExpr);
  public java.lang.Boolean hasSubPathExpr();
  
  /**
   * Method is deprecated. use withSubPathExpr instead.
   */
  @java.lang.Deprecated
  public A withNewSubPathExpr(java.lang.String arg0);
  
}