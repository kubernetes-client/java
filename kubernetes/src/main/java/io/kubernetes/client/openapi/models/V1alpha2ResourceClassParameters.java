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
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1alpha2ResourceClassParametersReference;
import io.kubernetes.client.openapi.models.V1alpha2ResourceFilter;
import io.kubernetes.client.openapi.models.V1alpha2VendorParameters;
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
 * ResourceClassParameters defines resource requests for a ResourceClass in an in-tree format understood by Kubernetes.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha2ResourceClassParameters implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<V1alpha2ResourceFilter> filters;

  public static final String SERIALIZED_NAME_GENERATED_FROM = "generatedFrom";
  @SerializedName(SERIALIZED_NAME_GENERATED_FROM)
  private V1alpha2ResourceClassParametersReference generatedFrom;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_VENDOR_PARAMETERS = "vendorParameters";
  @SerializedName(SERIALIZED_NAME_VENDOR_PARAMETERS)
  private List<V1alpha2VendorParameters> vendorParameters;

  public V1alpha2ResourceClassParameters() {
  }

  public V1alpha2ResourceClassParameters apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @jakarta.annotation.Nullable
  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1alpha2ResourceClassParameters filters(List<V1alpha2ResourceFilter> filters) {

    this.filters = filters;
    return this;
  }

  public V1alpha2ResourceClassParameters addFiltersItem(V1alpha2ResourceFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Filters describes additional contraints that must be met when using the class.
   * @return filters
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha2ResourceFilter> getFilters() {
    return filters;
  }


  public void setFilters(List<V1alpha2ResourceFilter> filters) {
    this.filters = filters;
  }


  public V1alpha2ResourceClassParameters generatedFrom(V1alpha2ResourceClassParametersReference generatedFrom) {

    this.generatedFrom = generatedFrom;
    return this;
  }

   /**
   * Get generatedFrom
   * @return generatedFrom
  **/
  @jakarta.annotation.Nullable
  public V1alpha2ResourceClassParametersReference getGeneratedFrom() {
    return generatedFrom;
  }


  public void setGeneratedFrom(V1alpha2ResourceClassParametersReference generatedFrom) {
    this.generatedFrom = generatedFrom;
  }


  public V1alpha2ResourceClassParameters kind(String kind) {

    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @jakarta.annotation.Nullable
  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1alpha2ResourceClassParameters metadata(V1ObjectMeta metadata) {

    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  public V1ObjectMeta getMetadata() {
    return metadata;
  }


  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public V1alpha2ResourceClassParameters vendorParameters(List<V1alpha2VendorParameters> vendorParameters) {

    this.vendorParameters = vendorParameters;
    return this;
  }

  public V1alpha2ResourceClassParameters addVendorParametersItem(V1alpha2VendorParameters vendorParametersItem) {
    if (this.vendorParameters == null) {
      this.vendorParameters = new ArrayList<>();
    }
    this.vendorParameters.add(vendorParametersItem);
    return this;
  }

   /**
   * VendorParameters are arbitrary setup parameters for all claims using this class. They are ignored while allocating the claim. There must not be more than one entry per driver.
   * @return vendorParameters
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha2VendorParameters> getVendorParameters() {
    return vendorParameters;
  }


  public void setVendorParameters(List<V1alpha2VendorParameters> vendorParameters) {
    this.vendorParameters = vendorParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2ResourceClassParameters v1alpha2ResourceClassParameters = (V1alpha2ResourceClassParameters) o;
    return Objects.equals(this.apiVersion, v1alpha2ResourceClassParameters.apiVersion) &&
        Objects.equals(this.filters, v1alpha2ResourceClassParameters.filters) &&
        Objects.equals(this.generatedFrom, v1alpha2ResourceClassParameters.generatedFrom) &&
        Objects.equals(this.kind, v1alpha2ResourceClassParameters.kind) &&
        Objects.equals(this.metadata, v1alpha2ResourceClassParameters.metadata) &&
        Objects.equals(this.vendorParameters, v1alpha2ResourceClassParameters.vendorParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, filters, generatedFrom, kind, metadata, vendorParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2ResourceClassParameters {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    generatedFrom: ").append(toIndentedString(generatedFrom)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    vendorParameters: ").append(toIndentedString(vendorParameters)).append("\n");
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
    openapiFields.add("apiVersion");
    openapiFields.add("filters");
    openapiFields.add("generatedFrom");
    openapiFields.add("kind");
    openapiFields.add("metadata");
    openapiFields.add("vendorParameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha2ResourceClassParameters
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha2ResourceClassParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2ResourceClassParameters is not found in the empty JSON string", V1alpha2ResourceClassParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2ResourceClassParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2ResourceClassParameters` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        JsonArray jsonArrayfilters = jsonObj.getAsJsonArray("filters");
        if (jsonArrayfilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("filters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `filters` to be an array in the JSON string but got `%s`", jsonObj.get("filters").toString()));
          }

          // validate the optional field `filters` (array)
          for (int i = 0; i < jsonArrayfilters.size(); i++) {
            V1alpha2ResourceFilter.validateJsonObject(jsonArrayfilters.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `generatedFrom`
      if (jsonObj.get("generatedFrom") != null && !jsonObj.get("generatedFrom").isJsonNull()) {
        V1alpha2ResourceClassParametersReference.validateJsonObject(jsonObj.getAsJsonObject("generatedFrom"));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        V1ObjectMeta.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
      if (jsonObj.get("vendorParameters") != null && !jsonObj.get("vendorParameters").isJsonNull()) {
        JsonArray jsonArrayvendorParameters = jsonObj.getAsJsonArray("vendorParameters");
        if (jsonArrayvendorParameters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vendorParameters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vendorParameters` to be an array in the JSON string but got `%s`", jsonObj.get("vendorParameters").toString()));
          }

          // validate the optional field `vendorParameters` (array)
          for (int i = 0; i < jsonArrayvendorParameters.size(); i++) {
            V1alpha2VendorParameters.validateJsonObject(jsonArrayvendorParameters.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2ResourceClassParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2ResourceClassParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2ResourceClassParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2ResourceClassParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2ResourceClassParameters>() {
           @Override
           public void write(JsonWriter out, V1alpha2ResourceClassParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2ResourceClassParameters read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2ResourceClassParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2ResourceClassParameters
  * @throws IOException if the JSON string is invalid with respect to V1alpha2ResourceClassParameters
  */
  public static V1alpha2ResourceClassParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2ResourceClassParameters.class);
  }

 /**
  * Convert an instance of V1alpha2ResourceClassParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
