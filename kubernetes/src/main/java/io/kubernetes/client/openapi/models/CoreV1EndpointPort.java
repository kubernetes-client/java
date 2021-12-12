/*
Copyright 2021 The Kubernetes Authors.
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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/** EndpointPort is a tuple that describes a single port. */
@ApiModel(description = "EndpointPort is a tuple that describes a single port.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class CoreV1EndpointPort {
  public static final String SERIALIZED_NAME_APP_PROTOCOL = "appProtocol";

  @SerializedName(SERIALIZED_NAME_APP_PROTOCOL)
  private String appProtocol;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PORT = "port";

  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  /**
   * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP. Possible enum values:
   * - &#x60;\&quot;SCTP\&quot;&#x60; is the SCTP protocol. - &#x60;\&quot;TCP\&quot;&#x60; is the
   * TCP protocol. - &#x60;\&quot;UDP\&quot;&#x60; is the UDP protocol.
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    SCTP("SCTP"),

    TCP("TCP"),

    UDP("UDP");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProtocolEnum fromValue(String value) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProtocolEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";

  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private ProtocolEnum protocol;

  public CoreV1EndpointPort appProtocol(String appProtocol) {

    this.appProtocol = appProtocol;
    return this;
  }

  /**
   * The application protocol for this port. This field follows standard Kubernetes label syntax.
   * Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and
   * http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed
   * names such as mycompany.com/my-custom-protocol.
   *
   * @return appProtocol
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.")
  public String getAppProtocol() {
    return appProtocol;
  }

  public void setAppProtocol(String appProtocol) {
    this.appProtocol = appProtocol;
  }

  public CoreV1EndpointPort name(String name) {

    this.name = name;
    return this;
  }

  /**
   * The name of this port. This must match the &#39;name&#39; field in the corresponding
   * ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The name of this port.  This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CoreV1EndpointPort port(Integer port) {

    this.port = port;
    return this;
  }

  /**
   * The port number of the endpoint.
   *
   * @return port
   */
  @ApiModelProperty(required = true, value = "The port number of the endpoint.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public CoreV1EndpointPort protocol(ProtocolEnum protocol) {

    this.protocol = protocol;
    return this;
  }

  /**
   * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP. Possible enum values:
   * - &#x60;\&quot;SCTP\&quot;&#x60; is the SCTP protocol. - &#x60;\&quot;TCP\&quot;&#x60; is the
   * TCP protocol. - &#x60;\&quot;UDP\&quot;&#x60; is the UDP protocol.
   *
   * @return protocol
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.  Possible enum values:  - `\"SCTP\"` is the SCTP protocol.  - `\"TCP\"` is the TCP protocol.  - `\"UDP\"` is the UDP protocol.")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreV1EndpointPort coreV1EndpointPort = (CoreV1EndpointPort) o;
    return Objects.equals(this.appProtocol, coreV1EndpointPort.appProtocol)
        && Objects.equals(this.name, coreV1EndpointPort.name)
        && Objects.equals(this.port, coreV1EndpointPort.port)
        && Objects.equals(this.protocol, coreV1EndpointPort.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appProtocol, name, port, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreV1EndpointPort {\n");
    sb.append("    appProtocol: ").append(toIndentedString(appProtocol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
