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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/** Use the Microsoft Azure DNS API to manage DNS01 challenge records. */
@ApiModel(description = "Use the Microsoft Azure DNS API to manage DNS01 challenge records.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeDns01Azuredns {
  public static final String SERIALIZED_NAME_CLIENT_I_D = "clientID";

  @SerializedName(SERIALIZED_NAME_CLIENT_I_D)
  private String clientID;

  public static final String SERIALIZED_NAME_CLIENT_SECRET_SECRET_REF = "clientSecretSecretRef";

  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET_SECRET_REF)
  private V1alpha2IssuerSpecAcmeDns01AzurednsClientSecretSecretRef clientSecretSecretRef;

  /** Gets or Sets environment */
  @JsonAdapter(EnvironmentEnum.Adapter.class)
  public enum EnvironmentEnum {
    AZUREPUBLICCLOUD("AzurePublicCloud"),

    AZURECHINACLOUD("AzureChinaCloud"),

    AZUREGERMANCLOUD("AzureGermanCloud"),

    AZUREUSGOVERNMENTCLOUD("AzureUSGovernmentCloud");

    private String value;

    EnvironmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnvironmentEnum fromValue(String value) {
      for (EnvironmentEnum b : EnvironmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnvironmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnvironmentEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnvironmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EnvironmentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";

  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private EnvironmentEnum environment;

  public static final String SERIALIZED_NAME_HOSTED_ZONE_NAME = "hostedZoneName";

  @SerializedName(SERIALIZED_NAME_HOSTED_ZONE_NAME)
  private String hostedZoneName;

  public static final String SERIALIZED_NAME_RESOURCE_GROUP_NAME = "resourceGroupName";

  @SerializedName(SERIALIZED_NAME_RESOURCE_GROUP_NAME)
  private String resourceGroupName;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_I_D = "subscriptionID";

  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_I_D)
  private String subscriptionID;

  public static final String SERIALIZED_NAME_TENANT_I_D = "tenantID";

  @SerializedName(SERIALIZED_NAME_TENANT_I_D)
  private String tenantID;

  public V1alpha2IssuerSpecAcmeDns01Azuredns clientID(String clientID) {

    this.clientID = clientID;
    return this;
  }

  /**
   * if both this and ClientSecret are left unset MSI will be used
   *
   * @return clientID
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if both this and ClientSecret are left unset MSI will be used")
  public String getClientID() {
    return clientID;
  }

  public void setClientID(String clientID) {
    this.clientID = clientID;
  }

  public V1alpha2IssuerSpecAcmeDns01Azuredns clientSecretSecretRef(
      V1alpha2IssuerSpecAcmeDns01AzurednsClientSecretSecretRef clientSecretSecretRef) {

    this.clientSecretSecretRef = clientSecretSecretRef;
    return this;
  }

  /**
   * Get clientSecretSecretRef
   *
   * @return clientSecretSecretRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeDns01AzurednsClientSecretSecretRef getClientSecretSecretRef() {
    return clientSecretSecretRef;
  }

  public void setClientSecretSecretRef(
      V1alpha2IssuerSpecAcmeDns01AzurednsClientSecretSecretRef clientSecretSecretRef) {
    this.clientSecretSecretRef = clientSecretSecretRef;
  }

  public V1alpha2IssuerSpecAcmeDns01Azuredns environment(EnvironmentEnum environment) {

    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   *
   * @return environment
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  public V1alpha2IssuerSpecAcmeDns01Azuredns hostedZoneName(String hostedZoneName) {

    this.hostedZoneName = hostedZoneName;
    return this;
  }

  /**
   * Get hostedZoneName
   *
   * @return hostedZoneName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getHostedZoneName() {
    return hostedZoneName;
  }

  public void setHostedZoneName(String hostedZoneName) {
    this.hostedZoneName = hostedZoneName;
  }

  public V1alpha2IssuerSpecAcmeDns01Azuredns resourceGroupName(String resourceGroupName) {

    this.resourceGroupName = resourceGroupName;
    return this;
  }

  /**
   * Get resourceGroupName
   *
   * @return resourceGroupName
   */
  @ApiModelProperty(required = true, value = "")
  public String getResourceGroupName() {
    return resourceGroupName;
  }

  public void setResourceGroupName(String resourceGroupName) {
    this.resourceGroupName = resourceGroupName;
  }

  public V1alpha2IssuerSpecAcmeDns01Azuredns subscriptionID(String subscriptionID) {

    this.subscriptionID = subscriptionID;
    return this;
  }

  /**
   * Get subscriptionID
   *
   * @return subscriptionID
   */
  @ApiModelProperty(required = true, value = "")
  public String getSubscriptionID() {
    return subscriptionID;
  }

  public void setSubscriptionID(String subscriptionID) {
    this.subscriptionID = subscriptionID;
  }

  public V1alpha2IssuerSpecAcmeDns01Azuredns tenantID(String tenantID) {

    this.tenantID = tenantID;
    return this;
  }

  /**
   * when specifying ClientID and ClientSecret then this field is also needed
   *
   * @return tenantID
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "when specifying ClientID and ClientSecret then this field is also needed")
  public String getTenantID() {
    return tenantID;
  }

  public void setTenantID(String tenantID) {
    this.tenantID = tenantID;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeDns01Azuredns v1alpha2IssuerSpecAcmeDns01Azuredns =
        (V1alpha2IssuerSpecAcmeDns01Azuredns) o;
    return Objects.equals(this.clientID, v1alpha2IssuerSpecAcmeDns01Azuredns.clientID)
        && Objects.equals(
            this.clientSecretSecretRef, v1alpha2IssuerSpecAcmeDns01Azuredns.clientSecretSecretRef)
        && Objects.equals(this.environment, v1alpha2IssuerSpecAcmeDns01Azuredns.environment)
        && Objects.equals(this.hostedZoneName, v1alpha2IssuerSpecAcmeDns01Azuredns.hostedZoneName)
        && Objects.equals(
            this.resourceGroupName, v1alpha2IssuerSpecAcmeDns01Azuredns.resourceGroupName)
        && Objects.equals(this.subscriptionID, v1alpha2IssuerSpecAcmeDns01Azuredns.subscriptionID)
        && Objects.equals(this.tenantID, v1alpha2IssuerSpecAcmeDns01Azuredns.tenantID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clientID,
        clientSecretSecretRef,
        environment,
        hostedZoneName,
        resourceGroupName,
        subscriptionID,
        tenantID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeDns01Azuredns {\n");
    sb.append("    clientID: ").append(toIndentedString(clientID)).append("\n");
    sb.append("    clientSecretSecretRef: ")
        .append(toIndentedString(clientSecretSecretRef))
        .append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    hostedZoneName: ").append(toIndentedString(hostedZoneName)).append("\n");
    sb.append("    resourceGroupName: ").append(toIndentedString(resourceGroupName)).append("\n");
    sb.append("    subscriptionID: ").append(toIndentedString(subscriptionID)).append("\n");
    sb.append("    tenantID: ").append(toIndentedString(tenantID)).append("\n");
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
