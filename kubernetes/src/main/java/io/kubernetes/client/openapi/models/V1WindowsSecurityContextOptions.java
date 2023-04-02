/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** WindowsSecurityContextOptions contain Windows-specific options and credentials. */
@ApiModel(
    description = "WindowsSecurityContextOptions contain Windows-specific options and credentials.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1WindowsSecurityContextOptions {
  public static final String SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC = "gmsaCredentialSpec";

  @SerializedName(SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC)
  private String gmsaCredentialSpec;

  public static final String SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC_NAME = "gmsaCredentialSpecName";

  @SerializedName(SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC_NAME)
  private String gmsaCredentialSpecName;

  public static final String SERIALIZED_NAME_HOST_PROCESS = "hostProcess";

  @SerializedName(SERIALIZED_NAME_HOST_PROCESS)
  private Boolean hostProcess;

  public static final String SERIALIZED_NAME_RUN_AS_USER_NAME = "runAsUserName";

  @SerializedName(SERIALIZED_NAME_RUN_AS_USER_NAME)
  private String runAsUserName;

  public V1WindowsSecurityContextOptions gmsaCredentialSpec(String gmsaCredentialSpec) {

    this.gmsaCredentialSpec = gmsaCredentialSpec;
    return this;
  }

  /**
   * GMSACredentialSpec is where the GMSA admission webhook
   * (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential
   * spec named by the GMSACredentialSpecName field.
   *
   * @return gmsaCredentialSpec
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.")
  public String getGmsaCredentialSpec() {
    return gmsaCredentialSpec;
  }

  public void setGmsaCredentialSpec(String gmsaCredentialSpec) {
    this.gmsaCredentialSpec = gmsaCredentialSpec;
  }

  public V1WindowsSecurityContextOptions gmsaCredentialSpecName(String gmsaCredentialSpecName) {

    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    return this;
  }

  /**
   * GMSACredentialSpecName is the name of the GMSA credential spec to use.
   *
   * @return gmsaCredentialSpecName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "GMSACredentialSpecName is the name of the GMSA credential spec to use.")
  public String getGmsaCredentialSpecName() {
    return gmsaCredentialSpecName;
  }

  public void setGmsaCredentialSpecName(String gmsaCredentialSpecName) {
    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
  }

  public V1WindowsSecurityContextOptions hostProcess(Boolean hostProcess) {

    this.hostProcess = hostProcess;
    return this;
  }

  /**
   * HostProcess determines if a container should be run as a &#39;Host Process&#39; container. This
   * field is alpha-level and will only be honored by components that enable the
   * WindowsHostProcessContainers feature flag. Setting this field without the feature flag will
   * result in errors when validating the Pod. All of a Pod&#39;s containers must have the same
   * effective HostProcess value (it is not allowed to have a mix of HostProcess containers and
   * non-HostProcess containers). In addition, if HostProcess is true then HostNetwork must also be
   * set to true.
   *
   * @return hostProcess
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "HostProcess determines if a container should be run as a 'Host Process' container. This field is alpha-level and will only be honored by components that enable the WindowsHostProcessContainers feature flag. Setting this field without the feature flag will result in errors when validating the Pod. All of a Pod's containers must have the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers).  In addition, if HostProcess is true then HostNetwork must also be set to true.")
  public Boolean getHostProcess() {
    return hostProcess;
  }

  public void setHostProcess(Boolean hostProcess) {
    this.hostProcess = hostProcess;
  }

  public V1WindowsSecurityContextOptions runAsUserName(String runAsUserName) {

    this.runAsUserName = runAsUserName;
    return this;
  }

  /**
   * The UserName in Windows to run the entrypoint of the container process. Defaults to the user
   * specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in
   * both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes
   * precedence.
   *
   * @return runAsUserName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  public String getRunAsUserName() {
    return runAsUserName;
  }

  public void setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WindowsSecurityContextOptions v1WindowsSecurityContextOptions =
        (V1WindowsSecurityContextOptions) o;
    return Objects.equals(
            this.gmsaCredentialSpec, v1WindowsSecurityContextOptions.gmsaCredentialSpec)
        && Objects.equals(
            this.gmsaCredentialSpecName, v1WindowsSecurityContextOptions.gmsaCredentialSpecName)
        && Objects.equals(this.hostProcess, v1WindowsSecurityContextOptions.hostProcess)
        && Objects.equals(this.runAsUserName, v1WindowsSecurityContextOptions.runAsUserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gmsaCredentialSpec, gmsaCredentialSpecName, hostProcess, runAsUserName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WindowsSecurityContextOptions {\n");
    sb.append("    gmsaCredentialSpec: ").append(toIndentedString(gmsaCredentialSpec)).append("\n");
    sb.append("    gmsaCredentialSpecName: ")
        .append(toIndentedString(gmsaCredentialSpecName))
        .append("\n");
    sb.append("    hostProcess: ").append(toIndentedString(hostProcess)).append("\n");
    sb.append("    runAsUserName: ").append(toIndentedString(runAsUserName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
