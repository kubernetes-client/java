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
import java.util.Locale;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1DeviceClassConfiguration;
import io.kubernetes.client.openapi.models.V1DeviceSelector;
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
import java.util.Locale;

import io.kubernetes.client.openapi.JSON;

/**
 * DeviceClassSpec is used in a [DeviceClass] to define what can be allocated and how to configure it.
 */
@ApiModel(description = "DeviceClassSpec is used in a [DeviceClass] to define what can be allocated and how to configure it.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-11-21T03:25:56.836812Z[Etc/UTC]", comments = "Generator version: 7.16.0")
public class V1DeviceClassSpec {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  @jakarta.annotation.Nullable
  private List<V1DeviceClassConfiguration> config = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTENDED_RESOURCE_NAME = "extendedResourceName";
  @SerializedName(SERIALIZED_NAME_EXTENDED_RESOURCE_NAME)
  @jakarta.annotation.Nullable
  private String extendedResourceName;

  public static final String SERIALIZED_NAME_SELECTORS = "selectors";
  @SerializedName(SERIALIZED_NAME_SELECTORS)
  @jakarta.annotation.Nullable
  private List<V1DeviceSelector> selectors = new ArrayList<>();

  public V1DeviceClassSpec() {
  }

  public V1DeviceClassSpec config(@jakarta.annotation.Nullable List<V1DeviceClassConfiguration> config) {
    this.config = config;
    return this;
  }

  public V1DeviceClassSpec addConfigItem(V1DeviceClassConfiguration configItem) {
    if (this.config == null) {
      this.config = new ArrayList<>();
    }
    this.config.add(configItem);
    return this;
  }

  /**
   * Config defines configuration parameters that apply to each device that is claimed via this class. Some classses may potentially be satisfied by multiple drivers, so each instance of a vendor configuration applies to exactly one driver.  They are passed to the driver, but are not considered while allocating the claim.
   * @return config
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Config defines configuration parameters that apply to each device that is claimed via this class. Some classses may potentially be satisfied by multiple drivers, so each instance of a vendor configuration applies to exactly one driver.  They are passed to the driver, but are not considered while allocating the claim.")
  public List<V1DeviceClassConfiguration> getConfig() {
    return config;
  }

  public void setConfig(@jakarta.annotation.Nullable List<V1DeviceClassConfiguration> config) {
    this.config = config;
  }


  public V1DeviceClassSpec extendedResourceName(@jakarta.annotation.Nullable String extendedResourceName) {
    this.extendedResourceName = extendedResourceName;
    return this;
  }

  /**
   * ExtendedResourceName is the extended resource name for the devices of this class. The devices of this class can be used to satisfy a pod&#39;s extended resource requests. It has the same format as the name of a pod&#39;s extended resource. It should be unique among all the device classes in a cluster. If two device classes have the same name, then the class created later is picked to satisfy a pod&#39;s extended resource requests. If two classes are created at the same time, then the name of the class lexicographically sorted first is picked.  This is an alpha field.
   * @return extendedResourceName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ExtendedResourceName is the extended resource name for the devices of this class. The devices of this class can be used to satisfy a pod's extended resource requests. It has the same format as the name of a pod's extended resource. It should be unique among all the device classes in a cluster. If two device classes have the same name, then the class created later is picked to satisfy a pod's extended resource requests. If two classes are created at the same time, then the name of the class lexicographically sorted first is picked.  This is an alpha field.")
  public String getExtendedResourceName() {
    return extendedResourceName;
  }

  public void setExtendedResourceName(@jakarta.annotation.Nullable String extendedResourceName) {
    this.extendedResourceName = extendedResourceName;
  }


  public V1DeviceClassSpec selectors(@jakarta.annotation.Nullable List<V1DeviceSelector> selectors) {
    this.selectors = selectors;
    return this;
  }

  public V1DeviceClassSpec addSelectorsItem(V1DeviceSelector selectorsItem) {
    if (this.selectors == null) {
      this.selectors = new ArrayList<>();
    }
    this.selectors.add(selectorsItem);
    return this;
  }

  /**
   * Each selector must be satisfied by a device which is claimed via this class.
   * @return selectors
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Each selector must be satisfied by a device which is claimed via this class.")
  public List<V1DeviceSelector> getSelectors() {
    return selectors;
  }

  public void setSelectors(@jakarta.annotation.Nullable List<V1DeviceSelector> selectors) {
    this.selectors = selectors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DeviceClassSpec v1DeviceClassSpec = (V1DeviceClassSpec) o;
    return Objects.equals(this.config, v1DeviceClassSpec.config) &&
        Objects.equals(this.extendedResourceName, v1DeviceClassSpec.extendedResourceName) &&
        Objects.equals(this.selectors, v1DeviceClassSpec.selectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, extendedResourceName, selectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DeviceClassSpec {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    extendedResourceName: ").append(toIndentedString(extendedResourceName)).append("\n");
    sb.append("    selectors: ").append(toIndentedString(selectors)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("config", "extendedResourceName", "selectors"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1DeviceClassSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1DeviceClassSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field(s) %s in V1DeviceClassSpec is not found in the empty JSON string", V1DeviceClassSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1DeviceClassSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1DeviceClassSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("config") != null && !jsonObj.get("config").isJsonNull()) {
        JsonArray jsonArrayconfig = jsonObj.getAsJsonArray("config");
        if (jsonArrayconfig != null) {
          // ensure the json data is an array
          if (!jsonObj.get("config").isJsonArray()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `config` to be an array in the JSON string but got `%s`", jsonObj.get("config").toString()));
          }

          // validate the optional field `config` (array)
          for (int i = 0; i < jsonArrayconfig.size(); i++) {
            V1DeviceClassConfiguration.validateJsonElement(jsonArrayconfig.get(i));
          };
        }
      }
      if ((jsonObj.get("extendedResourceName") != null && !jsonObj.get("extendedResourceName").isJsonNull()) && !jsonObj.get("extendedResourceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `extendedResourceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extendedResourceName").toString()));
      }
      if (jsonObj.get("selectors") != null && !jsonObj.get("selectors").isJsonNull()) {
        JsonArray jsonArrayselectors = jsonObj.getAsJsonArray("selectors");
        if (jsonArrayselectors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("selectors").isJsonArray()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `selectors` to be an array in the JSON string but got `%s`", jsonObj.get("selectors").toString()));
          }

          // validate the optional field `selectors` (array)
          for (int i = 0; i < jsonArrayselectors.size(); i++) {
            V1DeviceSelector.validateJsonElement(jsonArrayselectors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1DeviceClassSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1DeviceClassSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1DeviceClassSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1DeviceClassSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1DeviceClassSpec>() {
           @Override
           public void write(JsonWriter out, V1DeviceClassSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1DeviceClassSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1DeviceClassSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1DeviceClassSpec
   * @throws IOException if the JSON string is invalid with respect to V1DeviceClassSpec
   */
  public static V1DeviceClassSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1DeviceClassSpec.class);
  }

  /**
   * Convert an instance of V1DeviceClassSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
