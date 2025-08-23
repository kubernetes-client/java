import io.kubernetes.client.openapi.ApiClient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserAgentTest {

    @Test
    public void testUserAgent() {
        ApiClient client = new ApiClient();
        String userAgent = "my-custom-agent";
        client.setUserAgent(userAgent);

        // Verify the User-Agent header in default headers
        assertEquals(userAgent, client.getDefaultHeaders().get("User-Agent"));
    }
}
