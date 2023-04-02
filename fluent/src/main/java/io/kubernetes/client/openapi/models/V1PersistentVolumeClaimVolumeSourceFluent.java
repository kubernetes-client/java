package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PersistentVolumeClaimVolumeSourceFluent<A extends V1PersistentVolumeClaimVolumeSourceFluent<A>> extends Fluent<A>{
  public String getClaimName();
  public A withClaimName(String claimName);
  public Boolean hasClaimName();
  public Boolean getReadOnly();
  public A withReadOnly(Boolean readOnly);
  public Boolean hasReadOnly();
  public A withReadOnly();
  
}