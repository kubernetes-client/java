/*
Copyright 2020 The Kubernetes Authors.
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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** PodPresetSpec is a description of a pod preset. */
@ApiModel(description = "PodPresetSpec is a description of a pod preset.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-07-29T18:17:00.375Z[Etc/UTC]")
public class V1alpha1PodPresetSpec {
  public static final String SERIALIZED_NAME_ENV = "env";

  @SerializedName(SERIALIZED_NAME_ENV)
  private List<V1EnvVar> env = null;

  public static final String SERIALIZED_NAME_ENV_FROM = "envFrom";

  @SerializedName(SERIALIZED_NAME_ENV_FROM)
  private List<V1EnvFromSource> envFrom = null;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";

  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1LabelSelector selector;

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";

  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List<V1VolumeMount> volumeMounts = null;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";

  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<V1Volume> volumes = null;

  public V1alpha1PodPresetSpec env(List<V1EnvVar> env) {

    this.env = env;
    return this;
  }

  public V1alpha1PodPresetSpec addEnvItem(V1EnvVar envItem) {
    if (this.env == null) {
      this.env = new ArrayList<V1EnvVar>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * Env defines the collection of EnvVar to inject into containers.
   *
   * @return env
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Env defines the collection of EnvVar to inject into containers.")
  public List<V1EnvVar> getEnv() {
    return env;
  }

  public void setEnv(List<V1EnvVar> env) {
    this.env = env;
  }

  public V1alpha1PodPresetSpec envFrom(List<V1EnvFromSource> envFrom) {

    this.envFrom = envFrom;
    return this;
  }

  public V1alpha1PodPresetSpec addEnvFromItem(V1EnvFromSource envFromItem) {
    if (this.envFrom == null) {
      this.envFrom = new ArrayList<V1EnvFromSource>();
    }
    this.envFrom.add(envFromItem);
    return this;
  }

  /**
   * EnvFrom defines the collection of EnvFromSource to inject into containers.
   *
   * @return envFrom
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "EnvFrom defines the collection of EnvFromSource to inject into containers.")
  public List<V1EnvFromSource> getEnvFrom() {
    return envFrom;
  }

  public void setEnvFrom(List<V1EnvFromSource> envFrom) {
    this.envFrom = envFrom;
  }

  public V1alpha1PodPresetSpec selector(V1LabelSelector selector) {

    this.selector = selector;
    return this;
  }

  /**
   * Get selector
   *
   * @return selector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }

  public V1alpha1PodPresetSpec volumeMounts(List<V1VolumeMount> volumeMounts) {

    this.volumeMounts = volumeMounts;
    return this;
  }

  public V1alpha1PodPresetSpec addVolumeMountsItem(V1VolumeMount volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<V1VolumeMount>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

  /**
   * VolumeMounts defines the collection of VolumeMount to inject into containers.
   *
   * @return volumeMounts
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "VolumeMounts defines the collection of VolumeMount to inject into containers.")
  public List<V1VolumeMount> getVolumeMounts() {
    return volumeMounts;
  }

  public void setVolumeMounts(List<V1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }

  public V1alpha1PodPresetSpec volumes(List<V1Volume> volumes) {

    this.volumes = volumes;
    return this;
  }

  public V1alpha1PodPresetSpec addVolumesItem(V1Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<V1Volume>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

  /**
   * Volumes defines the collection of Volume to inject into the pod.
   *
   * @return volumes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Volumes defines the collection of Volume to inject into the pod.")
  public List<V1Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<V1Volume> volumes) {
    this.volumes = volumes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodPresetSpec v1alpha1PodPresetSpec = (V1alpha1PodPresetSpec) o;
    return Objects.equals(this.env, v1alpha1PodPresetSpec.env)
        && Objects.equals(this.envFrom, v1alpha1PodPresetSpec.envFrom)
        && Objects.equals(this.selector, v1alpha1PodPresetSpec.selector)
        && Objects.equals(this.volumeMounts, v1alpha1PodPresetSpec.volumeMounts)
        && Objects.equals(this.volumes, v1alpha1PodPresetSpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(env, envFrom, selector, volumeMounts, volumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodPresetSpec {\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    envFrom: ").append(toIndentedString(envFrom)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
