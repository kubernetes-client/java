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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1ServicePort;
import io.kubernetes.client.openapi.models.V1SessionAffinityConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ServiceSpec describes the attributes that a user creates on a service.
 */
@ApiModel(description = "ServiceSpec describes the attributes that a user creates on a service.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ServiceSpec {
  public static final String SERIALIZED_NAME_ALLOCATE_LOAD_BALANCER_NODE_PORTS = "allocateLoadBalancerNodePorts";
  @SerializedName(SERIALIZED_NAME_ALLOCATE_LOAD_BALANCER_NODE_PORTS)
  @jakarta.annotation.Nullable
  private Boolean allocateLoadBalancerNodePorts;

  public static final String SERIALIZED_NAME_CLUSTER_I_P = "clusterIP";
  @SerializedName(SERIALIZED_NAME_CLUSTER_I_P)
  @jakarta.annotation.Nullable
  private String clusterIP;

  public static final String SERIALIZED_NAME_CLUSTER_I_PS = "clusterIPs";
  @SerializedName(SERIALIZED_NAME_CLUSTER_I_PS)
  @jakarta.annotation.Nullable
  private List<String> clusterIPs = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTERNAL_I_PS = "externalIPs";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_I_PS)
  @jakarta.annotation.Nullable
  private List<String> externalIPs = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTERNAL_NAME = "externalName";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_NAME)
  @jakarta.annotation.Nullable
  private String externalName;

  public static final String SERIALIZED_NAME_EXTERNAL_TRAFFIC_POLICY = "externalTrafficPolicy";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_TRAFFIC_POLICY)
  @jakarta.annotation.Nullable
  private String externalTrafficPolicy;

  public static final String SERIALIZED_NAME_HEALTH_CHECK_NODE_PORT = "healthCheckNodePort";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK_NODE_PORT)
  @jakarta.annotation.Nullable
  private Integer healthCheckNodePort;

  public static final String SERIALIZED_NAME_INTERNAL_TRAFFIC_POLICY = "internalTrafficPolicy";
  @SerializedName(SERIALIZED_NAME_INTERNAL_TRAFFIC_POLICY)
  @jakarta.annotation.Nullable
  private String internalTrafficPolicy;

  public static final String SERIALIZED_NAME_IP_FAMILIES = "ipFamilies";
  @SerializedName(SERIALIZED_NAME_IP_FAMILIES)
  @jakarta.annotation.Nullable
  private List<String> ipFamilies = new ArrayList<>();

  public static final String SERIALIZED_NAME_IP_FAMILY_POLICY = "ipFamilyPolicy";
  @SerializedName(SERIALIZED_NAME_IP_FAMILY_POLICY)
  @jakarta.annotation.Nullable
  private String ipFamilyPolicy;

  public static final String SERIALIZED_NAME_LOAD_BALANCER_CLASS = "loadBalancerClass";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_CLASS)
  @jakarta.annotation.Nullable
  private String loadBalancerClass;

  public static final String SERIALIZED_NAME_LOAD_BALANCER_I_P = "loadBalancerIP";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_I_P)
  @jakarta.annotation.Nullable
  private String loadBalancerIP;

  public static final String SERIALIZED_NAME_LOAD_BALANCER_SOURCE_RANGES = "loadBalancerSourceRanges";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_SOURCE_RANGES)
  @jakarta.annotation.Nullable
  private List<String> loadBalancerSourceRanges = new ArrayList<>();

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  @jakarta.annotation.Nullable
  private List<V1ServicePort> ports = new ArrayList<>();

  public static final String SERIALIZED_NAME_PUBLISH_NOT_READY_ADDRESSES = "publishNotReadyAddresses";
  @SerializedName(SERIALIZED_NAME_PUBLISH_NOT_READY_ADDRESSES)
  @jakarta.annotation.Nullable
  private Boolean publishNotReadyAddresses;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  @jakarta.annotation.Nullable
  private Map<String, String> selector = new HashMap<>();

  public static final String SERIALIZED_NAME_SESSION_AFFINITY = "sessionAffinity";
  @SerializedName(SERIALIZED_NAME_SESSION_AFFINITY)
  @jakarta.annotation.Nullable
  private String sessionAffinity;

  public static final String SERIALIZED_NAME_SESSION_AFFINITY_CONFIG = "sessionAffinityConfig";
  @SerializedName(SERIALIZED_NAME_SESSION_AFFINITY_CONFIG)
  @jakarta.annotation.Nullable
  private V1SessionAffinityConfig sessionAffinityConfig;

  public static final String SERIALIZED_NAME_TRAFFIC_DISTRIBUTION = "trafficDistribution";
  @SerializedName(SERIALIZED_NAME_TRAFFIC_DISTRIBUTION)
  @jakarta.annotation.Nullable
  private String trafficDistribution;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @jakarta.annotation.Nullable
  private String type;

  public V1ServiceSpec() {
  }

  public V1ServiceSpec allocateLoadBalancerNodePorts(@jakarta.annotation.Nullable Boolean allocateLoadBalancerNodePorts) {
    this.allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts;
    return this;
  }

  /**
   * allocateLoadBalancerNodePorts defines if NodePorts will be automatically allocated for services with type LoadBalancer.  Default is \&quot;true\&quot;. It may be set to \&quot;false\&quot; if the cluster load-balancer does not rely on NodePorts.  If the caller requests specific NodePorts (by specifying a value), those requests will be respected, regardless of this field. This field may only be set for services with type LoadBalancer and will be cleared if the type is changed to any other type.
   * @return allocateLoadBalancerNodePorts
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "allocateLoadBalancerNodePorts defines if NodePorts will be automatically allocated for services with type LoadBalancer.  Default is \"true\". It may be set to \"false\" if the cluster load-balancer does not rely on NodePorts.  If the caller requests specific NodePorts (by specifying a value), those requests will be respected, regardless of this field. This field may only be set for services with type LoadBalancer and will be cleared if the type is changed to any other type.")
  public Boolean getAllocateLoadBalancerNodePorts() {
    return allocateLoadBalancerNodePorts;
  }

  public void setAllocateLoadBalancerNodePorts(@jakarta.annotation.Nullable Boolean allocateLoadBalancerNodePorts) {
    this.allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts;
  }


  public V1ServiceSpec clusterIP(@jakarta.annotation.Nullable String clusterIP) {
    this.clusterIP = clusterIP;
    return this;
  }

  /**
   * clusterIP is the IP address of the service and is usually assigned randomly. If an address is specified manually, is in-range (as per system configuration), and is not in use, it will be allocated to the service; otherwise creation of the service will fail. This field may not be changed through updates unless the type field is also being changed to ExternalName (which requires this field to be blank) or the type field is being changed from ExternalName (in which case this field may optionally be specified, as describe above).  Valid values are \&quot;None\&quot;, empty string (\&quot;\&quot;), or a valid IP address. Setting this to \&quot;None\&quot; makes a \&quot;headless service\&quot; (no virtual IP), which is useful when direct endpoint connections are preferred and proxying is not required.  Only applies to types ClusterIP, NodePort, and LoadBalancer. If this field is specified when creating a Service of type ExternalName, creation will fail. This field will be wiped when updating a Service to type ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   * @return clusterIP
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "clusterIP is the IP address of the service and is usually assigned randomly. If an address is specified manually, is in-range (as per system configuration), and is not in use, it will be allocated to the service; otherwise creation of the service will fail. This field may not be changed through updates unless the type field is also being changed to ExternalName (which requires this field to be blank) or the type field is being changed from ExternalName (in which case this field may optionally be specified, as describe above).  Valid values are \"None\", empty string (\"\"), or a valid IP address. Setting this to \"None\" makes a \"headless service\" (no virtual IP), which is useful when direct endpoint connections are preferred and proxying is not required.  Only applies to types ClusterIP, NodePort, and LoadBalancer. If this field is specified when creating a Service of type ExternalName, creation will fail. This field will be wiped when updating a Service to type ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")
  public String getClusterIP() {
    return clusterIP;
  }

  public void setClusterIP(@jakarta.annotation.Nullable String clusterIP) {
    this.clusterIP = clusterIP;
  }


  public V1ServiceSpec clusterIPs(@jakarta.annotation.Nullable List<String> clusterIPs) {
    this.clusterIPs = clusterIPs;
    return this;
  }

  public V1ServiceSpec addClusterIPsItem(String clusterIPsItem) {
    if (this.clusterIPs == null) {
      this.clusterIPs = new ArrayList<>();
    }
    this.clusterIPs.add(clusterIPsItem);
    return this;
  }

  /**
   * ClusterIPs is a list of IP addresses assigned to this service, and are usually assigned randomly.  If an address is specified manually, is in-range (as per system configuration), and is not in use, it will be allocated to the service; otherwise creation of the service will fail. This field may not be changed through updates unless the type field is also being changed to ExternalName (which requires this field to be empty) or the type field is being changed from ExternalName (in which case this field may optionally be specified, as describe above).  Valid values are \&quot;None\&quot;, empty string (\&quot;\&quot;), or a valid IP address.  Setting this to \&quot;None\&quot; makes a \&quot;headless service\&quot; (no virtual IP), which is useful when direct endpoint connections are preferred and proxying is not required.  Only applies to types ClusterIP, NodePort, and LoadBalancer. If this field is specified when creating a Service of type ExternalName, creation will fail. This field will be wiped when updating a Service to type ExternalName.  If this field is not specified, it will be initialized from the clusterIP field.  If this field is specified, clients must ensure that clusterIPs[0] and clusterIP have the same value.  This field may hold a maximum of two entries (dual-stack IPs, in either order). These IPs must correspond to the values of the ipFamilies field. Both clusterIPs and ipFamilies are governed by the ipFamilyPolicy field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   * @return clusterIPs
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ClusterIPs is a list of IP addresses assigned to this service, and are usually assigned randomly.  If an address is specified manually, is in-range (as per system configuration), and is not in use, it will be allocated to the service; otherwise creation of the service will fail. This field may not be changed through updates unless the type field is also being changed to ExternalName (which requires this field to be empty) or the type field is being changed from ExternalName (in which case this field may optionally be specified, as describe above).  Valid values are \"None\", empty string (\"\"), or a valid IP address.  Setting this to \"None\" makes a \"headless service\" (no virtual IP), which is useful when direct endpoint connections are preferred and proxying is not required.  Only applies to types ClusterIP, NodePort, and LoadBalancer. If this field is specified when creating a Service of type ExternalName, creation will fail. This field will be wiped when updating a Service to type ExternalName.  If this field is not specified, it will be initialized from the clusterIP field.  If this field is specified, clients must ensure that clusterIPs[0] and clusterIP have the same value.  This field may hold a maximum of two entries (dual-stack IPs, in either order). These IPs must correspond to the values of the ipFamilies field. Both clusterIPs and ipFamilies are governed by the ipFamilyPolicy field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")
  public List<String> getClusterIPs() {
    return clusterIPs;
  }

  public void setClusterIPs(@jakarta.annotation.Nullable List<String> clusterIPs) {
    this.clusterIPs = clusterIPs;
  }


  public V1ServiceSpec externalIPs(@jakarta.annotation.Nullable List<String> externalIPs) {
    this.externalIPs = externalIPs;
    return this;
  }

  public V1ServiceSpec addExternalIPsItem(String externalIPsItem) {
    if (this.externalIPs == null) {
      this.externalIPs = new ArrayList<>();
    }
    this.externalIPs.add(externalIPsItem);
    return this;
  }

  /**
   * externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.
   * @return externalIPs
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.")
  public List<String> getExternalIPs() {
    return externalIPs;
  }

  public void setExternalIPs(@jakarta.annotation.Nullable List<String> externalIPs) {
    this.externalIPs = externalIPs;
  }


  public V1ServiceSpec externalName(@jakarta.annotation.Nullable String externalName) {
    this.externalName = externalName;
    return this;
  }

  /**
   * externalName is the external reference that discovery mechanisms will return as an alias for this service (e.g. a DNS CNAME record). No proxying will be involved.  Must be a lowercase RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires &#x60;type&#x60; to be \&quot;ExternalName\&quot;.
   * @return externalName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "externalName is the external reference that discovery mechanisms will return as an alias for this service (e.g. a DNS CNAME record). No proxying will be involved.  Must be a lowercase RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires `type` to be \"ExternalName\".")
  public String getExternalName() {
    return externalName;
  }

  public void setExternalName(@jakarta.annotation.Nullable String externalName) {
    this.externalName = externalName;
  }


  public V1ServiceSpec externalTrafficPolicy(@jakarta.annotation.Nullable String externalTrafficPolicy) {
    this.externalTrafficPolicy = externalTrafficPolicy;
    return this;
  }

  /**
   * externalTrafficPolicy describes how nodes distribute service traffic they receive on one of the Service&#39;s \&quot;externally-facing\&quot; addresses (NodePorts, ExternalIPs, and LoadBalancer IPs). If set to \&quot;Local\&quot;, the proxy will configure the service in a way that assumes that external load balancers will take care of balancing the service traffic between nodes, and so each node will deliver traffic only to the node-local endpoints of the service, without masquerading the client source IP. (Traffic mistakenly sent to a node with no endpoints will be dropped.) The default value, \&quot;Cluster\&quot;, uses the standard behavior of routing to all endpoints evenly (possibly modified by topology and other features). Note that traffic sent to an External IP or LoadBalancer IP from within the cluster will always get \&quot;Cluster\&quot; semantics, but clients sending to a NodePort from within the cluster may need to take traffic policy into account when picking a node.
   * @return externalTrafficPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "externalTrafficPolicy describes how nodes distribute service traffic they receive on one of the Service's \"externally-facing\" addresses (NodePorts, ExternalIPs, and LoadBalancer IPs). If set to \"Local\", the proxy will configure the service in a way that assumes that external load balancers will take care of balancing the service traffic between nodes, and so each node will deliver traffic only to the node-local endpoints of the service, without masquerading the client source IP. (Traffic mistakenly sent to a node with no endpoints will be dropped.) The default value, \"Cluster\", uses the standard behavior of routing to all endpoints evenly (possibly modified by topology and other features). Note that traffic sent to an External IP or LoadBalancer IP from within the cluster will always get \"Cluster\" semantics, but clients sending to a NodePort from within the cluster may need to take traffic policy into account when picking a node.")
  public String getExternalTrafficPolicy() {
    return externalTrafficPolicy;
  }

  public void setExternalTrafficPolicy(@jakarta.annotation.Nullable String externalTrafficPolicy) {
    this.externalTrafficPolicy = externalTrafficPolicy;
  }


  public V1ServiceSpec healthCheckNodePort(@jakarta.annotation.Nullable Integer healthCheckNodePort) {
    this.healthCheckNodePort = healthCheckNodePort;
    return this;
  }

  /**
   * healthCheckNodePort specifies the healthcheck nodePort for the service. This only applies when type is set to LoadBalancer and externalTrafficPolicy is set to Local. If a value is specified, is in-range, and is not in use, it will be used.  If not specified, a value will be automatically allocated.  External systems (e.g. load-balancers) can use this port to determine if a given node holds endpoints for this service or not.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type). This field cannot be updated once set.
   * @return healthCheckNodePort
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "healthCheckNodePort specifies the healthcheck nodePort for the service. This only applies when type is set to LoadBalancer and externalTrafficPolicy is set to Local. If a value is specified, is in-range, and is not in use, it will be used.  If not specified, a value will be automatically allocated.  External systems (e.g. load-balancers) can use this port to determine if a given node holds endpoints for this service or not.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type). This field cannot be updated once set.")
  public Integer getHealthCheckNodePort() {
    return healthCheckNodePort;
  }

  public void setHealthCheckNodePort(@jakarta.annotation.Nullable Integer healthCheckNodePort) {
    this.healthCheckNodePort = healthCheckNodePort;
  }


  public V1ServiceSpec internalTrafficPolicy(@jakarta.annotation.Nullable String internalTrafficPolicy) {
    this.internalTrafficPolicy = internalTrafficPolicy;
    return this;
  }

  /**
   * InternalTrafficPolicy describes how nodes distribute service traffic they receive on the ClusterIP. If set to \&quot;Local\&quot;, the proxy will assume that pods only want to talk to endpoints of the service on the same node as the pod, dropping the traffic if there are no local endpoints. The default value, \&quot;Cluster\&quot;, uses the standard behavior of routing to all endpoints evenly (possibly modified by topology and other features).
   * @return internalTrafficPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "InternalTrafficPolicy describes how nodes distribute service traffic they receive on the ClusterIP. If set to \"Local\", the proxy will assume that pods only want to talk to endpoints of the service on the same node as the pod, dropping the traffic if there are no local endpoints. The default value, \"Cluster\", uses the standard behavior of routing to all endpoints evenly (possibly modified by topology and other features).")
  public String getInternalTrafficPolicy() {
    return internalTrafficPolicy;
  }

  public void setInternalTrafficPolicy(@jakarta.annotation.Nullable String internalTrafficPolicy) {
    this.internalTrafficPolicy = internalTrafficPolicy;
  }


  public V1ServiceSpec ipFamilies(@jakarta.annotation.Nullable List<String> ipFamilies) {
    this.ipFamilies = ipFamilies;
    return this;
  }

  public V1ServiceSpec addIpFamiliesItem(String ipFamiliesItem) {
    if (this.ipFamilies == null) {
      this.ipFamilies = new ArrayList<>();
    }
    this.ipFamilies.add(ipFamiliesItem);
    return this;
  }

  /**
   * IPFamilies is a list of IP families (e.g. IPv4, IPv6) assigned to this service. This field is usually assigned automatically based on cluster configuration and the ipFamilyPolicy field. If this field is specified manually, the requested family is available in the cluster, and ipFamilyPolicy allows it, it will be used; otherwise creation of the service will fail. This field is conditionally mutable: it allows for adding or removing a secondary IP family, but it does not allow changing the primary IP family of the Service. Valid values are \&quot;IPv4\&quot; and \&quot;IPv6\&quot;.  This field only applies to Services of types ClusterIP, NodePort, and LoadBalancer, and does apply to \&quot;headless\&quot; services. This field will be wiped when updating a Service to type ExternalName.  This field may hold a maximum of two entries (dual-stack families, in either order).  These families must correspond to the values of the clusterIPs field, if specified. Both clusterIPs and ipFamilies are governed by the ipFamilyPolicy field.
   * @return ipFamilies
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "IPFamilies is a list of IP families (e.g. IPv4, IPv6) assigned to this service. This field is usually assigned automatically based on cluster configuration and the ipFamilyPolicy field. If this field is specified manually, the requested family is available in the cluster, and ipFamilyPolicy allows it, it will be used; otherwise creation of the service will fail. This field is conditionally mutable: it allows for adding or removing a secondary IP family, but it does not allow changing the primary IP family of the Service. Valid values are \"IPv4\" and \"IPv6\".  This field only applies to Services of types ClusterIP, NodePort, and LoadBalancer, and does apply to \"headless\" services. This field will be wiped when updating a Service to type ExternalName.  This field may hold a maximum of two entries (dual-stack families, in either order).  These families must correspond to the values of the clusterIPs field, if specified. Both clusterIPs and ipFamilies are governed by the ipFamilyPolicy field.")
  public List<String> getIpFamilies() {
    return ipFamilies;
  }

  public void setIpFamilies(@jakarta.annotation.Nullable List<String> ipFamilies) {
    this.ipFamilies = ipFamilies;
  }


  public V1ServiceSpec ipFamilyPolicy(@jakarta.annotation.Nullable String ipFamilyPolicy) {
    this.ipFamilyPolicy = ipFamilyPolicy;
    return this;
  }

  /**
   * IPFamilyPolicy represents the dual-stack-ness requested or required by this Service. If there is no value provided, then this field will be set to SingleStack. Services can be \&quot;SingleStack\&quot; (a single IP family), \&quot;PreferDualStack\&quot; (two IP families on dual-stack configured clusters or a single IP family on single-stack clusters), or \&quot;RequireDualStack\&quot; (two IP families on dual-stack configured clusters, otherwise fail). The ipFamilies and clusterIPs fields depend on the value of this field. This field will be wiped when updating a service to type ExternalName.
   * @return ipFamilyPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "IPFamilyPolicy represents the dual-stack-ness requested or required by this Service. If there is no value provided, then this field will be set to SingleStack. Services can be \"SingleStack\" (a single IP family), \"PreferDualStack\" (two IP families on dual-stack configured clusters or a single IP family on single-stack clusters), or \"RequireDualStack\" (two IP families on dual-stack configured clusters, otherwise fail). The ipFamilies and clusterIPs fields depend on the value of this field. This field will be wiped when updating a service to type ExternalName.")
  public String getIpFamilyPolicy() {
    return ipFamilyPolicy;
  }

  public void setIpFamilyPolicy(@jakarta.annotation.Nullable String ipFamilyPolicy) {
    this.ipFamilyPolicy = ipFamilyPolicy;
  }


  public V1ServiceSpec loadBalancerClass(@jakarta.annotation.Nullable String loadBalancerClass) {
    this.loadBalancerClass = loadBalancerClass;
    return this;
  }

  /**
   * loadBalancerClass is the class of the load balancer implementation this Service belongs to. If specified, the value of this field must be a label-style identifier, with an optional prefix, e.g. \&quot;internal-vip\&quot; or \&quot;example.com/internal-vip\&quot;. Unprefixed names are reserved for end-users. This field can only be set when the Service type is &#39;LoadBalancer&#39;. If not set, the default load balancer implementation is used, today this is typically done through the cloud provider integration, but should apply for any default implementation. If set, it is assumed that a load balancer implementation is watching for Services with a matching class. Any default load balancer implementation (e.g. cloud providers) should ignore Services that set this field. This field can only be set when creating or updating a Service to type &#39;LoadBalancer&#39;. Once set, it can not be changed. This field will be wiped when a service is updated to a non &#39;LoadBalancer&#39; type.
   * @return loadBalancerClass
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "loadBalancerClass is the class of the load balancer implementation this Service belongs to. If specified, the value of this field must be a label-style identifier, with an optional prefix, e.g. \"internal-vip\" or \"example.com/internal-vip\". Unprefixed names are reserved for end-users. This field can only be set when the Service type is 'LoadBalancer'. If not set, the default load balancer implementation is used, today this is typically done through the cloud provider integration, but should apply for any default implementation. If set, it is assumed that a load balancer implementation is watching for Services with a matching class. Any default load balancer implementation (e.g. cloud providers) should ignore Services that set this field. This field can only be set when creating or updating a Service to type 'LoadBalancer'. Once set, it can not be changed. This field will be wiped when a service is updated to a non 'LoadBalancer' type.")
  public String getLoadBalancerClass() {
    return loadBalancerClass;
  }

  public void setLoadBalancerClass(@jakarta.annotation.Nullable String loadBalancerClass) {
    this.loadBalancerClass = loadBalancerClass;
  }


  public V1ServiceSpec loadBalancerIP(@jakarta.annotation.Nullable String loadBalancerIP) {
    this.loadBalancerIP = loadBalancerIP;
    return this;
  }

  /**
   * Only applies to Service Type: LoadBalancer. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature. Deprecated: This field was under-specified and its meaning varies across implementations. Using it is non-portable and it may not support dual-stack. Users are encouraged to use implementation-specific annotations when available.
   * @return loadBalancerIP
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Only applies to Service Type: LoadBalancer. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature. Deprecated: This field was under-specified and its meaning varies across implementations. Using it is non-portable and it may not support dual-stack. Users are encouraged to use implementation-specific annotations when available.")
  public String getLoadBalancerIP() {
    return loadBalancerIP;
  }

  public void setLoadBalancerIP(@jakarta.annotation.Nullable String loadBalancerIP) {
    this.loadBalancerIP = loadBalancerIP;
  }


  public V1ServiceSpec loadBalancerSourceRanges(@jakarta.annotation.Nullable List<String> loadBalancerSourceRanges) {
    this.loadBalancerSourceRanges = loadBalancerSourceRanges;
    return this;
  }

  public V1ServiceSpec addLoadBalancerSourceRangesItem(String loadBalancerSourceRangesItem) {
    if (this.loadBalancerSourceRanges == null) {
      this.loadBalancerSourceRanges = new ArrayList<>();
    }
    this.loadBalancerSourceRanges.add(loadBalancerSourceRangesItem);
    return this;
  }

  /**
   * If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature.\&quot; More info: https://kubernetes.io/docs/tasks/access-application-cluster/create-external-load-balancer/
   * @return loadBalancerSourceRanges
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature.\" More info: https://kubernetes.io/docs/tasks/access-application-cluster/create-external-load-balancer/")
  public List<String> getLoadBalancerSourceRanges() {
    return loadBalancerSourceRanges;
  }

  public void setLoadBalancerSourceRanges(@jakarta.annotation.Nullable List<String> loadBalancerSourceRanges) {
    this.loadBalancerSourceRanges = loadBalancerSourceRanges;
  }


  public V1ServiceSpec ports(@jakarta.annotation.Nullable List<V1ServicePort> ports) {
    this.ports = ports;
    return this;
  }

  public V1ServiceSpec addPortsItem(V1ServicePort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * The list of ports that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   * @return ports
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The list of ports that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")
  public List<V1ServicePort> getPorts() {
    return ports;
  }

  public void setPorts(@jakarta.annotation.Nullable List<V1ServicePort> ports) {
    this.ports = ports;
  }


  public V1ServiceSpec publishNotReadyAddresses(@jakarta.annotation.Nullable Boolean publishNotReadyAddresses) {
    this.publishNotReadyAddresses = publishNotReadyAddresses;
    return this;
  }

  /**
   * publishNotReadyAddresses indicates that any agent which deals with endpoints for this Service should disregard any indications of ready/not-ready. The primary use case for setting this field is for a StatefulSet&#39;s Headless Service to propagate SRV DNS records for its Pods for the purpose of peer discovery. The Kubernetes controllers that generate Endpoints and EndpointSlice resources for Services interpret this to mean that all endpoints are considered \&quot;ready\&quot; even if the Pods themselves are not. Agents which consume only Kubernetes generated endpoints through the Endpoints or EndpointSlice resources can safely assume this behavior.
   * @return publishNotReadyAddresses
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "publishNotReadyAddresses indicates that any agent which deals with endpoints for this Service should disregard any indications of ready/not-ready. The primary use case for setting this field is for a StatefulSet's Headless Service to propagate SRV DNS records for its Pods for the purpose of peer discovery. The Kubernetes controllers that generate Endpoints and EndpointSlice resources for Services interpret this to mean that all endpoints are considered \"ready\" even if the Pods themselves are not. Agents which consume only Kubernetes generated endpoints through the Endpoints or EndpointSlice resources can safely assume this behavior.")
  public Boolean getPublishNotReadyAddresses() {
    return publishNotReadyAddresses;
  }

  public void setPublishNotReadyAddresses(@jakarta.annotation.Nullable Boolean publishNotReadyAddresses) {
    this.publishNotReadyAddresses = publishNotReadyAddresses;
  }


  public V1ServiceSpec selector(@jakarta.annotation.Nullable Map<String, String> selector) {
    this.selector = selector;
    return this;
  }

  public V1ServiceSpec putSelectorItem(String key, String selectorItem) {
    if (this.selector == null) {
      this.selector = new HashMap<>();
    }
    this.selector.put(key, selectorItem);
    return this;
  }

  /**
   * Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
   * @return selector
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/")
  public Map<String, String> getSelector() {
    return selector;
  }

  public void setSelector(@jakarta.annotation.Nullable Map<String, String> selector) {
    this.selector = selector;
  }


  public V1ServiceSpec sessionAffinity(@jakarta.annotation.Nullable String sessionAffinity) {
    this.sessionAffinity = sessionAffinity;
    return this;
  }

  /**
   * Supports \&quot;ClientIP\&quot; and \&quot;None\&quot;. Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   * @return sessionAffinity
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Supports \"ClientIP\" and \"None\". Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")
  public String getSessionAffinity() {
    return sessionAffinity;
  }

  public void setSessionAffinity(@jakarta.annotation.Nullable String sessionAffinity) {
    this.sessionAffinity = sessionAffinity;
  }


  public V1ServiceSpec sessionAffinityConfig(@jakarta.annotation.Nullable V1SessionAffinityConfig sessionAffinityConfig) {
    this.sessionAffinityConfig = sessionAffinityConfig;
    return this;
  }

  /**
   * Get sessionAffinityConfig
   * @return sessionAffinityConfig
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1SessionAffinityConfig getSessionAffinityConfig() {
    return sessionAffinityConfig;
  }

  public void setSessionAffinityConfig(@jakarta.annotation.Nullable V1SessionAffinityConfig sessionAffinityConfig) {
    this.sessionAffinityConfig = sessionAffinityConfig;
  }


  public V1ServiceSpec trafficDistribution(@jakarta.annotation.Nullable String trafficDistribution) {
    this.trafficDistribution = trafficDistribution;
    return this;
  }

  /**
   * TrafficDistribution offers a way to express preferences for how traffic is distributed to Service endpoints. Implementations can use this field as a hint, but are not required to guarantee strict adherence. If the field is not set, the implementation will apply its default routing strategy. If set to \&quot;PreferClose\&quot;, implementations should prioritize endpoints that are in the same zone.
   * @return trafficDistribution
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "TrafficDistribution offers a way to express preferences for how traffic is distributed to Service endpoints. Implementations can use this field as a hint, but are not required to guarantee strict adherence. If the field is not set, the implementation will apply its default routing strategy. If set to \"PreferClose\", implementations should prioritize endpoints that are in the same zone.")
  public String getTrafficDistribution() {
    return trafficDistribution;
  }

  public void setTrafficDistribution(@jakarta.annotation.Nullable String trafficDistribution) {
    this.trafficDistribution = trafficDistribution;
  }


  public V1ServiceSpec type(@jakarta.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. \&quot;ClusterIP\&quot; allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object or EndpointSlice objects. If clusterIP is \&quot;None\&quot;, no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a virtual IP. \&quot;NodePort\&quot; builds on ClusterIP and allocates a port on every node which routes to the same endpoints as the clusterIP. \&quot;LoadBalancer\&quot; builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the same endpoints as the clusterIP. \&quot;ExternalName\&quot; aliases this service to the specified externalName. Several other fields do not apply to ExternalName services. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
   * @return type
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. \"ClusterIP\" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object or EndpointSlice objects. If clusterIP is \"None\", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a virtual IP. \"NodePort\" builds on ClusterIP and allocates a port on every node which routes to the same endpoints as the clusterIP. \"LoadBalancer\" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the same endpoints as the clusterIP. \"ExternalName\" aliases this service to the specified externalName. Several other fields do not apply to ExternalName services. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types")
  public String getType() {
    return type;
  }

  public void setType(@jakarta.annotation.Nullable String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ServiceSpec v1ServiceSpec = (V1ServiceSpec) o;
    return Objects.equals(this.allocateLoadBalancerNodePorts, v1ServiceSpec.allocateLoadBalancerNodePorts) &&
        Objects.equals(this.clusterIP, v1ServiceSpec.clusterIP) &&
        Objects.equals(this.clusterIPs, v1ServiceSpec.clusterIPs) &&
        Objects.equals(this.externalIPs, v1ServiceSpec.externalIPs) &&
        Objects.equals(this.externalName, v1ServiceSpec.externalName) &&
        Objects.equals(this.externalTrafficPolicy, v1ServiceSpec.externalTrafficPolicy) &&
        Objects.equals(this.healthCheckNodePort, v1ServiceSpec.healthCheckNodePort) &&
        Objects.equals(this.internalTrafficPolicy, v1ServiceSpec.internalTrafficPolicy) &&
        Objects.equals(this.ipFamilies, v1ServiceSpec.ipFamilies) &&
        Objects.equals(this.ipFamilyPolicy, v1ServiceSpec.ipFamilyPolicy) &&
        Objects.equals(this.loadBalancerClass, v1ServiceSpec.loadBalancerClass) &&
        Objects.equals(this.loadBalancerIP, v1ServiceSpec.loadBalancerIP) &&
        Objects.equals(this.loadBalancerSourceRanges, v1ServiceSpec.loadBalancerSourceRanges) &&
        Objects.equals(this.ports, v1ServiceSpec.ports) &&
        Objects.equals(this.publishNotReadyAddresses, v1ServiceSpec.publishNotReadyAddresses) &&
        Objects.equals(this.selector, v1ServiceSpec.selector) &&
        Objects.equals(this.sessionAffinity, v1ServiceSpec.sessionAffinity) &&
        Objects.equals(this.sessionAffinityConfig, v1ServiceSpec.sessionAffinityConfig) &&
        Objects.equals(this.trafficDistribution, v1ServiceSpec.trafficDistribution) &&
        Objects.equals(this.type, v1ServiceSpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocateLoadBalancerNodePorts, clusterIP, clusterIPs, externalIPs, externalName, externalTrafficPolicy, healthCheckNodePort, internalTrafficPolicy, ipFamilies, ipFamilyPolicy, loadBalancerClass, loadBalancerIP, loadBalancerSourceRanges, ports, publishNotReadyAddresses, selector, sessionAffinity, sessionAffinityConfig, trafficDistribution, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceSpec {\n");
    sb.append("    allocateLoadBalancerNodePorts: ").append(toIndentedString(allocateLoadBalancerNodePorts)).append("\n");
    sb.append("    clusterIP: ").append(toIndentedString(clusterIP)).append("\n");
    sb.append("    clusterIPs: ").append(toIndentedString(clusterIPs)).append("\n");
    sb.append("    externalIPs: ").append(toIndentedString(externalIPs)).append("\n");
    sb.append("    externalName: ").append(toIndentedString(externalName)).append("\n");
    sb.append("    externalTrafficPolicy: ").append(toIndentedString(externalTrafficPolicy)).append("\n");
    sb.append("    healthCheckNodePort: ").append(toIndentedString(healthCheckNodePort)).append("\n");
    sb.append("    internalTrafficPolicy: ").append(toIndentedString(internalTrafficPolicy)).append("\n");
    sb.append("    ipFamilies: ").append(toIndentedString(ipFamilies)).append("\n");
    sb.append("    ipFamilyPolicy: ").append(toIndentedString(ipFamilyPolicy)).append("\n");
    sb.append("    loadBalancerClass: ").append(toIndentedString(loadBalancerClass)).append("\n");
    sb.append("    loadBalancerIP: ").append(toIndentedString(loadBalancerIP)).append("\n");
    sb.append("    loadBalancerSourceRanges: ").append(toIndentedString(loadBalancerSourceRanges)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    publishNotReadyAddresses: ").append(toIndentedString(publishNotReadyAddresses)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    sessionAffinity: ").append(toIndentedString(sessionAffinity)).append("\n");
    sb.append("    sessionAffinityConfig: ").append(toIndentedString(sessionAffinityConfig)).append("\n");
    sb.append("    trafficDistribution: ").append(toIndentedString(trafficDistribution)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("allocateLoadBalancerNodePorts");
    openapiFields.add("clusterIP");
    openapiFields.add("clusterIPs");
    openapiFields.add("externalIPs");
    openapiFields.add("externalName");
    openapiFields.add("externalTrafficPolicy");
    openapiFields.add("healthCheckNodePort");
    openapiFields.add("internalTrafficPolicy");
    openapiFields.add("ipFamilies");
    openapiFields.add("ipFamilyPolicy");
    openapiFields.add("loadBalancerClass");
    openapiFields.add("loadBalancerIP");
    openapiFields.add("loadBalancerSourceRanges");
    openapiFields.add("ports");
    openapiFields.add("publishNotReadyAddresses");
    openapiFields.add("selector");
    openapiFields.add("sessionAffinity");
    openapiFields.add("sessionAffinityConfig");
    openapiFields.add("trafficDistribution");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ServiceSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ServiceSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ServiceSpec is not found in the empty JSON string", V1ServiceSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ServiceSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ServiceSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("clusterIP") != null && !jsonObj.get("clusterIP").isJsonNull()) && !jsonObj.get("clusterIP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clusterIP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clusterIP").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("clusterIPs") != null && !jsonObj.get("clusterIPs").isJsonNull() && !jsonObj.get("clusterIPs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `clusterIPs` to be an array in the JSON string but got `%s`", jsonObj.get("clusterIPs").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("externalIPs") != null && !jsonObj.get("externalIPs").isJsonNull() && !jsonObj.get("externalIPs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalIPs` to be an array in the JSON string but got `%s`", jsonObj.get("externalIPs").toString()));
      }
      if ((jsonObj.get("externalName") != null && !jsonObj.get("externalName").isJsonNull()) && !jsonObj.get("externalName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalName").toString()));
      }
      if ((jsonObj.get("externalTrafficPolicy") != null && !jsonObj.get("externalTrafficPolicy").isJsonNull()) && !jsonObj.get("externalTrafficPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalTrafficPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalTrafficPolicy").toString()));
      }
      if ((jsonObj.get("internalTrafficPolicy") != null && !jsonObj.get("internalTrafficPolicy").isJsonNull()) && !jsonObj.get("internalTrafficPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `internalTrafficPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("internalTrafficPolicy").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ipFamilies") != null && !jsonObj.get("ipFamilies").isJsonNull() && !jsonObj.get("ipFamilies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipFamilies` to be an array in the JSON string but got `%s`", jsonObj.get("ipFamilies").toString()));
      }
      if ((jsonObj.get("ipFamilyPolicy") != null && !jsonObj.get("ipFamilyPolicy").isJsonNull()) && !jsonObj.get("ipFamilyPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipFamilyPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipFamilyPolicy").toString()));
      }
      if ((jsonObj.get("loadBalancerClass") != null && !jsonObj.get("loadBalancerClass").isJsonNull()) && !jsonObj.get("loadBalancerClass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loadBalancerClass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loadBalancerClass").toString()));
      }
      if ((jsonObj.get("loadBalancerIP") != null && !jsonObj.get("loadBalancerIP").isJsonNull()) && !jsonObj.get("loadBalancerIP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loadBalancerIP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loadBalancerIP").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("loadBalancerSourceRanges") != null && !jsonObj.get("loadBalancerSourceRanges").isJsonNull() && !jsonObj.get("loadBalancerSourceRanges").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `loadBalancerSourceRanges` to be an array in the JSON string but got `%s`", jsonObj.get("loadBalancerSourceRanges").toString()));
      }
      if (jsonObj.get("ports") != null && !jsonObj.get("ports").isJsonNull()) {
        JsonArray jsonArrayports = jsonObj.getAsJsonArray("ports");
        if (jsonArrayports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ports` to be an array in the JSON string but got `%s`", jsonObj.get("ports").toString()));
          }

          // validate the optional field `ports` (array)
          for (int i = 0; i < jsonArrayports.size(); i++) {
            V1ServicePort.validateJsonElement(jsonArrayports.get(i));
          };
        }
      }
      if ((jsonObj.get("sessionAffinity") != null && !jsonObj.get("sessionAffinity").isJsonNull()) && !jsonObj.get("sessionAffinity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sessionAffinity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sessionAffinity").toString()));
      }
      // validate the optional field `sessionAffinityConfig`
      if (jsonObj.get("sessionAffinityConfig") != null && !jsonObj.get("sessionAffinityConfig").isJsonNull()) {
        V1SessionAffinityConfig.validateJsonElement(jsonObj.get("sessionAffinityConfig"));
      }
      if ((jsonObj.get("trafficDistribution") != null && !jsonObj.get("trafficDistribution").isJsonNull()) && !jsonObj.get("trafficDistribution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trafficDistribution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trafficDistribution").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ServiceSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ServiceSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ServiceSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ServiceSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ServiceSpec>() {
           @Override
           public void write(JsonWriter out, V1ServiceSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ServiceSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ServiceSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ServiceSpec
   * @throws IOException if the JSON string is invalid with respect to V1ServiceSpec
   */
  public static V1ServiceSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ServiceSpec.class);
  }

  /**
   * Convert an instance of V1ServiceSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
