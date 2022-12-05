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
 * A scope selector represents the AND of the selectors represented by the scoped-resource selector
 * requirements.
 */
@ApiModel(
    description =
        "A scope selector represents the AND of the selectors represented by the scoped-resource selector requirements.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ScopeSelector {
  public static final String SERIALIZED_NAME_MATCH_EXPRESSIONS = "matchExpressions";

  @SerializedName(SERIALIZED_NAME_MATCH_EXPRESSIONS)
  private List<V1ScopedResourceSelectorRequirement> matchExpressions = null;

  public V1ScopeSelector matchExpressions(
      List<V1ScopedResourceSelectorRequirement> matchExpressions) {

    this.matchExpressions = matchExpressions;
    return this;
  }

  public V1ScopeSelector addMatchExpressionsItem(
      V1ScopedResourceSelectorRequirement matchExpressionsItem) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList<>();
    }
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

  /**
   * A list of scope selector requirements by scope of the resources.
   *
   * @return matchExpressions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of scope selector requirements by scope of the resources.")
  public List<V1ScopedResourceSelectorRequirement> getMatchExpressions() {
    return matchExpressions;
  }

  public void setMatchExpressions(List<V1ScopedResourceSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ScopeSelector v1ScopeSelector = (V1ScopeSelector) o;
    return Objects.equals(this.matchExpressions, v1ScopeSelector.matchExpressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ScopeSelector {\n");
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
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
