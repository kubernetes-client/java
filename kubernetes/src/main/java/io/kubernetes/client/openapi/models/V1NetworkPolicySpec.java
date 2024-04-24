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
import io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule;
import io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule;
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
 * NetworkPolicySpec provides the specification of a NetworkPolicy
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1NetworkPolicySpec {
  public static final String SERIALIZED_NAME_EGRESS = "egress";
  @SerializedName(SERIALIZED_NAME_EGRESS)
  private List<V1NetworkPolicyEgressRule> egress;

  public static final String SERIALIZED_NAME_INGRESS = "ingress";
  @SerializedName(SERIALIZED_NAME_INGRESS)
  private List<V1NetworkPolicyIngressRule> ingress;

  public static final String SERIALIZED_NAME_POD_SELECTOR = "podSelector";
  @SerializedName(SERIALIZED_NAME_POD_SELECTOR)
  private V1LabelSelector podSelector;

  public static final String SERIALIZED_NAME_POLICY_TYPES = "policyTypes";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPES)
  private List<String> policyTypes;

  public V1NetworkPolicySpec() {
  }

  public V1NetworkPolicySpec egress(List<V1NetworkPolicyEgressRule> egress) {

    this.egress = egress;
    return this;
  }

  public V1NetworkPolicySpec addEgressItem(V1NetworkPolicyEgressRule egressItem) {
    if (this.egress == null) {
      this.egress = new ArrayList<>();
    }
    this.egress.add(egressItem);
    return this;
  }

   /**
   * egress is a list of egress rules to be applied to the selected pods. Outgoing traffic is allowed if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by default). This field is beta-level in 1.8
   * @return egress
  **/
  @jakarta.annotation.Nullable
  public List<V1NetworkPolicyEgressRule> getEgress() {
    return egress;
  }


  public void setEgress(List<V1NetworkPolicyEgressRule> egress) {
    this.egress = egress;
  }


  public V1NetworkPolicySpec ingress(List<V1NetworkPolicyIngressRule> ingress) {

    this.ingress = ingress;
    return this;
  }

  public V1NetworkPolicySpec addIngressItem(V1NetworkPolicyIngressRule ingressItem) {
    if (this.ingress == null) {
      this.ingress = new ArrayList<>();
    }
    this.ingress.add(ingressItem);
    return this;
  }

   /**
   * ingress is a list of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic source is the pod&#39;s local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the pods it selects are isolated by default)
   * @return ingress
  **/
  @jakarta.annotation.Nullable
  public List<V1NetworkPolicyIngressRule> getIngress() {
    return ingress;
  }


  public void setIngress(List<V1NetworkPolicyIngressRule> ingress) {
    this.ingress = ingress;
  }


  public V1NetworkPolicySpec podSelector(V1LabelSelector podSelector) {

    this.podSelector = podSelector;
    return this;
  }

   /**
   * Get podSelector
   * @return podSelector
  **/
  @jakarta.annotation.Nonnull
  public V1LabelSelector getPodSelector() {
    return podSelector;
  }


  public void setPodSelector(V1LabelSelector podSelector) {
    this.podSelector = podSelector;
  }


  public V1NetworkPolicySpec policyTypes(List<String> policyTypes) {

    this.policyTypes = policyTypes;
    return this;
  }

  public V1NetworkPolicySpec addPolicyTypesItem(String policyTypesItem) {
    if (this.policyTypes == null) {
      this.policyTypes = new ArrayList<>();
    }
    this.policyTypes.add(policyTypesItem);
    return this;
  }

   /**
   * policyTypes is a list of rule types that the NetworkPolicy relates to. Valid options are [\&quot;Ingress\&quot;], [\&quot;Egress\&quot;], or [\&quot;Ingress\&quot;, \&quot;Egress\&quot;]. If this field is not specified, it will default based on the existence of ingress or egress rules; policies that contain an egress section are assumed to affect egress, and all policies (whether or not they contain an ingress section) are assumed to affect ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [ \&quot;Egress\&quot; ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a policyTypes value that include \&quot;Egress\&quot; (since such a policy would not include an egress section and would otherwise default to just [ \&quot;Ingress\&quot; ]). This field is beta-level in 1.8
   * @return policyTypes
  **/
  @jakarta.annotation.Nullable
  public List<String> getPolicyTypes() {
    return policyTypes;
  }


  public void setPolicyTypes(List<String> policyTypes) {
    this.policyTypes = policyTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NetworkPolicySpec v1NetworkPolicySpec = (V1NetworkPolicySpec) o;
    return Objects.equals(this.egress, v1NetworkPolicySpec.egress) &&
        Objects.equals(this.ingress, v1NetworkPolicySpec.ingress) &&
        Objects.equals(this.podSelector, v1NetworkPolicySpec.podSelector) &&
        Objects.equals(this.policyTypes, v1NetworkPolicySpec.policyTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(egress, ingress, podSelector, policyTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NetworkPolicySpec {\n");
    sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    podSelector: ").append(toIndentedString(podSelector)).append("\n");
    sb.append("    policyTypes: ").append(toIndentedString(policyTypes)).append("\n");
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
    openapiFields.add("egress");
    openapiFields.add("ingress");
    openapiFields.add("podSelector");
    openapiFields.add("policyTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("podSelector");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1NetworkPolicySpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1NetworkPolicySpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NetworkPolicySpec is not found in the empty JSON string", V1NetworkPolicySpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1NetworkPolicySpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NetworkPolicySpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1NetworkPolicySpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("egress") != null && !jsonObj.get("egress").isJsonNull()) {
        JsonArray jsonArrayegress = jsonObj.getAsJsonArray("egress");
        if (jsonArrayegress != null) {
          // ensure the json data is an array
          if (!jsonObj.get("egress").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `egress` to be an array in the JSON string but got `%s`", jsonObj.get("egress").toString()));
          }

          // validate the optional field `egress` (array)
          for (int i = 0; i < jsonArrayegress.size(); i++) {
            V1NetworkPolicyEgressRule.validateJsonObject(jsonArrayegress.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("ingress") != null && !jsonObj.get("ingress").isJsonNull()) {
        JsonArray jsonArrayingress = jsonObj.getAsJsonArray("ingress");
        if (jsonArrayingress != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ingress").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ingress` to be an array in the JSON string but got `%s`", jsonObj.get("ingress").toString()));
          }

          // validate the optional field `ingress` (array)
          for (int i = 0; i < jsonArrayingress.size(); i++) {
            V1NetworkPolicyIngressRule.validateJsonObject(jsonArrayingress.get(i).getAsJsonObject());
          };
        }
      }
      // validate the required field `podSelector`
      V1LabelSelector.validateJsonObject(jsonObj.getAsJsonObject("podSelector"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("policyTypes") != null && !jsonObj.get("policyTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `policyTypes` to be an array in the JSON string but got `%s`", jsonObj.get("policyTypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NetworkPolicySpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NetworkPolicySpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NetworkPolicySpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NetworkPolicySpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NetworkPolicySpec>() {
           @Override
           public void write(JsonWriter out, V1NetworkPolicySpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NetworkPolicySpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1NetworkPolicySpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1NetworkPolicySpec
  * @throws IOException if the JSON string is invalid with respect to V1NetworkPolicySpec
  */
  public static V1NetworkPolicySpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NetworkPolicySpec.class);
  }

 /**
  * Convert an instance of V1NetworkPolicySpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
