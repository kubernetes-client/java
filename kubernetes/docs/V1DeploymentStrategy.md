

# V1DeploymentStrategy

DeploymentStrategy describes how to replace existing pods with new ones.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rollingUpdate** | [**V1RollingUpdateDeployment**](V1RollingUpdateDeployment.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of deployment. Can be \&quot;Recreate\&quot; or \&quot;RollingUpdate\&quot;. Default is RollingUpdate.  Possible enum values:  - &#x60;\&quot;Recreate\&quot;&#x60; Kill all existing pods before creating new ones.  - &#x60;\&quot;RollingUpdate\&quot;&#x60; Replace the old ReplicaSets by new one using rolling update i.e gradually scale down the old ReplicaSets and scale up the new one. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
RECREATE | &quot;Recreate&quot;
ROLLINGUPDATE | &quot;RollingUpdate&quot;



