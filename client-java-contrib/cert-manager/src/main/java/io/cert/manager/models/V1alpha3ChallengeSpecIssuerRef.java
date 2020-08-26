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
 * IssuerRef references a properly configured ACME-type Issuer which should be used to create this
 * Challenge. If the Issuer does not exist, processing will be retried. If the Issuer is not an
 * &#39;ACME&#39; Issuer, an error will be returned and the Challenge will be marked as failed.
 */
@ApiModel(
    description =
        "IssuerRef references a properly configured ACME-type Issuer which should be used to create this Challenge. If the Issuer does not exist, processing will be retried. If the Issuer is not an 'ACME' Issuer, an error will be returned and the Challenge will be marked as failed.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha3ChallengeSpecIssuerRef {
  public static final String SERIALIZED_NAME_GROUP = "group";

  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public V1alpha3ChallengeSpecIssuerRef group(String group) {

    this.group = group;
    return this;
  }

  /**
   * Group of the resource being referred to.
   *
   * @return group
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group of the resource being referred to.")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public V1alpha3ChallengeSpecIssuerRef kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Kind of the resource being referred to.
   *
   * @return kind
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kind of the resource being referred to.")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1alpha3ChallengeSpecIssuerRef name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name of the resource being referred to.
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "Name of the resource being referred to.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3ChallengeSpecIssuerRef v1alpha3ChallengeSpecIssuerRef =
        (V1alpha3ChallengeSpecIssuerRef) o;
    return Objects.equals(this.group, v1alpha3ChallengeSpecIssuerRef.group)
        && Objects.equals(this.kind, v1alpha3ChallengeSpecIssuerRef.kind)
        && Objects.equals(this.name, v1alpha3ChallengeSpecIssuerRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, kind, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3ChallengeSpecIssuerRef {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
