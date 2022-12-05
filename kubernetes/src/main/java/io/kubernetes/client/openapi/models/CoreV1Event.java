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
 * Event is a report of an event somewhere in the cluster. Events have a limited retention time and
 * triggers and messages may evolve with time. Event consumers should not rely on the timing of an
 * event with a given Reason reflecting a consistent underlying trigger, or the continued existence
 * of events with that Reason. Events should be treated as informative, best-effort, supplemental
 * data.
 */
@ApiModel(
    description =
        "Event is a report of an event somewhere in the cluster.  Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class CoreV1Event implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_ACTION = "action";

  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_COUNT = "count";

  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_EVENT_TIME = "eventTime";

  @SerializedName(SERIALIZED_NAME_EVENT_TIME)
  private OffsetDateTime eventTime;

  public static final String SERIALIZED_NAME_FIRST_TIMESTAMP = "firstTimestamp";

  @SerializedName(SERIALIZED_NAME_FIRST_TIMESTAMP)
  private OffsetDateTime firstTimestamp;

  public static final String SERIALIZED_NAME_INVOLVED_OBJECT = "involvedObject";

  @SerializedName(SERIALIZED_NAME_INVOLVED_OBJECT)
  private V1ObjectReference involvedObject;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_LAST_TIMESTAMP = "lastTimestamp";

  @SerializedName(SERIALIZED_NAME_LAST_TIMESTAMP)
  private OffsetDateTime lastTimestamp;

  public static final String SERIALIZED_NAME_MESSAGE = "message";

  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_REASON = "reason";

  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_RELATED = "related";

  @SerializedName(SERIALIZED_NAME_RELATED)
  private V1ObjectReference related;

  public static final String SERIALIZED_NAME_REPORTING_COMPONENT = "reportingComponent";

  @SerializedName(SERIALIZED_NAME_REPORTING_COMPONENT)
  private String reportingComponent;

  public static final String SERIALIZED_NAME_REPORTING_INSTANCE = "reportingInstance";

  @SerializedName(SERIALIZED_NAME_REPORTING_INSTANCE)
  private String reportingInstance;

  public static final String SERIALIZED_NAME_SERIES = "series";

  @SerializedName(SERIALIZED_NAME_SERIES)
  private CoreV1EventSeries series;

  public static final String SERIALIZED_NAME_SOURCE = "source";

  @SerializedName(SERIALIZED_NAME_SOURCE)
  private V1EventSource source;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public CoreV1Event action(String action) {

    this.action = action;
    return this;
  }

  /**
   * What action was taken/failed regarding to the Regarding object.
   *
   * @return action
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "What action was taken/failed regarding to the Regarding object.")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public CoreV1Event apiVersion(String apiVersion) {

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

  public CoreV1Event count(Integer count) {

    this.count = count;
    return this;
  }

  /**
   * The number of times this event has occurred.
   *
   * @return count
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of times this event has occurred.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public CoreV1Event eventTime(OffsetDateTime eventTime) {

    this.eventTime = eventTime;
    return this;
  }

  /**
   * Time when this Event was first observed.
   *
   * @return eventTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time when this Event was first observed.")
  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }

  public CoreV1Event firstTimestamp(OffsetDateTime firstTimestamp) {

    this.firstTimestamp = firstTimestamp;
    return this;
  }

  /**
   * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
   *
   * @return firstTimestamp
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)")
  public OffsetDateTime getFirstTimestamp() {
    return firstTimestamp;
  }

  public void setFirstTimestamp(OffsetDateTime firstTimestamp) {
    this.firstTimestamp = firstTimestamp;
  }

  public CoreV1Event involvedObject(V1ObjectReference involvedObject) {

    this.involvedObject = involvedObject;
    return this;
  }

  /**
   * Get involvedObject
   *
   * @return involvedObject
   */
  @ApiModelProperty(required = true, value = "")
  public V1ObjectReference getInvolvedObject() {
    return involvedObject;
  }

  public void setInvolvedObject(V1ObjectReference involvedObject) {
    this.involvedObject = involvedObject;
  }

  public CoreV1Event kind(String kind) {

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

  public CoreV1Event lastTimestamp(OffsetDateTime lastTimestamp) {

    this.lastTimestamp = lastTimestamp;
    return this;
  }

  /**
   * The time at which the most recent occurrence of this event was recorded.
   *
   * @return lastTimestamp
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "The time at which the most recent occurrence of this event was recorded.")
  public OffsetDateTime getLastTimestamp() {
    return lastTimestamp;
  }

  public void setLastTimestamp(OffsetDateTime lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
  }

  public CoreV1Event message(String message) {

    this.message = message;
    return this;
  }

  /**
   * A human-readable description of the status of this operation.
   *
   * @return message
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human-readable description of the status of this operation.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CoreV1Event metadata(V1ObjectMeta metadata) {

    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   *
   * @return metadata
   */
  @ApiModelProperty(required = true, value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public CoreV1Event reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * This should be a short, machine understandable string that gives the reason for the transition
   * into the object&#39;s current status.
   *
   * @return reason
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "This should be a short, machine understandable string that gives the reason for the transition into the object's current status.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public CoreV1Event related(V1ObjectReference related) {

    this.related = related;
    return this;
  }

  /**
   * Get related
   *
   * @return related
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectReference getRelated() {
    return related;
  }

  public void setRelated(V1ObjectReference related) {
    this.related = related;
  }

  public CoreV1Event reportingComponent(String reportingComponent) {

    this.reportingComponent = reportingComponent;
    return this;
  }

  /**
   * Name of the controller that emitted this Event, e.g. &#x60;kubernetes.io/kubelet&#x60;.
   *
   * @return reportingComponent
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.")
  public String getReportingComponent() {
    return reportingComponent;
  }

  public void setReportingComponent(String reportingComponent) {
    this.reportingComponent = reportingComponent;
  }

  public CoreV1Event reportingInstance(String reportingInstance) {

    this.reportingInstance = reportingInstance;
    return this;
  }

  /**
   * ID of the controller instance, e.g. &#x60;kubelet-xyzf&#x60;.
   *
   * @return reportingInstance
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the controller instance, e.g. `kubelet-xyzf`.")
  public String getReportingInstance() {
    return reportingInstance;
  }

  public void setReportingInstance(String reportingInstance) {
    this.reportingInstance = reportingInstance;
  }

  public CoreV1Event series(CoreV1EventSeries series) {

    this.series = series;
    return this;
  }

  /**
   * Get series
   *
   * @return series
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public CoreV1EventSeries getSeries() {
    return series;
  }

  public void setSeries(CoreV1EventSeries series) {
    this.series = series;
  }

  public CoreV1Event source(V1EventSource source) {

    this.source = source;
    return this;
  }

  /**
   * Get source
   *
   * @return source
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1EventSource getSource() {
    return source;
  }

  public void setSource(V1EventSource source) {
    this.source = source;
  }

  public CoreV1Event type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Type of this event (Normal, Warning), new types could be added in the future
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Type of this event (Normal, Warning), new types could be added in the future")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreV1Event coreV1Event = (CoreV1Event) o;
    return Objects.equals(this.action, coreV1Event.action)
        && Objects.equals(this.apiVersion, coreV1Event.apiVersion)
        && Objects.equals(this.count, coreV1Event.count)
        && Objects.equals(this.eventTime, coreV1Event.eventTime)
        && Objects.equals(this.firstTimestamp, coreV1Event.firstTimestamp)
        && Objects.equals(this.involvedObject, coreV1Event.involvedObject)
        && Objects.equals(this.kind, coreV1Event.kind)
        && Objects.equals(this.lastTimestamp, coreV1Event.lastTimestamp)
        && Objects.equals(this.message, coreV1Event.message)
        && Objects.equals(this.metadata, coreV1Event.metadata)
        && Objects.equals(this.reason, coreV1Event.reason)
        && Objects.equals(this.related, coreV1Event.related)
        && Objects.equals(this.reportingComponent, coreV1Event.reportingComponent)
        && Objects.equals(this.reportingInstance, coreV1Event.reportingInstance)
        && Objects.equals(this.series, coreV1Event.series)
        && Objects.equals(this.source, coreV1Event.source)
        && Objects.equals(this.type, coreV1Event.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        action,
        apiVersion,
        count,
        eventTime,
        firstTimestamp,
        involvedObject,
        kind,
        lastTimestamp,
        message,
        metadata,
        reason,
        related,
        reportingComponent,
        reportingInstance,
        series,
        source,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreV1Event {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    firstTimestamp: ").append(toIndentedString(firstTimestamp)).append("\n");
    sb.append("    involvedObject: ").append(toIndentedString(involvedObject)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    lastTimestamp: ").append(toIndentedString(lastTimestamp)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    reportingComponent: ").append(toIndentedString(reportingComponent)).append("\n");
    sb.append("    reportingInstance: ").append(toIndentedString(reportingInstance)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
