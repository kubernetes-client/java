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
import java.util.Locale;

import io.kubernetes.client.openapi.JSON;

/**
 * Info contains versioning information. how we&#39;ll want to distribute that information.
 */
@ApiModel(description = "Info contains versioning information. how we'll want to distribute that information.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-11-21T03:25:56.836812Z[Etc/UTC]", comments = "Generator version: 7.16.0")
public class VersionInfo {
  public static final String SERIALIZED_NAME_BUILD_DATE = "buildDate";
  @SerializedName(SERIALIZED_NAME_BUILD_DATE)
  @jakarta.annotation.Nonnull
  private String buildDate;

  public static final String SERIALIZED_NAME_COMPILER = "compiler";
  @SerializedName(SERIALIZED_NAME_COMPILER)
  @jakarta.annotation.Nonnull
  private String compiler;

  public static final String SERIALIZED_NAME_EMULATION_MAJOR = "emulationMajor";
  @SerializedName(SERIALIZED_NAME_EMULATION_MAJOR)
  @jakarta.annotation.Nullable
  private String emulationMajor;

  public static final String SERIALIZED_NAME_EMULATION_MINOR = "emulationMinor";
  @SerializedName(SERIALIZED_NAME_EMULATION_MINOR)
  @jakarta.annotation.Nullable
  private String emulationMinor;

  public static final String SERIALIZED_NAME_GIT_COMMIT = "gitCommit";
  @SerializedName(SERIALIZED_NAME_GIT_COMMIT)
  @jakarta.annotation.Nonnull
  private String gitCommit;

  public static final String SERIALIZED_NAME_GIT_TREE_STATE = "gitTreeState";
  @SerializedName(SERIALIZED_NAME_GIT_TREE_STATE)
  @jakarta.annotation.Nonnull
  private String gitTreeState;

  public static final String SERIALIZED_NAME_GIT_VERSION = "gitVersion";
  @SerializedName(SERIALIZED_NAME_GIT_VERSION)
  @jakarta.annotation.Nonnull
  private String gitVersion;

  public static final String SERIALIZED_NAME_GO_VERSION = "goVersion";
  @SerializedName(SERIALIZED_NAME_GO_VERSION)
  @jakarta.annotation.Nonnull
  private String goVersion;

  public static final String SERIALIZED_NAME_MAJOR = "major";
  @SerializedName(SERIALIZED_NAME_MAJOR)
  @jakarta.annotation.Nonnull
  private String major;

  public static final String SERIALIZED_NAME_MIN_COMPATIBILITY_MAJOR = "minCompatibilityMajor";
  @SerializedName(SERIALIZED_NAME_MIN_COMPATIBILITY_MAJOR)
  @jakarta.annotation.Nullable
  private String minCompatibilityMajor;

  public static final String SERIALIZED_NAME_MIN_COMPATIBILITY_MINOR = "minCompatibilityMinor";
  @SerializedName(SERIALIZED_NAME_MIN_COMPATIBILITY_MINOR)
  @jakarta.annotation.Nullable
  private String minCompatibilityMinor;

  public static final String SERIALIZED_NAME_MINOR = "minor";
  @SerializedName(SERIALIZED_NAME_MINOR)
  @jakarta.annotation.Nonnull
  private String minor;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  @jakarta.annotation.Nonnull
  private String platform;

  public VersionInfo() {
  }

  public VersionInfo buildDate(@jakarta.annotation.Nonnull String buildDate) {
    this.buildDate = buildDate;
    return this;
  }

  /**
   * Get buildDate
   * @return buildDate
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public String getBuildDate() {
    return buildDate;
  }

  public void setBuildDate(@jakarta.annotation.Nonnull String buildDate) {
    this.buildDate = buildDate;
  }


  public VersionInfo compiler(@jakarta.annotation.Nonnull String compiler) {
    this.compiler = compiler;
    return this;
  }

  /**
   * Get compiler
   * @return compiler
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public String getCompiler() {
    return compiler;
  }

  public void setCompiler(@jakarta.annotation.Nonnull String compiler) {
    this.compiler = compiler;
  }


  public VersionInfo emulationMajor(@jakarta.annotation.Nullable String emulationMajor) {
    this.emulationMajor = emulationMajor;
    return this;
  }

  /**
   * EmulationMajor is the major version of the emulation version
   * @return emulationMajor
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "EmulationMajor is the major version of the emulation version")
  public String getEmulationMajor() {
    return emulationMajor;
  }

  public void setEmulationMajor(@jakarta.annotation.Nullable String emulationMajor) {
    this.emulationMajor = emulationMajor;
  }


  public VersionInfo emulationMinor(@jakarta.annotation.Nullable String emulationMinor) {
    this.emulationMinor = emulationMinor;
    return this;
  }

  /**
   * EmulationMinor is the minor version of the emulation version
   * @return emulationMinor
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "EmulationMinor is the minor version of the emulation version")
  public String getEmulationMinor() {
    return emulationMinor;
  }

  public void setEmulationMinor(@jakarta.annotation.Nullable String emulationMinor) {
    this.emulationMinor = emulationMinor;
  }


  public VersionInfo gitCommit(@jakarta.annotation.Nonnull String gitCommit) {
    this.gitCommit = gitCommit;
    return this;
  }

  /**
   * Get gitCommit
   * @return gitCommit
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public String getGitCommit() {
    return gitCommit;
  }

  public void setGitCommit(@jakarta.annotation.Nonnull String gitCommit) {
    this.gitCommit = gitCommit;
  }


  public VersionInfo gitTreeState(@jakarta.annotation.Nonnull String gitTreeState) {
    this.gitTreeState = gitTreeState;
    return this;
  }

  /**
   * Get gitTreeState
   * @return gitTreeState
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public String getGitTreeState() {
    return gitTreeState;
  }

  public void setGitTreeState(@jakarta.annotation.Nonnull String gitTreeState) {
    this.gitTreeState = gitTreeState;
  }


  public VersionInfo gitVersion(@jakarta.annotation.Nonnull String gitVersion) {
    this.gitVersion = gitVersion;
    return this;
  }

  /**
   * Get gitVersion
   * @return gitVersion
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public String getGitVersion() {
    return gitVersion;
  }

  public void setGitVersion(@jakarta.annotation.Nonnull String gitVersion) {
    this.gitVersion = gitVersion;
  }


  public VersionInfo goVersion(@jakarta.annotation.Nonnull String goVersion) {
    this.goVersion = goVersion;
    return this;
  }

  /**
   * Get goVersion
   * @return goVersion
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public String getGoVersion() {
    return goVersion;
  }

  public void setGoVersion(@jakarta.annotation.Nonnull String goVersion) {
    this.goVersion = goVersion;
  }


  public VersionInfo major(@jakarta.annotation.Nonnull String major) {
    this.major = major;
    return this;
  }

  /**
   * Major is the major version of the binary version
   * @return major
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Major is the major version of the binary version")
  public String getMajor() {
    return major;
  }

  public void setMajor(@jakarta.annotation.Nonnull String major) {
    this.major = major;
  }


  public VersionInfo minCompatibilityMajor(@jakarta.annotation.Nullable String minCompatibilityMajor) {
    this.minCompatibilityMajor = minCompatibilityMajor;
    return this;
  }

  /**
   * MinCompatibilityMajor is the major version of the minimum compatibility version
   * @return minCompatibilityMajor
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "MinCompatibilityMajor is the major version of the minimum compatibility version")
  public String getMinCompatibilityMajor() {
    return minCompatibilityMajor;
  }

  public void setMinCompatibilityMajor(@jakarta.annotation.Nullable String minCompatibilityMajor) {
    this.minCompatibilityMajor = minCompatibilityMajor;
  }


  public VersionInfo minCompatibilityMinor(@jakarta.annotation.Nullable String minCompatibilityMinor) {
    this.minCompatibilityMinor = minCompatibilityMinor;
    return this;
  }

  /**
   * MinCompatibilityMinor is the minor version of the minimum compatibility version
   * @return minCompatibilityMinor
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "MinCompatibilityMinor is the minor version of the minimum compatibility version")
  public String getMinCompatibilityMinor() {
    return minCompatibilityMinor;
  }

  public void setMinCompatibilityMinor(@jakarta.annotation.Nullable String minCompatibilityMinor) {
    this.minCompatibilityMinor = minCompatibilityMinor;
  }


  public VersionInfo minor(@jakarta.annotation.Nonnull String minor) {
    this.minor = minor;
    return this;
  }

  /**
   * Minor is the minor version of the binary version
   * @return minor
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Minor is the minor version of the binary version")
  public String getMinor() {
    return minor;
  }

  public void setMinor(@jakarta.annotation.Nonnull String minor) {
    this.minor = minor;
  }


  public VersionInfo platform(@jakarta.annotation.Nonnull String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(@jakarta.annotation.Nonnull String platform) {
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
        Objects.equals(this.emulationMajor, versionInfo.emulationMajor) &&
        Objects.equals(this.emulationMinor, versionInfo.emulationMinor) &&
        Objects.equals(this.gitCommit, versionInfo.gitCommit) &&
        Objects.equals(this.gitTreeState, versionInfo.gitTreeState) &&
        Objects.equals(this.gitVersion, versionInfo.gitVersion) &&
        Objects.equals(this.goVersion, versionInfo.goVersion) &&
        Objects.equals(this.major, versionInfo.major) &&
        Objects.equals(this.minCompatibilityMajor, versionInfo.minCompatibilityMajor) &&
        Objects.equals(this.minCompatibilityMinor, versionInfo.minCompatibilityMinor) &&
        Objects.equals(this.minor, versionInfo.minor) &&
        Objects.equals(this.platform, versionInfo.platform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildDate, compiler, emulationMajor, emulationMinor, gitCommit, gitTreeState, gitVersion, goVersion, major, minCompatibilityMajor, minCompatibilityMinor, minor, platform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionInfo {\n");
    sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
    sb.append("    compiler: ").append(toIndentedString(compiler)).append("\n");
    sb.append("    emulationMajor: ").append(toIndentedString(emulationMajor)).append("\n");
    sb.append("    emulationMinor: ").append(toIndentedString(emulationMinor)).append("\n");
    sb.append("    gitCommit: ").append(toIndentedString(gitCommit)).append("\n");
    sb.append("    gitTreeState: ").append(toIndentedString(gitTreeState)).append("\n");
    sb.append("    gitVersion: ").append(toIndentedString(gitVersion)).append("\n");
    sb.append("    goVersion: ").append(toIndentedString(goVersion)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minCompatibilityMajor: ").append(toIndentedString(minCompatibilityMajor)).append("\n");
    sb.append("    minCompatibilityMinor: ").append(toIndentedString(minCompatibilityMinor)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("buildDate", "compiler", "emulationMajor", "emulationMinor", "gitCommit", "gitTreeState", "gitVersion", "goVersion", "major", "minCompatibilityMajor", "minCompatibilityMinor", "minor", "platform"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("buildDate", "compiler", "gitCommit", "gitTreeState", "gitVersion", "goVersion", "major", "minor", "platform"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VersionInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VersionInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field(s) %s in VersionInfo is not found in the empty JSON string", VersionInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VersionInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The field `%s` in the JSON string is not defined in the `VersionInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VersionInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("buildDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `buildDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buildDate").toString()));
      }
      if (!jsonObj.get("compiler").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `compiler` to be a primitive type in the JSON string but got `%s`", jsonObj.get("compiler").toString()));
      }
      if ((jsonObj.get("emulationMajor") != null && !jsonObj.get("emulationMajor").isJsonNull()) && !jsonObj.get("emulationMajor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `emulationMajor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emulationMajor").toString()));
      }
      if ((jsonObj.get("emulationMinor") != null && !jsonObj.get("emulationMinor").isJsonNull()) && !jsonObj.get("emulationMinor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `emulationMinor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emulationMinor").toString()));
      }
      if (!jsonObj.get("gitCommit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `gitCommit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gitCommit").toString()));
      }
      if (!jsonObj.get("gitTreeState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `gitTreeState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gitTreeState").toString()));
      }
      if (!jsonObj.get("gitVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `gitVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gitVersion").toString()));
      }
      if (!jsonObj.get("goVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `goVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goVersion").toString()));
      }
      if (!jsonObj.get("major").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `major` to be a primitive type in the JSON string but got `%s`", jsonObj.get("major").toString()));
      }
      if ((jsonObj.get("minCompatibilityMajor") != null && !jsonObj.get("minCompatibilityMajor").isJsonNull()) && !jsonObj.get("minCompatibilityMajor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `minCompatibilityMajor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minCompatibilityMajor").toString()));
      }
      if ((jsonObj.get("minCompatibilityMinor") != null && !jsonObj.get("minCompatibilityMinor").isJsonNull()) && !jsonObj.get("minCompatibilityMinor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `minCompatibilityMinor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minCompatibilityMinor").toString()));
      }
      if (!jsonObj.get("minor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `minor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minor").toString()));
      }
      if (!jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
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
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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
