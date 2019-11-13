package io.kubernetes.client.openapi;

import io.kubernetes.client.openapi.models.V1Secret;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class CodeGenConstraintTest {

    // https://github.com/kubernetes-client/java/issues/431
    // Validating the issue is fixed
    @Test
    public void testSecretEquality() {
        Map<String, byte[]> data1 = new HashMap<>();
        data1.put("foo", new byte[]{1});
        Map<String, byte[]> data2 = new HashMap<>();
        data2.put("foo", new byte[]{1});

        V1Secret secret1 = new V1Secret().data(data1);
        V1Secret secret2 = new V1Secret().data(data2);
        assertTrue(secret1.equals(secret2));
    }
}