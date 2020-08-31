/*
Copyright 2020 The Kubernetes Authors.
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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * The Windows specific settings applied to all containers. If unspecified, the options from the
 * PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value
 * specified in SecurityContext takes precedence.
 */
@ApiModel(
    description =
        "The Windows specific settings applied to all containers. If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecSecurityContextWindowsOptions {
  public static final String SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC = "gmsaCredentialSpec";

  @SerializedName(SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC)
  private String gmsaCredentialSpec;

  public static final String SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC_NAME = "gmsaCredentialSpecName";

  @SerializedName(SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC_NAME)
  private String gmsaCredentialSpecName;

  public static final String SERIALIZED_NAME_RUN_AS_USER_NAME = "runAsUserName";

  @SerializedName(SERIALIZED_NAME_RUN_AS_USER_NAME)
  private String runAsUserName;

  public V1ThanosRulerSpecSecurityContextWindowsOptions gmsaCredentialSpec(
      String gmsaCredentialSpec) {

    this.gmsaCredentialSpec = gmsaCredentialSpec;
    return this;
  }

  /**
   * GMSACredentialSpec is where the GMSA admission webhook
   * (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential
   * spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored
   * by servers that enable the WindowsGMSA feature flag.
   *
   * @return gmsaCredentialSpec
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.")
  public String getGmsaCredentialSpec() {
    return gmsaCredentialSpec;
  }

  public void setGmsaCredentialSpec(String gmsaCredentialSpec) {
    this.gmsaCredentialSpec = gmsaCredentialSpec;
  }

  public V1ThanosRulerSpecSecurityContextWindowsOptions gmsaCredentialSpecName(
      String gmsaCredentialSpecName) {

    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    return this;
  }

  /**
   * GMSACredentialSpecName is the name of the GMSA credential spec to use. This field is
   * alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
   *
   * @return gmsaCredentialSpecName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "GMSACredentialSpecName is the name of the GMSA credential spec to use. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.")
  public String getGmsaCredentialSpecName() {
    return gmsaCredentialSpecName;
  }

  public void setGmsaCredentialSpecName(String gmsaCredentialSpecName) {
    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
  }

  public V1ThanosRulerSpecSecurityContextWindowsOptions runAsUserName(String runAsUserName) {

    this.runAsUserName = runAsUserName;
    return this;
  }

  /**
   * The UserName in Windows to run the entrypoint of the container process. Defaults to the user
   * specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in
   * both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes
   * precedence. This field is beta-level and may be disabled with the WindowsRunAsUserName feature
   * flag.
   *
   * @return runAsUserName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is beta-level and may be disabled with the WindowsRunAsUserName feature flag.")
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
    V1ThanosRulerSpecSecurityContextWindowsOptions v1ThanosRulerSpecSecurityContextWindowsOptions =
        (V1ThanosRulerSpecSecurityContextWindowsOptions) o;
    return Objects.equals(
            this.gmsaCredentialSpec,
            v1ThanosRulerSpecSecurityContextWindowsOptions.gmsaCredentialSpec)
        && Objects.equals(
            this.gmsaCredentialSpecName,
            v1ThanosRulerSpecSecurityContextWindowsOptions.gmsaCredentialSpecName)
        && Objects.equals(
            this.runAsUserName, v1ThanosRulerSpecSecurityContextWindowsOptions.runAsUserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gmsaCredentialSpec, gmsaCredentialSpecName, runAsUserName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecSecurityContextWindowsOptions {\n");
    sb.append("    gmsaCredentialSpec: ").append(toIndentedString(gmsaCredentialSpec)).append("\n");
    sb.append("    gmsaCredentialSpecName: ")
        .append(toIndentedString(gmsaCredentialSpecName))
        .append("\n");
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
