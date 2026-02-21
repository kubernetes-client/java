package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1CapacityRequestPolicyFluent<A extends io.kubernetes.client.openapi.models.V1beta1CapacityRequestPolicyFluent<A>> extends BaseFluent<A>{

  private Quantity _default;
  private V1beta1CapacityRequestPolicyRangeBuilder validRange;
  private List<Quantity> validValues;

  public V1beta1CapacityRequestPolicyFluent() {
  }
  
  public V1beta1CapacityRequestPolicyFluent(V1beta1CapacityRequestPolicy instance) {
    this.copyInstance(instance);
  }

  public A addAllToValidValues(Collection<Quantity> items) {
    if (this.validValues == null) {
      this.validValues = new ArrayList();
    }
    for (Quantity item : items) {
      this.validValues.add(item);
    }
    return (A) this;
  }
  
  public A addNewValidValue(String value) {
    return (A) this.addToValidValues(new Quantity(value));
  }
  
  public A addToValidValues(Quantity... items) {
    if (this.validValues == null) {
      this.validValues = new ArrayList();
    }
    for (Quantity item : items) {
      this.validValues.add(item);
    }
    return (A) this;
  }
  
  public A addToValidValues(int index,Quantity item) {
    if (this.validValues == null) {
      this.validValues = new ArrayList();
    }
    this.validValues.add(index, item);
    return (A) this;
  }
  
  public V1beta1CapacityRequestPolicyRange buildValidRange() {
    return this.validRange != null ? this.validRange.build() : null;
  }
  
  protected void copyInstance(V1beta1CapacityRequestPolicy instance) {
    instance = instance != null ? instance : new V1beta1CapacityRequestPolicy();
    if (instance != null) {
        this.withDefault(instance.getDefault());
        this.withValidRange(instance.getValidRange());
        this.withValidValues(instance.getValidValues());
    }
  }
  
  public ValidRangeNested<A> editOrNewValidRange() {
    return this.withNewValidRangeLike(Optional.ofNullable(this.buildValidRange()).orElse(new V1beta1CapacityRequestPolicyRangeBuilder().build()));
  }
  
  public ValidRangeNested<A> editOrNewValidRangeLike(V1beta1CapacityRequestPolicyRange item) {
    return this.withNewValidRangeLike(Optional.ofNullable(this.buildValidRange()).orElse(item));
  }
  
  public ValidRangeNested<A> editValidRange() {
    return this.withNewValidRangeLike(Optional.ofNullable(this.buildValidRange()).orElse(null));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1beta1CapacityRequestPolicyFluent that = (V1beta1CapacityRequestPolicyFluent) o;
    if (!(Objects.equals(_default, that._default))) {
      return false;
    }
    if (!(Objects.equals(validRange, that.validRange))) {
      return false;
    }
    if (!(Objects.equals(validValues, that.validValues))) {
      return false;
    }
    return true;
  }
  
  public Quantity getDefault() {
    return this._default;
  }
  
  public Quantity getFirstValidValue() {
    return this.validValues.get(0);
  }
  
  public Quantity getLastValidValue() {
    return this.validValues.get(validValues.size() - 1);
  }
  
  public Quantity getMatchingValidValue(Predicate<Quantity> predicate) {
      for (Quantity item : validValues) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public Quantity getValidValue(int index) {
    return this.validValues.get(index);
  }
  
  public List<Quantity> getValidValues() {
    return this.validValues;
  }
  
  public boolean hasDefault() {
    return this._default != null;
  }
  
  public boolean hasMatchingValidValue(Predicate<Quantity> predicate) {
      for (Quantity item : validValues) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasValidRange() {
    return this.validRange != null;
  }
  
  public boolean hasValidValues() {
    return this.validValues != null && !(this.validValues.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(_default, validRange, validValues);
  }
  
  public A removeAllFromValidValues(Collection<Quantity> items) {
    if (this.validValues == null) {
      return (A) this;
    }
    for (Quantity item : items) {
      this.validValues.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromValidValues(Quantity... items) {
    if (this.validValues == null) {
      return (A) this;
    }
    for (Quantity item : items) {
      this.validValues.remove(item);
    }
    return (A) this;
  }
  
  public A setToValidValues(int index,Quantity item) {
    if (this.validValues == null) {
      this.validValues = new ArrayList();
    }
    this.validValues.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(_default == null)) {
        sb.append("_default:");
        sb.append(_default);
        sb.append(",");
    }
    if (!(validRange == null)) {
        sb.append("validRange:");
        sb.append(validRange);
        sb.append(",");
    }
    if (!(validValues == null) && !(validValues.isEmpty())) {
        sb.append("validValues:");
        sb.append(validValues);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withDefault(Quantity _default) {
    this._default = _default;
    return (A) this;
  }
  
  public A withNewDefault(String value) {
    return (A) this.withDefault(new Quantity(value));
  }
  
  public ValidRangeNested<A> withNewValidRange() {
    return new ValidRangeNested(null);
  }
  
  public ValidRangeNested<A> withNewValidRangeLike(V1beta1CapacityRequestPolicyRange item) {
    return new ValidRangeNested(item);
  }
  
  public A withValidRange(V1beta1CapacityRequestPolicyRange validRange) {
    this._visitables.remove("validRange");
    if (validRange != null) {
        this.validRange = new V1beta1CapacityRequestPolicyRangeBuilder(validRange);
        this._visitables.get("validRange").add(this.validRange);
    } else {
        this.validRange = null;
        this._visitables.get("validRange").remove(this.validRange);
    }
    return (A) this;
  }
  
  public A withValidValues(List<Quantity> validValues) {
    if (validValues != null) {
        this.validValues = new ArrayList();
        for (Quantity item : validValues) {
          this.addToValidValues(item);
        }
    } else {
      this.validValues = null;
    }
    return (A) this;
  }
  
  public A withValidValues(Quantity... validValues) {
    if (this.validValues != null) {
        this.validValues.clear();
        _visitables.remove("validValues");
    }
    if (validValues != null) {
      for (Quantity item : validValues) {
        this.addToValidValues(item);
      }
    }
    return (A) this;
  }
  public class ValidRangeNested<N> extends V1beta1CapacityRequestPolicyRangeFluent<ValidRangeNested<N>> implements Nested<N>{
  
    V1beta1CapacityRequestPolicyRangeBuilder builder;
  
    ValidRangeNested(V1beta1CapacityRequestPolicyRange item) {
      this.builder = new V1beta1CapacityRequestPolicyRangeBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta1CapacityRequestPolicyFluent.this.withValidRange(builder.build());
    }
    
    public N endValidRange() {
      return and();
    }
    
  }
}