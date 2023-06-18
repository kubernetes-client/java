package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha1MatchConditionFluent<A extends V1alpha1MatchConditionFluent<A>> extends Fluent<A>{
  public String getExpression();
  public A withExpression(String expression);
  public Boolean hasExpression();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  
}