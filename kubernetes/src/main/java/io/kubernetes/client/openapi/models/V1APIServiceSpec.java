/*
Copyright 2022 The Kubernetes Authors.
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
import java.util.Arrays;
import java.util.Objects;

/**
 * APIServiceSpec contains information for locating and communicating with a server. Only https is
 * supported, though you are able to disable certificate verification.
 */
@ApiModel(
    description =
        "APIServiceSpec contains information for locating and communicating with a server. Only https is supported, though you are able to disable certificate verification.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1APIServiceSpec {
  public static final String SERIALIZED_NAME_CA_BUNDLE = "caBundle";

  @SerializedName(SERIALIZED_NAME_CA_BUNDLE)
  private byte[] caBundle;

  public static final String SERIALIZED_NAME_GROUP = "group";

  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_GROUP_PRIORITY_MINIMUM = "groupPriorityMinimum";

  @SerializedName(SERIALIZED_NAME_GROUP_PRIORITY_MINIMUM)
  private Integer groupPriorityMinimum;

  public static final String SERIALIZED_NAME_INSECURE_SKIP_T_L_S_VERIFY = "insecureSkipTLSVerify";

  @SerializedName(SERIALIZED_NAME_INSECURE_SKIP_T_L_S_VERIFY)
  private Boolean insecureSkipTLSVerify;

  public static final String SERIALIZED_NAME_SERVICE = "service";

  @SerializedName(SERIALIZED_NAME_SERVICE)
  private ApiregistrationV1ServiceReference service;

  public static final String SERIALIZED_NAME_VERSION = "version";

  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_VERSION_PRIORITY = "versionPriority";

  @SerializedName(SERIALIZED_NAME_VERSION_PRIORITY)
  private Integer versionPriority;

  public V1APIServiceSpec caBundle(byte[] caBundle) {

    this.caBundle = caBundle;
    return this;
  }

  /**
   * CABundle is a PEM encoded CA bundle which will be used to validate an API server&#39;s serving
   * certificate. If unspecified, system trust roots on the apiserver are used.
   *
   * @return caBundle
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving certificate. If unspecified, system trust roots on the apiserver are used.")
  public byte[] getCaBundle() {
    return caBundle;
  }

  public void setCaBundle(byte[] caBundle) {
    this.caBundle = caBundle;
  }

  public V1APIServiceSpec group(String group) {

    this.group = group;
    return this;
  }

  /**
   * Group is the API group name this server hosts
   *
   * @return group
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group is the API group name this server hosts")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public V1APIServiceSpec groupPriorityMinimum(Integer groupPriorityMinimum) {

    this.groupPriorityMinimum = groupPriorityMinimum;
    return this;
  }

  /**
   * GroupPriorityMininum is the priority this group should have at least. Higher priority means
   * that the group is preferred by clients over lower priority ones. Note that other versions of
   * this group might specify even higher GroupPriorityMininum values such that the whole group gets
   * a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to
   * lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name
   * of the object. (v1.bar before v1.foo) We&#39;d recommend something like: *.k8s.io (except
   * extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
   *
   * @return groupPriorityMinimum
   */
  @ApiModelProperty(
      required = true,
      value =
          "GroupPriorityMininum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We'd recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s")
  public Integer getGroupPriorityMinimum() {
    return groupPriorityMinimum;
  }

  public void setGroupPriorityMinimum(Integer groupPriorityMinimum) {
    this.groupPriorityMinimum = groupPriorityMinimum;
  }

  public V1APIServiceSpec insecureSkipTLSVerify(Boolean insecureSkipTLSVerify) {

    this.insecureSkipTLSVerify = insecureSkipTLSVerify;
    return this;
  }

  /**
   * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this
   * server. This is strongly discouraged. You should use the CABundle instead.
   *
   * @return insecureSkipTLSVerify
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.")
  public Boolean getInsecureSkipTLSVerify() {
    return insecureSkipTLSVerify;
  }

  public void setInsecureSkipTLSVerify(Boolean insecureSkipTLSVerify) {
    this.insecureSkipTLSVerify = insecureSkipTLSVerify;
  }

  public V1APIServiceSpec service(ApiregistrationV1ServiceReference service) {

    this.service = service;
    return this;
  }

  /**
   * Get service
   *
   * @return service
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public ApiregistrationV1ServiceReference getService() {
    return service;
  }

  public void setService(ApiregistrationV1ServiceReference service) {
    this.service = service;
  }

  public V1APIServiceSpec version(String version) {

    this.version = version;
    return this;
  }

  /**
   * Version is the API version this server hosts. For example, \&quot;v1\&quot;
   *
   * @return version
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version is the API version this server hosts.  For example, \"v1\"")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public V1APIServiceSpec versionPriority(Integer versionPriority) {

    this.versionPriority = versionPriority;
    return this;
  }

  /**
   * VersionPriority controls the ordering of this API version inside of its group. Must be greater
   * than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before
   * 10). Since it&#39;s inside of a group, the number can be small, probably in the 10s. In case of
   * equal version priorities, the version string will be used to compute the order inside a group.
   * If the version string is \&quot;kube-like\&quot;, it will sort above non
   * \&quot;kube-like\&quot; version strings, which are ordered lexicographically.
   * \&quot;Kube-like\&quot; versions start with a \&quot;v\&quot;, then are followed by a number
   * (the major version), then optionally the string \&quot;alpha\&quot; or \&quot;beta\&quot; and
   * another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA
   * is a version with no suffix such as beta or alpha), and then by comparing major version, then
   * minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1,
   * v12alpha1, v11alpha2, foo1, foo10.
   *
   * @return versionPriority
   */
  @ApiModelProperty(
      required = true,
      value =
          "VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is \"kube-like\", it will sort above non \"kube-like\" version strings, which are ordered lexicographically. \"Kube-like\" versions start with a \"v\", then are followed by a number (the major version), then optionally the string \"alpha\" or \"beta\" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.")
  public Integer getVersionPriority() {
    return versionPriority;
  }

  public void setVersionPriority(Integer versionPriority) {
    this.versionPriority = versionPriority;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1APIServiceSpec v1APIServiceSpec = (V1APIServiceSpec) o;
    return Arrays.equals(this.caBundle, v1APIServiceSpec.caBundle)
        && Objects.equals(this.group, v1APIServiceSpec.group)
        && Objects.equals(this.groupPriorityMinimum, v1APIServiceSpec.groupPriorityMinimum)
        && Objects.equals(this.insecureSkipTLSVerify, v1APIServiceSpec.insecureSkipTLSVerify)
        && Objects.equals(this.service, v1APIServiceSpec.service)
        && Objects.equals(this.version, v1APIServiceSpec.version)
        && Objects.equals(this.versionPriority, v1APIServiceSpec.versionPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        Arrays.hashCode(caBundle),
        group,
        groupPriorityMinimum,
        insecureSkipTLSVerify,
        service,
        version,
        versionPriority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1APIServiceSpec {\n");
    sb.append("    caBundle: ").append(toIndentedString(caBundle)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groupPriorityMinimum: ")
        .append(toIndentedString(groupPriorityMinimum))
        .append("\n");
    sb.append("    insecureSkipTLSVerify: ")
        .append(toIndentedString(insecureSkipTLSVerify))
        .append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionPriority: ").append(toIndentedString(versionPriority)).append("\n");
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
