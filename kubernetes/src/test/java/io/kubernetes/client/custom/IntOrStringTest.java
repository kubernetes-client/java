package io.kubernetes.client.custom;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

public class IntOrStringTest {
  @Test
  public void whenCreatedWithInt_isInteger() {
    IntOrString intOrString = new IntOrString(17);

    assertThat(intOrString.isInteger(), is(true));
  }

  @Test
  public void whenCreatedWithInt_canRetrieveIntValue() {
    IntOrString intOrString = new IntOrString(17);

    assertThat(intOrString.getIntValue(), equalTo(17));
  }

  @Test(expected = IllegalStateException.class)
  public void whenCreatedWithInt_cannotRetrieveStringValue() {
    IntOrString intOrString = new IntOrString(17);

    intOrString.getStrValue();
  }

  @Test
  public void whenCreatedWithInt_equalsItself() {
    IntOrString intOrString = new IntOrString(17);

    assertThat(intOrString, equalTo(intOrString));
  }

  @Test
  public void whenCreatedWithInt_equalsAnotherWithSameValue() {
    IntOrString intOrString1 = new IntOrString(17);
    IntOrString intOrString2 = new IntOrString(17);

    assertThat(intOrString1, equalTo(intOrString2));
  }

  @Test
  public void whenCreatedWithInt_notEqualAnotherWithDifferentValue() {
    IntOrString intOrString1 = new IntOrString(17);
    IntOrString intOrString2 = new IntOrString(13);

    assertThat(intOrString1, not(equalTo(intOrString2)));
  }

  @Test
  public void whenCreatedWithInt_notEqualOneCreatedFromString() {
    IntOrString intOrString1 = new IntOrString(17);
    IntOrString intOrString2 = new IntOrString("17");

    assertThat(intOrString1, not(equalTo(intOrString2)));
  }

  @Test
  public void whenCreatedWithString_isNotInteger() {
    IntOrString intOrString = new IntOrString("17");

    assertThat(intOrString.isInteger(), is(false));
  }

  @Test(expected = IllegalStateException.class)
  public void whenCreatedWithInt_cannotRetrieveIntValue() {
    IntOrString intOrString = new IntOrString("17");

    intOrString.getIntValue();
  }

  @Test
  public void whenCreatedWithString_canRetrieveStringValue() {
    IntOrString intOrString = new IntOrString("17");

    assertThat(intOrString.getStrValue(), equalTo("17"));
  }

  @Test
  public void whenCreatedWithString_equalsItself() {
    IntOrString intOrString = new IntOrString("17");

    assertThat(intOrString, equalTo(intOrString));
  }

  @Test
  public void whenCreatedWithString_equalsAnotherWithSameValue() {
    IntOrString intOrString1 = new IntOrString("17");
    IntOrString intOrString2 = new IntOrString("17");

    assertThat(intOrString1, equalTo(intOrString2));
  }

  @Test
  public void whenCreatedWithString_notEqualAnotherWithDifferentValue() {
    IntOrString intOrString1 = new IntOrString("17");
    IntOrString intOrString2 = new IntOrString("13");

    assertThat(intOrString1, not(equalTo(intOrString2)));
  }


}