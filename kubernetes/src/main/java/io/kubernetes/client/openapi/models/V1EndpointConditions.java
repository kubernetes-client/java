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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EndpointConditions represents the current condition of an endpoint.
 */
@ApiModel(description = "EndpointConditions represents the current condition of an endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T16:56:46.431280Z[Etc/UTC]")
public class V1EndpointConditions {
  public static final String SERIALIZED_NAME_READY = "ready";
  @SerializedName(SERIALIZED_NAME_READY)
  private Boolean ready;

  public static final String SERIALIZED_NAME_SERVING = "serving";
  @SerializedName(SERIALIZED_NAME_SERVING)
  private Boolean serving;

  public static final String SERIALIZED_NAME_TERMINATING = "terminating";
  @SerializedName(SERIALIZED_NAME_TERMINATING)
  private Boolean terminating;


  public V1EndpointConditions ready(Boolean ready) {

    this.ready = ready;
    return this;
  }

   /**
   * ready indicates that this endpoint is ready to receive traffic, according to whatever system is managing the endpoint. A nil value should be interpreted as \&quot;true\&quot;. In general, an endpoint should be marked ready if it is serving and not terminating, though this can be overridden in some cases, such as when the associated Service has set the publishNotReadyAddresses flag.
   * @return ready
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ready indicates that this endpoint is ready to receive traffic, according to whatever system is managing the endpoint. A nil value should be interpreted as \"true\". In general, an endpoint should be marked ready if it is serving and not terminating, though this can be overridden in some cases, such as when the associated Service has set the publishNotReadyAddresses flag.")

  public Boolean getReady() {
    return ready;
  }


  public void setReady(Boolean ready) {
    this.ready = ready;
  }


  public V1EndpointConditions serving(Boolean serving) {

    this.serving = serving;
    return this;
  }

   /**
   * serving indicates that this endpoint is able to receive traffic, according to whatever system is managing the endpoint. For endpoints backed by pods, the EndpointSlice controller will mark the endpoint as serving if the pod&#39;s Ready condition is True. A nil value should be interpreted as \&quot;true\&quot;.
   * @return serving
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "serving indicates that this endpoint is able to receive traffic, according to whatever system is managing the endpoint. For endpoints backed by pods, the EndpointSlice controller will mark the endpoint as serving if the pod's Ready condition is True. A nil value should be interpreted as \"true\".")

  public Boolean getServing() {
    return serving;
  }


  public void setServing(Boolean serving) {
    this.serving = serving;
  }


  public V1EndpointConditions terminating(Boolean terminating) {

    this.terminating = terminating;
    return this;
  }

   /**
   * terminating indicates that this endpoint is terminating. A nil value should be interpreted as \&quot;false\&quot;.
   * @return terminating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "terminating indicates that this endpoint is terminating. A nil value should be interpreted as \"false\".")

  public Boolean getTerminating() {
    return terminating;
  }


  public void setTerminating(Boolean terminating) {
    this.terminating = terminating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EndpointConditions v1EndpointConditions = (V1EndpointConditions) o;
    return Objects.equals(this.ready, v1EndpointConditions.ready) &&
        Objects.equals(this.serving, v1EndpointConditions.serving) &&
        Objects.equals(this.terminating, v1EndpointConditions.terminating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ready, serving, terminating);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EndpointConditions {\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    serving: ").append(toIndentedString(serving)).append("\n");
    sb.append("    terminating: ").append(toIndentedString(terminating)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
