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
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1ObjectReference;
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
 * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems, for an identity * a principal that can be authenticated and authorized * a set of secrets
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ServiceAccount implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN = "automountServiceAccountToken";
  @SerializedName(SERIALIZED_NAME_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN)
  private Boolean automountServiceAccountToken;

  public static final String SERIALIZED_NAME_IMAGE_PULL_SECRETS = "imagePullSecrets";
  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_SECRETS)
  private List<V1LocalObjectReference> imagePullSecrets;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_SECRETS = "secrets";
  @SerializedName(SERIALIZED_NAME_SECRETS)
  private List<V1ObjectReference> secrets;

  public V1ServiceAccount() {
  }

  public V1ServiceAccount apiVersion(String apiVersion) {

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


  public V1ServiceAccount automountServiceAccountToken(Boolean automountServiceAccountToken) {

    this.automountServiceAccountToken = automountServiceAccountToken;
    return this;
  }

   /**
   * AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.
   * @return automountServiceAccountToken
  **/
  @jakarta.annotation.Nullable
  public Boolean getAutomountServiceAccountToken() {
    return automountServiceAccountToken;
  }


  public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
  }


  public V1ServiceAccount imagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {

    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public V1ServiceAccount addImagePullSecretsItem(V1LocalObjectReference imagePullSecretsItem) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets = new ArrayList<>();
    }
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

   /**
   * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
   * @return imagePullSecrets
  **/
  @jakarta.annotation.Nullable
  public List<V1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }


  public void setImagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }


  public V1ServiceAccount kind(String kind) {

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


  public V1ServiceAccount metadata(V1ObjectMeta metadata) {

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


  public V1ServiceAccount secrets(List<V1ObjectReference> secrets) {

    this.secrets = secrets;
    return this;
  }

  public V1ServiceAccount addSecretsItem(V1ObjectReference secretsItem) {
    if (this.secrets == null) {
      this.secrets = new ArrayList<>();
    }
    this.secrets.add(secretsItem);
    return this;
  }

   /**
   * Secrets is a list of the secrets in the same namespace that pods running using this ServiceAccount are allowed to use. Pods are only limited to this list if this service account has a \&quot;kubernetes.io/enforce-mountable-secrets\&quot; annotation set to \&quot;true\&quot;. This field should not be used to find auto-generated service account token secrets for use outside of pods. Instead, tokens can be requested directly using the TokenRequest API, or service account token secrets can be manually created. More info: https://kubernetes.io/docs/concepts/configuration/secret
   * @return secrets
  **/
  @jakarta.annotation.Nullable
  public List<V1ObjectReference> getSecrets() {
    return secrets;
  }


  public void setSecrets(List<V1ObjectReference> secrets) {
    this.secrets = secrets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ServiceAccount v1ServiceAccount = (V1ServiceAccount) o;
    return Objects.equals(this.apiVersion, v1ServiceAccount.apiVersion) &&
        Objects.equals(this.automountServiceAccountToken, v1ServiceAccount.automountServiceAccountToken) &&
        Objects.equals(this.imagePullSecrets, v1ServiceAccount.imagePullSecrets) &&
        Objects.equals(this.kind, v1ServiceAccount.kind) &&
        Objects.equals(this.metadata, v1ServiceAccount.metadata) &&
        Objects.equals(this.secrets, v1ServiceAccount.secrets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, automountServiceAccountToken, imagePullSecrets, kind, metadata, secrets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceAccount {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
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
    openapiFields.add("automountServiceAccountToken");
    openapiFields.add("imagePullSecrets");
    openapiFields.add("kind");
    openapiFields.add("metadata");
    openapiFields.add("secrets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ServiceAccount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ServiceAccount.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ServiceAccount is not found in the empty JSON string", V1ServiceAccount.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ServiceAccount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ServiceAccount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if (jsonObj.get("imagePullSecrets") != null && !jsonObj.get("imagePullSecrets").isJsonNull()) {
        JsonArray jsonArrayimagePullSecrets = jsonObj.getAsJsonArray("imagePullSecrets");
        if (jsonArrayimagePullSecrets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("imagePullSecrets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `imagePullSecrets` to be an array in the JSON string but got `%s`", jsonObj.get("imagePullSecrets").toString()));
          }

          // validate the optional field `imagePullSecrets` (array)
          for (int i = 0; i < jsonArrayimagePullSecrets.size(); i++) {
            V1LocalObjectReference.validateJsonObject(jsonArrayimagePullSecrets.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        V1ObjectMeta.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
      if (jsonObj.get("secrets") != null && !jsonObj.get("secrets").isJsonNull()) {
        JsonArray jsonArraysecrets = jsonObj.getAsJsonArray("secrets");
        if (jsonArraysecrets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("secrets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `secrets` to be an array in the JSON string but got `%s`", jsonObj.get("secrets").toString()));
          }

          // validate the optional field `secrets` (array)
          for (int i = 0; i < jsonArraysecrets.size(); i++) {
            V1ObjectReference.validateJsonObject(jsonArraysecrets.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ServiceAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ServiceAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ServiceAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ServiceAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ServiceAccount>() {
           @Override
           public void write(JsonWriter out, V1ServiceAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ServiceAccount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ServiceAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ServiceAccount
  * @throws IOException if the JSON string is invalid with respect to V1ServiceAccount
  */
  public static V1ServiceAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ServiceAccount.class);
  }

 /**
  * Convert an instance of V1ServiceAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
