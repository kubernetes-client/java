package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1LabelSelectorRequirementFluentImpl<A extends V1LabelSelectorRequirementFluent<A>> extends BaseFluent<A> implements V1LabelSelectorRequirementFluent<A>{
  public V1LabelSelectorRequirementFluentImpl() {
  }
  public V1LabelSelectorRequirementFluentImpl(V1LabelSelectorRequirement instance) {
    this.withKey(instance.getKey());

    this.withOperator(instance.getOperator());

    this.withValues(instance.getValues());

  }
  private String key;
  private String operator;
  private List<String> values;
  public String getKey() {
    return this.key;
  }
  public A withKey(String key) {
    this.key=key; return (A) this;
  }
  public Boolean hasKey() {
    return this.key != null;
  }
  public String getOperator() {
    return this.operator;
  }
  public A withOperator(String operator) {
    this.operator=operator; return (A) this;
  }
  public Boolean hasOperator() {
    return this.operator != null;
  }
  public A addToValues(Integer index,String item) {
    if (this.values == null) {this.values = new ArrayList<String>();}
    this.values.add(index, item);
    return (A)this;
  }
  public A setToValues(Integer index,String item) {
    if (this.values == null) {this.values = new ArrayList<String>();}
    this.values.set(index, item); return (A)this;
  }
  public A addToValues(java.lang.String... items) {
    if (this.values == null) {this.values = new ArrayList<String>();}
    for (String item : items) {this.values.add(item);} return (A)this;
  }
  public A addAllToValues(Collection<String> items) {
    if (this.values == null) {this.values = new ArrayList<String>();}
    for (String item : items) {this.values.add(item);} return (A)this;
  }
  public A removeFromValues(java.lang.String... items) {
    for (String item : items) {if (this.values!= null){ this.values.remove(item);}} return (A)this;
  }
  public A removeAllFromValues(Collection<String> items) {
    for (String item : items) {if (this.values!= null){ this.values.remove(item);}} return (A)this;
  }
  public List<String> getValues() {
    return this.values;
  }
  public String getValue(Integer index) {
    return this.values.get(index);
  }
  public String getFirstValue() {
    return this.values.get(0);
  }
  public String getLastValue() {
    return this.values.get(values.size() - 1);
  }
  public String getMatchingValue(Predicate<String> predicate) {
    for (String item: values) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingValue(Predicate<String> predicate) {
    for (String item: values) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withValues(List<String> values) {
    if (values != null) {this.values = new ArrayList(); for (String item : values){this.addToValues(item);}} else { this.values = null;} return (A) this;
  }
  public A withValues(java.lang.String... values) {
    if (this.values != null) {this.values.clear();}
    if (values != null) {for (String item :values){ this.addToValues(item);}} return (A) this;
  }
  public Boolean hasValues() {
    return values != null && !values.isEmpty();
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1LabelSelectorRequirementFluentImpl that = (V1LabelSelectorRequirementFluentImpl) o;
    if (key != null ? !key.equals(that.key) :that.key != null) return false;
    if (operator != null ? !operator.equals(that.operator) :that.operator != null) return false;
    if (values != null ? !values.equals(that.values) :that.values != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(key,  operator,  values,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (key != null) { sb.append("key:"); sb.append(key + ","); }
    if (operator != null) { sb.append("operator:"); sb.append(operator + ","); }
    if (values != null && !values.isEmpty()) { sb.append("values:"); sb.append(values); }
    sb.append("}");
    return sb.toString();
  }
  
}