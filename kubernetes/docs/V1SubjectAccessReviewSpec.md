

# V1SubjectAccessReviewSpec

SubjectAccessReviewSpec is a description of the access request.  Exactly one of resourceAttributes and nonResourceAttributes must be set

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extra** | **Map&lt;String, List&lt;String&gt;&gt;** | extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here. |  [optional] |
|**groups** | **List&lt;String&gt;** | groups is the groups you&#39;re testing for. |  [optional] |
|**nonResourceAttributes** | [**V1NonResourceAttributes**](V1NonResourceAttributes.md) |  |  [optional] |
|**resourceAttributes** | [**V1ResourceAttributes**](V1ResourceAttributes.md) |  |  [optional] |
|**uid** | **String** | uid information about the requesting user. |  [optional] |
|**user** | **String** | user is the user you&#39;re testing for. If you specify \&quot;User\&quot; but not \&quot;Groups\&quot;, then is it interpreted as \&quot;What if User were not a member of any groups |  [optional] |



