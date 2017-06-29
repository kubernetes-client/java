/*
Copyright 2017 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client;

import com.google.gson.annotations.SerializedName;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;

/**
 * Watch class implements watch mechansim of kubernetes. For every list API
 * call with a watch parameter you should be able to pass its call to this class
 * and watch changes to that list. For example CoreV1Api.listNamespace has watch
 * parameter, so you can create a call using CoreV1Api.listNamespaceCall and
 * set watch to True and watch the changes to namespaces.
 */
public class Watch<T> implements Iterable<Watch.Response<T>>,
        Iterator<Watch.Response<T>> {

    /**
     * Response class holds a watch response that has a `type` that can be
     * ADDED, MODIFIED, DELETED and ERROR. It also hold the actual target
     * object.
     */
    public static class Response<T> {
        @SerializedName("type")
        public String type;

        @SerializedName("object")
        public T object;

        Response(String type, T object) {
            this.type = type;
            this.object = object;
        }
    }

    Type watchType;
    ResponseBody response;
    JSON json;

    public Watch(JSON json, ResponseBody body, Type watchType) {
        this.response = body;
        this.watchType = watchType;
        this.json = json;
    }

    public Response<T> next() {
        try {
            String line = response.source().readUtf8Line();
            if (line == null) {
                throw new RuntimeException("Null response from the server.");
            }
            return json.deserialize(line, watchType);
        } catch (IOException e) {
            throw new RuntimeException("IO Exception during next method.", e);
        }
    }

    public boolean hasNext() {
        try {
            return !response.source().exhausted();
        } catch (IOException e) {
            throw new RuntimeException("IO Exception during hasNext method.",
                    e);
        }
    }

    public Iterator<Response<T>> iterator() {
        return this;
    }

    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
