package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface ApiregistrationV1ServiceReferenceFluent<A extends ApiregistrationV1ServiceReferenceFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public String getNamespace();
  public A withNamespace(String namespace);
  public Boolean hasNamespace();
  public Integer getPort();
  public A withPort(Integer port);
  public Boolean hasPort();
  
}