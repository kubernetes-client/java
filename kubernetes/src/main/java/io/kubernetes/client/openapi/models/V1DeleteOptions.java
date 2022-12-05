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

/** DeleteOptions may be provided when deleting an API object. */
@ApiModel(description = "DeleteOptions may be provided when deleting an API object.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1DeleteOptions {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_DRY_RUN = "dryRun";

  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private List<String> dryRun = null;

  public static final String SERIALIZED_NAME_GRACE_PERIOD_SECONDS = "gracePeriodSeconds";

  @SerializedName(SERIALIZED_NAME_GRACE_PERIOD_SECONDS)
  private Long gracePeriodSeconds;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_ORPHAN_DEPENDENTS = "orphanDependents";

  @SerializedName(SERIALIZED_NAME_ORPHAN_DEPENDENTS)
  private Boolean orphanDependents;

  public static final String SERIALIZED_NAME_PRECONDITIONS = "preconditions";

  @SerializedName(SERIALIZED_NAME_PRECONDITIONS)
  private V1Preconditions preconditions;

  public static final String SERIALIZED_NAME_PROPAGATION_POLICY = "propagationPolicy";

  @SerializedName(SERIALIZED_NAME_PROPAGATION_POLICY)
  private String propagationPolicy;

  public V1DeleteOptions apiVersion(String apiVersion) {

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

  public V1DeleteOptions dryRun(List<String> dryRun) {

    this.dryRun = dryRun;
    return this;
  }

  public V1DeleteOptions addDryRunItem(String dryRunItem) {
    if (this.dryRun == null) {
      this.dryRun = new ArrayList<>();
    }
    this.dryRun.add(dryRunItem);
    return this;
  }

  /**
   * When present, indicates that modifications should not be persisted. An invalid or unrecognized
   * dryRun directive will result in an error response and no further processing of the request.
   * Valid values are: - All: all dry run stages will be processed
   *
   * @return dryRun
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed")
  public List<String> getDryRun() {
    return dryRun;
  }

  public void setDryRun(List<String> dryRun) {
    this.dryRun = dryRun;
  }

  public V1DeleteOptions gracePeriodSeconds(Long gracePeriodSeconds) {

    this.gracePeriodSeconds = gracePeriodSeconds;
    return this;
  }

  /**
   * The duration in seconds before the object should be deleted. Value must be non-negative
   * integer. The value zero indicates delete immediately. If this value is nil, the default grace
   * period for the specified type will be used. Defaults to a per object value if not specified.
   * zero means delete immediately.
   *
   * @return gracePeriodSeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.")
  public Long getGracePeriodSeconds() {
    return gracePeriodSeconds;
  }

  public void setGracePeriodSeconds(Long gracePeriodSeconds) {
    this.gracePeriodSeconds = gracePeriodSeconds;
  }

  public V1DeleteOptions kind(String kind) {

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

  public V1DeleteOptions orphanDependents(Boolean orphanDependents) {

    this.orphanDependents = orphanDependents;
    return this;
  }

  /**
   * Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the
   * dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added
   * to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be
   * set, but not both.
   *
   * @return orphanDependents
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.")
  public Boolean getOrphanDependents() {
    return orphanDependents;
  }

  public void setOrphanDependents(Boolean orphanDependents) {
    this.orphanDependents = orphanDependents;
  }

  public V1DeleteOptions preconditions(V1Preconditions preconditions) {

    this.preconditions = preconditions;
    return this;
  }

  /**
   * Get preconditions
   *
   * @return preconditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1Preconditions getPreconditions() {
    return preconditions;
  }

  public void setPreconditions(V1Preconditions preconditions) {
    this.preconditions = preconditions;
  }

  public V1DeleteOptions propagationPolicy(String propagationPolicy) {

    this.propagationPolicy = propagationPolicy;
    return this;
  }

  /**
   * Whether and how garbage collection will be performed. Either this field or OrphanDependents may
   * be set, but not both. The default policy is decided by the existing finalizer set in the
   * metadata.finalizers and the resource-specific default policy. Acceptable values are:
   * &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to
   * delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes
   * all dependents in the foreground.
   *
   * @return propagationPolicy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground.")
  public String getPropagationPolicy() {
    return propagationPolicy;
  }

  public void setPropagationPolicy(String propagationPolicy) {
    this.propagationPolicy = propagationPolicy;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DeleteOptions v1DeleteOptions = (V1DeleteOptions) o;
    return Objects.equals(this.apiVersion, v1DeleteOptions.apiVersion)
        && Objects.equals(this.dryRun, v1DeleteOptions.dryRun)
        && Objects.equals(this.gracePeriodSeconds, v1DeleteOptions.gracePeriodSeconds)
        && Objects.equals(this.kind, v1DeleteOptions.kind)
        && Objects.equals(this.orphanDependents, v1DeleteOptions.orphanDependents)
        && Objects.equals(this.preconditions, v1DeleteOptions.preconditions)
        && Objects.equals(this.propagationPolicy, v1DeleteOptions.propagationPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apiVersion,
        dryRun,
        gracePeriodSeconds,
        kind,
        orphanDependents,
        preconditions,
        propagationPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DeleteOptions {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    gracePeriodSeconds: ").append(toIndentedString(gracePeriodSeconds)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    orphanDependents: ").append(toIndentedString(orphanDependents)).append("\n");
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    propagationPolicy: ").append(toIndentedString(propagationPolicy)).append("\n");
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
