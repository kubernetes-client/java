/*
Copyright 2021 The Kubernetes Authors.
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
package io.kubernetes.client.util.authenticators;

import static org.assertj.core.api.Fail.fail;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

import com.google.auth.oauth2.AccessToken;
import com.google.auth.oauth2.GoogleCredentials;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GCPAuthenticatorTest {

  private final String cmdPath = "/usr/lib/google-cloud-sdk/bin/gcloud";
  private final String cmdArgs = "config config-helper --format=json";
  private final String[] cmdArgsSplit = cmdArgs.split(" ");
  private final List<String> expectedCommand =
      Collections.unmodifiableList(
          new ArrayList<String>() {
            {
              add(cmdPath);
              add(cmdArgsSplit[0]);
              add(cmdArgsSplit[1]);
              add(cmdArgsSplit[2]);
            }
          });
  private static final String fakeToken = "new-fake-token";
  private static final String fakeTokenExpiry = "2121-08-05T02:30:24Z";
  private static final String fakeExecResult =
      "{\n"
          + "  \"credential\": {\n"
          + "    \"access_token\": \""
          + fakeToken
          + "\",\n"
          + "    \"id_token\": \"id-fake-token\",\n"
          + "    \"token_expiry\": \""
          + fakeTokenExpiry
          + "\"\n"
          + "  }\n"
          + "}";

  private final ProcessBuilder mockPB = Mockito.mock(ProcessBuilder.class);
  private final GoogleCredentials mockGC = Mockito.mock(GoogleCredentials.class);
  private final GCPAuthenticator gcpAuthenticator = new GCPAuthenticator(mockPB, mockGC);

  @Before
  public void setup() {
    Process mockProcess = Mockito.mock(Process.class);
    Mockito.when(mockProcess.exitValue()).thenReturn(0);
    Mockito.when(mockProcess.getInputStream())
        .thenReturn(new ByteArrayInputStream(fakeExecResult.getBytes(StandardCharsets.UTF_8)));
    try {
      Mockito.when(mockPB.command(Mockito.anyList())).thenCallRealMethod();
      Mockito.when(mockPB.start()).thenReturn(mockProcess);
      Mockito.when(mockPB.command()).thenCallRealMethod();
    } catch (IOException ex) {
      ex.printStackTrace();
      fail("Unexpected exception: " + ex);
    }
  }

  @Test
  public void testRefresh() {
    final Map<String, Object> gcpConfig =
        new HashMap<String, Object>() {
          {
            put(GCPAuthenticator.ACCESS_TOKEN, "eyXXX");
            put(GCPAuthenticator.CMD_PATH, cmdPath);
            put(GCPAuthenticator.CMD_ARGS, cmdArgs);
            put(GCPAuthenticator.EXPIRY, "2121-08-05T02:30:24Z");
          }
        };
    gcpAuthenticator.refresh(gcpConfig);
    List<String> executedCommand = mockPB.command();
    MatcherAssert.assertThat(executedCommand, is(expectedCommand));
  }

  @Test
  public void testRefreshTrailingWhitespaceInPath() {
    final Map<String, Object> gcpConfig =
        new HashMap<String, Object>() {
          {
            put(GCPAuthenticator.ACCESS_TOKEN, "eyXXX");
            put(GCPAuthenticator.CMD_PATH, cmdPath + " ");
            put(GCPAuthenticator.CMD_ARGS, cmdArgs);
            put(GCPAuthenticator.EXPIRY, "2121-08-05T02:30:24Z");
          }
        };
    gcpAuthenticator.refresh(gcpConfig);
    List<String> executedCommand = mockPB.command();
    MatcherAssert.assertThat(executedCommand, is(expectedCommand));
  }

  @Test
  public void testRefreshTrailingWhitespaceInArgs() {
    final Map<String, Object> gcpConfig =
        new HashMap<String, Object>() {
          {
            put(GCPAuthenticator.ACCESS_TOKEN, "eyXXX");
            put(GCPAuthenticator.CMD_PATH, cmdPath);
            put(GCPAuthenticator.CMD_ARGS, cmdArgs + " ");
            put(GCPAuthenticator.EXPIRY, "2121-08-05T02:30:24Z");
          }
        };
    gcpAuthenticator.refresh(gcpConfig);
    List<String> executedCommand = mockPB.command();
    MatcherAssert.assertThat(executedCommand, is(expectedCommand));
  }

  @Test
  public void testRefreshTrailingWhitespaceInPathAndArgs() {
    final Map<String, Object> gcpConfig =
        new HashMap<String, Object>() {
          {
            put(GCPAuthenticator.ACCESS_TOKEN, "eyXXX");
            put(GCPAuthenticator.CMD_PATH, cmdPath + " ");
            put(GCPAuthenticator.CMD_ARGS, cmdArgs + " ");
            put(GCPAuthenticator.EXPIRY, "2121-08-05T02:30:24Z");
          }
        };
    gcpAuthenticator.refresh(gcpConfig);
    List<String> executedCommand = mockPB.command();
    MatcherAssert.assertThat(executedCommand, is(expectedCommand));
  }

  @Test
  public void testRefreshLeadingWhitespaceInPath() {
    final Map<String, Object> gcpConfig =
        new HashMap<String, Object>() {
          {
            put(GCPAuthenticator.ACCESS_TOKEN, "eyXXX");
            put(GCPAuthenticator.CMD_PATH, " " + cmdPath);
            put(GCPAuthenticator.CMD_ARGS, cmdArgs);
            put(GCPAuthenticator.EXPIRY, "2121-08-05T02:30:24Z");
          }
        };
    gcpAuthenticator.refresh(gcpConfig);
    List<String> executedCommand = mockPB.command();
    MatcherAssert.assertThat(executedCommand, is(expectedCommand));
  }

  @Test
  public void testRefreshLeadingWhitespaceInArgs() {
    final Map<String, Object> gcpConfig =
        new HashMap<String, Object>() {
          {
            put(GCPAuthenticator.ACCESS_TOKEN, "eyXXX");
            put(GCPAuthenticator.CMD_PATH, cmdPath);
            put(GCPAuthenticator.CMD_ARGS, " " + cmdArgs);
            put(GCPAuthenticator.EXPIRY, "2121-08-05T02:30:24Z");
          }
        };
    gcpAuthenticator.refresh(gcpConfig);
    List<String> executedCommand = mockPB.command();
    MatcherAssert.assertThat(executedCommand, is(expectedCommand));
  }

  @Test
  public void testRefreshLeadingWhitespaceInPathAndArgs() {
    final Map<String, Object> gcpConfig =
        new HashMap<String, Object>() {
          {
            put(GCPAuthenticator.ACCESS_TOKEN, "eyXXX");
            put(GCPAuthenticator.CMD_PATH, " " + cmdPath);
            put(GCPAuthenticator.CMD_ARGS, " " + cmdArgs);
            put(GCPAuthenticator.EXPIRY, "2121-08-05T02:30:24Z");
          }
        };
    gcpAuthenticator.refresh(gcpConfig);
    List<String> executedCommand = mockPB.command();
    MatcherAssert.assertThat(executedCommand, is(expectedCommand));
  }

  @Test
  public void testRefreshApplicationDefaultCredentials() {
    Date fakeTokenExpiryDate = Date.from(Instant.parse(fakeTokenExpiry));
    Mockito.when(mockGC.getAccessToken())
        .thenReturn(new AccessToken(fakeToken, fakeTokenExpiryDate));
    final Map<String, Object> config = new HashMap<String, Object>() {};
    final Map<String, Object> result = gcpAuthenticator.refresh(config);
    assertEquals(fakeToken, result.get(GCPAuthenticator.ACCESS_TOKEN));
    assertEquals(fakeTokenExpiryDate, result.get(GCPAuthenticator.EXPIRY));
  }
}
