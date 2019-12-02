

# V1LoadBalancerIngress

LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hostname** | **String** | Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers) |  [optional]
**ip** | **String** | IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers) |  [optional]



