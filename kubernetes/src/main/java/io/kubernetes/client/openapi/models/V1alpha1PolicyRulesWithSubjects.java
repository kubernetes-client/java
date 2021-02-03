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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test
 * considers the subject making the request, the verb being requested, and the resource to be acted
 * upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member
 * of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules
 * matches the request.
 */
@ApiModel(
    description =
        "PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-01-04T09:55:14.976Z[Etc/UTC]")
public class V1alpha1PolicyRulesWithSubjects {
  public static final String SERIALIZED_NAME_NON_RESOURCE_RULES = "nonResourceRules";

  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_RULES)
  private List<V1alpha1NonResourcePolicyRule> nonResourceRules = null;

  public static final String SERIALIZED_NAME_RESOURCE_RULES = "resourceRules";

  @SerializedName(SERIALIZED_NAME_RESOURCE_RULES)
  private List<V1alpha1ResourcePolicyRule> resourceRules = null;

  public static final String SERIALIZED_NAME_SUBJECTS = "subjects";

  @SerializedName(SERIALIZED_NAME_SUBJECTS)
  private List<FlowcontrolV1alpha1Subject> subjects = new ArrayList<>();

  public V1alpha1PolicyRulesWithSubjects nonResourceRules(
      List<V1alpha1NonResourcePolicyRule> nonResourceRules) {

    this.nonResourceRules = nonResourceRules;
    return this;
  }

  public V1alpha1PolicyRulesWithSubjects addNonResourceRulesItem(
      V1alpha1NonResourcePolicyRule nonResourceRulesItem) {
    if (this.nonResourceRules == null) {
      this.nonResourceRules = new ArrayList<>();
    }
    this.nonResourceRules.add(nonResourceRulesItem);
    return this;
  }

  /**
   * &#x60;nonResourceRules&#x60; is a list of NonResourcePolicyRules that identify matching
   * requests according to their verb and the target non-resource URL.
   *
   * @return nonResourceRules
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "`nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.")
  public List<V1alpha1NonResourcePolicyRule> getNonResourceRules() {
    return nonResourceRules;
  }

  public void setNonResourceRules(List<V1alpha1NonResourcePolicyRule> nonResourceRules) {
    this.nonResourceRules = nonResourceRules;
  }

  public V1alpha1PolicyRulesWithSubjects resourceRules(
      List<V1alpha1ResourcePolicyRule> resourceRules) {

    this.resourceRules = resourceRules;
    return this;
  }

  public V1alpha1PolicyRulesWithSubjects addResourceRulesItem(
      V1alpha1ResourcePolicyRule resourceRulesItem) {
    if (this.resourceRules == null) {
      this.resourceRules = new ArrayList<>();
    }
    this.resourceRules.add(resourceRulesItem);
    return this;
  }

  /**
   * &#x60;resourceRules&#x60; is a slice of ResourcePolicyRules that identify matching requests
   * according to their verb and the target resource. At least one of &#x60;resourceRules&#x60; and
   * &#x60;nonResourceRules&#x60; has to be non-empty.
   *
   * @return resourceRules
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "`resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.")
  public List<V1alpha1ResourcePolicyRule> getResourceRules() {
    return resourceRules;
  }

  public void setResourceRules(List<V1alpha1ResourcePolicyRule> resourceRules) {
    this.resourceRules = resourceRules;
  }

  public V1alpha1PolicyRulesWithSubjects subjects(List<FlowcontrolV1alpha1Subject> subjects) {

    this.subjects = subjects;
    return this;
  }

  public V1alpha1PolicyRulesWithSubjects addSubjectsItem(FlowcontrolV1alpha1Subject subjectsItem) {
    this.subjects.add(subjectsItem);
    return this;
  }

  /**
   * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There
   * must be at least one member in this slice. A slice that includes both the system:authenticated
   * and system:unauthenticated user groups matches every request. Required.
   *
   * @return subjects
   */
  @ApiModelProperty(
      required = true,
      value =
          "subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.")
  public List<FlowcontrolV1alpha1Subject> getSubjects() {
    return subjects;
  }

  public void setSubjects(List<FlowcontrolV1alpha1Subject> subjects) {
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
    V1alpha1PolicyRulesWithSubjects v1alpha1PolicyRulesWithSubjects =
        (V1alpha1PolicyRulesWithSubjects) o;
    return Objects.equals(this.nonResourceRules, v1alpha1PolicyRulesWithSubjects.nonResourceRules)
        && Objects.equals(this.resourceRules, v1alpha1PolicyRulesWithSubjects.resourceRules)
        && Objects.equals(this.subjects, v1alpha1PolicyRulesWithSubjects.subjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonResourceRules, resourceRules, subjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PolicyRulesWithSubjects {\n");
    sb.append("    nonResourceRules: ").append(toIndentedString(nonResourceRules)).append("\n");
    sb.append("    resourceRules: ").append(toIndentedString(resourceRules)).append("\n");
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
