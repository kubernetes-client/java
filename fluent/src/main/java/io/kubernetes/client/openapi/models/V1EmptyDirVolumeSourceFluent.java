package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1EmptyDirVolumeSourceFluent<A extends V1EmptyDirVolumeSourceFluent<A>> extends Fluent<A>{
  public String getMedium();
  public A withMedium(String medium);
  public Boolean hasMedium();
  public Quantity getSizeLimit();
  public A withSizeLimit(Quantity sizeLimit);
  public Boolean hasSizeLimit();
  public A withNewSizeLimit(String value);
  
}