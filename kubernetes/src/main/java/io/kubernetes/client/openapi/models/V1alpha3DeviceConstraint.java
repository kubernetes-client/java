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
import java.util.ArrayList;
import java.util.List;

/**
 * DeviceConstraint must have exactly one field set besides Requests.
 */
@ApiModel(description = "DeviceConstraint must have exactly one field set besides Requests.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:21:52.410010Z[Etc/UTC]")
public class V1alpha3DeviceConstraint {
  public static final String SERIALIZED_NAME_MATCH_ATTRIBUTE = "matchAttribute";
  @SerializedName(SERIALIZED_NAME_MATCH_ATTRIBUTE)
  private String matchAttribute;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private List<String> requests = null;


  public V1alpha3DeviceConstraint matchAttribute(String matchAttribute) {

    this.matchAttribute = matchAttribute;
    return this;
  }

   /**
   * MatchAttribute requires that all devices in question have this attribute and that its type and value are the same across those devices.  For example, if you specified \&quot;dra.example.com/numa\&quot; (a hypothetical example!), then only devices in the same NUMA node will be chosen. A device which does not have that attribute will not be chosen. All devices should use a value of the same type for this attribute because that is part of its specification, but if one device doesn&#39;t, then it also will not be chosen.  Must include the domain qualifier.
   * @return matchAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MatchAttribute requires that all devices in question have this attribute and that its type and value are the same across those devices.  For example, if you specified \"dra.example.com/numa\" (a hypothetical example!), then only devices in the same NUMA node will be chosen. A device which does not have that attribute will not be chosen. All devices should use a value of the same type for this attribute because that is part of its specification, but if one device doesn't, then it also will not be chosen.  Must include the domain qualifier.")

  public String getMatchAttribute() {
    return matchAttribute;
  }


  public void setMatchAttribute(String matchAttribute) {
    this.matchAttribute = matchAttribute;
  }


  public V1alpha3DeviceConstraint requests(List<String> requests) {

    this.requests = requests;
    return this;
  }

  public V1alpha3DeviceConstraint addRequestsItem(String requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<>();
    }
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * Requests is a list of the one or more requests in this claim which must co-satisfy this constraint. If a request is fulfilled by multiple devices, then all of the devices must satisfy the constraint. If this is not specified, this constraint applies to all requests in this claim.
   * @return requests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requests is a list of the one or more requests in this claim which must co-satisfy this constraint. If a request is fulfilled by multiple devices, then all of the devices must satisfy the constraint. If this is not specified, this constraint applies to all requests in this claim.")

  public List<String> getRequests() {
    return requests;
  }


  public void setRequests(List<String> requests) {
    this.requests = requests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3DeviceConstraint v1alpha3DeviceConstraint = (V1alpha3DeviceConstraint) o;
    return Objects.equals(this.matchAttribute, v1alpha3DeviceConstraint.matchAttribute) &&
        Objects.equals(this.requests, v1alpha3DeviceConstraint.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchAttribute, requests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3DeviceConstraint {\n");
    sb.append("    matchAttribute: ").append(toIndentedString(matchAttribute)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
