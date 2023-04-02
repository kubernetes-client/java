package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CustomResourceSubresourceScaleFluent<A extends V1CustomResourceSubresourceScaleFluent<A>> extends Fluent<A>{
  public String getLabelSelectorPath();
  public A withLabelSelectorPath(String labelSelectorPath);
  public Boolean hasLabelSelectorPath();
  public String getSpecReplicasPath();
  public A withSpecReplicasPath(String specReplicasPath);
  public Boolean hasSpecReplicasPath();
  public String getStatusReplicasPath();
  public A withStatusReplicasPath(String statusReplicasPath);
  public Boolean hasStatusReplicasPath();
  
}