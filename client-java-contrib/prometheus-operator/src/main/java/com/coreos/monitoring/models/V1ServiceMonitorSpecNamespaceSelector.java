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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Selector to select which namespaces the Endpoints objects are discovered from. */
@ApiModel(
    description = "Selector to select which namespaces the Endpoints objects are discovered from.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ServiceMonitorSpecNamespaceSelector {
  public static final String SERIALIZED_NAME_ANY = "any";

  @SerializedName(SERIALIZED_NAME_ANY)
  private Boolean any;

  public static final String SERIALIZED_NAME_MATCH_NAMES = "matchNames";

  @SerializedName(SERIALIZED_NAME_MATCH_NAMES)
  private List<String> matchNames = null;

  public V1ServiceMonitorSpecNamespaceSelector any(Boolean any) {

    this.any = any;
    return this;
  }

  /**
   * Boolean describing whether all namespaces are selected in contrast to a list restricting them.
   *
   * @return any
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Boolean describing whether all namespaces are selected in contrast to a list restricting them.")
  public Boolean getAny() {
    return any;
  }

  public void setAny(Boolean any) {
    this.any = any;
  }

  public V1ServiceMonitorSpecNamespaceSelector matchNames(List<String> matchNames) {

    this.matchNames = matchNames;
    return this;
  }

  public V1ServiceMonitorSpecNamespaceSelector addMatchNamesItem(String matchNamesItem) {
    if (this.matchNames == null) {
      this.matchNames = new ArrayList<String>();
    }
    this.matchNames.add(matchNamesItem);
    return this;
  }

  /**
   * List of namespace names.
   *
   * @return matchNames
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of namespace names.")
  public List<String> getMatchNames() {
    return matchNames;
  }

  public void setMatchNames(List<String> matchNames) {
    this.matchNames = matchNames;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ServiceMonitorSpecNamespaceSelector v1ServiceMonitorSpecNamespaceSelector =
        (V1ServiceMonitorSpecNamespaceSelector) o;
    return Objects.equals(this.any, v1ServiceMonitorSpecNamespaceSelector.any)
        && Objects.equals(this.matchNames, v1ServiceMonitorSpecNamespaceSelector.matchNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(any, matchNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceMonitorSpecNamespaceSelector {\n");
    sb.append("    any: ").append(toIndentedString(any)).append("\n");
    sb.append("    matchNames: ").append(toIndentedString(matchNames)).append("\n");
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
