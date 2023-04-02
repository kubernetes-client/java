package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NonResourceAttributesFluent<A extends V1NonResourceAttributesFluent<A>> extends Fluent<A>{
  public String getPath();
  public A withPath(String path);
  public Boolean hasPath();
  public String getVerb();
  public A withVerb(String verb);
  public Boolean hasVerb();
  
}