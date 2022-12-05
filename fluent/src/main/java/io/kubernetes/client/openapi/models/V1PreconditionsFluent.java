package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PreconditionsFluent<A extends V1PreconditionsFluent<A>> extends Fluent<A>{
  public String getResourceVersion();
  public A withResourceVersion(String resourceVersion);
  public Boolean hasResourceVersion();
  public String getUid();
  public A withUid(String uid);
  public Boolean hasUid();
  
}