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
package io.kubernetes.client.util.credentials;

import static io.kubernetes.client.util.TestUtils.getApiKeyAuthFromClient;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import io.kubernetes.client.openapi.ApiClient;
import java.nio.charset.StandardCharsets;
import okio.ByteString;
import org.junit.Test;

public class UsernamePasswordAuthenticationTest {

  private static final String USERNAME = "username";
  private static final String PASSWORD = "password";
  public static final byte[] USERNAME_PASSWORD_BYTES =
      (USERNAME + ":" + PASSWORD).getBytes(StandardCharsets.ISO_8859_1);

  @Test
  public void testUsernamePasswordProvided() {
    final ApiClient client = new ApiClient();
    new UsernamePasswordAuthentication(USERNAME, PASSWORD).provide(client);
    assertThat(getApiKeyAuthFromClient(client).getApiKeyPrefix(), is("Basic"));
    assertThat(
        getApiKeyAuthFromClient(client).getApiKey(),
        is(ByteString.of(USERNAME_PASSWORD_BYTES).base64()));
  }
}
