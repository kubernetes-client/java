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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ACMEAuthorization contains data returned from the ACME server on an authorization that must be
 * completed in order validate a DNS name on an ACME Order resource.
 */
@ApiModel(
    description =
        "ACMEAuthorization contains data returned from the ACME server on an authorization that must be completed in order validate a DNS name on an ACME Order resource.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1beta1OrderStatusAuthorizations {
  public static final String SERIALIZED_NAME_CHALLENGES = "challenges";

  @SerializedName(SERIALIZED_NAME_CHALLENGES)
  private List<V1beta1OrderStatusChallenges> challenges = null;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";

  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  /**
   * InitialState is the initial state of the ACME authorization when first fetched from the ACME
   * server. If an Authorization is already &#39;valid&#39;, the Order controller will not create a
   * Challenge resource for the authorization. This will occur when working with an ACME server that
   * enables &#39;authz reuse&#39; (such as Let&#39;s Encrypt&#39;s production endpoint). If not set
   * and &#39;identifier&#39; is set, the state is assumed to be pending and a Challenge will be
   * created.
   */
  @JsonAdapter(InitialStateEnum.Adapter.class)
  public enum InitialStateEnum {
    VALID("valid"),

    READY("ready"),

    PENDING("pending"),

    PROCESSING("processing"),

    INVALID("invalid"),

    EXPIRED("expired"),

    ERRORED("errored");

    private String value;

    InitialStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InitialStateEnum fromValue(String value) {
      for (InitialStateEnum b : InitialStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InitialStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InitialStateEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InitialStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InitialStateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INITIAL_STATE = "initialState";

  @SerializedName(SERIALIZED_NAME_INITIAL_STATE)
  private InitialStateEnum initialState;

  public static final String SERIALIZED_NAME_URL = "url";

  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_WILDCARD = "wildcard";

  @SerializedName(SERIALIZED_NAME_WILDCARD)
  private Boolean wildcard;

  public V1beta1OrderStatusAuthorizations challenges(
      List<V1beta1OrderStatusChallenges> challenges) {

    this.challenges = challenges;
    return this;
  }

  public V1beta1OrderStatusAuthorizations addChallengesItem(
      V1beta1OrderStatusChallenges challengesItem) {
    if (this.challenges == null) {
      this.challenges = new ArrayList<V1beta1OrderStatusChallenges>();
    }
    this.challenges.add(challengesItem);
    return this;
  }

  /**
   * Challenges specifies the challenge types offered by the ACME server. One of these challenge
   * types will be selected when validating the DNS name and an appropriate Challenge resource will
   * be created to perform the ACME challenge process.
   *
   * @return challenges
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Challenges specifies the challenge types offered by the ACME server. One of these challenge types will be selected when validating the DNS name and an appropriate Challenge resource will be created to perform the ACME challenge process.")
  public List<V1beta1OrderStatusChallenges> getChallenges() {
    return challenges;
  }

  public void setChallenges(List<V1beta1OrderStatusChallenges> challenges) {
    this.challenges = challenges;
  }

  public V1beta1OrderStatusAuthorizations identifier(String identifier) {

    this.identifier = identifier;
    return this;
  }

  /**
   * Identifier is the DNS name to be validated as part of this authorization
   *
   * @return identifier
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Identifier is the DNS name to be validated as part of this authorization")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public V1beta1OrderStatusAuthorizations initialState(InitialStateEnum initialState) {

    this.initialState = initialState;
    return this;
  }

  /**
   * InitialState is the initial state of the ACME authorization when first fetched from the ACME
   * server. If an Authorization is already &#39;valid&#39;, the Order controller will not create a
   * Challenge resource for the authorization. This will occur when working with an ACME server that
   * enables &#39;authz reuse&#39; (such as Let&#39;s Encrypt&#39;s production endpoint). If not set
   * and &#39;identifier&#39; is set, the state is assumed to be pending and a Challenge will be
   * created.
   *
   * @return initialState
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "InitialState is the initial state of the ACME authorization when first fetched from the ACME server. If an Authorization is already 'valid', the Order controller will not create a Challenge resource for the authorization. This will occur when working with an ACME server that enables 'authz reuse' (such as Let's Encrypt's production endpoint). If not set and 'identifier' is set, the state is assumed to be pending and a Challenge will be created.")
  public InitialStateEnum getInitialState() {
    return initialState;
  }

  public void setInitialState(InitialStateEnum initialState) {
    this.initialState = initialState;
  }

  public V1beta1OrderStatusAuthorizations url(String url) {

    this.url = url;
    return this;
  }

  /**
   * URL is the URL of the Authorization that must be completed
   *
   * @return url
   */
  @ApiModelProperty(
      required = true,
      value = "URL is the URL of the Authorization that must be completed")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public V1beta1OrderStatusAuthorizations wildcard(Boolean wildcard) {

    this.wildcard = wildcard;
    return this;
  }

  /**
   * Wildcard will be true if this authorization is for a wildcard DNS name. If this is true, the
   * identifier will be the *non-wildcard* version of the DNS name. For example, if
   * &#39;*.example.com&#39; is the DNS name being validated, this field will be &#39;true&#39; and
   * the &#39;identifier&#39; field will be &#39;example.com&#39;.
   *
   * @return wildcard
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Wildcard will be true if this authorization is for a wildcard DNS name. If this is true, the identifier will be the *non-wildcard* version of the DNS name. For example, if '*.example.com' is the DNS name being validated, this field will be 'true' and the 'identifier' field will be 'example.com'.")
  public Boolean getWildcard() {
    return wildcard;
  }

  public void setWildcard(Boolean wildcard) {
    this.wildcard = wildcard;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1OrderStatusAuthorizations v1beta1OrderStatusAuthorizations =
        (V1beta1OrderStatusAuthorizations) o;
    return Objects.equals(this.challenges, v1beta1OrderStatusAuthorizations.challenges)
        && Objects.equals(this.identifier, v1beta1OrderStatusAuthorizations.identifier)
        && Objects.equals(this.initialState, v1beta1OrderStatusAuthorizations.initialState)
        && Objects.equals(this.url, v1beta1OrderStatusAuthorizations.url)
        && Objects.equals(this.wildcard, v1beta1OrderStatusAuthorizations.wildcard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challenges, identifier, initialState, url, wildcard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1OrderStatusAuthorizations {\n");
    sb.append("    challenges: ").append(toIndentedString(challenges)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    initialState: ").append(toIndentedString(initialState)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    wildcard: ").append(toIndentedString(wildcard)).append("\n");
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
