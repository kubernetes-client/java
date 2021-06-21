package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.util.Collection;

public interface V1beta1ClusterRoleBindingFluent<A extends io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getApiVersion();
    public A withApiVersion(java.lang.String apiVersion);
    public java.lang.Boolean hasApiVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original);
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();
    public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
    public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
    public java.lang.Boolean hasMetadata();
    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.MetadataNested<A> withNewMetadata();
    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.MetadataNested<A> editMetadata();
    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.MetadataNested<A> editOrNewMetadata();
    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRoleRef instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1RoleRef getRoleRef();
    public io.kubernetes.client.openapi.models.V1beta1RoleRef buildRoleRef();
    public A withRoleRef(io.kubernetes.client.openapi.models.V1beta1RoleRef roleRef);
    public java.lang.Boolean hasRoleRef();
    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.RoleRefNested<A> withNewRoleRef();
    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.RoleRefNested<A> withNewRoleRefLike(io.kubernetes.client.openapi.models.V1beta1RoleRef item);
    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.RoleRefNested<A> editRoleRef();
    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.RoleRefNested<A> editOrNewRoleRef();
    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.RoleRefNested<A> editOrNewRoleRefLike(io.kubernetes.client.openapi.models.V1beta1RoleRef item);
    public A addToSubjects(int index,io.kubernetes.client.openapi.models.RbacV1beta1Subject item);
    public A setToSubjects(int index,io.kubernetes.client.openapi.models.RbacV1beta1Subject item);
    public A addToSubjects(io.kubernetes.client.openapi.models.RbacV1beta1Subject... items);
    public A addAllToSubjects(java.util.Collection<io.kubernetes.client.openapi.models.RbacV1beta1Subject> items);
    public A removeFromSubjects(io.kubernetes.client.openapi.models.RbacV1beta1Subject... items);
    public A removeAllFromSubjects(java.util.Collection<io.kubernetes.client.openapi.models.RbacV1beta1Subject> items);
    public A removeMatchingFromSubjects(java.util.function.Predicate<io.kubernetes.client.openapi.models.RbacV1beta1SubjectBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSubjects instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.RbacV1beta1Subject> getSubjects();
    public java.util.List<io.kubernetes.client.openapi.models.RbacV1beta1Subject> buildSubjects();
    public io.kubernetes.client.openapi.models.RbacV1beta1Subject buildSubject(int index);
    public io.kubernetes.client.openapi.models.RbacV1beta1Subject buildFirstSubject();
    public io.kubernetes.client.openapi.models.RbacV1beta1Subject buildLastSubject();
    public io.kubernetes.client.openapi.models.RbacV1beta1Subject buildMatchingSubject(java.util.function.Predicate<io.kubernetes.client.openapi.models.RbacV1beta1SubjectBuilder> predicate);
    public java.lang.Boolean hasMatchingSubject(java.util.function.Predicate<io.kubernetes.client.openapi.models.RbacV1beta1SubjectBuilder> predicate);
    public A withSubjects(java.util.List<io.kubernetes.client.openapi.models.RbacV1beta1Subject> subjects);
    public A withSubjects(io.kubernetes.client.openapi.models.RbacV1beta1Subject... subjects);
    public java.lang.Boolean hasSubjects();
    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.SubjectsNested<A> addNewSubject();
    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.SubjectsNested<A> addNewSubjectLike(io.kubernetes.client.openapi.models.RbacV1beta1Subject item);
    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.SubjectsNested<A> setNewSubjectLike(int index,io.kubernetes.client.openapi.models.RbacV1beta1Subject item);
    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.SubjectsNested<A> editSubject(int index);
    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.SubjectsNested<A> editFirstSubject();
    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.SubjectsNested<A> editLastSubject();
    public io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.SubjectsNested<A> editMatchingSubject(java.util.function.Predicate<io.kubernetes.client.openapi.models.RbacV1beta1SubjectBuilder> predicate);
    public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.MetadataNested<N>> {

            public N and();
            public N endMetadata();    }


    public interface RoleRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1RoleRefFluent<io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.RoleRefNested<N>> {

            public N and();
            public N endRoleRef();    }


    public interface SubjectsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.RbacV1beta1SubjectFluent<io.kubernetes.client.openapi.models.V1beta1ClusterRoleBindingFluent.SubjectsNested<N>> {

            public N and();
            public N endSubject();    }


}
