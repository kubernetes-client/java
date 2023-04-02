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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** ResourceQuotaStatus defines the enforced hard limits and observed use. */
@ApiModel(description = "ResourceQuotaStatus defines the enforced hard limits and observed use.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ResourceQuotaStatus {
  public static final String SERIALIZED_NAME_HARD = "hard";

  @SerializedName(SERIALIZED_NAME_HARD)
  private Map<String, Quantity> hard = null;

  public static final String SERIALIZED_NAME_USED = "used";

  @SerializedName(SERIALIZED_NAME_USED)
  private Map<String, Quantity> used = null;

  public V1ResourceQuotaStatus hard(Map<String, Quantity> hard) {

    this.hard = hard;
    return this;
  }

  public V1ResourceQuotaStatus putHardItem(String key, Quantity hardItem) {
    if (this.hard == null) {
      this.hard = new HashMap<>();
    }
    this.hard.put(key, hardItem);
    return this;
  }

  /**
   * Hard is the set of enforced hard limits for each named resource. More info:
   * https://kubernetes.io/docs/concepts/policy/resource-quotas/
   *
   * @return hard
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Hard is the set of enforced hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/")
  public Map<String, Quantity> getHard() {
    return hard;
  }

  public void setHard(Map<String, Quantity> hard) {
    this.hard = hard;
  }

  public V1ResourceQuotaStatus used(Map<String, Quantity> used) {

    this.used = used;
    return this;
  }

  public V1ResourceQuotaStatus putUsedItem(String key, Quantity usedItem) {
    if (this.used == null) {
      this.used = new HashMap<>();
    }
    this.used.put(key, usedItem);
    return this;
  }

  /**
   * Used is the current observed total usage of the resource in the namespace.
   *
   * @return used
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Used is the current observed total usage of the resource in the namespace.")
  public Map<String, Quantity> getUsed() {
    return used;
  }

  public void setUsed(Map<String, Quantity> used) {
    this.used = used;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceQuotaStatus v1ResourceQuotaStatus = (V1ResourceQuotaStatus) o;
    return Objects.equals(this.hard, v1ResourceQuotaStatus.hard)
        && Objects.equals(this.used, v1ResourceQuotaStatus.used);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hard, used);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceQuotaStatus {\n");
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
