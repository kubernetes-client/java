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
import io.kubernetes.client.openapi.models.V1alpha1GroupVersionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Spec of the storage version migration.
 */
@ApiModel(description = "Spec of the storage version migration.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T23:08:31.638427Z[Etc/UTC]")
public class V1alpha1StorageVersionMigrationSpec {
  public static final String SERIALIZED_NAME_CONTINUE_TOKEN = "continueToken";
  @SerializedName(SERIALIZED_NAME_CONTINUE_TOKEN)
  private String continueToken;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private V1alpha1GroupVersionResource resource;


  public V1alpha1StorageVersionMigrationSpec continueToken(String continueToken) {

    this.continueToken = continueToken;
    return this;
  }

   /**
   * The token used in the list options to get the next chunk of objects to migrate. When the .status.conditions indicates the migration is \&quot;Running\&quot;, users can use this token to check the progress of the migration.
   * @return continueToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The token used in the list options to get the next chunk of objects to migrate. When the .status.conditions indicates the migration is \"Running\", users can use this token to check the progress of the migration.")

  public String getContinueToken() {
    return continueToken;
  }


  public void setContinueToken(String continueToken) {
    this.continueToken = continueToken;
  }


  public V1alpha1StorageVersionMigrationSpec resource(V1alpha1GroupVersionResource resource) {

    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @ApiModelProperty(required = true, value = "")

  public V1alpha1GroupVersionResource getResource() {
    return resource;
  }


  public void setResource(V1alpha1GroupVersionResource resource) {
    this.resource = resource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1StorageVersionMigrationSpec v1alpha1StorageVersionMigrationSpec = (V1alpha1StorageVersionMigrationSpec) o;
    return Objects.equals(this.continueToken, v1alpha1StorageVersionMigrationSpec.continueToken) &&
        Objects.equals(this.resource, v1alpha1StorageVersionMigrationSpec.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(continueToken, resource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1StorageVersionMigrationSpec {\n");
    sb.append("    continueToken: ").append(toIndentedString(continueToken)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
