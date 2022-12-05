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

/** SubjectAccessReviewStatus */
@ApiModel(description = "SubjectAccessReviewStatus")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1SubjectAccessReviewStatus {
  public static final String SERIALIZED_NAME_ALLOWED = "allowed";

  @SerializedName(SERIALIZED_NAME_ALLOWED)
  private Boolean allowed;

  public static final String SERIALIZED_NAME_DENIED = "denied";

  @SerializedName(SERIALIZED_NAME_DENIED)
  private Boolean denied;

  public static final String SERIALIZED_NAME_EVALUATION_ERROR = "evaluationError";

  @SerializedName(SERIALIZED_NAME_EVALUATION_ERROR)
  private String evaluationError;

  public static final String SERIALIZED_NAME_REASON = "reason";

  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public V1SubjectAccessReviewStatus allowed(Boolean allowed) {

    this.allowed = allowed;
    return this;
  }

  /**
   * Allowed is required. True if the action would be allowed, false otherwise.
   *
   * @return allowed
   */
  @ApiModelProperty(
      required = true,
      value = "Allowed is required. True if the action would be allowed, false otherwise.")
  public Boolean getAllowed() {
    return allowed;
  }

  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }

  public V1SubjectAccessReviewStatus denied(Boolean denied) {

    this.denied = denied;
    return this;
  }

  /**
   * Denied is optional. True if the action would be denied, otherwise false. If both allowed is
   * false and denied is false, then the authorizer has no opinion on whether to authorize the
   * action. Denied may not be true if Allowed is true.
   *
   * @return denied
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Denied is optional. True if the action would be denied, otherwise false. If both allowed is false and denied is false, then the authorizer has no opinion on whether to authorize the action. Denied may not be true if Allowed is true.")
  public Boolean getDenied() {
    return denied;
  }

  public void setDenied(Boolean denied) {
    this.denied = denied;
  }

  public V1SubjectAccessReviewStatus evaluationError(String evaluationError) {

    this.evaluationError = evaluationError;
    return this;
  }

  /**
   * EvaluationError is an indication that some error occurred during the authorization check. It is
   * entirely possible to get an error and be able to continue determine authorization status in
   * spite of it. For instance, RBAC can be missing a role, but enough roles are still present and
   * bound to reason about the request.
   *
   * @return evaluationError
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.")
  public String getEvaluationError() {
    return evaluationError;
  }

  public void setEvaluationError(String evaluationError) {
    this.evaluationError = evaluationError;
  }

  public V1SubjectAccessReviewStatus reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * Reason is optional. It indicates why a request was allowed or denied.
   *
   * @return reason
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Reason is optional.  It indicates why a request was allowed or denied.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SubjectAccessReviewStatus v1SubjectAccessReviewStatus = (V1SubjectAccessReviewStatus) o;
    return Objects.equals(this.allowed, v1SubjectAccessReviewStatus.allowed)
        && Objects.equals(this.denied, v1SubjectAccessReviewStatus.denied)
        && Objects.equals(this.evaluationError, v1SubjectAccessReviewStatus.evaluationError)
        && Objects.equals(this.reason, v1SubjectAccessReviewStatus.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, denied, evaluationError, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SubjectAccessReviewStatus {\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    denied: ").append(toIndentedString(denied)).append("\n");
    sb.append("    evaluationError: ").append(toIndentedString(evaluationError)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
