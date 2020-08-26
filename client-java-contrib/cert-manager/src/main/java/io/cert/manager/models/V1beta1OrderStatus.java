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
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.joda.time.DateTime;

/** V1beta1OrderStatus */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1beta1OrderStatus {
  public static final String SERIALIZED_NAME_AUTHORIZATIONS = "authorizations";

  @SerializedName(SERIALIZED_NAME_AUTHORIZATIONS)
  private List<V1beta1OrderStatusAuthorizations> authorizations = null;

  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";

  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private byte[] certificate;

  public static final String SERIALIZED_NAME_FAILURE_TIME = "failureTime";

  @SerializedName(SERIALIZED_NAME_FAILURE_TIME)
  private DateTime failureTime;

  public static final String SERIALIZED_NAME_FINALIZE_U_R_L = "finalizeURL";

  @SerializedName(SERIALIZED_NAME_FINALIZE_U_R_L)
  private String finalizeURL;

  public static final String SERIALIZED_NAME_REASON = "reason";

  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  /**
   * State contains the current state of this Order resource. States &#39;success&#39; and
   * &#39;expired&#39; are &#39;final&#39;
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    VALID("valid"),

    READY("ready"),

    PENDING("pending"),

    PROCESSING("processing"),

    INVALID("invalid"),

    EXPIRED("expired"),

    ERRORED("errored");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";

  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_URL = "url";

  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public V1beta1OrderStatus authorizations(List<V1beta1OrderStatusAuthorizations> authorizations) {

    this.authorizations = authorizations;
    return this;
  }

  public V1beta1OrderStatus addAuthorizationsItem(
      V1beta1OrderStatusAuthorizations authorizationsItem) {
    if (this.authorizations == null) {
      this.authorizations = new ArrayList<V1beta1OrderStatusAuthorizations>();
    }
    this.authorizations.add(authorizationsItem);
    return this;
  }

  /**
   * Authorizations contains data returned from the ACME server on what authorizations must be
   * completed in order to validate the DNS names specified on the Order.
   *
   * @return authorizations
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Authorizations contains data returned from the ACME server on what authorizations must be completed in order to validate the DNS names specified on the Order.")
  public List<V1beta1OrderStatusAuthorizations> getAuthorizations() {
    return authorizations;
  }

  public void setAuthorizations(List<V1beta1OrderStatusAuthorizations> authorizations) {
    this.authorizations = authorizations;
  }

  public V1beta1OrderStatus certificate(byte[] certificate) {

    this.certificate = certificate;
    return this;
  }

  /**
   * Certificate is a copy of the PEM encoded certificate for this Order. This field will be
   * populated after the order has been successfully finalized with the ACME server, and the order
   * has transitioned to the &#39;valid&#39; state.
   *
   * @return certificate
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Certificate is a copy of the PEM encoded certificate for this Order. This field will be populated after the order has been successfully finalized with the ACME server, and the order has transitioned to the 'valid' state.")
  public byte[] getCertificate() {
    return certificate;
  }

  public void setCertificate(byte[] certificate) {
    this.certificate = certificate;
  }

  public V1beta1OrderStatus failureTime(DateTime failureTime) {

    this.failureTime = failureTime;
    return this;
  }

  /**
   * FailureTime stores the time that this order failed. This is used to influence garbage
   * collection and back-off.
   *
   * @return failureTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "FailureTime stores the time that this order failed. This is used to influence garbage collection and back-off.")
  public DateTime getFailureTime() {
    return failureTime;
  }

  public void setFailureTime(DateTime failureTime) {
    this.failureTime = failureTime;
  }

  public V1beta1OrderStatus finalizeURL(String finalizeURL) {

    this.finalizeURL = finalizeURL;
    return this;
  }

  /**
   * FinalizeURL of the Order. This is used to obtain certificates for this order once it has been
   * completed.
   *
   * @return finalizeURL
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "FinalizeURL of the Order. This is used to obtain certificates for this order once it has been completed.")
  public String getFinalizeURL() {
    return finalizeURL;
  }

  public void setFinalizeURL(String finalizeURL) {
    this.finalizeURL = finalizeURL;
  }

  public V1beta1OrderStatus reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * Reason optionally provides more information about a why the order is in the current state.
   *
   * @return reason
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Reason optionally provides more information about a why the order is in the current state.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1beta1OrderStatus state(StateEnum state) {

    this.state = state;
    return this;
  }

  /**
   * State contains the current state of this Order resource. States &#39;success&#39; and
   * &#39;expired&#39; are &#39;final&#39;
   *
   * @return state
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "State contains the current state of this Order resource. States 'success' and 'expired' are 'final'")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public V1beta1OrderStatus url(String url) {

    this.url = url;
    return this;
  }

  /**
   * URL of the Order. This will initially be empty when the resource is first created. The Order
   * controller will populate this field when the Order is first processed. This field will be
   * immutable after it is initially set.
   *
   * @return url
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "URL of the Order. This will initially be empty when the resource is first created. The Order controller will populate this field when the Order is first processed. This field will be immutable after it is initially set.")
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
    V1beta1OrderStatus v1beta1OrderStatus = (V1beta1OrderStatus) o;
    return Objects.equals(this.authorizations, v1beta1OrderStatus.authorizations)
        && Arrays.equals(this.certificate, v1beta1OrderStatus.certificate)
        && Objects.equals(this.failureTime, v1beta1OrderStatus.failureTime)
        && Objects.equals(this.finalizeURL, v1beta1OrderStatus.finalizeURL)
        && Objects.equals(this.reason, v1beta1OrderStatus.reason)
        && Objects.equals(this.state, v1beta1OrderStatus.state)
        && Objects.equals(this.url, v1beta1OrderStatus.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authorizations, Arrays.hashCode(certificate), failureTime, finalizeURL, reason, state, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1OrderStatus {\n");
    sb.append("    authorizations: ").append(toIndentedString(authorizations)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    failureTime: ").append(toIndentedString(failureTime)).append("\n");
    sb.append("    finalizeURL: ").append(toIndentedString(finalizeURL)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
