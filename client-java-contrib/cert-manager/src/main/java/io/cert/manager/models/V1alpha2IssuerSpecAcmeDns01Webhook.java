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
package io.cert.manager.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Configure an external webhook based DNS01 challenge solver to manage DNS01 challenge records. */
@ApiModel(
    description =
        "Configure an external webhook based DNS01 challenge solver to manage DNS01 challenge records.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeDns01Webhook {
  public static final String SERIALIZED_NAME_CONFIG = "config";

  @SerializedName(SERIALIZED_NAME_CONFIG)
  private Object config;

  public static final String SERIALIZED_NAME_GROUP_NAME = "groupName";

  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_SOLVER_NAME = "solverName";

  @SerializedName(SERIALIZED_NAME_SOLVER_NAME)
  private String solverName;

  public V1alpha2IssuerSpecAcmeDns01Webhook config(Object config) {

    this.config = config;
    return this;
  }

  /**
   * Additional configuration that should be passed to the webhook apiserver when challenges are
   * processed. This can contain arbitrary JSON data. Secret values should not be specified in this
   * stanza. If secret values are needed (e.g. credentials for a DNS service), you should use a
   * SecretKeySelector to reference a Secret resource. For details on the schema of this field,
   * consult the webhook provider implementation&#39;s documentation.
   *
   * @return config
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Additional configuration that should be passed to the webhook apiserver when challenges are processed. This can contain arbitrary JSON data. Secret values should not be specified in this stanza. If secret values are needed (e.g. credentials for a DNS service), you should use a SecretKeySelector to reference a Secret resource. For details on the schema of this field, consult the webhook provider implementation's documentation.")
  public Object getConfig() {
    return config;
  }

  public void setConfig(Object config) {
    this.config = config;
  }

  public V1alpha2IssuerSpecAcmeDns01Webhook groupName(String groupName) {

    this.groupName = groupName;
    return this;
  }

  /**
   * The API group name that should be used when POSTing ChallengePayload resources to the webhook
   * apiserver. This should be the same as the GroupName specified in the webhook provider
   * implementation.
   *
   * @return groupName
   */
  @ApiModelProperty(
      required = true,
      value =
          "The API group name that should be used when POSTing ChallengePayload resources to the webhook apiserver. This should be the same as the GroupName specified in the webhook provider implementation.")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public V1alpha2IssuerSpecAcmeDns01Webhook solverName(String solverName) {

    this.solverName = solverName;
    return this;
  }

  /**
   * The name of the solver to use, as defined in the webhook provider implementation. This will
   * typically be the name of the provider, e.g. &#39;cloudflare&#39;.
   *
   * @return solverName
   */
  @ApiModelProperty(
      required = true,
      value =
          "The name of the solver to use, as defined in the webhook provider implementation. This will typically be the name of the provider, e.g. 'cloudflare'.")
  public String getSolverName() {
    return solverName;
  }

  public void setSolverName(String solverName) {
    this.solverName = solverName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeDns01Webhook v1alpha2IssuerSpecAcmeDns01Webhook =
        (V1alpha2IssuerSpecAcmeDns01Webhook) o;
    return Objects.equals(this.config, v1alpha2IssuerSpecAcmeDns01Webhook.config)
        && Objects.equals(this.groupName, v1alpha2IssuerSpecAcmeDns01Webhook.groupName)
        && Objects.equals(this.solverName, v1alpha2IssuerSpecAcmeDns01Webhook.solverName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, groupName, solverName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeDns01Webhook {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    solverName: ").append(toIndentedString(solverName)).append("\n");
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
