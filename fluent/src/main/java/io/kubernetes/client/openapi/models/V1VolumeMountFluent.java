package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1VolumeMountFluent<A extends V1VolumeMountFluent<A>> extends Fluent<A>{
  public String getMountPath();
  public A withMountPath(String mountPath);
  public Boolean hasMountPath();
  public String getMountPropagation();
  public A withMountPropagation(String mountPropagation);
  public Boolean hasMountPropagation();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public Boolean getReadOnly();
  public A withReadOnly(Boolean readOnly);
  public Boolean hasReadOnly();
  public String getSubPath();
  public A withSubPath(String subPath);
  public Boolean hasSubPath();
  public String getSubPathExpr();
  public A withSubPathExpr(String subPathExpr);
  public Boolean hasSubPathExpr();
  public A withReadOnly();
  
}