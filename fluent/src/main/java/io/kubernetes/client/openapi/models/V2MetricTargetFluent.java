package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2MetricTargetFluent<A extends V2MetricTargetFluent<A>> extends Fluent<A>{
  public Integer getAverageUtilization();
  public A withAverageUtilization(Integer averageUtilization);
  public Boolean hasAverageUtilization();
  public Quantity getAverageValue();
  public A withAverageValue(Quantity averageValue);
  public Boolean hasAverageValue();
  public A withNewAverageValue(String value);
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  public Quantity getValue();
  public A withValue(Quantity value);
  public Boolean hasValue();
  public A withNewValue(String value);
  
}