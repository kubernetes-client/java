

# V1UserInfo

UserInfo holds the information about the user needed to implement the user.Info interface.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extra** | **Map&lt;String, List&lt;String&gt;&gt;** | Any additional information provided by the authenticator. |  [optional] |
|**groups** | **List&lt;String&gt;** | The names of groups this user is a part of. |  [optional] |
|**uid** | **String** | A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs. |  [optional] |
|**username** | **String** | The name that uniquely identifies this user among all active users. |  [optional] |



