package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
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

public class V1alpha1RoleBindingFluentImpl<A extends io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent<A> {

    private java.lang.String apiVersion;
    private java.lang.String kind;
    private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
    private io.kubernetes.client.openapi.models.V1alpha1RoleRefBuilder roleRef;
    private java.util.List<io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder> subjects;

    public V1alpha1RoleBindingFluentImpl() {
    }

    public V1alpha1RoleBindingFluentImpl(io.kubernetes.client.openapi.models.V1alpha1RoleBinding instance) {
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withRoleRef(instance.getRoleRef());
        
        this.withSubjects(instance.getSubjects());
    }

    public java.lang.String getApiVersion() {
        return this.apiVersion;
    }

    public A withApiVersion(java.lang.String apiVersion) {
        this.apiVersion=apiVersion; return (A) this;
    }

    public java.lang.Boolean hasApiVersion() {
        return this.apiVersion != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original) {
        return (A)withApiVersion(new String(original));
    }

    public java.lang.String getKind() {
        return this.kind;
    }

    public A withKind(java.lang.String kind) {
        this.kind=kind; return (A) this;
    }

    public java.lang.Boolean hasKind() {
        return this.kind != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original) {
        return (A)withKind(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
        return this.metadata!=null?this.metadata.build():null;
    }

    public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata() {
        return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
        _visitables.get("metadata").remove(this.metadata);
        if (metadata!=null){ this.metadata= new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} return (A) this;
    }

    public java.lang.Boolean hasMetadata() {
        return this.metadata != null;
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.MetadataNested<A> withNewMetadata() {
        return new io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluentImpl.MetadataNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
        return new io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluentImpl.MetadataNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.MetadataNested<A> editMetadata() {
        return withNewMetadataLike(getMetadata());
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.MetadataNested<A> editOrNewMetadata() {
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRoleRef instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1alpha1RoleRef getRoleRef() {
        return this.roleRef!=null?this.roleRef.build():null;
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleRef buildRoleRef() {
        return this.roleRef!=null?this.roleRef.build():null;
    }

    public A withRoleRef(io.kubernetes.client.openapi.models.V1alpha1RoleRef roleRef) {
        _visitables.get("roleRef").remove(this.roleRef);
        if (roleRef!=null){ this.roleRef= new io.kubernetes.client.openapi.models.V1alpha1RoleRefBuilder(roleRef); _visitables.get("roleRef").add(this.roleRef);} return (A) this;
    }

    public java.lang.Boolean hasRoleRef() {
        return this.roleRef != null;
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.RoleRefNested<A> withNewRoleRef() {
        return new io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluentImpl.RoleRefNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.RoleRefNested<A> withNewRoleRefLike(io.kubernetes.client.openapi.models.V1alpha1RoleRef item) {
        return new io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluentImpl.RoleRefNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.RoleRefNested<A> editRoleRef() {
        return withNewRoleRefLike(getRoleRef());
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.RoleRefNested<A> editOrNewRoleRef() {
        return withNewRoleRefLike(getRoleRef() != null ? getRoleRef(): new io.kubernetes.client.openapi.models.V1alpha1RoleRefBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.RoleRefNested<A> editOrNewRoleRefLike(io.kubernetes.client.openapi.models.V1alpha1RoleRef item) {
        return withNewRoleRefLike(getRoleRef() != null ? getRoleRef(): item);
    }

    public A addToSubjects(int index,io.kubernetes.client.openapi.models.RbacV1alpha1Subject item) {
        if (this.subjects == null) {this.subjects = new java.util.ArrayList<io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder>();}
        io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder builder = new io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder(item);_visitables.get("subjects").add(index >= 0 ? index : _visitables.get("subjects").size(), builder);this.subjects.add(index >= 0 ? index : subjects.size(), builder); return (A)this;
    }

    public A setToSubjects(int index,io.kubernetes.client.openapi.models.RbacV1alpha1Subject item) {
        if (this.subjects == null) {this.subjects = new java.util.ArrayList<io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder>();}
        io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder builder = new io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder(item);
        if (index < 0 || index >= _visitables.get("subjects").size()) { _visitables.get("subjects").add(builder); } else { _visitables.get("subjects").set(index, builder);}
        if (index < 0 || index >= subjects.size()) { subjects.add(builder); } else { subjects.set(index, builder);}
         return (A)this;
    }

    public A addToSubjects(io.kubernetes.client.openapi.models.RbacV1alpha1Subject... items) {
        if (this.subjects == null) {this.subjects = new java.util.ArrayList<io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder>();}
        for (io.kubernetes.client.openapi.models.RbacV1alpha1Subject item : items) {io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder builder = new io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder(item);_visitables.get("subjects").add(builder);this.subjects.add(builder);} return (A)this;
    }

    public A addAllToSubjects(java.util.Collection<io.kubernetes.client.openapi.models.RbacV1alpha1Subject> items) {
        if (this.subjects == null) {this.subjects = new java.util.ArrayList<io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder>();}
        for (io.kubernetes.client.openapi.models.RbacV1alpha1Subject item : items) {io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder builder = new io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder(item);_visitables.get("subjects").add(builder);this.subjects.add(builder);} return (A)this;
    }

    public A removeFromSubjects(io.kubernetes.client.openapi.models.RbacV1alpha1Subject... items) {
        for (io.kubernetes.client.openapi.models.RbacV1alpha1Subject item : items) {io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder builder = new io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder(item);_visitables.get("subjects").remove(builder);if (this.subjects != null) {this.subjects.remove(builder);}} return (A)this;
    }

    public A removeAllFromSubjects(java.util.Collection<io.kubernetes.client.openapi.models.RbacV1alpha1Subject> items) {
        for (io.kubernetes.client.openapi.models.RbacV1alpha1Subject item : items) {io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder builder = new io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder(item);_visitables.get("subjects").remove(builder);if (this.subjects != null) {this.subjects.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromSubjects(java.util.function.Predicate<io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder> predicate) {
        if (subjects == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder> each = subjects.iterator();
        final List visitables = _visitables.get("subjects");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSubjects instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.RbacV1alpha1Subject> getSubjects() {
        return build(subjects);
    }

    public java.util.List<io.kubernetes.client.openapi.models.RbacV1alpha1Subject> buildSubjects() {
        return build(subjects);
    }

    public io.kubernetes.client.openapi.models.RbacV1alpha1Subject buildSubject(int index) {
        return this.subjects.get(index).build();
    }

    public io.kubernetes.client.openapi.models.RbacV1alpha1Subject buildFirstSubject() {
        return this.subjects.get(0).build();
    }

    public io.kubernetes.client.openapi.models.RbacV1alpha1Subject buildLastSubject() {
        return this.subjects.get(subjects.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.RbacV1alpha1Subject buildMatchingSubject(java.util.function.Predicate<io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder item: subjects) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingSubject(java.util.function.Predicate<io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder item: subjects) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withSubjects(java.util.List<io.kubernetes.client.openapi.models.RbacV1alpha1Subject> subjects) {
        if (this.subjects != null) { _visitables.get("subjects").removeAll(this.subjects);}
        if (subjects != null) {this.subjects = new java.util.ArrayList<io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder>(); for (io.kubernetes.client.openapi.models.RbacV1alpha1Subject item : subjects){this.addToSubjects(item);}} else { this.subjects = null;} return (A) this;
    }

    public A withSubjects(io.kubernetes.client.openapi.models.RbacV1alpha1Subject... subjects) {
        if (this.subjects != null) {this.subjects.clear();}
        if (subjects != null) {for (io.kubernetes.client.openapi.models.RbacV1alpha1Subject item :subjects){ this.addToSubjects(item);}} return (A) this;
    }

    public java.lang.Boolean hasSubjects() {
        return subjects != null && !subjects.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.SubjectsNested<A> addNewSubject() {
        return new io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluentImpl.SubjectsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.SubjectsNested<A> addNewSubjectLike(io.kubernetes.client.openapi.models.RbacV1alpha1Subject item) {
        return new io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluentImpl.SubjectsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.SubjectsNested<A> setNewSubjectLike(int index,io.kubernetes.client.openapi.models.RbacV1alpha1Subject item) {
        return new io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluentImpl.SubjectsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.SubjectsNested<A> editSubject(int index) {
        if (subjects.size() <= index) throw new RuntimeException("Can't edit subjects. Index exceeds size.");
        return setNewSubjectLike(index, buildSubject(index));
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.SubjectsNested<A> editFirstSubject() {
        if (subjects.size() == 0) throw new RuntimeException("Can't edit first subjects. The list is empty.");
        return setNewSubjectLike(0, buildSubject(0));
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.SubjectsNested<A> editLastSubject() {
        int index = subjects.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last subjects. The list is empty.");
        return setNewSubjectLike(index, buildSubject(index));
    }

    public io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.SubjectsNested<A> editMatchingSubject(java.util.function.Predicate<io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder> predicate) {
        int index = -1;
        for (int i=0;i<subjects.size();i++) { 
        if (predicate.test(subjects.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching subjects. No match found.");
        return setNewSubjectLike(index, buildSubject(index));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1alpha1RoleBindingFluentImpl that = (V1alpha1RoleBindingFluentImpl) o;
        if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
        if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
        if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
        if (roleRef != null ? !roleRef.equals(that.roleRef) :that.roleRef != null) return false;
        if (subjects != null ? !subjects.equals(that.subjects) :that.subjects != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(apiVersion,  kind,  metadata,  roleRef,  subjects,  super.hashCode());
    }

    public class MetadataNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.MetadataNested<N>> implements io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.MetadataNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

            MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
                        
            }

            MetadataNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
                        
            }

            public N and() {
                return (N) V1alpha1RoleBindingFluentImpl.this.withMetadata(builder.build());
            }

            public N endMetadata() {
                return and();
            }
    }


    public class RoleRefNestedImpl<N> extends io.kubernetes.client.openapi.models.V1alpha1RoleRefFluentImpl<io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.RoleRefNested<N>> implements io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.RoleRefNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1alpha1RoleRefBuilder builder;

            RoleRefNestedImpl(io.kubernetes.client.openapi.models.V1alpha1RoleRef item) {
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1RoleRefBuilder(this, item);
                        
            }

            RoleRefNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1RoleRefBuilder(this);
                        
            }

            public N and() {
                return (N) V1alpha1RoleBindingFluentImpl.this.withRoleRef(builder.build());
            }

            public N endRoleRef() {
                return and();
            }
    }


    public class SubjectsNestedImpl<N> extends io.kubernetes.client.openapi.models.RbacV1alpha1SubjectFluentImpl<io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.SubjectsNested<N>> implements io.kubernetes.client.openapi.models.V1alpha1RoleBindingFluent.SubjectsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder builder;
        private final int index;

            SubjectsNestedImpl(int index,io.kubernetes.client.openapi.models.RbacV1alpha1Subject item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder(this, item);
                        
            }

            SubjectsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.RbacV1alpha1SubjectBuilder(this);
                        
            }

            public N and() {
                return (N) V1alpha1RoleBindingFluentImpl.this.setToSubjects(index,builder.build());
            }

            public N endSubject() {
                return and();
            }
    }


}
