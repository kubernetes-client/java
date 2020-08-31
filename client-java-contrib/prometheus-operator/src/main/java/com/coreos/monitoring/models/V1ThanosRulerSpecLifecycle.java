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
import java.util.Objects;

/**
 * Actions that the management system should take in response to container lifecycle events. Cannot
 * be updated.
 */
@ApiModel(
    description =
        "Actions that the management system should take in response to container lifecycle events. Cannot be updated.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecLifecycle {
  public static final String SERIALIZED_NAME_POST_START = "postStart";

  @SerializedName(SERIALIZED_NAME_POST_START)
  private V1ThanosRulerSpecLifecyclePostStart postStart;

  public static final String SERIALIZED_NAME_PRE_STOP = "preStop";

  @SerializedName(SERIALIZED_NAME_PRE_STOP)
  private V1ThanosRulerSpecLifecyclePreStop preStop;

  public V1ThanosRulerSpecLifecycle postStart(V1ThanosRulerSpecLifecyclePostStart postStart) {

    this.postStart = postStart;
    return this;
  }

  /**
   * Get postStart
   *
   * @return postStart
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecLifecyclePostStart getPostStart() {
    return postStart;
  }

  public void setPostStart(V1ThanosRulerSpecLifecyclePostStart postStart) {
    this.postStart = postStart;
  }

  public V1ThanosRulerSpecLifecycle preStop(V1ThanosRulerSpecLifecyclePreStop preStop) {

    this.preStop = preStop;
    return this;
  }

  /**
   * Get preStop
   *
   * @return preStop
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecLifecyclePreStop getPreStop() {
    return preStop;
  }

  public void setPreStop(V1ThanosRulerSpecLifecyclePreStop preStop) {
    this.preStop = preStop;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecLifecycle v1ThanosRulerSpecLifecycle = (V1ThanosRulerSpecLifecycle) o;
    return Objects.equals(this.postStart, v1ThanosRulerSpecLifecycle.postStart)
        && Objects.equals(this.preStop, v1ThanosRulerSpecLifecycle.preStop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postStart, preStop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecLifecycle {\n");
    sb.append("    postStart: ").append(toIndentedString(postStart)).append("\n");
    sb.append("    preStop: ").append(toIndentedString(preStop)).append("\n");
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
