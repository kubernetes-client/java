

# V1IngressLoadBalancerIngress

IngressLoadBalancerIngress represents the status of a load-balancer ingress point.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hostname** | **String** | hostname is set for load-balancer ingress points that are DNS based. |  [optional] |
|**ip** | **String** | ip is set for load-balancer ingress points that are IP based. |  [optional] |
|**ports** | [**List&lt;V1IngressPortStatus&gt;**](V1IngressPortStatus.md) | ports provides information about the ports exposed by this LoadBalancer. |  [optional] |



