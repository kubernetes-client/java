

# V1alpha1StorageVersionStatus

API server instances report the versions they can decode and the version they encode objects to when persisting objects in the backend.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**commonEncodingVersion** | **String** | commonEncodingVersion is set to an encoding storage version if all API server instances share that same version. If they don&#39;t share one storage version, this field is left empty. API servers should finish updating its storageVersionStatus entry before serving write operations, so that this field will be in sync with the reality. |  [optional] |
|**conditions** | [**List&lt;V1alpha1StorageVersionCondition&gt;**](V1alpha1StorageVersionCondition.md) | conditions lists the latest available observations of the storageVersion&#39;s state. |  [optional] |
|**storageVersions** | [**List&lt;V1alpha1ServerStorageVersion&gt;**](V1alpha1ServerStorageVersion.md) | storageVersions lists the reported versions per API server instance. |  [optional] |



