package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1PodCertificateRequestStatusFluent<A extends io.kubernetes.client.openapi.models.V1alpha1PodCertificateRequestStatusFluent<A>> extends BaseFluent<A>{

  private OffsetDateTime beginRefreshAt;
  private String certificateChain;
  private ArrayList<V1ConditionBuilder> conditions;
  private OffsetDateTime notAfter;
  private OffsetDateTime notBefore;

  public V1alpha1PodCertificateRequestStatusFluent() {
  }
  
  public V1alpha1PodCertificateRequestStatusFluent(V1alpha1PodCertificateRequestStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToConditions(Collection<V1Condition> items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1Condition item) {
    return new ConditionsNested(-1, item);
  }
  
  public A addToConditions(V1Condition... items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addToConditions(int index,V1Condition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1ConditionBuilder builder = new V1ConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.add(index, builder);
    }
    return (A) this;
  }
  
  public V1Condition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public List<V1Condition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1Condition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1Condition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1Condition buildMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
      for (V1ConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1alpha1PodCertificateRequestStatus instance) {
    instance = instance != null ? instance : new V1alpha1PodCertificateRequestStatus();
    if (instance != null) {
        this.withBeginRefreshAt(instance.getBeginRefreshAt());
        this.withCertificateChain(instance.getCertificateChain());
        this.withConditions(instance.getConditions());
        this.withNotAfter(instance.getNotAfter());
        this.withNotBefore(instance.getNotBefore());
    }
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(0, this.buildCondition(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < conditions.size();i++) {
      if (predicate.test(conditions.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
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
    V1alpha1PodCertificateRequestStatusFluent that = (V1alpha1PodCertificateRequestStatusFluent) o;
    if (!(Objects.equals(beginRefreshAt, that.beginRefreshAt))) {
      return false;
    }
    if (!(Objects.equals(certificateChain, that.certificateChain))) {
      return false;
    }
    if (!(Objects.equals(conditions, that.conditions))) {
      return false;
    }
    if (!(Objects.equals(notAfter, that.notAfter))) {
      return false;
    }
    if (!(Objects.equals(notBefore, that.notBefore))) {
      return false;
    }
    return true;
  }
  
  public OffsetDateTime getBeginRefreshAt() {
    return this.beginRefreshAt;
  }
  
  public String getCertificateChain() {
    return this.certificateChain;
  }
  
  public OffsetDateTime getNotAfter() {
    return this.notAfter;
  }
  
  public OffsetDateTime getNotBefore() {
    return this.notBefore;
  }
  
  public boolean hasBeginRefreshAt() {
    return this.beginRefreshAt != null;
  }
  
  public boolean hasCertificateChain() {
    return this.certificateChain != null;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !(this.conditions.isEmpty());
  }
  
  public boolean hasMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
      for (V1ConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasNotAfter() {
    return this.notAfter != null;
  }
  
  public boolean hasNotBefore() {
    return this.notBefore != null;
  }
  
  public int hashCode() {
    return Objects.hash(beginRefreshAt, certificateChain, conditions, notAfter, notBefore);
  }
  
  public A removeAllFromConditions(Collection<V1Condition> items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromConditions(V1Condition... items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1ConditionBuilder> predicate) {
    if (conditions == null) {
      return (A) this;
    }
    Iterator<V1ConditionBuilder> each = conditions.iterator();
    List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
        V1ConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1Condition item) {
    return new ConditionsNested(index, item);
  }
  
  public A setToConditions(int index,V1Condition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1ConditionBuilder builder = new V1ConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(beginRefreshAt == null)) {
        sb.append("beginRefreshAt:");
        sb.append(beginRefreshAt);
        sb.append(",");
    }
    if (!(certificateChain == null)) {
        sb.append("certificateChain:");
        sb.append(certificateChain);
        sb.append(",");
    }
    if (!(conditions == null) && !(conditions.isEmpty())) {
        sb.append("conditions:");
        sb.append(conditions);
        sb.append(",");
    }
    if (!(notAfter == null)) {
        sb.append("notAfter:");
        sb.append(notAfter);
        sb.append(",");
    }
    if (!(notBefore == null)) {
        sb.append("notBefore:");
        sb.append(notBefore);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withBeginRefreshAt(OffsetDateTime beginRefreshAt) {
    this.beginRefreshAt = beginRefreshAt;
    return (A) this;
  }
  
  public A withCertificateChain(String certificateChain) {
    this.certificateChain = certificateChain;
    return (A) this;
  }
  
  public A withConditions(List<V1Condition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1Condition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(V1Condition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1Condition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  
  public A withNotAfter(OffsetDateTime notAfter) {
    this.notAfter = notAfter;
    return (A) this;
  }
  
  public A withNotBefore(OffsetDateTime notBefore) {
    this.notBefore = notBefore;
    return (A) this;
  }
  public class ConditionsNested<N> extends V1ConditionFluent<ConditionsNested<N>> implements Nested<N>{
  
    V1ConditionBuilder builder;
    int index;
  
    ConditionsNested(int index,V1Condition item) {
      this.index = index;
      this.builder = new V1ConditionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha1PodCertificateRequestStatusFluent.this.setToConditions(index, builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  }
}