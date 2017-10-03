
# V1beta1IPBlock

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cidr** | **String** | CIDR is a string representing the IP Block Valid examples are \&quot;192.168.1.1/24\&quot; | 
**except** | **List&lt;String&gt;** | Except is a slice of CIDRs that should not be included within an IP Block Valid examples are \&quot;192.168.1.1/24\&quot; Except values will be rejected if they are outside the CIDR range |  [optional]



