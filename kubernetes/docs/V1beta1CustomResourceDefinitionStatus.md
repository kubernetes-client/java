
# V1beta1CustomResourceDefinitionStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptedNames** | [**V1beta1CustomResourceDefinitionNames**](V1beta1CustomResourceDefinitionNames.md) | AcceptedNames are the names that are actually being used to serve discovery They may be different than the names in spec. | 
**conditions** | [**List&lt;V1beta1CustomResourceDefinitionCondition&gt;**](V1beta1CustomResourceDefinitionCondition.md) | Conditions indicate state for particular aspects of a CustomResourceDefinition | 
**storedVersions** | **List&lt;String&gt;** | StoredVersions are all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so the migration controller can first finish a migration to another version (i.e. that no old objects are left in the storage), and then remove the rest of the versions from this list. None of the versions in this list can be removed from the spec.Versions field. | 



