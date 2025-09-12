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
import io.kubernetes.client.openapi.models.V1ContainerRestartRuleOnExitCodes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ContainerRestartRule describes how a container exit is handled.
 */
@ApiModel(description = "ContainerRestartRule describes how a container exit is handled.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T23:11:52.603861Z[Etc/UTC]")
public class V1ContainerRestartRule {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_EXIT_CODES = "exitCodes";
  @SerializedName(SERIALIZED_NAME_EXIT_CODES)
  private V1ContainerRestartRuleOnExitCodes exitCodes;


  public V1ContainerRestartRule action(String action) {

    this.action = action;
    return this;
  }

   /**
   * Specifies the action taken on a container exit if the requirements are satisfied. The only possible value is \&quot;Restart\&quot; to restart the container.
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Specifies the action taken on a container exit if the requirements are satisfied. The only possible value is \"Restart\" to restart the container.")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public V1ContainerRestartRule exitCodes(V1ContainerRestartRuleOnExitCodes exitCodes) {

    this.exitCodes = exitCodes;
    return this;
  }

   /**
   * Get exitCodes
   * @return exitCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ContainerRestartRuleOnExitCodes getExitCodes() {
    return exitCodes;
  }


  public void setExitCodes(V1ContainerRestartRuleOnExitCodes exitCodes) {
    this.exitCodes = exitCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerRestartRule v1ContainerRestartRule = (V1ContainerRestartRule) o;
    return Objects.equals(this.action, v1ContainerRestartRule.action) &&
        Objects.equals(this.exitCodes, v1ContainerRestartRule.exitCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, exitCodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerRestartRule {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    exitCodes: ").append(toIndentedString(exitCodes)).append("\n");
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
