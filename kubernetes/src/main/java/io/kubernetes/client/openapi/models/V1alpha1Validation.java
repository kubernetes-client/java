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
 * Validation specifies the CEL expression which is used to apply the validation.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1alpha1Validation {
  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_MESSAGE_EXPRESSION = "messageExpression";
  @SerializedName(SERIALIZED_NAME_MESSAGE_EXPRESSION)
  private String messageExpression;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public V1alpha1Validation() {
  }

  public V1alpha1Validation expression(String expression) {

    this.expression = expression;
    return this;
  }

   /**
   * Expression represents the expression which will be evaluated by CEL. ref: https://github.com/google/cel-spec CEL expressions have access to the contents of the API request/response, organized into CEL variables as well as some other useful variables:  - &#39;object&#39; - The object from the incoming request. The value is null for DELETE requests. - &#39;oldObject&#39; - The existing object. The value is null for CREATE requests. - &#39;request&#39; - Attributes of the API request([ref](/pkg/apis/admission/types.go#AdmissionRequest)). - &#39;params&#39; - Parameter resource referred to by the policy binding being evaluated. Only populated if the policy has a ParamKind. - &#39;namespaceObject&#39; - The namespace object that the incoming object belongs to. The value is null for cluster-scoped resources. - &#39;variables&#39; - Map of composited variables, from its name to its lazily evaluated value.   For example, a variable named &#39;foo&#39; can be accessed as &#39;variables.foo&#39;. - &#39;authorizer&#39; - A CEL Authorizer. May be used to perform authorization checks for the principal (user or service account) of the request.   See https://pkg.go.dev/k8s.io/apiserver/pkg/cel/library#Authz - &#39;authorizer.requestResource&#39; - A CEL ResourceCheck constructed from the &#39;authorizer&#39; and configured with the   request resource.  The &#x60;apiVersion&#x60;, &#x60;kind&#x60;, &#x60;metadata.name&#x60; and &#x60;metadata.generateName&#x60; are always accessible from the root of the object. No other metadata properties are accessible.  Only property names of the form &#x60;[a-zA-Z_.-/][a-zA-Z0-9_.-/]*&#x60; are accessible. Accessible property names are escaped according to the following rules when accessed in the expression: - &#39;__&#39; escapes to &#39;__underscores__&#39; - &#39;.&#39; escapes to &#39;__dot__&#39; - &#39;-&#39; escapes to &#39;__dash__&#39; - &#39;/&#39; escapes to &#39;__slash__&#39; - Property names that exactly match a CEL RESERVED keyword escape to &#39;__{keyword}__&#39;. The keywords are:    \&quot;true\&quot;, \&quot;false\&quot;, \&quot;null\&quot;, \&quot;in\&quot;, \&quot;as\&quot;, \&quot;break\&quot;, \&quot;const\&quot;, \&quot;continue\&quot;, \&quot;else\&quot;, \&quot;for\&quot;, \&quot;function\&quot;, \&quot;if\&quot;,    \&quot;import\&quot;, \&quot;let\&quot;, \&quot;loop\&quot;, \&quot;package\&quot;, \&quot;namespace\&quot;, \&quot;return\&quot;. Examples:   - Expression accessing a property named \&quot;namespace\&quot;: {\&quot;Expression\&quot;: \&quot;object.__namespace__ &gt; 0\&quot;}   - Expression accessing a property named \&quot;x-prop\&quot;: {\&quot;Expression\&quot;: \&quot;object.x__dash__prop &gt; 0\&quot;}   - Expression accessing a property named \&quot;redact__d\&quot;: {\&quot;Expression\&quot;: \&quot;object.redact__underscores__d &gt; 0\&quot;}  Equality on arrays with list type of &#39;set&#39; or &#39;map&#39; ignores element order, i.e. [1, 2] &#x3D;&#x3D; [2, 1]. Concatenation on arrays with x-kubernetes-list-type use the semantics of the list type:   - &#39;set&#39;: &#x60;X + Y&#x60; performs a union where the array positions of all elements in &#x60;X&#x60; are preserved and     non-intersecting elements in &#x60;Y&#x60; are appended, retaining their partial order.   - &#39;map&#39;: &#x60;X + Y&#x60; performs a merge where the array positions of all keys in &#x60;X&#x60; are preserved but the values     are overwritten by values in &#x60;Y&#x60; when the key sets of &#x60;X&#x60; and &#x60;Y&#x60; intersect. Elements in &#x60;Y&#x60; with     non-intersecting keys are appended, retaining their partial order. Required.
   * @return expression
  **/
  @jakarta.annotation.Nonnull
  public String getExpression() {
    return expression;
  }


  public void setExpression(String expression) {
    this.expression = expression;
  }


  public V1alpha1Validation message(String message) {

    this.message = message;
    return this;
  }

   /**
   * Message represents the message displayed when validation fails. The message is required if the Expression contains line breaks. The message must not contain line breaks. If unset, the message is \&quot;failed rule: {Rule}\&quot;. e.g. \&quot;must be a URL with the host matching spec.host\&quot; If the Expression contains line breaks. Message is required. The message must not contain line breaks. If unset, the message is \&quot;failed Expression: {Expression}\&quot;.
   * @return message
  **/
  @jakarta.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1alpha1Validation messageExpression(String messageExpression) {

    this.messageExpression = messageExpression;
    return this;
  }

   /**
   * messageExpression declares a CEL expression that evaluates to the validation failure message that is returned when this rule fails. Since messageExpression is used as a failure message, it must evaluate to a string. If both message and messageExpression are present on a validation, then messageExpression will be used if validation fails. If messageExpression results in a runtime error, the runtime error is logged, and the validation failure message is produced as if the messageExpression field were unset. If messageExpression evaluates to an empty string, a string with only spaces, or a string that contains line breaks, then the validation failure message will also be produced as if the messageExpression field were unset, and the fact that messageExpression produced an empty string/string with only spaces/string with line breaks will be logged. messageExpression has access to all the same variables as the &#x60;expression&#x60; except for &#39;authorizer&#39; and &#39;authorizer.requestResource&#39;. Example: \&quot;object.x must be less than max (\&quot;+string(params.max)+\&quot;)\&quot;
   * @return messageExpression
  **/
  @jakarta.annotation.Nullable
  public String getMessageExpression() {
    return messageExpression;
  }


  public void setMessageExpression(String messageExpression) {
    this.messageExpression = messageExpression;
  }


  public V1alpha1Validation reason(String reason) {

    this.reason = reason;
    return this;
  }

   /**
   * Reason represents a machine-readable description of why this validation failed. If this is the first validation in the list to fail, this reason, as well as the corresponding HTTP response code, are used in the HTTP response to the client. The currently supported reasons are: \&quot;Unauthorized\&quot;, \&quot;Forbidden\&quot;, \&quot;Invalid\&quot;, \&quot;RequestEntityTooLarge\&quot;. If not set, StatusReasonInvalid is used in the response to the client.
   * @return reason
  **/
  @jakarta.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
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
    V1alpha1Validation v1alpha1Validation = (V1alpha1Validation) o;
    return Objects.equals(this.expression, v1alpha1Validation.expression) &&
        Objects.equals(this.message, v1alpha1Validation.message) &&
        Objects.equals(this.messageExpression, v1alpha1Validation.messageExpression) &&
        Objects.equals(this.reason, v1alpha1Validation.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, message, messageExpression, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1Validation {\n");
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1Validation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1Validation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1Validation is not found in the empty JSON string", V1alpha1Validation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1Validation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1Validation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1Validation.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
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
       if (!V1alpha1Validation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1Validation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1Validation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1Validation.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1Validation>() {
           @Override
           public void write(JsonWriter out, V1alpha1Validation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1Validation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1Validation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1Validation
  * @throws IOException if the JSON string is invalid with respect to V1alpha1Validation
  */
  public static V1alpha1Validation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1Validation.class);
  }

 /**
  * Convert an instance of V1alpha1Validation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
