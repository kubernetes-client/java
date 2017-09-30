
# V1AzureFilePersistentVolumeSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**readOnly** | **Boolean** | Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. |  [optional]
**secretName** | **String** | the name of secret that contains Azure Storage Account Name and Key | 
**secretNamespace** | **String** | the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod |  [optional]
**shareName** | **String** | Share Name | 



