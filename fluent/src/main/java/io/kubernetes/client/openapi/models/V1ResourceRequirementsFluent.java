package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

 /**
  * Generated
  */
public interface V1ResourceRequirementsFluent<A extends V1ResourceRequirementsFluent<A>> extends Fluent<A>{
  public A addToLimits(String key,Quantity value);
  public A addToLimits(Map<String,Quantity> map);
  public A removeFromLimits(String key);
  public A removeFromLimits(Map<String,Quantity> map);
  public Map<String,Quantity> getLimits();
  public <K,V>A withLimits(Map<String,Quantity> limits);
  public Boolean hasLimits();
  public A addToRequests(String key,Quantity value);
  public A addToRequests(Map<String,Quantity> map);
  public A removeFromRequests(String key);
  public A removeFromRequests(Map<String,Quantity> map);
  public Map<String,Quantity> getRequests();
  public <K,V>A withRequests(Map<String,Quantity> requests);
  public Boolean hasRequests();
  
}