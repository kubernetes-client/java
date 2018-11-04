package io.kubernetes.client.custom;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SuffixFormatterTest {

  @Test
  public void testParseBinaryKi() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("Ki");
    assertThat(baseExponent.getBase(), is(2));
    assertThat(baseExponent.getExponent(), is(10));
    assertThat(baseExponent.getFormat(), is(Quantity.Format.BINARY_SI));
  }

  @Test
  public void testParseDecimalZero() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("");
    assertThat(baseExponent.getBase(), is(10));
    assertThat(baseExponent.getExponent(), is(0));
    assertThat(baseExponent.getFormat(), is(Quantity.Format.DECIMAL_SI));
  }

  @Test
  public void testParseDecimalK() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("k");
    assertThat(baseExponent.getBase(), is(10));
    assertThat(baseExponent.getExponent(), is(3));
    assertThat(baseExponent.getFormat(), is(Quantity.Format.DECIMAL_SI));
  }

  @Test
  public void testParseDecimalExponent() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("E2");
    assertThat(baseExponent.getBase(), is(10));
    assertThat(baseExponent.getExponent(), is(2));
    assertThat(baseExponent.getFormat(), is(Quantity.Format.DECIMAL_EXPONENT));
  }

  @Test
  public void testParseDecimalExponentPositive() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("e+3");
    assertThat(baseExponent.getBase(), is(10));
    assertThat(baseExponent.getExponent(), is(3));
    assertThat(baseExponent.getFormat(), is(Quantity.Format.DECIMAL_EXPONENT));
  }

  @Test
  public void testParseDecimalExponentNegative() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("e-3");
    assertThat(baseExponent.getBase(), is(10));
    assertThat(baseExponent.getExponent(), is(-3));
    assertThat(baseExponent.getFormat(), is(Quantity.Format.DECIMAL_EXPONENT));
  }

  @Test(expected = QuantityFormatException.class)
  public void testParseBad() {
    new SuffixFormatter().parse("eKi");
  }

  @Test
  public void testFormatZeroDecimalExponent() {
    final String formattedString = new SuffixFormatter().format(Quantity.Format.DECIMAL_EXPONENT, 0);
    assertThat(formattedString, is(""));
  }

  @Test
  public void testFormatDecimalExponent() {
    final String formattedString = new SuffixFormatter().format(Quantity.Format.DECIMAL_EXPONENT, 3);
    assertThat(formattedString, is("e3"));
  }

  @Test
  public void testFormatZeroDecimalSi() {
    final String formattedString = new SuffixFormatter().format(Quantity.Format.DECIMAL_SI, 0);
    assertThat(formattedString, is(""));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFormatBadDecimalSi() {
    new SuffixFormatter().format(Quantity.Format.DECIMAL_SI, 2);
  }

  @Test
  public void testFormatDecimalSi() {
    final String formattedString = new SuffixFormatter().format(Quantity.Format.DECIMAL_SI, 3);
    assertThat(formattedString, is("k"));
  }

  @Test
  public void testFormatNegativeDecimalSi() {
    final String formattedString = new SuffixFormatter().format(Quantity.Format.DECIMAL_SI, -6);
    assertThat(formattedString, is("u"));
  }

  @Test
  public void testFormatBinarySi() {
    final String formattedString = new SuffixFormatter().format(Quantity.Format.BINARY_SI, 10);
    assertThat(formattedString, is("Ki"));
  }

  @Test
  public void testFormatNoExponentBinarySi() {
    final String formattedString = new SuffixFormatter().format(Quantity.Format.BINARY_SI, 0);
    assertThat(formattedString, is(""));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFormatBadBinarySi() {
    new SuffixFormatter().format(Quantity.Format.BINARY_SI, 4);
  }

}
