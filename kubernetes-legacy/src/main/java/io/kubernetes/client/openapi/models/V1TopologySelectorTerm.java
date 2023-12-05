/*
Copyright 2023 The Kubernetes Authors.
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A topology selector term represents the result of label queries. A null or empty topology selector term matches no objects. The requirements of them are ANDed. It provides a subset of functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.
 */
@ApiModel(description = "A topology selector term represents the result of label queries. A null or empty topology selector term matches no objects. The requirements of them are ANDed. It provides a subset of functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1TopologySelectorTerm {
  public static final String SERIALIZED_NAME_MATCH_LABEL_EXPRESSIONS = "matchLabelExpressions";
  @SerializedName(SERIALIZED_NAME_MATCH_LABEL_EXPRESSIONS)
  private List<V1TopologySelectorLabelRequirement> matchLabelExpressions = null;


  public V1TopologySelectorTerm matchLabelExpressions(List<V1TopologySelectorLabelRequirement> matchLabelExpressions) {

    this.matchLabelExpressions = matchLabelExpressions;
    return this;
  }

  public V1TopologySelectorTerm addMatchLabelExpressionsItem(V1TopologySelectorLabelRequirement matchLabelExpressionsItem) {
    if (this.matchLabelExpressions == null) {
      this.matchLabelExpressions = new ArrayList<>();
    }
    this.matchLabelExpressions.add(matchLabelExpressionsItem);
    return this;
  }

   /**
   * A list of topology selector requirements by labels.
   * @return matchLabelExpressions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of topology selector requirements by labels.")

  public List<V1TopologySelectorLabelRequirement> getMatchLabelExpressions() {
    return matchLabelExpressions;
  }


  public void setMatchLabelExpressions(List<V1TopologySelectorLabelRequirement> matchLabelExpressions) {
    this.matchLabelExpressions = matchLabelExpressions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TopologySelectorTerm v1TopologySelectorTerm = (V1TopologySelectorTerm) o;
    return Objects.equals(this.matchLabelExpressions, v1TopologySelectorTerm.matchLabelExpressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchLabelExpressions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TopologySelectorTerm {\n");
    sb.append("    matchLabelExpressions: ").append(toIndentedString(matchLabelExpressions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
