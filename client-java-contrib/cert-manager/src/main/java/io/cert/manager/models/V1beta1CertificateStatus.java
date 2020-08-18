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
package io.cert.manager.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.joda.time.DateTime;

/** Status of the Certificate. This is set and managed automatically. */
@ApiModel(description = "Status of the Certificate. This is set and managed automatically.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1beta1CertificateStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1beta1CertificateStatusConditions> conditions = null;

  public static final String SERIALIZED_NAME_LAST_FAILURE_TIME = "lastFailureTime";

  @SerializedName(SERIALIZED_NAME_LAST_FAILURE_TIME)
  private DateTime lastFailureTime;

  public static final String SERIALIZED_NAME_NEXT_PRIVATE_KEY_SECRET_NAME =
      "nextPrivateKeySecretName";

  @SerializedName(SERIALIZED_NAME_NEXT_PRIVATE_KEY_SECRET_NAME)
  private String nextPrivateKeySecretName;

  public static final String SERIALIZED_NAME_NOT_AFTER = "notAfter";

  @SerializedName(SERIALIZED_NAME_NOT_AFTER)
  private DateTime notAfter;

  public static final String SERIALIZED_NAME_NOT_BEFORE = "notBefore";

  @SerializedName(SERIALIZED_NAME_NOT_BEFORE)
  private DateTime notBefore;

  public static final String SERIALIZED_NAME_RENEWAL_TIME = "renewalTime";

  @SerializedName(SERIALIZED_NAME_RENEWAL_TIME)
  private DateTime renewalTime;

  public static final String SERIALIZED_NAME_REVISION = "revision";

  @SerializedName(SERIALIZED_NAME_REVISION)
  private Integer revision;

  public V1beta1CertificateStatus conditions(List<V1beta1CertificateStatusConditions> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1beta1CertificateStatus addConditionsItem(
      V1beta1CertificateStatusConditions conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<V1beta1CertificateStatusConditions>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * List of status conditions to indicate the status of certificates. Known condition types are
   * &#x60;Ready&#x60; and &#x60;Issuing&#x60;.
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "List of status conditions to indicate the status of certificates. Known condition types are `Ready` and `Issuing`.")
  public List<V1beta1CertificateStatusConditions> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1beta1CertificateStatusConditions> conditions) {
    this.conditions = conditions;
  }

  public V1beta1CertificateStatus lastFailureTime(DateTime lastFailureTime) {

    this.lastFailureTime = lastFailureTime;
    return this;
  }

  /**
   * LastFailureTime is the time as recorded by the Certificate controller of the most recent
   * failure to complete a CertificateRequest for this Certificate resource. If set, cert-manager
   * will not re-request another Certificate until 1 hour has elapsed from this time.
   *
   * @return lastFailureTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "LastFailureTime is the time as recorded by the Certificate controller of the most recent failure to complete a CertificateRequest for this Certificate resource. If set, cert-manager will not re-request another Certificate until 1 hour has elapsed from this time.")
  public DateTime getLastFailureTime() {
    return lastFailureTime;
  }

  public void setLastFailureTime(DateTime lastFailureTime) {
    this.lastFailureTime = lastFailureTime;
  }

  public V1beta1CertificateStatus nextPrivateKeySecretName(String nextPrivateKeySecretName) {

    this.nextPrivateKeySecretName = nextPrivateKeySecretName;
    return this;
  }

  /**
   * The name of the Secret resource containing the private key to be used for the next certificate
   * iteration. The keymanager controller will automatically set this field if the
   * &#x60;Issuing&#x60; condition is set to &#x60;True&#x60;. It will automatically unset this
   * field when the Issuing condition is not set or False.
   *
   * @return nextPrivateKeySecretName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The name of the Secret resource containing the private key to be used for the next certificate iteration. The keymanager controller will automatically set this field if the `Issuing` condition is set to `True`. It will automatically unset this field when the Issuing condition is not set or False.")
  public String getNextPrivateKeySecretName() {
    return nextPrivateKeySecretName;
  }

  public void setNextPrivateKeySecretName(String nextPrivateKeySecretName) {
    this.nextPrivateKeySecretName = nextPrivateKeySecretName;
  }

  public V1beta1CertificateStatus notAfter(DateTime notAfter) {

    this.notAfter = notAfter;
    return this;
  }

  /**
   * The expiration time of the certificate stored in the secret named by this resource in
   * &#x60;spec.secretName&#x60;.
   *
   * @return notAfter
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The expiration time of the certificate stored in the secret named by this resource in `spec.secretName`.")
  public DateTime getNotAfter() {
    return notAfter;
  }

  public void setNotAfter(DateTime notAfter) {
    this.notAfter = notAfter;
  }

  public V1beta1CertificateStatus notBefore(DateTime notBefore) {

    this.notBefore = notBefore;
    return this;
  }

  /**
   * The time after which the certificate stored in the secret named by this resource in
   * spec.secretName is valid.
   *
   * @return notBefore
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The time after which the certificate stored in the secret named by this resource in spec.secretName is valid.")
  public DateTime getNotBefore() {
    return notBefore;
  }

  public void setNotBefore(DateTime notBefore) {
    this.notBefore = notBefore;
  }

  public V1beta1CertificateStatus renewalTime(DateTime renewalTime) {

    this.renewalTime = renewalTime;
    return this;
  }

  /**
   * RenewalTime is the time at which the certificate will be next renewed. If not set, no upcoming
   * renewal is scheduled.
   *
   * @return renewalTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "RenewalTime is the time at which the certificate will be next renewed. If not set, no upcoming renewal is scheduled.")
  public DateTime getRenewalTime() {
    return renewalTime;
  }

  public void setRenewalTime(DateTime renewalTime) {
    this.renewalTime = renewalTime;
  }

  public V1beta1CertificateStatus revision(Integer revision) {

    this.revision = revision;
    return this;
  }

  /**
   * The current &#39;revision&#39; of the certificate as issued. When a CertificateRequest resource
   * is created, it will have the &#x60;cert-manager.io/certificate-revision&#x60; set to one
   * greater than the current value of this field. Upon issuance, this field will be set to the
   * value of the annotation on the CertificateRequest resource used to issue the certificate.
   * Persisting the value on the CertificateRequest resource allows the certificates controller to
   * know whether a request is part of an old issuance or if it is part of the ongoing
   * revision&#39;s issuance by checking if the revision value in the annotation is greater than
   * this field.
   *
   * @return revision
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The current 'revision' of the certificate as issued.   When a CertificateRequest resource is created, it will have the `cert-manager.io/certificate-revision` set to one greater than the current value of this field.   Upon issuance, this field will be set to the value of the annotation on the CertificateRequest resource used to issue the certificate.   Persisting the value on the CertificateRequest resource allows the certificates controller to know whether a request is part of an old issuance or if it is part of the ongoing revision's issuance by checking if the revision value in the annotation is greater than this field.")
  public Integer getRevision() {
    return revision;
  }

  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CertificateStatus v1beta1CertificateStatus = (V1beta1CertificateStatus) o;
    return Objects.equals(this.conditions, v1beta1CertificateStatus.conditions)
        && Objects.equals(this.lastFailureTime, v1beta1CertificateStatus.lastFailureTime)
        && Objects.equals(
            this.nextPrivateKeySecretName, v1beta1CertificateStatus.nextPrivateKeySecretName)
        && Objects.equals(this.notAfter, v1beta1CertificateStatus.notAfter)
        && Objects.equals(this.notBefore, v1beta1CertificateStatus.notBefore)
        && Objects.equals(this.renewalTime, v1beta1CertificateStatus.renewalTime)
        && Objects.equals(this.revision, v1beta1CertificateStatus.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        conditions,
        lastFailureTime,
        nextPrivateKeySecretName,
        notAfter,
        notBefore,
        renewalTime,
        revision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CertificateStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    lastFailureTime: ").append(toIndentedString(lastFailureTime)).append("\n");
    sb.append("    nextPrivateKeySecretName: ")
        .append(toIndentedString(nextPrivateKeySecretName))
        .append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    renewalTime: ").append(toIndentedString(renewalTime)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
