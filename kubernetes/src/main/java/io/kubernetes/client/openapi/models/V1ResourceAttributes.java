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
 * ResourceAttributes includes the authorization attributes available for resource requests to the
 * Authorizer interface
 */
@ApiModel(
    description =
        "ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ResourceAttributes {
  public static final String SERIALIZED_NAME_GROUP = "group";

  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";

  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";

  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private String resource;

  public static final String SERIALIZED_NAME_SUBRESOURCE = "subresource";

  @SerializedName(SERIALIZED_NAME_SUBRESOURCE)
  private String subresource;

  public static final String SERIALIZED_NAME_VERB = "verb";

  @SerializedName(SERIALIZED_NAME_VERB)
  private String verb;

  public static final String SERIALIZED_NAME_VERSION = "version";

  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public V1ResourceAttributes group(String group) {

    this.group = group;
    return this;
  }

  /**
   * Group is the API Group of the Resource. \&quot;*\&quot; means all.
   *
   * @return group
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group is the API Group of the Resource.  \"*\" means all.")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public V1ResourceAttributes name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name is the name of the resource being requested for a \&quot;get\&quot; or deleted for a
   * \&quot;delete\&quot;. \&quot;\&quot; (empty) means all.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Name is the name of the resource being requested for a \"get\" or deleted for a \"delete\". \"\" (empty) means all.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ResourceAttributes namespace(String namespace) {

    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace is the namespace of the action being requested. Currently, there is no distinction
   * between no namespace and all namespaces \&quot;\&quot; (empty) is defaulted for
   * LocalSubjectAccessReviews \&quot;\&quot; (empty) is empty for cluster-scoped resources
   * \&quot;\&quot; (empty) means \&quot;all\&quot; for namespace scoped resources from a
   * SubjectAccessReview or SelfSubjectAccessReview
   *
   * @return namespace
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces \"\" (empty) is defaulted for LocalSubjectAccessReviews \"\" (empty) is empty for cluster-scoped resources \"\" (empty) means \"all\" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public V1ResourceAttributes resource(String resource) {

    this.resource = resource;
    return this;
  }

  /**
   * Resource is one of the existing resource types. \&quot;*\&quot; means all.
   *
   * @return resource
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resource is one of the existing resource types.  \"*\" means all.")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public V1ResourceAttributes subresource(String subresource) {

    this.subresource = subresource;
    return this;
  }

  /**
   * Subresource is one of the existing resource types. \&quot;\&quot; means none.
   *
   * @return subresource
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subresource is one of the existing resource types.  \"\" means none.")
  public String getSubresource() {
    return subresource;
  }

  public void setSubresource(String subresource) {
    this.subresource = subresource;
  }

  public V1ResourceAttributes verb(String verb) {

    this.verb = verb;
    return this;
  }

  /**
   * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.
   * \&quot;*\&quot; means all.
   *
   * @return verb
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  \"*\" means all.")
  public String getVerb() {
    return verb;
  }

  public void setVerb(String verb) {
    this.verb = verb;
  }

  public V1ResourceAttributes version(String version) {

    this.version = version;
    return this;
  }

  /**
   * Version is the API Version of the Resource. \&quot;*\&quot; means all.
   *
   * @return version
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version is the API Version of the Resource.  \"*\" means all.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceAttributes v1ResourceAttributes = (V1ResourceAttributes) o;
    return Objects.equals(this.group, v1ResourceAttributes.group)
        && Objects.equals(this.name, v1ResourceAttributes.name)
        && Objects.equals(this.namespace, v1ResourceAttributes.namespace)
        && Objects.equals(this.resource, v1ResourceAttributes.resource)
        && Objects.equals(this.subresource, v1ResourceAttributes.subresource)
        && Objects.equals(this.verb, v1ResourceAttributes.verb)
        && Objects.equals(this.version, v1ResourceAttributes.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, name, namespace, resource, subresource, verb, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceAttributes {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    subresource: ").append(toIndentedString(subresource)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
