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

/** CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition */
@ApiModel(
    description =
        "CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1CustomResourceDefinitionStatus {
  public static final String SERIALIZED_NAME_ACCEPTED_NAMES = "acceptedNames";

  @SerializedName(SERIALIZED_NAME_ACCEPTED_NAMES)
  private V1CustomResourceDefinitionNames acceptedNames;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1CustomResourceDefinitionCondition> conditions = null;

  public static final String SERIALIZED_NAME_STORED_VERSIONS = "storedVersions";

  @SerializedName(SERIALIZED_NAME_STORED_VERSIONS)
  private List<String> storedVersions = null;

  public V1CustomResourceDefinitionStatus acceptedNames(
      V1CustomResourceDefinitionNames acceptedNames) {

    this.acceptedNames = acceptedNames;
    return this;
  }

  /**
   * Get acceptedNames
   *
   * @return acceptedNames
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1CustomResourceDefinitionNames getAcceptedNames() {
    return acceptedNames;
  }

  public void setAcceptedNames(V1CustomResourceDefinitionNames acceptedNames) {
    this.acceptedNames = acceptedNames;
  }

  public V1CustomResourceDefinitionStatus conditions(
      List<V1CustomResourceDefinitionCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1CustomResourceDefinitionStatus addConditionsItem(
      V1CustomResourceDefinitionCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * conditions indicate state for particular aspects of a CustomResourceDefinition
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "conditions indicate state for particular aspects of a CustomResourceDefinition")
  public List<V1CustomResourceDefinitionCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1CustomResourceDefinitionCondition> conditions) {
    this.conditions = conditions;
  }

  public V1CustomResourceDefinitionStatus storedVersions(List<String> storedVersions) {

    this.storedVersions = storedVersions;
    return this;
  }

  public V1CustomResourceDefinitionStatus addStoredVersionsItem(String storedVersionsItem) {
    if (this.storedVersions == null) {
      this.storedVersions = new ArrayList<>();
    }
    this.storedVersions.add(storedVersionsItem);
    return this;
  }

  /**
   * storedVersions lists all versions of CustomResources that were ever persisted. Tracking these
   * versions allows a migration path for stored versions in etcd. The field is mutable so a
   * migration controller can finish a migration to another version (ensuring no old objects are
   * left in storage), and then remove the rest of the versions from this list. Versions may not be
   * removed from &#x60;spec.versions&#x60; while they exist in this list.
   *
   * @return storedVersions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from `spec.versions` while they exist in this list.")
  public List<String> getStoredVersions() {
    return storedVersions;
  }

  public void setStoredVersions(List<String> storedVersions) {
    this.storedVersions = storedVersions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CustomResourceDefinitionStatus v1CustomResourceDefinitionStatus =
        (V1CustomResourceDefinitionStatus) o;
    return Objects.equals(this.acceptedNames, v1CustomResourceDefinitionStatus.acceptedNames)
        && Objects.equals(this.conditions, v1CustomResourceDefinitionStatus.conditions)
        && Objects.equals(this.storedVersions, v1CustomResourceDefinitionStatus.storedVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedNames, conditions, storedVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceDefinitionStatus {\n");
    sb.append("    acceptedNames: ").append(toIndentedString(acceptedNames)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    storedVersions: ").append(toIndentedString(storedVersions)).append("\n");
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
