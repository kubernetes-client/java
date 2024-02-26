/*
Copyright 2024 The Kubernetes Authors.
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
package io.kubernetes.client.openapi;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.matching.EqualToPattern;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Response;
import org.junit.Rule;
import org.junit.Test;

public class ApiClientTest {
  static final String TEST_PATH = "/api/v1/namespaces/default/services";
  static final String TEST_API_KEY = "abracadabra";
  static final String TEST_RESPONSE_BODY =
      "{\n"
          + "  \"kind\": \"ServiceList\",\n"
          + "  \"apiVersion\": \"v1\",\n"
          + "  \"metadata\": {\n"
          + "    \"resourceVersion\": \"1\"\n"
          + "  },\n"
          + "  \"items\": [\n"
          + "    {\n"
          + "      \"metadata\": {\n"
          + "        \"name\": \"demo\",\n"
          + "        \"namespace\": \"default\",\n"
          + "        \"uid\": \"48990dee-79af-4b80-b3f4-b81f51dea645\",\n"
          + "        \"resourceVersion\": \"1\",\n"
          + "      }\n"
          + "    }\n"
          + "  ]\n"
          + "}\n";

  @Rule public WireMockRule server = new WireMockRule(options().dynamicPort());

  @Test
  public void testRedactsAuthorizationHeader() throws Exception {
    // Set up the client with an API key
    ApiClient apiClient = new ApiClient().setBasePath(server.baseUrl());
    apiClient.setApiKey(TEST_API_KEY);

    // Setup debug logging, taking care to capture logs instead of propagating to Java logging
    StringBuilder logs = new StringBuilder();
    apiClient.debugLogger = l -> logs.append(l).append('\n');
    apiClient.setDebugging(true);

    // Make a request in the same fashion openapi generated code does
    List<Pair> queryParams = Arrays.asList(new Pair("resourceVersion","1"), new Pair("watch", "false"));
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    Call testCall =
        apiClient.buildCall(
            null,
            TEST_PATH,
            "GET",
            queryParams,
            Collections.emptyList(),
            null,
            headers,
            Collections.emptyMap(),
            Collections.emptyMap(),
            new String[] {"BearerToken"},
            null);

    // Enqueue a response on the mock server
    server.stubFor(
        get(urlEqualTo(TEST_PATH +"?resourceVersion=1&watch=false"))
            // Verify the server saw the API key
            .withHeader("authorization", new EqualToPattern(TEST_API_KEY))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(TEST_RESPONSE_BODY)));

    // Ensure the request completes, by verifying it received the expected response
    try (Response response = testCall.execute()) {
      assertThat(response.body().string(), equalTo(TEST_RESPONSE_BODY));
    }

    // Verify the logs never saw the API key
    assertThat(logs.toString(), containsString("authorization: ██"));
    assertThat(logs.toString(), not(containsString("authorization: " + TEST_API_KEY)));
  }
}
