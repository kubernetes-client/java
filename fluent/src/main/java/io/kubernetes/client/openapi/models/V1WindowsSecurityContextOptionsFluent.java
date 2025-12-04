package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1WindowsSecurityContextOptionsFluent<A extends io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsFluent<A>> extends BaseFluent<A>{

  private String gmsaCredentialSpec;
  private String gmsaCredentialSpecName;
  private Boolean hostProcess;
  private String runAsUserName;

  public V1WindowsSecurityContextOptionsFluent() {
  }
  
  public V1WindowsSecurityContextOptionsFluent(V1WindowsSecurityContextOptions instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1WindowsSecurityContextOptions instance) {
    instance = instance != null ? instance : new V1WindowsSecurityContextOptions();
    if (instance != null) {
        this.withGmsaCredentialSpec(instance.getGmsaCredentialSpec());
        this.withGmsaCredentialSpecName(instance.getGmsaCredentialSpecName());
        this.withHostProcess(instance.getHostProcess());
        this.withRunAsUserName(instance.getRunAsUserName());
    }
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1WindowsSecurityContextOptionsFluent that = (V1WindowsSecurityContextOptionsFluent) o;
    if (!(Objects.equals(gmsaCredentialSpec, that.gmsaCredentialSpec))) {
      return false;
    }
    if (!(Objects.equals(gmsaCredentialSpecName, that.gmsaCredentialSpecName))) {
      return false;
    }
    if (!(Objects.equals(hostProcess, that.hostProcess))) {
      return false;
    }
    if (!(Objects.equals(runAsUserName, that.runAsUserName))) {
      return false;
    }
    return true;
  }
  
  public String getGmsaCredentialSpec() {
    return this.gmsaCredentialSpec;
  }
  
  public String getGmsaCredentialSpecName() {
    return this.gmsaCredentialSpecName;
  }
  
  public Boolean getHostProcess() {
    return this.hostProcess;
  }
  
  public String getRunAsUserName() {
    return this.runAsUserName;
  }
  
  public boolean hasGmsaCredentialSpec() {
    return this.gmsaCredentialSpec != null;
  }
  
  public boolean hasGmsaCredentialSpecName() {
    return this.gmsaCredentialSpecName != null;
  }
  
  public boolean hasHostProcess() {
    return this.hostProcess != null;
  }
  
  public boolean hasRunAsUserName() {
    return this.runAsUserName != null;
  }
  
  public int hashCode() {
    return Objects.hash(gmsaCredentialSpec, gmsaCredentialSpecName, hostProcess, runAsUserName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(gmsaCredentialSpec == null)) {
        sb.append("gmsaCredentialSpec:");
        sb.append(gmsaCredentialSpec);
        sb.append(",");
    }
    if (!(gmsaCredentialSpecName == null)) {
        sb.append("gmsaCredentialSpecName:");
        sb.append(gmsaCredentialSpecName);
        sb.append(",");
    }
    if (!(hostProcess == null)) {
        sb.append("hostProcess:");
        sb.append(hostProcess);
        sb.append(",");
    }
    if (!(runAsUserName == null)) {
        sb.append("runAsUserName:");
        sb.append(runAsUserName);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withGmsaCredentialSpec(String gmsaCredentialSpec) {
    this.gmsaCredentialSpec = gmsaCredentialSpec;
    return (A) this;
  }
  
  public A withGmsaCredentialSpecName(String gmsaCredentialSpecName) {
    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    return (A) this;
  }
  
  public A withHostProcess() {
    return withHostProcess(true);
  }
  
  public A withHostProcess(Boolean hostProcess) {
    this.hostProcess = hostProcess;
    return (A) this;
  }
  
  public A withRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return (A) this;
  }
  
}