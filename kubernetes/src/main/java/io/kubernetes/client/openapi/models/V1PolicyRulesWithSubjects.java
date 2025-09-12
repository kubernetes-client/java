/*
Copyright 2025 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.FlowcontrolV1Subject;
import io.kubernetes.client.openapi.models.V1NonResourcePolicyRule;
import io.kubernetes.client.openapi.models.V1ResourcePolicyRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.
 */
@ApiModel(description = "PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T22:12:20.439480Z[Etc/UTC]")
public class V1PolicyRulesWithSubjects {
  public static final String SERIALIZED_NAME_NON_RESOURCE_RULES = "nonResourceRules";
  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_RULES)
  private List<V1NonResourcePolicyRule> nonResourceRules = null;

  public static final String SERIALIZED_NAME_RESOURCE_RULES = "resourceRules";
  @SerializedName(SERIALIZED_NAME_RESOURCE_RULES)
  private List<V1ResourcePolicyRule> resourceRules = null;

  public static final String SERIALIZED_NAME_SUBJECTS = "subjects";
  @SerializedName(SERIALIZED_NAME_SUBJECTS)
  private List<FlowcontrolV1Subject> subjects = new ArrayList<>();


  public V1PolicyRulesWithSubjects nonResourceRules(List<V1NonResourcePolicyRule> nonResourceRules) {

    this.nonResourceRules = nonResourceRules;
    return this;
  }

  public V1PolicyRulesWithSubjects addNonResourceRulesItem(V1NonResourcePolicyRule nonResourceRulesItem) {
    if (this.nonResourceRules == null) {
      this.nonResourceRules = new ArrayList<>();
    }
    this.nonResourceRules.add(nonResourceRulesItem);
    return this;
  }

   /**
   * &#x60;nonResourceRules&#x60; is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
   * @return nonResourceRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.")

  public List<V1NonResourcePolicyRule> getNonResourceRules() {
    return nonResourceRules;
  }


  public void setNonResourceRules(List<V1NonResourcePolicyRule> nonResourceRules) {
    this.nonResourceRules = nonResourceRules;
  }


  public V1PolicyRulesWithSubjects resourceRules(List<V1ResourcePolicyRule> resourceRules) {

    this.resourceRules = resourceRules;
    return this;
  }

  public V1PolicyRulesWithSubjects addResourceRulesItem(V1ResourcePolicyRule resourceRulesItem) {
    if (this.resourceRules == null) {
      this.resourceRules = new ArrayList<>();
    }
    this.resourceRules.add(resourceRulesItem);
    return this;
  }

   /**
   * &#x60;resourceRules&#x60; is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of &#x60;resourceRules&#x60; and &#x60;nonResourceRules&#x60; has to be non-empty.
   * @return resourceRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.")

  public List<V1ResourcePolicyRule> getResourceRules() {
    return resourceRules;
  }


  public void setResourceRules(List<V1ResourcePolicyRule> resourceRules) {
    this.resourceRules = resourceRules;
  }


  public V1PolicyRulesWithSubjects subjects(List<FlowcontrolV1Subject> subjects) {

    this.subjects = subjects;
    return this;
  }

  public V1PolicyRulesWithSubjects addSubjectsItem(FlowcontrolV1Subject subjectsItem) {
    this.subjects.add(subjectsItem);
    return this;
  }

   /**
   * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
   * @return subjects
  **/
  @ApiModelProperty(required = true, value = "subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.")

  public List<FlowcontrolV1Subject> getSubjects() {
    return subjects;
  }


  public void setSubjects(List<FlowcontrolV1Subject> subjects) {
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
    V1PolicyRulesWithSubjects v1PolicyRulesWithSubjects = (V1PolicyRulesWithSubjects) o;
    return Objects.equals(this.nonResourceRules, v1PolicyRulesWithSubjects.nonResourceRules) &&
        Objects.equals(this.resourceRules, v1PolicyRulesWithSubjects.resourceRules) &&
        Objects.equals(this.subjects, v1PolicyRulesWithSubjects.subjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonResourceRules, resourceRules, subjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PolicyRulesWithSubjects {\n");
    sb.append("    nonResourceRules: ").append(toIndentedString(nonResourceRules)).append("\n");
    sb.append("    resourceRules: ").append(toIndentedString(resourceRules)).append("\n");
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
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
