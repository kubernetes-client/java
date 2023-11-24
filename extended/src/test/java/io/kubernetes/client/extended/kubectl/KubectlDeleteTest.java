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

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.Assert.assertNotNull;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.matching.EqualToPattern;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.extended.kubectl.Kubectl;
import io.kubernetes.client.extended.kubectl.KubectlDelete;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.apis.BatchV1Api;
import io.kubernetes.client.openapi.models.*;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.ModelMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class KubectlDeleteTest {

    private ApiClient apiClient;

    private JSON json = new JSON();
    private GenericKubernetesApi<V1Job, V1JobList> jobClient;

    private static final String DISCOVERY_API =
            new File(KubectlDeleteTest.class.getClassLoader().getResource("discovery-api.json").getPath())
                    .toString();

    private static final String DISCOVERY_APIV1 =
            new File(
                    KubectlDeleteTest.class
                            .getClassLoader()
                            .getResource("discovery-api-v1.json")
                            .getPath())
                    .toString();

    private static final String DISCOVERY_APIS =
            new File(KubectlDeleteTest.class.getClassLoader().getResource("discovery-apis.json").getPath())
                    .toString();

    @Rule public WireMockRule wireMockRule = new WireMockRule(wireMockConfig().dynamicPort());

    @Before
    public void setup() throws IOException {
        apiClient = new ClientBuilder().setBasePath("http://localhost:" + wireMockRule.port()).build();
        jobClient =
                new GenericKubernetesApi<>(V1Job.class, V1JobList.class, "batch", "v1", "jobs", apiClient);
    }

    @Test
    public void testPatchConfigMap() throws KubectlException, IOException, ApiException {
//        wireMockRule.stubFor(
//                patch(urlPathEqualTo("/apis/batch/v1/namespaces/foo/jobs/bar"))
//                        .withHeader(
//                                "Content-Type", new EqualToPattern(V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH))
//                        .willReturn(
//                                aResponse()
//                                        .withStatus(200)
//                                        .withBody("{\"metadata\":{\"name\":\"bar\",\"namespace\":\"foo\"}}")));
//        V1Status status = new V1Status().kind("Status").code(200).message("good!");
//        stubFor(
//                delete(urlEqualTo("/apis/batch/v1/namespaces/default/jobs/foo1"))
//                        .willReturn(aResponse().withStatus(200).withBody(json.serialize(status))));
        wireMockRule.stubFor(
                post(urlPathEqualTo("/apis/batch/v1/namespaces/foo/jobs"))
//                        .withHeader(
//                                "Content-Type", new EqualToPattern("application-json"))
                        .willReturn(
                                aResponse()
                                        .withStatus(201)
                                        .withBody("{\"kind\":\"Job\",\"apiVersion\":\"batch/v1\",\"metadata\":{\"name\":\"bar\",\"namespace\":\"foo\",\"uid\":\"7f64e06e-d6a6-4598-b375-7c8773f3b0e7\",\"resourceVersion\":\"46205\",\"generation\":1,\"creationTimestamp\":\"2023-11-23T15:38:18Z\",\"labels\":{\"batch.kubernetes.io/controller-uid\":\"7f64e06e-d6a6-4598-b375-7c8773f3b0e7\",\"batch.kubernetes.io/job-name\":\"bar\",\"controller-uid\":\"7f64e06e-d6a6-4598-b375-7c8773f3b0e7\",\"job-name\":\"bar\"},\"annotations\":{\"batch.kubernetes.io/job-tracking\":\"\"},\"managedFields\":[{\"manager\":\"Kubernetes Java Client\",\"operation\":\"Update\",\"apiVersion\":\"batch/v1\",\"time\":\"2023-11-23T15:38:18Z\",\"fieldsType\":\"FieldsV1\",\"fieldsV1\":{\"f:spec\":{\"f:backoffLimit\":{},\"f:completionMode\":{},\"f:completions\":{},\"f:parallelism\":{},\"f:suspend\":{},\"f:template\":{\"f:spec\":{\"f:containers\":{\"k:{\\\"name\\\":\\\"bar2\\\"}\":{\".\":{},\"f:command\":{},\"f:image\":{},\"f:imagePullPolicy\":{},\"f:name\":{},\"f:resources\":{},\"f:terminationMessagePath\":{},\"f:terminationMessagePolicy\":{}}},\"f:dnsPolicy\":{},\"f:restartPolicy\":{},\"f:schedulerName\":{},\"f:securityContext\":{},\"f:terminationGracePeriodSeconds\":{}}}}}}]},\"spec\":{\"parallelism\":1,\"completions\":1,\"backoffLimit\":6,\"selector\":{\"matchLabels\":{\"batch.kubernetes.io/controller-uid\":\"7f64e06e-d6a6-4598-b375-7c8773f3b0e7\"}},\"template\":{\"metadata\":{\"creationTimestamp\":null,\"labels\":{\"batch.kubernetes.io/controller-uid\":\"7f64e06e-d6a6-4598-b375-7c8773f3b0e7\",\"batch.kubernetes.io/job-name\":\"bar\",\"controller-uid\":\"7f64e06e-d6a6-4598-b375-7c8773f3b0e7\",\"job-name\":\"bar\"}},\"spec\":{\"containers\":[{\"name\":\"bar2\",\"image\":\"busybox\",\"command\":[\"sh\",\"-c\",\"echo Hello World!\"],\"resources\":{},\"terminationMessagePath\":\"/dev/termination-log\",\"terminationMessagePolicy\":\"File\",\"imagePullPolicy\":\"Always\"}],\"restartPolicy\":\"Never\",\"terminationGracePeriodSeconds\":30,\"dnsPolicy\":\"ClusterFirst\",\"securityContext\":{},\"schedulerName\":\"default-scheduler\"}},\"completionMode\":\"NonIndexed\",\"suspend\":false},\"status\":{}}")));
//        String localVarPath = "/apis/batch/v1/namespaces/{namespace}/jobs"
//                .replaceAll("\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));


//        /apis/batch%2Fv1/batch%2Fv1/namespaces/foo/jobs/bar
        // /apis/batch/v1/namespaces/foo/jobs/bar
        wireMockRule.stubFor(
                delete(urlPathEqualTo("/apis/batch%2Fv1/batch%2Fv1/namespaces/foo/jobs/bar"))
                        .willReturn(
                                aResponse()
                                        .withStatus(200)
                                        .withBody("{\"kind\":\"Job\",\"apiVersion\":\"batch/v1\",\"metadata\":{\"name\":\"bar\",\"namespace\":\"foo\",\"uid\":\"b862e993-3828-4108-a38f-c19a602d9af6\",\"resourceVersion\":\"82015\",\"generation\":2,\"creationTimestamp\":\"2023-11-24T06:00:49Z\",\"deletionTimestamp\":\"2023-11-24T06:07:44Z\",\"deletionGracePeriodSeconds\":0,\"labels\":{\"batch.kubernetes.io/controller-uid\":\"b862e993-3828-4108-a38f-c19a602d9af6\",\"batch.kubernetes.io/job-name\":\"bar\",\"controller-uid\":\"b862e993-3828-4108-a38f-c19a602d9af6\",\"job-name\":\"bar\"},\"annotations\":{\"batch.kubernetes.io/job-tracking\":\"\"},\"finalizers\":[\"orphan\"],\"managedFields\":[{\"manager\":\"Kubernetes Java Client\",\"operation\":\"Update\",\"apiVersion\":\"batch/v1\",\"time\":\"2023-11-24T06:00:49Z\",\"fieldsType\":\"FieldsV1\",\"fieldsV1\":{\"f:spec\":{\"f:backoffLimit\":{},\"f:completionMode\":{},\"f:completions\":{},\"f:parallelism\":{},\"f:suspend\":{},\"f:template\":{\"f:spec\":{\"f:containers\":{\"k:{\\\"name\\\":\\\"bar2\\\"}\":{\".\":{},\"f:command\":{},\"f:image\":{},\"f:imagePullPolicy\":{},\"f:name\":{},\"f:resources\":{},\"f:terminationMessagePath\":{},\"f:terminationMessagePolicy\":{}}},\"f:dnsPolicy\":{},\"f:restartPolicy\":{},\"f:schedulerName\":{},\"f:securityContext\":{},\"f:terminationGracePeriodSeconds\":{}}}}}},{\"manager\":\"kube-controller-manager\",\"operation\":\"Update\",\"apiVersion\":\"batch/v1\",\"time\":\"2023-11-24T06:00:53Z\",\"fieldsType\":\"FieldsV1\",\"fieldsV1\":{\"f:status\":{\"f:completionTime\":{},\"f:conditions\":{},\"f:ready\":{},\"f:startTime\":{},\"f:succeeded\":{},\"f:uncountedTerminatedPods\":{}}},\"subresource\":\"status\"}]},\"spec\":{\"parallelism\":1,\"completions\":1,\"backoffLimit\":6,\"selector\":{\"matchLabels\":{\"batch.kubernetes.io/controller-uid\":\"b862e993-3828-4108-a38f-c19a602d9af6\"}},\"template\":{\"metadata\":{\"creationTimestamp\":null,\"labels\":{\"batch.kubernetes.io/controller-uid\":\"b862e993-3828-4108-a38f-c19a602d9af6\",\"batch.kubernetes.io/job-name\":\"bar\",\"controller-uid\":\"b862e993-3828-4108-a38f-c19a602d9af6\",\"job-name\":\"bar\"}},\"spec\":{\"containers\":[{\"name\":\"bar2\",\"image\":\"busybox\",\"command\":[\"sh\",\"-c\",\"echo Hello World!\"],\"resources\":{},\"terminationMessagePath\":\"/dev/termination-log\",\"terminationMessagePolicy\":\"File\",\"imagePullPolicy\":\"Always\"}],\"restartPolicy\":\"Never\",\"terminationGracePeriodSeconds\":30,\"dnsPolicy\":\"ClusterFirst\",\"securityContext\":{},\"schedulerName\":\"default-scheduler\"}},\"completionMode\":\"NonIndexed\",\"suspend\":false},\"status\":{\"conditions\":[{\"type\":\"Complete\",\"status\":\"True\",\"lastProbeTime\":\"2023-11-24T06:00:53Z\",\"lastTransitionTime\":\"2023-11-24T06:00:53Z\"}],\"startTime\":\"2023-11-24T06:00:49Z\",\"completionTime\":\"2023-11-24T06:00:53Z\",\"succeeded\":1,\"uncountedTerminatedPods\":{},\"ready\":0}}\n")));

        wireMockRule.stubFor(
                get(urlPathEqualTo("/api"))
                        .willReturn(
                                aResponse()
                                        .withStatus(200)
                                        .withBody(new String(Files.readAllBytes(Paths.get(DISCOVERY_API))))));
        wireMockRule.stubFor(
                get(urlPathEqualTo("/apis"))
                        .willReturn(
                                aResponse()
                                        .withStatus(200)
                                        .withBody(new String(Files.readAllBytes(Paths.get(DISCOVERY_APIS))))));
        wireMockRule.stubFor(
                get(urlPathEqualTo("/api/v1"))
                        .willReturn(
                                aResponse()
                                        .withStatus(200)
                                        .withBody(new String(Files.readAllBytes(Paths.get(DISCOVERY_APIV1))))));
        wireMockRule.stubFor(
                get(urlPathEqualTo("/apis/batch/v1/"))
                        .willReturn(
                                aResponse()
                                        .withStatus(200)
                                        .withBody("{\"kind\":\"APIResourceList\",\"apiVersion\":\"v1\",\"groupVersion\":\"batch/v1\",\"resources\":[{\"name\":\"cronjobs\",\"singularName\":\"cronjob\",\"namespaced\":true,\"kind\":\"CronJob\",\"verbs\":[\"create\",\"delete\",\"deletecollection\",\"get\",\"list\",\"patch\",\"update\",\"watch\"],\"shortNames\":[\"cj\"],\"categories\":[\"all\"],\"storageVersionHash\":\"sd5LIXh4Fjs=\"},{\"name\":\"cronjobs/status\",\"singularName\":\"\",\"namespaced\":true,\"kind\":\"CronJob\",\"verbs\":[\"get\",\"patch\",\"update\"]},{\"name\":\"jobs\",\"singularName\":\"job\",\"namespaced\":true,\"kind\":\"Job\",\"verbs\":[\"create\",\"delete\",\"deletecollection\",\"get\",\"list\",\"patch\",\"update\",\"watch\"],\"categories\":[\"all\"],\"storageVersionHash\":\"mudhfqk/qZY=\"},{\"name\":\"jobs/status\",\"singularName\":\"\",\"namespaced\":true,\"kind\":\"Job\",\"verbs\":[\"get\",\"patch\",\"update\"]}]}\n")));

        V1JobSpec v1JobSpec = new V1JobSpec()
                .template(new V1PodTemplateSpec()
                        .spec(new V1PodSpec()
                                .containers(java.util.Arrays.asList(new V1Container()
                                        .name("hello")
                                        .image("busybox")
                                        .command(java.util.Arrays.asList("sh", "-c", "echo Hello World!"))))
                                .restartPolicy("Never")));
        V1Job job = new V1Job()
                .apiVersion("batch/v1")
                .kind("Job")
                .metadata(new V1ObjectMeta().name("bar"))
                .spec(v1JobSpec);
////
        BatchV1Api api = new BatchV1Api();
        api.setApiClient(apiClient);
        api.createNamespacedJob("foo", job, null, null, null, "Strict");
//        wireMockRule.stubFor(
//                patch(urlPathEqualTo("/apis/batch/v1/namespaces/foo/jobs/bar"))
//                        .withHeader(
//                                "Content-Type", new EqualToPattern(V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH))
//                        .willReturn(
//                                aResponse()
//                                        .withStatus(200)
//                                        .withBody("{\"metadata\":{\"name\":\"bar\",\"namespace\":\"foo\"}}")))
        ModelMapper.addModelMap(api.getAPIResources().getGroupVersion(), job.getApiVersion(), job.getKind(), "jobs", true, V1Job.class);

        KubectlDelete<V1Job> kubectlDelete = Kubectl.delete(V1Job.class);
        kubectlDelete.apiClient(apiClient);
        kubectlDelete.namespace("foo").name("bar");
        kubectlDelete.execute();

        // this job should error upon deletion now

        KubectlDelete<V1Job> kubectlDelete2 = Kubectl.delete(V1Job.class);
        kubectlDelete2.apiClient(apiClient);
        kubectlDelete2.namespace("foo").name("bar");
        kubectlDelete2.execute();

//        jobClient.delete("foo", "bar");


//        V1Job foo1 =
//                new V1Job().kind("Job").metadata(new V1ObjectMeta().namespace("foo").name("bar"));
//
//        stubFor(
//                post(urlEqualTo("/apis/batch/v1/namespaces/foo/jobs"))
//                        .willReturn(aResponse().withStatus(200).withBody(json.serialize(foo1))));
//        KubernetesApiResponse<V1Job> jobListResp = jobClient.create(foo1);
//        V1Status status = new V1Status().kind("Status").code(200).message("good!");
//        stubFor(
//                delete(urlEqualTo("/apis/batch/v1/namespaces/foo/jobs/bar"))
//                        .willReturn(aResponse().withStatus(200).withBody(json.serialize(status))));
//
//        KubernetesApiResponse<V1Job> deleteJobResp = jobClient.delete("foo", "bar", null);
//        System.out.println(deleteJobResp.isSuccess());
//        System.out.println(deleteJobResp.getStatus());
    }
}
