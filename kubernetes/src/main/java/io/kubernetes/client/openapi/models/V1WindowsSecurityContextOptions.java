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
 * WindowsSecurityContextOptions contain Windows-specific options and credentials.
 */
@ApiModel(description = "WindowsSecurityContextOptions contain Windows-specific options and credentials.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1WindowsSecurityContextOptions {
  public static final String SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC = "gmsaCredentialSpec";
  @SerializedName(SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC)
  @jakarta.annotation.Nullable
  private String gmsaCredentialSpec;

  public static final String SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC_NAME = "gmsaCredentialSpecName";
  @SerializedName(SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC_NAME)
  @jakarta.annotation.Nullable
  private String gmsaCredentialSpecName;

  public static final String SERIALIZED_NAME_HOST_PROCESS = "hostProcess";
  @SerializedName(SERIALIZED_NAME_HOST_PROCESS)
  @jakarta.annotation.Nullable
  private Boolean hostProcess;

  public static final String SERIALIZED_NAME_RUN_AS_USER_NAME = "runAsUserName";
  @SerializedName(SERIALIZED_NAME_RUN_AS_USER_NAME)
  @jakarta.annotation.Nullable
  private String runAsUserName;

  public V1WindowsSecurityContextOptions() {
  }

  public V1WindowsSecurityContextOptions gmsaCredentialSpec(@jakarta.annotation.Nullable String gmsaCredentialSpec) {
    this.gmsaCredentialSpec = gmsaCredentialSpec;
    return this;
  }

  /**
   * GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.
   * @return gmsaCredentialSpec
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.")
  public String getGmsaCredentialSpec() {
    return gmsaCredentialSpec;
  }

  public void setGmsaCredentialSpec(@jakarta.annotation.Nullable String gmsaCredentialSpec) {
    this.gmsaCredentialSpec = gmsaCredentialSpec;
  }


  public V1WindowsSecurityContextOptions gmsaCredentialSpecName(@jakarta.annotation.Nullable String gmsaCredentialSpecName) {
    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    return this;
  }

  /**
   * GMSACredentialSpecName is the name of the GMSA credential spec to use.
   * @return gmsaCredentialSpecName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "GMSACredentialSpecName is the name of the GMSA credential spec to use.")
  public String getGmsaCredentialSpecName() {
    return gmsaCredentialSpecName;
  }

  public void setGmsaCredentialSpecName(@jakarta.annotation.Nullable String gmsaCredentialSpecName) {
    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
  }


  public V1WindowsSecurityContextOptions hostProcess(@jakarta.annotation.Nullable Boolean hostProcess) {
    this.hostProcess = hostProcess;
    return this;
  }

  /**
   * HostProcess determines if a container should be run as a &#39;Host Process&#39; container. All of a Pod&#39;s containers must have the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers). In addition, if HostProcess is true then HostNetwork must also be set to true.
   * @return hostProcess
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "HostProcess determines if a container should be run as a 'Host Process' container. All of a Pod's containers must have the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers). In addition, if HostProcess is true then HostNetwork must also be set to true.")
  public Boolean getHostProcess() {
    return hostProcess;
  }

  public void setHostProcess(@jakarta.annotation.Nullable Boolean hostProcess) {
    this.hostProcess = hostProcess;
  }


  public V1WindowsSecurityContextOptions runAsUserName(@jakarta.annotation.Nullable String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return this;
  }

  /**
   * The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   * @return runAsUserName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  public String getRunAsUserName() {
    return runAsUserName;
  }

  public void setRunAsUserName(@jakarta.annotation.Nullable String runAsUserName) {
    this.runAsUserName = runAsUserName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WindowsSecurityContextOptions v1WindowsSecurityContextOptions = (V1WindowsSecurityContextOptions) o;
    return Objects.equals(this.gmsaCredentialSpec, v1WindowsSecurityContextOptions.gmsaCredentialSpec) &&
        Objects.equals(this.gmsaCredentialSpecName, v1WindowsSecurityContextOptions.gmsaCredentialSpecName) &&
        Objects.equals(this.hostProcess, v1WindowsSecurityContextOptions.hostProcess) &&
        Objects.equals(this.runAsUserName, v1WindowsSecurityContextOptions.runAsUserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gmsaCredentialSpec, gmsaCredentialSpecName, hostProcess, runAsUserName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WindowsSecurityContextOptions {\n");
    sb.append("    gmsaCredentialSpec: ").append(toIndentedString(gmsaCredentialSpec)).append("\n");
    sb.append("    gmsaCredentialSpecName: ").append(toIndentedString(gmsaCredentialSpecName)).append("\n");
    sb.append("    hostProcess: ").append(toIndentedString(hostProcess)).append("\n");
    sb.append("    runAsUserName: ").append(toIndentedString(runAsUserName)).append("\n");
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
    openapiFields.add("gmsaCredentialSpec");
    openapiFields.add("gmsaCredentialSpecName");
    openapiFields.add("hostProcess");
    openapiFields.add("runAsUserName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1WindowsSecurityContextOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1WindowsSecurityContextOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1WindowsSecurityContextOptions is not found in the empty JSON string", V1WindowsSecurityContextOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1WindowsSecurityContextOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1WindowsSecurityContextOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("gmsaCredentialSpec") != null && !jsonObj.get("gmsaCredentialSpec").isJsonNull()) && !jsonObj.get("gmsaCredentialSpec").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmsaCredentialSpec` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmsaCredentialSpec").toString()));
      }
      if ((jsonObj.get("gmsaCredentialSpecName") != null && !jsonObj.get("gmsaCredentialSpecName").isJsonNull()) && !jsonObj.get("gmsaCredentialSpecName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmsaCredentialSpecName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmsaCredentialSpecName").toString()));
      }
      if ((jsonObj.get("runAsUserName") != null && !jsonObj.get("runAsUserName").isJsonNull()) && !jsonObj.get("runAsUserName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runAsUserName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runAsUserName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1WindowsSecurityContextOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1WindowsSecurityContextOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1WindowsSecurityContextOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1WindowsSecurityContextOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<V1WindowsSecurityContextOptions>() {
           @Override
           public void write(JsonWriter out, V1WindowsSecurityContextOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1WindowsSecurityContextOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1WindowsSecurityContextOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1WindowsSecurityContextOptions
   * @throws IOException if the JSON string is invalid with respect to V1WindowsSecurityContextOptions
   */
  public static V1WindowsSecurityContextOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1WindowsSecurityContextOptions.class);
  }

  /**
   * Convert an instance of V1WindowsSecurityContextOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
