

# V1DeviceAllocationConfiguration

DeviceAllocationConfiguration gets embedded in an AllocationResult.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**opaque** | [**V1OpaqueDeviceConfiguration**](V1OpaqueDeviceConfiguration.md) |  |  [optional] |
|**requests** | **List&lt;String&gt;** | Requests lists the names of requests where the configuration applies. If empty, its applies to all requests.  References to subrequests must include the name of the main request and may include the subrequest using the format &lt;main request&gt;[/&lt;subrequest&gt;]. If just the main request is given, the configuration applies to all subrequests. |  [optional] |
|**source** | **String** | Source records whether the configuration comes from a class and thus is not something that a normal user would have been able to set or from a claim. |  |



