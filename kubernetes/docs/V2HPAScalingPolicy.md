

# V2HPAScalingPolicy

HPAScalingPolicy is a single policy which must hold true for a specified past interval.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodSeconds** | **Integer** | PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min). | 
**type** | **String** | Type is used to specify the scaling policy. | 
**value** | **Integer** | Value contains the amount of change which is permitted by the policy. It must be greater than zero | 



