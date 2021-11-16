package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1WindowsSecurityContextOptionsFluent<A extends io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getGmsaCredentialSpec();
  public A withGmsaCredentialSpec(java.lang.String gmsaCredentialSpec);
  public java.lang.Boolean hasGmsaCredentialSpec();
  
  /**
   * Method is deprecated. use withGmsaCredentialSpec instead.
   */
  @java.lang.Deprecated
  public A withNewGmsaCredentialSpec(java.lang.String arg0);
  public java.lang.String getGmsaCredentialSpecName();
  public A withGmsaCredentialSpecName(java.lang.String gmsaCredentialSpecName);
  public java.lang.Boolean hasGmsaCredentialSpecName();
  
  /**
   * Method is deprecated. use withGmsaCredentialSpecName instead.
   */
  @java.lang.Deprecated
  public A withNewGmsaCredentialSpecName(java.lang.String arg0);
  public java.lang.Boolean getHostProcess();
  public A withHostProcess(java.lang.Boolean hostProcess);
  public java.lang.Boolean hasHostProcess();
  public java.lang.String getRunAsUserName();
  public A withRunAsUserName(java.lang.String runAsUserName);
  public java.lang.Boolean hasRunAsUserName();
  
  /**
   * Method is deprecated. use withRunAsUserName instead.
   */
  @java.lang.Deprecated
  public A withNewRunAsUserName(java.lang.String arg0);
  
}