

# V2HPAScalingPolicy

HPAScalingPolicy is a single policy which must hold true for a specified past interval.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**periodSeconds** | **Integer** | periodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min). |  |
|**type** | **String** | type is used to specify the scaling policy. |  |
|**value** | **Integer** | value contains the amount of change which is permitted by the policy. It must be greater than zero |  |



