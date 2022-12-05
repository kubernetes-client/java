package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1QuobyteVolumeSourceFluent<A extends V1QuobyteVolumeSourceFluent<A>> extends Fluent<A>{
  public String getGroup();
  public A withGroup(String group);
  public Boolean hasGroup();
  public Boolean getReadOnly();
  public A withReadOnly(Boolean readOnly);
  public Boolean hasReadOnly();
  public String getRegistry();
  public A withRegistry(String registry);
  public Boolean hasRegistry();
  public String getTenant();
  public A withTenant(String tenant);
  public Boolean hasTenant();
  public String getUser();
  public A withUser(String user);
  public Boolean hasUser();
  public String getVolume();
  public A withVolume(String volume);
  public Boolean hasVolume();
  public A withReadOnly();
  
}