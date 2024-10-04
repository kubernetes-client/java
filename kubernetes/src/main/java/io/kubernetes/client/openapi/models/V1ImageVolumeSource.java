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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ImageVolumeSource represents a image volume resource.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1ImageVolumeSource {
  public static final String SERIALIZED_NAME_PULL_POLICY = "pullPolicy";
  @SerializedName(SERIALIZED_NAME_PULL_POLICY)
  private String pullPolicy;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public V1ImageVolumeSource() {
  }

  public V1ImageVolumeSource pullPolicy(String pullPolicy) {
    this.pullPolicy = pullPolicy;
    return this;
  }

   /**
   * Policy for pulling OCI objects. Possible values are: Always: the kubelet always attempts to pull the reference. Container creation will fail If the pull fails. Never: the kubelet never pulls the reference and only uses a local image or artifact. Container creation will fail if the reference isn&#39;t present. IfNotPresent: the kubelet pulls if the reference isn&#39;t already present on disk. Container creation will fail if the reference isn&#39;t present and the pull fails. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise.
   * @return pullPolicy
  **/
  @jakarta.annotation.Nullable
  public String getPullPolicy() {
    return pullPolicy;
  }

  public void setPullPolicy(String pullPolicy) {
    this.pullPolicy = pullPolicy;
  }


  public V1ImageVolumeSource reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Required: Image or artifact reference to be used. Behaves in the same way as pod.spec.containers[*].image. Pull secrets will be assembled in the same way as for the container image by looking up node credentials, SA image pull secrets, and pod spec image pull secrets. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
   * @return reference
  **/
  @jakarta.annotation.Nullable
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ImageVolumeSource v1ImageVolumeSource = (V1ImageVolumeSource) o;
    return Objects.equals(this.pullPolicy, v1ImageVolumeSource.pullPolicy) &&
        Objects.equals(this.reference, v1ImageVolumeSource.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pullPolicy, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ImageVolumeSource {\n");
    sb.append("    pullPolicy: ").append(toIndentedString(pullPolicy)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
    openapiFields.add("pullPolicy");
    openapiFields.add("reference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1ImageVolumeSource
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ImageVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ImageVolumeSource is not found in the empty JSON string", V1ImageVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ImageVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ImageVolumeSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("pullPolicy") != null && !jsonObj.get("pullPolicy").isJsonNull()) && !jsonObj.get("pullPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pullPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pullPolicy").toString()));
      }
      if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull()) && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ImageVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ImageVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ImageVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ImageVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ImageVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1ImageVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ImageVolumeSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ImageVolumeSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ImageVolumeSource
  * @throws IOException if the JSON string is invalid with respect to V1ImageVolumeSource
  */
  public static V1ImageVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ImageVolumeSource.class);
  }

 /**
  * Convert an instance of V1ImageVolumeSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
