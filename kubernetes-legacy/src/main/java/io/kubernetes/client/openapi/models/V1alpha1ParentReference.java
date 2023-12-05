/*
Copyright 2023 The Kubernetes Authors.
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ParentReference describes a reference to a parent object.
 */
@ApiModel(description = "ParentReference describes a reference to a parent object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1alpha1ParentReference {
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

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;


  public V1alpha1ParentReference group(String group) {

    this.group = group;
    return this;
  }

   /**
   * Group is the group of the object being referenced.
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group is the group of the object being referenced.")

  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public V1alpha1ParentReference name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Name is the name of the object being referenced.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name is the name of the object being referenced.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ParentReference namespace(String namespace) {

    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace is the namespace of the object being referenced.
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Namespace is the namespace of the object being referenced.")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public V1alpha1ParentReference resource(String resource) {

    this.resource = resource;
    return this;
  }

   /**
   * Resource is the resource of the object being referenced.
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resource is the resource of the object being referenced.")

  public String getResource() {
    return resource;
  }


  public void setResource(String resource) {
    this.resource = resource;
  }


  public V1alpha1ParentReference uid(String uid) {

    this.uid = uid;
    return this;
  }

   /**
   * UID is the uid of the object being referenced.
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UID is the uid of the object being referenced.")

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
    V1alpha1ParentReference v1alpha1ParentReference = (V1alpha1ParentReference) o;
    return Objects.equals(this.group, v1alpha1ParentReference.group) &&
        Objects.equals(this.name, v1alpha1ParentReference.name) &&
        Objects.equals(this.namespace, v1alpha1ParentReference.namespace) &&
        Objects.equals(this.resource, v1alpha1ParentReference.resource) &&
        Objects.equals(this.uid, v1alpha1ParentReference.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, name, namespace, resource, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ParentReference {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
