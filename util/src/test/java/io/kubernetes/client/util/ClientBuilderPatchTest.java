/*
Copyright 2017 The Kubernetes Authors.
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
package io.kubernetes.client.util;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.squareup.okhttp.Call;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import java.io.IOException;
import java.util.HashMap;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/** Tests for the ConfigBuilder helper class */
public class ClientBuilderPatchTest {

  private ApiClient client;
  private static final int PORT = 8089;

  @Rule public WireMockRule wireMockRule = new WireMockRule(PORT);

  @Before
  public void setup() throws IOException {
    client =
        new ClientBuilder()
            .setBasePath("http://localhost:" + PORT)
            .setOverridePatchFormat(ApiClient.PATCH_FORMAT_STRATEGIC_MERGE_PATCH)
            .build();
  }

  @Test
  public void testOverridePatchFormatInterceptor() throws IOException, ApiException {
    stubFor(
        patch(urlPathEqualTo("/apis"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", ApiClient.PATCH_FORMAT_STRATEGIC_MERGE_PATCH)
                    .withBody("{}")));
    Call call =
        client.buildCall(
            "/apis",
            "PATCH",
            null,
            null,
            null,
            new HashMap<>(),
            new HashMap<>(),
            new String[] {},
            null);
    client.execute(call);

    WireMock.verify(
        1,
        patchRequestedFor(urlPathEqualTo("/apis"))
            .withHeader("Content-Type", equalTo(ApiClient.PATCH_FORMAT_STRATEGIC_MERGE_PATCH)));
  }
}
