package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1WindowsSecurityContextOptionsFluentImpl<A extends V1WindowsSecurityContextOptionsFluent<A>> extends BaseFluent<A> implements V1WindowsSecurityContextOptionsFluent<A>{
  public V1WindowsSecurityContextOptionsFluentImpl() {
  }
  public V1WindowsSecurityContextOptionsFluentImpl(V1WindowsSecurityContextOptions instance) {
    this.withGmsaCredentialSpec(instance.getGmsaCredentialSpec());

    this.withGmsaCredentialSpecName(instance.getGmsaCredentialSpecName());

    this.withHostProcess(instance.getHostProcess());

    this.withRunAsUserName(instance.getRunAsUserName());

  }
  private String gmsaCredentialSpec;
  private String gmsaCredentialSpecName;
  private Boolean hostProcess;
  private String runAsUserName;
  public String getGmsaCredentialSpec() {
    return this.gmsaCredentialSpec;
  }
  public A withGmsaCredentialSpec(String gmsaCredentialSpec) {
    this.gmsaCredentialSpec=gmsaCredentialSpec; return (A) this;
  }
  public Boolean hasGmsaCredentialSpec() {
    return this.gmsaCredentialSpec != null;
  }
  public String getGmsaCredentialSpecName() {
    return this.gmsaCredentialSpecName;
  }
  public A withGmsaCredentialSpecName(String gmsaCredentialSpecName) {
    this.gmsaCredentialSpecName=gmsaCredentialSpecName; return (A) this;
  }
  public Boolean hasGmsaCredentialSpecName() {
    return this.gmsaCredentialSpecName != null;
  }
  public Boolean getHostProcess() {
    return this.hostProcess;
  }
  public A withHostProcess(Boolean hostProcess) {
    this.hostProcess=hostProcess; return (A) this;
  }
  public Boolean hasHostProcess() {
    return this.hostProcess != null;
  }
  public String getRunAsUserName() {
    return this.runAsUserName;
  }
  public A withRunAsUserName(String runAsUserName) {
    this.runAsUserName=runAsUserName; return (A) this;
  }
  public Boolean hasRunAsUserName() {
    return this.runAsUserName != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1WindowsSecurityContextOptionsFluentImpl that = (V1WindowsSecurityContextOptionsFluentImpl) o;
    if (gmsaCredentialSpec != null ? !gmsaCredentialSpec.equals(that.gmsaCredentialSpec) :that.gmsaCredentialSpec != null) return false;
    if (gmsaCredentialSpecName != null ? !gmsaCredentialSpecName.equals(that.gmsaCredentialSpecName) :that.gmsaCredentialSpecName != null) return false;
    if (hostProcess != null ? !hostProcess.equals(that.hostProcess) :that.hostProcess != null) return false;
    if (runAsUserName != null ? !runAsUserName.equals(that.runAsUserName) :that.runAsUserName != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(gmsaCredentialSpec,  gmsaCredentialSpecName,  hostProcess,  runAsUserName,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (gmsaCredentialSpec != null) { sb.append("gmsaCredentialSpec:"); sb.append(gmsaCredentialSpec + ","); }
    if (gmsaCredentialSpecName != null) { sb.append("gmsaCredentialSpecName:"); sb.append(gmsaCredentialSpecName + ","); }
    if (hostProcess != null) { sb.append("hostProcess:"); sb.append(hostProcess + ","); }
    if (runAsUserName != null) { sb.append("runAsUserName:"); sb.append(runAsUserName); }
    sb.append("}");
    return sb.toString();
  }
  public A withHostProcess() {
    return withHostProcess(true);
  }
  
}