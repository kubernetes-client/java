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

/**
 * RuntimeClass defines a class of container runtime supported in the cluster. The RuntimeClass is
 * used to determine which container runtime is used to run all containers in a pod. RuntimeClasses
 * are manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet
 * is responsible for resolving the RuntimeClassName reference before running the pod. For more
 * details, see https://kubernetes.io/docs/concepts/containers/runtime-class/
 */
@ApiModel(
    description =
        "RuntimeClass defines a class of container runtime supported in the cluster. The RuntimeClass is used to determine which container runtime is used to run all containers in a pod. RuntimeClasses are manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName reference before running the pod.  For more details, see https://kubernetes.io/docs/concepts/containers/runtime-class/")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1RuntimeClass implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_HANDLER = "handler";

  @SerializedName(SERIALIZED_NAME_HANDLER)
  private String handler;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_OVERHEAD = "overhead";

  @SerializedName(SERIALIZED_NAME_OVERHEAD)
  private V1Overhead overhead;

  public static final String SERIALIZED_NAME_SCHEDULING = "scheduling";

  @SerializedName(SERIALIZED_NAME_SCHEDULING)
  private V1Scheduling scheduling;

  public V1RuntimeClass apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should
   * convert recognized schemas to the latest internal value, and may reject unrecognized values.
   * More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   *
   * @return apiVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1RuntimeClass handler(String handler) {

    this.handler = handler;
    return this;
  }

  /**
   * Handler specifies the underlying runtime and configuration that the CRI implementation will use
   * to handle pods of this class. The possible values are specific to the node &amp; CRI
   * configuration. It is assumed that all handlers are available on every node, and handlers of the
   * same name are equivalent on every node. For example, a handler called \&quot;runc\&quot; might
   * specify that the runc OCI runtime (using native Linux containers) will be used to run the
   * containers in a pod. The Handler must be lowercase, conform to the DNS Label (RFC 1123)
   * requirements, and is immutable.
   *
   * @return handler
   */
  @ApiModelProperty(
      required = true,
      value =
          "Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called \"runc\" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.")
  public String getHandler() {
    return handler;
  }

  public void setHandler(String handler) {
    this.handler = handler;
  }

  public V1RuntimeClass kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer
   * this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More
   * info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   *
   * @return kind
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1RuntimeClass metadata(V1ObjectMeta metadata) {

    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   *
   * @return metadata
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1RuntimeClass overhead(V1Overhead overhead) {

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
  public V1Overhead getOverhead() {
    return overhead;
  }

  public void setOverhead(V1Overhead overhead) {
    this.overhead = overhead;
  }

  public V1RuntimeClass scheduling(V1Scheduling scheduling) {

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
  public V1Scheduling getScheduling() {
    return scheduling;
  }

  public void setScheduling(V1Scheduling scheduling) {
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
    V1RuntimeClass v1RuntimeClass = (V1RuntimeClass) o;
    return Objects.equals(this.apiVersion, v1RuntimeClass.apiVersion)
        && Objects.equals(this.handler, v1RuntimeClass.handler)
        && Objects.equals(this.kind, v1RuntimeClass.kind)
        && Objects.equals(this.metadata, v1RuntimeClass.metadata)
        && Objects.equals(this.overhead, v1RuntimeClass.overhead)
        && Objects.equals(this.scheduling, v1RuntimeClass.scheduling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, handler, kind, metadata, overhead, scheduling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RuntimeClass {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    overhead: ").append(toIndentedString(overhead)).append("\n");
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
