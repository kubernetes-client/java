

# V1alpha1ServiceCIDRSpec

ServiceCIDRSpec define the CIDRs the user wants to use for allocating ClusterIPs for Services.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cidrs** | **List&lt;String&gt;** | CIDRs defines the IP blocks in CIDR notation (e.g. \&quot;192.168.0.0/24\&quot; or \&quot;2001:db8::/64\&quot;) from which to assign service cluster IPs. Max of two CIDRs is allowed, one of each IP family. This field is immutable. |  [optional] |



