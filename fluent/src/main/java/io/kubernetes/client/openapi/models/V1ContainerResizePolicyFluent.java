package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ContainerResizePolicyFluent<A extends V1ContainerResizePolicyFluent<A>> extends Fluent<A>{
  public String getResourceName();
  public A withResourceName(String resourceName);
  public Boolean hasResourceName();
  public String getRestartPolicy();
  public A withRestartPolicy(String restartPolicy);
  public Boolean hasRestartPolicy();
  
}