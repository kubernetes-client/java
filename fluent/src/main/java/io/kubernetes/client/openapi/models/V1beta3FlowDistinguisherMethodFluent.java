package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta3FlowDistinguisherMethodFluent<A extends V1beta3FlowDistinguisherMethodFluent<A>> extends Fluent<A>{
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  
}