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
import java.util.Objects;

/** EventSource contains information for an event. */
@ApiModel(description = "EventSource contains information for an event.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1EventSource {
  public static final String SERIALIZED_NAME_COMPONENT = "component";

  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;

  public static final String SERIALIZED_NAME_HOST = "host";

  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public V1EventSource component(String component) {

    this.component = component;
    return this;
  }

  /**
   * Component from which the event is generated.
   *
   * @return component
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Component from which the event is generated.")
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public V1EventSource host(String host) {

    this.host = host;
    return this;
  }

  /**
   * Node name on which the event is generated.
   *
   * @return host
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Node name on which the event is generated.")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EventSource v1EventSource = (V1EventSource) o;
    return Objects.equals(this.component, v1EventSource.component)
        && Objects.equals(this.host, v1EventSource.host);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, host);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EventSource {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
