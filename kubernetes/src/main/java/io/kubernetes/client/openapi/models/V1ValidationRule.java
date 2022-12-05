/*
Copyright 2022 The Kubernetes Authors.
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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ValidationRule describes a validation rule written in the CEL expression language. */
@ApiModel(
    description =
        "ValidationRule describes a validation rule written in the CEL expression language.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ValidationRule {
  public static final String SERIALIZED_NAME_MESSAGE = "message";

  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_RULE = "rule";

  @SerializedName(SERIALIZED_NAME_RULE)
  private String rule;

  public V1ValidationRule message(String message) {

    this.message = message;
    return this;
  }

  /**
   * Message represents the message displayed when validation fails. The message is required if the
   * Rule contains line breaks. The message must not contain line breaks. If unset, the message is
   * \&quot;failed rule: {Rule}\&quot;. e.g. \&quot;must be a URL with the host matching
   * spec.host\&quot;
   *
   * @return message
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Message represents the message displayed when validation fails. The message is required if the Rule contains line breaks. The message must not contain line breaks. If unset, the message is \"failed rule: {Rule}\". e.g. \"must be a URL with the host matching spec.host\"")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1ValidationRule rule(String rule) {

    this.rule = rule;
    return this;
  }

  /**
   * Rule represents the expression which will be evaluated by CEL. ref:
   * https://github.com/google/cel-spec The Rule is scoped to the location of the
   * x-kubernetes-validations extension in the schema. The &#x60;self&#x60; variable in the CEL
   * expression is bound to the scoped value. Example: - Rule scoped to the root of a resource with
   * a status subresource: {\&quot;rule\&quot;: \&quot;self.status.actual &lt;&#x3D;
   * self.spec.maxDesired\&quot;} If the Rule is scoped to an object with properties, the accessible
   * properties of the object are field selectable via &#x60;self.field&#x60; and field presence can
   * be checked via &#x60;has(self.field)&#x60;. Null valued fields are treated as absent fields in
   * CEL expressions. If the Rule is scoped to an object with additionalProperties (i.e. a map) the
   * value of the map are accessible via &#x60;self[mapKey]&#x60;, map containment can be checked
   * via &#x60;mapKey in self&#x60; and all entries of the map are accessible via CEL macros and
   * functions such as &#x60;self.all(...)&#x60;. If the Rule is scoped to an array, the elements of
   * the array are accessible via &#x60;self[i]&#x60; and also by macros and functions. If the Rule
   * is scoped to a scalar, &#x60;self&#x60; is bound to the scalar value. Examples: - Rule scoped
   * to a map of objects: {\&quot;rule\&quot;: \&quot;self.components[&#39;Widget&#39;].priority
   * &lt; 10\&quot;} - Rule scoped to a list of integers: {\&quot;rule\&quot;:
   * \&quot;self.values.all(value, value &gt;&#x3D; 0 &amp;&amp; value &lt; 100)\&quot;} - Rule
   * scoped to a string value: {\&quot;rule\&quot;: \&quot;self.startsWith(&#39;kube&#39;)\&quot;}
   * The &#x60;apiVersion&#x60;, &#x60;kind&#x60;, &#x60;metadata.name&#x60; and
   * &#x60;metadata.generateName&#x60; are always accessible from the root of the object and from
   * any x-kubernetes-embedded-resource annotated objects. No other metadata properties are
   * accessible. Unknown data preserved in custom resources via x-kubernetes-preserve-unknown-fields
   * is not accessible in CEL expressions. This includes: - Unknown field values that are preserved
   * by object schemas with x-kubernetes-preserve-unknown-fields. - Object properties where the
   * property schema is of an \&quot;unknown type\&quot;. An \&quot;unknown type\&quot; is
   * recursively defined as: - A schema with no type and x-kubernetes-preserve-unknown-fields set to
   * true - An array where the items schema is of an \&quot;unknown type\&quot; - An object where
   * the additionalProperties schema is of an \&quot;unknown type\&quot; Only property names of the
   * form &#x60;[a-zA-Z_.-/][a-zA-Z0-9_.-/]*&#x60; are accessible. Accessible property names are
   * escaped according to the following rules when accessed in the expression: - &#39;__&#39;
   * escapes to &#39;__underscores__&#39; - &#39;.&#39; escapes to &#39;__dot__&#39; - &#39;-&#39;
   * escapes to &#39;__dash__&#39; - &#39;/&#39; escapes to &#39;__slash__&#39; - Property names
   * that exactly match a CEL RESERVED keyword escape to &#39;__{keyword}__&#39;. The keywords are:
   * \&quot;true\&quot;, \&quot;false\&quot;, \&quot;null\&quot;, \&quot;in\&quot;,
   * \&quot;as\&quot;, \&quot;break\&quot;, \&quot;const\&quot;, \&quot;continue\&quot;,
   * \&quot;else\&quot;, \&quot;for\&quot;, \&quot;function\&quot;, \&quot;if\&quot;,
   * \&quot;import\&quot;, \&quot;let\&quot;, \&quot;loop\&quot;, \&quot;package\&quot;,
   * \&quot;namespace\&quot;, \&quot;return\&quot;. Examples: - Rule accessing a property named
   * \&quot;namespace\&quot;: {\&quot;rule\&quot;: \&quot;self.__namespace__ &gt; 0\&quot;} - Rule
   * accessing a property named \&quot;x-prop\&quot;: {\&quot;rule\&quot;: \&quot;self.x__dash__prop
   * &gt; 0\&quot;} - Rule accessing a property named \&quot;redact__d\&quot;: {\&quot;rule\&quot;:
   * \&quot;self.redact__underscores__d &gt; 0\&quot;} Equality on arrays with
   * x-kubernetes-list-type of &#39;set&#39; or &#39;map&#39; ignores element order, i.e. [1, 2]
   * &#x3D;&#x3D; [2, 1]. Concatenation on arrays with x-kubernetes-list-type use the semantics of
   * the list type: - &#39;set&#39;: &#x60;X + Y&#x60; performs a union where the array positions of
   * all elements in &#x60;X&#x60; are preserved and non-intersecting elements in &#x60;Y&#x60; are
   * appended, retaining their partial order. - &#39;map&#39;: &#x60;X + Y&#x60; performs a merge
   * where the array positions of all keys in &#x60;X&#x60; are preserved but the values are
   * overwritten by values in &#x60;Y&#x60; when the key sets of &#x60;X&#x60; and &#x60;Y&#x60;
   * intersect. Elements in &#x60;Y&#x60; with non-intersecting keys are appended, retaining their
   * partial order.
   *
   * @return rule
   */
  @ApiModelProperty(
      required = true,
      value =
          "Rule represents the expression which will be evaluated by CEL. ref: https://github.com/google/cel-spec The Rule is scoped to the location of the x-kubernetes-validations extension in the schema. The `self` variable in the CEL expression is bound to the scoped value. Example: - Rule scoped to the root of a resource with a status subresource: {\"rule\": \"self.status.actual <= self.spec.maxDesired\"}  If the Rule is scoped to an object with properties, the accessible properties of the object are field selectable via `self.field` and field presence can be checked via `has(self.field)`. Null valued fields are treated as absent fields in CEL expressions. If the Rule is scoped to an object with additionalProperties (i.e. a map) the value of the map are accessible via `self[mapKey]`, map containment can be checked via `mapKey in self` and all entries of the map are accessible via CEL macros and functions such as `self.all(...)`. If the Rule is scoped to an array, the elements of the array are accessible via `self[i]` and also by macros and functions. If the Rule is scoped to a scalar, `self` is bound to the scalar value. Examples: - Rule scoped to a map of objects: {\"rule\": \"self.components['Widget'].priority < 10\"} - Rule scoped to a list of integers: {\"rule\": \"self.values.all(value, value >= 0 && value < 100)\"} - Rule scoped to a string value: {\"rule\": \"self.startsWith('kube')\"}  The `apiVersion`, `kind`, `metadata.name` and `metadata.generateName` are always accessible from the root of the object and from any x-kubernetes-embedded-resource annotated objects. No other metadata properties are accessible.  Unknown data preserved in custom resources via x-kubernetes-preserve-unknown-fields is not accessible in CEL expressions. This includes: - Unknown field values that are preserved by object schemas with x-kubernetes-preserve-unknown-fields. - Object properties where the property schema is of an \"unknown type\". An \"unknown type\" is recursively defined as:   - A schema with no type and x-kubernetes-preserve-unknown-fields set to true   - An array where the items schema is of an \"unknown type\"   - An object where the additionalProperties schema is of an \"unknown type\"  Only property names of the form `[a-zA-Z_.-/][a-zA-Z0-9_.-/]*` are accessible. Accessible property names are escaped according to the following rules when accessed in the expression: - '__' escapes to '__underscores__' - '.' escapes to '__dot__' - '-' escapes to '__dash__' - '/' escapes to '__slash__' - Property names that exactly match a CEL RESERVED keyword escape to '__{keyword}__'. The keywords are:    \"true\", \"false\", \"null\", \"in\", \"as\", \"break\", \"const\", \"continue\", \"else\", \"for\", \"function\", \"if\",    \"import\", \"let\", \"loop\", \"package\", \"namespace\", \"return\". Examples:   - Rule accessing a property named \"namespace\": {\"rule\": \"self.__namespace__ > 0\"}   - Rule accessing a property named \"x-prop\": {\"rule\": \"self.x__dash__prop > 0\"}   - Rule accessing a property named \"redact__d\": {\"rule\": \"self.redact__underscores__d > 0\"}  Equality on arrays with x-kubernetes-list-type of 'set' or 'map' ignores element order, i.e. [1, 2] == [2, 1]. Concatenation on arrays with x-kubernetes-list-type use the semantics of the list type:   - 'set': `X + Y` performs a union where the array positions of all elements in `X` are preserved and     non-intersecting elements in `Y` are appended, retaining their partial order.   - 'map': `X + Y` performs a merge where the array positions of all keys in `X` are preserved but the values     are overwritten by values in `Y` when the key sets of `X` and `Y` intersect. Elements in `Y` with     non-intersecting keys are appended, retaining their partial order.")
  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ValidationRule v1ValidationRule = (V1ValidationRule) o;
    return Objects.equals(this.message, v1ValidationRule.message)
        && Objects.equals(this.rule, v1ValidationRule.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, rule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ValidationRule {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
