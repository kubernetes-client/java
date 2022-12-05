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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the
 * fieldset applies to.
 */
@ApiModel(
    description =
        "ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ManagedFieldsEntry {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_FIELDS_TYPE = "fieldsType";

  @SerializedName(SERIALIZED_NAME_FIELDS_TYPE)
  private String fieldsType;

  public static final String SERIALIZED_NAME_FIELDS_V1 = "fieldsV1";

  @SerializedName(SERIALIZED_NAME_FIELDS_V1)
  private Object fieldsV1;

  public static final String SERIALIZED_NAME_MANAGER = "manager";

  @SerializedName(SERIALIZED_NAME_MANAGER)
  private String manager;

  public static final String SERIALIZED_NAME_OPERATION = "operation";

  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_SUBRESOURCE = "subresource";

  @SerializedName(SERIALIZED_NAME_SUBRESOURCE)
  private String subresource;

  public static final String SERIALIZED_NAME_TIME = "time";

  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;

  public V1ManagedFieldsEntry apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the version of this resource that this field set applies to. The format is
   * \&quot;group/version\&quot; just like the top-level APIVersion field. It is necessary to track
   * the version of a field set because it cannot be automatically converted.
   *
   * @return apiVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "APIVersion defines the version of this resource that this field set applies to. The format is \"group/version\" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1ManagedFieldsEntry fieldsType(String fieldsType) {

    this.fieldsType = fieldsType;
    return this;
  }

  /**
   * FieldsType is the discriminator for the different fields format and version. There is currently
   * only one possible value: \&quot;FieldsV1\&quot;
   *
   * @return fieldsType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: \"FieldsV1\"")
  public String getFieldsType() {
    return fieldsType;
  }

  public void setFieldsType(String fieldsType) {
    this.fieldsType = fieldsType;
  }

  public V1ManagedFieldsEntry fieldsV1(Object fieldsV1) {

    this.fieldsV1 = fieldsV1;
    return this;
  }

  /**
   * FieldsV1 holds the first JSON version format as described in the \&quot;FieldsV1\&quot; type.
   *
   * @return fieldsV1
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "FieldsV1 holds the first JSON version format as described in the \"FieldsV1\" type.")
  public Object getFieldsV1() {
    return fieldsV1;
  }

  public void setFieldsV1(Object fieldsV1) {
    this.fieldsV1 = fieldsV1;
  }

  public V1ManagedFieldsEntry manager(String manager) {

    this.manager = manager;
    return this;
  }

  /**
   * Manager is an identifier of the workflow managing these fields.
   *
   * @return manager
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manager is an identifier of the workflow managing these fields.")
  public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  public V1ManagedFieldsEntry operation(String operation) {

    this.operation = operation;
    return this;
  }

  /**
   * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The
   * only valid values for this field are &#39;Apply&#39; and &#39;Update&#39;.
   *
   * @return operation
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public V1ManagedFieldsEntry subresource(String subresource) {

    this.subresource = subresource;
    return this;
  }

  /**
   * Subresource is the name of the subresource used to update that object, or empty string if the
   * object was updated through the main resource. The value of this field is used to distinguish
   * between managers, even if they share the same name. For example, a status update will be
   * distinct from a regular update using the same manager name. Note that the APIVersion field is
   * not related to the Subresource field and it always corresponds to the version of the main
   * resource.
   *
   * @return subresource
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.")
  public String getSubresource() {
    return subresource;
  }

  public void setSubresource(String subresource) {
    this.subresource = subresource;
  }

  public V1ManagedFieldsEntry time(OffsetDateTime time) {

    this.time = time;
    return this;
  }

  /**
   * Time is the timestamp of when the ManagedFields entry was added. The timestamp will also be
   * updated if a field is added, the manager changes any of the owned fields value or removes a
   * field. The timestamp does not update when a field is removed from the entry because another
   * manager took it over.
   *
   * @return time
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Time is the timestamp of when the ManagedFields entry was added. The timestamp will also be updated if a field is added, the manager changes any of the owned fields value or removes a field. The timestamp does not update when a field is removed from the entry because another manager took it over.")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ManagedFieldsEntry v1ManagedFieldsEntry = (V1ManagedFieldsEntry) o;
    return Objects.equals(this.apiVersion, v1ManagedFieldsEntry.apiVersion)
        && Objects.equals(this.fieldsType, v1ManagedFieldsEntry.fieldsType)
        && Objects.equals(this.fieldsV1, v1ManagedFieldsEntry.fieldsV1)
        && Objects.equals(this.manager, v1ManagedFieldsEntry.manager)
        && Objects.equals(this.operation, v1ManagedFieldsEntry.operation)
        && Objects.equals(this.subresource, v1ManagedFieldsEntry.subresource)
        && Objects.equals(this.time, v1ManagedFieldsEntry.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, fieldsType, fieldsV1, manager, operation, subresource, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ManagedFieldsEntry {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldsType: ").append(toIndentedString(fieldsType)).append("\n");
    sb.append("    fieldsV1: ").append(toIndentedString(fieldsV1)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    subresource: ").append(toIndentedString(subresource)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
