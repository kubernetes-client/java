package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ClaimSourceFluent<A extends V1ClaimSourceFluent<A>> extends Fluent<A>{
  public String getResourceClaimName();
  public A withResourceClaimName(String resourceClaimName);
  public Boolean hasResourceClaimName();
  public String getResourceClaimTemplateName();
  public A withResourceClaimTemplateName(String resourceClaimTemplateName);
  public Boolean hasResourceClaimTemplateName();
  
}