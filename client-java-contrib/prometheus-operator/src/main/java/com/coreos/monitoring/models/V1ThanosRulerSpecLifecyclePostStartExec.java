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

/** One and only one of the following should be specified. Exec specifies the action to take. */
@ApiModel(
    description =
        "One and only one of the following should be specified. Exec specifies the action to take.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecLifecyclePostStartExec {
  public static final String SERIALIZED_NAME_COMMAND = "command";

  @SerializedName(SERIALIZED_NAME_COMMAND)
  private List<String> command = null;

  public V1ThanosRulerSpecLifecyclePostStartExec command(List<String> command) {

    this.command = command;
    return this;
  }

  public V1ThanosRulerSpecLifecyclePostStartExec addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<String>();
    }
    this.command.add(commandItem);
    return this;
  }

  /**
   * Command is the command line to execute inside the container, the working directory for the
   * command is root (&#39;/&#39;) in the container&#39;s filesystem. The command is simply
   * exec&#39;d, it is not run inside a shell, so traditional shell instructions (&#39;|&#39;, etc)
   * won&#39;t work. To use a shell, you need to explicitly call out to that shell. Exit status of 0
   * is treated as live/healthy and non-zero is unhealthy.
   *
   * @return command
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.")
  public List<String> getCommand() {
    return command;
  }

  public void setCommand(List<String> command) {
    this.command = command;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecLifecyclePostStartExec v1ThanosRulerSpecLifecyclePostStartExec =
        (V1ThanosRulerSpecLifecyclePostStartExec) o;
    return Objects.equals(this.command, v1ThanosRulerSpecLifecyclePostStartExec.command);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecLifecyclePostStartExec {\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
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
