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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** CronJobStatus represents the current state of a cron job. */
@ApiModel(description = "CronJobStatus represents the current state of a cron job.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1CronJobStatus {
  public static final String SERIALIZED_NAME_ACTIVE = "active";

  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private List<V1ObjectReference> active = null;

  public static final String SERIALIZED_NAME_LAST_SCHEDULE_TIME = "lastScheduleTime";

  @SerializedName(SERIALIZED_NAME_LAST_SCHEDULE_TIME)
  private OffsetDateTime lastScheduleTime;

  public static final String SERIALIZED_NAME_LAST_SUCCESSFUL_TIME = "lastSuccessfulTime";

  @SerializedName(SERIALIZED_NAME_LAST_SUCCESSFUL_TIME)
  private OffsetDateTime lastSuccessfulTime;

  public V1CronJobStatus active(List<V1ObjectReference> active) {

    this.active = active;
    return this;
  }

  public V1CronJobStatus addActiveItem(V1ObjectReference activeItem) {
    if (this.active == null) {
      this.active = new ArrayList<>();
    }
    this.active.add(activeItem);
    return this;
  }

  /**
   * A list of pointers to currently running jobs.
   *
   * @return active
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of pointers to currently running jobs.")
  public List<V1ObjectReference> getActive() {
    return active;
  }

  public void setActive(List<V1ObjectReference> active) {
    this.active = active;
  }

  public V1CronJobStatus lastScheduleTime(OffsetDateTime lastScheduleTime) {

    this.lastScheduleTime = lastScheduleTime;
    return this;
  }

  /**
   * Information when was the last time the job was successfully scheduled.
   *
   * @return lastScheduleTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Information when was the last time the job was successfully scheduled.")
  public OffsetDateTime getLastScheduleTime() {
    return lastScheduleTime;
  }

  public void setLastScheduleTime(OffsetDateTime lastScheduleTime) {
    this.lastScheduleTime = lastScheduleTime;
  }

  public V1CronJobStatus lastSuccessfulTime(OffsetDateTime lastSuccessfulTime) {

    this.lastSuccessfulTime = lastSuccessfulTime;
    return this;
  }

  /**
   * Information when was the last time the job successfully completed.
   *
   * @return lastSuccessfulTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information when was the last time the job successfully completed.")
  public OffsetDateTime getLastSuccessfulTime() {
    return lastSuccessfulTime;
  }

  public void setLastSuccessfulTime(OffsetDateTime lastSuccessfulTime) {
    this.lastSuccessfulTime = lastSuccessfulTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CronJobStatus v1CronJobStatus = (V1CronJobStatus) o;
    return Objects.equals(this.active, v1CronJobStatus.active)
        && Objects.equals(this.lastScheduleTime, v1CronJobStatus.lastScheduleTime)
        && Objects.equals(this.lastSuccessfulTime, v1CronJobStatus.lastSuccessfulTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, lastScheduleTime, lastSuccessfulTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CronJobStatus {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    lastScheduleTime: ").append(toIndentedString(lastScheduleTime)).append("\n");
    sb.append("    lastSuccessfulTime: ").append(toIndentedString(lastSuccessfulTime)).append("\n");
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
