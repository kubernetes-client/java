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
package io.kubernetes.client.extended.kubectl;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.Assert.assertThrows;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.stubbing.Scenario;
import io.kubernetes.client.extended.kubectl.Kubectl;
import io.kubernetes.client.extended.kubectl.KubectlDelete;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.BatchV1Api;
import io.kubernetes.client.openapi.models.*;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.ModelMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class KubectlDeleteTest {

    private ApiClient apiClient;

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


    private static final String ADD_JOB =
            new File(
                    KubectlDeleteTest.class
                            .getClassLoader()
                            .getResource("deleted-add-job.json")
                            .getPath())
                    .toString();
    private static final String GET_BATCH =
            new File(
                    KubectlDeleteTest.class
                            .getClassLoader()
                            .getResource("deleted-get-batch.json")
                            .getPath())
                    .toString();
    private static final String DELETED_FIRST =
            new File(
                    KubectlDeleteTest.class
                            .getClassLoader()
                            .getResource("deleted-success.json")
                            .getPath())
                    .toString();
    private static final String DELETED_SECOND =
            new File(
                    KubectlDeleteTest.class
                            .getClassLoader()
                            .getResource("deleted-not-found.json")
                            .getPath())
                    .toString();

    private static final String DISCOVERY_APIS =
            new File(KubectlDeleteTest.class.getClassLoader().getResource("discovery-apis.json").getPath())
                    .toString();

    @Rule public WireMockRule wireMockRule = new WireMockRule(wireMockConfig().dynamicPort());

    @Before
    public void setup() {
        apiClient = new ClientBuilder().setBasePath("http://localhost:" + wireMockRule.port()).build();
    }

    @Test
    public void testKubectlDelete() throws KubectlException, IOException, ApiException {
        wireMockRule.stubFor(
                post(urlPathEqualTo("/apis/batch/v1/namespaces/foo/jobs"))
                        .willReturn(
                                aResponse()
                                        .withStatus(201)
                                        .withBody(new String(Files.readAllBytes(Paths.get(ADD_JOB))))));
        wireMockRule.stubFor(
                delete(urlPathEqualTo("/apis/batch%2Fv1/batch%2Fv1/namespaces/foo/jobs/bar"))
                        .inScenario("JobDeletionScenario")
                        .whenScenarioStateIs(Scenario.STARTED)
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withBody(new String(Files.readAllBytes(Paths.get(DELETED_FIRST))))
                        )
                        .willSetStateTo("SecondCall")
        );

        wireMockRule.stubFor(
                delete(urlPathEqualTo("/apis/batch%2Fv1/batch%2Fv1/namespaces/foo/jobs/bar"))
                        .inScenario("JobDeletionScenario")
                        .whenScenarioStateIs("SecondCall")
                        .willReturn(aResponse()
                                .withStatus(404)
                                .withBody(new String(Files.readAllBytes(Paths.get(DELETED_SECOND))))
                        )
        );

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
                                        .withBody(new String(Files.readAllBytes(Paths.get(GET_BATCH))))));

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
        BatchV1Api api = new BatchV1Api();
        api.setApiClient(apiClient);
        api.createNamespacedJob("foo", job, null, null, null, "Strict");
        ModelMapper.addModelMap(api.getAPIResources().getGroupVersion(), job.getApiVersion(), job.getKind(), "jobs", true, V1Job.class);

        KubectlDelete<V1Job> kubectlDelete = Kubectl.delete(V1Job.class);
        kubectlDelete.apiClient(apiClient);
        kubectlDelete.namespace("foo").name("bar");
        kubectlDelete.execute();

        assertThrows(KubectlException.class, () -> {
            KubectlDelete<V1Job> kubectlDelete2 = Kubectl.delete(V1Job.class);
            kubectlDelete2.apiClient(apiClient);
            kubectlDelete2.namespace("foo").name("bar");
            kubectlDelete2.execute();
        });

        KubectlDelete<V1Job> kubectlDelete2 = Kubectl.delete(V1Job.class);
        kubectlDelete2.apiClient(apiClient);
        kubectlDelete2.namespace("foo").name("bar").ignoreNotFound(true);
        kubectlDelete2.execute();
    }
}
