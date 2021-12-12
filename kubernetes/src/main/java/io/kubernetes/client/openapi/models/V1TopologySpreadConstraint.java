/*
Copyright 2021 The Kubernetes Authors.
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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/** TopologySpreadConstraint specifies how to spread matching pods among the given topology. */
@ApiModel(
    description =
        "TopologySpreadConstraint specifies how to spread matching pods among the given topology.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1TopologySpreadConstraint {
  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";

  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  private V1LabelSelector labelSelector;

  public static final String SERIALIZED_NAME_MAX_SKEW = "maxSkew";

  @SerializedName(SERIALIZED_NAME_MAX_SKEW)
  private Integer maxSkew;

  public static final String SERIALIZED_NAME_TOPOLOGY_KEY = "topologyKey";

  @SerializedName(SERIALIZED_NAME_TOPOLOGY_KEY)
  private String topologyKey;

  /**
   * WhenUnsatisfiable indicates how to deal with a pod if it doesn&#39;t satisfy the spread
   * constraint. - DoNotSchedule (default) tells the scheduler not to schedule it. - ScheduleAnyway
   * tells the scheduler to schedule the pod in any location, but giving higher precedence to
   * topologies that would help reduce the skew. A constraint is considered
   * \&quot;Unsatisfiable\&quot; for an incoming pod if and only if every possible node assignment
   * for that pod would violate \&quot;MaxSkew\&quot; on some topology. For example, in a 3-zone
   * cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 |
   * zone2 | zone3 | | P P P | P | P | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod
   * can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3)
   * satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler
   * won&#39;t make it *more* imbalanced. It&#39;s a required field. Possible enum values: -
   * &#x60;\&quot;DoNotSchedule\&quot;&#x60; instructs the scheduler not to schedule the pod when
   * constraints are not satisfied. - &#x60;\&quot;ScheduleAnyway\&quot;&#x60; instructs the
   * scheduler to schedule the pod even if constraints are not satisfied.
   */
  @JsonAdapter(WhenUnsatisfiableEnum.Adapter.class)
  public enum WhenUnsatisfiableEnum {
    DONOTSCHEDULE("DoNotSchedule"),

    SCHEDULEANYWAY("ScheduleAnyway");

    private String value;

    WhenUnsatisfiableEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WhenUnsatisfiableEnum fromValue(String value) {
      for (WhenUnsatisfiableEnum b : WhenUnsatisfiableEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WhenUnsatisfiableEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WhenUnsatisfiableEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WhenUnsatisfiableEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WhenUnsatisfiableEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WHEN_UNSATISFIABLE = "whenUnsatisfiable";

  @SerializedName(SERIALIZED_NAME_WHEN_UNSATISFIABLE)
  private WhenUnsatisfiableEnum whenUnsatisfiable;

  public V1TopologySpreadConstraint labelSelector(V1LabelSelector labelSelector) {

    this.labelSelector = labelSelector;
    return this;
  }

  /**
   * Get labelSelector
   *
   * @return labelSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LabelSelector getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(V1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }

  public V1TopologySpreadConstraint maxSkew(Integer maxSkew) {

    this.maxSkew = maxSkew;
    return this;
  }

  /**
   * MaxSkew describes the degree to which pods may be unevenly distributed. When
   * &#x60;whenUnsatisfiable&#x3D;DoNotSchedule&#x60;, it is the maximum permitted difference
   * between the number of matching pods in the target topology and the global minimum. For example,
   * in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0:
   * | zone1 | zone2 | zone3 | | P | P | | - if MaxSkew is 1, incoming pod can only be scheduled to
   * zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on
   * zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any
   * zone. When &#x60;whenUnsatisfiable&#x3D;ScheduleAnyway&#x60;, it is used to give higher
   * precedence to topologies that satisfy it. It&#39;s a required field. Default value is 1 and 0
   * is not allowed.
   *
   * @return maxSkew
   */
  @ApiModelProperty(
      required = true,
      value =
          "MaxSkew describes the degree to which pods may be unevenly distributed. When `whenUnsatisfiable=DoNotSchedule`, it is the maximum permitted difference between the number of matching pods in the target topology and the global minimum. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. When `whenUnsatisfiable=ScheduleAnyway`, it is used to give higher precedence to topologies that satisfy it. It's a required field. Default value is 1 and 0 is not allowed.")
  public Integer getMaxSkew() {
    return maxSkew;
  }

  public void setMaxSkew(Integer maxSkew) {
    this.maxSkew = maxSkew;
  }

  public V1TopologySpreadConstraint topologyKey(String topologyKey) {

    this.topologyKey = topologyKey;
    return this;
  }

  /**
   * TopologyKey is the key of node labels. Nodes that have a label with this key and identical
   * values are considered to be in the same topology. We consider each &lt;key, value&gt; as a
   * \&quot;bucket\&quot;, and try to put balanced number of pods into each bucket. It&#39;s a
   * required field.
   *
   * @return topologyKey
   */
  @ApiModelProperty(
      required = true,
      value =
          "TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each <key, value> as a \"bucket\", and try to put balanced number of pods into each bucket. It's a required field.")
  public String getTopologyKey() {
    return topologyKey;
  }

  public void setTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
  }

  public V1TopologySpreadConstraint whenUnsatisfiable(WhenUnsatisfiableEnum whenUnsatisfiable) {

    this.whenUnsatisfiable = whenUnsatisfiable;
    return this;
  }

  /**
   * WhenUnsatisfiable indicates how to deal with a pod if it doesn&#39;t satisfy the spread
   * constraint. - DoNotSchedule (default) tells the scheduler not to schedule it. - ScheduleAnyway
   * tells the scheduler to schedule the pod in any location, but giving higher precedence to
   * topologies that would help reduce the skew. A constraint is considered
   * \&quot;Unsatisfiable\&quot; for an incoming pod if and only if every possible node assignment
   * for that pod would violate \&quot;MaxSkew\&quot; on some topology. For example, in a 3-zone
   * cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 |
   * zone2 | zone3 | | P P P | P | P | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod
   * can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3)
   * satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler
   * won&#39;t make it *more* imbalanced. It&#39;s a required field. Possible enum values: -
   * &#x60;\&quot;DoNotSchedule\&quot;&#x60; instructs the scheduler not to schedule the pod when
   * constraints are not satisfied. - &#x60;\&quot;ScheduleAnyway\&quot;&#x60; instructs the
   * scheduler to schedule the pod even if constraints are not satisfied.
   *
   * @return whenUnsatisfiable
   */
  @ApiModelProperty(
      required = true,
      value =
          "WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it. - ScheduleAnyway tells the scheduler to schedule the pod in any location,   but giving higher precedence to topologies that would help reduce the   skew. A constraint is considered \"Unsatisfiable\" for an incoming pod if and only if every possible node assignment for that pod would violate \"MaxSkew\" on some topology. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won't make it *more* imbalanced. It's a required field.  Possible enum values:  - `\"DoNotSchedule\"` instructs the scheduler not to schedule the pod when constraints are not satisfied.  - `\"ScheduleAnyway\"` instructs the scheduler to schedule the pod even if constraints are not satisfied.")
  public WhenUnsatisfiableEnum getWhenUnsatisfiable() {
    return whenUnsatisfiable;
  }

  public void setWhenUnsatisfiable(WhenUnsatisfiableEnum whenUnsatisfiable) {
    this.whenUnsatisfiable = whenUnsatisfiable;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TopologySpreadConstraint v1TopologySpreadConstraint = (V1TopologySpreadConstraint) o;
    return Objects.equals(this.labelSelector, v1TopologySpreadConstraint.labelSelector)
        && Objects.equals(this.maxSkew, v1TopologySpreadConstraint.maxSkew)
        && Objects.equals(this.topologyKey, v1TopologySpreadConstraint.topologyKey)
        && Objects.equals(this.whenUnsatisfiable, v1TopologySpreadConstraint.whenUnsatisfiable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelector, maxSkew, topologyKey, whenUnsatisfiable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TopologySpreadConstraint {\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    maxSkew: ").append(toIndentedString(maxSkew)).append("\n");
    sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
    sb.append("    whenUnsatisfiable: ").append(toIndentedString(whenUnsatisfiable)).append("\n");
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
