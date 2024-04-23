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
import io.kubernetes.client.openapi.models.V1IngressBackend;
import io.kubernetes.client.openapi.models.V1IngressRule;
import io.kubernetes.client.openapi.models.V1IngressTLS;
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
 * IngressSpec describes the Ingress the user wishes to exist.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1IngressSpec {
  public static final String SERIALIZED_NAME_DEFAULT_BACKEND = "defaultBackend";
  @SerializedName(SERIALIZED_NAME_DEFAULT_BACKEND)
  private V1IngressBackend defaultBackend;

  public static final String SERIALIZED_NAME_INGRESS_CLASS_NAME = "ingressClassName";
  @SerializedName(SERIALIZED_NAME_INGRESS_CLASS_NAME)
  private String ingressClassName;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<V1IngressRule> rules;

  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private List<V1IngressTLS> tls;

  public V1IngressSpec() {
  }

  public V1IngressSpec defaultBackend(V1IngressBackend defaultBackend) {

    this.defaultBackend = defaultBackend;
    return this;
  }

   /**
   * Get defaultBackend
   * @return defaultBackend
  **/
  @jakarta.annotation.Nullable
  public V1IngressBackend getDefaultBackend() {
    return defaultBackend;
  }


  public void setDefaultBackend(V1IngressBackend defaultBackend) {
    this.defaultBackend = defaultBackend;
  }


  public V1IngressSpec ingressClassName(String ingressClassName) {

    this.ingressClassName = ingressClassName;
    return this;
  }

   /**
   * ingressClassName is the name of an IngressClass cluster resource. Ingress controller implementations use this field to know whether they should be serving this Ingress resource, by a transitive connection (controller -&gt; IngressClass -&gt; Ingress resource). Although the &#x60;kubernetes.io/ingress.class&#x60; annotation (simple constant name) was never formally defined, it was widely supported by Ingress controllers to create a direct binding between Ingress controller and Ingress resources. Newly created Ingress resources should prefer using the field. However, even though the annotation is officially deprecated, for backwards compatibility reasons, ingress controllers should still honor that annotation if present.
   * @return ingressClassName
  **/
  @jakarta.annotation.Nullable
  public String getIngressClassName() {
    return ingressClassName;
  }


  public void setIngressClassName(String ingressClassName) {
    this.ingressClassName = ingressClassName;
  }


  public V1IngressSpec rules(List<V1IngressRule> rules) {

    this.rules = rules;
    return this;
  }

  public V1IngressSpec addRulesItem(V1IngressRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * rules is a list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
   * @return rules
  **/
  @jakarta.annotation.Nullable
  public List<V1IngressRule> getRules() {
    return rules;
  }


  public void setRules(List<V1IngressRule> rules) {
    this.rules = rules;
  }


  public V1IngressSpec tls(List<V1IngressTLS> tls) {

    this.tls = tls;
    return this;
  }

  public V1IngressSpec addTlsItem(V1IngressTLS tlsItem) {
    if (this.tls == null) {
      this.tls = new ArrayList<>();
    }
    this.tls.add(tlsItem);
    return this;
  }

   /**
   * tls represents the TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
   * @return tls
  **/
  @jakarta.annotation.Nullable
  public List<V1IngressTLS> getTls() {
    return tls;
  }


  public void setTls(List<V1IngressTLS> tls) {
    this.tls = tls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1IngressSpec v1IngressSpec = (V1IngressSpec) o;
    return Objects.equals(this.defaultBackend, v1IngressSpec.defaultBackend) &&
        Objects.equals(this.ingressClassName, v1IngressSpec.ingressClassName) &&
        Objects.equals(this.rules, v1IngressSpec.rules) &&
        Objects.equals(this.tls, v1IngressSpec.tls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultBackend, ingressClassName, rules, tls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IngressSpec {\n");
    sb.append("    defaultBackend: ").append(toIndentedString(defaultBackend)).append("\n");
    sb.append("    ingressClassName: ").append(toIndentedString(ingressClassName)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
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
    openapiFields.add("defaultBackend");
    openapiFields.add("ingressClassName");
    openapiFields.add("rules");
    openapiFields.add("tls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1IngressSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1IngressSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1IngressSpec is not found in the empty JSON string", V1IngressSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1IngressSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1IngressSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `defaultBackend`
      if (jsonObj.get("defaultBackend") != null && !jsonObj.get("defaultBackend").isJsonNull()) {
        V1IngressBackend.validateJsonObject(jsonObj.getAsJsonObject("defaultBackend"));
      }
      if ((jsonObj.get("ingressClassName") != null && !jsonObj.get("ingressClassName").isJsonNull()) && !jsonObj.get("ingressClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingressClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingressClassName").toString()));
      }
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) {
        JsonArray jsonArrayrules = jsonObj.getAsJsonArray("rules");
        if (jsonArrayrules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rules` to be an array in the JSON string but got `%s`", jsonObj.get("rules").toString()));
          }

          // validate the optional field `rules` (array)
          for (int i = 0; i < jsonArrayrules.size(); i++) {
            V1IngressRule.validateJsonObject(jsonArrayrules.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("tls") != null && !jsonObj.get("tls").isJsonNull()) {
        JsonArray jsonArraytls = jsonObj.getAsJsonArray("tls");
        if (jsonArraytls != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tls").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tls` to be an array in the JSON string but got `%s`", jsonObj.get("tls").toString()));
          }

          // validate the optional field `tls` (array)
          for (int i = 0; i < jsonArraytls.size(); i++) {
            V1IngressTLS.validateJsonObject(jsonArraytls.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1IngressSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1IngressSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1IngressSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1IngressSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1IngressSpec>() {
           @Override
           public void write(JsonWriter out, V1IngressSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1IngressSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1IngressSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1IngressSpec
  * @throws IOException if the JSON string is invalid with respect to V1IngressSpec
  */
  public static V1IngressSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1IngressSpec.class);
  }

 /**
  * Convert an instance of V1IngressSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
