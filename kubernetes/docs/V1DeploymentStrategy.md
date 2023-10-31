

# V1DeploymentStrategy

DeploymentStrategy describes how to replace existing pods with new ones.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rollingUpdate** | [**V1RollingUpdateDeployment**](V1RollingUpdateDeployment.md) |  |  [optional] |
|**type** | **String** | Type of deployment. Can be \&quot;Recreate\&quot; or \&quot;RollingUpdate\&quot;. Default is RollingUpdate. |  [optional] |



