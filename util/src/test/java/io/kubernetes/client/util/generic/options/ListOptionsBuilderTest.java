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
package io.kubernetes.client.util.generic.options;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ListOptionsBuilderTest {

  @Test
  void listOptionsBuilderShouldPopulateAllFields() {
    ListOptions options =
        ListOptions.builder()
            .fieldSelector("metadata.name=test")
            .labelSelector("app=test")
            .resourceVersion("100")
            .resourceVersionMatch("NotOlderThan")
            .allowWatchBookmarks(true)
            .timeoutSeconds(30)
            .limit(50)
            ._continue("next-page-token")
            .isPartialObjectMetadataListRequest(true)
            .build();

    assertThat(options.getFieldSelector()).isEqualTo("metadata.name=test");
    assertThat(options.getLabelSelector()).isEqualTo("app=test");
    assertThat(options.getResourceVersion()).isEqualTo("100");
    assertThat(options.getResourceVersionMatch()).isEqualTo("NotOlderThan");
    assertThat(options.getAllowWatchBookmarks()).isTrue();
    assertThat(options.getTimeoutSeconds()).isEqualTo(30);
    assertThat(options.getLimit()).isEqualTo(50);
    assertThat(options.getContinue()).isEqualTo("next-page-token");
    assertThat(options.isPartialObjectMetadataListRequest()).isTrue();
  }
}
