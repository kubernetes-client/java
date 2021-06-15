package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface V1beta1SubjectAccessReviewSpecFluent<A extends io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToExtra(java.lang.String key,java.util.List<java.lang.String> value);
    public A addToExtra(java.util.Map<java.lang.String,java.util.List<java.lang.String>> map);
    public A removeFromExtra(java.lang.String key);
    public A removeFromExtra(java.util.Map<java.lang.String,java.util.List<java.lang.String>> map);
    public java.util.Map<java.lang.String,java.util.List<java.lang.String>> getExtra();
    public <K,V>A withExtra(java.util.Map<java.lang.String,java.util.List<java.lang.String>> extra);
    public java.lang.Boolean hasExtra();
    public A addToGroup(int index,java.lang.String item);
    public A setToGroup(int index,java.lang.String item);
    public A addToGroup(java.lang.String... items);
    public A addAllToGroup(java.util.Collection<java.lang.String> items);
    public A removeFromGroup(java.lang.String... items);
    public A removeAllFromGroup(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getGroup();
    public java.lang.String getGroup(int index);
    public java.lang.String getFirstGroup();
    public java.lang.String getLastGroup();
    public java.lang.String getMatchingGroup(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingGroup(java.util.function.Predicate<java.lang.String> predicate);
    public A withGroup(java.util.List<java.lang.String> group);
    public A withGroup(java.lang.String... group);
    public java.lang.Boolean hasGroup();
    public A addNewGroup(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildNonResourceAttributes instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes getNonResourceAttributes();
    public io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes buildNonResourceAttributes();
    public A withNonResourceAttributes(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes nonResourceAttributes);
    public java.lang.Boolean hasNonResourceAttributes();
    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> withNewNonResourceAttributes();
    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> withNewNonResourceAttributesLike(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes item);
    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editNonResourceAttributes();
    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editOrNewNonResourceAttributes();
    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editOrNewNonResourceAttributesLike(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildResourceAttributes instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1ResourceAttributes getResourceAttributes();
    public io.kubernetes.client.openapi.models.V1beta1ResourceAttributes buildResourceAttributes();
    public A withResourceAttributes(io.kubernetes.client.openapi.models.V1beta1ResourceAttributes resourceAttributes);
    public java.lang.Boolean hasResourceAttributes();
    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> withNewResourceAttributes();
    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> withNewResourceAttributesLike(io.kubernetes.client.openapi.models.V1beta1ResourceAttributes item);
    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editResourceAttributes();
    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editOrNewResourceAttributes();
    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editOrNewResourceAttributesLike(io.kubernetes.client.openapi.models.V1beta1ResourceAttributes item);
    public java.lang.String getUid();
    public A withUid(java.lang.String uid);
    public java.lang.Boolean hasUid();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUid instead.
     */
        public A withNewUid(java.lang.String original);
    public java.lang.String getUser();
    public A withUser(java.lang.String user);
    public java.lang.Boolean hasUser();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUser instead.
     */
        public A withNewUser(java.lang.String original);
    public interface NonResourceAttributesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesFluent<io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<N>> {

            public N and();
            public N endNonResourceAttributes();    }


    public interface ResourceAttributesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1ResourceAttributesFluent<io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.ResourceAttributesNested<N>> {

            public N and();
            public N endResourceAttributes();    }


}
