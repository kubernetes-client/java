package io.kubernetes.client.util.conversion;

import io.kubernetes.client.openapi.models.V1Job;
import io.kubernetes.client.openapi.models.V1JobSpec;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1OwnerReference;
import io.kubernetes.client.openapi.models.V1beta1CronJob;
import io.kubernetes.client.openapi.models.V1beta1CronJobSpec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Jobs {

  /**
   * Convert V1beta1CronJob object into V1Job object, based on kubectl code
   * https://github.com/kubernetes/kubectl/blob/master/pkg/cmd/create/create_job.go
   *
   * @param cronJob cronJob object (required)
   * @param jobName cronJob name
   * @return V1Job object
   */
  public static V1Job cronJobToJob(V1beta1CronJob cronJob, String jobName) {

    Map<String, String> annotations = new HashMap<>();
    Map<String, String> labels = new HashMap<>();
    V1JobSpec jobSpec = null;

    V1beta1CronJobSpec cronJobSpec = cronJob.getSpec();

    if (cronJobSpec != null && cronJobSpec.getJobTemplate() != null) {
      V1ObjectMeta metadata = cronJobSpec.getJobTemplate().getMetadata();
      if (metadata != null) {
        if (metadata.getAnnotations() != null) {
          annotations.putAll(metadata.getAnnotations());
        }
        if (metadata.getLabels() != null) {
          labels.putAll(metadata.getLabels());
        }
      }
      jobSpec = cronJobSpec.getJobTemplate().getSpec();
    }

    annotations.put("cronjob.kubernetes.io/instantiate", "manual");

    V1OwnerReference v1OwnerReference = new V1OwnerReference();
    v1OwnerReference.setKind("CronJob");
    v1OwnerReference.setName(cronJob.getMetadata().getName());
    v1OwnerReference.setBlockOwnerDeletion(true);
    v1OwnerReference.setController(true);
    v1OwnerReference.setUid(cronJob.getMetadata().getUid());
    v1OwnerReference.setApiVersion("batch/v1beta1");

    V1ObjectMeta jobMetadata = new V1ObjectMeta();
    jobMetadata.setName(jobName != null ? jobName : cronJob.getMetadata().getName() + "-manual");
    jobMetadata.setAnnotations(annotations);
    jobMetadata.setLabels(labels);
    jobMetadata.setOwnerReferences(Arrays.asList(v1OwnerReference));

    V1Job job = new V1Job();
    job.setKind("Job");
    job.setApiVersion("batch/v1");
    job.setMetadata(jobMetadata);
    job.setSpec(jobSpec);

    return job;
  }
}
