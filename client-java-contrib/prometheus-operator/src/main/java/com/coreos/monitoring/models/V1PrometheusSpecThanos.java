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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * Thanos configuration allows configuring various aspects of a Prometheus server in a Thanos
 * environment. This section is experimental, it may change significantly without deprecation notice
 * in any release. This is experimental and may change significantly without backward compatibility
 * in any release.
 */
@ApiModel(
    description =
        "Thanos configuration allows configuring various aspects of a Prometheus server in a Thanos environment.   This section is experimental, it may change significantly without deprecation notice in any release.   This is experimental and may change significantly without backward compatibility in any release.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PrometheusSpecThanos {
  public static final String SERIALIZED_NAME_BASE_IMAGE = "baseImage";

  @SerializedName(SERIALIZED_NAME_BASE_IMAGE)
  private String baseImage;

  public static final String SERIALIZED_NAME_GRPC_SERVER_TLS_CONFIG = "grpcServerTlsConfig";

  @SerializedName(SERIALIZED_NAME_GRPC_SERVER_TLS_CONFIG)
  private V1ThanosRulerSpecGrpcServerTlsConfig grpcServerTlsConfig;

  public static final String SERIALIZED_NAME_IMAGE = "image";

  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_LISTEN_LOCAL = "listenLocal";

  @SerializedName(SERIALIZED_NAME_LISTEN_LOCAL)
  private Boolean listenLocal;

  public static final String SERIALIZED_NAME_OBJECT_STORAGE_CONFIG = "objectStorageConfig";

  @SerializedName(SERIALIZED_NAME_OBJECT_STORAGE_CONFIG)
  private V1ThanosRulerSpecObjectStorageConfig objectStorageConfig;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";

  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1PrometheusSpecThanosResources resources;

  public static final String SERIALIZED_NAME_SHA = "sha";

  @SerializedName(SERIALIZED_NAME_SHA)
  private String sha;

  public static final String SERIALIZED_NAME_TAG = "tag";

  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_TRACING_CONFIG = "tracingConfig";

  @SerializedName(SERIALIZED_NAME_TRACING_CONFIG)
  private V1ThanosRulerSpecTracingConfig tracingConfig;

  public static final String SERIALIZED_NAME_VERSION = "version";

  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public V1PrometheusSpecThanos baseImage(String baseImage) {

    this.baseImage = baseImage;
    return this;
  }

  /**
   * Thanos base image if other than default.
   *
   * @return baseImage
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Thanos base image if other than default.")
  public String getBaseImage() {
    return baseImage;
  }

  public void setBaseImage(String baseImage) {
    this.baseImage = baseImage;
  }

  public V1PrometheusSpecThanos grpcServerTlsConfig(
      V1ThanosRulerSpecGrpcServerTlsConfig grpcServerTlsConfig) {

    this.grpcServerTlsConfig = grpcServerTlsConfig;
    return this;
  }

  /**
   * Get grpcServerTlsConfig
   *
   * @return grpcServerTlsConfig
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecGrpcServerTlsConfig getGrpcServerTlsConfig() {
    return grpcServerTlsConfig;
  }

  public void setGrpcServerTlsConfig(V1ThanosRulerSpecGrpcServerTlsConfig grpcServerTlsConfig) {
    this.grpcServerTlsConfig = grpcServerTlsConfig;
  }

  public V1PrometheusSpecThanos image(String image) {

    this.image = image;
    return this;
  }

  /**
   * Image if specified has precedence over baseImage, tag and sha combinations. Specifying the
   * version is still necessary to ensure the Prometheus Operator knows what version of Thanos is
   * being configured.
   *
   * @return image
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Image if specified has precedence over baseImage, tag and sha combinations. Specifying the version is still necessary to ensure the Prometheus Operator knows what version of Thanos is being configured.")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public V1PrometheusSpecThanos listenLocal(Boolean listenLocal) {

    this.listenLocal = listenLocal;
    return this;
  }

  /**
   * ListenLocal makes the Thanos sidecar listen on loopback, so that it does not bind against the
   * Pod IP.
   *
   * @return listenLocal
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ListenLocal makes the Thanos sidecar listen on loopback, so that it does not bind against the Pod IP.")
  public Boolean getListenLocal() {
    return listenLocal;
  }

  public void setListenLocal(Boolean listenLocal) {
    this.listenLocal = listenLocal;
  }

  public V1PrometheusSpecThanos objectStorageConfig(
      V1ThanosRulerSpecObjectStorageConfig objectStorageConfig) {

    this.objectStorageConfig = objectStorageConfig;
    return this;
  }

  /**
   * Get objectStorageConfig
   *
   * @return objectStorageConfig
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecObjectStorageConfig getObjectStorageConfig() {
    return objectStorageConfig;
  }

  public void setObjectStorageConfig(V1ThanosRulerSpecObjectStorageConfig objectStorageConfig) {
    this.objectStorageConfig = objectStorageConfig;
  }

  public V1PrometheusSpecThanos resources(V1PrometheusSpecThanosResources resources) {

    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   *
   * @return resources
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecThanosResources getResources() {
    return resources;
  }

  public void setResources(V1PrometheusSpecThanosResources resources) {
    this.resources = resources;
  }

  public V1PrometheusSpecThanos sha(String sha) {

    this.sha = sha;
    return this;
  }

  /**
   * SHA of Thanos container image to be deployed. Defaults to the value of &#x60;version&#x60;.
   * Similar to a tag, but the SHA explicitly deploys an immutable container image. Version and Tag
   * are ignored if SHA is set.
   *
   * @return sha
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "SHA of Thanos container image to be deployed. Defaults to the value of `version`. Similar to a tag, but the SHA explicitly deploys an immutable container image. Version and Tag are ignored if SHA is set.")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }

  public V1PrometheusSpecThanos tag(String tag) {

    this.tag = tag;
    return this;
  }

  /**
   * Tag of Thanos sidecar container image to be deployed. Defaults to the value of
   * &#x60;version&#x60;. Version is ignored if Tag is set.
   *
   * @return tag
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Tag of Thanos sidecar container image to be deployed. Defaults to the value of `version`. Version is ignored if Tag is set.")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public V1PrometheusSpecThanos tracingConfig(V1ThanosRulerSpecTracingConfig tracingConfig) {

    this.tracingConfig = tracingConfig;
    return this;
  }

  /**
   * Get tracingConfig
   *
   * @return tracingConfig
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecTracingConfig getTracingConfig() {
    return tracingConfig;
  }

  public void setTracingConfig(V1ThanosRulerSpecTracingConfig tracingConfig) {
    this.tracingConfig = tracingConfig;
  }

  public V1PrometheusSpecThanos version(String version) {

    this.version = version;
    return this;
  }

  /**
   * Version describes the version of Thanos to use.
   *
   * @return version
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version describes the version of Thanos to use.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PrometheusSpecThanos v1PrometheusSpecThanos = (V1PrometheusSpecThanos) o;
    return Objects.equals(this.baseImage, v1PrometheusSpecThanos.baseImage)
        && Objects.equals(this.grpcServerTlsConfig, v1PrometheusSpecThanos.grpcServerTlsConfig)
        && Objects.equals(this.image, v1PrometheusSpecThanos.image)
        && Objects.equals(this.listenLocal, v1PrometheusSpecThanos.listenLocal)
        && Objects.equals(this.objectStorageConfig, v1PrometheusSpecThanos.objectStorageConfig)
        && Objects.equals(this.resources, v1PrometheusSpecThanos.resources)
        && Objects.equals(this.sha, v1PrometheusSpecThanos.sha)
        && Objects.equals(this.tag, v1PrometheusSpecThanos.tag)
        && Objects.equals(this.tracingConfig, v1PrometheusSpecThanos.tracingConfig)
        && Objects.equals(this.version, v1PrometheusSpecThanos.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        baseImage,
        grpcServerTlsConfig,
        image,
        listenLocal,
        objectStorageConfig,
        resources,
        sha,
        tag,
        tracingConfig,
        version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusSpecThanos {\n");
    sb.append("    baseImage: ").append(toIndentedString(baseImage)).append("\n");
    sb.append("    grpcServerTlsConfig: ")
        .append(toIndentedString(grpcServerTlsConfig))
        .append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    listenLocal: ").append(toIndentedString(listenLocal)).append("\n");
    sb.append("    objectStorageConfig: ")
        .append(toIndentedString(objectStorageConfig))
        .append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    tracingConfig: ").append(toIndentedString(tracingConfig)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
