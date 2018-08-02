/*
 * SVRF API
 * # Getting Started  SVRF's API allows you to supercharge your project or app with the first and largest search engine for immersive experiences. We make it simple for any developer to incorporate highly immersive experiences with all kinds of applications: virtual reality, augmented reality, mixed reality, mobile, and web.  The SVRF API is based on REST principles, allowing it to integrate cross-platform. Our endpoints return responses in [JSON][]. We support [CORS][], allowing you to access immersive experiences indexed by SVRF on your own web domains. We provide a variety of resolutions, projections, and file formats to support most modern clients.  The SVRF API Documentation is available at [https://developers.svrf.com][SVRF Dev].  ## Access and API Keys  The SVRF API is currently in private beta and access is limited to select partners. If you are interested in using the SVRF API for your app or project, please contact us at [api@svrf.com][API Email]. We cannot guarantee immediate access for all requests, but we will announce a public release in the coming months.  See our [terms of service][TOS] for restrictions on using the SVRF API.  If you have any questions please contact us at [api@svrf.com][API Email]. Submit API corrections via [GitHub Issues][].  ## API Highlights  ### Search Endpoint  The [SVRF Search Endpoint][Docs Search] brings the power of immersive search found on [SVRF.com][SVRF] to your app or project. Our search engine enables your users to instantly find the immersive experience they are seeking. Content is sorted by the SVRF rating system, ensuring that the highest quality and most relevant search results are returned first.  ### Trending Endpoint  The [SVRF Trending Endpoint][Docs Trending] provides your app or project with the hottest immersive content - curated by real humans. The experiences returned mirror the [SVRF homepage][SVRF], from timely cultural content to trending pop-culture references. The experiences are updated regularly to ensure users always get a fresh list of immersive content.  ## API Libraries  You can use SVRF API libraries to encapsulate endpoint requests: * [C#][CSharp] * [Java][Java] * [JavaScript][JavaScript] * [Objective C][Objective C]  ## Attribution  ### Authors and Site Credit  At SVRF, we believe in giving credit where credit is due. Do your best to provide attribution to the `authors` and `site` where the content originated. We suggest using the format: __by {authors} via {site}__.  If possible, provide a way for users to discover and visit the page the content originally came from (`url`).  ### Powered By SVRF  As per section 5a of the [terms of service][TOS], __we require all apps that use the SVRF API to conspicuously display \"Powered By SVRF\" attribution marks where the API is utilized.__  ## Rate Limits  The SVRF API has a generous rate limit to ensure the best experience for your users. We rate limit by IP address with a maximum of 100 requests per second. If you exceed this rate limit, requests will be blocked for 60 seconds. Requests blocked by the rate limit will return with status code `429`.  [API Email]: mailto:api@svrf.com [CORS]: https://en.wikipedia.org/wiki/Cross-origin_resource_sharing [CSharp]: https://www.nuget.org/packages/SVRF.Client [Docs Search]: https://developers.svrf.com/#tag/Media/paths/~1vr~1search?q={q}/get [Docs Trending]: https://developers.svrf.com/#tag/Media/paths/~1vr~1trending/get [GitHub Issues]: https://github.com/Svrf/svrf-api/issues [Java]: https://mvnrepository.com/artifact/com.svrf/svrf-client [JavaScript]: https://www.npmjs.com/package/svrf-client [JSON]: http://www.json.org/ [Objective C]: https://cocoapods.org/pods/SVRFClient [SVRF]: https://www.svrf.com [SVRF Dev]: https://developers.svrf.com [TOS]: https://www.svrf.com/terms 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: api@svrf.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.svrf.client.api;

import com.svrf.client.ApiCallback;
import com.svrf.client.ApiClient;
import com.svrf.client.ApiException;
import com.svrf.client.ApiResponse;
import com.svrf.client.Configuration;
import com.svrf.client.Pair;
import com.svrf.client.ProgressRequestBody;
import com.svrf.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.svrf.client.model.ErrorResponse;
import com.svrf.client.model.RateLimitResponse;
import com.svrf.client.model.SearchMediaResponse;
import com.svrf.client.model.SingleMediaResponse;
import com.svrf.client.model.TrendingResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MediaApi {
    private ApiClient apiClient;

    public MediaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MediaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getById
     * @param id ID of Media (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/vr/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "XAppToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getById(Async)");
        }
        

        com.squareup.okhttp.Call call = getByIdCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Media by ID Endpoint
     * Fetch media by its ID.
     * @param id ID of Media (required)
     * @return SingleMediaResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SingleMediaResponse getById(String id) throws ApiException {
        ApiResponse<SingleMediaResponse> resp = getByIdWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Media by ID Endpoint
     * Fetch media by its ID.
     * @param id ID of Media (required)
     * @return ApiResponse&lt;SingleMediaResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SingleMediaResponse> getByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getByIdValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<SingleMediaResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Media by ID Endpoint (asynchronously)
     * Fetch media by its ID.
     * @param id ID of Media (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getByIdAsync(String id, final ApiCallback<SingleMediaResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SingleMediaResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTrending
     * @param type The type of Media to be returned. (optional)
     * @param stereoscopicType Search only for Media with a particular stereoscopic type. (optional)
     * @param category Search only for Media with a particular category. (optional)
     * @param size The number of results per page. (optional)
     * @param nextPageCursor Pass this cursor ID to get the next page of results. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTrendingCall(String type, String stereoscopicType, String category, Integer size, String nextPageCursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/vr/trending";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (stereoscopicType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("stereoscopicType", stereoscopicType));
        if (category != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("category", category));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));
        if (nextPageCursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("nextPageCursor", nextPageCursor));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "XAppToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTrendingValidateBeforeCall(String type, String stereoscopicType, String category, Integer size, String nextPageCursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getTrendingCall(type, stereoscopicType, category, size, nextPageCursor, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Trending Endpoint
     * The SVRF Trending Endpoint provides your app or project with the hottest immersive content curated by real humans. The experiences returned mirror the [SVRF homepage](https://www.svrf.com), from timely cultural content to trending pop-culture references. The trending experiences are updated regularly to ensure users always get fresh updates of immersive content.
     * @param type The type of Media to be returned. (optional)
     * @param stereoscopicType Search only for Media with a particular stereoscopic type. (optional)
     * @param category Search only for Media with a particular category. (optional)
     * @param size The number of results per page. (optional)
     * @param nextPageCursor Pass this cursor ID to get the next page of results. (optional)
     * @return TrendingResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TrendingResponse getTrending(String type, String stereoscopicType, String category, Integer size, String nextPageCursor) throws ApiException {
        ApiResponse<TrendingResponse> resp = getTrendingWithHttpInfo(type, stereoscopicType, category, size, nextPageCursor);
        return resp.getData();
    }

    /**
     * Trending Endpoint
     * The SVRF Trending Endpoint provides your app or project with the hottest immersive content curated by real humans. The experiences returned mirror the [SVRF homepage](https://www.svrf.com), from timely cultural content to trending pop-culture references. The trending experiences are updated regularly to ensure users always get fresh updates of immersive content.
     * @param type The type of Media to be returned. (optional)
     * @param stereoscopicType Search only for Media with a particular stereoscopic type. (optional)
     * @param category Search only for Media with a particular category. (optional)
     * @param size The number of results per page. (optional)
     * @param nextPageCursor Pass this cursor ID to get the next page of results. (optional)
     * @return ApiResponse&lt;TrendingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TrendingResponse> getTrendingWithHttpInfo(String type, String stereoscopicType, String category, Integer size, String nextPageCursor) throws ApiException {
        com.squareup.okhttp.Call call = getTrendingValidateBeforeCall(type, stereoscopicType, category, size, nextPageCursor, null, null);
        Type localVarReturnType = new TypeToken<TrendingResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Trending Endpoint (asynchronously)
     * The SVRF Trending Endpoint provides your app or project with the hottest immersive content curated by real humans. The experiences returned mirror the [SVRF homepage](https://www.svrf.com), from timely cultural content to trending pop-culture references. The trending experiences are updated regularly to ensure users always get fresh updates of immersive content.
     * @param type The type of Media to be returned. (optional)
     * @param stereoscopicType Search only for Media with a particular stereoscopic type. (optional)
     * @param category Search only for Media with a particular category. (optional)
     * @param size The number of results per page. (optional)
     * @param nextPageCursor Pass this cursor ID to get the next page of results. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTrendingAsync(String type, String stereoscopicType, String category, Integer size, String nextPageCursor, final ApiCallback<TrendingResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTrendingValidateBeforeCall(type, stereoscopicType, category, size, nextPageCursor, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TrendingResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for search
     * @param q Url-encoded search query. (required)
     * @param type The type of Media to be returned. (optional)
     * @param stereoscopicType Search only for Media with a particular stereoscopic type. (optional)
     * @param category Search only for Media with a particular category. (optional)
     * @param size The number of results to return per-page, from 1 to 100 default: 10. (optional)
     * @param pageNum Pagination control to fetch the next page of results, if applicable. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchCall(String q, String type, String stereoscopicType, String category, Integer size, Integer pageNum, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/vr/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (stereoscopicType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("stereoscopicType", stereoscopicType));
        if (category != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("category", category));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));
        if (pageNum != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageNum", pageNum));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "XAppToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchValidateBeforeCall(String q, String type, String stereoscopicType, String category, Integer size, Integer pageNum, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new ApiException("Missing the required parameter 'q' when calling search(Async)");
        }
        

        com.squareup.okhttp.Call call = searchCall(q, type, stereoscopicType, category, size, pageNum, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Endpoint
     * The SVRF Search Endpoint brings the power of immersive search found on [SVRF.com](https://www.svrf.com) to your app or project. SVRF&#39;s search engine enables your users to instantly find the immersive experience they&#39;re seeking. Content is sorted by the SVRF rating system, ensuring that the highest quality content and most prevalent search results are returned. 
     * @param q Url-encoded search query. (required)
     * @param type The type of Media to be returned. (optional)
     * @param stereoscopicType Search only for Media with a particular stereoscopic type. (optional)
     * @param category Search only for Media with a particular category. (optional)
     * @param size The number of results to return per-page, from 1 to 100 default: 10. (optional)
     * @param pageNum Pagination control to fetch the next page of results, if applicable. (optional)
     * @return SearchMediaResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SearchMediaResponse search(String q, String type, String stereoscopicType, String category, Integer size, Integer pageNum) throws ApiException {
        ApiResponse<SearchMediaResponse> resp = searchWithHttpInfo(q, type, stereoscopicType, category, size, pageNum);
        return resp.getData();
    }

    /**
     * Search Endpoint
     * The SVRF Search Endpoint brings the power of immersive search found on [SVRF.com](https://www.svrf.com) to your app or project. SVRF&#39;s search engine enables your users to instantly find the immersive experience they&#39;re seeking. Content is sorted by the SVRF rating system, ensuring that the highest quality content and most prevalent search results are returned. 
     * @param q Url-encoded search query. (required)
     * @param type The type of Media to be returned. (optional)
     * @param stereoscopicType Search only for Media with a particular stereoscopic type. (optional)
     * @param category Search only for Media with a particular category. (optional)
     * @param size The number of results to return per-page, from 1 to 100 default: 10. (optional)
     * @param pageNum Pagination control to fetch the next page of results, if applicable. (optional)
     * @return ApiResponse&lt;SearchMediaResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SearchMediaResponse> searchWithHttpInfo(String q, String type, String stereoscopicType, String category, Integer size, Integer pageNum) throws ApiException {
        com.squareup.okhttp.Call call = searchValidateBeforeCall(q, type, stereoscopicType, category, size, pageNum, null, null);
        Type localVarReturnType = new TypeToken<SearchMediaResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Endpoint (asynchronously)
     * The SVRF Search Endpoint brings the power of immersive search found on [SVRF.com](https://www.svrf.com) to your app or project. SVRF&#39;s search engine enables your users to instantly find the immersive experience they&#39;re seeking. Content is sorted by the SVRF rating system, ensuring that the highest quality content and most prevalent search results are returned. 
     * @param q Url-encoded search query. (required)
     * @param type The type of Media to be returned. (optional)
     * @param stereoscopicType Search only for Media with a particular stereoscopic type. (optional)
     * @param category Search only for Media with a particular category. (optional)
     * @param size The number of results to return per-page, from 1 to 100 default: 10. (optional)
     * @param pageNum Pagination control to fetch the next page of results, if applicable. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchAsync(String q, String type, String stereoscopicType, String category, Integer size, Integer pageNum, final ApiCallback<SearchMediaResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchValidateBeforeCall(q, type, stereoscopicType, category, size, pageNum, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SearchMediaResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
