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
import java.util.Objects;

/**
 * SelfSubjectAccessReviewSpec is a description of the access request. Exactly one of
 * ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 */
@ApiModel(
    description =
        "SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1SelfSubjectAccessReviewSpec {
  public static final String SERIALIZED_NAME_NON_RESOURCE_ATTRIBUTES = "nonResourceAttributes";

  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_ATTRIBUTES)
  private V1NonResourceAttributes nonResourceAttributes;

  public static final String SERIALIZED_NAME_RESOURCE_ATTRIBUTES = "resourceAttributes";

  @SerializedName(SERIALIZED_NAME_RESOURCE_ATTRIBUTES)
  private V1ResourceAttributes resourceAttributes;

  public V1SelfSubjectAccessReviewSpec nonResourceAttributes(
      V1NonResourceAttributes nonResourceAttributes) {

    this.nonResourceAttributes = nonResourceAttributes;
    return this;
  }

  /**
   * Get nonResourceAttributes
   *
   * @return nonResourceAttributes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NonResourceAttributes getNonResourceAttributes() {
    return nonResourceAttributes;
  }

  public void setNonResourceAttributes(V1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
  }

  public V1SelfSubjectAccessReviewSpec resourceAttributes(V1ResourceAttributes resourceAttributes) {

    this.resourceAttributes = resourceAttributes;
    return this;
  }

  /**
   * Get resourceAttributes
   *
   * @return resourceAttributes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ResourceAttributes getResourceAttributes() {
    return resourceAttributes;
  }

  public void setResourceAttributes(V1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SelfSubjectAccessReviewSpec v1SelfSubjectAccessReviewSpec = (V1SelfSubjectAccessReviewSpec) o;
    return Objects.equals(
            this.nonResourceAttributes, v1SelfSubjectAccessReviewSpec.nonResourceAttributes)
        && Objects.equals(
            this.resourceAttributes, v1SelfSubjectAccessReviewSpec.resourceAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonResourceAttributes, resourceAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SelfSubjectAccessReviewSpec {\n");
    sb.append("    nonResourceAttributes: ")
        .append(toIndentedString(nonResourceAttributes))
        .append("\n");
    sb.append("    resourceAttributes: ").append(toIndentedString(resourceAttributes)).append("\n");
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
