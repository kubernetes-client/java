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
import io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReference;
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
 * APIServiceSpec contains information for locating and communicating with a server. Only https is supported, though you are able to disable certificate verification.
 */
@ApiModel(description = "APIServiceSpec contains information for locating and communicating with a server. Only https is supported, though you are able to disable certificate verification.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1APIServiceSpec {
  public static final String SERIALIZED_NAME_CA_BUNDLE = "caBundle";
  @SerializedName(SERIALIZED_NAME_CA_BUNDLE)
  @jakarta.annotation.Nullable
  private byte[] caBundle;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  @jakarta.annotation.Nullable
  private String group;

  public static final String SERIALIZED_NAME_GROUP_PRIORITY_MINIMUM = "groupPriorityMinimum";
  @SerializedName(SERIALIZED_NAME_GROUP_PRIORITY_MINIMUM)
  @jakarta.annotation.Nonnull
  private Integer groupPriorityMinimum;

  public static final String SERIALIZED_NAME_INSECURE_SKIP_T_L_S_VERIFY = "insecureSkipTLSVerify";
  @SerializedName(SERIALIZED_NAME_INSECURE_SKIP_T_L_S_VERIFY)
  @jakarta.annotation.Nullable
  private Boolean insecureSkipTLSVerify;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  @jakarta.annotation.Nullable
  private ApiregistrationV1ServiceReference service;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  @jakarta.annotation.Nullable
  private String version;

  public static final String SERIALIZED_NAME_VERSION_PRIORITY = "versionPriority";
  @SerializedName(SERIALIZED_NAME_VERSION_PRIORITY)
  @jakarta.annotation.Nonnull
  private Integer versionPriority;

  public V1APIServiceSpec() {
  }

  public V1APIServiceSpec caBundle(@jakarta.annotation.Nullable byte[] caBundle) {
    this.caBundle = caBundle;
    return this;
  }

  /**
   * CABundle is a PEM encoded CA bundle which will be used to validate an API server&#39;s serving certificate. If unspecified, system trust roots on the apiserver are used.
   * @return caBundle
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving certificate. If unspecified, system trust roots on the apiserver are used.")
  public byte[] getCaBundle() {
    return caBundle;
  }

  public void setCaBundle(@jakarta.annotation.Nullable byte[] caBundle) {
    this.caBundle = caBundle;
  }


  public V1APIServiceSpec group(@jakarta.annotation.Nullable String group) {
    this.group = group;
    return this;
  }

  /**
   * Group is the API group name this server hosts
   * @return group
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Group is the API group name this server hosts")
  public String getGroup() {
    return group;
  }

  public void setGroup(@jakarta.annotation.Nullable String group) {
    this.group = group;
  }


  public V1APIServiceSpec groupPriorityMinimum(@jakarta.annotation.Nonnull Integer groupPriorityMinimum) {
    this.groupPriorityMinimum = groupPriorityMinimum;
    return this;
  }

  /**
   * GroupPriorityMinimum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMinimum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We&#39;d recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
   * @return groupPriorityMinimum
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "GroupPriorityMinimum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMinimum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We'd recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s")
  public Integer getGroupPriorityMinimum() {
    return groupPriorityMinimum;
  }

  public void setGroupPriorityMinimum(@jakarta.annotation.Nonnull Integer groupPriorityMinimum) {
    this.groupPriorityMinimum = groupPriorityMinimum;
  }


  public V1APIServiceSpec insecureSkipTLSVerify(@jakarta.annotation.Nullable Boolean insecureSkipTLSVerify) {
    this.insecureSkipTLSVerify = insecureSkipTLSVerify;
    return this;
  }

  /**
   * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.
   * @return insecureSkipTLSVerify
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.")
  public Boolean getInsecureSkipTLSVerify() {
    return insecureSkipTLSVerify;
  }

  public void setInsecureSkipTLSVerify(@jakarta.annotation.Nullable Boolean insecureSkipTLSVerify) {
    this.insecureSkipTLSVerify = insecureSkipTLSVerify;
  }


  public V1APIServiceSpec service(@jakarta.annotation.Nullable ApiregistrationV1ServiceReference service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public ApiregistrationV1ServiceReference getService() {
    return service;
  }

  public void setService(@jakarta.annotation.Nullable ApiregistrationV1ServiceReference service) {
    this.service = service;
  }


  public V1APIServiceSpec version(@jakarta.annotation.Nullable String version) {
    this.version = version;
    return this;
  }

  /**
   * Version is the API version this server hosts.  For example, \&quot;v1\&quot;
   * @return version
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Version is the API version this server hosts.  For example, \"v1\"")
  public String getVersion() {
    return version;
  }

  public void setVersion(@jakarta.annotation.Nullable String version) {
    this.version = version;
  }


  public V1APIServiceSpec versionPriority(@jakarta.annotation.Nonnull Integer versionPriority) {
    this.versionPriority = versionPriority;
    return this;
  }

  /**
   * VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it&#39;s inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is \&quot;kube-like\&quot;, it will sort above non \&quot;kube-like\&quot; version strings, which are ordered lexicographically. \&quot;Kube-like\&quot; versions start with a \&quot;v\&quot;, then are followed by a number (the major version), then optionally the string \&quot;alpha\&quot; or \&quot;beta\&quot; and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
   * @return versionPriority
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is \"kube-like\", it will sort above non \"kube-like\" version strings, which are ordered lexicographically. \"Kube-like\" versions start with a \"v\", then are followed by a number (the major version), then optionally the string \"alpha\" or \"beta\" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.")
  public Integer getVersionPriority() {
    return versionPriority;
  }

  public void setVersionPriority(@jakarta.annotation.Nonnull Integer versionPriority) {
    this.versionPriority = versionPriority;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1APIServiceSpec v1APIServiceSpec = (V1APIServiceSpec) o;
    return Arrays.equals(this.caBundle, v1APIServiceSpec.caBundle) &&
        Objects.equals(this.group, v1APIServiceSpec.group) &&
        Objects.equals(this.groupPriorityMinimum, v1APIServiceSpec.groupPriorityMinimum) &&
        Objects.equals(this.insecureSkipTLSVerify, v1APIServiceSpec.insecureSkipTLSVerify) &&
        Objects.equals(this.service, v1APIServiceSpec.service) &&
        Objects.equals(this.version, v1APIServiceSpec.version) &&
        Objects.equals(this.versionPriority, v1APIServiceSpec.versionPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(caBundle), group, groupPriorityMinimum, insecureSkipTLSVerify, service, version, versionPriority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1APIServiceSpec {\n");
    sb.append("    caBundle: ").append(toIndentedString(caBundle)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groupPriorityMinimum: ").append(toIndentedString(groupPriorityMinimum)).append("\n");
    sb.append("    insecureSkipTLSVerify: ").append(toIndentedString(insecureSkipTLSVerify)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionPriority: ").append(toIndentedString(versionPriority)).append("\n");
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
    openapiFields.add("caBundle");
    openapiFields.add("group");
    openapiFields.add("groupPriorityMinimum");
    openapiFields.add("insecureSkipTLSVerify");
    openapiFields.add("service");
    openapiFields.add("version");
    openapiFields.add("versionPriority");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("groupPriorityMinimum");
    openapiRequiredFields.add("versionPriority");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1APIServiceSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1APIServiceSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1APIServiceSpec is not found in the empty JSON string", V1APIServiceSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1APIServiceSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1APIServiceSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1APIServiceSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) && !jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      // validate the optional field `service`
      if (jsonObj.get("service") != null && !jsonObj.get("service").isJsonNull()) {
        ApiregistrationV1ServiceReference.validateJsonElement(jsonObj.get("service"));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1APIServiceSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1APIServiceSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1APIServiceSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1APIServiceSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1APIServiceSpec>() {
           @Override
           public void write(JsonWriter out, V1APIServiceSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1APIServiceSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1APIServiceSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1APIServiceSpec
   * @throws IOException if the JSON string is invalid with respect to V1APIServiceSpec
   */
  public static V1APIServiceSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1APIServiceSpec.class);
  }

  /**
   * Convert an instance of V1APIServiceSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
