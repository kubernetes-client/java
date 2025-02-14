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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * JSONPatch defines a JSON Patch.
 */
@ApiModel(description = "JSONPatch defines a JSON Patch.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T21:15:49.397498Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha1JSONPatch {
  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;

  public V1alpha1JSONPatch() {
  }

  public V1alpha1JSONPatch expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * expression will be evaluated by CEL to create a [JSON patch](https://jsonpatch.com/). ref: https://github.com/google/cel-spec  expression must return an array of JSONPatch values.  For example, this CEL expression returns a JSON patch to conditionally modify a value:     [      JSONPatch{op: \&quot;test\&quot;, path: \&quot;/spec/example\&quot;, value: \&quot;Red\&quot;},      JSONPatch{op: \&quot;replace\&quot;, path: \&quot;/spec/example\&quot;, value: \&quot;Green\&quot;}    ]  To define an object for the patch value, use Object types. For example:     [      JSONPatch{        op: \&quot;add\&quot;,        path: \&quot;/spec/selector\&quot;,        value: Object.spec.selector{matchLabels: {\&quot;environment\&quot;: \&quot;test\&quot;}}      }    ]  To use strings containing &#39;/&#39; and &#39;~&#39; as JSONPatch path keys, use \&quot;jsonpatch.escapeKey\&quot;. For example:     [      JSONPatch{        op: \&quot;add\&quot;,        path: \&quot;/metadata/labels/\&quot; + jsonpatch.escapeKey(\&quot;example.com/environment\&quot;),        value: \&quot;test\&quot;      },    ]  CEL expressions have access to the types needed to create JSON patches and objects:  - &#39;JSONPatch&#39; - CEL type of JSON Patch operations. JSONPatch has the fields &#39;op&#39;, &#39;from&#39;, &#39;path&#39; and &#39;value&#39;.   See [JSON patch](https://jsonpatch.com/) for more details. The &#39;value&#39; field may be set to any of: string,   integer, array, map or object.  If set, the &#39;path&#39; and &#39;from&#39; fields must be set to a   [JSON pointer](https://datatracker.ietf.org/doc/html/rfc6901/) string, where the &#39;jsonpatch.escapeKey()&#39; CEL   function may be used to escape path keys containing &#39;/&#39; and &#39;~&#39;. - &#39;Object&#39; - CEL type of the resource object. - &#39;Object.&lt;fieldName&gt;&#39; - CEL type of object field (such as &#39;Object.spec&#39;) - &#39;Object.&lt;fieldName1&gt;.&lt;fieldName2&gt;...&lt;fieldNameN&gt;&#x60; - CEL type of nested field (such as &#39;Object.spec.containers&#39;)  CEL expressions have access to the contents of the API request, organized into CEL variables as well as some other useful variables:  - &#39;object&#39; - The object from the incoming request. The value is null for DELETE requests. - &#39;oldObject&#39; - The existing object. The value is null for CREATE requests. - &#39;request&#39; - Attributes of the API request([ref](/pkg/apis/admission/types.go#AdmissionRequest)). - &#39;params&#39; - Parameter resource referred to by the policy binding being evaluated. Only populated if the policy has a ParamKind. - &#39;namespaceObject&#39; - The namespace object that the incoming object belongs to. The value is null for cluster-scoped resources. - &#39;variables&#39; - Map of composited variables, from its name to its lazily evaluated value.   For example, a variable named &#39;foo&#39; can be accessed as &#39;variables.foo&#39;. - &#39;authorizer&#39; - A CEL Authorizer. May be used to perform authorization checks for the principal (user or service account) of the request.   See https://pkg.go.dev/k8s.io/apiserver/pkg/cel/library#Authz - &#39;authorizer.requestResource&#39; - A CEL ResourceCheck constructed from the &#39;authorizer&#39; and configured with the   request resource.  CEL expressions have access to [Kubernetes CEL function libraries](https://kubernetes.io/docs/reference/using-api/cel/#cel-options-language-features-and-libraries) as well as:  - &#39;jsonpatch.escapeKey&#39; - Performs JSONPatch key escaping. &#39;~&#39; and  &#39;/&#39; are escaped as &#39;~0&#39; and &#x60;~1&#39; respectively).  Only property names of the form &#x60;[a-zA-Z_.-/][a-zA-Z0-9_.-/]*&#x60; are accessible. Required.
   * @return expression
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "expression will be evaluated by CEL to create a [JSON patch](https://jsonpatch.com/). ref: https://github.com/google/cel-spec  expression must return an array of JSONPatch values.  For example, this CEL expression returns a JSON patch to conditionally modify a value:     [      JSONPatch{op: \"test\", path: \"/spec/example\", value: \"Red\"},      JSONPatch{op: \"replace\", path: \"/spec/example\", value: \"Green\"}    ]  To define an object for the patch value, use Object types. For example:     [      JSONPatch{        op: \"add\",        path: \"/spec/selector\",        value: Object.spec.selector{matchLabels: {\"environment\": \"test\"}}      }    ]  To use strings containing '/' and '~' as JSONPatch path keys, use \"jsonpatch.escapeKey\". For example:     [      JSONPatch{        op: \"add\",        path: \"/metadata/labels/\" + jsonpatch.escapeKey(\"example.com/environment\"),        value: \"test\"      },    ]  CEL expressions have access to the types needed to create JSON patches and objects:  - 'JSONPatch' - CEL type of JSON Patch operations. JSONPatch has the fields 'op', 'from', 'path' and 'value'.   See [JSON patch](https://jsonpatch.com/) for more details. The 'value' field may be set to any of: string,   integer, array, map or object.  If set, the 'path' and 'from' fields must be set to a   [JSON pointer](https://datatracker.ietf.org/doc/html/rfc6901/) string, where the 'jsonpatch.escapeKey()' CEL   function may be used to escape path keys containing '/' and '~'. - 'Object' - CEL type of the resource object. - 'Object.<fieldName>' - CEL type of object field (such as 'Object.spec') - 'Object.<fieldName1>.<fieldName2>...<fieldNameN>` - CEL type of nested field (such as 'Object.spec.containers')  CEL expressions have access to the contents of the API request, organized into CEL variables as well as some other useful variables:  - 'object' - The object from the incoming request. The value is null for DELETE requests. - 'oldObject' - The existing object. The value is null for CREATE requests. - 'request' - Attributes of the API request([ref](/pkg/apis/admission/types.go#AdmissionRequest)). - 'params' - Parameter resource referred to by the policy binding being evaluated. Only populated if the policy has a ParamKind. - 'namespaceObject' - The namespace object that the incoming object belongs to. The value is null for cluster-scoped resources. - 'variables' - Map of composited variables, from its name to its lazily evaluated value.   For example, a variable named 'foo' can be accessed as 'variables.foo'. - 'authorizer' - A CEL Authorizer. May be used to perform authorization checks for the principal (user or service account) of the request.   See https://pkg.go.dev/k8s.io/apiserver/pkg/cel/library#Authz - 'authorizer.requestResource' - A CEL ResourceCheck constructed from the 'authorizer' and configured with the   request resource.  CEL expressions have access to [Kubernetes CEL function libraries](https://kubernetes.io/docs/reference/using-api/cel/#cel-options-language-features-and-libraries) as well as:  - 'jsonpatch.escapeKey' - Performs JSONPatch key escaping. '~' and  '/' are escaped as '~0' and `~1' respectively).  Only property names of the form `[a-zA-Z_.-/][a-zA-Z0-9_.-/]*` are accessible. Required.")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1JSONPatch v1alpha1JSONPatch = (V1alpha1JSONPatch) o;
    return Objects.equals(this.expression, v1alpha1JSONPatch.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1JSONPatch {\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha1JSONPatch
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha1JSONPatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1JSONPatch is not found in the empty JSON string", V1alpha1JSONPatch.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1JSONPatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1JSONPatch` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("expression") != null && !jsonObj.get("expression").isJsonNull()) && !jsonObj.get("expression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expression").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1JSONPatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1JSONPatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1JSONPatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1JSONPatch.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1JSONPatch>() {
           @Override
           public void write(JsonWriter out, V1alpha1JSONPatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1JSONPatch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1JSONPatch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1JSONPatch
  * @throws IOException if the JSON string is invalid with respect to V1alpha1JSONPatch
  */
  public static V1alpha1JSONPatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1JSONPatch.class);
  }

 /**
  * Convert an instance of V1alpha1JSONPatch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
