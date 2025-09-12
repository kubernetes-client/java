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
 * ResourceHealth represents the health of a resource. It has the latest device health information. This is a part of KEP https://kep.k8s.io/4680.
 */
@ApiModel(description = "ResourceHealth represents the health of a resource. It has the latest device health information. This is a part of KEP https://kep.k8s.io/4680.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T16:56:46.431280Z[Etc/UTC]")
public class V1ResourceHealth {
  public static final String SERIALIZED_NAME_HEALTH = "health";
  @SerializedName(SERIALIZED_NAME_HEALTH)
  private String health;

  public static final String SERIALIZED_NAME_RESOURCE_I_D = "resourceID";
  @SerializedName(SERIALIZED_NAME_RESOURCE_I_D)
  private String resourceID;


  public V1ResourceHealth health(String health) {

    this.health = health;
    return this;
  }

   /**
   * Health of the resource. can be one of:  - Healthy: operates as normal  - Unhealthy: reported unhealthy. We consider this a temporary health issue               since we do not have a mechanism today to distinguish               temporary and permanent issues.  - Unknown: The status cannot be determined.             For example, Device Plugin got unregistered and hasn&#39;t been re-registered since.  In future we may want to introduce the PermanentlyUnhealthy Status.
   * @return health
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Health of the resource. can be one of:  - Healthy: operates as normal  - Unhealthy: reported unhealthy. We consider this a temporary health issue               since we do not have a mechanism today to distinguish               temporary and permanent issues.  - Unknown: The status cannot be determined.             For example, Device Plugin got unregistered and hasn't been re-registered since.  In future we may want to introduce the PermanentlyUnhealthy Status.")

  public String getHealth() {
    return health;
  }


  public void setHealth(String health) {
    this.health = health;
  }


  public V1ResourceHealth resourceID(String resourceID) {

    this.resourceID = resourceID;
    return this;
  }

   /**
   * ResourceID is the unique identifier of the resource. See the ResourceID type for more information.
   * @return resourceID
  **/
  @ApiModelProperty(required = true, value = "ResourceID is the unique identifier of the resource. See the ResourceID type for more information.")

  public String getResourceID() {
    return resourceID;
  }


  public void setResourceID(String resourceID) {
    this.resourceID = resourceID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceHealth v1ResourceHealth = (V1ResourceHealth) o;
    return Objects.equals(this.health, v1ResourceHealth.health) &&
        Objects.equals(this.resourceID, v1ResourceHealth.resourceID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(health, resourceID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceHealth {\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    resourceID: ").append(toIndentedString(resourceID)).append("\n");
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
