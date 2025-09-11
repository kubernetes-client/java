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
import io.kubernetes.client.openapi.models.CoreV1EventSeries;
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
 * Event is a report of an event somewhere in the cluster.  Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.
 */
@ApiModel(description = "Event is a report of an event somewhere in the cluster.  Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class CoreV1Event implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  @jakarta.annotation.Nullable
  private String action;

  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  @jakarta.annotation.Nullable
  private String apiVersion;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  @jakarta.annotation.Nullable
  private Integer count;

  public static final String SERIALIZED_NAME_EVENT_TIME = "eventTime";
  @SerializedName(SERIALIZED_NAME_EVENT_TIME)
  @jakarta.annotation.Nullable
  private OffsetDateTime eventTime;

  public static final String SERIALIZED_NAME_FIRST_TIMESTAMP = "firstTimestamp";
  @SerializedName(SERIALIZED_NAME_FIRST_TIMESTAMP)
  @jakarta.annotation.Nullable
  private OffsetDateTime firstTimestamp;

  public static final String SERIALIZED_NAME_INVOLVED_OBJECT = "involvedObject";
  @SerializedName(SERIALIZED_NAME_INVOLVED_OBJECT)
  @jakarta.annotation.Nonnull
  private V1ObjectReference involvedObject;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  @jakarta.annotation.Nullable
  private String kind;

  public static final String SERIALIZED_NAME_LAST_TIMESTAMP = "lastTimestamp";
  @SerializedName(SERIALIZED_NAME_LAST_TIMESTAMP)
  @jakarta.annotation.Nullable
  private OffsetDateTime lastTimestamp;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @jakarta.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @jakarta.annotation.Nonnull
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @jakarta.annotation.Nullable
  private String reason;

  public static final String SERIALIZED_NAME_RELATED = "related";
  @SerializedName(SERIALIZED_NAME_RELATED)
  @jakarta.annotation.Nullable
  private V1ObjectReference related;

  public static final String SERIALIZED_NAME_REPORTING_COMPONENT = "reportingComponent";
  @SerializedName(SERIALIZED_NAME_REPORTING_COMPONENT)
  @jakarta.annotation.Nullable
  private String reportingComponent;

  public static final String SERIALIZED_NAME_REPORTING_INSTANCE = "reportingInstance";
  @SerializedName(SERIALIZED_NAME_REPORTING_INSTANCE)
  @jakarta.annotation.Nullable
  private String reportingInstance;

  public static final String SERIALIZED_NAME_SERIES = "series";
  @SerializedName(SERIALIZED_NAME_SERIES)
  @jakarta.annotation.Nullable
  private CoreV1EventSeries series;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  @jakarta.annotation.Nullable
  private V1EventSource source;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @jakarta.annotation.Nullable
  private String type;

  public CoreV1Event() {
  }

  public CoreV1Event action(@jakarta.annotation.Nullable String action) {
    this.action = action;
    return this;
  }

  /**
   * What action was taken/failed regarding to the Regarding object.
   * @return action
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "What action was taken/failed regarding to the Regarding object.")
  public String getAction() {
    return action;
  }

  public void setAction(@jakarta.annotation.Nullable String action) {
    this.action = action;
  }


  public CoreV1Event apiVersion(@jakarta.annotation.Nullable String apiVersion) {
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


  public CoreV1Event count(@jakarta.annotation.Nullable Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The number of times this event has occurred.
   * @return count
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The number of times this event has occurred.")
  public Integer getCount() {
    return count;
  }

  public void setCount(@jakarta.annotation.Nullable Integer count) {
    this.count = count;
  }


  public CoreV1Event eventTime(@jakarta.annotation.Nullable OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Time when this Event was first observed.
   * @return eventTime
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Time when this Event was first observed.")
  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(@jakarta.annotation.Nullable OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }


  public CoreV1Event firstTimestamp(@jakarta.annotation.Nullable OffsetDateTime firstTimestamp) {
    this.firstTimestamp = firstTimestamp;
    return this;
  }

  /**
   * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
   * @return firstTimestamp
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)")
  public OffsetDateTime getFirstTimestamp() {
    return firstTimestamp;
  }

  public void setFirstTimestamp(@jakarta.annotation.Nullable OffsetDateTime firstTimestamp) {
    this.firstTimestamp = firstTimestamp;
  }


  public CoreV1Event involvedObject(@jakarta.annotation.Nonnull V1ObjectReference involvedObject) {
    this.involvedObject = involvedObject;
    return this;
  }

  /**
   * Get involvedObject
   * @return involvedObject
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V1ObjectReference getInvolvedObject() {
    return involvedObject;
  }

  public void setInvolvedObject(@jakarta.annotation.Nonnull V1ObjectReference involvedObject) {
    this.involvedObject = involvedObject;
  }


  public CoreV1Event kind(@jakarta.annotation.Nullable String kind) {
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


  public CoreV1Event lastTimestamp(@jakarta.annotation.Nullable OffsetDateTime lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
    return this;
  }

  /**
   * The time at which the most recent occurrence of this event was recorded.
   * @return lastTimestamp
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The time at which the most recent occurrence of this event was recorded.")
  public OffsetDateTime getLastTimestamp() {
    return lastTimestamp;
  }

  public void setLastTimestamp(@jakarta.annotation.Nullable OffsetDateTime lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
  }


  public CoreV1Event message(@jakarta.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * A human-readable description of the status of this operation.
   * @return message
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A human-readable description of the status of this operation.")
  public String getMessage() {
    return message;
  }

  public void setMessage(@jakarta.annotation.Nullable String message) {
    this.message = message;
  }


  public CoreV1Event metadata(@jakarta.annotation.Nonnull V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(@jakarta.annotation.Nonnull V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public CoreV1Event reason(@jakarta.annotation.Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * This should be a short, machine understandable string that gives the reason for the transition into the object&#39;s current status.
   * @return reason
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This should be a short, machine understandable string that gives the reason for the transition into the object's current status.")
  public String getReason() {
    return reason;
  }

  public void setReason(@jakarta.annotation.Nullable String reason) {
    this.reason = reason;
  }


  public CoreV1Event related(@jakarta.annotation.Nullable V1ObjectReference related) {
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


  public CoreV1Event reportingComponent(@jakarta.annotation.Nullable String reportingComponent) {
    this.reportingComponent = reportingComponent;
    return this;
  }

  /**
   * Name of the controller that emitted this Event, e.g. &#x60;kubernetes.io/kubelet&#x60;.
   * @return reportingComponent
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.")
  public String getReportingComponent() {
    return reportingComponent;
  }

  public void setReportingComponent(@jakarta.annotation.Nullable String reportingComponent) {
    this.reportingComponent = reportingComponent;
  }


  public CoreV1Event reportingInstance(@jakarta.annotation.Nullable String reportingInstance) {
    this.reportingInstance = reportingInstance;
    return this;
  }

  /**
   * ID of the controller instance, e.g. &#x60;kubelet-xyzf&#x60;.
   * @return reportingInstance
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ID of the controller instance, e.g. `kubelet-xyzf`.")
  public String getReportingInstance() {
    return reportingInstance;
  }

  public void setReportingInstance(@jakarta.annotation.Nullable String reportingInstance) {
    this.reportingInstance = reportingInstance;
  }


  public CoreV1Event series(@jakarta.annotation.Nullable CoreV1EventSeries series) {
    this.series = series;
    return this;
  }

  /**
   * Get series
   * @return series
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public CoreV1EventSeries getSeries() {
    return series;
  }

  public void setSeries(@jakarta.annotation.Nullable CoreV1EventSeries series) {
    this.series = series;
  }


  public CoreV1Event source(@jakarta.annotation.Nullable V1EventSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1EventSource getSource() {
    return source;
  }

  public void setSource(@jakarta.annotation.Nullable V1EventSource source) {
    this.source = source;
  }


  public CoreV1Event type(@jakarta.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of this event (Normal, Warning), new types could be added in the future
   * @return type
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Type of this event (Normal, Warning), new types could be added in the future")
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
    CoreV1Event coreV1Event = (CoreV1Event) o;
    return Objects.equals(this.action, coreV1Event.action) &&
        Objects.equals(this.apiVersion, coreV1Event.apiVersion) &&
        Objects.equals(this.count, coreV1Event.count) &&
        Objects.equals(this.eventTime, coreV1Event.eventTime) &&
        Objects.equals(this.firstTimestamp, coreV1Event.firstTimestamp) &&
        Objects.equals(this.involvedObject, coreV1Event.involvedObject) &&
        Objects.equals(this.kind, coreV1Event.kind) &&
        Objects.equals(this.lastTimestamp, coreV1Event.lastTimestamp) &&
        Objects.equals(this.message, coreV1Event.message) &&
        Objects.equals(this.metadata, coreV1Event.metadata) &&
        Objects.equals(this.reason, coreV1Event.reason) &&
        Objects.equals(this.related, coreV1Event.related) &&
        Objects.equals(this.reportingComponent, coreV1Event.reportingComponent) &&
        Objects.equals(this.reportingInstance, coreV1Event.reportingInstance) &&
        Objects.equals(this.series, coreV1Event.series) &&
        Objects.equals(this.source, coreV1Event.source) &&
        Objects.equals(this.type, coreV1Event.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, apiVersion, count, eventTime, firstTimestamp, involvedObject, kind, lastTimestamp, message, metadata, reason, related, reportingComponent, reportingInstance, series, source, type);
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
    openapiFields.add("count");
    openapiFields.add("eventTime");
    openapiFields.add("firstTimestamp");
    openapiFields.add("involvedObject");
    openapiFields.add("kind");
    openapiFields.add("lastTimestamp");
    openapiFields.add("message");
    openapiFields.add("metadata");
    openapiFields.add("reason");
    openapiFields.add("related");
    openapiFields.add("reportingComponent");
    openapiFields.add("reportingInstance");
    openapiFields.add("series");
    openapiFields.add("source");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("involvedObject");
    openapiRequiredFields.add("metadata");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CoreV1Event
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoreV1Event.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreV1Event is not found in the empty JSON string", CoreV1Event.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoreV1Event.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreV1Event` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CoreV1Event.openapiRequiredFields) {
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
      // validate the required field `involvedObject`
      V1ObjectReference.validateJsonElement(jsonObj.get("involvedObject"));
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the required field `metadata`
      V1ObjectMeta.validateJsonElement(jsonObj.get("metadata"));
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      // validate the optional field `related`
      if (jsonObj.get("related") != null && !jsonObj.get("related").isJsonNull()) {
        V1ObjectReference.validateJsonElement(jsonObj.get("related"));
      }
      if ((jsonObj.get("reportingComponent") != null && !jsonObj.get("reportingComponent").isJsonNull()) && !jsonObj.get("reportingComponent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportingComponent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportingComponent").toString()));
      }
      if ((jsonObj.get("reportingInstance") != null && !jsonObj.get("reportingInstance").isJsonNull()) && !jsonObj.get("reportingInstance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportingInstance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportingInstance").toString()));
      }
      // validate the optional field `series`
      if (jsonObj.get("series") != null && !jsonObj.get("series").isJsonNull()) {
        CoreV1EventSeries.validateJsonElement(jsonObj.get("series"));
      }
      // validate the optional field `source`
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) {
        V1EventSource.validateJsonElement(jsonObj.get("source"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreV1Event.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreV1Event' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreV1Event> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreV1Event.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreV1Event>() {
           @Override
           public void write(JsonWriter out, CoreV1Event value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreV1Event read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CoreV1Event given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CoreV1Event
   * @throws IOException if the JSON string is invalid with respect to CoreV1Event
   */
  public static CoreV1Event fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreV1Event.class);
  }

  /**
   * Convert an instance of CoreV1Event to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
