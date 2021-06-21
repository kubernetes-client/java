package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1APIGroupListFluent<A extends io.kubernetes.client.openapi.models.V1APIGroupListFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getApiVersion();
    public A withApiVersion(java.lang.String apiVersion);
    public java.lang.Boolean hasApiVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original);
    public A addToGroups(int index,io.kubernetes.client.openapi.models.V1APIGroup item);
    public A setToGroups(int index,io.kubernetes.client.openapi.models.V1APIGroup item);
    public A addToGroups(io.kubernetes.client.openapi.models.V1APIGroup... items);
    public A addAllToGroups(java.util.Collection<io.kubernetes.client.openapi.models.V1APIGroup> items);
    public A removeFromGroups(io.kubernetes.client.openapi.models.V1APIGroup... items);
    public A removeAllFromGroups(java.util.Collection<io.kubernetes.client.openapi.models.V1APIGroup> items);
    public A removeMatchingFromGroups(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIGroupBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildGroups instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1APIGroup> getGroups();
    public java.util.List<io.kubernetes.client.openapi.models.V1APIGroup> buildGroups();
    public io.kubernetes.client.openapi.models.V1APIGroup buildGroup(int index);
    public io.kubernetes.client.openapi.models.V1APIGroup buildFirstGroup();
    public io.kubernetes.client.openapi.models.V1APIGroup buildLastGroup();
    public io.kubernetes.client.openapi.models.V1APIGroup buildMatchingGroup(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIGroupBuilder> predicate);
    public java.lang.Boolean hasMatchingGroup(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIGroupBuilder> predicate);
    public A withGroups(java.util.List<io.kubernetes.client.openapi.models.V1APIGroup> groups);
    public A withGroups(io.kubernetes.client.openapi.models.V1APIGroup... groups);
    public java.lang.Boolean hasGroups();
    public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> addNewGroup();
    public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> addNewGroupLike(io.kubernetes.client.openapi.models.V1APIGroup item);
    public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> setNewGroupLike(int index,io.kubernetes.client.openapi.models.V1APIGroup item);
    public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> editGroup(int index);
    public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> editFirstGroup();
    public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> editLastGroup();
    public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> editMatchingGroup(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIGroupBuilder> predicate);
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    public interface GroupsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1APIGroupFluent<io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<N>> {

            public N and();
            public N endGroup();    }


}
