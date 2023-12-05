

# V1LoadBalancerIngress

LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hostname** | **String** | Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers) |  [optional]
**ip** | **String** | IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers) |  [optional]
**ports** | [**List&lt;V1PortStatus&gt;**](V1PortStatus.md) | Ports is a list of records of service ports If used, every port defined in the service should have an entry in it |  [optional]



