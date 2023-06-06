package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha1ExpressionWarningFluent<A extends V1alpha1ExpressionWarningFluent<A>> extends Fluent<A>{
  public String getFieldRef();
  public A withFieldRef(String fieldRef);
  public Boolean hasFieldRef();
  public String getWarning();
  public A withWarning(String warning);
  public Boolean hasWarning();
  
}