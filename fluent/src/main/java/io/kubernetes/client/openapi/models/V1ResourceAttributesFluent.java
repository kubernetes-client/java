package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ResourceAttributesFluent<A extends V1ResourceAttributesFluent<A>> extends Fluent<A>{
  public String getGroup();
  public A withGroup(String group);
  public Boolean hasGroup();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public String getNamespace();
  public A withNamespace(String namespace);
  public Boolean hasNamespace();
  public String getResource();
  public A withResource(String resource);
  public Boolean hasResource();
  public String getSubresource();
  public A withSubresource(String subresource);
  public Boolean hasSubresource();
  public String getVerb();
  public A withVerb(String verb);
  public Boolean hasVerb();
  public String getVersion();
  public A withVersion(String version);
  public Boolean hasVersion();
  
}