

# V1WindowsSecurityContextOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gmsaCredentialSpec** | **String** | GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag. |  [optional]
**gmsaCredentialSpecName** | **String** | GMSACredentialSpecName is the name of the GMSA credential spec to use. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag. |  [optional]



