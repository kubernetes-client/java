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
public interface V1ResourceQuotaStatusFluent<A extends V1ResourceQuotaStatusFluent<A>> extends Fluent<A>{
  public A addToHard(String key,Quantity value);
  public A addToHard(Map<String,Quantity> map);
  public A removeFromHard(String key);
  public A removeFromHard(Map<String,Quantity> map);
  public Map<String,Quantity> getHard();
  public <K,V>A withHard(Map<String,Quantity> hard);
  public Boolean hasHard();
  public A addToUsed(String key,Quantity value);
  public A addToUsed(Map<String,Quantity> map);
  public A removeFromUsed(String key);
  public A removeFromUsed(Map<String,Quantity> map);
  public Map<String,Quantity> getUsed();
  public <K,V>A withUsed(Map<String,Quantity> used);
  public Boolean hasUsed();
  
}