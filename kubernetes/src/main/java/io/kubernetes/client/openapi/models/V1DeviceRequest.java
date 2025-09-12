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
import io.kubernetes.client.openapi.models.V1DeviceSubRequest;
import io.kubernetes.client.openapi.models.V1ExactDeviceRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DeviceRequest is a request for devices required for a claim. This is typically a request for a single resource like a device, but can also ask for several identical devices. With FirstAvailable it is also possible to provide a prioritized list of requests.
 */
@ApiModel(description = "DeviceRequest is a request for devices required for a claim. This is typically a request for a single resource like a device, but can also ask for several identical devices. With FirstAvailable it is also possible to provide a prioritized list of requests.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T22:12:20.439480Z[Etc/UTC]")
public class V1DeviceRequest {
  public static final String SERIALIZED_NAME_EXACTLY = "exactly";
  @SerializedName(SERIALIZED_NAME_EXACTLY)
  private V1ExactDeviceRequest exactly;

  public static final String SERIALIZED_NAME_FIRST_AVAILABLE = "firstAvailable";
  @SerializedName(SERIALIZED_NAME_FIRST_AVAILABLE)
  private List<V1DeviceSubRequest> firstAvailable = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public V1DeviceRequest exactly(V1ExactDeviceRequest exactly) {

    this.exactly = exactly;
    return this;
  }

   /**
   * Get exactly
   * @return exactly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ExactDeviceRequest getExactly() {
    return exactly;
  }


  public void setExactly(V1ExactDeviceRequest exactly) {
    this.exactly = exactly;
  }


  public V1DeviceRequest firstAvailable(List<V1DeviceSubRequest> firstAvailable) {

    this.firstAvailable = firstAvailable;
    return this;
  }

  public V1DeviceRequest addFirstAvailableItem(V1DeviceSubRequest firstAvailableItem) {
    if (this.firstAvailable == null) {
      this.firstAvailable = new ArrayList<>();
    }
    this.firstAvailable.add(firstAvailableItem);
    return this;
  }

   /**
   * FirstAvailable contains subrequests, of which exactly one will be selected by the scheduler. It tries to satisfy them in the order in which they are listed here. So if there are two entries in the list, the scheduler will only check the second one if it determines that the first one can not be used.  DRA does not yet implement scoring, so the scheduler will select the first set of devices that satisfies all the requests in the claim. And if the requirements can be satisfied on more than one node, other scheduling features will determine which node is chosen. This means that the set of devices allocated to a claim might not be the optimal set available to the cluster. Scoring will be implemented later.
   * @return firstAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FirstAvailable contains subrequests, of which exactly one will be selected by the scheduler. It tries to satisfy them in the order in which they are listed here. So if there are two entries in the list, the scheduler will only check the second one if it determines that the first one can not be used.  DRA does not yet implement scoring, so the scheduler will select the first set of devices that satisfies all the requests in the claim. And if the requirements can be satisfied on more than one node, other scheduling features will determine which node is chosen. This means that the set of devices allocated to a claim might not be the optimal set available to the cluster. Scoring will be implemented later.")

  public List<V1DeviceSubRequest> getFirstAvailable() {
    return firstAvailable;
  }


  public void setFirstAvailable(List<V1DeviceSubRequest> firstAvailable) {
    this.firstAvailable = firstAvailable;
  }


  public V1DeviceRequest name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Name can be used to reference this request in a pod.spec.containers[].resources.claims entry and in a constraint of the claim.  References using the name in the DeviceRequest will uniquely identify a request when the Exactly field is set. When the FirstAvailable field is set, a reference to the name of the DeviceRequest will match whatever subrequest is chosen by the scheduler.  Must be a DNS label.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name can be used to reference this request in a pod.spec.containers[].resources.claims entry and in a constraint of the claim.  References using the name in the DeviceRequest will uniquely identify a request when the Exactly field is set. When the FirstAvailable field is set, a reference to the name of the DeviceRequest will match whatever subrequest is chosen by the scheduler.  Must be a DNS label.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DeviceRequest v1DeviceRequest = (V1DeviceRequest) o;
    return Objects.equals(this.exactly, v1DeviceRequest.exactly) &&
        Objects.equals(this.firstAvailable, v1DeviceRequest.firstAvailable) &&
        Objects.equals(this.name, v1DeviceRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exactly, firstAvailable, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DeviceRequest {\n");
    sb.append("    exactly: ").append(toIndentedString(exactly)).append("\n");
    sb.append("    firstAvailable: ").append(toIndentedString(firstAvailable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
