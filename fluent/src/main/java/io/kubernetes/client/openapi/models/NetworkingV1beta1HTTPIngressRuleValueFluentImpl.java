package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class NetworkingV1beta1HTTPIngressRuleValueFluentImpl<A extends io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueFluent<A> {

    private java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder> paths;

    public NetworkingV1beta1HTTPIngressRuleValueFluentImpl() {
    }

    public NetworkingV1beta1HTTPIngressRuleValueFluentImpl(io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValue instance) {
        this.withPaths(instance.getPaths());
    }

    public A addToPaths(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath item) {
        if (this.paths == null) {this.paths = new java.util.ArrayList<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder>();}
        io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder(item);_visitables.get("paths").add(index >= 0 ? index : _visitables.get("paths").size(), builder);this.paths.add(index >= 0 ? index : paths.size(), builder); return (A)this;
    }

    public A setToPaths(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath item) {
        if (this.paths == null) {this.paths = new java.util.ArrayList<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder>();}
        io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder(item);
        if (index < 0 || index >= _visitables.get("paths").size()) { _visitables.get("paths").add(builder); } else { _visitables.get("paths").set(index, builder);}
        if (index < 0 || index >= paths.size()) { paths.add(builder); } else { paths.set(index, builder);}
         return (A)this;
    }

    public A addToPaths(io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath... items) {
        if (this.paths == null) {this.paths = new java.util.ArrayList<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder>();}
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath item : items) {io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder(item);_visitables.get("paths").add(builder);this.paths.add(builder);} return (A)this;
    }

    public A addAllToPaths(java.util.Collection<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath> items) {
        if (this.paths == null) {this.paths = new java.util.ArrayList<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder>();}
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath item : items) {io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder(item);_visitables.get("paths").add(builder);this.paths.add(builder);} return (A)this;
    }

    public A removeFromPaths(io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath... items) {
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath item : items) {io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder(item);_visitables.get("paths").remove(builder);if (this.paths != null) {this.paths.remove(builder);}} return (A)this;
    }

    public A removeAllFromPaths(java.util.Collection<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath> items) {
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath item : items) {io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder(item);_visitables.get("paths").remove(builder);if (this.paths != null) {this.paths.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromPaths(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder> predicate) {
        if (paths == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder> each = paths.iterator();
        final List visitables = _visitables.get("paths");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPaths instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath> getPaths() {
        return build(paths);
    }

    public java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath> buildPaths() {
        return build(paths);
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath buildPath(int index) {
        return this.paths.get(index).build();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath buildFirstPath() {
        return this.paths.get(0).build();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath buildLastPath() {
        return this.paths.get(paths.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath buildMatchingPath(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder item: paths) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingPath(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder item: paths) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withPaths(java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath> paths) {
        if (this.paths != null) { _visitables.get("paths").removeAll(this.paths);}
        if (paths != null) {this.paths = new java.util.ArrayList<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder>(); for (io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath item : paths){this.addToPaths(item);}} else { this.paths = null;} return (A) this;
    }

    public A withPaths(io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath... paths) {
        if (this.paths != null) {this.paths.clear();}
        if (paths != null) {for (io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath item :paths){ this.addToPaths(item);}} return (A) this;
    }

    public java.lang.Boolean hasPaths() {
        return paths != null && !paths.isEmpty();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueFluent.PathsNested<A> addNewPath() {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueFluentImpl.PathsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueFluent.PathsNested<A> addNewPathLike(io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath item) {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueFluentImpl.PathsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueFluent.PathsNested<A> setNewPathLike(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath item) {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueFluentImpl.PathsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueFluent.PathsNested<A> editPath(int index) {
        if (paths.size() <= index) throw new RuntimeException("Can't edit paths. Index exceeds size.");
        return setNewPathLike(index, buildPath(index));
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueFluent.PathsNested<A> editFirstPath() {
        if (paths.size() == 0) throw new RuntimeException("Can't edit first paths. The list is empty.");
        return setNewPathLike(0, buildPath(0));
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueFluent.PathsNested<A> editLastPath() {
        int index = paths.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last paths. The list is empty.");
        return setNewPathLike(index, buildPath(index));
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueFluent.PathsNested<A> editMatchingPath(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder> predicate) {
        int index = -1;
        for (int i=0;i<paths.size();i++) { 
        if (predicate.test(paths.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching paths. No match found.");
        return setNewPathLike(index, buildPath(index));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NetworkingV1beta1HTTPIngressRuleValueFluentImpl that = (NetworkingV1beta1HTTPIngressRuleValueFluentImpl) o;
        if (paths != null ? !paths.equals(that.paths) :that.paths != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(paths,  super.hashCode());
    }

    public class PathsNestedImpl<N> extends io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluentImpl<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueFluent.PathsNested<N>> implements io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressRuleValueFluent.PathsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder builder;
        private final int index;

            PathsNestedImpl(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder(this, item);
                        
            }

            PathsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathBuilder(this);
                        
            }

            public N and() {
                return (N) NetworkingV1beta1HTTPIngressRuleValueFluentImpl.this.setToPaths(index,builder.build());
            }

            public N endPath() {
                return and();
            }
    }


}
