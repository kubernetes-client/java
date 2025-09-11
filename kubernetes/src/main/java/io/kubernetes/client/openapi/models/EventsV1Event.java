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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.EventsV1EventSeries;
import io.kubernetes.client.openapi.models.V1EventSource;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system. Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.
 */
@ApiModel(description = "Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system. Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class EventsV1Event implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  @jakarta.annotation.Nullable
  private String action;

  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  @jakarta.annotation.Nullable
  private String apiVersion;

  public static final String SERIALIZED_NAME_DEPRECATED_COUNT = "deprecatedCount";
  @SerializedName(SERIALIZED_NAME_DEPRECATED_COUNT)
  @jakarta.annotation.Nullable
  private Integer deprecatedCount;

  public static final String SERIALIZED_NAME_DEPRECATED_FIRST_TIMESTAMP = "deprecatedFirstTimestamp";
  @SerializedName(SERIALIZED_NAME_DEPRECATED_FIRST_TIMESTAMP)
  @jakarta.annotation.Nullable
  private OffsetDateTime deprecatedFirstTimestamp;

  public static final String SERIALIZED_NAME_DEPRECATED_LAST_TIMESTAMP = "deprecatedLastTimestamp";
  @SerializedName(SERIALIZED_NAME_DEPRECATED_LAST_TIMESTAMP)
  @jakarta.annotation.Nullable
  private OffsetDateTime deprecatedLastTimestamp;

  public static final String SERIALIZED_NAME_DEPRECATED_SOURCE = "deprecatedSource";
  @SerializedName(SERIALIZED_NAME_DEPRECATED_SOURCE)
  @jakarta.annotation.Nullable
  private V1EventSource deprecatedSource;

  public static final String SERIALIZED_NAME_EVENT_TIME = "eventTime";
  @SerializedName(SERIALIZED_NAME_EVENT_TIME)
  @jakarta.annotation.Nonnull
  private OffsetDateTime eventTime;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  @jakarta.annotation.Nullable
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @jakarta.annotation.Nullable
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  @jakarta.annotation.Nullable
  private String note;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @jakarta.annotation.Nullable
  private String reason;

  public static final String SERIALIZED_NAME_REGARDING = "regarding";
  @SerializedName(SERIALIZED_NAME_REGARDING)
  @jakarta.annotation.Nullable
  private V1ObjectReference regarding;

  public static final String SERIALIZED_NAME_RELATED = "related";
  @SerializedName(SERIALIZED_NAME_RELATED)
  @jakarta.annotation.Nullable
  private V1ObjectReference related;

  public static final String SERIALIZED_NAME_REPORTING_CONTROLLER = "reportingController";
  @SerializedName(SERIALIZED_NAME_REPORTING_CONTROLLER)
  @jakarta.annotation.Nullable
  private String reportingController;

  public static final String SERIALIZED_NAME_REPORTING_INSTANCE = "reportingInstance";
  @SerializedName(SERIALIZED_NAME_REPORTING_INSTANCE)
  @jakarta.annotation.Nullable
  private String reportingInstance;

  public static final String SERIALIZED_NAME_SERIES = "series";
  @SerializedName(SERIALIZED_NAME_SERIES)
  @jakarta.annotation.Nullable
  private EventsV1EventSeries series;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @jakarta.annotation.Nullable
  private String type;

  public EventsV1Event() {
  }

  public EventsV1Event action(@jakarta.annotation.Nullable String action) {
    this.action = action;
    return this;
  }

  /**
   * action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters.
   * @return action
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters.")
  public String getAction() {
    return action;
  }

  public void setAction(@jakarta.annotation.Nullable String action) {
    this.action = action;
  }


  public EventsV1Event apiVersion(@jakarta.annotation.Nullable String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(@jakarta.annotation.Nullable String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public EventsV1Event deprecatedCount(@jakarta.annotation.Nullable Integer deprecatedCount) {
    this.deprecatedCount = deprecatedCount;
    return this;
  }

  /**
   * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
   * @return deprecatedCount
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.")
  public Integer getDeprecatedCount() {
    return deprecatedCount;
  }

  public void setDeprecatedCount(@jakarta.annotation.Nullable Integer deprecatedCount) {
    this.deprecatedCount = deprecatedCount;
  }


  public EventsV1Event deprecatedFirstTimestamp(@jakarta.annotation.Nullable OffsetDateTime deprecatedFirstTimestamp) {
    this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
    return this;
  }

  /**
   * deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
   * @return deprecatedFirstTimestamp
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.")
  public OffsetDateTime getDeprecatedFirstTimestamp() {
    return deprecatedFirstTimestamp;
  }

  public void setDeprecatedFirstTimestamp(@jakarta.annotation.Nullable OffsetDateTime deprecatedFirstTimestamp) {
    this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
  }


  public EventsV1Event deprecatedLastTimestamp(@jakarta.annotation.Nullable OffsetDateTime deprecatedLastTimestamp) {
    this.deprecatedLastTimestamp = deprecatedLastTimestamp;
    return this;
  }

  /**
   * deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
   * @return deprecatedLastTimestamp
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.")
  public OffsetDateTime getDeprecatedLastTimestamp() {
    return deprecatedLastTimestamp;
  }

  public void setDeprecatedLastTimestamp(@jakarta.annotation.Nullable OffsetDateTime deprecatedLastTimestamp) {
    this.deprecatedLastTimestamp = deprecatedLastTimestamp;
  }


  public EventsV1Event deprecatedSource(@jakarta.annotation.Nullable V1EventSource deprecatedSource) {
    this.deprecatedSource = deprecatedSource;
    return this;
  }

  /**
   * Get deprecatedSource
   * @return deprecatedSource
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1EventSource getDeprecatedSource() {
    return deprecatedSource;
  }

  public void setDeprecatedSource(@jakarta.annotation.Nullable V1EventSource deprecatedSource) {
    this.deprecatedSource = deprecatedSource;
  }


  public EventsV1Event eventTime(@jakarta.annotation.Nonnull OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * eventTime is the time when this Event was first observed. It is required.
   * @return eventTime
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "eventTime is the time when this Event was first observed. It is required.")
  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(@jakarta.annotation.Nonnull OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }


  public EventsV1Event kind(@jakarta.annotation.Nullable String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(@jakarta.annotation.Nullable String kind) {
    this.kind = kind;
  }


  public EventsV1Event metadata(@jakarta.annotation.Nullable V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(@jakarta.annotation.Nullable V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public EventsV1Event note(@jakarta.annotation.Nullable String note) {
    this.note = note;
    return this;
  }

  /**
   * note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
   * @return note
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.")
  public String getNote() {
    return note;
  }

  public void setNote(@jakarta.annotation.Nullable String note) {
    this.note = note;
  }


  public EventsV1Event reason(@jakarta.annotation.Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters.
   * @return reason
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters.")
  public String getReason() {
    return reason;
  }

  public void setReason(@jakarta.annotation.Nullable String reason) {
    this.reason = reason;
  }


  public EventsV1Event regarding(@jakarta.annotation.Nullable V1ObjectReference regarding) {
    this.regarding = regarding;
    return this;
  }

  /**
   * Get regarding
   * @return regarding
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectReference getRegarding() {
    return regarding;
  }

  public void setRegarding(@jakarta.annotation.Nullable V1ObjectReference regarding) {
    this.regarding = regarding;
  }


  public EventsV1Event related(@jakarta.annotation.Nullable V1ObjectReference related) {
    this.related = related;
    return this;
  }

  /**
   * Get related
   * @return related
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectReference getRelated() {
    return related;
  }

  public void setRelated(@jakarta.annotation.Nullable V1ObjectReference related) {
    this.related = related;
  }


  public EventsV1Event reportingController(@jakarta.annotation.Nullable String reportingController) {
    this.reportingController = reportingController;
    return this;
  }

  /**
   * reportingController is the name of the controller that emitted this Event, e.g. &#x60;kubernetes.io/kubelet&#x60;. This field cannot be empty for new Events.
   * @return reportingController
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.")
  public String getReportingController() {
    return reportingController;
  }

  public void setReportingController(@jakarta.annotation.Nullable String reportingController) {
    this.reportingController = reportingController;
  }


  public EventsV1Event reportingInstance(@jakarta.annotation.Nullable String reportingInstance) {
    this.reportingInstance = reportingInstance;
    return this;
  }

  /**
   * reportingInstance is the ID of the controller instance, e.g. &#x60;kubelet-xyzf&#x60;. This field cannot be empty for new Events and it can have at most 128 characters.
   * @return reportingInstance
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.")
  public String getReportingInstance() {
    return reportingInstance;
  }

  public void setReportingInstance(@jakarta.annotation.Nullable String reportingInstance) {
    this.reportingInstance = reportingInstance;
  }


  public EventsV1Event series(@jakarta.annotation.Nullable EventsV1EventSeries series) {
    this.series = series;
    return this;
  }

  /**
   * Get series
   * @return series
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public EventsV1EventSeries getSeries() {
    return series;
  }

  public void setSeries(@jakarta.annotation.Nullable EventsV1EventSeries series) {
    this.series = series;
  }


  public EventsV1Event type(@jakarta.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This field cannot be empty for new Events.
   * @return type
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This field cannot be empty for new Events.")
  public String getType() {
    return type;
  }

  public void setType(@jakarta.annotation.Nullable String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsV1Event eventsV1Event = (EventsV1Event) o;
    return Objects.equals(this.action, eventsV1Event.action) &&
        Objects.equals(this.apiVersion, eventsV1Event.apiVersion) &&
        Objects.equals(this.deprecatedCount, eventsV1Event.deprecatedCount) &&
        Objects.equals(this.deprecatedFirstTimestamp, eventsV1Event.deprecatedFirstTimestamp) &&
        Objects.equals(this.deprecatedLastTimestamp, eventsV1Event.deprecatedLastTimestamp) &&
        Objects.equals(this.deprecatedSource, eventsV1Event.deprecatedSource) &&
        Objects.equals(this.eventTime, eventsV1Event.eventTime) &&
        Objects.equals(this.kind, eventsV1Event.kind) &&
        Objects.equals(this.metadata, eventsV1Event.metadata) &&
        Objects.equals(this.note, eventsV1Event.note) &&
        Objects.equals(this.reason, eventsV1Event.reason) &&
        Objects.equals(this.regarding, eventsV1Event.regarding) &&
        Objects.equals(this.related, eventsV1Event.related) &&
        Objects.equals(this.reportingController, eventsV1Event.reportingController) &&
        Objects.equals(this.reportingInstance, eventsV1Event.reportingInstance) &&
        Objects.equals(this.series, eventsV1Event.series) &&
        Objects.equals(this.type, eventsV1Event.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, apiVersion, deprecatedCount, deprecatedFirstTimestamp, deprecatedLastTimestamp, deprecatedSource, eventTime, kind, metadata, note, reason, regarding, related, reportingController, reportingInstance, series, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsV1Event {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    deprecatedCount: ").append(toIndentedString(deprecatedCount)).append("\n");
    sb.append("    deprecatedFirstTimestamp: ").append(toIndentedString(deprecatedFirstTimestamp)).append("\n");
    sb.append("    deprecatedLastTimestamp: ").append(toIndentedString(deprecatedLastTimestamp)).append("\n");
    sb.append("    deprecatedSource: ").append(toIndentedString(deprecatedSource)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    regarding: ").append(toIndentedString(regarding)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    reportingController: ").append(toIndentedString(reportingController)).append("\n");
    sb.append("    reportingInstance: ").append(toIndentedString(reportingInstance)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("action");
    openapiFields.add("apiVersion");
    openapiFields.add("deprecatedCount");
    openapiFields.add("deprecatedFirstTimestamp");
    openapiFields.add("deprecatedLastTimestamp");
    openapiFields.add("deprecatedSource");
    openapiFields.add("eventTime");
    openapiFields.add("kind");
    openapiFields.add("metadata");
    openapiFields.add("note");
    openapiFields.add("reason");
    openapiFields.add("regarding");
    openapiFields.add("related");
    openapiFields.add("reportingController");
    openapiFields.add("reportingInstance");
    openapiFields.add("series");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("eventTime");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EventsV1Event
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventsV1Event.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventsV1Event is not found in the empty JSON string", EventsV1Event.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventsV1Event.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventsV1Event` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventsV1Event.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      // validate the optional field `deprecatedSource`
      if (jsonObj.get("deprecatedSource") != null && !jsonObj.get("deprecatedSource").isJsonNull()) {
        V1EventSource.validateJsonElement(jsonObj.get("deprecatedSource"));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        V1ObjectMeta.validateJsonElement(jsonObj.get("metadata"));
      }
      if ((jsonObj.get("note") != null && !jsonObj.get("note").isJsonNull()) && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      // validate the optional field `regarding`
      if (jsonObj.get("regarding") != null && !jsonObj.get("regarding").isJsonNull()) {
        V1ObjectReference.validateJsonElement(jsonObj.get("regarding"));
      }
      // validate the optional field `related`
      if (jsonObj.get("related") != null && !jsonObj.get("related").isJsonNull()) {
        V1ObjectReference.validateJsonElement(jsonObj.get("related"));
      }
      if ((jsonObj.get("reportingController") != null && !jsonObj.get("reportingController").isJsonNull()) && !jsonObj.get("reportingController").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportingController` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportingController").toString()));
      }
      if ((jsonObj.get("reportingInstance") != null && !jsonObj.get("reportingInstance").isJsonNull()) && !jsonObj.get("reportingInstance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportingInstance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportingInstance").toString()));
      }
      // validate the optional field `series`
      if (jsonObj.get("series") != null && !jsonObj.get("series").isJsonNull()) {
        EventsV1EventSeries.validateJsonElement(jsonObj.get("series"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventsV1Event.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventsV1Event' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventsV1Event> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventsV1Event.class));

       return (TypeAdapter<T>) new TypeAdapter<EventsV1Event>() {
           @Override
           public void write(JsonWriter out, EventsV1Event value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventsV1Event read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EventsV1Event given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EventsV1Event
   * @throws IOException if the JSON string is invalid with respect to EventsV1Event
   */
  public static EventsV1Event fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventsV1Event.class);
  }

  /**
   * Convert an instance of EventsV1Event to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
