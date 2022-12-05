package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1IngressClassParametersReferenceFluent<A extends V1IngressClassParametersReferenceFluent<A>> extends Fluent<A>{
  public String getApiGroup();
  public A withApiGroup(String apiGroup);
  public Boolean hasApiGroup();
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public String getNamespace();
  public A withNamespace(String namespace);
  public Boolean hasNamespace();
  public String getScope();
  public A withScope(String scope);
  public Boolean hasScope();
  
}