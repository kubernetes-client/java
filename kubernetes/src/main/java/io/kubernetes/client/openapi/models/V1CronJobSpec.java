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
import io.kubernetes.client.openapi.models.V1JobTemplateSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * CronJobSpec describes how the job execution will look like and when it will actually run.
 */
@ApiModel(description = "CronJobSpec describes how the job execution will look like and when it will actually run.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1CronJobSpec {
  public static final String SERIALIZED_NAME_CONCURRENCY_POLICY = "concurrencyPolicy";
  @SerializedName(SERIALIZED_NAME_CONCURRENCY_POLICY)
  @jakarta.annotation.Nullable
  private String concurrencyPolicy;

  public static final String SERIALIZED_NAME_FAILED_JOBS_HISTORY_LIMIT = "failedJobsHistoryLimit";
  @SerializedName(SERIALIZED_NAME_FAILED_JOBS_HISTORY_LIMIT)
  @jakarta.annotation.Nullable
  private Integer failedJobsHistoryLimit;

  public static final String SERIALIZED_NAME_JOB_TEMPLATE = "jobTemplate";
  @SerializedName(SERIALIZED_NAME_JOB_TEMPLATE)
  @jakarta.annotation.Nonnull
  private V1JobTemplateSpec jobTemplate;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  @jakarta.annotation.Nonnull
  private String schedule;

  public static final String SERIALIZED_NAME_STARTING_DEADLINE_SECONDS = "startingDeadlineSeconds";
  @SerializedName(SERIALIZED_NAME_STARTING_DEADLINE_SECONDS)
  @jakarta.annotation.Nullable
  private Long startingDeadlineSeconds;

  public static final String SERIALIZED_NAME_SUCCESSFUL_JOBS_HISTORY_LIMIT = "successfulJobsHistoryLimit";
  @SerializedName(SERIALIZED_NAME_SUCCESSFUL_JOBS_HISTORY_LIMIT)
  @jakarta.annotation.Nullable
  private Integer successfulJobsHistoryLimit;

  public static final String SERIALIZED_NAME_SUSPEND = "suspend";
  @SerializedName(SERIALIZED_NAME_SUSPEND)
  @jakarta.annotation.Nullable
  private Boolean suspend;

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  @jakarta.annotation.Nullable
  private String timeZone;

  public V1CronJobSpec() {
  }

  public V1CronJobSpec concurrencyPolicy(@jakarta.annotation.Nullable String concurrencyPolicy) {
    this.concurrencyPolicy = concurrencyPolicy;
    return this;
  }

  /**
   * Specifies how to treat concurrent executions of a Job. Valid values are:  - \&quot;Allow\&quot; (default): allows CronJobs to run concurrently; - \&quot;Forbid\&quot;: forbids concurrent runs, skipping next run if previous run hasn&#39;t finished yet; - \&quot;Replace\&quot;: cancels currently running job and replaces it with a new one
   * @return concurrencyPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies how to treat concurrent executions of a Job. Valid values are:  - \"Allow\" (default): allows CronJobs to run concurrently; - \"Forbid\": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - \"Replace\": cancels currently running job and replaces it with a new one")
  public String getConcurrencyPolicy() {
    return concurrencyPolicy;
  }

  public void setConcurrencyPolicy(@jakarta.annotation.Nullable String concurrencyPolicy) {
    this.concurrencyPolicy = concurrencyPolicy;
  }


  public V1CronJobSpec failedJobsHistoryLimit(@jakarta.annotation.Nullable Integer failedJobsHistoryLimit) {
    this.failedJobsHistoryLimit = failedJobsHistoryLimit;
    return this;
  }

  /**
   * The number of failed finished jobs to retain. Value must be non-negative integer. Defaults to 1.
   * @return failedJobsHistoryLimit
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The number of failed finished jobs to retain. Value must be non-negative integer. Defaults to 1.")
  public Integer getFailedJobsHistoryLimit() {
    return failedJobsHistoryLimit;
  }

  public void setFailedJobsHistoryLimit(@jakarta.annotation.Nullable Integer failedJobsHistoryLimit) {
    this.failedJobsHistoryLimit = failedJobsHistoryLimit;
  }


  public V1CronJobSpec jobTemplate(@jakarta.annotation.Nonnull V1JobTemplateSpec jobTemplate) {
    this.jobTemplate = jobTemplate;
    return this;
  }

  /**
   * Get jobTemplate
   * @return jobTemplate
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V1JobTemplateSpec getJobTemplate() {
    return jobTemplate;
  }

  public void setJobTemplate(@jakarta.annotation.Nonnull V1JobTemplateSpec jobTemplate) {
    this.jobTemplate = jobTemplate;
  }


  public V1CronJobSpec schedule(@jakarta.annotation.Nonnull String schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
   * @return schedule
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.")
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(@jakarta.annotation.Nonnull String schedule) {
    this.schedule = schedule;
  }


  public V1CronJobSpec startingDeadlineSeconds(@jakarta.annotation.Nullable Long startingDeadlineSeconds) {
    this.startingDeadlineSeconds = startingDeadlineSeconds;
    return this;
  }

  /**
   * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
   * @return startingDeadlineSeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.")
  public Long getStartingDeadlineSeconds() {
    return startingDeadlineSeconds;
  }

  public void setStartingDeadlineSeconds(@jakarta.annotation.Nullable Long startingDeadlineSeconds) {
    this.startingDeadlineSeconds = startingDeadlineSeconds;
  }


  public V1CronJobSpec successfulJobsHistoryLimit(@jakarta.annotation.Nullable Integer successfulJobsHistoryLimit) {
    this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
    return this;
  }

  /**
   * The number of successful finished jobs to retain. Value must be non-negative integer. Defaults to 3.
   * @return successfulJobsHistoryLimit
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The number of successful finished jobs to retain. Value must be non-negative integer. Defaults to 3.")
  public Integer getSuccessfulJobsHistoryLimit() {
    return successfulJobsHistoryLimit;
  }

  public void setSuccessfulJobsHistoryLimit(@jakarta.annotation.Nullable Integer successfulJobsHistoryLimit) {
    this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
  }


  public V1CronJobSpec suspend(@jakarta.annotation.Nullable Boolean suspend) {
    this.suspend = suspend;
    return this;
  }

  /**
   * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
   * @return suspend
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.")
  public Boolean getSuspend() {
    return suspend;
  }

  public void setSuspend(@jakarta.annotation.Nullable Boolean suspend) {
    this.suspend = suspend;
  }


  public V1CronJobSpec timeZone(@jakarta.annotation.Nullable String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * The time zone name for the given schedule, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones. If not specified, this will default to the time zone of the kube-controller-manager process. The set of valid time zone names and the time zone offset is loaded from the system-wide time zone database by the API server during CronJob validation and the controller manager during execution. If no system-wide time zone database can be found a bundled version of the database is used instead. If the time zone name becomes invalid during the lifetime of a CronJob or due to a change in host configuration, the controller will stop creating new new Jobs and will create a system event with the reason UnknownTimeZone. More information can be found in https://kubernetes.io/docs/concepts/workloads/controllers/cron-jobs/#time-zones
   * @return timeZone
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The time zone name for the given schedule, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones. If not specified, this will default to the time zone of the kube-controller-manager process. The set of valid time zone names and the time zone offset is loaded from the system-wide time zone database by the API server during CronJob validation and the controller manager during execution. If no system-wide time zone database can be found a bundled version of the database is used instead. If the time zone name becomes invalid during the lifetime of a CronJob or due to a change in host configuration, the controller will stop creating new new Jobs and will create a system event with the reason UnknownTimeZone. More information can be found in https://kubernetes.io/docs/concepts/workloads/controllers/cron-jobs/#time-zones")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(@jakarta.annotation.Nullable String timeZone) {
    this.timeZone = timeZone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CronJobSpec v1CronJobSpec = (V1CronJobSpec) o;
    return Objects.equals(this.concurrencyPolicy, v1CronJobSpec.concurrencyPolicy) &&
        Objects.equals(this.failedJobsHistoryLimit, v1CronJobSpec.failedJobsHistoryLimit) &&
        Objects.equals(this.jobTemplate, v1CronJobSpec.jobTemplate) &&
        Objects.equals(this.schedule, v1CronJobSpec.schedule) &&
        Objects.equals(this.startingDeadlineSeconds, v1CronJobSpec.startingDeadlineSeconds) &&
        Objects.equals(this.successfulJobsHistoryLimit, v1CronJobSpec.successfulJobsHistoryLimit) &&
        Objects.equals(this.suspend, v1CronJobSpec.suspend) &&
        Objects.equals(this.timeZone, v1CronJobSpec.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concurrencyPolicy, failedJobsHistoryLimit, jobTemplate, schedule, startingDeadlineSeconds, successfulJobsHistoryLimit, suspend, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CronJobSpec {\n");
    sb.append("    concurrencyPolicy: ").append(toIndentedString(concurrencyPolicy)).append("\n");
    sb.append("    failedJobsHistoryLimit: ").append(toIndentedString(failedJobsHistoryLimit)).append("\n");
    sb.append("    jobTemplate: ").append(toIndentedString(jobTemplate)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    startingDeadlineSeconds: ").append(toIndentedString(startingDeadlineSeconds)).append("\n");
    sb.append("    successfulJobsHistoryLimit: ").append(toIndentedString(successfulJobsHistoryLimit)).append("\n");
    sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
    openapiFields.add("concurrencyPolicy");
    openapiFields.add("failedJobsHistoryLimit");
    openapiFields.add("jobTemplate");
    openapiFields.add("schedule");
    openapiFields.add("startingDeadlineSeconds");
    openapiFields.add("successfulJobsHistoryLimit");
    openapiFields.add("suspend");
    openapiFields.add("timeZone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("jobTemplate");
    openapiRequiredFields.add("schedule");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1CronJobSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1CronJobSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CronJobSpec is not found in the empty JSON string", V1CronJobSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1CronJobSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CronJobSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1CronJobSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("concurrencyPolicy") != null && !jsonObj.get("concurrencyPolicy").isJsonNull()) && !jsonObj.get("concurrencyPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `concurrencyPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("concurrencyPolicy").toString()));
      }
      // validate the required field `jobTemplate`
      V1JobTemplateSpec.validateJsonElement(jsonObj.get("jobTemplate"));
      if (!jsonObj.get("schedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schedule").toString()));
      }
      if ((jsonObj.get("timeZone") != null && !jsonObj.get("timeZone").isJsonNull()) && !jsonObj.get("timeZone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeZone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeZone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CronJobSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CronJobSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CronJobSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CronJobSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CronJobSpec>() {
           @Override
           public void write(JsonWriter out, V1CronJobSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CronJobSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1CronJobSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1CronJobSpec
   * @throws IOException if the JSON string is invalid with respect to V1CronJobSpec
   */
  public static V1CronJobSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CronJobSpec.class);
  }

  /**
   * Convert an instance of V1CronJobSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
