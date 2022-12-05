package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1AzureFileVolumeSourceFluent<A extends V1AzureFileVolumeSourceFluent<A>> extends Fluent<A>{
  public Boolean getReadOnly();
  public A withReadOnly(Boolean readOnly);
  public Boolean hasReadOnly();
  public String getSecretName();
  public A withSecretName(String secretName);
  public Boolean hasSecretName();
  public String getShareName();
  public A withShareName(String shareName);
  public Boolean hasShareName();
  public A withReadOnly();
  
}