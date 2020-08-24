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
package io.kubernetes.client.apimachinery;

public class GroupVersionResource {

  private final String group;
  private final String version;
  private final String resource;

  public GroupVersionResource(String group, String version, String resource) {
    this.group = group;
    this.version = version;
    this.resource = resource;
  }

  public String getGroup() {
    return group;
  }

  public String getVersion() {
    return version;
  }

  public String getResource() {
    return resource;
  }
}
