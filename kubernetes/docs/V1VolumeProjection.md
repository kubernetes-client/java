

# V1VolumeProjection

Projection that may be projected along with other supported volume types. Exactly one of these fields must be set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clusterTrustBundle** | [**V1ClusterTrustBundleProjection**](V1ClusterTrustBundleProjection.md) |  |  [optional] |
|**configMap** | [**V1ConfigMapProjection**](V1ConfigMapProjection.md) |  |  [optional] |
|**downwardAPI** | [**V1DownwardAPIProjection**](V1DownwardAPIProjection.md) |  |  [optional] |
|**podCertificate** | [**V1PodCertificateProjection**](V1PodCertificateProjection.md) |  |  [optional] |
|**secret** | [**V1SecretProjection**](V1SecretProjection.md) |  |  [optional] |
|**serviceAccountToken** | [**V1ServiceAccountTokenProjection**](V1ServiceAccountTokenProjection.md) |  |  [optional] |



