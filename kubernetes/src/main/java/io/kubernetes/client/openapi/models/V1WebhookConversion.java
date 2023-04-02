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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** WebhookConversion describes how to call a conversion webhook */
@ApiModel(description = "WebhookConversion describes how to call a conversion webhook")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1WebhookConversion {
  public static final String SERIALIZED_NAME_CLIENT_CONFIG = "clientConfig";

  @SerializedName(SERIALIZED_NAME_CLIENT_CONFIG)
  private ApiextensionsV1WebhookClientConfig clientConfig;

  public static final String SERIALIZED_NAME_CONVERSION_REVIEW_VERSIONS =
      "conversionReviewVersions";

  @SerializedName(SERIALIZED_NAME_CONVERSION_REVIEW_VERSIONS)
  private List<String> conversionReviewVersions = new ArrayList<>();

  public V1WebhookConversion clientConfig(ApiextensionsV1WebhookClientConfig clientConfig) {

    this.clientConfig = clientConfig;
    return this;
  }

  /**
   * Get clientConfig
   *
   * @return clientConfig
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public ApiextensionsV1WebhookClientConfig getClientConfig() {
    return clientConfig;
  }

  public void setClientConfig(ApiextensionsV1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
  }

  public V1WebhookConversion conversionReviewVersions(List<String> conversionReviewVersions) {

    this.conversionReviewVersions = conversionReviewVersions;
    return this;
  }

  public V1WebhookConversion addConversionReviewVersionsItem(String conversionReviewVersionsItem) {
    this.conversionReviewVersions.add(conversionReviewVersionsItem);
    return this;
  }

  /**
   * conversionReviewVersions is an ordered list of preferred &#x60;ConversionReview&#x60; versions
   * the Webhook expects. The API server will use the first version in the list which it supports.
   * If none of the versions specified in this list are supported by API server, conversion will
   * fail for the custom resource. If a persisted Webhook configuration specifies allowed versions
   * and does not include any versions known to the API Server, calls to the webhook will fail.
   *
   * @return conversionReviewVersions
   */
  @ApiModelProperty(
      required = true,
      value =
          "conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail.")
  public List<String> getConversionReviewVersions() {
    return conversionReviewVersions;
  }

  public void setConversionReviewVersions(List<String> conversionReviewVersions) {
    this.conversionReviewVersions = conversionReviewVersions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WebhookConversion v1WebhookConversion = (V1WebhookConversion) o;
    return Objects.equals(this.clientConfig, v1WebhookConversion.clientConfig)
        && Objects.equals(
            this.conversionReviewVersions, v1WebhookConversion.conversionReviewVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientConfig, conversionReviewVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WebhookConversion {\n");
    sb.append("    clientConfig: ").append(toIndentedString(clientConfig)).append("\n");
    sb.append("    conversionReviewVersions: ")
        .append(toIndentedString(conversionReviewVersions))
        .append("\n");
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
