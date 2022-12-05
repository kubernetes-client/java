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
 * UncountedTerminatedPods holds UIDs of Pods that have terminated but haven&#39;t been accounted in
 * Job status counters.
 */
@ApiModel(
    description =
        "UncountedTerminatedPods holds UIDs of Pods that have terminated but haven't been accounted in Job status counters.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1UncountedTerminatedPods {
  public static final String SERIALIZED_NAME_FAILED = "failed";

  @SerializedName(SERIALIZED_NAME_FAILED)
  private List<String> failed = null;

  public static final String SERIALIZED_NAME_SUCCEEDED = "succeeded";

  @SerializedName(SERIALIZED_NAME_SUCCEEDED)
  private List<String> succeeded = null;

  public V1UncountedTerminatedPods failed(List<String> failed) {

    this.failed = failed;
    return this;
  }

  public V1UncountedTerminatedPods addFailedItem(String failedItem) {
    if (this.failed == null) {
      this.failed = new ArrayList<>();
    }
    this.failed.add(failedItem);
    return this;
  }

  /**
   * Failed holds UIDs of failed Pods.
   *
   * @return failed
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Failed holds UIDs of failed Pods.")
  public List<String> getFailed() {
    return failed;
  }

  public void setFailed(List<String> failed) {
    this.failed = failed;
  }

  public V1UncountedTerminatedPods succeeded(List<String> succeeded) {

    this.succeeded = succeeded;
    return this;
  }

  public V1UncountedTerminatedPods addSucceededItem(String succeededItem) {
    if (this.succeeded == null) {
      this.succeeded = new ArrayList<>();
    }
    this.succeeded.add(succeededItem);
    return this;
  }

  /**
   * Succeeded holds UIDs of succeeded Pods.
   *
   * @return succeeded
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Succeeded holds UIDs of succeeded Pods.")
  public List<String> getSucceeded() {
    return succeeded;
  }

  public void setSucceeded(List<String> succeeded) {
    this.succeeded = succeeded;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1UncountedTerminatedPods v1UncountedTerminatedPods = (V1UncountedTerminatedPods) o;
    return Objects.equals(this.failed, v1UncountedTerminatedPods.failed)
        && Objects.equals(this.succeeded, v1UncountedTerminatedPods.succeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failed, succeeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1UncountedTerminatedPods {\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
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
