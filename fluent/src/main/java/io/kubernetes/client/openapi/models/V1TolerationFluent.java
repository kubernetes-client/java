package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1TolerationFluent<A extends V1TolerationFluent<A>> extends Fluent<A>{
  public String getEffect();
  public A withEffect(String effect);
  public Boolean hasEffect();
  public String getKey();
  public A withKey(String key);
  public Boolean hasKey();
  public String getOperator();
  public A withOperator(String operator);
  public Boolean hasOperator();
  public Long getTolerationSeconds();
  public A withTolerationSeconds(Long tolerationSeconds);
  public Boolean hasTolerationSeconds();
  public String getValue();
  public A withValue(String value);
  public Boolean hasValue();
  
}