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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * Configures cert-manager to attempt to complete authorizations by performing the DNS01 challenge
 * flow.
 */
@ApiModel(
    description =
        "Configures cert-manager to attempt to complete authorizations by performing the DNS01 challenge flow.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeDns01 {
  public static final String SERIALIZED_NAME_ACMEDNS = "acmedns";

  @SerializedName(SERIALIZED_NAME_ACMEDNS)
  private V1alpha2IssuerSpecAcmeDns01Acmedns acmedns;

  public static final String SERIALIZED_NAME_AKAMAI = "akamai";

  @SerializedName(SERIALIZED_NAME_AKAMAI)
  private V1alpha2IssuerSpecAcmeDns01Akamai akamai;

  public static final String SERIALIZED_NAME_AZUREDNS = "azuredns";

  @SerializedName(SERIALIZED_NAME_AZUREDNS)
  private V1alpha2IssuerSpecAcmeDns01Azuredns azuredns;

  public static final String SERIALIZED_NAME_CLOUDDNS = "clouddns";

  @SerializedName(SERIALIZED_NAME_CLOUDDNS)
  private V1alpha2IssuerSpecAcmeDns01Clouddns clouddns;

  public static final String SERIALIZED_NAME_CLOUDFLARE = "cloudflare";

  @SerializedName(SERIALIZED_NAME_CLOUDFLARE)
  private V1alpha2IssuerSpecAcmeDns01Cloudflare cloudflare;

  /**
   * CNAMEStrategy configures how the DNS01 provider should handle CNAME records when found in DNS
   * zones.
   */
  @JsonAdapter(CnameStrategyEnum.Adapter.class)
  public enum CnameStrategyEnum {
    NONE("None"),

    FOLLOW("Follow");

    private String value;

    CnameStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CnameStrategyEnum fromValue(String value) {
      for (CnameStrategyEnum b : CnameStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CnameStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CnameStrategyEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CnameStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CnameStrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CNAME_STRATEGY = "cnameStrategy";

  @SerializedName(SERIALIZED_NAME_CNAME_STRATEGY)
  private CnameStrategyEnum cnameStrategy;

  public static final String SERIALIZED_NAME_DIGITALOCEAN = "digitalocean";

  @SerializedName(SERIALIZED_NAME_DIGITALOCEAN)
  private V1alpha2IssuerSpecAcmeDns01Digitalocean digitalocean;

  public static final String SERIALIZED_NAME_RFC2136 = "rfc2136";

  @SerializedName(SERIALIZED_NAME_RFC2136)
  private V1alpha2IssuerSpecAcmeDns01Rfc2136 rfc2136;

  public static final String SERIALIZED_NAME_ROUTE53 = "route53";

  @SerializedName(SERIALIZED_NAME_ROUTE53)
  private V1alpha2IssuerSpecAcmeDns01Route53 route53;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";

  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private V1alpha2IssuerSpecAcmeDns01Webhook webhook;

  public V1alpha2IssuerSpecAcmeDns01 acmedns(V1alpha2IssuerSpecAcmeDns01Acmedns acmedns) {

    this.acmedns = acmedns;
    return this;
  }

  /**
   * Get acmedns
   *
   * @return acmedns
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeDns01Acmedns getAcmedns() {
    return acmedns;
  }

  public void setAcmedns(V1alpha2IssuerSpecAcmeDns01Acmedns acmedns) {
    this.acmedns = acmedns;
  }

  public V1alpha2IssuerSpecAcmeDns01 akamai(V1alpha2IssuerSpecAcmeDns01Akamai akamai) {

    this.akamai = akamai;
    return this;
  }

  /**
   * Get akamai
   *
   * @return akamai
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeDns01Akamai getAkamai() {
    return akamai;
  }

  public void setAkamai(V1alpha2IssuerSpecAcmeDns01Akamai akamai) {
    this.akamai = akamai;
  }

  public V1alpha2IssuerSpecAcmeDns01 azuredns(V1alpha2IssuerSpecAcmeDns01Azuredns azuredns) {

    this.azuredns = azuredns;
    return this;
  }

  /**
   * Get azuredns
   *
   * @return azuredns
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeDns01Azuredns getAzuredns() {
    return azuredns;
  }

  public void setAzuredns(V1alpha2IssuerSpecAcmeDns01Azuredns azuredns) {
    this.azuredns = azuredns;
  }

  public V1alpha2IssuerSpecAcmeDns01 clouddns(V1alpha2IssuerSpecAcmeDns01Clouddns clouddns) {

    this.clouddns = clouddns;
    return this;
  }

  /**
   * Get clouddns
   *
   * @return clouddns
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeDns01Clouddns getClouddns() {
    return clouddns;
  }

  public void setClouddns(V1alpha2IssuerSpecAcmeDns01Clouddns clouddns) {
    this.clouddns = clouddns;
  }

  public V1alpha2IssuerSpecAcmeDns01 cloudflare(V1alpha2IssuerSpecAcmeDns01Cloudflare cloudflare) {

    this.cloudflare = cloudflare;
    return this;
  }

  /**
   * Get cloudflare
   *
   * @return cloudflare
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeDns01Cloudflare getCloudflare() {
    return cloudflare;
  }

  public void setCloudflare(V1alpha2IssuerSpecAcmeDns01Cloudflare cloudflare) {
    this.cloudflare = cloudflare;
  }

  public V1alpha2IssuerSpecAcmeDns01 cnameStrategy(CnameStrategyEnum cnameStrategy) {

    this.cnameStrategy = cnameStrategy;
    return this;
  }

  /**
   * CNAMEStrategy configures how the DNS01 provider should handle CNAME records when found in DNS
   * zones.
   *
   * @return cnameStrategy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "CNAMEStrategy configures how the DNS01 provider should handle CNAME records when found in DNS zones.")
  public CnameStrategyEnum getCnameStrategy() {
    return cnameStrategy;
  }

  public void setCnameStrategy(CnameStrategyEnum cnameStrategy) {
    this.cnameStrategy = cnameStrategy;
  }

  public V1alpha2IssuerSpecAcmeDns01 digitalocean(
      V1alpha2IssuerSpecAcmeDns01Digitalocean digitalocean) {

    this.digitalocean = digitalocean;
    return this;
  }

  /**
   * Get digitalocean
   *
   * @return digitalocean
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeDns01Digitalocean getDigitalocean() {
    return digitalocean;
  }

  public void setDigitalocean(V1alpha2IssuerSpecAcmeDns01Digitalocean digitalocean) {
    this.digitalocean = digitalocean;
  }

  public V1alpha2IssuerSpecAcmeDns01 rfc2136(V1alpha2IssuerSpecAcmeDns01Rfc2136 rfc2136) {

    this.rfc2136 = rfc2136;
    return this;
  }

  /**
   * Get rfc2136
   *
   * @return rfc2136
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeDns01Rfc2136 getRfc2136() {
    return rfc2136;
  }

  public void setRfc2136(V1alpha2IssuerSpecAcmeDns01Rfc2136 rfc2136) {
    this.rfc2136 = rfc2136;
  }

  public V1alpha2IssuerSpecAcmeDns01 route53(V1alpha2IssuerSpecAcmeDns01Route53 route53) {

    this.route53 = route53;
    return this;
  }

  /**
   * Get route53
   *
   * @return route53
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeDns01Route53 getRoute53() {
    return route53;
  }

  public void setRoute53(V1alpha2IssuerSpecAcmeDns01Route53 route53) {
    this.route53 = route53;
  }

  public V1alpha2IssuerSpecAcmeDns01 webhook(V1alpha2IssuerSpecAcmeDns01Webhook webhook) {

    this.webhook = webhook;
    return this;
  }

  /**
   * Get webhook
   *
   * @return webhook
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeDns01Webhook getWebhook() {
    return webhook;
  }

  public void setWebhook(V1alpha2IssuerSpecAcmeDns01Webhook webhook) {
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
    V1alpha2IssuerSpecAcmeDns01 v1alpha2IssuerSpecAcmeDns01 = (V1alpha2IssuerSpecAcmeDns01) o;
    return Objects.equals(this.acmedns, v1alpha2IssuerSpecAcmeDns01.acmedns)
        && Objects.equals(this.akamai, v1alpha2IssuerSpecAcmeDns01.akamai)
        && Objects.equals(this.azuredns, v1alpha2IssuerSpecAcmeDns01.azuredns)
        && Objects.equals(this.clouddns, v1alpha2IssuerSpecAcmeDns01.clouddns)
        && Objects.equals(this.cloudflare, v1alpha2IssuerSpecAcmeDns01.cloudflare)
        && Objects.equals(this.cnameStrategy, v1alpha2IssuerSpecAcmeDns01.cnameStrategy)
        && Objects.equals(this.digitalocean, v1alpha2IssuerSpecAcmeDns01.digitalocean)
        && Objects.equals(this.rfc2136, v1alpha2IssuerSpecAcmeDns01.rfc2136)
        && Objects.equals(this.route53, v1alpha2IssuerSpecAcmeDns01.route53)
        && Objects.equals(this.webhook, v1alpha2IssuerSpecAcmeDns01.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        acmedns,
        akamai,
        azuredns,
        clouddns,
        cloudflare,
        cnameStrategy,
        digitalocean,
        rfc2136,
        route53,
        webhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeDns01 {\n");
    sb.append("    acmedns: ").append(toIndentedString(acmedns)).append("\n");
    sb.append("    akamai: ").append(toIndentedString(akamai)).append("\n");
    sb.append("    azuredns: ").append(toIndentedString(azuredns)).append("\n");
    sb.append("    clouddns: ").append(toIndentedString(clouddns)).append("\n");
    sb.append("    cloudflare: ").append(toIndentedString(cloudflare)).append("\n");
    sb.append("    cnameStrategy: ").append(toIndentedString(cnameStrategy)).append("\n");
    sb.append("    digitalocean: ").append(toIndentedString(digitalocean)).append("\n");
    sb.append("    rfc2136: ").append(toIndentedString(rfc2136)).append("\n");
    sb.append("    route53: ").append(toIndentedString(route53)).append("\n");
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
