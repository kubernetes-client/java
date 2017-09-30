
# V1beta1CronJobSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**concurrencyPolicy** | **String** | Specifies how to treat concurrent executions of a Job. Defaults to Allow. |  [optional]
**failedJobsHistoryLimit** | **Integer** | The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1. |  [optional]
**jobTemplate** | [**V1beta1JobTemplateSpec**](V1beta1JobTemplateSpec.md) | Specifies the job that will be created when executing a CronJob. | 
**schedule** | **String** | The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron. | 
**startingDeadlineSeconds** | **Long** | Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones. |  [optional]
**successfulJobsHistoryLimit** | **Integer** | The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3. |  [optional]
**suspend** | **Boolean** | This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false. |  [optional]



