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
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AuditSinkSpec holds the spec for the audit sink */
@ApiModel(description = "AuditSinkSpec holds the spec for the audit sink")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-07-29T18:17:00.375Z[Etc/UTC]")
public class V1alpha1AuditSinkSpec {
  public static final String SERIALIZED_NAME_POLICY = "policy";

  @SerializedName(SERIALIZED_NAME_POLICY)
  private V1alpha1Policy policy;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";

  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private V1alpha1Webhook webhook;

  public V1alpha1AuditSinkSpec policy(V1alpha1Policy policy) {

    this.policy = policy;
    return this;
  }

  /**
   * Get policy
   *
   * @return policy
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha1Policy getPolicy() {
    return policy;
  }

  public void setPolicy(V1alpha1Policy policy) {
    this.policy = policy;
  }

  public V1alpha1AuditSinkSpec webhook(V1alpha1Webhook webhook) {

    this.webhook = webhook;
    return this;
  }

  /**
   * Get webhook
   *
   * @return webhook
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha1Webhook getWebhook() {
    return webhook;
  }

  public void setWebhook(V1alpha1Webhook webhook) {
    this.webhook = webhook;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1AuditSinkSpec v1alpha1AuditSinkSpec = (V1alpha1AuditSinkSpec) o;
    return Objects.equals(this.policy, v1alpha1AuditSinkSpec.policy)
        && Objects.equals(this.webhook, v1alpha1AuditSinkSpec.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, webhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1AuditSinkSpec {\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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
