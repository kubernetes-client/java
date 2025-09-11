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
import io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1MatchCondition;
import io.kubernetes.client.openapi.models.V1RuleWithOperations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ValidatingWebhook describes an admission webhook and the resources and operations it applies to.
 */
@ApiModel(description = "ValidatingWebhook describes an admission webhook and the resources and operations it applies to.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ValidatingWebhook {
  public static final String SERIALIZED_NAME_ADMISSION_REVIEW_VERSIONS = "admissionReviewVersions";
  @SerializedName(SERIALIZED_NAME_ADMISSION_REVIEW_VERSIONS)
  @jakarta.annotation.Nonnull
  private List<String> admissionReviewVersions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLIENT_CONFIG = "clientConfig";
  @SerializedName(SERIALIZED_NAME_CLIENT_CONFIG)
  @jakarta.annotation.Nonnull
  private AdmissionregistrationV1WebhookClientConfig clientConfig;

  public static final String SERIALIZED_NAME_FAILURE_POLICY = "failurePolicy";
  @SerializedName(SERIALIZED_NAME_FAILURE_POLICY)
  @jakarta.annotation.Nullable
  private String failurePolicy;

  public static final String SERIALIZED_NAME_MATCH_CONDITIONS = "matchConditions";
  @SerializedName(SERIALIZED_NAME_MATCH_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<V1MatchCondition> matchConditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_MATCH_POLICY = "matchPolicy";
  @SerializedName(SERIALIZED_NAME_MATCH_POLICY)
  @jakarta.annotation.Nullable
  private String matchPolicy;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE_SELECTOR = "namespaceSelector";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_SELECTOR)
  @jakarta.annotation.Nullable
  private V1LabelSelector namespaceSelector;

  public static final String SERIALIZED_NAME_OBJECT_SELECTOR = "objectSelector";
  @SerializedName(SERIALIZED_NAME_OBJECT_SELECTOR)
  @jakarta.annotation.Nullable
  private V1LabelSelector objectSelector;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  @jakarta.annotation.Nullable
  private List<V1RuleWithOperations> rules = new ArrayList<>();

  public static final String SERIALIZED_NAME_SIDE_EFFECTS = "sideEffects";
  @SerializedName(SERIALIZED_NAME_SIDE_EFFECTS)
  @jakarta.annotation.Nonnull
  private String sideEffects;

  public static final String SERIALIZED_NAME_TIMEOUT_SECONDS = "timeoutSeconds";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_SECONDS)
  @jakarta.annotation.Nullable
  private Integer timeoutSeconds;

  public V1ValidatingWebhook() {
  }

  public V1ValidatingWebhook admissionReviewVersions(@jakarta.annotation.Nonnull List<String> admissionReviewVersions) {
    this.admissionReviewVersions = admissionReviewVersions;
    return this;
  }

  public V1ValidatingWebhook addAdmissionReviewVersionsItem(String admissionReviewVersionsItem) {
    if (this.admissionReviewVersions == null) {
      this.admissionReviewVersions = new ArrayList<>();
    }
    this.admissionReviewVersions.add(admissionReviewVersionsItem);
    return this;
  }

  /**
   * AdmissionReviewVersions is an ordered list of preferred &#x60;AdmissionReview&#x60; versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy.
   * @return admissionReviewVersions
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy.")
  public List<String> getAdmissionReviewVersions() {
    return admissionReviewVersions;
  }

  public void setAdmissionReviewVersions(@jakarta.annotation.Nonnull List<String> admissionReviewVersions) {
    this.admissionReviewVersions = admissionReviewVersions;
  }


  public V1ValidatingWebhook clientConfig(@jakarta.annotation.Nonnull AdmissionregistrationV1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
    return this;
  }

  /**
   * Get clientConfig
   * @return clientConfig
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public AdmissionregistrationV1WebhookClientConfig getClientConfig() {
    return clientConfig;
  }

  public void setClientConfig(@jakarta.annotation.Nonnull AdmissionregistrationV1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
  }


  public V1ValidatingWebhook failurePolicy(@jakarta.annotation.Nullable String failurePolicy) {
    this.failurePolicy = failurePolicy;
    return this;
  }

  /**
   * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Fail.
   * @return failurePolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Fail.")
  public String getFailurePolicy() {
    return failurePolicy;
  }

  public void setFailurePolicy(@jakarta.annotation.Nullable String failurePolicy) {
    this.failurePolicy = failurePolicy;
  }


  public V1ValidatingWebhook matchConditions(@jakarta.annotation.Nullable List<V1MatchCondition> matchConditions) {
    this.matchConditions = matchConditions;
    return this;
  }

  public V1ValidatingWebhook addMatchConditionsItem(V1MatchCondition matchConditionsItem) {
    if (this.matchConditions == null) {
      this.matchConditions = new ArrayList<>();
    }
    this.matchConditions.add(matchConditionsItem);
    return this;
  }

  /**
   * MatchConditions is a list of conditions that must be met for a request to be sent to this webhook. Match conditions filter requests that have already been matched by the rules, namespaceSelector, and objectSelector. An empty list of matchConditions matches all requests. There are a maximum of 64 match conditions allowed.  The exact matching logic is (in order):   1. If ANY matchCondition evaluates to FALSE, the webhook is skipped.   2. If ALL matchConditions evaluate to TRUE, the webhook is called.   3. If any matchCondition evaluates to an error (but none are FALSE):      - If failurePolicy&#x3D;Fail, reject the request      - If failurePolicy&#x3D;Ignore, the error is ignored and the webhook is skipped
   * @return matchConditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "MatchConditions is a list of conditions that must be met for a request to be sent to this webhook. Match conditions filter requests that have already been matched by the rules, namespaceSelector, and objectSelector. An empty list of matchConditions matches all requests. There are a maximum of 64 match conditions allowed.  The exact matching logic is (in order):   1. If ANY matchCondition evaluates to FALSE, the webhook is skipped.   2. If ALL matchConditions evaluate to TRUE, the webhook is called.   3. If any matchCondition evaluates to an error (but none are FALSE):      - If failurePolicy=Fail, reject the request      - If failurePolicy=Ignore, the error is ignored and the webhook is skipped")
  public List<V1MatchCondition> getMatchConditions() {
    return matchConditions;
  }

  public void setMatchConditions(@jakarta.annotation.Nullable List<V1MatchCondition> matchConditions) {
    this.matchConditions = matchConditions;
  }


  public V1ValidatingWebhook matchPolicy(@jakarta.annotation.Nullable String matchPolicy) {
    this.matchPolicy = matchPolicy;
    return this;
  }

  /**
   * matchPolicy defines how the \&quot;rules\&quot; list is used to match incoming requests. Allowed values are \&quot;Exact\&quot; or \&quot;Equivalent\&quot;.  - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but \&quot;rules\&quot; only included &#x60;apiGroups:[\&quot;apps\&quot;], apiVersions:[\&quot;v1\&quot;], resources: [\&quot;deployments\&quot;]&#x60;, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.  - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and \&quot;rules\&quot; only included &#x60;apiGroups:[\&quot;apps\&quot;], apiVersions:[\&quot;v1\&quot;], resources: [\&quot;deployments\&quot;]&#x60;, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.  Defaults to \&quot;Equivalent\&quot;
   * @return matchPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "matchPolicy defines how the \"rules\" list is used to match incoming requests. Allowed values are \"Exact\" or \"Equivalent\".  - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but \"rules\" only included `apiGroups:[\"apps\"], apiVersions:[\"v1\"], resources: [\"deployments\"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.  - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and \"rules\" only included `apiGroups:[\"apps\"], apiVersions:[\"v1\"], resources: [\"deployments\"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.  Defaults to \"Equivalent\"")
  public String getMatchPolicy() {
    return matchPolicy;
  }

  public void setMatchPolicy(@jakarta.annotation.Nullable String matchPolicy) {
    this.matchPolicy = matchPolicy;
  }


  public V1ValidatingWebhook name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where \&quot;imagepolicy\&quot; is the name of the webhook, and kubernetes.io is the name of the organization. Required.
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where \"imagepolicy\" is the name of the webhook, and kubernetes.io is the name of the organization. Required.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }


  public V1ValidatingWebhook namespaceSelector(@jakarta.annotation.Nullable V1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
    return this;
  }

  /**
   * Get namespaceSelector
   * @return namespaceSelector
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LabelSelector getNamespaceSelector() {
    return namespaceSelector;
  }

  public void setNamespaceSelector(@jakarta.annotation.Nullable V1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }


  public V1ValidatingWebhook objectSelector(@jakarta.annotation.Nullable V1LabelSelector objectSelector) {
    this.objectSelector = objectSelector;
    return this;
  }

  /**
   * Get objectSelector
   * @return objectSelector
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LabelSelector getObjectSelector() {
    return objectSelector;
  }

  public void setObjectSelector(@jakarta.annotation.Nullable V1LabelSelector objectSelector) {
    this.objectSelector = objectSelector;
  }


  public V1ValidatingWebhook rules(@jakarta.annotation.Nullable List<V1RuleWithOperations> rules) {
    this.rules = rules;
    return this;
  }

  public V1ValidatingWebhook addRulesItem(V1RuleWithOperations rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
   * @return rules
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.")
  public List<V1RuleWithOperations> getRules() {
    return rules;
  }

  public void setRules(@jakarta.annotation.Nullable List<V1RuleWithOperations> rules) {
    this.rules = rules;
  }


  public V1ValidatingWebhook sideEffects(@jakarta.annotation.Nonnull String sideEffects) {
    this.sideEffects = sideEffects;
    return this;
  }

  /**
   * SideEffects states whether this webhook has side effects. Acceptable values are: None, NoneOnDryRun (webhooks created via v1beta1 may also specify Some or Unknown). Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission chain and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects &#x3D;&#x3D; Unknown or Some.
   * @return sideEffects
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "SideEffects states whether this webhook has side effects. Acceptable values are: None, NoneOnDryRun (webhooks created via v1beta1 may also specify Some or Unknown). Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission chain and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some.")
  public String getSideEffects() {
    return sideEffects;
  }

  public void setSideEffects(@jakarta.annotation.Nonnull String sideEffects) {
    this.sideEffects = sideEffects;
  }


  public V1ValidatingWebhook timeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  /**
   * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 10 seconds.
   * @return timeoutSeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 10 seconds.")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
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
    V1ValidatingWebhook v1ValidatingWebhook = (V1ValidatingWebhook) o;
    return Objects.equals(this.admissionReviewVersions, v1ValidatingWebhook.admissionReviewVersions) &&
        Objects.equals(this.clientConfig, v1ValidatingWebhook.clientConfig) &&
        Objects.equals(this.failurePolicy, v1ValidatingWebhook.failurePolicy) &&
        Objects.equals(this.matchConditions, v1ValidatingWebhook.matchConditions) &&
        Objects.equals(this.matchPolicy, v1ValidatingWebhook.matchPolicy) &&
        Objects.equals(this.name, v1ValidatingWebhook.name) &&
        Objects.equals(this.namespaceSelector, v1ValidatingWebhook.namespaceSelector) &&
        Objects.equals(this.objectSelector, v1ValidatingWebhook.objectSelector) &&
        Objects.equals(this.rules, v1ValidatingWebhook.rules) &&
        Objects.equals(this.sideEffects, v1ValidatingWebhook.sideEffects) &&
        Objects.equals(this.timeoutSeconds, v1ValidatingWebhook.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admissionReviewVersions, clientConfig, failurePolicy, matchConditions, matchPolicy, name, namespaceSelector, objectSelector, rules, sideEffects, timeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ValidatingWebhook {\n");
    sb.append("    admissionReviewVersions: ").append(toIndentedString(admissionReviewVersions)).append("\n");
    sb.append("    clientConfig: ").append(toIndentedString(clientConfig)).append("\n");
    sb.append("    failurePolicy: ").append(toIndentedString(failurePolicy)).append("\n");
    sb.append("    matchConditions: ").append(toIndentedString(matchConditions)).append("\n");
    sb.append("    matchPolicy: ").append(toIndentedString(matchPolicy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    objectSelector: ").append(toIndentedString(objectSelector)).append("\n");
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
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ValidatingWebhook
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ValidatingWebhook.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ValidatingWebhook is not found in the empty JSON string", V1ValidatingWebhook.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ValidatingWebhook.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ValidatingWebhook` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ValidatingWebhook.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("admissionReviewVersions") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("admissionReviewVersions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `admissionReviewVersions` to be an array in the JSON string but got `%s`", jsonObj.get("admissionReviewVersions").toString()));
      }
      // validate the required field `clientConfig`
      AdmissionregistrationV1WebhookClientConfig.validateJsonElement(jsonObj.get("clientConfig"));
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
            V1MatchCondition.validateJsonElement(jsonArraymatchConditions.get(i));
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
        V1LabelSelector.validateJsonElement(jsonObj.get("namespaceSelector"));
      }
      // validate the optional field `objectSelector`
      if (jsonObj.get("objectSelector") != null && !jsonObj.get("objectSelector").isJsonNull()) {
        V1LabelSelector.validateJsonElement(jsonObj.get("objectSelector"));
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
            V1RuleWithOperations.validateJsonElement(jsonArrayrules.get(i));
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
       if (!V1ValidatingWebhook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ValidatingWebhook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ValidatingWebhook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ValidatingWebhook.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ValidatingWebhook>() {
           @Override
           public void write(JsonWriter out, V1ValidatingWebhook value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ValidatingWebhook read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ValidatingWebhook given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ValidatingWebhook
   * @throws IOException if the JSON string is invalid with respect to V1ValidatingWebhook
   */
  public static V1ValidatingWebhook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ValidatingWebhook.class);
  }

  /**
   * Convert an instance of V1ValidatingWebhook to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
