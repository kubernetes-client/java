package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1RoleBindingFluentImpl<A extends V1RoleBindingFluent<A>> extends BaseFluent<A> implements V1RoleBindingFluent<A>{
  public V1RoleBindingFluentImpl() {
  }
  public V1RoleBindingFluentImpl(V1RoleBinding instance) {
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withRoleRef(instance.getRoleRef());
      this.withSubjects(instance.getSubjects());
    }
  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1RoleRefBuilder roleRef;
  private ArrayList<V1SubjectBuilder> subjects;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ObjectMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V1RoleBindingFluentImpl.MetadataNested<A> withNewMetadata() {
    return new V1RoleBindingFluentImpl.MetadataNestedImpl();
  }
  public V1RoleBindingFluentImpl.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1RoleBindingFluentImpl.MetadataNestedImpl(item);
  }
  public V1RoleBindingFluentImpl.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1RoleBindingFluentImpl.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1RoleBindingFluentImpl.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildRoleRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1RoleRef getRoleRef() {
    return this.roleRef!=null ?this.roleRef.build():null;
  }
  public V1RoleRef buildRoleRef() {
    return this.roleRef!=null ?this.roleRef.build():null;
  }
  public A withRoleRef(V1RoleRef roleRef) {
    _visitables.get("roleRef").remove(this.roleRef);
    if (roleRef!=null){ this.roleRef= new V1RoleRefBuilder(roleRef); _visitables.get("roleRef").add(this.roleRef);} else { this.roleRef = null; _visitables.get("roleRef").remove(this.roleRef); } return (A) this;
  }
  public Boolean hasRoleRef() {
    return this.roleRef != null;
  }
  public V1RoleBindingFluentImpl.RoleRefNested<A> withNewRoleRef() {
    return new V1RoleBindingFluentImpl.RoleRefNestedImpl();
  }
  public V1RoleBindingFluentImpl.RoleRefNested<A> withNewRoleRefLike(V1RoleRef item) {
    return new V1RoleBindingFluentImpl.RoleRefNestedImpl(item);
  }
  public V1RoleBindingFluentImpl.RoleRefNested<A> editRoleRef() {
    return withNewRoleRefLike(getRoleRef());
  }
  public V1RoleBindingFluentImpl.RoleRefNested<A> editOrNewRoleRef() {
    return withNewRoleRefLike(getRoleRef() != null ? getRoleRef(): new V1RoleRefBuilder().build());
  }
  public V1RoleBindingFluentImpl.RoleRefNested<A> editOrNewRoleRefLike(V1RoleRef item) {
    return withNewRoleRefLike(getRoleRef() != null ? getRoleRef(): item);
  }
  public A addToSubjects(int index,V1Subject item) {
    if (this.subjects == null) {this.subjects = new ArrayList<V1SubjectBuilder>();}
    V1SubjectBuilder builder = new V1SubjectBuilder(item);
    if (index < 0 || index >= subjects.size()) { _visitables.get("subjects").add(builder); subjects.add(builder); } else { _visitables.get("subjects").add(index, builder); subjects.add(index, builder);}
    return (A)this;
  }
  public A setToSubjects(int index,V1Subject item) {
    if (this.subjects == null) {this.subjects = new ArrayList<V1SubjectBuilder>();}
    V1SubjectBuilder builder = new V1SubjectBuilder(item);
    if (index < 0 || index >= subjects.size()) { _visitables.get("subjects").add(builder); subjects.add(builder); } else { _visitables.get("subjects").set(index, builder); subjects.set(index, builder);}
    return (A)this;
  }
  public A addToSubjects(io.kubernetes.client.openapi.models.V1Subject... items) {
    if (this.subjects == null) {this.subjects = new ArrayList<V1SubjectBuilder>();}
    for (V1Subject item : items) {V1SubjectBuilder builder = new V1SubjectBuilder(item);_visitables.get("subjects").add(builder);this.subjects.add(builder);} return (A)this;
  }
  public A addAllToSubjects(Collection<V1Subject> items) {
    if (this.subjects == null) {this.subjects = new ArrayList<V1SubjectBuilder>();}
    for (V1Subject item : items) {V1SubjectBuilder builder = new V1SubjectBuilder(item);_visitables.get("subjects").add(builder);this.subjects.add(builder);} return (A)this;
  }
  public A removeFromSubjects(io.kubernetes.client.openapi.models.V1Subject... items) {
    for (V1Subject item : items) {V1SubjectBuilder builder = new V1SubjectBuilder(item);_visitables.get("subjects").remove(builder);if (this.subjects != null) {this.subjects.remove(builder);}} return (A)this;
  }
  public A removeAllFromSubjects(Collection<V1Subject> items) {
    for (V1Subject item : items) {V1SubjectBuilder builder = new V1SubjectBuilder(item);_visitables.get("subjects").remove(builder);if (this.subjects != null) {this.subjects.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromSubjects(Predicate<V1SubjectBuilder> predicate) {
    if (subjects == null) return (A) this;
    final Iterator<V1SubjectBuilder> each = subjects.iterator();
    final List visitables = _visitables.get("subjects");
    while (each.hasNext()) {
      V1SubjectBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildSubjects instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Subject> getSubjects() {
    return subjects != null ? build(subjects) : null;
  }
  public List<V1Subject> buildSubjects() {
    return subjects != null ? build(subjects) : null;
  }
  public V1Subject buildSubject(int index) {
    return this.subjects.get(index).build();
  }
  public V1Subject buildFirstSubject() {
    return this.subjects.get(0).build();
  }
  public V1Subject buildLastSubject() {
    return this.subjects.get(subjects.size() - 1).build();
  }
  public V1Subject buildMatchingSubject(Predicate<V1SubjectBuilder> predicate) {
    for (V1SubjectBuilder item: subjects) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingSubject(Predicate<V1SubjectBuilder> predicate) {
    for (V1SubjectBuilder item: subjects) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withSubjects(List<V1Subject> subjects) {
    if (this.subjects != null) { _visitables.get("subjects").clear();}
    if (subjects != null) {this.subjects = new ArrayList(); for (V1Subject item : subjects){this.addToSubjects(item);}} else { this.subjects = null;} return (A) this;
  }
  public A withSubjects(io.kubernetes.client.openapi.models.V1Subject... subjects) {
    if (this.subjects != null) {this.subjects.clear(); _visitables.remove("subjects"); }
    if (subjects != null) {for (V1Subject item :subjects){ this.addToSubjects(item);}} return (A) this;
  }
  public Boolean hasSubjects() {
    return subjects != null && !subjects.isEmpty();
  }
  public V1RoleBindingFluentImpl.SubjectsNested<A> addNewSubject() {
    return new V1RoleBindingFluentImpl.SubjectsNestedImpl();
  }
  public V1RoleBindingFluentImpl.SubjectsNested<A> addNewSubjectLike(V1Subject item) {
    return new V1RoleBindingFluentImpl.SubjectsNestedImpl(-1, item);
  }
  public V1RoleBindingFluentImpl.SubjectsNested<A> setNewSubjectLike(int index,V1Subject item) {
    return new V1RoleBindingFluentImpl.SubjectsNestedImpl(index, item);
  }
  public V1RoleBindingFluentImpl.SubjectsNested<A> editSubject(int index) {
    if (subjects.size() <= index) throw new RuntimeException("Can't edit subjects. Index exceeds size.");
    return setNewSubjectLike(index, buildSubject(index));
  }
  public V1RoleBindingFluentImpl.SubjectsNested<A> editFirstSubject() {
    if (subjects.size() == 0) throw new RuntimeException("Can't edit first subjects. The list is empty.");
    return setNewSubjectLike(0, buildSubject(0));
  }
  public V1RoleBindingFluentImpl.SubjectsNested<A> editLastSubject() {
    int index = subjects.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last subjects. The list is empty.");
    return setNewSubjectLike(index, buildSubject(index));
  }
  public V1RoleBindingFluentImpl.SubjectsNested<A> editMatchingSubject(Predicate<V1SubjectBuilder> predicate) {
    int index = -1;
    for (int i=0;i<subjects.size();i++) { 
    if (predicate.test(subjects.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching subjects. No match found.");
    return setNewSubjectLike(index, buildSubject(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1RoleBindingFluentImpl that = (V1RoleBindingFluentImpl) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;

    if (!java.util.Objects.equals(kind, that.kind)) return false;

    if (!java.util.Objects.equals(metadata, that.metadata)) return false;

    if (!java.util.Objects.equals(roleRef, that.roleRef)) return false;

    if (!java.util.Objects.equals(subjects, that.subjects)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  metadata,  roleRef,  subjects,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (roleRef != null) { sb.append("roleRef:"); sb.append(roleRef + ","); }
    if (subjects != null) { sb.append("subjects:"); sb.append(subjects); }
    sb.append("}");
    return sb.toString();
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1RoleBindingFluentImpl.MetadataNested<N>> implements V1RoleBindingFluentImpl.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1RoleBindingFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class RoleRefNestedImpl<N> extends V1RoleRefFluentImpl<V1RoleBindingFluentImpl.RoleRefNested<N>> implements V1RoleBindingFluentImpl.RoleRefNested<N>,Nested<N>{
    RoleRefNestedImpl(V1RoleRef item) {
      this.builder = new V1RoleRefBuilder(this, item);
    }
    RoleRefNestedImpl() {
      this.builder = new V1RoleRefBuilder(this);
    }
    V1RoleRefBuilder builder;
    public N and() {
      return (N) V1RoleBindingFluentImpl.this.withRoleRef(builder.build());
    }
    public N endRoleRef() {
      return and();
    }
    
  }
  class SubjectsNestedImpl<N> extends V1SubjectFluentImpl<V1RoleBindingFluentImpl.SubjectsNested<N>> implements V1RoleBindingFluentImpl.SubjectsNested<N>,Nested<N>{
    SubjectsNestedImpl(int index,V1Subject item) {
      this.index = index;
      this.builder = new V1SubjectBuilder(this, item);
    }
    SubjectsNestedImpl() {
      this.index = -1;
      this.builder = new V1SubjectBuilder(this);
    }
    V1SubjectBuilder builder;
    int index;
    public N and() {
      return (N) V1RoleBindingFluentImpl.this.setToSubjects(index,builder.build());
    }
    public N endSubject() {
      return and();
    }
    
  }
  
}