/*
Copyright 2021 The Kubernetes Authors.
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

/** CustomResourceConversion describes how to convert different versions of a CR. */
@ApiModel(
    description = "CustomResourceConversion describes how to convert different versions of a CR.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-01-04T09:55:14.976Z[Etc/UTC]")
public class V1beta1CustomResourceConversion {
  public static final String SERIALIZED_NAME_CONVERSION_REVIEW_VERSIONS =
      "conversionReviewVersions";

  @SerializedName(SERIALIZED_NAME_CONVERSION_REVIEW_VERSIONS)
  private List<String> conversionReviewVersions = null;

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";

  @SerializedName(SERIALIZED_NAME_STRATEGY)
  private String strategy;

  public static final String SERIALIZED_NAME_WEBHOOK_CLIENT_CONFIG = "webhookClientConfig";

  @SerializedName(SERIALIZED_NAME_WEBHOOK_CLIENT_CONFIG)
  private ApiextensionsV1beta1WebhookClientConfig webhookClientConfig;

  public V1beta1CustomResourceConversion conversionReviewVersions(
      List<String> conversionReviewVersions) {

    this.conversionReviewVersions = conversionReviewVersions;
    return this;
  }

  public V1beta1CustomResourceConversion addConversionReviewVersionsItem(
      String conversionReviewVersionsItem) {
    if (this.conversionReviewVersions == null) {
      this.conversionReviewVersions = new ArrayList<>();
    }
    this.conversionReviewVersions.add(conversionReviewVersionsItem);
    return this;
  }

  /**
   * conversionReviewVersions is an ordered list of preferred &#x60;ConversionReview&#x60; versions
   * the Webhook expects. The API server will use the first version in the list which it supports.
   * If none of the versions specified in this list are supported by API server, conversion will
   * fail for the custom resource. If a persisted Webhook configuration specifies allowed versions
   * and does not include any versions known to the API Server, calls to the webhook will fail.
   * Defaults to &#x60;[\&quot;v1beta1\&quot;]&#x60;.
   *
   * @return conversionReviewVersions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to `[\"v1beta1\"]`.")
  public List<String> getConversionReviewVersions() {
    return conversionReviewVersions;
  }

  public void setConversionReviewVersions(List<String> conversionReviewVersions) {
    this.conversionReviewVersions = conversionReviewVersions;
  }

  public V1beta1CustomResourceConversion strategy(String strategy) {

    this.strategy = strategy;
    return this;
  }

  /**
   * strategy specifies how custom resources are converted between versions. Allowed values are: -
   * &#x60;None&#x60;: The converter only change the apiVersion and would not touch any other field
   * in the custom resource. - &#x60;Webhook&#x60;: API Server will call to an external webhook to
   * do the conversion. Additional information is needed for this option. This requires
   * spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.
   *
   * @return strategy
   */
  @ApiModelProperty(
      required = true,
      value =
          "strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.")
  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }

  public V1beta1CustomResourceConversion webhookClientConfig(
      ApiextensionsV1beta1WebhookClientConfig webhookClientConfig) {

    this.webhookClientConfig = webhookClientConfig;
    return this;
  }

  /**
   * Get webhookClientConfig
   *
   * @return webhookClientConfig
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public ApiextensionsV1beta1WebhookClientConfig getWebhookClientConfig() {
    return webhookClientConfig;
  }

  public void setWebhookClientConfig(ApiextensionsV1beta1WebhookClientConfig webhookClientConfig) {
    this.webhookClientConfig = webhookClientConfig;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CustomResourceConversion v1beta1CustomResourceConversion =
        (V1beta1CustomResourceConversion) o;
    return Objects.equals(
            this.conversionReviewVersions, v1beta1CustomResourceConversion.conversionReviewVersions)
        && Objects.equals(this.strategy, v1beta1CustomResourceConversion.strategy)
        && Objects.equals(
            this.webhookClientConfig, v1beta1CustomResourceConversion.webhookClientConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionReviewVersions, strategy, webhookClientConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CustomResourceConversion {\n");
    sb.append("    conversionReviewVersions: ")
        .append(toIndentedString(conversionReviewVersions))
        .append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    webhookClientConfig: ")
        .append(toIndentedString(webhookClientConfig))
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
