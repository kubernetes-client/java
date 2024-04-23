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
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ManagedFieldsEntry {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_FIELDS_TYPE = "fieldsType";
  @SerializedName(SERIALIZED_NAME_FIELDS_TYPE)
  private String fieldsType;

  public static final String SERIALIZED_NAME_FIELDS_V1 = "fieldsV1";
  @SerializedName(SERIALIZED_NAME_FIELDS_V1)
  private Object fieldsV1;

  public static final String SERIALIZED_NAME_MANAGER = "manager";
  @SerializedName(SERIALIZED_NAME_MANAGER)
  private String manager;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_SUBRESOURCE = "subresource";
  @SerializedName(SERIALIZED_NAME_SUBRESOURCE)
  private String subresource;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;

  public V1ManagedFieldsEntry() {
  }

  public V1ManagedFieldsEntry apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the version of this resource that this field set applies to. The format is \&quot;group/version\&quot; just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
   * @return apiVersion
  **/
  @jakarta.annotation.Nullable
  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1ManagedFieldsEntry fieldsType(String fieldsType) {

    this.fieldsType = fieldsType;
    return this;
  }

   /**
   * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: \&quot;FieldsV1\&quot;
   * @return fieldsType
  **/
  @jakarta.annotation.Nullable
  public String getFieldsType() {
    return fieldsType;
  }


  public void setFieldsType(String fieldsType) {
    this.fieldsType = fieldsType;
  }


  public V1ManagedFieldsEntry fieldsV1(Object fieldsV1) {

    this.fieldsV1 = fieldsV1;
    return this;
  }

   /**
   * FieldsV1 holds the first JSON version format as described in the \&quot;FieldsV1\&quot; type.
   * @return fieldsV1
  **/
  @jakarta.annotation.Nullable
  public Object getFieldsV1() {
    return fieldsV1;
  }


  public void setFieldsV1(Object fieldsV1) {
    this.fieldsV1 = fieldsV1;
  }


  public V1ManagedFieldsEntry manager(String manager) {

    this.manager = manager;
    return this;
  }

   /**
   * Manager is an identifier of the workflow managing these fields.
   * @return manager
  **/
  @jakarta.annotation.Nullable
  public String getManager() {
    return manager;
  }


  public void setManager(String manager) {
    this.manager = manager;
  }


  public V1ManagedFieldsEntry operation(String operation) {

    this.operation = operation;
    return this;
  }

   /**
   * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are &#39;Apply&#39; and &#39;Update&#39;.
   * @return operation
  **/
  @jakarta.annotation.Nullable
  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    this.operation = operation;
  }


  public V1ManagedFieldsEntry subresource(String subresource) {

    this.subresource = subresource;
    return this;
  }

   /**
   * Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.
   * @return subresource
  **/
  @jakarta.annotation.Nullable
  public String getSubresource() {
    return subresource;
  }


  public void setSubresource(String subresource) {
    this.subresource = subresource;
  }


  public V1ManagedFieldsEntry time(OffsetDateTime time) {

    this.time = time;
    return this;
  }

   /**
   * Time is the timestamp of when the ManagedFields entry was added. The timestamp will also be updated if a field is added, the manager changes any of the owned fields value or removes a field. The timestamp does not update when a field is removed from the entry because another manager took it over.
   * @return time
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getTime() {
    return time;
  }


  public void setTime(OffsetDateTime time) {
    this.time = time;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ManagedFieldsEntry v1ManagedFieldsEntry = (V1ManagedFieldsEntry) o;
    return Objects.equals(this.apiVersion, v1ManagedFieldsEntry.apiVersion) &&
        Objects.equals(this.fieldsType, v1ManagedFieldsEntry.fieldsType) &&
        Objects.equals(this.fieldsV1, v1ManagedFieldsEntry.fieldsV1) &&
        Objects.equals(this.manager, v1ManagedFieldsEntry.manager) &&
        Objects.equals(this.operation, v1ManagedFieldsEntry.operation) &&
        Objects.equals(this.subresource, v1ManagedFieldsEntry.subresource) &&
        Objects.equals(this.time, v1ManagedFieldsEntry.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, fieldsType, fieldsV1, manager, operation, subresource, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ManagedFieldsEntry {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldsType: ").append(toIndentedString(fieldsType)).append("\n");
    sb.append("    fieldsV1: ").append(toIndentedString(fieldsV1)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    subresource: ").append(toIndentedString(subresource)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
    openapiFields.add("fieldsType");
    openapiFields.add("fieldsV1");
    openapiFields.add("manager");
    openapiFields.add("operation");
    openapiFields.add("subresource");
    openapiFields.add("time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ManagedFieldsEntry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ManagedFieldsEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ManagedFieldsEntry is not found in the empty JSON string", V1ManagedFieldsEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ManagedFieldsEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ManagedFieldsEntry` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if ((jsonObj.get("fieldsType") != null && !jsonObj.get("fieldsType").isJsonNull()) && !jsonObj.get("fieldsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldsType").toString()));
      }
      if ((jsonObj.get("manager") != null && !jsonObj.get("manager").isJsonNull()) && !jsonObj.get("manager").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manager` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manager").toString()));
      }
      if ((jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) && !jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      if ((jsonObj.get("subresource") != null && !jsonObj.get("subresource").isJsonNull()) && !jsonObj.get("subresource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subresource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subresource").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ManagedFieldsEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ManagedFieldsEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ManagedFieldsEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ManagedFieldsEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ManagedFieldsEntry>() {
           @Override
           public void write(JsonWriter out, V1ManagedFieldsEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ManagedFieldsEntry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ManagedFieldsEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ManagedFieldsEntry
  * @throws IOException if the JSON string is invalid with respect to V1ManagedFieldsEntry
  */
  public static V1ManagedFieldsEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ManagedFieldsEntry.class);
  }

 /**
  * Convert an instance of V1ManagedFieldsEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
