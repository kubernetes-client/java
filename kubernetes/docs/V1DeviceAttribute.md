

# V1DeviceAttribute

DeviceAttribute must have exactly one field set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bool** | **Boolean** | BoolValue is a true/false value. |  [optional] |
|**bools** | **List&lt;Boolean&gt;** | BoolValues is a non-empty list of true/false values. |  [optional] |
|**_int** | **Long** | IntValue is a number. |  [optional] |
|**ints** | **List&lt;Long&gt;** | IntValues is a non-empty list of numbers.  This is an alpha field and requires enabling the DRAListTypeAttributes feature gate. |  [optional] |
|**string** | **String** | StringValue is a string. Must not be longer than 64 characters. |  [optional] |
|**strings** | **List&lt;String&gt;** | StringValues is a non-empty list of strings. Each string must not be longer than 64 characters.  This is an alpha field and requires enabling the DRAListTypeAttributes feature gate. |  [optional] |
|**version** | **String** | VersionValue is a semantic version according to semver.org spec 2.0.0. Must not be longer than 64 characters. |  [optional] |
|**versions** | **List&lt;String&gt;** | VersionValues is a non-empty list of semantic versions according to semver.org spec 2.0.0. Each version string must not be longer than 64 characters.  This is an alpha field and requires enabling the DRAListTypeAttributes feature gate. |  [optional] |



