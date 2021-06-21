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

public interface ExtensionsV1beta1HTTPIngressRuleValueFluent<A extends io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValueFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToPaths(int index,io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPath item);
    public A setToPaths(int index,io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPath item);
    public A addToPaths(io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPath... items);
    public A addAllToPaths(java.util.Collection<io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPath> items);
    public A removeFromPaths(io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPath... items);
    public A removeAllFromPaths(java.util.Collection<io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPath> items);
    public A removeMatchingFromPaths(java.util.function.Predicate<io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPathBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPaths instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPath> getPaths();
    public java.util.List<io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPath> buildPaths();
    public io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPath buildPath(int index);
    public io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPath buildFirstPath();
    public io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPath buildLastPath();
    public io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPath buildMatchingPath(java.util.function.Predicate<io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPathBuilder> predicate);
    public java.lang.Boolean hasMatchingPath(java.util.function.Predicate<io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPathBuilder> predicate);
    public A withPaths(java.util.List<io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPath> paths);
    public A withPaths(io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPath... paths);
    public java.lang.Boolean hasPaths();
    public io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValueFluent.PathsNested<A> addNewPath();
    public io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValueFluent.PathsNested<A> addNewPathLike(io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPath item);
    public io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValueFluent.PathsNested<A> setNewPathLike(int index,io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPath item);
    public io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValueFluent.PathsNested<A> editPath(int index);
    public io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValueFluent.PathsNested<A> editFirstPath();
    public io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValueFluent.PathsNested<A> editLastPath();
    public io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValueFluent.PathsNested<A> editMatchingPath(java.util.function.Predicate<io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPathBuilder> predicate);
    public interface PathsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressPathFluent<io.kubernetes.client.openapi.models.ExtensionsV1beta1HTTPIngressRuleValueFluent.PathsNested<N>> {

            public N and();
            public N endPath();    }


}
