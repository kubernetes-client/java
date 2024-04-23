

# V1alpha1StorageVersionMigrationStatus

Status of the storage version migration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conditions** | [**List&lt;V1alpha1MigrationCondition&gt;**](V1alpha1MigrationCondition.md) | The latest available observations of the migration&#39;s current state. |  [optional] |
|**resourceVersion** | **String** | ResourceVersion to compare with the GC cache for performing the migration. This is the current resource version of given group, version and resource when kube-controller-manager first observes this StorageVersionMigration resource. |  [optional] |



