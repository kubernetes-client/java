/*
Copyright 2022 The Kubernetes Authors.
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

import static org.junit.Assert.*;

import io.kubernetes.client.openapi.models.V1CronJob;
import io.kubernetes.client.openapi.models.V1Job;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1beta1CronJob;
import org.junit.Test;

/** Tests for the Jobs helper class */
public class JobsTest {

  @Test
  public void testCronJobToJobShouldReturnV1JobWithV1beta1CronJob() {

    String cronJobName = "cronJobName";
    V1ObjectMeta v1ObjectMeta = new V1ObjectMeta();
    v1ObjectMeta.setName(cronJobName);

    V1beta1CronJob v1beta1CronJob = new V1beta1CronJob();
    v1beta1CronJob.setMetadata(v1ObjectMeta);
    v1beta1CronJob.setApiVersion("batch/v1beta1");

    V1Job v1Job = Jobs.cronJobToJob(v1beta1CronJob, null);

    assertNotNull(v1Job.getMetadata());
    assertNotNull(v1Job.getMetadata().getOwnerReferences());
    assertFalse(v1Job.getMetadata().getOwnerReferences().isEmpty());

    assertEquals("batch/v1", v1Job.getApiVersion());
    assertEquals(cronJobName + "-manual", v1Job.getMetadata().getName());
    assertEquals(
        v1beta1CronJob.getApiVersion(),
        v1Job.getMetadata().getOwnerReferences().get(0).getApiVersion());
  }

  @Test
  public void testCronJobToJobShouldReturnV1JobWithV1CronJob() {
    String cronJobName = "cronJobName";
    V1ObjectMeta v1ObjectMeta = new V1ObjectMeta();
    v1ObjectMeta.setName(cronJobName);

    V1CronJob v1CronJob = new V1CronJob();
    v1CronJob.setMetadata(v1ObjectMeta);
    v1CronJob.setApiVersion("batch/v1");

    V1Job v1Job = Jobs.cronJobToJob(v1CronJob, null);

    assertNotNull(v1Job.getMetadata());
    assertNotNull(v1Job.getMetadata().getOwnerReferences());
    assertFalse(v1Job.getMetadata().getOwnerReferences().isEmpty());

    assertEquals("batch/v1", v1Job.getApiVersion());
    assertEquals(cronJobName + "-manual", v1Job.getMetadata().getName());
    assertEquals(
        v1CronJob.getApiVersion(), v1Job.getMetadata().getOwnerReferences().get(0).getApiVersion());
  }
}
