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
public interface V1OverheadFluent<A extends V1OverheadFluent<A>> extends Fluent<A>{
  public A addToPodFixed(String key,Quantity value);
  public A addToPodFixed(Map<String,Quantity> map);
  public A removeFromPodFixed(String key);
  public A removeFromPodFixed(Map<String,Quantity> map);
  public Map<String,Quantity> getPodFixed();
  public <K,V>A withPodFixed(Map<String,Quantity> podFixed);
  public Boolean hasPodFixed();
  
}