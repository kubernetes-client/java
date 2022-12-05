package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ExternalDocumentationFluent<A extends V1ExternalDocumentationFluent<A>> extends Fluent<A>{
  public String getDescription();
  public A withDescription(String description);
  public Boolean hasDescription();
  public String getUrl();
  public A withUrl(String url);
  public Boolean hasUrl();
  
}