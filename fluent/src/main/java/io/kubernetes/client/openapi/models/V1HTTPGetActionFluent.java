package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.custom.IntOrString;
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

public interface V1HTTPGetActionFluent<A extends io.kubernetes.client.openapi.models.V1HTTPGetActionFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getHost();
    public A withHost(java.lang.String host);
    public java.lang.Boolean hasHost();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withHost instead.
     */
        public A withNewHost(java.lang.String original);
    public A addToHttpHeaders(int index,io.kubernetes.client.openapi.models.V1HTTPHeader item);
    public A setToHttpHeaders(int index,io.kubernetes.client.openapi.models.V1HTTPHeader item);
    public A addToHttpHeaders(io.kubernetes.client.openapi.models.V1HTTPHeader... items);
    public A addAllToHttpHeaders(java.util.Collection<io.kubernetes.client.openapi.models.V1HTTPHeader> items);
    public A removeFromHttpHeaders(io.kubernetes.client.openapi.models.V1HTTPHeader... items);
    public A removeAllFromHttpHeaders(java.util.Collection<io.kubernetes.client.openapi.models.V1HTTPHeader> items);
    public A removeMatchingFromHttpHeaders(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildHttpHeaders instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1HTTPHeader> getHttpHeaders();
    public java.util.List<io.kubernetes.client.openapi.models.V1HTTPHeader> buildHttpHeaders();
    public io.kubernetes.client.openapi.models.V1HTTPHeader buildHttpHeader(int index);
    public io.kubernetes.client.openapi.models.V1HTTPHeader buildFirstHttpHeader();
    public io.kubernetes.client.openapi.models.V1HTTPHeader buildLastHttpHeader();
    public io.kubernetes.client.openapi.models.V1HTTPHeader buildMatchingHttpHeader(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder> predicate);
    public java.lang.Boolean hasMatchingHttpHeader(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder> predicate);
    public A withHttpHeaders(java.util.List<io.kubernetes.client.openapi.models.V1HTTPHeader> httpHeaders);
    public A withHttpHeaders(io.kubernetes.client.openapi.models.V1HTTPHeader... httpHeaders);
    public java.lang.Boolean hasHttpHeaders();
    public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A> addNewHttpHeader();
    public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A> addNewHttpHeaderLike(io.kubernetes.client.openapi.models.V1HTTPHeader item);
    public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A> setNewHttpHeaderLike(int index,io.kubernetes.client.openapi.models.V1HTTPHeader item);
    public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A> editHttpHeader(int index);
    public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A> editFirstHttpHeader();
    public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A> editLastHttpHeader();
    public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A> editMatchingHttpHeader(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder> predicate);
    public java.lang.String getPath();
    public A withPath(java.lang.String path);
    public java.lang.Boolean hasPath();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPath instead.
     */
        public A withNewPath(java.lang.String original);
    public io.kubernetes.client.custom.IntOrString getPort();
    public A withPort(io.kubernetes.client.custom.IntOrString port);
    public java.lang.Boolean hasPort();
    public A withNewPort(int value);
    public A withNewPort(java.lang.String value);
    public java.lang.String getScheme();
    public A withScheme(java.lang.String scheme);
    public java.lang.Boolean hasScheme();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withScheme instead.
     */
        public A withNewScheme(java.lang.String original);
    public interface HttpHeadersNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1HTTPHeaderFluent<io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<N>> {

            public N and();
            public N endHttpHeader();    }


}
