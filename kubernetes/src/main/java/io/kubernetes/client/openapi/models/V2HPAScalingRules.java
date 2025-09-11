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
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.models.V2HPAScalingPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * HPAScalingRules configures the scaling behavior for one direction via scaling Policy Rules and a configurable metric tolerance.  Scaling Policy Rules are applied after calculating DesiredReplicas from metrics for the HPA. They can limit the scaling velocity by specifying scaling policies. They can prevent flapping by specifying the stabilization window, so that the number of replicas is not set instantly, instead, the safest value from the stabilization window is chosen.  The tolerance is applied to the metric values and prevents scaling too eagerly for small metric variations. (Note that setting a tolerance requires enabling the alpha HPAConfigurableTolerance feature gate.)
 */
@ApiModel(description = "HPAScalingRules configures the scaling behavior for one direction via scaling Policy Rules and a configurable metric tolerance.  Scaling Policy Rules are applied after calculating DesiredReplicas from metrics for the HPA. They can limit the scaling velocity by specifying scaling policies. They can prevent flapping by specifying the stabilization window, so that the number of replicas is not set instantly, instead, the safest value from the stabilization window is chosen.  The tolerance is applied to the metric values and prevents scaling too eagerly for small metric variations. (Note that setting a tolerance requires enabling the alpha HPAConfigurableTolerance feature gate.)")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V2HPAScalingRules {
  public static final String SERIALIZED_NAME_POLICIES = "policies";
  @SerializedName(SERIALIZED_NAME_POLICIES)
  @jakarta.annotation.Nullable
  private List<V2HPAScalingPolicy> policies = new ArrayList<>();

  public static final String SERIALIZED_NAME_SELECT_POLICY = "selectPolicy";
  @SerializedName(SERIALIZED_NAME_SELECT_POLICY)
  @jakarta.annotation.Nullable
  private String selectPolicy;

  public static final String SERIALIZED_NAME_STABILIZATION_WINDOW_SECONDS = "stabilizationWindowSeconds";
  @SerializedName(SERIALIZED_NAME_STABILIZATION_WINDOW_SECONDS)
  @jakarta.annotation.Nullable
  private Integer stabilizationWindowSeconds;

  public static final String SERIALIZED_NAME_TOLERANCE = "tolerance";
  @SerializedName(SERIALIZED_NAME_TOLERANCE)
  @jakarta.annotation.Nullable
  private Quantity tolerance;

  public V2HPAScalingRules() {
  }

  public V2HPAScalingRules policies(@jakarta.annotation.Nullable List<V2HPAScalingPolicy> policies) {
    this.policies = policies;
    return this;
  }

  public V2HPAScalingRules addPoliciesItem(V2HPAScalingPolicy policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<>();
    }
    this.policies.add(policiesItem);
    return this;
  }

  /**
   * policies is a list of potential scaling polices which can be used during scaling. If not set, use the default values: - For scale up: allow doubling the number of pods, or an absolute change of 4 pods in a 15s window. - For scale down: allow all pods to be removed in a 15s window.
   * @return policies
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "policies is a list of potential scaling polices which can be used during scaling. If not set, use the default values: - For scale up: allow doubling the number of pods, or an absolute change of 4 pods in a 15s window. - For scale down: allow all pods to be removed in a 15s window.")
  public List<V2HPAScalingPolicy> getPolicies() {
    return policies;
  }

  public void setPolicies(@jakarta.annotation.Nullable List<V2HPAScalingPolicy> policies) {
    this.policies = policies;
  }


  public V2HPAScalingRules selectPolicy(@jakarta.annotation.Nullable String selectPolicy) {
    this.selectPolicy = selectPolicy;
    return this;
  }

  /**
   * selectPolicy is used to specify which policy should be used. If not set, the default value Max is used.
   * @return selectPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "selectPolicy is used to specify which policy should be used. If not set, the default value Max is used.")
  public String getSelectPolicy() {
    return selectPolicy;
  }

  public void setSelectPolicy(@jakarta.annotation.Nullable String selectPolicy) {
    this.selectPolicy = selectPolicy;
  }


  public V2HPAScalingRules stabilizationWindowSeconds(@jakarta.annotation.Nullable Integer stabilizationWindowSeconds) {
    this.stabilizationWindowSeconds = stabilizationWindowSeconds;
    return this;
  }

  /**
   * stabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down. StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).
   * @return stabilizationWindowSeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "stabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down. StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).")
  public Integer getStabilizationWindowSeconds() {
    return stabilizationWindowSeconds;
  }

  public void setStabilizationWindowSeconds(@jakarta.annotation.Nullable Integer stabilizationWindowSeconds) {
    this.stabilizationWindowSeconds = stabilizationWindowSeconds;
  }


  public V2HPAScalingRules tolerance(@jakarta.annotation.Nullable Quantity tolerance) {
    this.tolerance = tolerance;
    return this;
  }

  /**
   * Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  &#x60;&#x60;&#x60; &lt;quantity&gt;        ::&#x3D; &lt;signedNumber&gt;&lt;suffix&gt;   (Note that &lt;suffix&gt; may be empty, from the \&quot;\&quot; case in &lt;decimalSI&gt;.)  &lt;digit&gt;           ::&#x3D; 0 | 1 | ... | 9 &lt;digits&gt;          ::&#x3D; &lt;digit&gt; | &lt;digit&gt;&lt;digits&gt; &lt;number&gt;          ::&#x3D; &lt;digits&gt; | &lt;digits&gt;.&lt;digits&gt; | &lt;digits&gt;. | .&lt;digits&gt; &lt;sign&gt;            ::&#x3D; \&quot;+\&quot; | \&quot;-\&quot; &lt;signedNumber&gt;    ::&#x3D; &lt;number&gt; | &lt;sign&gt;&lt;number&gt; &lt;suffix&gt;          ::&#x3D; &lt;binarySI&gt; | &lt;decimalExponent&gt; | &lt;decimalSI&gt; &lt;binarySI&gt;        ::&#x3D; Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)  &lt;decimalSI&gt;       ::&#x3D; m | \&quot;\&quot; | k | M | G | T | P | E   (Note that 1024 &#x3D; 1Ki but 1000 &#x3D; 1k; I didn&#39;t choose the capitalization.)  &lt;decimalExponent&gt; ::&#x3D; \&quot;e\&quot; &lt;signedNumber&gt; | \&quot;E\&quot; &lt;signedNumber&gt; &#x60;&#x60;&#x60;  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \&quot;canonical form\&quot;. This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:  - No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.  The sign will be omitted unless the number is negative.  Examples:  - 1.5 will be serialized as \&quot;1500m\&quot; - 1.5Gi will be serialized as \&quot;1536Mi\&quot;  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don&#39;t diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.
   * @return tolerance
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  ``` <quantity>        ::= <signedNumber><suffix>   (Note that <suffix> may be empty, from the \"\" case in <decimalSI>.)  <digit>           ::= 0 | 1 | ... | 9 <digits>          ::= <digit> | <digit><digits> <number>          ::= <digits> | <digits>.<digits> | <digits>. | .<digits> <sign>            ::= \"+\" | \"-\" <signedNumber>    ::= <number> | <sign><number> <suffix>          ::= <binarySI> | <decimalExponent> | <decimalSI> <binarySI>        ::= Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)  <decimalSI>       ::= m | \"\" | k | M | G | T | P | E   (Note that 1024 = 1Ki but 1000 = 1k; I didn't choose the capitalization.)  <decimalExponent> ::= \"e\" <signedNumber> | \"E\" <signedNumber> ```  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \"canonical form\". This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:  - No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.  The sign will be omitted unless the number is negative.  Examples:  - 1.5 will be serialized as \"1500m\" - 1.5Gi will be serialized as \"1536Mi\"  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don't diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.")
  public Quantity getTolerance() {
    return tolerance;
  }

  public void setTolerance(@jakarta.annotation.Nullable Quantity tolerance) {
    this.tolerance = tolerance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2HPAScalingRules v2HPAScalingRules = (V2HPAScalingRules) o;
    return Objects.equals(this.policies, v2HPAScalingRules.policies) &&
        Objects.equals(this.selectPolicy, v2HPAScalingRules.selectPolicy) &&
        Objects.equals(this.stabilizationWindowSeconds, v2HPAScalingRules.stabilizationWindowSeconds) &&
        Objects.equals(this.tolerance, v2HPAScalingRules.tolerance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policies, selectPolicy, stabilizationWindowSeconds, tolerance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2HPAScalingRules {\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    selectPolicy: ").append(toIndentedString(selectPolicy)).append("\n");
    sb.append("    stabilizationWindowSeconds: ").append(toIndentedString(stabilizationWindowSeconds)).append("\n");
    sb.append("    tolerance: ").append(toIndentedString(tolerance)).append("\n");
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
    openapiFields.add("policies");
    openapiFields.add("selectPolicy");
    openapiFields.add("stabilizationWindowSeconds");
    openapiFields.add("tolerance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V2HPAScalingRules
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V2HPAScalingRules.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V2HPAScalingRules is not found in the empty JSON string", V2HPAScalingRules.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V2HPAScalingRules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V2HPAScalingRules` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("policies") != null && !jsonObj.get("policies").isJsonNull()) {
        JsonArray jsonArraypolicies = jsonObj.getAsJsonArray("policies");
        if (jsonArraypolicies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("policies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `policies` to be an array in the JSON string but got `%s`", jsonObj.get("policies").toString()));
          }

          // validate the optional field `policies` (array)
          for (int i = 0; i < jsonArraypolicies.size(); i++) {
            V2HPAScalingPolicy.validateJsonElement(jsonArraypolicies.get(i));
          };
        }
      }
      if ((jsonObj.get("selectPolicy") != null && !jsonObj.get("selectPolicy").isJsonNull()) && !jsonObj.get("selectPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selectPolicy").toString()));
      }
      if ((jsonObj.get("tolerance") != null && !jsonObj.get("tolerance").isJsonNull()) && !jsonObj.get("tolerance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tolerance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tolerance").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V2HPAScalingRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V2HPAScalingRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V2HPAScalingRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V2HPAScalingRules.class));

       return (TypeAdapter<T>) new TypeAdapter<V2HPAScalingRules>() {
           @Override
           public void write(JsonWriter out, V2HPAScalingRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V2HPAScalingRules read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V2HPAScalingRules given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V2HPAScalingRules
   * @throws IOException if the JSON string is invalid with respect to V2HPAScalingRules
   */
  public static V2HPAScalingRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V2HPAScalingRules.class);
  }

  /**
   * Convert an instance of V2HPAScalingRules to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
