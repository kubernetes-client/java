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
 * ApplyConfiguration defines the desired configuration values of an object.
 */
@ApiModel(description = "ApplyConfiguration defines the desired configuration values of an object.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T21:15:49.397498Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha1ApplyConfiguration {
  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;

  public V1alpha1ApplyConfiguration() {
  }

  public V1alpha1ApplyConfiguration expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * expression will be evaluated by CEL to create an apply configuration. ref: https://github.com/google/cel-spec  Apply configurations are declared in CEL using object initialization. For example, this CEL expression returns an apply configuration to set a single field:   Object{    spec: Object.spec{      serviceAccountName: \&quot;example\&quot;    }  }  Apply configurations may not modify atomic structs, maps or arrays due to the risk of accidental deletion of values not included in the apply configuration.  CEL expressions have access to the object types needed to create apply configurations:  - &#39;Object&#39; - CEL type of the resource object. - &#39;Object.&lt;fieldName&gt;&#39; - CEL type of object field (such as &#39;Object.spec&#39;) - &#39;Object.&lt;fieldName1&gt;.&lt;fieldName2&gt;...&lt;fieldNameN&gt;&#x60; - CEL type of nested field (such as &#39;Object.spec.containers&#39;)  CEL expressions have access to the contents of the API request, organized into CEL variables as well as some other useful variables:  - &#39;object&#39; - The object from the incoming request. The value is null for DELETE requests. - &#39;oldObject&#39; - The existing object. The value is null for CREATE requests. - &#39;request&#39; - Attributes of the API request([ref](/pkg/apis/admission/types.go#AdmissionRequest)). - &#39;params&#39; - Parameter resource referred to by the policy binding being evaluated. Only populated if the policy has a ParamKind. - &#39;namespaceObject&#39; - The namespace object that the incoming object belongs to. The value is null for cluster-scoped resources. - &#39;variables&#39; - Map of composited variables, from its name to its lazily evaluated value.   For example, a variable named &#39;foo&#39; can be accessed as &#39;variables.foo&#39;. - &#39;authorizer&#39; - A CEL Authorizer. May be used to perform authorization checks for the principal (user or service account) of the request.   See https://pkg.go.dev/k8s.io/apiserver/pkg/cel/library#Authz - &#39;authorizer.requestResource&#39; - A CEL ResourceCheck constructed from the &#39;authorizer&#39; and configured with the   request resource.  The &#x60;apiVersion&#x60;, &#x60;kind&#x60;, &#x60;metadata.name&#x60; and &#x60;metadata.generateName&#x60; are always accessible from the root of the object. No other metadata properties are accessible.  Only property names of the form &#x60;[a-zA-Z_.-/][a-zA-Z0-9_.-/]*&#x60; are accessible. Required.
   * @return expression
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "expression will be evaluated by CEL to create an apply configuration. ref: https://github.com/google/cel-spec  Apply configurations are declared in CEL using object initialization. For example, this CEL expression returns an apply configuration to set a single field:   Object{    spec: Object.spec{      serviceAccountName: \"example\"    }  }  Apply configurations may not modify atomic structs, maps or arrays due to the risk of accidental deletion of values not included in the apply configuration.  CEL expressions have access to the object types needed to create apply configurations:  - 'Object' - CEL type of the resource object. - 'Object.<fieldName>' - CEL type of object field (such as 'Object.spec') - 'Object.<fieldName1>.<fieldName2>...<fieldNameN>` - CEL type of nested field (such as 'Object.spec.containers')  CEL expressions have access to the contents of the API request, organized into CEL variables as well as some other useful variables:  - 'object' - The object from the incoming request. The value is null for DELETE requests. - 'oldObject' - The existing object. The value is null for CREATE requests. - 'request' - Attributes of the API request([ref](/pkg/apis/admission/types.go#AdmissionRequest)). - 'params' - Parameter resource referred to by the policy binding being evaluated. Only populated if the policy has a ParamKind. - 'namespaceObject' - The namespace object that the incoming object belongs to. The value is null for cluster-scoped resources. - 'variables' - Map of composited variables, from its name to its lazily evaluated value.   For example, a variable named 'foo' can be accessed as 'variables.foo'. - 'authorizer' - A CEL Authorizer. May be used to perform authorization checks for the principal (user or service account) of the request.   See https://pkg.go.dev/k8s.io/apiserver/pkg/cel/library#Authz - 'authorizer.requestResource' - A CEL ResourceCheck constructed from the 'authorizer' and configured with the   request resource.  The `apiVersion`, `kind`, `metadata.name` and `metadata.generateName` are always accessible from the root of the object. No other metadata properties are accessible.  Only property names of the form `[a-zA-Z_.-/][a-zA-Z0-9_.-/]*` are accessible. Required.")
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
    V1alpha1ApplyConfiguration v1alpha1ApplyConfiguration = (V1alpha1ApplyConfiguration) o;
    return Objects.equals(this.expression, v1alpha1ApplyConfiguration.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ApplyConfiguration {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to V1alpha1ApplyConfiguration
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha1ApplyConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1ApplyConfiguration is not found in the empty JSON string", V1alpha1ApplyConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1ApplyConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1ApplyConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!V1alpha1ApplyConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1ApplyConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1ApplyConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1ApplyConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1ApplyConfiguration>() {
           @Override
           public void write(JsonWriter out, V1alpha1ApplyConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1ApplyConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1ApplyConfiguration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1ApplyConfiguration
  * @throws IOException if the JSON string is invalid with respect to V1alpha1ApplyConfiguration
  */
  public static V1alpha1ApplyConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1ApplyConfiguration.class);
  }

 /**
  * Convert an instance of V1alpha1ApplyConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
