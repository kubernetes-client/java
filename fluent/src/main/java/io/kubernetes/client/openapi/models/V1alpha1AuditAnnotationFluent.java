package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha1AuditAnnotationFluent<A extends V1alpha1AuditAnnotationFluent<A>> extends Fluent<A>{
  public String getKey();
  public A withKey(String key);
  public Boolean hasKey();
  public String getValueExpression();
  public A withValueExpression(String valueExpression);
  public Boolean hasValueExpression();
  
}