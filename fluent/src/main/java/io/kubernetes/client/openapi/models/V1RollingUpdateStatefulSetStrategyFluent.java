package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1RollingUpdateStatefulSetStrategyFluent<A extends V1RollingUpdateStatefulSetStrategyFluent<A>> extends Fluent<A>{
  public IntOrString getMaxUnavailable();
  public A withMaxUnavailable(IntOrString maxUnavailable);
  public Boolean hasMaxUnavailable();
  public A withNewMaxUnavailable(int value);
  public A withNewMaxUnavailable(String value);
  public Integer getPartition();
  public A withPartition(Integer partition);
  public Boolean hasPartition();
  
}