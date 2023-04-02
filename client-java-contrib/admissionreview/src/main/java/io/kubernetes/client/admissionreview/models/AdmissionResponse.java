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
package io.kubernetes.client.admissionreview.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** AdmissionResponse describes an admission response. */
@ApiModel(description = "AdmissionResponse describes an admission response.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-07-01T14:30:02.888Z[Etc/UTC]")
public class AdmissionResponse {
  public static final String SERIALIZED_NAME_ALLOWED = "allowed";

  @SerializedName(SERIALIZED_NAME_ALLOWED)
  private Boolean allowed;

  public static final String SERIALIZED_NAME_AUDIT_ANNOTATIONS = "auditAnnotations";

  @SerializedName(SERIALIZED_NAME_AUDIT_ANNOTATIONS)
  private Map<String, String> auditAnnotations = null;

  public static final String SERIALIZED_NAME_PATCH = "patch";

  @SerializedName(SERIALIZED_NAME_PATCH)
  private byte[] patch;

  public static final String SERIALIZED_NAME_PATCH_TYPE = "patchType";

  @SerializedName(SERIALIZED_NAME_PATCH_TYPE)
  private String patchType;

  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  private Status status;

  public static final String SERIALIZED_NAME_UID = "uid";

  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";

  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<String> warnings = null;

  public AdmissionResponse allowed(Boolean allowed) {

    this.allowed = allowed;
    return this;
  }

  /**
   * Allowed indicates whether or not the admission request was permitted.
   *
   * @return allowed
   */
  @ApiModelProperty(
      required = true,
      value = "Allowed indicates whether or not the admission request was permitted.")
  public Boolean getAllowed() {
    return allowed;
  }

  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }

  public AdmissionResponse auditAnnotations(Map<String, String> auditAnnotations) {

    this.auditAnnotations = auditAnnotations;
    return this;
  }

  public AdmissionResponse putAuditAnnotationsItem(String key, String auditAnnotationsItem) {
    if (this.auditAnnotations == null) {
      this.auditAnnotations = new HashMap<String, String>();
    }
    this.auditAnnotations.put(key, auditAnnotationsItem);
    return this;
  }

  /**
   * AuditAnnotations is an unstructured key value map set by remote admission controller (e.g.
   * error&#x3D;image-blacklisted). MutatingAdmissionWebhook and ValidatingAdmissionWebhook
   * admission controller will prefix the keys with admission webhook name (e.g.
   * imagepolicy.example.com/error&#x3D;image-blacklisted). AuditAnnotations will be provided by the
   * admission webhook to add additional context to the audit log for this request.
   *
   * @return auditAnnotations
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "AuditAnnotations is an unstructured key value map set by remote admission controller (e.g. error=image-blacklisted). MutatingAdmissionWebhook and ValidatingAdmissionWebhook admission controller will prefix the keys with admission webhook name (e.g. imagepolicy.example.com/error=image-blacklisted). AuditAnnotations will be provided by the admission webhook to add additional context to the audit log for this request.")
  public Map<String, String> getAuditAnnotations() {
    return auditAnnotations;
  }

  public void setAuditAnnotations(Map<String, String> auditAnnotations) {
    this.auditAnnotations = auditAnnotations;
  }

  public AdmissionResponse patch(byte[] patch) {

    this.patch = patch;
    return this;
  }

  /**
   * The patch body. Currently we only support \&quot;JSONPatch\&quot; which implements RFC 6902.
   *
   * @return patch
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "The patch body. Currently we only support \"JSONPatch\" which implements RFC 6902.")
  public byte[] getPatch() {
    return patch;
  }

  public void setPatch(byte[] patch) {
    this.patch = patch;
  }

  public AdmissionResponse patchType(String patchType) {

    this.patchType = patchType;
    return this;
  }

  /**
   * The type of Patch. Currently we only allow \&quot;JSONPatch\&quot;.
   *
   * @return patchType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of Patch. Currently we only allow \"JSONPatch\".")
  public String getPatchType() {
    return patchType;
  }

  public void setPatchType(String patchType) {
    this.patchType = patchType;
  }

  public AdmissionResponse status(Status status) {

    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public AdmissionResponse uid(String uid) {

    this.uid = uid;
    return this;
  }

  /**
   * UID is an identifier for the individual request/response. This must be copied over from the
   * corresponding AdmissionRequest.
   *
   * @return uid
   */
  @ApiModelProperty(
      required = true,
      value =
          "UID is an identifier for the individual request/response. This must be copied over from the corresponding AdmissionRequest.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public AdmissionResponse warnings(List<String> warnings) {

    this.warnings = warnings;
    return this;
  }

  public AdmissionResponse addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<String>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * warnings is a list of warning messages to return to the requesting API client. Warning messages
   * describe a problem the client making the API request should correct or be aware of. Limit
   * warnings to 120 characters if possible. Warnings over 256 characters and large numbers of
   * warnings may be truncated.
   *
   * @return warnings
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "warnings is a list of warning messages to return to the requesting API client. Warning messages describe a problem the client making the API request should correct or be aware of. Limit warnings to 120 characters if possible. Warnings over 256 characters and large numbers of warnings may be truncated.")
  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdmissionResponse admissionResponse = (AdmissionResponse) o;
    return Objects.equals(this.allowed, admissionResponse.allowed)
        && Objects.equals(this.auditAnnotations, admissionResponse.auditAnnotations)
        && Arrays.equals(this.patch, admissionResponse.patch)
        && Objects.equals(this.patchType, admissionResponse.patchType)
        && Objects.equals(this.status, admissionResponse.status)
        && Objects.equals(this.uid, admissionResponse.uid)
        && Objects.equals(this.warnings, admissionResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowed, auditAnnotations, Arrays.hashCode(patch), patchType, status, uid, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdmissionResponse {\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    auditAnnotations: ").append(toIndentedString(auditAnnotations)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    patchType: ").append(toIndentedString(patchType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
