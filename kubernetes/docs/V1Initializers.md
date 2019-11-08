

# V1Initializers

Initializers tracks the progress of initialization.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pending** | [**List&lt;V1Initializer&gt;**](V1Initializer.md) | Pending is a list of initializers that must execute in order before this object is visible. When the last pending initializer is removed, and no failing result is set, the initializers struct will be set to nil and the object is considered as initialized and visible to all clients. | 
**result** | [**V1Status**](V1Status.md) |  |  [optional]



