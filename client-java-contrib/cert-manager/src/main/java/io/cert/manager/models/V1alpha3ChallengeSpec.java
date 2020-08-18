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
import java.util.Objects;

/** V1alpha3ChallengeSpec */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha3ChallengeSpec {
  public static final String SERIALIZED_NAME_AUTHZ_U_R_L = "authzURL";

  @SerializedName(SERIALIZED_NAME_AUTHZ_U_R_L)
  private String authzURL;

  public static final String SERIALIZED_NAME_DNS_NAME = "dnsName";

  @SerializedName(SERIALIZED_NAME_DNS_NAME)
  private String dnsName;

  public static final String SERIALIZED_NAME_ISSUER_REF = "issuerRef";

  @SerializedName(SERIALIZED_NAME_ISSUER_REF)
  private V1alpha3ChallengeSpecIssuerRef issuerRef;

  public static final String SERIALIZED_NAME_KEY = "key";

  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_SOLVER = "solver";

  @SerializedName(SERIALIZED_NAME_SOLVER)
  private V1alpha3ChallengeSpecSolver solver;

  public static final String SERIALIZED_NAME_TOKEN = "token";

  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  /**
   * Type is the type of ACME challenge this resource represents. One of \&quot;http-01\&quot; or
   * \&quot;dns-01\&quot;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    HTTP_01("http-01"),

    DNS_01("dns-01");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_URL = "url";

  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_WILDCARD = "wildcard";

  @SerializedName(SERIALIZED_NAME_WILDCARD)
  private Boolean wildcard;

  public V1alpha3ChallengeSpec authzURL(String authzURL) {

    this.authzURL = authzURL;
    return this;
  }

  /**
   * AuthzURL is the URL to the ACME Authorization resource that this challenge is a part of.
   *
   * @return authzURL
   */
  @ApiModelProperty(
      required = true,
      value =
          "AuthzURL is the URL to the ACME Authorization resource that this challenge is a part of.")
  public String getAuthzURL() {
    return authzURL;
  }

  public void setAuthzURL(String authzURL) {
    this.authzURL = authzURL;
  }

  public V1alpha3ChallengeSpec dnsName(String dnsName) {

    this.dnsName = dnsName;
    return this;
  }

  /**
   * DNSName is the identifier that this challenge is for, e.g. example.com. If the requested
   * DNSName is a &#39;wildcard&#39;, this field MUST be set to the non-wildcard domain, e.g. for
   * &#x60;*.example.com&#x60;, it must be &#x60;example.com&#x60;.
   *
   * @return dnsName
   */
  @ApiModelProperty(
      required = true,
      value =
          "DNSName is the identifier that this challenge is for, e.g. example.com. If the requested DNSName is a 'wildcard', this field MUST be set to the non-wildcard domain, e.g. for `*.example.com`, it must be `example.com`.")
  public String getDnsName() {
    return dnsName;
  }

  public void setDnsName(String dnsName) {
    this.dnsName = dnsName;
  }

  public V1alpha3ChallengeSpec issuerRef(V1alpha3ChallengeSpecIssuerRef issuerRef) {

    this.issuerRef = issuerRef;
    return this;
  }

  /**
   * Get issuerRef
   *
   * @return issuerRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha3ChallengeSpecIssuerRef getIssuerRef() {
    return issuerRef;
  }

  public void setIssuerRef(V1alpha3ChallengeSpecIssuerRef issuerRef) {
    this.issuerRef = issuerRef;
  }

  public V1alpha3ChallengeSpec key(String key) {

    this.key = key;
    return this;
  }

  /**
   * Key is the ACME challenge key for this challenge For HTTP01 challenges, this is the value that
   * must be responded with to complete the HTTP01 challenge in the format: &#x60;&lt;private key
   * JWK thumbprint&gt;.&lt;key from acme server for challenge&gt;&#x60;. For DNS01 challenges, this
   * is the base64 encoded SHA256 sum of the &#x60;&lt;private key JWK thumbprint&gt;.&lt;key from
   * acme server for challenge&gt;&#x60; text that must be set as the TXT record content.
   *
   * @return key
   */
  @ApiModelProperty(
      required = true,
      value =
          "Key is the ACME challenge key for this challenge For HTTP01 challenges, this is the value that must be responded with to complete the HTTP01 challenge in the format: `<private key JWK thumbprint>.<key from acme server for challenge>`. For DNS01 challenges, this is the base64 encoded SHA256 sum of the `<private key JWK thumbprint>.<key from acme server for challenge>` text that must be set as the TXT record content.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public V1alpha3ChallengeSpec solver(V1alpha3ChallengeSpecSolver solver) {

    this.solver = solver;
    return this;
  }

  /**
   * Get solver
   *
   * @return solver
   */
  @ApiModelProperty(required = true, value = "")
  public V1alpha3ChallengeSpecSolver getSolver() {
    return solver;
  }

  public void setSolver(V1alpha3ChallengeSpecSolver solver) {
    this.solver = solver;
  }

  public V1alpha3ChallengeSpec token(String token) {

    this.token = token;
    return this;
  }

  /**
   * Token is the ACME challenge token for this challenge. This is the raw value returned from the
   * ACME server.
   *
   * @return token
   */
  @ApiModelProperty(
      required = true,
      value =
          "Token is the ACME challenge token for this challenge. This is the raw value returned from the ACME server.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public V1alpha3ChallengeSpec type(TypeEnum type) {

    this.type = type;
    return this;
  }

  /**
   * Type is the type of ACME challenge this resource represents. One of \&quot;http-01\&quot; or
   * \&quot;dns-01\&quot;.
   *
   * @return type
   */
  @ApiModelProperty(
      required = true,
      value =
          "Type is the type of ACME challenge this resource represents. One of \"http-01\" or \"dns-01\".")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public V1alpha3ChallengeSpec url(String url) {

    this.url = url;
    return this;
  }

  /**
   * URL is the URL of the ACME Challenge resource for this challenge. This can be used to lookup
   * details about the status of this challenge.
   *
   * @return url
   */
  @ApiModelProperty(
      required = true,
      value =
          "URL is the URL of the ACME Challenge resource for this challenge. This can be used to lookup details about the status of this challenge.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public V1alpha3ChallengeSpec wildcard(Boolean wildcard) {

    this.wildcard = wildcard;
    return this;
  }

  /**
   * Wildcard will be true if this challenge is for a wildcard identifier, for example
   * &#39;*.example.com&#39;.
   *
   * @return wildcard
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Wildcard will be true if this challenge is for a wildcard identifier, for example '*.example.com'.")
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
    V1alpha3ChallengeSpec v1alpha3ChallengeSpec = (V1alpha3ChallengeSpec) o;
    return Objects.equals(this.authzURL, v1alpha3ChallengeSpec.authzURL)
        && Objects.equals(this.dnsName, v1alpha3ChallengeSpec.dnsName)
        && Objects.equals(this.issuerRef, v1alpha3ChallengeSpec.issuerRef)
        && Objects.equals(this.key, v1alpha3ChallengeSpec.key)
        && Objects.equals(this.solver, v1alpha3ChallengeSpec.solver)
        && Objects.equals(this.token, v1alpha3ChallengeSpec.token)
        && Objects.equals(this.type, v1alpha3ChallengeSpec.type)
        && Objects.equals(this.url, v1alpha3ChallengeSpec.url)
        && Objects.equals(this.wildcard, v1alpha3ChallengeSpec.wildcard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authzURL, dnsName, issuerRef, key, solver, token, type, url, wildcard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3ChallengeSpec {\n");
    sb.append("    authzURL: ").append(toIndentedString(authzURL)).append("\n");
    sb.append("    dnsName: ").append(toIndentedString(dnsName)).append("\n");
    sb.append("    issuerRef: ").append(toIndentedString(issuerRef)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    solver: ").append(toIndentedString(solver)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
