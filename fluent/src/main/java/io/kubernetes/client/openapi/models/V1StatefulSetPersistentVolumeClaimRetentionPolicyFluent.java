package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<A extends V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<A>> extends Fluent<A>{
  public String getWhenDeleted();
  public A withWhenDeleted(String whenDeleted);
  public Boolean hasWhenDeleted();
  public String getWhenScaled();
  public A withWhenScaled(String whenScaled);
  public Boolean hasWhenScaled();
  
}