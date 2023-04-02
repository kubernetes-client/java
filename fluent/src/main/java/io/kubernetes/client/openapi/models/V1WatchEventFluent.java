package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1WatchEventFluent<A extends V1WatchEventFluent<A>> extends Fluent<A>{
  public Object getObject();
  public A withObject(Object _object);
  public Boolean hasObject();
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  
}