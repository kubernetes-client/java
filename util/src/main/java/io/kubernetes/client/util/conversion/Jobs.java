/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.util.conversion;

import io.kubernetes.client.openapi.models.V1CronJob;
import io.kubernetes.client.openapi.models.V1CronJobSpec;
import io.kubernetes.client.openapi.models.V1Job;
import io.kubernetes.client.openapi.models.V1JobSpec;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1OwnerReference;
import io.kubernetes.client.openapi.models.V1beta1CronJob;
import io.kubernetes.client.openapi.models.V1beta1CronJobSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Jobs {

  /**
   * Convert V1beta1CronJob object into V1Job object, based on kubectl code <a
   * href="https://github.com/kubernetes/kubectl/blob/master/pkg/cmd/create/create_job.go">create_job</a>
   *
   * @param cronJob cronJob object (required)
   * @param jobName cronJob name
   * @return V1Job object
   */
  public static V1Job cronJobToJob(V1beta1CronJob cronJob, String jobName) {

    V1JobSpec jobSpec = null;
    V1ObjectMeta jobTemplateMetadata = null;
    V1beta1CronJobSpec cronJobSpec = cronJob.getSpec();

    if (cronJobSpec != null && cronJobSpec.getJobTemplate() != null) {
      jobTemplateMetadata = cronJobSpec.getJobTemplate().getMetadata();
      jobSpec = cronJobSpec.getJobTemplate().getSpec();
    }

    return createV1Job(
        jobName, cronJob.getApiVersion(), cronJob.getMetadata(), jobTemplateMetadata, jobSpec);
  }

  /**
   * Convert V1CronJob object into V1Job object, based on kubectl code <a
   * href="https://github.com/kubernetes/kubectl/blob/master/pkg/cmd/create/create_job.go">create_job</a>
   *
   * @param cronJob cronJob object (required)
   * @param jobName cronJob name
   * @return V1Job object
   */
  public static V1Job cronJobToJob(V1CronJob cronJob, String jobName) {

    V1JobSpec jobSpec = null;
    V1ObjectMeta jobTemplateMetadata = null;
    V1CronJobSpec cronJobSpec = cronJob.getSpec();

    if (cronJobSpec != null && cronJobSpec.getJobTemplate() != null) {
      jobTemplateMetadata = cronJobSpec.getJobTemplate().getMetadata();
      jobSpec = cronJobSpec.getJobTemplate().getSpec();
    }

    return createV1Job(
        jobName, cronJob.getApiVersion(), cronJob.getMetadata(), jobTemplateMetadata, jobSpec);
  }

  private static V1Job createV1Job(
      String jobName,
      String cronJobApiVersion,
      V1ObjectMeta cronJobMetadata,
      V1ObjectMeta jobTemplateMetadata,
      V1JobSpec jobSpec) {
    Objects.requireNonNull(cronJobMetadata);

    Map<String, String> annotations = new HashMap<>();
    Map<String, String> labels = new HashMap<>();

    if (jobTemplateMetadata != null) {
      if (jobTemplateMetadata.getAnnotations() != null) {
        annotations.putAll(jobTemplateMetadata.getAnnotations());
      }
      if (jobTemplateMetadata.getLabels() != null) {
        labels.putAll(jobTemplateMetadata.getLabels());
      }
    }

    annotations.put("cronjob.kubernetes.io/instantiate", "manual");

    V1OwnerReference v1OwnerReference = new V1OwnerReference();
    v1OwnerReference.setKind("CronJob");
    v1OwnerReference.setName(cronJobMetadata.getName());
    v1OwnerReference.setBlockOwnerDeletion(true);
    v1OwnerReference.setController(true);
    v1OwnerReference.setUid(cronJobMetadata.getUid());
    v1OwnerReference.setApiVersion(cronJobApiVersion);

    V1ObjectMeta jobMetadata = new V1ObjectMeta();
    jobMetadata.setName(jobName != null ? jobName : cronJobMetadata.getName() + "-manual");
    jobMetadata.setAnnotations(annotations);
    jobMetadata.setLabels(labels);
    jobMetadata.setOwnerReferences(Collections.singletonList(v1OwnerReference));

    V1Job job = new V1Job();
    job.setKind("Job");
    job.setApiVersion("batch/v1");
    job.setMetadata(jobMetadata);
    job.setSpec(jobSpec);

    return job;
  }
}
