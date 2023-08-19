

# V1DaemonSetUpdateStrategy

DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rollingUpdate** | [**V1RollingUpdateDaemonSet**](V1RollingUpdateDaemonSet.md) |  |  [optional] |
|**type** | **String** | Type of daemon set update. Can be \&quot;RollingUpdate\&quot; or \&quot;OnDelete\&quot;. Default is RollingUpdate. |  [optional] |



