

# V1beta2StatefulSetUpdateStrategy

StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rollingUpdate** | [**V1beta2RollingUpdateStatefulSetStrategy**](V1beta2RollingUpdateStatefulSetStrategy.md) |  |  [optional]
**type** | **String** | Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate. |  [optional]



