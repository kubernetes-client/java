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
import io.kubernetes.client.openapi.models.V1VolumeAttachmentSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;

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
 * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
 */
@ApiModel(description = "VolumeAttachmentSpec is the specification of a VolumeAttachment request.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1VolumeAttachmentSpec {
  public static final String SERIALIZED_NAME_ATTACHER = "attacher";
  @SerializedName(SERIALIZED_NAME_ATTACHER)
  @jakarta.annotation.Nonnull
  private String attacher;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  @jakarta.annotation.Nonnull
  private String nodeName;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  @jakarta.annotation.Nonnull
  private V1VolumeAttachmentSource source;

  public V1VolumeAttachmentSpec() {
  }

  public V1VolumeAttachmentSpec attacher(@jakarta.annotation.Nonnull String attacher) {
    this.attacher = attacher;
    return this;
  }

  /**
   * attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
   * @return attacher
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().")
  public String getAttacher() {
    return attacher;
  }

  public void setAttacher(@jakarta.annotation.Nonnull String attacher) {
    this.attacher = attacher;
  }


  public V1VolumeAttachmentSpec nodeName(@jakarta.annotation.Nonnull String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

  /**
   * nodeName represents the node that the volume should be attached to.
   * @return nodeName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "nodeName represents the node that the volume should be attached to.")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(@jakarta.annotation.Nonnull String nodeName) {
    this.nodeName = nodeName;
  }


  public V1VolumeAttachmentSpec source(@jakarta.annotation.Nonnull V1VolumeAttachmentSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V1VolumeAttachmentSource getSource() {
    return source;
  }

  public void setSource(@jakarta.annotation.Nonnull V1VolumeAttachmentSource source) {
    this.source = source;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VolumeAttachmentSpec v1VolumeAttachmentSpec = (V1VolumeAttachmentSpec) o;
    return Objects.equals(this.attacher, v1VolumeAttachmentSpec.attacher) &&
        Objects.equals(this.nodeName, v1VolumeAttachmentSpec.nodeName) &&
        Objects.equals(this.source, v1VolumeAttachmentSpec.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attacher, nodeName, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeAttachmentSpec {\n");
    sb.append("    attacher: ").append(toIndentedString(attacher)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("attacher");
    openapiFields.add("nodeName");
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attacher");
    openapiRequiredFields.add("nodeName");
    openapiRequiredFields.add("source");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1VolumeAttachmentSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1VolumeAttachmentSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1VolumeAttachmentSpec is not found in the empty JSON string", V1VolumeAttachmentSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1VolumeAttachmentSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1VolumeAttachmentSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1VolumeAttachmentSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("attacher").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attacher` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attacher").toString()));
      }
      if (!jsonObj.get("nodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeName").toString()));
      }
      // validate the required field `source`
      V1VolumeAttachmentSource.validateJsonElement(jsonObj.get("source"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1VolumeAttachmentSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1VolumeAttachmentSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1VolumeAttachmentSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1VolumeAttachmentSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1VolumeAttachmentSpec>() {
           @Override
           public void write(JsonWriter out, V1VolumeAttachmentSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1VolumeAttachmentSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1VolumeAttachmentSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1VolumeAttachmentSpec
   * @throws IOException if the JSON string is invalid with respect to V1VolumeAttachmentSpec
   */
  public static V1VolumeAttachmentSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1VolumeAttachmentSpec.class);
  }

  /**
   * Convert an instance of V1VolumeAttachmentSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
