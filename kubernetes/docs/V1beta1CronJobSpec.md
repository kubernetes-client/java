
# V1beta1CronJobSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**concurrencyPolicy** | **String** | Specifies how to treat concurrent executions of a Job. Valid values are: - \&quot;Allow\&quot; (default): allows CronJobs to run concurrently; - \&quot;Forbid\&quot;: forbids concurrent runs, skipping next run if previous run hasn&#39;t finished yet; - \&quot;Replace\&quot;: cancels currently running job and replaces it with a new one |  [optional]
**failedJobsHistoryLimit** | **Integer** | The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1. |  [optional]
**jobTemplate** | [**V1beta1JobTemplateSpec**](V1beta1JobTemplateSpec.md) | Specifies the job that will be created when executing a CronJob. | 
**schedule** | **String** | The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron. | 
**startingDeadlineSeconds** | **Long** | Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones. |  [optional]
**successfulJobsHistoryLimit** | **Integer** | The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3. |  [optional]
**suspend** | **Boolean** | This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false. |  [optional]



