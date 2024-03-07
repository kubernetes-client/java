/*
Copyright 2023 The Kubernetes Authors.
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
package io.kubernetes.client.util.eks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

/**
 * Various Http helper routines
 */
public class HttpUtils {

    private static final Logger log = LoggerFactory.getLogger(HttpUtils.class);
    /**
     * Makes a http request to the specified endpoint
     */
    public static String invokeHttpRequest(URL endpointUrl,
                                           String httpMethod,
                                           Map<String, String> headers,
                                           String requestBody) {
        HttpURLConnection connection = createHttpConnection(endpointUrl, httpMethod, headers);
        try {
            if ( requestBody != null ) {
                DataOutputStream wr = new DataOutputStream(
                        connection.getOutputStream());
                wr.writeBytes(requestBody);
                wr.flush();
                wr.close();
            }
        } catch (Exception e) {
            throw new RuntimeException("Request failed. " + e.getMessage(), e);
        }
        return executeHttpRequest(connection);
    }

    public static String executeHttpRequest(HttpURLConnection connection) {
        try {
            // Get Response
            InputStream is;
            try {
                is = connection.getInputStream();
            } catch (IOException e) {
                is = connection.getErrorStream();
            }

            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuffer response = new StringBuffer();
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
            return response.toString();
        } catch (Exception e) {
            throw new RuntimeException("Request failed. " + e.getMessage(), e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    public static HttpURLConnection createHttpConnection(URL endpointUrl,
                                                         String httpMethod,
                                                         Map<String, String> headers) {
        try {
            HttpURLConnection connection = (HttpURLConnection) endpointUrl.openConnection();
            connection.setRequestMethod(httpMethod);

            if ( headers != null ) {
                log.debug("--------- Request headers ---------");
                for ( String headerKey : headers.keySet() ) {
                    log.debug("{}: {}", headerKey, headers.get(headerKey));
                    connection.setRequestProperty(headerKey, headers.get(headerKey));
                }
            }

            connection.setUseCaches(false);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            return connection;
        } catch (Exception e) {
            throw new RuntimeException("Cannot create connection. " + e.getMessage(), e);
        }
    }

    public static String urlEncode(String url, boolean keepPathSlash) {
        String encoded;
        try {
            encoded = URLEncoder.encode(url, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 encoding is not supported.", e);
        }
        if ( keepPathSlash ) {
            encoded = encoded.replace("%2F", "/");
        }
        return encoded;
    }
}
