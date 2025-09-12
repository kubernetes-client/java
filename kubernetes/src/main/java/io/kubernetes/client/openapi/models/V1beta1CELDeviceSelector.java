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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CELDeviceSelector contains a CEL expression for selecting a device.
 */
@ApiModel(description = "CELDeviceSelector contains a CEL expression for selecting a device.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T16:56:46.431280Z[Etc/UTC]")
public class V1beta1CELDeviceSelector {
  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;


  public V1beta1CELDeviceSelector expression(String expression) {

    this.expression = expression;
    return this;
  }

   /**
   * Expression is a CEL expression which evaluates a single device. It must evaluate to true when the device under consideration satisfies the desired criteria, and false when it does not. Any other result is an error and causes allocation of devices to abort.  The expression&#39;s input is an object named \&quot;device\&quot;, which carries the following properties:  - driver (string): the name of the driver which defines this device.  - attributes (map[string]object): the device&#39;s attributes, grouped by prefix    (e.g. device.attributes[\&quot;dra.example.com\&quot;] evaluates to an object with all    of the attributes which were prefixed by \&quot;dra.example.com\&quot;.  - capacity (map[string]object): the device&#39;s capacities, grouped by prefix.  - allowMultipleAllocations (bool): the allowMultipleAllocations property of the device    (v1.34+ with the DRAConsumableCapacity feature enabled).  Example: Consider a device with driver&#x3D;\&quot;dra.example.com\&quot;, which exposes two attributes named \&quot;model\&quot; and \&quot;ext.example.com/family\&quot; and which exposes one capacity named \&quot;modules\&quot;. This input to this expression would have the following fields:      device.driver     device.attributes[\&quot;dra.example.com\&quot;].model     device.attributes[\&quot;ext.example.com\&quot;].family     device.capacity[\&quot;dra.example.com\&quot;].modules  The device.driver field can be used to check for a specific driver, either as a high-level precondition (i.e. you only want to consider devices from this driver) or as part of a multi-clause expression that is meant to consider devices from different drivers.  The value type of each attribute is defined by the device definition, and users who write these expressions must consult the documentation for their specific drivers. The value type of each capacity is Quantity.  If an unknown prefix is used as a lookup in either device.attributes or device.capacity, an empty map will be returned. Any reference to an unknown field will cause an evaluation error and allocation to abort.  A robust expression should check for the existence of attributes before referencing them.  For ease of use, the cel.bind() function is enabled, and can be used to simplify expressions that access multiple attributes with the same domain. For example:      cel.bind(dra, device.attributes[\&quot;dra.example.com\&quot;], dra.someBool &amp;&amp; dra.anotherBool)  The length of the expression must be smaller or equal to 10 Ki. The cost of evaluating it is also limited based on the estimated number of logical steps.
   * @return expression
  **/
  @ApiModelProperty(required = true, value = "Expression is a CEL expression which evaluates a single device. It must evaluate to true when the device under consideration satisfies the desired criteria, and false when it does not. Any other result is an error and causes allocation of devices to abort.  The expression's input is an object named \"device\", which carries the following properties:  - driver (string): the name of the driver which defines this device.  - attributes (map[string]object): the device's attributes, grouped by prefix    (e.g. device.attributes[\"dra.example.com\"] evaluates to an object with all    of the attributes which were prefixed by \"dra.example.com\".  - capacity (map[string]object): the device's capacities, grouped by prefix.  - allowMultipleAllocations (bool): the allowMultipleAllocations property of the device    (v1.34+ with the DRAConsumableCapacity feature enabled).  Example: Consider a device with driver=\"dra.example.com\", which exposes two attributes named \"model\" and \"ext.example.com/family\" and which exposes one capacity named \"modules\". This input to this expression would have the following fields:      device.driver     device.attributes[\"dra.example.com\"].model     device.attributes[\"ext.example.com\"].family     device.capacity[\"dra.example.com\"].modules  The device.driver field can be used to check for a specific driver, either as a high-level precondition (i.e. you only want to consider devices from this driver) or as part of a multi-clause expression that is meant to consider devices from different drivers.  The value type of each attribute is defined by the device definition, and users who write these expressions must consult the documentation for their specific drivers. The value type of each capacity is Quantity.  If an unknown prefix is used as a lookup in either device.attributes or device.capacity, an empty map will be returned. Any reference to an unknown field will cause an evaluation error and allocation to abort.  A robust expression should check for the existence of attributes before referencing them.  For ease of use, the cel.bind() function is enabled, and can be used to simplify expressions that access multiple attributes with the same domain. For example:      cel.bind(dra, device.attributes[\"dra.example.com\"], dra.someBool && dra.anotherBool)  The length of the expression must be smaller or equal to 10 Ki. The cost of evaluating it is also limited based on the estimated number of logical steps.")

  public String getExpression() {
    return expression;
  }


  public void setExpression(String expression) {
    this.expression = expression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CELDeviceSelector v1beta1CELDeviceSelector = (V1beta1CELDeviceSelector) o;
    return Objects.equals(this.expression, v1beta1CELDeviceSelector.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CELDeviceSelector {\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
