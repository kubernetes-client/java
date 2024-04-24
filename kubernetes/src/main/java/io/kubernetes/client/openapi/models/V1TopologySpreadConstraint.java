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
import io.kubernetes.client.openapi.models.V1LabelSelector;
import java.io.IOException;
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
 * TopologySpreadConstraint specifies how to spread matching pods among the given topology.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1TopologySpreadConstraint {
  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";
  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  private V1LabelSelector labelSelector;

  public static final String SERIALIZED_NAME_MATCH_LABEL_KEYS = "matchLabelKeys";
  @SerializedName(SERIALIZED_NAME_MATCH_LABEL_KEYS)
  private List<String> matchLabelKeys;

  public static final String SERIALIZED_NAME_MAX_SKEW = "maxSkew";
  @SerializedName(SERIALIZED_NAME_MAX_SKEW)
  private Integer maxSkew;

  public static final String SERIALIZED_NAME_MIN_DOMAINS = "minDomains";
  @SerializedName(SERIALIZED_NAME_MIN_DOMAINS)
  private Integer minDomains;

  public static final String SERIALIZED_NAME_NODE_AFFINITY_POLICY = "nodeAffinityPolicy";
  @SerializedName(SERIALIZED_NAME_NODE_AFFINITY_POLICY)
  private String nodeAffinityPolicy;

  public static final String SERIALIZED_NAME_NODE_TAINTS_POLICY = "nodeTaintsPolicy";
  @SerializedName(SERIALIZED_NAME_NODE_TAINTS_POLICY)
  private String nodeTaintsPolicy;

  public static final String SERIALIZED_NAME_TOPOLOGY_KEY = "topologyKey";
  @SerializedName(SERIALIZED_NAME_TOPOLOGY_KEY)
  private String topologyKey;

  public static final String SERIALIZED_NAME_WHEN_UNSATISFIABLE = "whenUnsatisfiable";
  @SerializedName(SERIALIZED_NAME_WHEN_UNSATISFIABLE)
  private String whenUnsatisfiable;

  public V1TopologySpreadConstraint() {
  }

  public V1TopologySpreadConstraint labelSelector(V1LabelSelector labelSelector) {

    this.labelSelector = labelSelector;
    return this;
  }

   /**
   * Get labelSelector
   * @return labelSelector
  **/
  @jakarta.annotation.Nullable
  public V1LabelSelector getLabelSelector() {
    return labelSelector;
  }


  public void setLabelSelector(V1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }


  public V1TopologySpreadConstraint matchLabelKeys(List<String> matchLabelKeys) {

    this.matchLabelKeys = matchLabelKeys;
    return this;
  }

  public V1TopologySpreadConstraint addMatchLabelKeysItem(String matchLabelKeysItem) {
    if (this.matchLabelKeys == null) {
      this.matchLabelKeys = new ArrayList<>();
    }
    this.matchLabelKeys.add(matchLabelKeysItem);
    return this;
  }

   /**
   * MatchLabelKeys is a set of pod label keys to select the pods over which spreading will be calculated. The keys are used to lookup values from the incoming pod labels, those key-value labels are ANDed with labelSelector to select the group of existing pods over which spreading will be calculated for the incoming pod. The same key is forbidden to exist in both MatchLabelKeys and LabelSelector. MatchLabelKeys cannot be set when LabelSelector isn&#39;t set. Keys that don&#39;t exist in the incoming pod labels will be ignored. A null or empty list means only match against labelSelector.  This is a beta field and requires the MatchLabelKeysInPodTopologySpread feature gate to be enabled (enabled by default).
   * @return matchLabelKeys
  **/
  @jakarta.annotation.Nullable
  public List<String> getMatchLabelKeys() {
    return matchLabelKeys;
  }


  public void setMatchLabelKeys(List<String> matchLabelKeys) {
    this.matchLabelKeys = matchLabelKeys;
  }


  public V1TopologySpreadConstraint maxSkew(Integer maxSkew) {

    this.maxSkew = maxSkew;
    return this;
  }

   /**
   * MaxSkew describes the degree to which pods may be unevenly distributed. When &#x60;whenUnsatisfiable&#x3D;DoNotSchedule&#x60;, it is the maximum permitted difference between the number of matching pods in the target topology and the global minimum. The global minimum is the minimum number of matching pods in an eligible domain or zero if the number of eligible domains is less than MinDomains. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 2/2/1: In this case, the global minimum is 1. | zone1 | zone2 | zone3 | |  P P  |  P P  |   P   | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 2/2/2; scheduling it onto zone1(zone2) would make the ActualSkew(3-1) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. When &#x60;whenUnsatisfiable&#x3D;ScheduleAnyway&#x60;, it is used to give higher precedence to topologies that satisfy it. It&#39;s a required field. Default value is 1 and 0 is not allowed.
   * @return maxSkew
  **/
  @jakarta.annotation.Nonnull
  public Integer getMaxSkew() {
    return maxSkew;
  }


  public void setMaxSkew(Integer maxSkew) {
    this.maxSkew = maxSkew;
  }


  public V1TopologySpreadConstraint minDomains(Integer minDomains) {

    this.minDomains = minDomains;
    return this;
  }

   /**
   * MinDomains indicates a minimum number of eligible domains. When the number of eligible domains with matching topology keys is less than minDomains, Pod Topology Spread treats \&quot;global minimum\&quot; as 0, and then the calculation of Skew is performed. And when the number of eligible domains with matching topology keys equals or greater than minDomains, this value has no effect on scheduling. As a result, when the number of eligible domains is less than minDomains, scheduler won&#39;t schedule more than maxSkew Pods to those domains. If value is nil, the constraint behaves as if MinDomains is equal to 1. Valid values are integers greater than 0. When value is not nil, WhenUnsatisfiable must be DoNotSchedule.  For example, in a 3-zone cluster, MaxSkew is set to 2, MinDomains is set to 5 and pods with the same labelSelector spread as 2/2/2: | zone1 | zone2 | zone3 | |  P P  |  P P  |  P P  | The number of domains is less than 5(MinDomains), so \&quot;global minimum\&quot; is treated as 0. In this situation, new pod with the same labelSelector cannot be scheduled, because computed skew will be 3(3 - 0) if new Pod is scheduled to any of the three zones, it will violate MaxSkew.
   * @return minDomains
  **/
  @jakarta.annotation.Nullable
  public Integer getMinDomains() {
    return minDomains;
  }


  public void setMinDomains(Integer minDomains) {
    this.minDomains = minDomains;
  }


  public V1TopologySpreadConstraint nodeAffinityPolicy(String nodeAffinityPolicy) {

    this.nodeAffinityPolicy = nodeAffinityPolicy;
    return this;
  }

   /**
   * NodeAffinityPolicy indicates how we will treat Pod&#39;s nodeAffinity/nodeSelector when calculating pod topology spread skew. Options are: - Honor: only nodes matching nodeAffinity/nodeSelector are included in the calculations. - Ignore: nodeAffinity/nodeSelector are ignored. All nodes are included in the calculations.  If this value is nil, the behavior is equivalent to the Honor policy. This is a beta-level feature default enabled by the NodeInclusionPolicyInPodTopologySpread feature flag.
   * @return nodeAffinityPolicy
  **/
  @jakarta.annotation.Nullable
  public String getNodeAffinityPolicy() {
    return nodeAffinityPolicy;
  }


  public void setNodeAffinityPolicy(String nodeAffinityPolicy) {
    this.nodeAffinityPolicy = nodeAffinityPolicy;
  }


  public V1TopologySpreadConstraint nodeTaintsPolicy(String nodeTaintsPolicy) {

    this.nodeTaintsPolicy = nodeTaintsPolicy;
    return this;
  }

   /**
   * NodeTaintsPolicy indicates how we will treat node taints when calculating pod topology spread skew. Options are: - Honor: nodes without taints, along with tainted nodes for which the incoming pod has a toleration, are included. - Ignore: node taints are ignored. All nodes are included.  If this value is nil, the behavior is equivalent to the Ignore policy. This is a beta-level feature default enabled by the NodeInclusionPolicyInPodTopologySpread feature flag.
   * @return nodeTaintsPolicy
  **/
  @jakarta.annotation.Nullable
  public String getNodeTaintsPolicy() {
    return nodeTaintsPolicy;
  }


  public void setNodeTaintsPolicy(String nodeTaintsPolicy) {
    this.nodeTaintsPolicy = nodeTaintsPolicy;
  }


  public V1TopologySpreadConstraint topologyKey(String topologyKey) {

    this.topologyKey = topologyKey;
    return this;
  }

   /**
   * TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each &lt;key, value&gt; as a \&quot;bucket\&quot;, and try to put balanced number of pods into each bucket. We define a domain as a particular instance of a topology. Also, we define an eligible domain as a domain whose nodes meet the requirements of nodeAffinityPolicy and nodeTaintsPolicy. e.g. If TopologyKey is \&quot;kubernetes.io/hostname\&quot;, each Node is a domain of that topology. And, if TopologyKey is \&quot;topology.kubernetes.io/zone\&quot;, each zone is a domain of that topology. It&#39;s a required field.
   * @return topologyKey
  **/
  @jakarta.annotation.Nonnull
  public String getTopologyKey() {
    return topologyKey;
  }


  public void setTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
  }


  public V1TopologySpreadConstraint whenUnsatisfiable(String whenUnsatisfiable) {

    this.whenUnsatisfiable = whenUnsatisfiable;
    return this;
  }

   /**
   * WhenUnsatisfiable indicates how to deal with a pod if it doesn&#39;t satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it. - ScheduleAnyway tells the scheduler to schedule the pod in any location,   but giving higher precedence to topologies that would help reduce the   skew. A constraint is considered \&quot;Unsatisfiable\&quot; for an incoming pod if and only if every possible node assignment for that pod would violate \&quot;MaxSkew\&quot; on some topology. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won&#39;t make it *more* imbalanced. It&#39;s a required field.
   * @return whenUnsatisfiable
  **/
  @jakarta.annotation.Nonnull
  public String getWhenUnsatisfiable() {
    return whenUnsatisfiable;
  }


  public void setWhenUnsatisfiable(String whenUnsatisfiable) {
    this.whenUnsatisfiable = whenUnsatisfiable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TopologySpreadConstraint v1TopologySpreadConstraint = (V1TopologySpreadConstraint) o;
    return Objects.equals(this.labelSelector, v1TopologySpreadConstraint.labelSelector) &&
        Objects.equals(this.matchLabelKeys, v1TopologySpreadConstraint.matchLabelKeys) &&
        Objects.equals(this.maxSkew, v1TopologySpreadConstraint.maxSkew) &&
        Objects.equals(this.minDomains, v1TopologySpreadConstraint.minDomains) &&
        Objects.equals(this.nodeAffinityPolicy, v1TopologySpreadConstraint.nodeAffinityPolicy) &&
        Objects.equals(this.nodeTaintsPolicy, v1TopologySpreadConstraint.nodeTaintsPolicy) &&
        Objects.equals(this.topologyKey, v1TopologySpreadConstraint.topologyKey) &&
        Objects.equals(this.whenUnsatisfiable, v1TopologySpreadConstraint.whenUnsatisfiable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelector, matchLabelKeys, maxSkew, minDomains, nodeAffinityPolicy, nodeTaintsPolicy, topologyKey, whenUnsatisfiable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TopologySpreadConstraint {\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    matchLabelKeys: ").append(toIndentedString(matchLabelKeys)).append("\n");
    sb.append("    maxSkew: ").append(toIndentedString(maxSkew)).append("\n");
    sb.append("    minDomains: ").append(toIndentedString(minDomains)).append("\n");
    sb.append("    nodeAffinityPolicy: ").append(toIndentedString(nodeAffinityPolicy)).append("\n");
    sb.append("    nodeTaintsPolicy: ").append(toIndentedString(nodeTaintsPolicy)).append("\n");
    sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
    sb.append("    whenUnsatisfiable: ").append(toIndentedString(whenUnsatisfiable)).append("\n");
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
    openapiFields.add("labelSelector");
    openapiFields.add("matchLabelKeys");
    openapiFields.add("maxSkew");
    openapiFields.add("minDomains");
    openapiFields.add("nodeAffinityPolicy");
    openapiFields.add("nodeTaintsPolicy");
    openapiFields.add("topologyKey");
    openapiFields.add("whenUnsatisfiable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("maxSkew");
    openapiRequiredFields.add("topologyKey");
    openapiRequiredFields.add("whenUnsatisfiable");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1TopologySpreadConstraint
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1TopologySpreadConstraint.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1TopologySpreadConstraint is not found in the empty JSON string", V1TopologySpreadConstraint.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1TopologySpreadConstraint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1TopologySpreadConstraint` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1TopologySpreadConstraint.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `labelSelector`
      if (jsonObj.get("labelSelector") != null && !jsonObj.get("labelSelector").isJsonNull()) {
        V1LabelSelector.validateJsonObject(jsonObj.getAsJsonObject("labelSelector"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("matchLabelKeys") != null && !jsonObj.get("matchLabelKeys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchLabelKeys` to be an array in the JSON string but got `%s`", jsonObj.get("matchLabelKeys").toString()));
      }
      if ((jsonObj.get("nodeAffinityPolicy") != null && !jsonObj.get("nodeAffinityPolicy").isJsonNull()) && !jsonObj.get("nodeAffinityPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeAffinityPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeAffinityPolicy").toString()));
      }
      if ((jsonObj.get("nodeTaintsPolicy") != null && !jsonObj.get("nodeTaintsPolicy").isJsonNull()) && !jsonObj.get("nodeTaintsPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeTaintsPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeTaintsPolicy").toString()));
      }
      if (!jsonObj.get("topologyKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topologyKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topologyKey").toString()));
      }
      if (!jsonObj.get("whenUnsatisfiable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `whenUnsatisfiable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("whenUnsatisfiable").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1TopologySpreadConstraint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1TopologySpreadConstraint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1TopologySpreadConstraint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1TopologySpreadConstraint.class));

       return (TypeAdapter<T>) new TypeAdapter<V1TopologySpreadConstraint>() {
           @Override
           public void write(JsonWriter out, V1TopologySpreadConstraint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1TopologySpreadConstraint read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1TopologySpreadConstraint given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1TopologySpreadConstraint
  * @throws IOException if the JSON string is invalid with respect to V1TopologySpreadConstraint
  */
  public static V1TopologySpreadConstraint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1TopologySpreadConstraint.class);
  }

 /**
  * Convert an instance of V1TopologySpreadConstraint to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
