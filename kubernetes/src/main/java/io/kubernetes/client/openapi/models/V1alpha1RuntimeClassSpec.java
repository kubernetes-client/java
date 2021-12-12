/*
Copyright 2021 The Kubernetes Authors.
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

/**
 * RuntimeClassSpec is a specification of a RuntimeClass. It contains parameters that are required
 * to describe the RuntimeClass to the Container Runtime Interface (CRI) implementation, as well as
 * any other components that need to understand how the pod will be run. The RuntimeClassSpec is
 * immutable.
 */
@ApiModel(
    description =
        "RuntimeClassSpec is a specification of a RuntimeClass. It contains parameters that are required to describe the RuntimeClass to the Container Runtime Interface (CRI) implementation, as well as any other components that need to understand how the pod will be run. The RuntimeClassSpec is immutable.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1alpha1RuntimeClassSpec {
  public static final String SERIALIZED_NAME_OVERHEAD = "overhead";

  @SerializedName(SERIALIZED_NAME_OVERHEAD)
  private V1alpha1Overhead overhead;

  public static final String SERIALIZED_NAME_RUNTIME_HANDLER = "runtimeHandler";

  @SerializedName(SERIALIZED_NAME_RUNTIME_HANDLER)
  private String runtimeHandler;

  public static final String SERIALIZED_NAME_SCHEDULING = "scheduling";

  @SerializedName(SERIALIZED_NAME_SCHEDULING)
  private V1alpha1Scheduling scheduling;

  public V1alpha1RuntimeClassSpec overhead(V1alpha1Overhead overhead) {

    this.overhead = overhead;
    return this;
  }

  /**
   * Get overhead
   *
   * @return overhead
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha1Overhead getOverhead() {
    return overhead;
  }

  public void setOverhead(V1alpha1Overhead overhead) {
    this.overhead = overhead;
  }

  public V1alpha1RuntimeClassSpec runtimeHandler(String runtimeHandler) {

    this.runtimeHandler = runtimeHandler;
    return this;
  }

  /**
   * RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation
   * will use to handle pods of this class. The possible values are specific to the node &amp; CRI
   * configuration. It is assumed that all handlers are available on every node, and handlers of the
   * same name are equivalent on every node. For example, a handler called \&quot;runc\&quot; might
   * specify that the runc OCI runtime (using native Linux containers) will be used to run the
   * containers in a pod. The RuntimeHandler must be lowercase, conform to the DNS Label (RFC 1123)
   * requirements, and is immutable.
   *
   * @return runtimeHandler
   */
  @ApiModelProperty(
      required = true,
      value =
          "RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called \"runc\" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.")
  public String getRuntimeHandler() {
    return runtimeHandler;
  }

  public void setRuntimeHandler(String runtimeHandler) {
    this.runtimeHandler = runtimeHandler;
  }

  public V1alpha1RuntimeClassSpec scheduling(V1alpha1Scheduling scheduling) {

    this.scheduling = scheduling;
    return this;
  }

  /**
   * Get scheduling
   *
   * @return scheduling
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha1Scheduling getScheduling() {
    return scheduling;
  }

  public void setScheduling(V1alpha1Scheduling scheduling) {
    this.scheduling = scheduling;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RuntimeClassSpec v1alpha1RuntimeClassSpec = (V1alpha1RuntimeClassSpec) o;
    return Objects.equals(this.overhead, v1alpha1RuntimeClassSpec.overhead)
        && Objects.equals(this.runtimeHandler, v1alpha1RuntimeClassSpec.runtimeHandler)
        && Objects.equals(this.scheduling, v1alpha1RuntimeClassSpec.scheduling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overhead, runtimeHandler, scheduling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RuntimeClassSpec {\n");
    sb.append("    overhead: ").append(toIndentedString(overhead)).append("\n");
    sb.append("    runtimeHandler: ").append(toIndentedString(runtimeHandler)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
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
