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
 * Validation specifies the CEL expression which is used to apply the validation.
 */
@ApiModel(description = "Validation specifies the CEL expression which is used to apply the validation.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1Validation {
  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  @jakarta.annotation.Nonnull
  private String expression;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @jakarta.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_MESSAGE_EXPRESSION = "messageExpression";
  @SerializedName(SERIALIZED_NAME_MESSAGE_EXPRESSION)
  @jakarta.annotation.Nullable
  private String messageExpression;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  @jakarta.annotation.Nullable
  private String reason;

  public V1Validation() {
  }

  public V1Validation expression(@jakarta.annotation.Nonnull String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Expression represents the expression which will be evaluated by CEL. ref: https://github.com/google/cel-spec CEL expressions have access to the contents of the API request/response, organized into CEL variables as well as some other useful variables:  - &#39;object&#39; - The object from the incoming request. The value is null for DELETE requests. - &#39;oldObject&#39; - The existing object. The value is null for CREATE requests. - &#39;request&#39; - Attributes of the API request([ref](/pkg/apis/admission/types.go#AdmissionRequest)). - &#39;params&#39; - Parameter resource referred to by the policy binding being evaluated. Only populated if the policy has a ParamKind. - &#39;namespaceObject&#39; - The namespace object that the incoming object belongs to. The value is null for cluster-scoped resources. - &#39;variables&#39; - Map of composited variables, from its name to its lazily evaluated value.   For example, a variable named &#39;foo&#39; can be accessed as &#39;variables.foo&#39;. - &#39;authorizer&#39; - A CEL Authorizer. May be used to perform authorization checks for the principal (user or service account) of the request.   See https://pkg.go.dev/k8s.io/apiserver/pkg/cel/library#Authz - &#39;authorizer.requestResource&#39; - A CEL ResourceCheck constructed from the &#39;authorizer&#39; and configured with the   request resource.  The &#x60;apiVersion&#x60;, &#x60;kind&#x60;, &#x60;metadata.name&#x60; and &#x60;metadata.generateName&#x60; are always accessible from the root of the object. No other metadata properties are accessible.  Only property names of the form &#x60;[a-zA-Z_.-/][a-zA-Z0-9_.-/]*&#x60; are accessible. Accessible property names are escaped according to the following rules when accessed in the expression: - &#39;__&#39; escapes to &#39;__underscores__&#39; - &#39;.&#39; escapes to &#39;__dot__&#39; - &#39;-&#39; escapes to &#39;__dash__&#39; - &#39;/&#39; escapes to &#39;__slash__&#39; - Property names that exactly match a CEL RESERVED keyword escape to &#39;__{keyword}__&#39;. The keywords are:    \&quot;true\&quot;, \&quot;false\&quot;, \&quot;null\&quot;, \&quot;in\&quot;, \&quot;as\&quot;, \&quot;break\&quot;, \&quot;const\&quot;, \&quot;continue\&quot;, \&quot;else\&quot;, \&quot;for\&quot;, \&quot;function\&quot;, \&quot;if\&quot;,    \&quot;import\&quot;, \&quot;let\&quot;, \&quot;loop\&quot;, \&quot;package\&quot;, \&quot;namespace\&quot;, \&quot;return\&quot;. Examples:   - Expression accessing a property named \&quot;namespace\&quot;: {\&quot;Expression\&quot;: \&quot;object.__namespace__ &gt; 0\&quot;}   - Expression accessing a property named \&quot;x-prop\&quot;: {\&quot;Expression\&quot;: \&quot;object.x__dash__prop &gt; 0\&quot;}   - Expression accessing a property named \&quot;redact__d\&quot;: {\&quot;Expression\&quot;: \&quot;object.redact__underscores__d &gt; 0\&quot;}  Equality on arrays with list type of &#39;set&#39; or &#39;map&#39; ignores element order, i.e. [1, 2] &#x3D;&#x3D; [2, 1]. Concatenation on arrays with x-kubernetes-list-type use the semantics of the list type:   - &#39;set&#39;: &#x60;X + Y&#x60; performs a union where the array positions of all elements in &#x60;X&#x60; are preserved and     non-intersecting elements in &#x60;Y&#x60; are appended, retaining their partial order.   - &#39;map&#39;: &#x60;X + Y&#x60; performs a merge where the array positions of all keys in &#x60;X&#x60; are preserved but the values     are overwritten by values in &#x60;Y&#x60; when the key sets of &#x60;X&#x60; and &#x60;Y&#x60; intersect. Elements in &#x60;Y&#x60; with     non-intersecting keys are appended, retaining their partial order. Required.
   * @return expression
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Expression represents the expression which will be evaluated by CEL. ref: https://github.com/google/cel-spec CEL expressions have access to the contents of the API request/response, organized into CEL variables as well as some other useful variables:  - 'object' - The object from the incoming request. The value is null for DELETE requests. - 'oldObject' - The existing object. The value is null for CREATE requests. - 'request' - Attributes of the API request([ref](/pkg/apis/admission/types.go#AdmissionRequest)). - 'params' - Parameter resource referred to by the policy binding being evaluated. Only populated if the policy has a ParamKind. - 'namespaceObject' - The namespace object that the incoming object belongs to. The value is null for cluster-scoped resources. - 'variables' - Map of composited variables, from its name to its lazily evaluated value.   For example, a variable named 'foo' can be accessed as 'variables.foo'. - 'authorizer' - A CEL Authorizer. May be used to perform authorization checks for the principal (user or service account) of the request.   See https://pkg.go.dev/k8s.io/apiserver/pkg/cel/library#Authz - 'authorizer.requestResource' - A CEL ResourceCheck constructed from the 'authorizer' and configured with the   request resource.  The `apiVersion`, `kind`, `metadata.name` and `metadata.generateName` are always accessible from the root of the object. No other metadata properties are accessible.  Only property names of the form `[a-zA-Z_.-/][a-zA-Z0-9_.-/]*` are accessible. Accessible property names are escaped according to the following rules when accessed in the expression: - '__' escapes to '__underscores__' - '.' escapes to '__dot__' - '-' escapes to '__dash__' - '/' escapes to '__slash__' - Property names that exactly match a CEL RESERVED keyword escape to '__{keyword}__'. The keywords are:    \"true\", \"false\", \"null\", \"in\", \"as\", \"break\", \"const\", \"continue\", \"else\", \"for\", \"function\", \"if\",    \"import\", \"let\", \"loop\", \"package\", \"namespace\", \"return\". Examples:   - Expression accessing a property named \"namespace\": {\"Expression\": \"object.__namespace__ > 0\"}   - Expression accessing a property named \"x-prop\": {\"Expression\": \"object.x__dash__prop > 0\"}   - Expression accessing a property named \"redact__d\": {\"Expression\": \"object.redact__underscores__d > 0\"}  Equality on arrays with list type of 'set' or 'map' ignores element order, i.e. [1, 2] == [2, 1]. Concatenation on arrays with x-kubernetes-list-type use the semantics of the list type:   - 'set': `X + Y` performs a union where the array positions of all elements in `X` are preserved and     non-intersecting elements in `Y` are appended, retaining their partial order.   - 'map': `X + Y` performs a merge where the array positions of all keys in `X` are preserved but the values     are overwritten by values in `Y` when the key sets of `X` and `Y` intersect. Elements in `Y` with     non-intersecting keys are appended, retaining their partial order. Required.")
  public String getExpression() {
    return expression;
  }

  public void setExpression(@jakarta.annotation.Nonnull String expression) {
    this.expression = expression;
  }


  public V1Validation message(@jakarta.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Message represents the message displayed when validation fails. The message is required if the Expression contains line breaks. The message must not contain line breaks. If unset, the message is \&quot;failed rule: {Rule}\&quot;. e.g. \&quot;must be a URL with the host matching spec.host\&quot; If the Expression contains line breaks. Message is required. The message must not contain line breaks. If unset, the message is \&quot;failed Expression: {Expression}\&quot;.
   * @return message
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Message represents the message displayed when validation fails. The message is required if the Expression contains line breaks. The message must not contain line breaks. If unset, the message is \"failed rule: {Rule}\". e.g. \"must be a URL with the host matching spec.host\" If the Expression contains line breaks. Message is required. The message must not contain line breaks. If unset, the message is \"failed Expression: {Expression}\".")
  public String getMessage() {
    return message;
  }

  public void setMessage(@jakarta.annotation.Nullable String message) {
    this.message = message;
  }


  public V1Validation messageExpression(@jakarta.annotation.Nullable String messageExpression) {
    this.messageExpression = messageExpression;
    return this;
  }

  /**
   * messageExpression declares a CEL expression that evaluates to the validation failure message that is returned when this rule fails. Since messageExpression is used as a failure message, it must evaluate to a string. If both message and messageExpression are present on a validation, then messageExpression will be used if validation fails. If messageExpression results in a runtime error, the runtime error is logged, and the validation failure message is produced as if the messageExpression field were unset. If messageExpression evaluates to an empty string, a string with only spaces, or a string that contains line breaks, then the validation failure message will also be produced as if the messageExpression field were unset, and the fact that messageExpression produced an empty string/string with only spaces/string with line breaks will be logged. messageExpression has access to all the same variables as the &#x60;expression&#x60; except for &#39;authorizer&#39; and &#39;authorizer.requestResource&#39;. Example: \&quot;object.x must be less than max (\&quot;+string(params.max)+\&quot;)\&quot;
   * @return messageExpression
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "messageExpression declares a CEL expression that evaluates to the validation failure message that is returned when this rule fails. Since messageExpression is used as a failure message, it must evaluate to a string. If both message and messageExpression are present on a validation, then messageExpression will be used if validation fails. If messageExpression results in a runtime error, the runtime error is logged, and the validation failure message is produced as if the messageExpression field were unset. If messageExpression evaluates to an empty string, a string with only spaces, or a string that contains line breaks, then the validation failure message will also be produced as if the messageExpression field were unset, and the fact that messageExpression produced an empty string/string with only spaces/string with line breaks will be logged. messageExpression has access to all the same variables as the `expression` except for 'authorizer' and 'authorizer.requestResource'. Example: \"object.x must be less than max (\"+string(params.max)+\")\"")
  public String getMessageExpression() {
    return messageExpression;
  }

  public void setMessageExpression(@jakarta.annotation.Nullable String messageExpression) {
    this.messageExpression = messageExpression;
  }


  public V1Validation reason(@jakarta.annotation.Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason represents a machine-readable description of why this validation failed. If this is the first validation in the list to fail, this reason, as well as the corresponding HTTP response code, are used in the HTTP response to the client. The currently supported reasons are: \&quot;Unauthorized\&quot;, \&quot;Forbidden\&quot;, \&quot;Invalid\&quot;, \&quot;RequestEntityTooLarge\&quot;. If not set, StatusReasonInvalid is used in the response to the client.
   * @return reason
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Reason represents a machine-readable description of why this validation failed. If this is the first validation in the list to fail, this reason, as well as the corresponding HTTP response code, are used in the HTTP response to the client. The currently supported reasons are: \"Unauthorized\", \"Forbidden\", \"Invalid\", \"RequestEntityTooLarge\". If not set, StatusReasonInvalid is used in the response to the client.")
  public String getReason() {
    return reason;
  }

  public void setReason(@jakarta.annotation.Nullable String reason) {
    this.reason = reason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Validation v1Validation = (V1Validation) o;
    return Objects.equals(this.expression, v1Validation.expression) &&
        Objects.equals(this.message, v1Validation.message) &&
        Objects.equals(this.messageExpression, v1Validation.messageExpression) &&
        Objects.equals(this.reason, v1Validation.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, message, messageExpression, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Validation {\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageExpression: ").append(toIndentedString(messageExpression)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
    openapiFields.add("expression");
    openapiFields.add("message");
    openapiFields.add("messageExpression");
    openapiFields.add("reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expression");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1Validation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1Validation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1Validation is not found in the empty JSON string", V1Validation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1Validation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1Validation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1Validation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("expression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expression").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("messageExpression") != null && !jsonObj.get("messageExpression").isJsonNull()) && !jsonObj.get("messageExpression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageExpression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageExpression").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1Validation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1Validation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1Validation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1Validation.class));

       return (TypeAdapter<T>) new TypeAdapter<V1Validation>() {
           @Override
           public void write(JsonWriter out, V1Validation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1Validation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1Validation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1Validation
   * @throws IOException if the JSON string is invalid with respect to V1Validation
   */
  public static V1Validation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1Validation.class);
  }

  /**
   * Convert an instance of V1Validation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
