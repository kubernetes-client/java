package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CustomResourceColumnDefinitionFluent<A extends V1CustomResourceColumnDefinitionFluent<A>> extends Fluent<A>{
  public String getDescription();
  public A withDescription(String description);
  public Boolean hasDescription();
  public String getFormat();
  public A withFormat(String format);
  public Boolean hasFormat();
  public String getJsonPath();
  public A withJsonPath(String jsonPath);
  public Boolean hasJsonPath();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public Integer getPriority();
  public A withPriority(Integer priority);
  public Boolean hasPriority();
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  
}