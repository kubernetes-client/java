package io.kubernetes.client.util.credentials;

import static io.kubernetes.client.util.TestUtils.getApiKeyAuthFromClient;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import io.kubernetes.client.ApiClient;
import org.junit.Test;

public class AccessTokenAuthenticationTest {

  @Test
  public void testTokenProvided() {
    final ApiClient client = new ApiClient();
    new AccessTokenAuthentication("token").provide(client);
    assertThat(getApiKeyAuthFromClient(client).getApiKeyPrefix(), is("Bearer"));
    assertThat(getApiKeyAuthFromClient(client).getApiKey(), is("token"));
  }

  @Test(expected = NullPointerException.class)
  public void testTokenNonnull() {
    new AccessTokenAuthentication(null);
  }
}
