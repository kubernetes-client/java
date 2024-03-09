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
package io.kubernetes.client.custom;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

// Note: Do not use AssertJ .isEquqlTo to test .equals, as this doesn't necessarily invoke it!
class IntOrStringTest {
  @Test
  void whenCreatedWithInt_isInteger() {
    IntOrString intOrString = new IntOrString(17);

    assertThat(intOrString.isInteger()).isTrue();
  }

  @Test
  void whenCreatedWithInt_canRetrieveIntValue() {
    IntOrString intOrString = new IntOrString(17);

    assertThat(intOrString.getIntValue()).isEqualTo(17);
  }

  @Test
  void whenCreatedWithInt_cannotRetrieveStringValue() {
    IntOrString intOrString = new IntOrString(17);
    assertThatThrownBy(intOrString::getStrValue).isInstanceOf(IllegalStateException.class);
  }

  @Test
  void whenCreatedWithInt_equalsItself() {
    IntOrString intOrString = new IntOrString(17);

    assertThat(intOrString.equals(intOrString)).isTrue();
  }

  @Test
  void whenCreatedWithInt_equalsAnotherWithSameValue() {
    IntOrString intOrString1 = new IntOrString(17);
    IntOrString intOrString2 = new IntOrString(17);

    assertThat(intOrString1.equals(intOrString2)).isTrue();
  }

  @Test
  void whenCreatedWithInt_notEqualAnotherWithDifferentValue() {
    IntOrString intOrString1 = new IntOrString(17);
    IntOrString intOrString2 = new IntOrString(13);

    assertThat(intOrString1.equals(intOrString2)).isFalse();
  }

  @Test
  void whenCreatedWithInt_notEqualOneCreatedFromString() {
    IntOrString intOrString1 = new IntOrString(17);
    IntOrString intOrString2 = new IntOrString("17");

    assertThat(intOrString1.equals(intOrString2)).isFalse();
  }

  @Test
  void whenCreatedWithString_isNotInteger() {
    IntOrString intOrString = new IntOrString("17");

    assertThat(intOrString.isInteger()).isFalse();
  }

  @Test
  void whenCreatedWithInt_cannotRetrieveIntValue() {
    IntOrString intOrString = new IntOrString("17");
    assertThatThrownBy(intOrString::getIntValue).isInstanceOf(IllegalStateException.class);
  }

  @Test
  void whenCreatedWithString_canRetrieveStringValue() {
    IntOrString intOrString = new IntOrString("17");

    assertThat(intOrString.getStrValue()).isEqualTo("17");
  }

  @Test
  void whenCreatedWithString_equalsItself() {
    IntOrString intOrString = new IntOrString("17");

    assertThat(intOrString.equals(intOrString)).isTrue();
  }

  @Test
  void whenCreatedWithString_equalsAnotherWithSameValue() {
    IntOrString intOrString1 = new IntOrString("17");
    IntOrString intOrString2 = new IntOrString("17");

    assertThat(intOrString1.equals(intOrString2)).isTrue();
  }

  @Test
  void whenCreatedWithString_notEqualAnotherWithDifferentValue() {
    IntOrString intOrString1 = new IntOrString("17");
    IntOrString intOrString2 = new IntOrString("13");

    assertThat(intOrString1.equals(intOrString2)).isFalse();
  }

  @Test
  void jacksonSerializer_writeValueAsString() throws JsonProcessingException {
    IntOrString intOrString1 = new IntOrString(17);
    IntOrString intOrString2 = new IntOrString("17");

    ObjectMapper mapper = new ObjectMapper();
    mapper.writeValueAsString(intOrString1);
    mapper.writeValueAsString(intOrString2);
  }
}
