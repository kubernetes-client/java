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

/** ObjectReference contains enough information to let you inspect or modify the referred object. */
@ApiModel(
    description =
        "ObjectReference contains enough information to let you inspect or modify the referred object.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ObjectReference {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_FIELD_PATH = "fieldPath";

  @SerializedName(SERIALIZED_NAME_FIELD_PATH)
  private String fieldPath;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";

  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resourceVersion";

  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
  private String resourceVersion;

  public static final String SERIALIZED_NAME_UID = "uid";

  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public V1ObjectReference apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * API version of the referent.
   *
   * @return apiVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "API version of the referent.")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1ObjectReference fieldPath(String fieldPath) {

    this.fieldPath = fieldPath;
    return this;
  }

  /**
   * If referring to a piece of an object instead of an entire object, this string should contain a
   * valid JSON/Go field access statement, such as desiredState.manifest.containers[2]. For example,
   * if the object reference is to a container within a pod, this would take on a value like:
   * \&quot;spec.containers{name}\&quot; (where \&quot;name\&quot; refers to the name of the
   * container that triggered the event) or if no container name is specified
   * \&quot;spec.containers[2]\&quot; (container with index 2 in this pod). This syntax is chosen
   * only to have some well-defined way of referencing a part of an object.
   *
   * @return fieldPath
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If referring to a piece of an object instead of an entire object, this string should contain a valid JSON/Go field access statement, such as desiredState.manifest.containers[2]. For example, if the object reference is to a container within a pod, this would take on a value like: \"spec.containers{name}\" (where \"name\" refers to the name of the container that triggered the event) or if no container name is specified \"spec.containers[2]\" (container with index 2 in this pod). This syntax is chosen only to have some well-defined way of referencing a part of an object.")
  public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public V1ObjectReference kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Kind of the referent. More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   *
   * @return kind
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1ObjectReference name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name of the referent. More info:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ObjectReference namespace(String namespace) {

    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace of the referent. More info:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
   *
   * @return namespace
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Namespace of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public V1ObjectReference resourceVersion(String resourceVersion) {

    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * Specific resourceVersion to which this reference is made, if any. More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
   *
   * @return resourceVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Specific resourceVersion to which this reference is made, if any. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency")
  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public V1ObjectReference uid(String uid) {

    this.uid = uid;
    return this;
  }

  /**
   * UID of the referent. More info:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids
   *
   * @return uid
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ObjectReference v1ObjectReference = (V1ObjectReference) o;
    return Objects.equals(this.apiVersion, v1ObjectReference.apiVersion)
        && Objects.equals(this.fieldPath, v1ObjectReference.fieldPath)
        && Objects.equals(this.kind, v1ObjectReference.kind)
        && Objects.equals(this.name, v1ObjectReference.name)
        && Objects.equals(this.namespace, v1ObjectReference.namespace)
        && Objects.equals(this.resourceVersion, v1ObjectReference.resourceVersion)
        && Objects.equals(this.uid, v1ObjectReference.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, fieldPath, kind, name, namespace, resourceVersion, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ObjectReference {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
