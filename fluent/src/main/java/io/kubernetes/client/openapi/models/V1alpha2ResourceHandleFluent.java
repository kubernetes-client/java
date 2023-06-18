package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha2ResourceHandleFluent<A extends V1alpha2ResourceHandleFluent<A>> extends Fluent<A>{
  public String getData();
  public A withData(String data);
  public Boolean hasData();
  public String getDriverName();
  public A withDriverName(String driverName);
  public Boolean hasDriverName();
  
}