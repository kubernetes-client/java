package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1RoleBindingFluent<A extends io.kubernetes.client.openapi.models.V1RoleBindingFluent<A>> extends BaseFluent<A>{

  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1RoleRefBuilder roleRef;
  private ArrayList<RbacV1SubjectBuilder> subjects;

  public V1RoleBindingFluent() {
  }
  
  public V1RoleBindingFluent(V1RoleBinding instance) {
    this.copyInstance(instance);
  }

  public A addAllToSubjects(Collection<RbacV1Subject> items) {
    if (this.subjects == null) {
      this.subjects = new ArrayList();
    }
    for (RbacV1Subject item : items) {
        RbacV1SubjectBuilder builder = new RbacV1SubjectBuilder(item);
        _visitables.get("subjects").add(builder);
        this.subjects.add(builder);
    }
    return (A) this;
  }
  
  public SubjectsNested<A> addNewSubject() {
    return new SubjectsNested(-1, null);
  }
  
  public SubjectsNested<A> addNewSubjectLike(RbacV1Subject item) {
    return new SubjectsNested(-1, item);
  }
  
  public A addToSubjects(RbacV1Subject... items) {
    if (this.subjects == null) {
      this.subjects = new ArrayList();
    }
    for (RbacV1Subject item : items) {
        RbacV1SubjectBuilder builder = new RbacV1SubjectBuilder(item);
        _visitables.get("subjects").add(builder);
        this.subjects.add(builder);
    }
    return (A) this;
  }
  
  public A addToSubjects(int index,RbacV1Subject item) {
    if (this.subjects == null) {
      this.subjects = new ArrayList();
    }
    RbacV1SubjectBuilder builder = new RbacV1SubjectBuilder(item);
    if (index < 0 || index >= subjects.size()) {
        _visitables.get("subjects").add(builder);
        subjects.add(builder);
    } else {
        _visitables.get("subjects").add(builder);
        subjects.add(index, builder);
    }
    return (A) this;
  }
  
  public RbacV1Subject buildFirstSubject() {
    return this.subjects.get(0).build();
  }
  
  public RbacV1Subject buildLastSubject() {
    return this.subjects.get(subjects.size() - 1).build();
  }
  
  public RbacV1Subject buildMatchingSubject(Predicate<RbacV1SubjectBuilder> predicate) {
      for (RbacV1SubjectBuilder item : subjects) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public V1RoleRef buildRoleRef() {
    return this.roleRef != null ? this.roleRef.build() : null;
  }
  
  public RbacV1Subject buildSubject(int index) {
    return this.subjects.get(index).build();
  }
  
  public List<RbacV1Subject> buildSubjects() {
    return this.subjects != null ? build(subjects) : null;
  }
  
  protected void copyInstance(V1RoleBinding instance) {
    instance = instance != null ? instance : new V1RoleBinding();
    if (instance != null) {
        this.withApiVersion(instance.getApiVersion());
        this.withKind(instance.getKind());
        this.withMetadata(instance.getMetadata());
        this.withRoleRef(instance.getRoleRef());
        this.withSubjects(instance.getSubjects());
    }
  }
  
  public SubjectsNested<A> editFirstSubject() {
    if (subjects.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "subjects"));
    }
    return this.setNewSubjectLike(0, this.buildSubject(0));
  }
  
  public SubjectsNested<A> editLastSubject() {
    int index = subjects.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "subjects"));
    }
    return this.setNewSubjectLike(index, this.buildSubject(index));
  }
  
  public SubjectsNested<A> editMatchingSubject(Predicate<RbacV1SubjectBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < subjects.size();i++) {
      if (predicate.test(subjects.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "subjects"));
    }
    return this.setNewSubjectLike(index, this.buildSubject(index));
  }
  
  public MetadataNested<A> editMetadata() {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(item));
  }
  
  public RoleRefNested<A> editOrNewRoleRef() {
    return this.withNewRoleRefLike(Optional.ofNullable(this.buildRoleRef()).orElse(new V1RoleRefBuilder().build()));
  }
  
  public RoleRefNested<A> editOrNewRoleRefLike(V1RoleRef item) {
    return this.withNewRoleRefLike(Optional.ofNullable(this.buildRoleRef()).orElse(item));
  }
  
  public RoleRefNested<A> editRoleRef() {
    return this.withNewRoleRefLike(Optional.ofNullable(this.buildRoleRef()).orElse(null));
  }
  
  public SubjectsNested<A> editSubject(int index) {
    if (subjects.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "subjects"));
    }
    return this.setNewSubjectLike(index, this.buildSubject(index));
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
    V1RoleBindingFluent that = (V1RoleBindingFluent) o;
    if (!(Objects.equals(apiVersion, that.apiVersion))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(metadata, that.metadata))) {
      return false;
    }
    if (!(Objects.equals(roleRef, that.roleRef))) {
      return false;
    }
    if (!(Objects.equals(subjects, that.subjects))) {
      return false;
    }
    return true;
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public boolean hasMatchingSubject(Predicate<RbacV1SubjectBuilder> predicate) {
      for (RbacV1SubjectBuilder item : subjects) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public boolean hasRoleRef() {
    return this.roleRef != null;
  }
  
  public boolean hasSubjects() {
    return this.subjects != null && !(this.subjects.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, roleRef, subjects);
  }
  
  public A removeAllFromSubjects(Collection<RbacV1Subject> items) {
    if (this.subjects == null) {
      return (A) this;
    }
    for (RbacV1Subject item : items) {
        RbacV1SubjectBuilder builder = new RbacV1SubjectBuilder(item);
        _visitables.get("subjects").remove(builder);
        this.subjects.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromSubjects(RbacV1Subject... items) {
    if (this.subjects == null) {
      return (A) this;
    }
    for (RbacV1Subject item : items) {
        RbacV1SubjectBuilder builder = new RbacV1SubjectBuilder(item);
        _visitables.get("subjects").remove(builder);
        this.subjects.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromSubjects(Predicate<RbacV1SubjectBuilder> predicate) {
    if (subjects == null) {
      return (A) this;
    }
    Iterator<RbacV1SubjectBuilder> each = subjects.iterator();
    List visitables = _visitables.get("subjects");
    while (each.hasNext()) {
        RbacV1SubjectBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public SubjectsNested<A> setNewSubjectLike(int index,RbacV1Subject item) {
    return new SubjectsNested(index, item);
  }
  
  public A setToSubjects(int index,RbacV1Subject item) {
    if (this.subjects == null) {
      this.subjects = new ArrayList();
    }
    RbacV1SubjectBuilder builder = new RbacV1SubjectBuilder(item);
    if (index < 0 || index >= subjects.size()) {
        _visitables.get("subjects").add(builder);
        subjects.add(builder);
    } else {
        _visitables.get("subjects").add(builder);
        subjects.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiVersion == null)) {
        sb.append("apiVersion:");
        sb.append(apiVersion);
        sb.append(",");
    }
    if (!(kind == null)) {
        sb.append("kind:");
        sb.append(kind);
        sb.append(",");
    }
    if (!(metadata == null)) {
        sb.append("metadata:");
        sb.append(metadata);
        sb.append(",");
    }
    if (!(roleRef == null)) {
        sb.append("roleRef:");
        sb.append(roleRef);
        sb.append(",");
    }
    if (!(subjects == null) && !(subjects.isEmpty())) {
        sb.append("subjects:");
        sb.append(subjects);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public A withMetadata(V1ObjectMeta metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new V1ObjectMetaBuilder(metadata);
        this._visitables.get("metadata").add(this.metadata);
    } else {
        this.metadata = null;
        this._visitables.get("metadata").remove(this.metadata);
    }
    return (A) this;
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new MetadataNested(item);
  }
  
  public RoleRefNested<A> withNewRoleRef() {
    return new RoleRefNested(null);
  }
  
  public RoleRefNested<A> withNewRoleRefLike(V1RoleRef item) {
    return new RoleRefNested(item);
  }
  
  public A withRoleRef(V1RoleRef roleRef) {
    this._visitables.remove("roleRef");
    if (roleRef != null) {
        this.roleRef = new V1RoleRefBuilder(roleRef);
        this._visitables.get("roleRef").add(this.roleRef);
    } else {
        this.roleRef = null;
        this._visitables.get("roleRef").remove(this.roleRef);
    }
    return (A) this;
  }
  
  public A withSubjects(List<RbacV1Subject> subjects) {
    if (this.subjects != null) {
      this._visitables.get("subjects").clear();
    }
    if (subjects != null) {
        this.subjects = new ArrayList();
        for (RbacV1Subject item : subjects) {
          this.addToSubjects(item);
        }
    } else {
      this.subjects = null;
    }
    return (A) this;
  }
  
  public A withSubjects(RbacV1Subject... subjects) {
    if (this.subjects != null) {
        this.subjects.clear();
        _visitables.remove("subjects");
    }
    if (subjects != null) {
      for (RbacV1Subject item : subjects) {
        this.addToSubjects(item);
      }
    }
    return (A) this;
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
  
    V1ObjectMetaBuilder builder;
  
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
  
    public N and() {
      return (N) V1RoleBindingFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  }
  public class RoleRefNested<N> extends V1RoleRefFluent<RoleRefNested<N>> implements Nested<N>{
  
    V1RoleRefBuilder builder;
  
    RoleRefNested(V1RoleRef item) {
      this.builder = new V1RoleRefBuilder(this, item);
    }
  
    public N and() {
      return (N) V1RoleBindingFluent.this.withRoleRef(builder.build());
    }
    
    public N endRoleRef() {
      return and();
    }
    
  }
  public class SubjectsNested<N> extends RbacV1SubjectFluent<SubjectsNested<N>> implements Nested<N>{
  
    RbacV1SubjectBuilder builder;
    int index;
  
    SubjectsNested(int index,RbacV1Subject item) {
      this.index = index;
      this.builder = new RbacV1SubjectBuilder(this, item);
    }
  
    public N and() {
      return (N) V1RoleBindingFluent.this.setToSubjects(index, builder.build());
    }
    
    public N endSubject() {
      return and();
    }
    
  }
}