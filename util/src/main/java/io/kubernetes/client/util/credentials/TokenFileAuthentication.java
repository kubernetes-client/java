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

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

// TODO: prefer OpenAPI backed Auentication once it is available. see details in
// https://github.com/OpenAPITools/openapi-generator/pull/6036. currently, the
// workaround is to hijack the http request.
public class TokenFileAuthentication extends RefreshAuthentication {
  public TokenFileAuthentication(String file) {
    this(file, Duration.ofMinutes(1));
  }

  public TokenFileAuthentication(String file, Duration refreshPeriod) {
    super(() -> {
      return getToken(file);
    }, refreshPeriod);
  }

  private static String getToken(String file) {
    try {
      return new String(Files.readAllBytes(Paths.get(file)), Charset.defaultCharset()).trim();
    } catch (IOException e) {
      throw new RuntimeException("Cannot read file: " + file);
    }
  }

}
