

# V1WindowsSecurityContextOptions

WindowsSecurityContextOptions contain Windows-specific options and credentials.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gmsaCredentialSpec** | **String** | GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. |  [optional]
**gmsaCredentialSpecName** | **String** | GMSACredentialSpecName is the name of the GMSA credential spec to use. |  [optional]
**runAsUserName** | **String** | The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. |  [optional]



