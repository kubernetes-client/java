package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1beta1TokenReviewStatusFluent<A extends io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToAudiences(int index,java.lang.String item);
    public A setToAudiences(int index,java.lang.String item);
    public A addToAudiences(java.lang.String... items);
    public A addAllToAudiences(java.util.Collection<java.lang.String> items);
    public A removeFromAudiences(java.lang.String... items);
    public A removeAllFromAudiences(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getAudiences();
    public java.lang.String getAudience(int index);
    public java.lang.String getFirstAudience();
    public java.lang.String getLastAudience();
    public java.lang.String getMatchingAudience(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingAudience(java.util.function.Predicate<java.lang.String> predicate);
    public A withAudiences(java.util.List<java.lang.String> audiences);
    public A withAudiences(java.lang.String... audiences);
    public java.lang.Boolean hasAudiences();
    public A addNewAudience(java.lang.String original);
    public java.lang.Boolean getAuthenticated();
    public A withAuthenticated(java.lang.Boolean authenticated);
    public java.lang.Boolean hasAuthenticated();
    public java.lang.String getError();
    public A withError(java.lang.String error);
    public java.lang.Boolean hasError();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withError instead.
     */
        public A withNewError(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildUser instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1UserInfo getUser();
    public io.kubernetes.client.openapi.models.V1beta1UserInfo buildUser();
    public A withUser(io.kubernetes.client.openapi.models.V1beta1UserInfo user);
    public java.lang.Boolean hasUser();
    public io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluent.UserNested<A> withNewUser();
    public io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluent.UserNested<A> withNewUserLike(io.kubernetes.client.openapi.models.V1beta1UserInfo item);
    public io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluent.UserNested<A> editUser();
    public io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluent.UserNested<A> editOrNewUser();
    public io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluent.UserNested<A> editOrNewUserLike(io.kubernetes.client.openapi.models.V1beta1UserInfo item);
    public interface UserNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1UserInfoFluent<io.kubernetes.client.openapi.models.V1beta1TokenReviewStatusFluent.UserNested<N>> {

            public N and();
            public N endUser();    }


}
