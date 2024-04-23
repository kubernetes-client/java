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
import io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1MatchCondition;
import io.kubernetes.client.openapi.models.V1RuleWithOperations;
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
 * MutatingWebhook describes an admission webhook and the resources and operations it applies to.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1MutatingWebhook {
  public static final String SERIALIZED_NAME_ADMISSION_REVIEW_VERSIONS = "admissionReviewVersions";
  @SerializedName(SERIALIZED_NAME_ADMISSION_REVIEW_VERSIONS)
  private List<String> admissionReviewVersions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLIENT_CONFIG = "clientConfig";
  @SerializedName(SERIALIZED_NAME_CLIENT_CONFIG)
  private AdmissionregistrationV1WebhookClientConfig clientConfig;

  public static final String SERIALIZED_NAME_FAILURE_POLICY = "failurePolicy";
  @SerializedName(SERIALIZED_NAME_FAILURE_POLICY)
  private String failurePolicy;

  public static final String SERIALIZED_NAME_MATCH_CONDITIONS = "matchConditions";
  @SerializedName(SERIALIZED_NAME_MATCH_CONDITIONS)
  private List<V1MatchCondition> matchConditions;

  public static final String SERIALIZED_NAME_MATCH_POLICY = "matchPolicy";
  @SerializedName(SERIALIZED_NAME_MATCH_POLICY)
  private String matchPolicy;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE_SELECTOR = "namespaceSelector";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_SELECTOR)
  private V1LabelSelector namespaceSelector;

  public static final String SERIALIZED_NAME_OBJECT_SELECTOR = "objectSelector";
  @SerializedName(SERIALIZED_NAME_OBJECT_SELECTOR)
  private V1LabelSelector objectSelector;

  public static final String SERIALIZED_NAME_REINVOCATION_POLICY = "reinvocationPolicy";
  @SerializedName(SERIALIZED_NAME_REINVOCATION_POLICY)
  private String reinvocationPolicy;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<V1RuleWithOperations> rules;

  public static final String SERIALIZED_NAME_SIDE_EFFECTS = "sideEffects";
  @SerializedName(SERIALIZED_NAME_SIDE_EFFECTS)
  private String sideEffects;

  public static final String SERIALIZED_NAME_TIMEOUT_SECONDS = "timeoutSeconds";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_SECONDS)
  private Integer timeoutSeconds;

  public V1MutatingWebhook() {
  }

  public V1MutatingWebhook admissionReviewVersions(List<String> admissionReviewVersions) {

    this.admissionReviewVersions = admissionReviewVersions;
    return this;
  }

  public V1MutatingWebhook addAdmissionReviewVersionsItem(String admissionReviewVersionsItem) {
    if (this.admissionReviewVersions == null) {
      this.admissionReviewVersions = new ArrayList<>();
    }
    this.admissionReviewVersions.add(admissionReviewVersionsItem);
    return this;
  }

   /**
   * AdmissionReviewVersions is an ordered list of preferred &#x60;AdmissionReview&#x60; versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy.
   * @return admissionReviewVersions
  **/
  @jakarta.annotation.Nonnull
  public List<String> getAdmissionReviewVersions() {
    return admissionReviewVersions;
  }


  public void setAdmissionReviewVersions(List<String> admissionReviewVersions) {
    this.admissionReviewVersions = admissionReviewVersions;
  }


  public V1MutatingWebhook clientConfig(AdmissionregistrationV1WebhookClientConfig clientConfig) {

    this.clientConfig = clientConfig;
    return this;
  }

   /**
   * Get clientConfig
   * @return clientConfig
  **/
  @jakarta.annotation.Nonnull
  public AdmissionregistrationV1WebhookClientConfig getClientConfig() {
    return clientConfig;
  }


  public void setClientConfig(AdmissionregistrationV1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
  }


  public V1MutatingWebhook failurePolicy(String failurePolicy) {

    this.failurePolicy = failurePolicy;
    return this;
  }

   /**
   * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Fail.
   * @return failurePolicy
  **/
  @jakarta.annotation.Nullable
  public String getFailurePolicy() {
    return failurePolicy;
  }


  public void setFailurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
  }


  public V1MutatingWebhook matchConditions(List<V1MatchCondition> matchConditions) {

    this.matchConditions = matchConditions;
    return this;
  }

  public V1MutatingWebhook addMatchConditionsItem(V1MatchCondition matchConditionsItem) {
    if (this.matchConditions == null) {
      this.matchConditions = new ArrayList<>();
    }
    this.matchConditions.add(matchConditionsItem);
    return this;
  }

   /**
   * MatchConditions is a list of conditions that must be met for a request to be sent to this webhook. Match conditions filter requests that have already been matched by the rules, namespaceSelector, and objectSelector. An empty list of matchConditions matches all requests. There are a maximum of 64 match conditions allowed.  The exact matching logic is (in order):   1. If ANY matchCondition evaluates to FALSE, the webhook is skipped.   2. If ALL matchConditions evaluate to TRUE, the webhook is called.   3. If any matchCondition evaluates to an error (but none are FALSE):      - If failurePolicy&#x3D;Fail, reject the request      - If failurePolicy&#x3D;Ignore, the error is ignored and the webhook is skipped
   * @return matchConditions
  **/
  @jakarta.annotation.Nullable
  public List<V1MatchCondition> getMatchConditions() {
    return matchConditions;
  }


  public void setMatchConditions(List<V1MatchCondition> matchConditions) {
    this.matchConditions = matchConditions;
  }


  public V1MutatingWebhook matchPolicy(String matchPolicy) {

    this.matchPolicy = matchPolicy;
    return this;
  }

   /**
   * matchPolicy defines how the \&quot;rules\&quot; list is used to match incoming requests. Allowed values are \&quot;Exact\&quot; or \&quot;Equivalent\&quot;.  - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but \&quot;rules\&quot; only included &#x60;apiGroups:[\&quot;apps\&quot;], apiVersions:[\&quot;v1\&quot;], resources: [\&quot;deployments\&quot;]&#x60;, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.  - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and \&quot;rules\&quot; only included &#x60;apiGroups:[\&quot;apps\&quot;], apiVersions:[\&quot;v1\&quot;], resources: [\&quot;deployments\&quot;]&#x60;, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.  Defaults to \&quot;Equivalent\&quot;
   * @return matchPolicy
  **/
  @jakarta.annotation.Nullable
  public String getMatchPolicy() {
    return matchPolicy;
  }


  public void setMatchPolicy(String matchPolicy) {
    this.matchPolicy = matchPolicy;
  }


  public V1MutatingWebhook name(String name) {

    this.name = name;
    return this;
  }

   /**
   * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where \&quot;imagepolicy\&quot; is the name of the webhook, and kubernetes.io is the name of the organization. Required.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1MutatingWebhook namespaceSelector(V1LabelSelector namespaceSelector) {

    this.namespaceSelector = namespaceSelector;
    return this;
  }

   /**
   * Get namespaceSelector
   * @return namespaceSelector
  **/
  @jakarta.annotation.Nullable
  public V1LabelSelector getNamespaceSelector() {
    return namespaceSelector;
  }


  public void setNamespaceSelector(V1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }


  public V1MutatingWebhook objectSelector(V1LabelSelector objectSelector) {

    this.objectSelector = objectSelector;
    return this;
  }

   /**
   * Get objectSelector
   * @return objectSelector
  **/
  @jakarta.annotation.Nullable
  public V1LabelSelector getObjectSelector() {
    return objectSelector;
  }


  public void setObjectSelector(V1LabelSelector objectSelector) {
    this.objectSelector = objectSelector;
  }


  public V1MutatingWebhook reinvocationPolicy(String reinvocationPolicy) {

    this.reinvocationPolicy = reinvocationPolicy;
    return this;
  }

   /**
   * reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation. Allowed values are \&quot;Never\&quot; and \&quot;IfNeeded\&quot;.  Never: the webhook will not be called more than once in a single admission evaluation.  IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option *must* be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.  Defaults to \&quot;Never\&quot;.
   * @return reinvocationPolicy
  **/
  @jakarta.annotation.Nullable
  public String getReinvocationPolicy() {
    return reinvocationPolicy;
  }


  public void setReinvocationPolicy(String reinvocationPolicy) {
    this.reinvocationPolicy = reinvocationPolicy;
  }


  public V1MutatingWebhook rules(List<V1RuleWithOperations> rules) {

    this.rules = rules;
    return this;
  }

  public V1MutatingWebhook addRulesItem(V1RuleWithOperations rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
   * @return rules
  **/
  @jakarta.annotation.Nullable
  public List<V1RuleWithOperations> getRules() {
    return rules;
  }


  public void setRules(List<V1RuleWithOperations> rules) {
    this.rules = rules;
  }


  public V1MutatingWebhook sideEffects(String sideEffects) {

    this.sideEffects = sideEffects;
    return this;
  }

   /**
   * SideEffects states whether this webhook has side effects. Acceptable values are: None, NoneOnDryRun (webhooks created via v1beta1 may also specify Some or Unknown). Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission chain and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects &#x3D;&#x3D; Unknown or Some.
   * @return sideEffects
  **/
  @jakarta.annotation.Nonnull
  public String getSideEffects() {
    return sideEffects;
  }


  public void setSideEffects(String sideEffects) {
    this.sideEffects = sideEffects;
  }


  public V1MutatingWebhook timeoutSeconds(Integer timeoutSeconds) {

    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 10 seconds.
   * @return timeoutSeconds
  **/
  @jakarta.annotation.Nullable
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }


  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MutatingWebhook v1MutatingWebhook = (V1MutatingWebhook) o;
    return Objects.equals(this.admissionReviewVersions, v1MutatingWebhook.admissionReviewVersions) &&
        Objects.equals(this.clientConfig, v1MutatingWebhook.clientConfig) &&
        Objects.equals(this.failurePolicy, v1MutatingWebhook.failurePolicy) &&
        Objects.equals(this.matchConditions, v1MutatingWebhook.matchConditions) &&
        Objects.equals(this.matchPolicy, v1MutatingWebhook.matchPolicy) &&
        Objects.equals(this.name, v1MutatingWebhook.name) &&
        Objects.equals(this.namespaceSelector, v1MutatingWebhook.namespaceSelector) &&
        Objects.equals(this.objectSelector, v1MutatingWebhook.objectSelector) &&
        Objects.equals(this.reinvocationPolicy, v1MutatingWebhook.reinvocationPolicy) &&
        Objects.equals(this.rules, v1MutatingWebhook.rules) &&
        Objects.equals(this.sideEffects, v1MutatingWebhook.sideEffects) &&
        Objects.equals(this.timeoutSeconds, v1MutatingWebhook.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admissionReviewVersions, clientConfig, failurePolicy, matchConditions, matchPolicy, name, namespaceSelector, objectSelector, reinvocationPolicy, rules, sideEffects, timeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MutatingWebhook {\n");
    sb.append("    admissionReviewVersions: ").append(toIndentedString(admissionReviewVersions)).append("\n");
    sb.append("    clientConfig: ").append(toIndentedString(clientConfig)).append("\n");
    sb.append("    failurePolicy: ").append(toIndentedString(failurePolicy)).append("\n");
    sb.append("    matchConditions: ").append(toIndentedString(matchConditions)).append("\n");
    sb.append("    matchPolicy: ").append(toIndentedString(matchPolicy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    objectSelector: ").append(toIndentedString(objectSelector)).append("\n");
    sb.append("    reinvocationPolicy: ").append(toIndentedString(reinvocationPolicy)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    sideEffects: ").append(toIndentedString(sideEffects)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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
    openapiFields.add("admissionReviewVersions");
    openapiFields.add("clientConfig");
    openapiFields.add("failurePolicy");
    openapiFields.add("matchConditions");
    openapiFields.add("matchPolicy");
    openapiFields.add("name");
    openapiFields.add("namespaceSelector");
    openapiFields.add("objectSelector");
    openapiFields.add("reinvocationPolicy");
    openapiFields.add("rules");
    openapiFields.add("sideEffects");
    openapiFields.add("timeoutSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("admissionReviewVersions");
    openapiRequiredFields.add("clientConfig");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("sideEffects");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1MutatingWebhook
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1MutatingWebhook.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1MutatingWebhook is not found in the empty JSON string", V1MutatingWebhook.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1MutatingWebhook.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1MutatingWebhook` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1MutatingWebhook.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("admissionReviewVersions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("admissionReviewVersions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `admissionReviewVersions` to be an array in the JSON string but got `%s`", jsonObj.get("admissionReviewVersions").toString()));
      }
      // validate the required field `clientConfig`
      AdmissionregistrationV1WebhookClientConfig.validateJsonObject(jsonObj.getAsJsonObject("clientConfig"));
      if ((jsonObj.get("failurePolicy") != null && !jsonObj.get("failurePolicy").isJsonNull()) && !jsonObj.get("failurePolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failurePolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failurePolicy").toString()));
      }
      if (jsonObj.get("matchConditions") != null && !jsonObj.get("matchConditions").isJsonNull()) {
        JsonArray jsonArraymatchConditions = jsonObj.getAsJsonArray("matchConditions");
        if (jsonArraymatchConditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("matchConditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `matchConditions` to be an array in the JSON string but got `%s`", jsonObj.get("matchConditions").toString()));
          }

          // validate the optional field `matchConditions` (array)
          for (int i = 0; i < jsonArraymatchConditions.size(); i++) {
            V1MatchCondition.validateJsonObject(jsonArraymatchConditions.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("matchPolicy") != null && !jsonObj.get("matchPolicy").isJsonNull()) && !jsonObj.get("matchPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matchPolicy").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `namespaceSelector`
      if (jsonObj.get("namespaceSelector") != null && !jsonObj.get("namespaceSelector").isJsonNull()) {
        V1LabelSelector.validateJsonObject(jsonObj.getAsJsonObject("namespaceSelector"));
      }
      // validate the optional field `objectSelector`
      if (jsonObj.get("objectSelector") != null && !jsonObj.get("objectSelector").isJsonNull()) {
        V1LabelSelector.validateJsonObject(jsonObj.getAsJsonObject("objectSelector"));
      }
      if ((jsonObj.get("reinvocationPolicy") != null && !jsonObj.get("reinvocationPolicy").isJsonNull()) && !jsonObj.get("reinvocationPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reinvocationPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reinvocationPolicy").toString()));
      }
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) {
        JsonArray jsonArrayrules = jsonObj.getAsJsonArray("rules");
        if (jsonArrayrules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rules` to be an array in the JSON string but got `%s`", jsonObj.get("rules").toString()));
          }

          // validate the optional field `rules` (array)
          for (int i = 0; i < jsonArrayrules.size(); i++) {
            V1RuleWithOperations.validateJsonObject(jsonArrayrules.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("sideEffects").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sideEffects` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sideEffects").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1MutatingWebhook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1MutatingWebhook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1MutatingWebhook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1MutatingWebhook.class));

       return (TypeAdapter<T>) new TypeAdapter<V1MutatingWebhook>() {
           @Override
           public void write(JsonWriter out, V1MutatingWebhook value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1MutatingWebhook read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1MutatingWebhook given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1MutatingWebhook
  * @throws IOException if the JSON string is invalid with respect to V1MutatingWebhook
  */
  public static V1MutatingWebhook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1MutatingWebhook.class);
  }

 /**
  * Convert an instance of V1MutatingWebhook to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
