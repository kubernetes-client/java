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

/** Webhook holds the configuration of the webhook */
@ApiModel(description = "Webhook holds the configuration of the webhook")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-07-29T18:17:00.375Z[Etc/UTC]")
public class V1alpha1Webhook {
  public static final String SERIALIZED_NAME_CLIENT_CONFIG = "clientConfig";

  @SerializedName(SERIALIZED_NAME_CLIENT_CONFIG)
  private V1alpha1WebhookClientConfig clientConfig;

  public static final String SERIALIZED_NAME_THROTTLE = "throttle";

  @SerializedName(SERIALIZED_NAME_THROTTLE)
  private V1alpha1WebhookThrottleConfig throttle;

  public V1alpha1Webhook clientConfig(V1alpha1WebhookClientConfig clientConfig) {

    this.clientConfig = clientConfig;
    return this;
  }

  /**
   * Get clientConfig
   *
   * @return clientConfig
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha1WebhookClientConfig getClientConfig() {
    return clientConfig;
  }

  public void setClientConfig(V1alpha1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
  }

  public V1alpha1Webhook throttle(V1alpha1WebhookThrottleConfig throttle) {

    this.throttle = throttle;
    return this;
  }

  /**
   * Get throttle
   *
   * @return throttle
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha1WebhookThrottleConfig getThrottle() {
    return throttle;
  }

  public void setThrottle(V1alpha1WebhookThrottleConfig throttle) {
    this.throttle = throttle;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1Webhook v1alpha1Webhook = (V1alpha1Webhook) o;
    return Objects.equals(this.clientConfig, v1alpha1Webhook.clientConfig)
        && Objects.equals(this.throttle, v1alpha1Webhook.throttle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientConfig, throttle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1Webhook {\n");
    sb.append("    clientConfig: ").append(toIndentedString(clientConfig)).append("\n");
    sb.append("    throttle: ").append(toIndentedString(throttle)).append("\n");
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
