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

/**
 * Challenge specifies a challenge offered by the ACME server for an Order. An appropriate Challenge
 * resource can be created to perform the ACME challenge process.
 */
@ApiModel(
    description =
        "Challenge specifies a challenge offered by the ACME server for an Order. An appropriate Challenge resource can be created to perform the ACME challenge process.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1beta1OrderStatusChallenges {
  public static final String SERIALIZED_NAME_TOKEN = "token";

  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_URL = "url";

  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public V1beta1OrderStatusChallenges token(String token) {

    this.token = token;
    return this;
  }

  /**
   * Token is the token that must be presented for this challenge. This is used to compute the
   * &#39;key&#39; that must also be presented.
   *
   * @return token
   */
  @ApiModelProperty(
      required = true,
      value =
          "Token is the token that must be presented for this challenge. This is used to compute the 'key' that must also be presented.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public V1beta1OrderStatusChallenges type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Type is the type of challenge being offered, e.g. &#39;http-01&#39;, &#39;dns-01&#39;,
   * &#39;tls-sni-01&#39;, etc. This is the raw value retrieved from the ACME server. Only
   * &#39;http-01&#39; and &#39;dns-01&#39; are supported by cert-manager, other values will be
   * ignored.
   *
   * @return type
   */
  @ApiModelProperty(
      required = true,
      value =
          "Type is the type of challenge being offered, e.g. 'http-01', 'dns-01', 'tls-sni-01', etc. This is the raw value retrieved from the ACME server. Only 'http-01' and 'dns-01' are supported by cert-manager, other values will be ignored.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public V1beta1OrderStatusChallenges url(String url) {

    this.url = url;
    return this;
  }

  /**
   * URL is the URL of this challenge. It can be used to retrieve additional metadata about the
   * Challenge from the ACME server.
   *
   * @return url
   */
  @ApiModelProperty(
      required = true,
      value =
          "URL is the URL of this challenge. It can be used to retrieve additional metadata about the Challenge from the ACME server.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1OrderStatusChallenges v1beta1OrderStatusChallenges = (V1beta1OrderStatusChallenges) o;
    return Objects.equals(this.token, v1beta1OrderStatusChallenges.token)
        && Objects.equals(this.type, v1beta1OrderStatusChallenges.type)
        && Objects.equals(this.url, v1beta1OrderStatusChallenges.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1OrderStatusChallenges {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
