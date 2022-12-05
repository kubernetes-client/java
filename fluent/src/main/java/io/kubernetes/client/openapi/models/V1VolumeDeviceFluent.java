package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1VolumeDeviceFluent<A extends V1VolumeDeviceFluent<A>> extends Fluent<A>{
  public String getDevicePath();
  public A withDevicePath(String devicePath);
  public Boolean hasDevicePath();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  
}