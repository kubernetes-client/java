/*
Copyright 2024 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1JobCondition;
import io.kubernetes.client.openapi.models.V1UncountedTerminatedPods;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * JobStatus represents the current state of a Job.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1JobStatus {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Integer active;

  public static final String SERIALIZED_NAME_COMPLETED_INDEXES = "completedIndexes";
  @SerializedName(SERIALIZED_NAME_COMPLETED_INDEXES)
  private String completedIndexes;

  public static final String SERIALIZED_NAME_COMPLETION_TIME = "completionTime";
  @SerializedName(SERIALIZED_NAME_COMPLETION_TIME)
  private OffsetDateTime completionTime;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1JobCondition> conditions;

  public static final String SERIALIZED_NAME_FAILED = "failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  private Integer failed;

  public static final String SERIALIZED_NAME_FAILED_INDEXES = "failedIndexes";
  @SerializedName(SERIALIZED_NAME_FAILED_INDEXES)
  private String failedIndexes;

  public static final String SERIALIZED_NAME_READY = "ready";
  @SerializedName(SERIALIZED_NAME_READY)
  private Integer ready;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_SUCCEEDED = "succeeded";
  @SerializedName(SERIALIZED_NAME_SUCCEEDED)
  private Integer succeeded;

  public static final String SERIALIZED_NAME_TERMINATING = "terminating";
  @SerializedName(SERIALIZED_NAME_TERMINATING)
  private Integer terminating;

  public static final String SERIALIZED_NAME_UNCOUNTED_TERMINATED_PODS = "uncountedTerminatedPods";
  @SerializedName(SERIALIZED_NAME_UNCOUNTED_TERMINATED_PODS)
  private V1UncountedTerminatedPods uncountedTerminatedPods;

  public V1JobStatus() {
  }

  public V1JobStatus active(Integer active) {

    this.active = active;
    return this;
  }

   /**
   * The number of pending and running pods which are not terminating (without a deletionTimestamp). The value is zero for finished jobs.
   * @return active
  **/
  @jakarta.annotation.Nullable
  public Integer getActive() {
    return active;
  }


  public void setActive(Integer active) {
    this.active = active;
  }


  public V1JobStatus completedIndexes(String completedIndexes) {

    this.completedIndexes = completedIndexes;
    return this;
  }

   /**
   * completedIndexes holds the completed indexes when .spec.completionMode &#x3D; \&quot;Indexed\&quot; in a text format. The indexes are represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as \&quot;1,3-5,7\&quot;.
   * @return completedIndexes
  **/
  @jakarta.annotation.Nullable
  public String getCompletedIndexes() {
    return completedIndexes;
  }


  public void setCompletedIndexes(String completedIndexes) {
    this.completedIndexes = completedIndexes;
  }


  public V1JobStatus completionTime(OffsetDateTime completionTime) {

    this.completionTime = completionTime;
    return this;
  }

   /**
   * Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. The completion time is set when the job finishes successfully, and only then. The value cannot be updated or removed. The value indicates the same or later point in time as the startTime field.
   * @return completionTime
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getCompletionTime() {
    return completionTime;
  }


  public void setCompletionTime(OffsetDateTime completionTime) {
    this.completionTime = completionTime;
  }


  public V1JobStatus conditions(List<V1JobCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1JobStatus addConditionsItem(V1JobCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The latest available observations of an object&#39;s current state. When a Job fails, one of the conditions will have type \&quot;Failed\&quot; and status true. When a Job is suspended, one of the conditions will have type \&quot;Suspended\&quot; and status true; when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions will have type \&quot;Complete\&quot; and status true.  A job is considered finished when it is in a terminal condition, either \&quot;Complete\&quot; or \&quot;Failed\&quot;. A Job cannot have both the \&quot;Complete\&quot; and \&quot;Failed\&quot; conditions. Additionally, it cannot be in the \&quot;Complete\&quot; and \&quot;FailureTarget\&quot; conditions. The \&quot;Complete\&quot;, \&quot;Failed\&quot; and \&quot;FailureTarget\&quot; conditions cannot be disabled.  More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  public List<V1JobCondition> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1JobCondition> conditions) {
    this.conditions = conditions;
  }


  public V1JobStatus failed(Integer failed) {

    this.failed = failed;
    return this;
  }

   /**
   * The number of pods which reached phase Failed. The value increases monotonically.
   * @return failed
  **/
  @jakarta.annotation.Nullable
  public Integer getFailed() {
    return failed;
  }


  public void setFailed(Integer failed) {
    this.failed = failed;
  }


  public V1JobStatus failedIndexes(String failedIndexes) {

    this.failedIndexes = failedIndexes;
    return this;
  }

   /**
   * FailedIndexes holds the failed indexes when spec.backoffLimitPerIndex is set. The indexes are represented in the text format analogous as for the &#x60;completedIndexes&#x60; field, ie. they are kept as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the failed indexes are 1, 3, 4, 5 and 7, they are represented as \&quot;1,3-5,7\&quot;. The set of failed indexes cannot overlap with the set of completed indexes.  This field is beta-level. It can be used when the &#x60;JobBackoffLimitPerIndex&#x60; feature gate is enabled (enabled by default).
   * @return failedIndexes
  **/
  @jakarta.annotation.Nullable
  public String getFailedIndexes() {
    return failedIndexes;
  }


  public void setFailedIndexes(String failedIndexes) {
    this.failedIndexes = failedIndexes;
  }


  public V1JobStatus ready(Integer ready) {

    this.ready = ready;
    return this;
  }

   /**
   * The number of pods which have a Ready condition.
   * @return ready
  **/
  @jakarta.annotation.Nullable
  public Integer getReady() {
    return ready;
  }


  public void setReady(Integer ready) {
    this.ready = ready;
  }


  public V1JobStatus startTime(OffsetDateTime startTime) {

    this.startTime = startTime;
    return this;
  }

   /**
   * Represents time when the job controller started processing a job. When a Job is created in the suspended state, this field is not set until the first time it is resumed. This field is reset every time a Job is resumed from suspension. It is represented in RFC3339 form and is in UTC.  Once set, the field can only be removed when the job is suspended. The field cannot be modified while the job is unsuspended or finished.
   * @return startTime
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public V1JobStatus succeeded(Integer succeeded) {

    this.succeeded = succeeded;
    return this;
  }

   /**
   * The number of pods which reached phase Succeeded. The value increases monotonically for a given spec. However, it may decrease in reaction to scale down of elastic indexed jobs.
   * @return succeeded
  **/
  @jakarta.annotation.Nullable
  public Integer getSucceeded() {
    return succeeded;
  }


  public void setSucceeded(Integer succeeded) {
    this.succeeded = succeeded;
  }


  public V1JobStatus terminating(Integer terminating) {

    this.terminating = terminating;
    return this;
  }

   /**
   * The number of pods which are terminating (in phase Pending or Running and have a deletionTimestamp).  This field is beta-level. The job controller populates the field when the feature gate JobPodReplacementPolicy is enabled (enabled by default).
   * @return terminating
  **/
  @jakarta.annotation.Nullable
  public Integer getTerminating() {
    return terminating;
  }


  public void setTerminating(Integer terminating) {
    this.terminating = terminating;
  }


  public V1JobStatus uncountedTerminatedPods(V1UncountedTerminatedPods uncountedTerminatedPods) {

    this.uncountedTerminatedPods = uncountedTerminatedPods;
    return this;
  }

   /**
   * Get uncountedTerminatedPods
   * @return uncountedTerminatedPods
  **/
  @jakarta.annotation.Nullable
  public V1UncountedTerminatedPods getUncountedTerminatedPods() {
    return uncountedTerminatedPods;
  }


  public void setUncountedTerminatedPods(V1UncountedTerminatedPods uncountedTerminatedPods) {
    this.uncountedTerminatedPods = uncountedTerminatedPods;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1JobStatus v1JobStatus = (V1JobStatus) o;
    return Objects.equals(this.active, v1JobStatus.active) &&
        Objects.equals(this.completedIndexes, v1JobStatus.completedIndexes) &&
        Objects.equals(this.completionTime, v1JobStatus.completionTime) &&
        Objects.equals(this.conditions, v1JobStatus.conditions) &&
        Objects.equals(this.failed, v1JobStatus.failed) &&
        Objects.equals(this.failedIndexes, v1JobStatus.failedIndexes) &&
        Objects.equals(this.ready, v1JobStatus.ready) &&
        Objects.equals(this.startTime, v1JobStatus.startTime) &&
        Objects.equals(this.succeeded, v1JobStatus.succeeded) &&
        Objects.equals(this.terminating, v1JobStatus.terminating) &&
        Objects.equals(this.uncountedTerminatedPods, v1JobStatus.uncountedTerminatedPods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, completedIndexes, completionTime, conditions, failed, failedIndexes, ready, startTime, succeeded, terminating, uncountedTerminatedPods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1JobStatus {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    completedIndexes: ").append(toIndentedString(completedIndexes)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    failedIndexes: ").append(toIndentedString(failedIndexes)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
    sb.append("    terminating: ").append(toIndentedString(terminating)).append("\n");
    sb.append("    uncountedTerminatedPods: ").append(toIndentedString(uncountedTerminatedPods)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("completedIndexes");
    openapiFields.add("completionTime");
    openapiFields.add("conditions");
    openapiFields.add("failed");
    openapiFields.add("failedIndexes");
    openapiFields.add("ready");
    openapiFields.add("startTime");
    openapiFields.add("succeeded");
    openapiFields.add("terminating");
    openapiFields.add("uncountedTerminatedPods");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1JobStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1JobStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1JobStatus is not found in the empty JSON string", V1JobStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1JobStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1JobStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("completedIndexes") != null && !jsonObj.get("completedIndexes").isJsonNull()) && !jsonObj.get("completedIndexes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `completedIndexes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("completedIndexes").toString()));
      }
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V1JobCondition.validateJsonObject(jsonArrayconditions.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("failedIndexes") != null && !jsonObj.get("failedIndexes").isJsonNull()) && !jsonObj.get("failedIndexes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failedIndexes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failedIndexes").toString()));
      }
      // validate the optional field `uncountedTerminatedPods`
      if (jsonObj.get("uncountedTerminatedPods") != null && !jsonObj.get("uncountedTerminatedPods").isJsonNull()) {
        V1UncountedTerminatedPods.validateJsonObject(jsonObj.getAsJsonObject("uncountedTerminatedPods"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1JobStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1JobStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1JobStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1JobStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1JobStatus>() {
           @Override
           public void write(JsonWriter out, V1JobStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1JobStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1JobStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1JobStatus
  * @throws IOException if the JSON string is invalid with respect to V1JobStatus
  */
  public static V1JobStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1JobStatus.class);
  }

 /**
  * Convert an instance of V1JobStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
