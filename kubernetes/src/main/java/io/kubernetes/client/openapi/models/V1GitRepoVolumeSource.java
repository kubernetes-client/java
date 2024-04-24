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
 * Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.  DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod&#39;s container.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1GitRepoVolumeSource {
  public static final String SERIALIZED_NAME_DIRECTORY = "directory";
  @SerializedName(SERIALIZED_NAME_DIRECTORY)
  private String directory;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private String repository;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private String revision;

  public V1GitRepoVolumeSource() {
  }

  public V1GitRepoVolumeSource directory(String directory) {

    this.directory = directory;
    return this;
  }

   /**
   * directory is the target directory name. Must not contain or start with &#39;..&#39;.  If &#39;.&#39; is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
   * @return directory
  **/
  @jakarta.annotation.Nullable
  public String getDirectory() {
    return directory;
  }


  public void setDirectory(String directory) {
    this.directory = directory;
  }


  public V1GitRepoVolumeSource repository(String repository) {

    this.repository = repository;
    return this;
  }

   /**
   * repository is the URL
   * @return repository
  **/
  @jakarta.annotation.Nonnull
  public String getRepository() {
    return repository;
  }


  public void setRepository(String repository) {
    this.repository = repository;
  }


  public V1GitRepoVolumeSource revision(String revision) {

    this.revision = revision;
    return this;
  }

   /**
   * revision is the commit hash for the specified revision.
   * @return revision
  **/
  @jakarta.annotation.Nullable
  public String getRevision() {
    return revision;
  }


  public void setRevision(String revision) {
    this.revision = revision;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GitRepoVolumeSource v1GitRepoVolumeSource = (V1GitRepoVolumeSource) o;
    return Objects.equals(this.directory, v1GitRepoVolumeSource.directory) &&
        Objects.equals(this.repository, v1GitRepoVolumeSource.repository) &&
        Objects.equals(this.revision, v1GitRepoVolumeSource.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directory, repository, revision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GitRepoVolumeSource {\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
    openapiFields.add("directory");
    openapiFields.add("repository");
    openapiFields.add("revision");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("repository");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1GitRepoVolumeSource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1GitRepoVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1GitRepoVolumeSource is not found in the empty JSON string", V1GitRepoVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1GitRepoVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1GitRepoVolumeSource` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1GitRepoVolumeSource.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("directory") != null && !jsonObj.get("directory").isJsonNull()) && !jsonObj.get("directory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `directory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("directory").toString()));
      }
      if (!jsonObj.get("repository").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repository` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repository").toString()));
      }
      if ((jsonObj.get("revision") != null && !jsonObj.get("revision").isJsonNull()) && !jsonObj.get("revision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revision").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1GitRepoVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1GitRepoVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1GitRepoVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1GitRepoVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1GitRepoVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1GitRepoVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1GitRepoVolumeSource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1GitRepoVolumeSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1GitRepoVolumeSource
  * @throws IOException if the JSON string is invalid with respect to V1GitRepoVolumeSource
  */
  public static V1GitRepoVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1GitRepoVolumeSource.class);
  }

 /**
  * Convert an instance of V1GitRepoVolumeSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
