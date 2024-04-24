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
 * Info contains versioning information. how we&#39;ll want to distribute that information.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class VersionInfo {
  public static final String SERIALIZED_NAME_BUILD_DATE = "buildDate";
  @SerializedName(SERIALIZED_NAME_BUILD_DATE)
  private String buildDate;

  public static final String SERIALIZED_NAME_COMPILER = "compiler";
  @SerializedName(SERIALIZED_NAME_COMPILER)
  private String compiler;

  public static final String SERIALIZED_NAME_GIT_COMMIT = "gitCommit";
  @SerializedName(SERIALIZED_NAME_GIT_COMMIT)
  private String gitCommit;

  public static final String SERIALIZED_NAME_GIT_TREE_STATE = "gitTreeState";
  @SerializedName(SERIALIZED_NAME_GIT_TREE_STATE)
  private String gitTreeState;

  public static final String SERIALIZED_NAME_GIT_VERSION = "gitVersion";
  @SerializedName(SERIALIZED_NAME_GIT_VERSION)
  private String gitVersion;

  public static final String SERIALIZED_NAME_GO_VERSION = "goVersion";
  @SerializedName(SERIALIZED_NAME_GO_VERSION)
  private String goVersion;

  public static final String SERIALIZED_NAME_MAJOR = "major";
  @SerializedName(SERIALIZED_NAME_MAJOR)
  private String major;

  public static final String SERIALIZED_NAME_MINOR = "minor";
  @SerializedName(SERIALIZED_NAME_MINOR)
  private String minor;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public VersionInfo() {
  }

  public VersionInfo buildDate(String buildDate) {

    this.buildDate = buildDate;
    return this;
  }

   /**
   * Get buildDate
   * @return buildDate
  **/
  @jakarta.annotation.Nonnull
  public String getBuildDate() {
    return buildDate;
  }


  public void setBuildDate(String buildDate) {
    this.buildDate = buildDate;
  }


  public VersionInfo compiler(String compiler) {

    this.compiler = compiler;
    return this;
  }

   /**
   * Get compiler
   * @return compiler
  **/
  @jakarta.annotation.Nonnull
  public String getCompiler() {
    return compiler;
  }


  public void setCompiler(String compiler) {
    this.compiler = compiler;
  }


  public VersionInfo gitCommit(String gitCommit) {

    this.gitCommit = gitCommit;
    return this;
  }

   /**
   * Get gitCommit
   * @return gitCommit
  **/
  @jakarta.annotation.Nonnull
  public String getGitCommit() {
    return gitCommit;
  }


  public void setGitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
  }


  public VersionInfo gitTreeState(String gitTreeState) {

    this.gitTreeState = gitTreeState;
    return this;
  }

   /**
   * Get gitTreeState
   * @return gitTreeState
  **/
  @jakarta.annotation.Nonnull
  public String getGitTreeState() {
    return gitTreeState;
  }


  public void setGitTreeState(String gitTreeState) {
    this.gitTreeState = gitTreeState;
  }


  public VersionInfo gitVersion(String gitVersion) {

    this.gitVersion = gitVersion;
    return this;
  }

   /**
   * Get gitVersion
   * @return gitVersion
  **/
  @jakarta.annotation.Nonnull
  public String getGitVersion() {
    return gitVersion;
  }


  public void setGitVersion(String gitVersion) {
    this.gitVersion = gitVersion;
  }


  public VersionInfo goVersion(String goVersion) {

    this.goVersion = goVersion;
    return this;
  }

   /**
   * Get goVersion
   * @return goVersion
  **/
  @jakarta.annotation.Nonnull
  public String getGoVersion() {
    return goVersion;
  }


  public void setGoVersion(String goVersion) {
    this.goVersion = goVersion;
  }


  public VersionInfo major(String major) {

    this.major = major;
    return this;
  }

   /**
   * Get major
   * @return major
  **/
  @jakarta.annotation.Nonnull
  public String getMajor() {
    return major;
  }


  public void setMajor(String major) {
    this.major = major;
  }


  public VersionInfo minor(String minor) {

    this.minor = minor;
    return this;
  }

   /**
   * Get minor
   * @return minor
  **/
  @jakarta.annotation.Nonnull
  public String getMinor() {
    return minor;
  }


  public void setMinor(String minor) {
    this.minor = minor;
  }


  public VersionInfo platform(String platform) {

    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @jakarta.annotation.Nonnull
  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    this.platform = platform;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionInfo versionInfo = (VersionInfo) o;
    return Objects.equals(this.buildDate, versionInfo.buildDate) &&
        Objects.equals(this.compiler, versionInfo.compiler) &&
        Objects.equals(this.gitCommit, versionInfo.gitCommit) &&
        Objects.equals(this.gitTreeState, versionInfo.gitTreeState) &&
        Objects.equals(this.gitVersion, versionInfo.gitVersion) &&
        Objects.equals(this.goVersion, versionInfo.goVersion) &&
        Objects.equals(this.major, versionInfo.major) &&
        Objects.equals(this.minor, versionInfo.minor) &&
        Objects.equals(this.platform, versionInfo.platform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildDate, compiler, gitCommit, gitTreeState, gitVersion, goVersion, major, minor, platform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionInfo {\n");
    sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
    sb.append("    compiler: ").append(toIndentedString(compiler)).append("\n");
    sb.append("    gitCommit: ").append(toIndentedString(gitCommit)).append("\n");
    sb.append("    gitTreeState: ").append(toIndentedString(gitTreeState)).append("\n");
    sb.append("    gitVersion: ").append(toIndentedString(gitVersion)).append("\n");
    sb.append("    goVersion: ").append(toIndentedString(goVersion)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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
    openapiFields.add("buildDate");
    openapiFields.add("compiler");
    openapiFields.add("gitCommit");
    openapiFields.add("gitTreeState");
    openapiFields.add("gitVersion");
    openapiFields.add("goVersion");
    openapiFields.add("major");
    openapiFields.add("minor");
    openapiFields.add("platform");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("buildDate");
    openapiRequiredFields.add("compiler");
    openapiRequiredFields.add("gitCommit");
    openapiRequiredFields.add("gitTreeState");
    openapiRequiredFields.add("gitVersion");
    openapiRequiredFields.add("goVersion");
    openapiRequiredFields.add("major");
    openapiRequiredFields.add("minor");
    openapiRequiredFields.add("platform");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VersionInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VersionInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionInfo is not found in the empty JSON string", VersionInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VersionInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VersionInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VersionInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("buildDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buildDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buildDate").toString()));
      }
      if (!jsonObj.get("compiler").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `compiler` to be a primitive type in the JSON string but got `%s`", jsonObj.get("compiler").toString()));
      }
      if (!jsonObj.get("gitCommit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gitCommit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gitCommit").toString()));
      }
      if (!jsonObj.get("gitTreeState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gitTreeState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gitTreeState").toString()));
      }
      if (!jsonObj.get("gitVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gitVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gitVersion").toString()));
      }
      if (!jsonObj.get("goVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goVersion").toString()));
      }
      if (!jsonObj.get("major").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `major` to be a primitive type in the JSON string but got `%s`", jsonObj.get("major").toString()));
      }
      if (!jsonObj.get("minor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minor").toString()));
      }
      if (!jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionInfo>() {
           @Override
           public void write(JsonWriter out, VersionInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VersionInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VersionInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VersionInfo
  * @throws IOException if the JSON string is invalid with respect to VersionInfo
  */
  public static VersionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionInfo.class);
  }

 /**
  * Convert an instance of VersionInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
