package io.kubernetes.client.models;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class V1SecretTest {

  @Test
  public void testEquals() {
    final Map<String, byte[]> data1 = new HashMap<>();
    data1.put("foo", new byte[]{1, 2, 3, 4});
    data1.put("bar", new byte[]{5, 6, 7, 8});
    final V1Secret secret1 = new V1SecretBuilder()
        .withData(data1)
        .build();

    final Map<String, byte[]> data2 = new HashMap<>();
    data2.put("foo", new byte[]{1, 2, 3, 4});
    data2.put("bar", new byte[]{5, 6, 7, 8});
    final V1Secret secret2 = new V1SecretBuilder()
        .withData(data2)
        .build();

    assertThat(secret1, equalTo(secret2));
  }
}
