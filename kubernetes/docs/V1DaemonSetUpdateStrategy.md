

# V1DaemonSetUpdateStrategy

DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rollingUpdate** | [**V1RollingUpdateDaemonSet**](V1RollingUpdateDaemonSet.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of daemon set update. Can be \&quot;RollingUpdate\&quot; or \&quot;OnDelete\&quot;. Default is RollingUpdate.  Possible enum values:  - &#x60;\&quot;OnDelete\&quot;&#x60; Replace the old daemons only when it&#39;s killed  - &#x60;\&quot;RollingUpdate\&quot;&#x60; Replace the old daemons by new ones using rolling update i.e replace them on each node one after the other. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
ONDELETE | &quot;OnDelete&quot;
ROLLINGUPDATE | &quot;RollingUpdate&quot;



