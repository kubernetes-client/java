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
package io.kubernetes.client.admissionreview.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;
import java.util.Objects;

/** AdmissionRequest describes the admission.Attributes for the admission request. */
@ApiModel(
    description = "AdmissionRequest describes the admission.Attributes for the admission request.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-07-01T14:30:02.888Z[Etc/UTC]")
public class AdmissionRequest {
  public static final String SERIALIZED_NAME_DRY_RUN = "dryRun";

  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private GroupVersionKind kind;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";

  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_OBJECT = "object";

  @SerializedName(SERIALIZED_NAME_OBJECT)
  private Map<String, Object> _object = null;

  public static final String SERIALIZED_NAME_OLD_OBJECT = "oldObject";

  @SerializedName(SERIALIZED_NAME_OLD_OBJECT)
  private Map<String, Object> oldObject = null;

  public static final String SERIALIZED_NAME_OPERATION = "operation";

  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_OPTIONS = "options";

  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, Object> options = null;

  public static final String SERIALIZED_NAME_REQUEST_KIND = "requestKind";

  @SerializedName(SERIALIZED_NAME_REQUEST_KIND)
  private GroupVersionKind requestKind;

  public static final String SERIALIZED_NAME_REQUEST_RESOURCE = "requestResource";

  @SerializedName(SERIALIZED_NAME_REQUEST_RESOURCE)
  private GroupVersionResource requestResource;

  public static final String SERIALIZED_NAME_REQUEST_SUB_RESOURCE = "requestSubResource";

  @SerializedName(SERIALIZED_NAME_REQUEST_SUB_RESOURCE)
  private String requestSubResource;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";

  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private GroupVersionResource resource;

  public static final String SERIALIZED_NAME_SUB_RESOURCE = "subResource";

  @SerializedName(SERIALIZED_NAME_SUB_RESOURCE)
  private String subResource;

  public static final String SERIALIZED_NAME_UID = "uid";

  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_USER_INFO = "userInfo";

  @SerializedName(SERIALIZED_NAME_USER_INFO)
  private UserInfo userInfo;

  public AdmissionRequest dryRun(Boolean dryRun) {

    this.dryRun = dryRun;
    return this;
  }

  /**
   * DryRun indicates that modifications will definitely not be persisted for this request. Defaults
   * to false.
   *
   * @return dryRun
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "DryRun indicates that modifications will definitely not be persisted for this request. Defaults to false.")
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public AdmissionRequest kind(GroupVersionKind kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   *
   * @return kind
   */
  @ApiModelProperty(required = true, value = "")
  public GroupVersionKind getKind() {
    return kind;
  }

  public void setKind(GroupVersionKind kind) {
    this.kind = kind;
  }

  public AdmissionRequest name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name is the name of the object as presented in the request. On a CREATE operation, the client
   * may omit name and rely on the server to generate the name. If that is the case, this field will
   * contain an empty string.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Name is the name of the object as presented in the request.  On a CREATE operation, the client may omit name and rely on the server to generate the name.  If that is the case, this field will contain an empty string.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdmissionRequest namespace(String namespace) {

    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace is the namespace associated with the request (if any).
   *
   * @return namespace
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Namespace is the namespace associated with the request (if any).")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public AdmissionRequest _object(Map<String, Object> _object) {

    this._object = _object;
    return this;
  }

  /**
   * Get _object
   *
   * @return _object
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, Object> getObject() {
    return _object;
  }

  public void setObject(Map<String, Object> _object) {
    this._object = _object;
  }

  public AdmissionRequest oldObject(Map<String, Object> oldObject) {

    this.oldObject = oldObject;
    return this;
  }

  /**
   * Get oldObject
   *
   * @return oldObject
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, Object> getOldObject() {
    return oldObject;
  }

  public void setOldObject(Map<String, Object> oldObject) {
    this.oldObject = oldObject;
  }

  public AdmissionRequest operation(String operation) {

    this.operation = operation;
    return this;
  }

  /**
   * Operation is the operation being performed. This may be different than the operation requested.
   * e.g. a patch can result in either a CREATE or UPDATE Operation.
   *
   * @return operation
   */
  @ApiModelProperty(
      required = true,
      value =
          "Operation is the operation being performed. This may be different than the operation requested. e.g. a patch can result in either a CREATE or UPDATE Operation.")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public AdmissionRequest options(Map<String, Object> options) {

    this.options = options;
    return this;
  }

  /**
   * Get options
   *
   * @return options
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, Object> getOptions() {
    return options;
  }

  public void setOptions(Map<String, Object> options) {
    this.options = options;
  }

  public AdmissionRequest requestKind(GroupVersionKind requestKind) {

    this.requestKind = requestKind;
    return this;
  }

  /**
   * Get requestKind
   *
   * @return requestKind
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public GroupVersionKind getRequestKind() {
    return requestKind;
  }

  public void setRequestKind(GroupVersionKind requestKind) {
    this.requestKind = requestKind;
  }

  public AdmissionRequest requestResource(GroupVersionResource requestResource) {

    this.requestResource = requestResource;
    return this;
  }

  /**
   * Get requestResource
   *
   * @return requestResource
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public GroupVersionResource getRequestResource() {
    return requestResource;
  }

  public void setRequestResource(GroupVersionResource requestResource) {
    this.requestResource = requestResource;
  }

  public AdmissionRequest requestSubResource(String requestSubResource) {

    this.requestSubResource = requestSubResource;
    return this;
  }

  /**
   * RequestSubResource is the name of the subresource of the original API request, if any (for
   * example, \&quot;status\&quot; or \&quot;scale\&quot;) If this is specified and differs from the
   * value in \&quot;subResource\&quot;, an equivalent match and conversion was performed. See
   * documentation for the \&quot;matchPolicy\&quot; field in the webhook configuration type.
   *
   * @return requestSubResource
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "RequestSubResource is the name of the subresource of the original API request, if any (for example, \"status\" or \"scale\") If this is specified and differs from the value in \"subResource\", an equivalent match and conversion was performed. See documentation for the \"matchPolicy\" field in the webhook configuration type.")
  public String getRequestSubResource() {
    return requestSubResource;
  }

  public void setRequestSubResource(String requestSubResource) {
    this.requestSubResource = requestSubResource;
  }

  public AdmissionRequest resource(GroupVersionResource resource) {

    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   *
   * @return resource
   */
  @ApiModelProperty(required = true, value = "")
  public GroupVersionResource getResource() {
    return resource;
  }

  public void setResource(GroupVersionResource resource) {
    this.resource = resource;
  }

  public AdmissionRequest subResource(String subResource) {

    this.subResource = subResource;
    return this;
  }

  /**
   * SubResource is the subresource being requested, if any (for example, \&quot;status\&quot; or
   * \&quot;scale\&quot;)
   *
   * @return subResource
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "SubResource is the subresource being requested, if any (for example, \"status\" or \"scale\")")
  public String getSubResource() {
    return subResource;
  }

  public void setSubResource(String subResource) {
    this.subResource = subResource;
  }

  public AdmissionRequest uid(String uid) {

    this.uid = uid;
    return this;
  }

  /**
   * UID is an identifier for the individual request/response. It allows us to distinguish instances
   * of requests which are otherwise identical (parallel requests, requests when earlier requests
   * did not modify etc) The UID is meant to track the round trip (request/response) between the KAS
   * and the WebHook, not the user request. It is suitable for correlating log entries between the
   * webhook and apiserver, for either auditing or debugging.
   *
   * @return uid
   */
  @ApiModelProperty(
      required = true,
      value =
          "UID is an identifier for the individual request/response. It allows us to distinguish instances of requests which are otherwise identical (parallel requests, requests when earlier requests did not modify etc) The UID is meant to track the round trip (request/response) between the KAS and the WebHook, not the user request. It is suitable for correlating log entries between the webhook and apiserver, for either auditing or debugging.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public AdmissionRequest userInfo(UserInfo userInfo) {

    this.userInfo = userInfo;
    return this;
  }

  /**
   * Get userInfo
   *
   * @return userInfo
   */
  @ApiModelProperty(required = true, value = "")
  public UserInfo getUserInfo() {
    return userInfo;
  }

  public void setUserInfo(UserInfo userInfo) {
    this.userInfo = userInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdmissionRequest admissionRequest = (AdmissionRequest) o;
    return Objects.equals(this.dryRun, admissionRequest.dryRun)
        && Objects.equals(this.kind, admissionRequest.kind)
        && Objects.equals(this.name, admissionRequest.name)
        && Objects.equals(this.namespace, admissionRequest.namespace)
        && Objects.equals(this._object, admissionRequest._object)
        && Objects.equals(this.oldObject, admissionRequest.oldObject)
        && Objects.equals(this.operation, admissionRequest.operation)
        && Objects.equals(this.options, admissionRequest.options)
        && Objects.equals(this.requestKind, admissionRequest.requestKind)
        && Objects.equals(this.requestResource, admissionRequest.requestResource)
        && Objects.equals(this.requestSubResource, admissionRequest.requestSubResource)
        && Objects.equals(this.resource, admissionRequest.resource)
        && Objects.equals(this.subResource, admissionRequest.subResource)
        && Objects.equals(this.uid, admissionRequest.uid)
        && Objects.equals(this.userInfo, admissionRequest.userInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dryRun,
        kind,
        name,
        namespace,
        _object,
        oldObject,
        operation,
        options,
        requestKind,
        requestResource,
        requestSubResource,
        resource,
        subResource,
        uid,
        userInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdmissionRequest {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    oldObject: ").append(toIndentedString(oldObject)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    requestKind: ").append(toIndentedString(requestKind)).append("\n");
    sb.append("    requestResource: ").append(toIndentedString(requestResource)).append("\n");
    sb.append("    requestSubResource: ").append(toIndentedString(requestSubResource)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    subResource: ").append(toIndentedString(subResource)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
