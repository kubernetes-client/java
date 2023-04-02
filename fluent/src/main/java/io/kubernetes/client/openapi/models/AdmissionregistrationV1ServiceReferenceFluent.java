package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface AdmissionregistrationV1ServiceReferenceFluent<A extends AdmissionregistrationV1ServiceReferenceFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public String getNamespace();
  public A withNamespace(String namespace);
  public Boolean hasNamespace();
  public String getPath();
  public A withPath(String path);
  public Boolean hasPath();
  public Integer getPort();
  public A withPort(Integer port);
  public Boolean hasPort();
  
}