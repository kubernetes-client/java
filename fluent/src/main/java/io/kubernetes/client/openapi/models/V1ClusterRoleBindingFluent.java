package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ClusterRoleBindingFluent<A extends V1ClusterRoleBindingFluent<A>> extends BaseFluent<A>{
  public V1ClusterRoleBindingFluent() {
  }
  
  public V1ClusterRoleBindingFluent(V1ClusterRoleBinding instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1RoleRefBuilder roleRef;
  private ArrayList<RbacV1SubjectBuilder> subjects;
  
  protected void copyInstance(V1ClusterRoleBinding instance) {
    instance = (instance != null ? instance : new V1ClusterRoleBinding());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withKind(instance.getKind());
          this.withMetadata(instance.getMetadata());
          this.withRoleRef(instance.getRoleRef());
          this.withSubjects(instance.getSubjects());
        }
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
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
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new MetadataNested(item);
  }
  
  public MetadataNested<A> editMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
  }
  
  public V1RoleRef buildRoleRef() {
    return this.roleRef != null ? this.roleRef.build() : null;
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
  
  public boolean hasRoleRef() {
    return this.roleRef != null;
  }
  
  public RoleRefNested<A> withNewRoleRef() {
    return new RoleRefNested(null);
  }
  
  public RoleRefNested<A> withNewRoleRefLike(V1RoleRef item) {
    return new RoleRefNested(item);
  }
  
  public RoleRefNested<A> editRoleRef() {
    return withNewRoleRefLike(java.util.Optional.ofNullable(buildRoleRef()).orElse(null));
  }
  
  public RoleRefNested<A> editOrNewRoleRef() {
    return withNewRoleRefLike(java.util.Optional.ofNullable(buildRoleRef()).orElse(new V1RoleRefBuilder().build()));
  }
  
  public RoleRefNested<A> editOrNewRoleRefLike(V1RoleRef item) {
    return withNewRoleRefLike(java.util.Optional.ofNullable(buildRoleRef()).orElse(item));
  }
  
  public A addToSubjects(int index,RbacV1Subject item) {
    if (this.subjects == null) {this.subjects = new ArrayList<RbacV1SubjectBuilder>();}
    RbacV1SubjectBuilder builder = new RbacV1SubjectBuilder(item);
    if (index < 0 || index >= subjects.size()) { _visitables.get("subjects").add(builder); subjects.add(builder); } else { _visitables.get("subjects").add(index, builder); subjects.add(index, builder);}
    return (A)this;
  }
  
  public A setToSubjects(int index,RbacV1Subject item) {
    if (this.subjects == null) {this.subjects = new ArrayList<RbacV1SubjectBuilder>();}
    RbacV1SubjectBuilder builder = new RbacV1SubjectBuilder(item);
    if (index < 0 || index >= subjects.size()) { _visitables.get("subjects").add(builder); subjects.add(builder); } else { _visitables.get("subjects").set(index, builder); subjects.set(index, builder);}
    return (A)this;
  }
  
  public A addToSubjects(io.kubernetes.client.openapi.models.RbacV1Subject... items) {
    if (this.subjects == null) {this.subjects = new ArrayList<RbacV1SubjectBuilder>();}
    for (RbacV1Subject item : items) {RbacV1SubjectBuilder builder = new RbacV1SubjectBuilder(item);_visitables.get("subjects").add(builder);this.subjects.add(builder);} return (A)this;
  }
  
  public A addAllToSubjects(Collection<RbacV1Subject> items) {
    if (this.subjects == null) {this.subjects = new ArrayList<RbacV1SubjectBuilder>();}
    for (RbacV1Subject item : items) {RbacV1SubjectBuilder builder = new RbacV1SubjectBuilder(item);_visitables.get("subjects").add(builder);this.subjects.add(builder);} return (A)this;
  }
  
  public A removeFromSubjects(io.kubernetes.client.openapi.models.RbacV1Subject... items) {
    if (this.subjects == null) return (A)this;
    for (RbacV1Subject item : items) {RbacV1SubjectBuilder builder = new RbacV1SubjectBuilder(item);_visitables.get("subjects").remove(builder); this.subjects.remove(builder);} return (A)this;
  }
  
  public A removeAllFromSubjects(Collection<RbacV1Subject> items) {
    if (this.subjects == null) return (A)this;
    for (RbacV1Subject item : items) {RbacV1SubjectBuilder builder = new RbacV1SubjectBuilder(item);_visitables.get("subjects").remove(builder); this.subjects.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromSubjects(Predicate<RbacV1SubjectBuilder> predicate) {
    if (subjects == null) return (A) this;
    final Iterator<RbacV1SubjectBuilder> each = subjects.iterator();
    final List visitables = _visitables.get("subjects");
    while (each.hasNext()) {
      RbacV1SubjectBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<RbacV1Subject> buildSubjects() {
    return this.subjects != null ? build(subjects) : null;
  }
  
  public RbacV1Subject buildSubject(int index) {
    return this.subjects.get(index).build();
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
  
  public boolean hasMatchingSubject(Predicate<RbacV1SubjectBuilder> predicate) {
      for (RbacV1SubjectBuilder item : subjects) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
  
  public A withSubjects(io.kubernetes.client.openapi.models.RbacV1Subject... subjects) {
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
  
  public boolean hasSubjects() {
    return this.subjects != null && !this.subjects.isEmpty();
  }
  
  public SubjectsNested<A> addNewSubject() {
    return new SubjectsNested(-1, null);
  }
  
  public SubjectsNested<A> addNewSubjectLike(RbacV1Subject item) {
    return new SubjectsNested(-1, item);
  }
  
  public SubjectsNested<A> setNewSubjectLike(int index,RbacV1Subject item) {
    return new SubjectsNested(index, item);
  }
  
  public SubjectsNested<A> editSubject(int index) {
    if (subjects.size() <= index) throw new RuntimeException("Can't edit subjects. Index exceeds size.");
    return setNewSubjectLike(index, buildSubject(index));
  }
  
  public SubjectsNested<A> editFirstSubject() {
    if (subjects.size() == 0) throw new RuntimeException("Can't edit first subjects. The list is empty.");
    return setNewSubjectLike(0, buildSubject(0));
  }
  
  public SubjectsNested<A> editLastSubject() {
    int index = subjects.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last subjects. The list is empty.");
    return setNewSubjectLike(index, buildSubject(index));
  }
  
  public SubjectsNested<A> editMatchingSubject(Predicate<RbacV1SubjectBuilder> predicate) {
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
    V1ClusterRoleBindingFluent that = (V1ClusterRoleBindingFluent) o;
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
    if (subjects != null && !subjects.isEmpty()) { sb.append("subjects:"); sb.append(subjects); }
    sb.append("}");
    return sb.toString();
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1ClusterRoleBindingFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class RoleRefNested<N> extends V1RoleRefFluent<RoleRefNested<N>> implements Nested<N>{
    RoleRefNested(V1RoleRef item) {
      this.builder = new V1RoleRefBuilder(this, item);
    }
    V1RoleRefBuilder builder;
    
    public N and() {
      return (N) V1ClusterRoleBindingFluent.this.withRoleRef(builder.build());
    }
    
    public N endRoleRef() {
      return and();
    }
    
  
  }
  public class SubjectsNested<N> extends RbacV1SubjectFluent<SubjectsNested<N>> implements Nested<N>{
    SubjectsNested(int index,RbacV1Subject item) {
      this.index = index;
      this.builder = new RbacV1SubjectBuilder(this, item);
    }
    RbacV1SubjectBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ClusterRoleBindingFluent.this.setToSubjects(index,builder.build());
    }
    
    public N endSubject() {
      return and();
    }
    
  
  }

}