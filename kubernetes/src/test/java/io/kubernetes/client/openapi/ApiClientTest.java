/*
Copyright 2025 The Kubernetes Authors.
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

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import okhttp3.Request;
import org.junit.jupiter.api.Test;

class ApiClientTest {

  @Test
  void testUserAgentMatchesConfigurationVersion() throws ApiException {
    ApiClient apiClient = new ApiClient();

    // Build a simple request to verify User-Agent header
    Request request =
        apiClient.buildRequest(
            "http://localhost",
            "/api/v1/test",
            "GET",
            Collections.emptyList(),
            Collections.emptyList(),
            null,
            Collections.emptyMap(),
            Collections.emptyMap(),
            Collections.emptyMap(),
            new String[] {},
            null);

    // Verify the User-Agent header matches the version from Configuration
    String expectedUserAgent = "Kubernetes Java Client/" + Configuration.VERSION;
    String actualUserAgent = request.header("User-Agent");

    assertThat(actualUserAgent).isEqualTo(expectedUserAgent);
  }
}
