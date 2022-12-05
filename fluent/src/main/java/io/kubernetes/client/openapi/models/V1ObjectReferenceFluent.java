package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ObjectReferenceFluent<A extends V1ObjectReferenceFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public String getFieldPath();
  public A withFieldPath(String fieldPath);
  public Boolean hasFieldPath();
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public String getNamespace();
  public A withNamespace(String namespace);
  public Boolean hasNamespace();
  public String getResourceVersion();
  public A withResourceVersion(String resourceVersion);
  public Boolean hasResourceVersion();
  public String getUid();
  public A withUid(String uid);
  public Boolean hasUid();
  
}