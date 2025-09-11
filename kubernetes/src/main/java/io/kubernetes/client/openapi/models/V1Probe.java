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
import io.kubernetes.client.openapi.models.V1ExecAction;
import io.kubernetes.client.openapi.models.V1GRPCAction;
import io.kubernetes.client.openapi.models.V1HTTPGetAction;
import io.kubernetes.client.openapi.models.V1TCPSocketAction;
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
 * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
 */
@ApiModel(description = "Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1Probe {
  public static final String SERIALIZED_NAME_EXEC = "exec";
  @SerializedName(SERIALIZED_NAME_EXEC)
  @jakarta.annotation.Nullable
  private V1ExecAction exec;

  public static final String SERIALIZED_NAME_FAILURE_THRESHOLD = "failureThreshold";
  @SerializedName(SERIALIZED_NAME_FAILURE_THRESHOLD)
  @jakarta.annotation.Nullable
  private Integer failureThreshold;

  public static final String SERIALIZED_NAME_GRPC = "grpc";
  @SerializedName(SERIALIZED_NAME_GRPC)
  @jakarta.annotation.Nullable
  private V1GRPCAction grpc;

  public static final String SERIALIZED_NAME_HTTP_GET = "httpGet";
  @SerializedName(SERIALIZED_NAME_HTTP_GET)
  @jakarta.annotation.Nullable
  private V1HTTPGetAction httpGet;

  public static final String SERIALIZED_NAME_INITIAL_DELAY_SECONDS = "initialDelaySeconds";
  @SerializedName(SERIALIZED_NAME_INITIAL_DELAY_SECONDS)
  @jakarta.annotation.Nullable
  private Integer initialDelaySeconds;

  public static final String SERIALIZED_NAME_PERIOD_SECONDS = "periodSeconds";
  @SerializedName(SERIALIZED_NAME_PERIOD_SECONDS)
  @jakarta.annotation.Nullable
  private Integer periodSeconds;

  public static final String SERIALIZED_NAME_SUCCESS_THRESHOLD = "successThreshold";
  @SerializedName(SERIALIZED_NAME_SUCCESS_THRESHOLD)
  @jakarta.annotation.Nullable
  private Integer successThreshold;

  public static final String SERIALIZED_NAME_TCP_SOCKET = "tcpSocket";
  @SerializedName(SERIALIZED_NAME_TCP_SOCKET)
  @jakarta.annotation.Nullable
  private V1TCPSocketAction tcpSocket;

  public static final String SERIALIZED_NAME_TERMINATION_GRACE_PERIOD_SECONDS = "terminationGracePeriodSeconds";
  @SerializedName(SERIALIZED_NAME_TERMINATION_GRACE_PERIOD_SECONDS)
  @jakarta.annotation.Nullable
  private Long terminationGracePeriodSeconds;

  public static final String SERIALIZED_NAME_TIMEOUT_SECONDS = "timeoutSeconds";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_SECONDS)
  @jakarta.annotation.Nullable
  private Integer timeoutSeconds;

  public V1Probe() {
  }

  public V1Probe exec(@jakarta.annotation.Nullable V1ExecAction exec) {
    this.exec = exec;
    return this;
  }

  /**
   * Get exec
   * @return exec
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ExecAction getExec() {
    return exec;
  }

  public void setExec(@jakarta.annotation.Nullable V1ExecAction exec) {
    this.exec = exec;
  }


  public V1Probe failureThreshold(@jakarta.annotation.Nullable Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
    return this;
  }

  /**
   * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
   * @return failureThreshold
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.")
  public Integer getFailureThreshold() {
    return failureThreshold;
  }

  public void setFailureThreshold(@jakarta.annotation.Nullable Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
  }


  public V1Probe grpc(@jakarta.annotation.Nullable V1GRPCAction grpc) {
    this.grpc = grpc;
    return this;
  }

  /**
   * Get grpc
   * @return grpc
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1GRPCAction getGrpc() {
    return grpc;
  }

  public void setGrpc(@jakarta.annotation.Nullable V1GRPCAction grpc) {
    this.grpc = grpc;
  }


  public V1Probe httpGet(@jakarta.annotation.Nullable V1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
    return this;
  }

  /**
   * Get httpGet
   * @return httpGet
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1HTTPGetAction getHttpGet() {
    return httpGet;
  }

  public void setHttpGet(@jakarta.annotation.Nullable V1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
  }


  public V1Probe initialDelaySeconds(@jakarta.annotation.Nullable Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
    return this;
  }

  /**
   * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * @return initialDelaySeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
  public Integer getInitialDelaySeconds() {
    return initialDelaySeconds;
  }

  public void setInitialDelaySeconds(@jakarta.annotation.Nullable Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
  }


  public V1Probe periodSeconds(@jakarta.annotation.Nullable Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return this;
  }

  /**
   * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
   * @return periodSeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.")
  public Integer getPeriodSeconds() {
    return periodSeconds;
  }

  public void setPeriodSeconds(@jakarta.annotation.Nullable Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }


  public V1Probe successThreshold(@jakarta.annotation.Nullable Integer successThreshold) {
    this.successThreshold = successThreshold;
    return this;
  }

  /**
   * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
   * @return successThreshold
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.")
  public Integer getSuccessThreshold() {
    return successThreshold;
  }

  public void setSuccessThreshold(@jakarta.annotation.Nullable Integer successThreshold) {
    this.successThreshold = successThreshold;
  }


  public V1Probe tcpSocket(@jakarta.annotation.Nullable V1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
    return this;
  }

  /**
   * Get tcpSocket
   * @return tcpSocket
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1TCPSocketAction getTcpSocket() {
    return tcpSocket;
  }

  public void setTcpSocket(@jakarta.annotation.Nullable V1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
  }


  public V1Probe terminationGracePeriodSeconds(@jakarta.annotation.Nullable Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    return this;
  }

  /**
   * Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod&#39;s terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
   * @return terminationGracePeriodSeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.")
  public Long getTerminationGracePeriodSeconds() {
    return terminationGracePeriodSeconds;
  }

  public void setTerminationGracePeriodSeconds(@jakarta.annotation.Nullable Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
  }


  public V1Probe timeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  /**
   * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * @return timeoutSeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Probe v1Probe = (V1Probe) o;
    return Objects.equals(this.exec, v1Probe.exec) &&
        Objects.equals(this.failureThreshold, v1Probe.failureThreshold) &&
        Objects.equals(this.grpc, v1Probe.grpc) &&
        Objects.equals(this.httpGet, v1Probe.httpGet) &&
        Objects.equals(this.initialDelaySeconds, v1Probe.initialDelaySeconds) &&
        Objects.equals(this.periodSeconds, v1Probe.periodSeconds) &&
        Objects.equals(this.successThreshold, v1Probe.successThreshold) &&
        Objects.equals(this.tcpSocket, v1Probe.tcpSocket) &&
        Objects.equals(this.terminationGracePeriodSeconds, v1Probe.terminationGracePeriodSeconds) &&
        Objects.equals(this.timeoutSeconds, v1Probe.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exec, failureThreshold, grpc, httpGet, initialDelaySeconds, periodSeconds, successThreshold, tcpSocket, terminationGracePeriodSeconds, timeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Probe {\n");
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
    sb.append("    grpc: ").append(toIndentedString(grpc)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
    sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    successThreshold: ").append(toIndentedString(successThreshold)).append("\n");
    sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
    sb.append("    terminationGracePeriodSeconds: ").append(toIndentedString(terminationGracePeriodSeconds)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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
    openapiFields.add("exec");
    openapiFields.add("failureThreshold");
    openapiFields.add("grpc");
    openapiFields.add("httpGet");
    openapiFields.add("initialDelaySeconds");
    openapiFields.add("periodSeconds");
    openapiFields.add("successThreshold");
    openapiFields.add("tcpSocket");
    openapiFields.add("terminationGracePeriodSeconds");
    openapiFields.add("timeoutSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1Probe
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1Probe.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1Probe is not found in the empty JSON string", V1Probe.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1Probe.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1Probe` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `exec`
      if (jsonObj.get("exec") != null && !jsonObj.get("exec").isJsonNull()) {
        V1ExecAction.validateJsonElement(jsonObj.get("exec"));
      }
      // validate the optional field `grpc`
      if (jsonObj.get("grpc") != null && !jsonObj.get("grpc").isJsonNull()) {
        V1GRPCAction.validateJsonElement(jsonObj.get("grpc"));
      }
      // validate the optional field `httpGet`
      if (jsonObj.get("httpGet") != null && !jsonObj.get("httpGet").isJsonNull()) {
        V1HTTPGetAction.validateJsonElement(jsonObj.get("httpGet"));
      }
      // validate the optional field `tcpSocket`
      if (jsonObj.get("tcpSocket") != null && !jsonObj.get("tcpSocket").isJsonNull()) {
        V1TCPSocketAction.validateJsonElement(jsonObj.get("tcpSocket"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1Probe.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1Probe' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1Probe> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1Probe.class));

       return (TypeAdapter<T>) new TypeAdapter<V1Probe>() {
           @Override
           public void write(JsonWriter out, V1Probe value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1Probe read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1Probe given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1Probe
   * @throws IOException if the JSON string is invalid with respect to V1Probe
   */
  public static V1Probe fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1Probe.class);
  }

  /**
   * Convert an instance of V1Probe to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
