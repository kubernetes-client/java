/*
Copyright 2025 The Kubernetes Authors.
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SuccessPolicyRule describes rule for declaring a Job as succeeded. Each rule must have at least one of the \&quot;succeededIndexes\&quot; or \&quot;succeededCount\&quot; specified.
 */
@ApiModel(description = "SuccessPolicyRule describes rule for declaring a Job as succeeded. Each rule must have at least one of the \"succeededIndexes\" or \"succeededCount\" specified.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T16:56:46.431280Z[Etc/UTC]")
public class V1SuccessPolicyRule {
  public static final String SERIALIZED_NAME_SUCCEEDED_COUNT = "succeededCount";
  @SerializedName(SERIALIZED_NAME_SUCCEEDED_COUNT)
  private Integer succeededCount;

  public static final String SERIALIZED_NAME_SUCCEEDED_INDEXES = "succeededIndexes";
  @SerializedName(SERIALIZED_NAME_SUCCEEDED_INDEXES)
  private String succeededIndexes;


  public V1SuccessPolicyRule succeededCount(Integer succeededCount) {

    this.succeededCount = succeededCount;
    return this;
  }

   /**
   * succeededCount specifies the minimal required size of the actual set of the succeeded indexes for the Job. When succeededCount is used along with succeededIndexes, the check is constrained only to the set of indexes specified by succeededIndexes. For example, given that succeededIndexes is \&quot;1-4\&quot;, succeededCount is \&quot;3\&quot;, and completed indexes are \&quot;1\&quot;, \&quot;3\&quot;, and \&quot;5\&quot;, the Job isn&#39;t declared as succeeded because only \&quot;1\&quot; and \&quot;3\&quot; indexes are considered in that rules. When this field is null, this doesn&#39;t default to any value and is never evaluated at any time. When specified it needs to be a positive integer.
   * @return succeededCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "succeededCount specifies the minimal required size of the actual set of the succeeded indexes for the Job. When succeededCount is used along with succeededIndexes, the check is constrained only to the set of indexes specified by succeededIndexes. For example, given that succeededIndexes is \"1-4\", succeededCount is \"3\", and completed indexes are \"1\", \"3\", and \"5\", the Job isn't declared as succeeded because only \"1\" and \"3\" indexes are considered in that rules. When this field is null, this doesn't default to any value and is never evaluated at any time. When specified it needs to be a positive integer.")

  public Integer getSucceededCount() {
    return succeededCount;
  }


  public void setSucceededCount(Integer succeededCount) {
    this.succeededCount = succeededCount;
  }


  public V1SuccessPolicyRule succeededIndexes(String succeededIndexes) {

    this.succeededIndexes = succeededIndexes;
    return this;
  }

   /**
   * succeededIndexes specifies the set of indexes which need to be contained in the actual set of the succeeded indexes for the Job. The list of indexes must be within 0 to \&quot;.spec.completions-1\&quot; and must not contain duplicates. At least one element is required. The indexes are represented as intervals separated by commas. The intervals can be a decimal integer or a pair of decimal integers separated by a hyphen. The number are listed in represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as \&quot;1,3-5,7\&quot;. When this field is null, this field doesn&#39;t default to any value and is never evaluated at any time.
   * @return succeededIndexes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "succeededIndexes specifies the set of indexes which need to be contained in the actual set of the succeeded indexes for the Job. The list of indexes must be within 0 to \".spec.completions-1\" and must not contain duplicates. At least one element is required. The indexes are represented as intervals separated by commas. The intervals can be a decimal integer or a pair of decimal integers separated by a hyphen. The number are listed in represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as \"1,3-5,7\". When this field is null, this field doesn't default to any value and is never evaluated at any time.")

  public String getSucceededIndexes() {
    return succeededIndexes;
  }


  public void setSucceededIndexes(String succeededIndexes) {
    this.succeededIndexes = succeededIndexes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SuccessPolicyRule v1SuccessPolicyRule = (V1SuccessPolicyRule) o;
    return Objects.equals(this.succeededCount, v1SuccessPolicyRule.succeededCount) &&
        Objects.equals(this.succeededIndexes, v1SuccessPolicyRule.succeededIndexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(succeededCount, succeededIndexes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SuccessPolicyRule {\n");
    sb.append("    succeededCount: ").append(toIndentedString(succeededCount)).append("\n");
    sb.append("    succeededIndexes: ").append(toIndentedString(succeededIndexes)).append("\n");
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
