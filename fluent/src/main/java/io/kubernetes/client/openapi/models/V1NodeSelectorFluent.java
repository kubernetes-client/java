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

public interface V1NodeSelectorFluent<A extends io.kubernetes.client.openapi.models.V1NodeSelectorFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToNodeSelectorTerms(int index,io.kubernetes.client.openapi.models.V1NodeSelectorTerm item);
    public A setToNodeSelectorTerms(int index,io.kubernetes.client.openapi.models.V1NodeSelectorTerm item);
    public A addToNodeSelectorTerms(io.kubernetes.client.openapi.models.V1NodeSelectorTerm... items);
    public A addAllToNodeSelectorTerms(java.util.Collection<io.kubernetes.client.openapi.models.V1NodeSelectorTerm> items);
    public A removeFromNodeSelectorTerms(io.kubernetes.client.openapi.models.V1NodeSelectorTerm... items);
    public A removeAllFromNodeSelectorTerms(java.util.Collection<io.kubernetes.client.openapi.models.V1NodeSelectorTerm> items);
    public A removeMatchingFromNodeSelectorTerms(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildNodeSelectorTerms instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorTerm> getNodeSelectorTerms();
    public java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorTerm> buildNodeSelectorTerms();
    public io.kubernetes.client.openapi.models.V1NodeSelectorTerm buildNodeSelectorTerm(int index);
    public io.kubernetes.client.openapi.models.V1NodeSelectorTerm buildFirstNodeSelectorTerm();
    public io.kubernetes.client.openapi.models.V1NodeSelectorTerm buildLastNodeSelectorTerm();
    public io.kubernetes.client.openapi.models.V1NodeSelectorTerm buildMatchingNodeSelectorTerm(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder> predicate);
    public java.lang.Boolean hasMatchingNodeSelectorTerm(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder> predicate);
    public A withNodeSelectorTerms(java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorTerm> nodeSelectorTerms);
    public A withNodeSelectorTerms(io.kubernetes.client.openapi.models.V1NodeSelectorTerm... nodeSelectorTerms);
    public java.lang.Boolean hasNodeSelectorTerms();
    public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A> addNewNodeSelectorTerm();
    public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A> addNewNodeSelectorTermLike(io.kubernetes.client.openapi.models.V1NodeSelectorTerm item);
    public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A> setNewNodeSelectorTermLike(int index,io.kubernetes.client.openapi.models.V1NodeSelectorTerm item);
    public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A> editNodeSelectorTerm(int index);
    public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A> editFirstNodeSelectorTerm();
    public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A> editLastNodeSelectorTerm();
    public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A> editMatchingNodeSelectorTerm(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder> predicate);
    public interface NodeSelectorTermsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent<io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<N>> {

            public N and();
            public N endNodeSelectorTerm();    }


}
