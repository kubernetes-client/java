

# V1alpha1ServerStorageVersion

An API server instance reports the version it can decode and the version it encodes objects to when persisting objects in the backend.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiServerID** | **String** | The ID of the reporting API server. |  [optional] |
|**decodableVersions** | **List&lt;String&gt;** | The API server can decode objects encoded in these versions. The encodingVersion must be included in the decodableVersions. |  [optional] |
|**encodingVersion** | **String** | The API server encodes the object to this version when persisting it in the backend (e.g., etcd). |  [optional] |
|**servedVersions** | **List&lt;String&gt;** | The API server can serve these versions. DecodableVersions must include all ServedVersions. |  [optional] |



