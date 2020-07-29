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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Policy defines the configuration of how audit events are logged */
@ApiModel(description = "Policy defines the configuration of how audit events are logged")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-07-29T18:17:00.375Z[Etc/UTC]")
public class V1alpha1Policy {
  public static final String SERIALIZED_NAME_LEVEL = "level";

  @SerializedName(SERIALIZED_NAME_LEVEL)
  private String level;

  public static final String SERIALIZED_NAME_STAGES = "stages";

  @SerializedName(SERIALIZED_NAME_STAGES)
  private List<String> stages = null;

  public V1alpha1Policy level(String level) {

    this.level = level;
    return this;
  }

  /**
   * The Level that all requests are recorded at. available options: None, Metadata, Request,
   * RequestResponse required
   *
   * @return level
   */
  @ApiModelProperty(
      required = true,
      value =
          "The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public V1alpha1Policy stages(List<String> stages) {

    this.stages = stages;
    return this;
  }

  public V1alpha1Policy addStagesItem(String stagesItem) {
    if (this.stages == null) {
      this.stages = new ArrayList<String>();
    }
    this.stages.add(stagesItem);
    return this;
  }

  /**
   * Stages is a list of stages for which events are created.
   *
   * @return stages
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stages is a list of stages for which events are created.")
  public List<String> getStages() {
    return stages;
  }

  public void setStages(List<String> stages) {
    this.stages = stages;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1Policy v1alpha1Policy = (V1alpha1Policy) o;
    return Objects.equals(this.level, v1alpha1Policy.level)
        && Objects.equals(this.stages, v1alpha1Policy.stages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, stages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1Policy {\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
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
