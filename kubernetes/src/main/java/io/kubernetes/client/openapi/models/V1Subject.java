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
 * Subject contains a reference to the object or user identities a role binding applies to. This can
 * either hold a direct API object reference, or a value for non-objects such as user and group
 * names.
 */
@ApiModel(
    description =
        "Subject contains a reference to the object or user identities a role binding applies to.  This can either hold a direct API object reference, or a value for non-objects such as user and group names.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1Subject {
  public static final String SERIALIZED_NAME_API_GROUP = "apiGroup";

  @SerializedName(SERIALIZED_NAME_API_GROUP)
  private String apiGroup;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";

  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public V1Subject apiGroup(String apiGroup) {

    this.apiGroup = apiGroup;
    return this;
  }

  /**
   * APIGroup holds the API group of the referenced subject. Defaults to \&quot;\&quot; for
   * ServiceAccount subjects. Defaults to \&quot;rbac.authorization.k8s.io\&quot; for User and Group
   * subjects.
   *
   * @return apiGroup
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "APIGroup holds the API group of the referenced subject. Defaults to \"\" for ServiceAccount subjects. Defaults to \"rbac.authorization.k8s.io\" for User and Group subjects.")
  public String getApiGroup() {
    return apiGroup;
  }

  public void setApiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
  }

  public V1Subject kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Kind of object being referenced. Values defined by this API group are \&quot;User\&quot;,
   * \&quot;Group\&quot;, and \&quot;ServiceAccount\&quot;. If the Authorizer does not recognized
   * the kind value, the Authorizer should report an error.
   *
   * @return kind
   */
  @ApiModelProperty(
      required = true,
      value =
          "Kind of object being referenced. Values defined by this API group are \"User\", \"Group\", and \"ServiceAccount\". If the Authorizer does not recognized the kind value, the Authorizer should report an error.")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1Subject name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name of the object being referenced.
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "Name of the object being referenced.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1Subject namespace(String namespace) {

    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace of the referenced object. If the object kind is non-namespace, such as
   * \&quot;User\&quot; or \&quot;Group\&quot;, and this value is not empty the Authorizer should
   * report an error.
   *
   * @return namespace
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Namespace of the referenced object.  If the object kind is non-namespace, such as \"User\" or \"Group\", and this value is not empty the Authorizer should report an error.")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Subject v1Subject = (V1Subject) o;
    return Objects.equals(this.apiGroup, v1Subject.apiGroup)
        && Objects.equals(this.kind, v1Subject.kind)
        && Objects.equals(this.name, v1Subject.name)
        && Objects.equals(this.namespace, v1Subject.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiGroup, kind, name, namespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Subject {\n");
    sb.append("    apiGroup: ").append(toIndentedString(apiGroup)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
