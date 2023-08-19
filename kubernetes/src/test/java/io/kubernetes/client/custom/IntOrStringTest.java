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

import static org.junit.Assert.*;

import org.junit.Test;

public class IntOrStringTest {
  @Test
  public void whenCreatedWithInt_isInteger() {
    IntOrString intOrString = new IntOrString(17);

    assertTrue("When Created with Int check for integer value", intOrString.isInteger());
  }

  @Test
  public void whenCreatedWithInt_canRetrieveIntValue() {
    String string17= "17";
    IntOrString intOrString = new IntOrString(string17);

    assertEquals("When created with Int can retrieve Int value ",intOrString.getIntValue(), Integer.getInteger(string17));
  }

  @Test(expected = IllegalStateException.class)
  public void whenCreatedWithInt_cannotRetrieveStringValue() {
    IntOrString intOrString = new IntOrString(17);

    intOrString.getStrValue();
  }

  @Test
  public void whenCreatedWithInt_equalsItself() {
    IntOrString intOrString = new IntOrString(17);

    assertEquals("when created with int, check equals Itself",intOrString, intOrString );
  }

  @Test
  public void whenCreatedWithInt_equalsAnotherWithSameValue() {
    IntOrString intOrString1 = new IntOrString(17);
    IntOrString intOrString2 = new IntOrString(17);
    assertEquals("when created with Int check equality with another with same value",intOrString1, intOrString2);
  }

  @Test
  public void whenCreatedWithInt_notEqualAnotherWithDifferentValue() {
    IntOrString intOrString1 = new IntOrString(17);
    IntOrString intOrString2 = new IntOrString(13);

    assertNotEquals("when created with Int check in-equality with another with different value",intOrString1, intOrString2);
  }

  @Test
  public void whenCreatedWithInt_notEqualOneCreatedFromString() {
    IntOrString intOrString1 = new IntOrString(17);
    IntOrString intOrString2 = new IntOrString("17");

    assertNotEquals("when created with Int check in-equality with another with same string value",intOrString1, intOrString2);
  }

  @Test
  public void whenCreatedWithString_isNotInteger() {
    IntOrString intOrString = new IntOrString("17");

    assertFalse("when created with string is not Integer",intOrString.isInteger());
  }

  @Test(expected = IllegalStateException.class)
  public void whenCreatedWithInt_cannotRetrieveIntValue() {
    IntOrString intOrString = new IntOrString("17");

    intOrString.getIntValue();
  }

  @Test
  public void whenCreatedWithString_canRetrieveStringValue() {
    String string17 = "17";
    IntOrString intOrString = new IntOrString(string17);

    assertEquals("when created with String can retrieve String value",intOrString.getStrValue(), string17);
  }

  @Test
  public void whenCreatedWithString_equalsItself() {
    IntOrString intOrString = new IntOrString("17");

    assertEquals("when Created With String value check equals with Itself ",intOrString, intOrString);
  }

  @Test
  public void whenCreatedWithString_equalsAnotherWithSameValue() {
    IntOrString intOrString1 = new IntOrString("17");
    IntOrString intOrString2 = new IntOrString("17");

    assertEquals("when Created With String value check equals with other with same value ",intOrString1, intOrString2);
  }

  @Test
  public void whenCreatedWithString_notEqualAnotherWithDifferentValue() {
    IntOrString intOrString1 = new IntOrString("17");
    IntOrString intOrString2 = new IntOrString("13");

    assertNotEquals("when Created With String value check equals with other with different value ",intOrString1, intOrString2);
  }
}
