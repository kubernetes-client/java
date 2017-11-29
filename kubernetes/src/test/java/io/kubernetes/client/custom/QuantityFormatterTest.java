package io.kubernetes.client.custom;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class QuantityFormatterTest {

    @Test
    public void testParsePlain() {
        final Quantity quantity = new QuantityFormatter().parse("1");
        assertThat(quantity.getFormat(), is(Quantity.Format.DECIMAL_SI));
        assertThat(quantity.getNumber(), is(BigDecimal.valueOf(1)));
    }

    @Test
    public void testParseFractional() {
        final Quantity quantity = new QuantityFormatter().parse("0.001");
        assertThat(quantity.getFormat(), is(Quantity.Format.DECIMAL_SI));
        assertThat(quantity.getNumber(), is(BigDecimal.valueOf(0.001)));
    }

    @Test
    public void testParseFractionalUnit() {
        final Quantity quantity = new QuantityFormatter().parse("0.001m");
        assertThat(quantity.getFormat(), is(Quantity.Format.DECIMAL_SI));
        assertThat(quantity.getNumber(), is(new BigDecimal("0.000001")));
    }

    @Test
    public void testParseBinarySi() {
        final Quantity quantity = new QuantityFormatter().parse("1Ki");
        assertThat(quantity.getFormat(), is(Quantity.Format.BINARY_SI));
        assertThat(quantity.getNumber(), is(BigDecimal.valueOf(1024)));
    }

    @Test
    public void testParseLargeNumeratorBinarySi() {
        final Quantity quantity = new QuantityFormatter().parse("32Mi");
        assertThat(quantity.getFormat(), is(Quantity.Format.BINARY_SI));
        assertThat(quantity.getNumber(), is(BigDecimal.valueOf(2).pow(20).multiply(BigDecimal.valueOf(32))));
    }

    @Test
    public void testParseExponent() {
        final Quantity quantity = new QuantityFormatter().parse("1e3");
        assertThat(quantity.getFormat(), is(Quantity.Format.DECIMAL_EXPONENT));
        assertThat(quantity.getNumber(), is(BigDecimal.valueOf(1000)));
    }

    @Test
    public void testParseNegativeExponent() {
        final Quantity quantity = new QuantityFormatter().parse("1e-3");
        assertThat(quantity.getFormat(), is(Quantity.Format.DECIMAL_EXPONENT));
        assertThat(quantity.getNumber(), is(BigDecimal.valueOf(0.001)));
    }

    @Test(expected = QuantityFormatException.class)
    public void testParseBad() {
        new QuantityFormatter().parse("4e9e");
    }

    @Test
    public void testFormatPlain() {
        final String formattedString = new QuantityFormatter().format(new Quantity(new BigDecimal("100"), Quantity.Format.DECIMAL_SI));
        assertThat(formattedString, is("100"));
    }

    @Test
    public void testFormatDecimalSi() {
        final String formattedString = new QuantityFormatter().format(new Quantity(new BigDecimal("100000"), Quantity.Format.DECIMAL_SI));
        assertThat(formattedString, is("100k"));
    }

    @Test
    public void testFormatFractionalDecimalSi() {
        final String formattedString = new QuantityFormatter().format(new Quantity(new BigDecimal("100.001"), Quantity.Format.DECIMAL_SI));
        assertThat(formattedString, is("100001m"));
    }

    @Test
    public void testFormatBinarySi() {
        final String formattedString = new QuantityFormatter().format(new Quantity(new BigDecimal(2).pow(20), Quantity.Format.BINARY_SI));
        assertThat(formattedString, is("1Mi"));
    }

    @Test
    public void testFormatLessThan1024BinarySi() {
        final String formattedString = new QuantityFormatter().format(new Quantity(BigDecimal.valueOf(128), Quantity.Format.BINARY_SI));
        assertThat(formattedString, is("128"));
    }

    @Test
    public void testFormatNon1024BinarySi() {
        final String formattedString = new QuantityFormatter().format(new Quantity(BigDecimal.valueOf(2056), Quantity.Format.BINARY_SI));
        assertThat(formattedString, is("2056"));
    }

    @Test
    public void testFormatFractionalBinarySi() {
        final String formattedString = new QuantityFormatter().format(new Quantity(BigDecimal.valueOf(123.123), Quantity.Format.BINARY_SI));
        assertThat(formattedString, is("123123m"));
    }

    @Test
    public void testFormatDecimalExponent() {
        final String formattedString = new QuantityFormatter().format(new Quantity(BigDecimal.valueOf(1000000), Quantity.Format.DECIMAL_EXPONENT));
        assertThat(formattedString, is("1e6"));
    }

    @Test
    public void testFormatEnforceExpOf3DecimalExponent() {
        final String formattedString = new QuantityFormatter().format(new Quantity(BigDecimal.valueOf(100000), Quantity.Format.DECIMAL_EXPONENT));
        assertThat(formattedString, is("100e3"));
    }

    @Test
    public void testFormatNoExpDecimalExponent() {
        final String formattedString = new QuantityFormatter().format(new Quantity(BigDecimal.valueOf(12345), Quantity.Format.DECIMAL_EXPONENT));
        assertThat(formattedString, is("12345"));
    }

}
