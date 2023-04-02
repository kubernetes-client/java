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
public interface V1LimitRangeItemFluent<A extends V1LimitRangeItemFluent<A>> extends Fluent<A>{
  public A addToDefault(String key,Quantity value);
  public A addToDefault(Map<String,Quantity> map);
  public A removeFromDefault(String key);
  public A removeFromDefault(Map<String,Quantity> map);
  public Map<String,Quantity> getDefault();
  public <K,V>A withDefault(Map<String,Quantity> _default);
  public Boolean hasDefault();
  public A addToDefaultRequest(String key,Quantity value);
  public A addToDefaultRequest(Map<String,Quantity> map);
  public A removeFromDefaultRequest(String key);
  public A removeFromDefaultRequest(Map<String,Quantity> map);
  public Map<String,Quantity> getDefaultRequest();
  public <K,V>A withDefaultRequest(Map<String,Quantity> defaultRequest);
  public Boolean hasDefaultRequest();
  public A addToMax(String key,Quantity value);
  public A addToMax(Map<String,Quantity> map);
  public A removeFromMax(String key);
  public A removeFromMax(Map<String,Quantity> map);
  public Map<String,Quantity> getMax();
  public <K,V>A withMax(Map<String,Quantity> max);
  public Boolean hasMax();
  public A addToMaxLimitRequestRatio(String key,Quantity value);
  public A addToMaxLimitRequestRatio(Map<String,Quantity> map);
  public A removeFromMaxLimitRequestRatio(String key);
  public A removeFromMaxLimitRequestRatio(Map<String,Quantity> map);
  public Map<String,Quantity> getMaxLimitRequestRatio();
  public <K,V>A withMaxLimitRequestRatio(Map<String,Quantity> maxLimitRequestRatio);
  public Boolean hasMaxLimitRequestRatio();
  public A addToMin(String key,Quantity value);
  public A addToMin(Map<String,Quantity> map);
  public A removeFromMin(String key);
  public A removeFromMin(Map<String,Quantity> map);
  public Map<String,Quantity> getMin();
  public <K,V>A withMin(Map<String,Quantity> min);
  public Boolean hasMin();
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  
}