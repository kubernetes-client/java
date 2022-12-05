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
import io.kubernetes.client.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** ResourceQuotaSpec defines the desired hard limits to enforce for Quota. */
@ApiModel(description = "ResourceQuotaSpec defines the desired hard limits to enforce for Quota.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ResourceQuotaSpec {
  public static final String SERIALIZED_NAME_HARD = "hard";

  @SerializedName(SERIALIZED_NAME_HARD)
  private Map<String, Quantity> hard = null;

  public static final String SERIALIZED_NAME_SCOPE_SELECTOR = "scopeSelector";

  @SerializedName(SERIALIZED_NAME_SCOPE_SELECTOR)
  private V1ScopeSelector scopeSelector;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";

  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<String> scopes = null;

  public V1ResourceQuotaSpec hard(Map<String, Quantity> hard) {

    this.hard = hard;
    return this;
  }

  public V1ResourceQuotaSpec putHardItem(String key, Quantity hardItem) {
    if (this.hard == null) {
      this.hard = new HashMap<>();
    }
    this.hard.put(key, hardItem);
    return this;
  }

  /**
   * hard is the set of desired hard limits for each named resource. More info:
   * https://kubernetes.io/docs/concepts/policy/resource-quotas/
   *
   * @return hard
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "hard is the set of desired hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/")
  public Map<String, Quantity> getHard() {
    return hard;
  }

  public void setHard(Map<String, Quantity> hard) {
    this.hard = hard;
  }

  public V1ResourceQuotaSpec scopeSelector(V1ScopeSelector scopeSelector) {

    this.scopeSelector = scopeSelector;
    return this;
  }

  /**
   * Get scopeSelector
   *
   * @return scopeSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ScopeSelector getScopeSelector() {
    return scopeSelector;
  }

  public void setScopeSelector(V1ScopeSelector scopeSelector) {
    this.scopeSelector = scopeSelector;
  }

  public V1ResourceQuotaSpec scopes(List<String> scopes) {

    this.scopes = scopes;
    return this;
  }

  public V1ResourceQuotaSpec addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * A collection of filters that must match each object tracked by a quota. If not specified, the
   * quota matches all objects.
   *
   * @return scopes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects.")
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceQuotaSpec v1ResourceQuotaSpec = (V1ResourceQuotaSpec) o;
    return Objects.equals(this.hard, v1ResourceQuotaSpec.hard)
        && Objects.equals(this.scopeSelector, v1ResourceQuotaSpec.scopeSelector)
        && Objects.equals(this.scopes, v1ResourceQuotaSpec.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hard, scopeSelector, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceQuotaSpec {\n");
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
    sb.append("    scopeSelector: ").append(toIndentedString(scopeSelector)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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
