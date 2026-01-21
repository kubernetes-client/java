/*
Copyright 2026 The Kubernetes Authors.
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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-21T21:30:13.305152Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Pair {
  private final String name;
  private final String value;

  public Pair(String name, String value) {
    this.name = isValidString(name) ? name : "";
    this.value = isValidString(value) ? value : "";
  }

  public String getName() {
    return this.name;
  }

  public String getValue() {
    return this.value;
  }

  private static boolean isValidString(String arg) {
    return arg != null;
  }
}
