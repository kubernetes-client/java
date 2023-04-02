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
 * Event is a report of an event somewhere in the cluster. It generally denotes some state change in
 * the system. Events have a limited retention time and triggers and messages may evolve with time.
 * Event consumers should not rely on the timing of an event with a given Reason reflecting a
 * consistent underlying trigger, or the continued existence of events with that Reason. Events
 * should be treated as informative, best-effort, supplemental data.
 */
@ApiModel(
    description =
        "Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system. Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class EventsV1Event implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_ACTION = "action";

  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_DEPRECATED_COUNT = "deprecatedCount";

  @SerializedName(SERIALIZED_NAME_DEPRECATED_COUNT)
  private Integer deprecatedCount;

  public static final String SERIALIZED_NAME_DEPRECATED_FIRST_TIMESTAMP =
      "deprecatedFirstTimestamp";

  @SerializedName(SERIALIZED_NAME_DEPRECATED_FIRST_TIMESTAMP)
  private OffsetDateTime deprecatedFirstTimestamp;

  public static final String SERIALIZED_NAME_DEPRECATED_LAST_TIMESTAMP = "deprecatedLastTimestamp";

  @SerializedName(SERIALIZED_NAME_DEPRECATED_LAST_TIMESTAMP)
  private OffsetDateTime deprecatedLastTimestamp;

  public static final String SERIALIZED_NAME_DEPRECATED_SOURCE = "deprecatedSource";

  @SerializedName(SERIALIZED_NAME_DEPRECATED_SOURCE)
  private V1EventSource deprecatedSource;

  public static final String SERIALIZED_NAME_EVENT_TIME = "eventTime";

  @SerializedName(SERIALIZED_NAME_EVENT_TIME)
  private OffsetDateTime eventTime;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_NOTE = "note";

  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_REASON = "reason";

  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_REGARDING = "regarding";

  @SerializedName(SERIALIZED_NAME_REGARDING)
  private V1ObjectReference regarding;

  public static final String SERIALIZED_NAME_RELATED = "related";

  @SerializedName(SERIALIZED_NAME_RELATED)
  private V1ObjectReference related;

  public static final String SERIALIZED_NAME_REPORTING_CONTROLLER = "reportingController";

  @SerializedName(SERIALIZED_NAME_REPORTING_CONTROLLER)
  private String reportingController;

  public static final String SERIALIZED_NAME_REPORTING_INSTANCE = "reportingInstance";

  @SerializedName(SERIALIZED_NAME_REPORTING_INSTANCE)
  private String reportingInstance;

  public static final String SERIALIZED_NAME_SERIES = "series";

  @SerializedName(SERIALIZED_NAME_SERIES)
  private EventsV1EventSeries series;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public EventsV1Event action(String action) {

    this.action = action;
    return this;
  }

  /**
   * action is what action was taken/failed regarding to the regarding object. It is
   * machine-readable. This field cannot be empty for new Events and it can have at most 128
   * characters.
   *
   * @return action
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters.")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public EventsV1Event apiVersion(String apiVersion) {

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

  public EventsV1Event deprecatedCount(Integer deprecatedCount) {

    this.deprecatedCount = deprecatedCount;
    return this;
  }

  /**
   * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event
   * type.
   *
   * @return deprecatedCount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.")
  public Integer getDeprecatedCount() {
    return deprecatedCount;
  }

  public void setDeprecatedCount(Integer deprecatedCount) {
    this.deprecatedCount = deprecatedCount;
  }

  public EventsV1Event deprecatedFirstTimestamp(OffsetDateTime deprecatedFirstTimestamp) {

    this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
    return this;
  }

  /**
   * deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1
   * Event type.
   *
   * @return deprecatedFirstTimestamp
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.")
  public OffsetDateTime getDeprecatedFirstTimestamp() {
    return deprecatedFirstTimestamp;
  }

  public void setDeprecatedFirstTimestamp(OffsetDateTime deprecatedFirstTimestamp) {
    this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
  }

  public EventsV1Event deprecatedLastTimestamp(OffsetDateTime deprecatedLastTimestamp) {

    this.deprecatedLastTimestamp = deprecatedLastTimestamp;
    return this;
  }

  /**
   * deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1
   * Event type.
   *
   * @return deprecatedLastTimestamp
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.")
  public OffsetDateTime getDeprecatedLastTimestamp() {
    return deprecatedLastTimestamp;
  }

  public void setDeprecatedLastTimestamp(OffsetDateTime deprecatedLastTimestamp) {
    this.deprecatedLastTimestamp = deprecatedLastTimestamp;
  }

  public EventsV1Event deprecatedSource(V1EventSource deprecatedSource) {

    this.deprecatedSource = deprecatedSource;
    return this;
  }

  /**
   * Get deprecatedSource
   *
   * @return deprecatedSource
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1EventSource getDeprecatedSource() {
    return deprecatedSource;
  }

  public void setDeprecatedSource(V1EventSource deprecatedSource) {
    this.deprecatedSource = deprecatedSource;
  }

  public EventsV1Event eventTime(OffsetDateTime eventTime) {

    this.eventTime = eventTime;
    return this;
  }

  /**
   * eventTime is the time when this Event was first observed. It is required.
   *
   * @return eventTime
   */
  @ApiModelProperty(
      required = true,
      value = "eventTime is the time when this Event was first observed. It is required.")
  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }

  public EventsV1Event kind(String kind) {

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

  public EventsV1Event metadata(V1ObjectMeta metadata) {

    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   *
   * @return metadata
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public EventsV1Event note(String note) {

    this.note = note;
    return this;
  }

  /**
   * note is a human-readable description of the status of this operation. Maximal length of the
   * note is 1kB, but libraries should be prepared to handle values up to 64kB.
   *
   * @return note
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public EventsV1Event reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * reason is why the action was taken. It is human-readable. This field cannot be empty for new
   * Events and it can have at most 128 characters.
   *
   * @return reason
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public EventsV1Event regarding(V1ObjectReference regarding) {

    this.regarding = regarding;
    return this;
  }

  /**
   * Get regarding
   *
   * @return regarding
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectReference getRegarding() {
    return regarding;
  }

  public void setRegarding(V1ObjectReference regarding) {
    this.regarding = regarding;
  }

  public EventsV1Event related(V1ObjectReference related) {

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

  public EventsV1Event reportingController(String reportingController) {

    this.reportingController = reportingController;
    return this;
  }

  /**
   * reportingController is the name of the controller that emitted this Event, e.g.
   * &#x60;kubernetes.io/kubelet&#x60;. This field cannot be empty for new Events.
   *
   * @return reportingController
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.")
  public String getReportingController() {
    return reportingController;
  }

  public void setReportingController(String reportingController) {
    this.reportingController = reportingController;
  }

  public EventsV1Event reportingInstance(String reportingInstance) {

    this.reportingInstance = reportingInstance;
    return this;
  }

  /**
   * reportingInstance is the ID of the controller instance, e.g. &#x60;kubelet-xyzf&#x60;. This
   * field cannot be empty for new Events and it can have at most 128 characters.
   *
   * @return reportingInstance
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.")
  public String getReportingInstance() {
    return reportingInstance;
  }

  public void setReportingInstance(String reportingInstance) {
    this.reportingInstance = reportingInstance;
  }

  public EventsV1Event series(EventsV1EventSeries series) {

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
  public EventsV1EventSeries getSeries() {
    return series;
  }

  public void setSeries(EventsV1EventSeries series) {
    this.series = series;
  }

  public EventsV1Event type(String type) {

    this.type = type;
    return this;
  }

  /**
   * type is the type of this event (Normal, Warning), new types could be added in the future. It is
   * machine-readable. This field cannot be empty for new Events.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This field cannot be empty for new Events.")
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
    EventsV1Event eventsV1Event = (EventsV1Event) o;
    return Objects.equals(this.action, eventsV1Event.action)
        && Objects.equals(this.apiVersion, eventsV1Event.apiVersion)
        && Objects.equals(this.deprecatedCount, eventsV1Event.deprecatedCount)
        && Objects.equals(this.deprecatedFirstTimestamp, eventsV1Event.deprecatedFirstTimestamp)
        && Objects.equals(this.deprecatedLastTimestamp, eventsV1Event.deprecatedLastTimestamp)
        && Objects.equals(this.deprecatedSource, eventsV1Event.deprecatedSource)
        && Objects.equals(this.eventTime, eventsV1Event.eventTime)
        && Objects.equals(this.kind, eventsV1Event.kind)
        && Objects.equals(this.metadata, eventsV1Event.metadata)
        && Objects.equals(this.note, eventsV1Event.note)
        && Objects.equals(this.reason, eventsV1Event.reason)
        && Objects.equals(this.regarding, eventsV1Event.regarding)
        && Objects.equals(this.related, eventsV1Event.related)
        && Objects.equals(this.reportingController, eventsV1Event.reportingController)
        && Objects.equals(this.reportingInstance, eventsV1Event.reportingInstance)
        && Objects.equals(this.series, eventsV1Event.series)
        && Objects.equals(this.type, eventsV1Event.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        action,
        apiVersion,
        deprecatedCount,
        deprecatedFirstTimestamp,
        deprecatedLastTimestamp,
        deprecatedSource,
        eventTime,
        kind,
        metadata,
        note,
        reason,
        regarding,
        related,
        reportingController,
        reportingInstance,
        series,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsV1Event {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    deprecatedCount: ").append(toIndentedString(deprecatedCount)).append("\n");
    sb.append("    deprecatedFirstTimestamp: ")
        .append(toIndentedString(deprecatedFirstTimestamp))
        .append("\n");
    sb.append("    deprecatedLastTimestamp: ")
        .append(toIndentedString(deprecatedLastTimestamp))
        .append("\n");
    sb.append("    deprecatedSource: ").append(toIndentedString(deprecatedSource)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    regarding: ").append(toIndentedString(regarding)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    reportingController: ")
        .append(toIndentedString(reportingController))
        .append("\n");
    sb.append("    reportingInstance: ").append(toIndentedString(reportingInstance)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
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
