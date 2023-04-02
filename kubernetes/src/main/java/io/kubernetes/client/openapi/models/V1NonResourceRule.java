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

/** NonResourceRule holds information that describes a rule for the non-resource */
@ApiModel(
    description = "NonResourceRule holds information that describes a rule for the non-resource")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1NonResourceRule {
  public static final String SERIALIZED_NAME_NON_RESOURCE_U_R_LS = "nonResourceURLs";

  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_U_R_LS)
  private List<String> nonResourceURLs = null;

  public static final String SERIALIZED_NAME_VERBS = "verbs";

  @SerializedName(SERIALIZED_NAME_VERBS)
  private List<String> verbs = new ArrayList<>();

  public V1NonResourceRule nonResourceURLs(List<String> nonResourceURLs) {

    this.nonResourceURLs = nonResourceURLs;
    return this;
  }

  public V1NonResourceRule addNonResourceURLsItem(String nonResourceURLsItem) {
    if (this.nonResourceURLs == null) {
      this.nonResourceURLs = new ArrayList<>();
    }
    this.nonResourceURLs.add(nonResourceURLsItem);
    return this;
  }

  /**
   * NonResourceURLs is a set of partial urls that a user should have access to. *s are allowed, but
   * only as the full, final step in the path. \&quot;*\&quot; means all.
   *
   * @return nonResourceURLs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path.  \"*\" means all.")
  public List<String> getNonResourceURLs() {
    return nonResourceURLs;
  }

  public void setNonResourceURLs(List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
  }

  public V1NonResourceRule verbs(List<String> verbs) {

    this.verbs = verbs;
    return this;
  }

  public V1NonResourceRule addVerbsItem(String verbsItem) {
    this.verbs.add(verbsItem);
    return this;
  }

  /**
   * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head,
   * options. \&quot;*\&quot; means all.
   *
   * @return verbs
   */
  @ApiModelProperty(
      required = true,
      value =
          "Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  \"*\" means all.")
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
    V1NonResourceRule v1NonResourceRule = (V1NonResourceRule) o;
    return Objects.equals(this.nonResourceURLs, v1NonResourceRule.nonResourceURLs)
        && Objects.equals(this.verbs, v1NonResourceRule.verbs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonResourceURLs, verbs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NonResourceRule {\n");
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
