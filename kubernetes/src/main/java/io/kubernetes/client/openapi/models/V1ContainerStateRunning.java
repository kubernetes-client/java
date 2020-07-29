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
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import org.joda.time.DateTime;

/** ContainerStateRunning is a running state of a container. */
@ApiModel(description = "ContainerStateRunning is a running state of a container.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-07-29T18:17:00.375Z[Etc/UTC]")
public class V1ContainerStateRunning {
  public static final String SERIALIZED_NAME_STARTED_AT = "startedAt";

  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private DateTime startedAt;

  public V1ContainerStateRunning startedAt(DateTime startedAt) {

    this.startedAt = startedAt;
    return this;
  }

  /**
   * Time at which the container was last (re-)started
   *
   * @return startedAt
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time at which the container was last (re-)started")
  public DateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(DateTime startedAt) {
    this.startedAt = startedAt;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerStateRunning v1ContainerStateRunning = (V1ContainerStateRunning) o;
    return Objects.equals(this.startedAt, v1ContainerStateRunning.startedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerStateRunning {\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
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
