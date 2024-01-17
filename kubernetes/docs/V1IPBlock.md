

# V1IPBlock

IPBlock describes a particular CIDR (Ex. \"192.168.1.0/24\",\"2001:db8::/64\") that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should not be included within this rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cidr** | **String** | cidr is a string representing the IPBlock Valid examples are \&quot;192.168.1.0/24\&quot; or \&quot;2001:db8::/64\&quot; |  |
|**except** | **List&lt;String&gt;** | except is a slice of CIDRs that should not be included within an IPBlock Valid examples are \&quot;192.168.1.0/24\&quot; or \&quot;2001:db8::/64\&quot; Except values will be rejected if they are outside the cidr range |  [optional] |



