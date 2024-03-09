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
package io.kubernetes.client.util;

import static io.kubernetes.client.util.Preconditions.precondition;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class PreconditionsTest {

  @Test
  void emptyString() {
    assertThatThrownBy(
            () -> precondition("", Strings::isNullOrEmpty, () -> "string can not be empty"))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("string can not be empty");
  }

  @Test
  void nonEmptyString() {
    String abc = precondition("abc", Strings::isNullOrEmpty, () -> "string can not be empty");
    assertThat(abc).isEqualTo("abc");
  }
}
