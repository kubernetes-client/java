
# V1CephFSVolumeSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**monitors** | **List&lt;String&gt;** | Required: Monitors is a collection of Ceph monitors More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it | 
**path** | **String** | Optional: Used as the mounted root, rather than the full Ceph tree, default is / |  [optional]
**readOnly** | **Boolean** | Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it |  [optional]
**secretFile** | **String** | Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it |  [optional]
**secretRef** | [**V1LocalObjectReference**](V1LocalObjectReference.md) | Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it |  [optional]
**user** | **String** | Optional: User is the rados user name, default is admin More info: http://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it |  [optional]



