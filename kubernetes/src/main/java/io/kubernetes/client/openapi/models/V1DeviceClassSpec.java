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
import io.kubernetes.client.openapi.models.V1DeviceClassConfiguration;
import io.kubernetes.client.openapi.models.V1DeviceSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DeviceClassSpec is used in a [DeviceClass] to define what can be allocated and how to configure it.
 */
@ApiModel(description = "DeviceClassSpec is used in a [DeviceClass] to define what can be allocated and how to configure it.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T16:56:46.431280Z[Etc/UTC]")
public class V1DeviceClassSpec {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private List<V1DeviceClassConfiguration> config = null;

  public static final String SERIALIZED_NAME_EXTENDED_RESOURCE_NAME = "extendedResourceName";
  @SerializedName(SERIALIZED_NAME_EXTENDED_RESOURCE_NAME)
  private String extendedResourceName;

  public static final String SERIALIZED_NAME_SELECTORS = "selectors";
  @SerializedName(SERIALIZED_NAME_SELECTORS)
  private List<V1DeviceSelector> selectors = null;


  public V1DeviceClassSpec config(List<V1DeviceClassConfiguration> config) {

    this.config = config;
    return this;
  }

  public V1DeviceClassSpec addConfigItem(V1DeviceClassConfiguration configItem) {
    if (this.config == null) {
      this.config = new ArrayList<>();
    }
    this.config.add(configItem);
    return this;
  }

   /**
   * Config defines configuration parameters that apply to each device that is claimed via this class. Some classses may potentially be satisfied by multiple drivers, so each instance of a vendor configuration applies to exactly one driver.  They are passed to the driver, but are not considered while allocating the claim.
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Config defines configuration parameters that apply to each device that is claimed via this class. Some classses may potentially be satisfied by multiple drivers, so each instance of a vendor configuration applies to exactly one driver.  They are passed to the driver, but are not considered while allocating the claim.")

  public List<V1DeviceClassConfiguration> getConfig() {
    return config;
  }


  public void setConfig(List<V1DeviceClassConfiguration> config) {
    this.config = config;
  }


  public V1DeviceClassSpec extendedResourceName(String extendedResourceName) {

    this.extendedResourceName = extendedResourceName;
    return this;
  }

   /**
   * ExtendedResourceName is the extended resource name for the devices of this class. The devices of this class can be used to satisfy a pod&#39;s extended resource requests. It has the same format as the name of a pod&#39;s extended resource. It should be unique among all the device classes in a cluster. If two device classes have the same name, then the class created later is picked to satisfy a pod&#39;s extended resource requests. If two classes are created at the same time, then the name of the class lexicographically sorted first is picked.  This is an alpha field.
   * @return extendedResourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ExtendedResourceName is the extended resource name for the devices of this class. The devices of this class can be used to satisfy a pod's extended resource requests. It has the same format as the name of a pod's extended resource. It should be unique among all the device classes in a cluster. If two device classes have the same name, then the class created later is picked to satisfy a pod's extended resource requests. If two classes are created at the same time, then the name of the class lexicographically sorted first is picked.  This is an alpha field.")

  public String getExtendedResourceName() {
    return extendedResourceName;
  }


  public void setExtendedResourceName(String extendedResourceName) {
    this.extendedResourceName = extendedResourceName;
  }


  public V1DeviceClassSpec selectors(List<V1DeviceSelector> selectors) {

    this.selectors = selectors;
    return this;
  }

  public V1DeviceClassSpec addSelectorsItem(V1DeviceSelector selectorsItem) {
    if (this.selectors == null) {
      this.selectors = new ArrayList<>();
    }
    this.selectors.add(selectorsItem);
    return this;
  }

   /**
   * Each selector must be satisfied by a device which is claimed via this class.
   * @return selectors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Each selector must be satisfied by a device which is claimed via this class.")

  public List<V1DeviceSelector> getSelectors() {
    return selectors;
  }


  public void setSelectors(List<V1DeviceSelector> selectors) {
    this.selectors = selectors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DeviceClassSpec v1DeviceClassSpec = (V1DeviceClassSpec) o;
    return Objects.equals(this.config, v1DeviceClassSpec.config) &&
        Objects.equals(this.extendedResourceName, v1DeviceClassSpec.extendedResourceName) &&
        Objects.equals(this.selectors, v1DeviceClassSpec.selectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, extendedResourceName, selectors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DeviceClassSpec {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    extendedResourceName: ").append(toIndentedString(extendedResourceName)).append("\n");
    sb.append("    selectors: ").append(toIndentedString(selectors)).append("\n");
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
