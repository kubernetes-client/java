/*
Copyright 2020 The Kubernetes Authors.
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
package io.cert.manager.models;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/** V1beta1ChallengeStatus */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1beta1ChallengeStatus {
  public static final String SERIALIZED_NAME_PRESENTED = "presented";

  @SerializedName(SERIALIZED_NAME_PRESENTED)
  private Boolean presented;

  public static final String SERIALIZED_NAME_PROCESSING = "processing";

  @SerializedName(SERIALIZED_NAME_PROCESSING)
  private Boolean processing;

  public static final String SERIALIZED_NAME_REASON = "reason";

  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  /**
   * Contains the current &#39;state&#39; of the challenge. If not set, the state of the challenge
   * is unknown.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    VALID("valid"),

    READY("ready"),

    PENDING("pending"),

    PROCESSING("processing"),

    INVALID("invalid"),

    EXPIRED("expired"),

    ERRORED("errored");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";

  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public V1beta1ChallengeStatus presented(Boolean presented) {

    this.presented = presented;
    return this;
  }

  /**
   * presented will be set to true if the challenge values for this challenge are currently
   * &#39;presented&#39;. This *does not* imply the self check is passing. Only that the values have
   * been &#39;submitted&#39; for the appropriate challenge mechanism (i.e. the DNS01 TXT record has
   * been presented, or the HTTP01 configuration has been configured).
   *
   * @return presented
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "presented will be set to true if the challenge values for this challenge are currently 'presented'. This *does not* imply the self check is passing. Only that the values have been 'submitted' for the appropriate challenge mechanism (i.e. the DNS01 TXT record has been presented, or the HTTP01 configuration has been configured).")
  public Boolean getPresented() {
    return presented;
  }

  public void setPresented(Boolean presented) {
    this.presented = presented;
  }

  public V1beta1ChallengeStatus processing(Boolean processing) {

    this.processing = processing;
    return this;
  }

  /**
   * Used to denote whether this challenge should be processed or not. This field will only be set
   * to true by the &#39;scheduling&#39; component. It will only be set to false by the
   * &#39;challenges&#39; controller, after the challenge has reached a final state or timed out. If
   * this field is set to false, the challenge controller will not take any more action.
   *
   * @return processing
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Used to denote whether this challenge should be processed or not. This field will only be set to true by the 'scheduling' component. It will only be set to false by the 'challenges' controller, after the challenge has reached a final state or timed out. If this field is set to false, the challenge controller will not take any more action.")
  public Boolean getProcessing() {
    return processing;
  }

  public void setProcessing(Boolean processing) {
    this.processing = processing;
  }

  public V1beta1ChallengeStatus reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * Contains human readable information on why the Challenge is in the current state.
   *
   * @return reason
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Contains human readable information on why the Challenge is in the current state.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1beta1ChallengeStatus state(StateEnum state) {

    this.state = state;
    return this;
  }

  /**
   * Contains the current &#39;state&#39; of the challenge. If not set, the state of the challenge
   * is unknown.
   *
   * @return state
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Contains the current 'state' of the challenge. If not set, the state of the challenge is unknown.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ChallengeStatus v1beta1ChallengeStatus = (V1beta1ChallengeStatus) o;
    return Objects.equals(this.presented, v1beta1ChallengeStatus.presented)
        && Objects.equals(this.processing, v1beta1ChallengeStatus.processing)
        && Objects.equals(this.reason, v1beta1ChallengeStatus.reason)
        && Objects.equals(this.state, v1beta1ChallengeStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presented, processing, reason, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ChallengeStatus {\n");
    sb.append("    presented: ").append(toIndentedString(presented)).append("\n");
    sb.append("    processing: ").append(toIndentedString(processing)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
