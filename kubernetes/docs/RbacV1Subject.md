

# RbacV1Subject

Subject contains a reference to the object or user identities a role binding applies to.  This can either hold a direct API object reference, or a value for non-objects such as user and group names.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiGroup** | **String** | APIGroup holds the API group of the referenced subject. Defaults to \&quot;\&quot; for ServiceAccount subjects. Defaults to \&quot;rbac.authorization.k8s.io\&quot; for User and Group subjects. |  [optional] |
|**kind** | **String** | Kind of object being referenced. Values defined by this API group are \&quot;User\&quot;, \&quot;Group\&quot;, and \&quot;ServiceAccount\&quot;. If the Authorizer does not recognized the kind value, the Authorizer should report an error. |  |
|**name** | **String** | Name of the object being referenced. |  |
|**namespace** | **String** | Namespace of the referenced object.  If the object kind is non-namespace, such as \&quot;User\&quot; or \&quot;Group\&quot;, and this value is not empty the Authorizer should report an error. |  [optional] |



