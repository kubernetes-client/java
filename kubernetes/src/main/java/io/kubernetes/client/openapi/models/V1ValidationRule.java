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
 * ValidationRule describes a validation rule written in the CEL expression language.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ValidationRule {
  public static final String SERIALIZED_NAME_FIELD_PATH = "fieldPath";
  @SerializedName(SERIALIZED_NAME_FIELD_PATH)
  private String fieldPath;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_MESSAGE_EXPRESSION = "messageExpression";
  @SerializedName(SERIALIZED_NAME_MESSAGE_EXPRESSION)
  private String messageExpression;

  public static final String SERIALIZED_NAME_OPTIONAL_OLD_SELF = "optionalOldSelf";
  @SerializedName(SERIALIZED_NAME_OPTIONAL_OLD_SELF)
  private Boolean optionalOldSelf;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private String rule;

  public V1ValidationRule() {
  }

  public V1ValidationRule fieldPath(String fieldPath) {

    this.fieldPath = fieldPath;
    return this;
  }

   /**
   * fieldPath represents the field path returned when the validation fails. It must be a relative JSON path (i.e. with array notation) scoped to the location of this x-kubernetes-validations extension in the schema and refer to an existing field. e.g. when validation checks if a specific attribute &#x60;foo&#x60; under a map &#x60;testMap&#x60;, the fieldPath could be set to &#x60;.testMap.foo&#x60; If the validation checks two lists must have unique attributes, the fieldPath could be set to either of the list: e.g. &#x60;.testList&#x60; It does not support list numeric index. It supports child operation to refer to an existing field currently. Refer to [JSONPath support in Kubernetes](https://kubernetes.io/docs/reference/kubectl/jsonpath/) for more info. Numeric index of array is not supported. For field name which contains special characters, use &#x60;[&#39;specialName&#39;]&#x60; to refer the field name. e.g. for attribute &#x60;foo.34$&#x60; appears in a list &#x60;testList&#x60;, the fieldPath could be set to &#x60;.testList[&#39;foo.34$&#39;]&#x60;
   * @return fieldPath
  **/
  @jakarta.annotation.Nullable
  public String getFieldPath() {
    return fieldPath;
  }


  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }


  public V1ValidationRule message(String message) {

    this.message = message;
    return this;
  }

   /**
   * Message represents the message displayed when validation fails. The message is required if the Rule contains line breaks. The message must not contain line breaks. If unset, the message is \&quot;failed rule: {Rule}\&quot;. e.g. \&quot;must be a URL with the host matching spec.host\&quot;
   * @return message
  **/
  @jakarta.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1ValidationRule messageExpression(String messageExpression) {

    this.messageExpression = messageExpression;
    return this;
  }

   /**
   * MessageExpression declares a CEL expression that evaluates to the validation failure message that is returned when this rule fails. Since messageExpression is used as a failure message, it must evaluate to a string. If both message and messageExpression are present on a rule, then messageExpression will be used if validation fails. If messageExpression results in a runtime error, the runtime error is logged, and the validation failure message is produced as if the messageExpression field were unset. If messageExpression evaluates to an empty string, a string with only spaces, or a string that contains line breaks, then the validation failure message will also be produced as if the messageExpression field were unset, and the fact that messageExpression produced an empty string/string with only spaces/string with line breaks will be logged. messageExpression has access to all the same variables as the rule; the only difference is the return type. Example: \&quot;x must be less than max (\&quot;+string(self.max)+\&quot;)\&quot;
   * @return messageExpression
  **/
  @jakarta.annotation.Nullable
  public String getMessageExpression() {
    return messageExpression;
  }


  public void setMessageExpression(String messageExpression) {
    this.messageExpression = messageExpression;
  }


  public V1ValidationRule optionalOldSelf(Boolean optionalOldSelf) {

    this.optionalOldSelf = optionalOldSelf;
    return this;
  }

   /**
   * optionalOldSelf is used to opt a transition rule into evaluation even when the object is first created, or if the old object is missing the value.  When enabled &#x60;oldSelf&#x60; will be a CEL optional whose value will be &#x60;None&#x60; if there is no old value, or when the object is initially created.  You may check for presence of oldSelf using &#x60;oldSelf.hasValue()&#x60; and unwrap it after checking using &#x60;oldSelf.value()&#x60;. Check the CEL documentation for Optional types for more information: https://pkg.go.dev/github.com/google/cel-go/cel#OptionalTypes  May not be set unless &#x60;oldSelf&#x60; is used in &#x60;rule&#x60;.
   * @return optionalOldSelf
  **/
  @jakarta.annotation.Nullable
  public Boolean getOptionalOldSelf() {
    return optionalOldSelf;
  }


  public void setOptionalOldSelf(Boolean optionalOldSelf) {
    this.optionalOldSelf = optionalOldSelf;
  }


  public V1ValidationRule reason(String reason) {

    this.reason = reason;
    return this;
  }

   /**
   * reason provides a machine-readable validation failure reason that is returned to the caller when a request fails this validation rule. The HTTP status code returned to the caller will match the reason of the reason of the first failed validation rule. The currently supported reasons are: \&quot;FieldValueInvalid\&quot;, \&quot;FieldValueForbidden\&quot;, \&quot;FieldValueRequired\&quot;, \&quot;FieldValueDuplicate\&quot;. If not set, default to use \&quot;FieldValueInvalid\&quot;. All future added reasons must be accepted by clients when reading this value and unknown reasons should be treated as FieldValueInvalid.
   * @return reason
  **/
  @jakarta.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public V1ValidationRule rule(String rule) {

    this.rule = rule;
    return this;
  }

   /**
   * Rule represents the expression which will be evaluated by CEL. ref: https://github.com/google/cel-spec The Rule is scoped to the location of the x-kubernetes-validations extension in the schema. The &#x60;self&#x60; variable in the CEL expression is bound to the scoped value. Example: - Rule scoped to the root of a resource with a status subresource: {\&quot;rule\&quot;: \&quot;self.status.actual &lt;&#x3D; self.spec.maxDesired\&quot;}  If the Rule is scoped to an object with properties, the accessible properties of the object are field selectable via &#x60;self.field&#x60; and field presence can be checked via &#x60;has(self.field)&#x60;. Null valued fields are treated as absent fields in CEL expressions. If the Rule is scoped to an object with additionalProperties (i.e. a map) the value of the map are accessible via &#x60;self[mapKey]&#x60;, map containment can be checked via &#x60;mapKey in self&#x60; and all entries of the map are accessible via CEL macros and functions such as &#x60;self.all(...)&#x60;. If the Rule is scoped to an array, the elements of the array are accessible via &#x60;self[i]&#x60; and also by macros and functions. If the Rule is scoped to a scalar, &#x60;self&#x60; is bound to the scalar value. Examples: - Rule scoped to a map of objects: {\&quot;rule\&quot;: \&quot;self.components[&#39;Widget&#39;].priority &lt; 10\&quot;} - Rule scoped to a list of integers: {\&quot;rule\&quot;: \&quot;self.values.all(value, value &gt;&#x3D; 0 &amp;&amp; value &lt; 100)\&quot;} - Rule scoped to a string value: {\&quot;rule\&quot;: \&quot;self.startsWith(&#39;kube&#39;)\&quot;}  The &#x60;apiVersion&#x60;, &#x60;kind&#x60;, &#x60;metadata.name&#x60; and &#x60;metadata.generateName&#x60; are always accessible from the root of the object and from any x-kubernetes-embedded-resource annotated objects. No other metadata properties are accessible.  Unknown data preserved in custom resources via x-kubernetes-preserve-unknown-fields is not accessible in CEL expressions. This includes: - Unknown field values that are preserved by object schemas with x-kubernetes-preserve-unknown-fields. - Object properties where the property schema is of an \&quot;unknown type\&quot;. An \&quot;unknown type\&quot; is recursively defined as:   - A schema with no type and x-kubernetes-preserve-unknown-fields set to true   - An array where the items schema is of an \&quot;unknown type\&quot;   - An object where the additionalProperties schema is of an \&quot;unknown type\&quot;  Only property names of the form &#x60;[a-zA-Z_.-/][a-zA-Z0-9_.-/]*&#x60; are accessible. Accessible property names are escaped according to the following rules when accessed in the expression: - &#39;__&#39; escapes to &#39;__underscores__&#39; - &#39;.&#39; escapes to &#39;__dot__&#39; - &#39;-&#39; escapes to &#39;__dash__&#39; - &#39;/&#39; escapes to &#39;__slash__&#39; - Property names that exactly match a CEL RESERVED keyword escape to &#39;__{keyword}__&#39;. The keywords are:    \&quot;true\&quot;, \&quot;false\&quot;, \&quot;null\&quot;, \&quot;in\&quot;, \&quot;as\&quot;, \&quot;break\&quot;, \&quot;const\&quot;, \&quot;continue\&quot;, \&quot;else\&quot;, \&quot;for\&quot;, \&quot;function\&quot;, \&quot;if\&quot;,    \&quot;import\&quot;, \&quot;let\&quot;, \&quot;loop\&quot;, \&quot;package\&quot;, \&quot;namespace\&quot;, \&quot;return\&quot;. Examples:   - Rule accessing a property named \&quot;namespace\&quot;: {\&quot;rule\&quot;: \&quot;self.__namespace__ &gt; 0\&quot;}   - Rule accessing a property named \&quot;x-prop\&quot;: {\&quot;rule\&quot;: \&quot;self.x__dash__prop &gt; 0\&quot;}   - Rule accessing a property named \&quot;redact__d\&quot;: {\&quot;rule\&quot;: \&quot;self.redact__underscores__d &gt; 0\&quot;}  Equality on arrays with x-kubernetes-list-type of &#39;set&#39; or &#39;map&#39; ignores element order, i.e. [1, 2] &#x3D;&#x3D; [2, 1]. Concatenation on arrays with x-kubernetes-list-type use the semantics of the list type:   - &#39;set&#39;: &#x60;X + Y&#x60; performs a union where the array positions of all elements in &#x60;X&#x60; are preserved and     non-intersecting elements in &#x60;Y&#x60; are appended, retaining their partial order.   - &#39;map&#39;: &#x60;X + Y&#x60; performs a merge where the array positions of all keys in &#x60;X&#x60; are preserved but the values     are overwritten by values in &#x60;Y&#x60; when the key sets of &#x60;X&#x60; and &#x60;Y&#x60; intersect. Elements in &#x60;Y&#x60; with     non-intersecting keys are appended, retaining their partial order.  If &#x60;rule&#x60; makes use of the &#x60;oldSelf&#x60; variable it is implicitly a &#x60;transition rule&#x60;.  By default, the &#x60;oldSelf&#x60; variable is the same type as &#x60;self&#x60;. When &#x60;optionalOldSelf&#x60; is true, the &#x60;oldSelf&#x60; variable is a CEL optional  variable whose value() is the same type as &#x60;self&#x60;. See the documentation for the &#x60;optionalOldSelf&#x60; field for details.  Transition rules by default are applied only on UPDATE requests and are skipped if an old value could not be found. You can opt a transition rule into unconditional evaluation by setting &#x60;optionalOldSelf&#x60; to true.
   * @return rule
  **/
  @jakarta.annotation.Nonnull
  public String getRule() {
    return rule;
  }


  public void setRule(String rule) {
    this.rule = rule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ValidationRule v1ValidationRule = (V1ValidationRule) o;
    return Objects.equals(this.fieldPath, v1ValidationRule.fieldPath) &&
        Objects.equals(this.message, v1ValidationRule.message) &&
        Objects.equals(this.messageExpression, v1ValidationRule.messageExpression) &&
        Objects.equals(this.optionalOldSelf, v1ValidationRule.optionalOldSelf) &&
        Objects.equals(this.reason, v1ValidationRule.reason) &&
        Objects.equals(this.rule, v1ValidationRule.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldPath, message, messageExpression, optionalOldSelf, reason, rule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ValidationRule {\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageExpression: ").append(toIndentedString(messageExpression)).append("\n");
    sb.append("    optionalOldSelf: ").append(toIndentedString(optionalOldSelf)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
    openapiFields.add("fieldPath");
    openapiFields.add("message");
    openapiFields.add("messageExpression");
    openapiFields.add("optionalOldSelf");
    openapiFields.add("reason");
    openapiFields.add("rule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("rule");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ValidationRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ValidationRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ValidationRule is not found in the empty JSON string", V1ValidationRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ValidationRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ValidationRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ValidationRule.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("fieldPath") != null && !jsonObj.get("fieldPath").isJsonNull()) && !jsonObj.get("fieldPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldPath").toString()));
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
      if (!jsonObj.get("rule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ValidationRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ValidationRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ValidationRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ValidationRule.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ValidationRule>() {
           @Override
           public void write(JsonWriter out, V1ValidationRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ValidationRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ValidationRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ValidationRule
  * @throws IOException if the JSON string is invalid with respect to V1ValidationRule
  */
  public static V1ValidationRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ValidationRule.class);
  }

 /**
  * Convert an instance of V1ValidationRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
