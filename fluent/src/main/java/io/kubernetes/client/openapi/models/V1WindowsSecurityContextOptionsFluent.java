package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1WindowsSecurityContextOptionsFluent<A extends V1WindowsSecurityContextOptionsFluent<A>> extends Fluent<A>{
  public String getGmsaCredentialSpec();
  public A withGmsaCredentialSpec(String gmsaCredentialSpec);
  public Boolean hasGmsaCredentialSpec();
  public String getGmsaCredentialSpecName();
  public A withGmsaCredentialSpecName(String gmsaCredentialSpecName);
  public Boolean hasGmsaCredentialSpecName();
  public Boolean getHostProcess();
  public A withHostProcess(Boolean hostProcess);
  public Boolean hasHostProcess();
  public String getRunAsUserName();
  public A withRunAsUserName(String runAsUserName);
  public Boolean hasRunAsUserName();
  public A withHostProcess();
  
}