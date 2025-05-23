

# V1VolumeError

VolumeError captures an error encountered during a volume operation.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errorCode** | **Integer** | errorCode is a numeric gRPC code representing the error encountered during Attach or Detach operations.  This is an optional, alpha field that requires the MutableCSINodeAllocatableCount feature gate being enabled to be set. |  [optional]
**message** | **String** | message represents the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information. |  [optional]
**time** | [**OffsetDateTime**](OffsetDateTime.md) | time represents the time the error was encountered. |  [optional]



