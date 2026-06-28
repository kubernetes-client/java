

# V1alpha1ServerStorageVersion

An API server instance reports the version it can decode and the version it encodes objects to when persisting objects in the backend.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiServerID** | **String** | apiServerID is the ID of the reporting API server. |  |
|**decodableVersions** | **List&lt;String&gt;** | decodableVersions are the encoding versions the API server can handle to decode. The API server can decode objects encoded in these versions. The encodingVersion must be included in the decodableVersions. |  |
|**encodingVersion** | **String** | encodingVersion the API server encodes the object to when persisting it in the backend (e.g., etcd). |  |
|**servedVersions** | **List&lt;String&gt;** | servedVersions lists all versions the API server can serve. DecodableVersions must include all ServedVersions. |  [optional] |



