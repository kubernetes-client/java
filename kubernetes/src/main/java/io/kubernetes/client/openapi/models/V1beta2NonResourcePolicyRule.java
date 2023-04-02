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

/**
 * NonResourcePolicyRule is a predicate that matches non-resource requests according to their verb
 * and the target non-resource URL. A NonResourcePolicyRule matches a request if and only if both
 * (a) at least one member of verbs matches the request and (b) at least one member of
 * nonResourceURLs matches the request.
 */
@ApiModel(
    description =
        "NonResourcePolicyRule is a predicate that matches non-resource requests according to their verb and the target non-resource URL. A NonResourcePolicyRule matches a request if and only if both (a) at least one member of verbs matches the request and (b) at least one member of nonResourceURLs matches the request.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1beta2NonResourcePolicyRule {
  public static final String SERIALIZED_NAME_NON_RESOURCE_U_R_LS = "nonResourceURLs";

  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_U_R_LS)
  private List<String> nonResourceURLs = new ArrayList<>();

  public static final String SERIALIZED_NAME_VERBS = "verbs";

  @SerializedName(SERIALIZED_NAME_VERBS)
  private List<String> verbs = new ArrayList<>();

  public V1beta2NonResourcePolicyRule nonResourceURLs(List<String> nonResourceURLs) {

    this.nonResourceURLs = nonResourceURLs;
    return this;
  }

  public V1beta2NonResourcePolicyRule addNonResourceURLsItem(String nonResourceURLsItem) {
    this.nonResourceURLs.add(nonResourceURLsItem);
    return this;
  }

  /**
   * &#x60;nonResourceURLs&#x60; is a set of url prefixes that a user should have access to and may
   * not be empty. For example: - \&quot;/healthz\&quot; is legal - \&quot;/hea*\&quot; is illegal -
   * \&quot;/hea\&quot; is legal but matches nothing - \&quot;/hea/_*\&quot; also matches nothing -
   * \&quot;/healthz/_*\&quot; matches all per-component health checks. \&quot;*\&quot; matches all
   * non-resource urls. if it is present, it must be the only entry. Required.
   *
   * @return nonResourceURLs
   */
  @ApiModelProperty(
      required = true,
      value =
          "`nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:   - \"/healthz\" is legal   - \"/hea*\" is illegal   - \"/hea\" is legal but matches nothing   - \"/hea/_*\" also matches nothing   - \"/healthz/_*\" matches all per-component health checks. \"*\" matches all non-resource urls. if it is present, it must be the only entry. Required.")
  public List<String> getNonResourceURLs() {
    return nonResourceURLs;
  }

  public void setNonResourceURLs(List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
  }

  public V1beta2NonResourcePolicyRule verbs(List<String> verbs) {

    this.verbs = verbs;
    return this;
  }

  public V1beta2NonResourcePolicyRule addVerbsItem(String verbsItem) {
    this.verbs.add(verbsItem);
    return this;
  }

  /**
   * &#x60;verbs&#x60; is a list of matching verbs and may not be empty. \&quot;*\&quot; matches all
   * verbs. If it is present, it must be the only entry. Required.
   *
   * @return verbs
   */
  @ApiModelProperty(
      required = true,
      value =
          "`verbs` is a list of matching verbs and may not be empty. \"*\" matches all verbs. If it is present, it must be the only entry. Required.")
  public List<String> getVerbs() {
    return verbs;
  }

  public void setVerbs(List<String> verbs) {
    this.verbs = verbs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2NonResourcePolicyRule v1beta2NonResourcePolicyRule = (V1beta2NonResourcePolicyRule) o;
    return Objects.equals(this.nonResourceURLs, v1beta2NonResourcePolicyRule.nonResourceURLs)
        && Objects.equals(this.verbs, v1beta2NonResourcePolicyRule.verbs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonResourceURLs, verbs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2NonResourcePolicyRule {\n");
    sb.append("    nonResourceURLs: ").append(toIndentedString(nonResourceURLs)).append("\n");
    sb.append("    verbs: ").append(toIndentedString(verbs)).append("\n");
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
