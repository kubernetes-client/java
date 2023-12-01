/*
Copyright 2023 The Kubernetes Authors.
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
import java.util.ArrayList;
import java.util.List;

/**
 * IngressTLS describes the transport layer security associated with an ingress.
 */
@ApiModel(description = "IngressTLS describes the transport layer security associated with an ingress.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1IngressTLS {
  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private List<String> hosts = null;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";
  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;


  public V1IngressTLS hosts(List<String> hosts) {

    this.hosts = hosts;
    return this;
  }

  public V1IngressTLS addHostsItem(String hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * hosts is a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
   * @return hosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "hosts is a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.")

  public List<String> getHosts() {
    return hosts;
  }


  public void setHosts(List<String> hosts) {
    this.hosts = hosts;
  }


  public V1IngressTLS secretName(String secretName) {

    this.secretName = secretName;
    return this;
  }

   /**
   * secretName is the name of the secret used to terminate TLS traffic on port 443. Field is left optional to allow TLS routing based on SNI hostname alone. If the SNI host in a listener conflicts with the \&quot;Host\&quot; header field used by an IngressRule, the SNI host is used for termination and value of the \&quot;Host\&quot; header is used for routing.
   * @return secretName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "secretName is the name of the secret used to terminate TLS traffic on port 443. Field is left optional to allow TLS routing based on SNI hostname alone. If the SNI host in a listener conflicts with the \"Host\" header field used by an IngressRule, the SNI host is used for termination and value of the \"Host\" header is used for routing.")

  public String getSecretName() {
    return secretName;
  }


  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1IngressTLS v1IngressTLS = (V1IngressTLS) o;
    return Objects.equals(this.hosts, v1IngressTLS.hosts) &&
        Objects.equals(this.secretName, v1IngressTLS.secretName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hosts, secretName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IngressTLS {\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
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
