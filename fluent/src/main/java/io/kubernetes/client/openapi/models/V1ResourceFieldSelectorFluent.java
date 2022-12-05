package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ResourceFieldSelectorFluent<A extends V1ResourceFieldSelectorFluent<A>> extends Fluent<A>{
  public String getContainerName();
  public A withContainerName(String containerName);
  public Boolean hasContainerName();
  public Quantity getDivisor();
  public A withDivisor(Quantity divisor);
  public Boolean hasDivisor();
  public A withNewDivisor(String value);
  public String getResource();
  public A withResource(String resource);
  public Boolean hasResource();
  
}