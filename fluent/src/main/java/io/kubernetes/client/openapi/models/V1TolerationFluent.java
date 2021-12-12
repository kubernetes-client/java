package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1TolerationFluent<A extends io.kubernetes.client.openapi.models.V1TolerationFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public io.kubernetes.client.openapi.models.V1Toleration.EffectEnum getEffect();
  public A withEffect(io.kubernetes.client.openapi.models.V1Toleration.EffectEnum effect);
  public java.lang.Boolean hasEffect();
  public java.lang.String getKey();
  public A withKey(java.lang.String key);
  public java.lang.Boolean hasKey();
  
  /**
   * Method is deprecated. use withKey instead.
   */
  @java.lang.Deprecated
  public A withNewKey(java.lang.String original);
  public io.kubernetes.client.openapi.models.V1Toleration.OperatorEnum getOperator();
  public A withOperator(io.kubernetes.client.openapi.models.V1Toleration.OperatorEnum operator);
  public java.lang.Boolean hasOperator();
  public java.lang.Long getTolerationSeconds();
  public A withTolerationSeconds(java.lang.Long tolerationSeconds);
  public java.lang.Boolean hasTolerationSeconds();
  public java.lang.String getValue();
  public A withValue(java.lang.String value);
  public java.lang.Boolean hasValue();
  
  /**
   * Method is deprecated. use withValue instead.
   */
  @java.lang.Deprecated
  public A withNewValue(java.lang.String original);
  
}