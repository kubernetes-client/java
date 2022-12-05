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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RoleBinding references a role, but does not contain it. It can reference a Role in the same
 * namespace or a ClusterRole in the global namespace. It adds who information via Subjects and
 * namespace information by which namespace it exists in. RoleBindings in a given namespace only
 * have effect in that namespace.
 */
@ApiModel(
    description =
        "RoleBinding references a role, but does not contain it.  It can reference a Role in the same namespace or a ClusterRole in the global namespace. It adds who information via Subjects and namespace information by which namespace it exists in.  RoleBindings in a given namespace only have effect in that namespace.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1RoleBinding implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_ROLE_REF = "roleRef";

  @SerializedName(SERIALIZED_NAME_ROLE_REF)
  private V1RoleRef roleRef;

  public static final String SERIALIZED_NAME_SUBJECTS = "subjects";

  @SerializedName(SERIALIZED_NAME_SUBJECTS)
  private List<V1Subject> subjects = null;

  public V1RoleBinding apiVersion(String apiVersion) {

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

  public V1RoleBinding kind(String kind) {

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

  public V1RoleBinding metadata(V1ObjectMeta metadata) {

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

  public V1RoleBinding roleRef(V1RoleRef roleRef) {

    this.roleRef = roleRef;
    return this;
  }

  /**
   * Get roleRef
   *
   * @return roleRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1RoleRef getRoleRef() {
    return roleRef;
  }

  public void setRoleRef(V1RoleRef roleRef) {
    this.roleRef = roleRef;
  }

  public V1RoleBinding subjects(List<V1Subject> subjects) {

    this.subjects = subjects;
    return this;
  }

  public V1RoleBinding addSubjectsItem(V1Subject subjectsItem) {
    if (this.subjects == null) {
      this.subjects = new ArrayList<>();
    }
    this.subjects.add(subjectsItem);
    return this;
  }

  /**
   * Subjects holds references to the objects the role applies to.
   *
   * @return subjects
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subjects holds references to the objects the role applies to.")
  public List<V1Subject> getSubjects() {
    return subjects;
  }

  public void setSubjects(List<V1Subject> subjects) {
    this.subjects = subjects;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1RoleBinding v1RoleBinding = (V1RoleBinding) o;
    return Objects.equals(this.apiVersion, v1RoleBinding.apiVersion)
        && Objects.equals(this.kind, v1RoleBinding.kind)
        && Objects.equals(this.metadata, v1RoleBinding.metadata)
        && Objects.equals(this.roleRef, v1RoleBinding.roleRef)
        && Objects.equals(this.subjects, v1RoleBinding.subjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, roleRef, subjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RoleBinding {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    roleRef: ").append(toIndentedString(roleRef)).append("\n");
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
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
