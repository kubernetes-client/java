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
 * QueuingConfiguration holds the configuration parameters for queuing
 */
@ApiModel(description = "QueuingConfiguration holds the configuration parameters for queuing")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T23:11:52.603861Z[Etc/UTC]")
public class V1QueuingConfiguration {
  public static final String SERIALIZED_NAME_HAND_SIZE = "handSize";
  @SerializedName(SERIALIZED_NAME_HAND_SIZE)
  private Integer handSize;

  public static final String SERIALIZED_NAME_QUEUE_LENGTH_LIMIT = "queueLengthLimit";
  @SerializedName(SERIALIZED_NAME_QUEUE_LENGTH_LIMIT)
  private Integer queueLengthLimit;

  public static final String SERIALIZED_NAME_QUEUES = "queues";
  @SerializedName(SERIALIZED_NAME_QUEUES)
  private Integer queues;


  public V1QueuingConfiguration handSize(Integer handSize) {

    this.handSize = handSize;
    return this;
  }

   /**
   * &#x60;handSize&#x60; is a small positive number that configures the shuffle sharding of requests into queues.  When enqueuing a request at this priority level the request&#39;s flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. &#x60;handSize&#x60; must be no larger than &#x60;queues&#x60;, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.
   * @return handSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`handSize` is a small positive number that configures the shuffle sharding of requests into queues.  When enqueuing a request at this priority level the request's flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. `handSize` must be no larger than `queues`, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.")

  public Integer getHandSize() {
    return handSize;
  }


  public void setHandSize(Integer handSize) {
    this.handSize = handSize;
  }


  public V1QueuingConfiguration queueLengthLimit(Integer queueLengthLimit) {

    this.queueLengthLimit = queueLengthLimit;
    return this;
  }

   /**
   * &#x60;queueLengthLimit&#x60; is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time; excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.
   * @return queueLengthLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`queueLengthLimit` is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time; excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.")

  public Integer getQueueLengthLimit() {
    return queueLengthLimit;
  }


  public void setQueueLengthLimit(Integer queueLengthLimit) {
    this.queueLengthLimit = queueLengthLimit;
  }


  public V1QueuingConfiguration queues(Integer queues) {

    this.queues = queues;
    return this;
  }

   /**
   * &#x60;queues&#x60; is the number of queues for this priority level. The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.
   * @return queues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`queues` is the number of queues for this priority level. The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.")

  public Integer getQueues() {
    return queues;
  }


  public void setQueues(Integer queues) {
    this.queues = queues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1QueuingConfiguration v1QueuingConfiguration = (V1QueuingConfiguration) o;
    return Objects.equals(this.handSize, v1QueuingConfiguration.handSize) &&
        Objects.equals(this.queueLengthLimit, v1QueuingConfiguration.queueLengthLimit) &&
        Objects.equals(this.queues, v1QueuingConfiguration.queues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handSize, queueLengthLimit, queues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1QueuingConfiguration {\n");
    sb.append("    handSize: ").append(toIndentedString(handSize)).append("\n");
    sb.append("    queueLengthLimit: ").append(toIndentedString(queueLengthLimit)).append("\n");
    sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
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
