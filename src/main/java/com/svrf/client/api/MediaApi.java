/*
 * SVRF API
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
import com.svrf.client.model.MediaType;
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
     * @param type The type(s) of Media to be returned (comma separated). (optional)
     * @param stereoscopicType Search only for Media with a particular stereoscopic type. (optional)
     * @param category Search only for Media with a particular category. (optional)
     * @param size The number of results per page. (optional, default to 10)
     * @param minimumWidth The minimum width for video and photo Media, in pixels. (optional)
     * @param pageNum Pagination control to fetch the next page of results, if applicable. (optional)
     * @param isFaceFilter Search only for Face Filters. (optional)
     * @param hasBlendShapes Search only for Media that has blend shapes. (optional)
     * @param requiresBlendShapes Search only for Media that requires blend shapes. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTrendingCall(List<MediaType> type, String stereoscopicType, String category, Integer size, Integer minimumWidth, Integer pageNum, Boolean isFaceFilter, Boolean hasBlendShapes, Boolean requiresBlendShapes, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/vr/trending";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "type", type));
        if (stereoscopicType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("stereoscopicType", stereoscopicType));
        if (category != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("category", category));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));
        if (minimumWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("minimumWidth", minimumWidth));
        if (pageNum != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageNum", pageNum));
        if (isFaceFilter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("isFaceFilter", isFaceFilter));
        if (hasBlendShapes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("hasBlendShapes", hasBlendShapes));
        if (requiresBlendShapes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("requiresBlendShapes", requiresBlendShapes));

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
    private com.squareup.okhttp.Call getTrendingValidateBeforeCall(List<MediaType> type, String stereoscopicType, String category, Integer size, Integer minimumWidth, Integer pageNum, Boolean isFaceFilter, Boolean hasBlendShapes, Boolean requiresBlendShapes, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getTrendingCall(type, stereoscopicType, category, size, minimumWidth, pageNum, isFaceFilter, hasBlendShapes, requiresBlendShapes, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Trending Endpoint
     * The SVRF Trending Endpoint provides your app or project with the hottest immersive content curated by real humans. The experiences returned mirror the [SVRF homepage](https://www.svrf.com), from timely cultural content to trending pop-culture references. The trending experiences are updated regularly to ensure users always get fresh updates of immersive content.
     * @param type The type(s) of Media to be returned (comma separated). (optional)
     * @param stereoscopicType Search only for Media with a particular stereoscopic type. (optional)
     * @param category Search only for Media with a particular category. (optional)
     * @param size The number of results per page. (optional, default to 10)
     * @param minimumWidth The minimum width for video and photo Media, in pixels. (optional)
     * @param pageNum Pagination control to fetch the next page of results, if applicable. (optional)
     * @param isFaceFilter Search only for Face Filters. (optional)
     * @param hasBlendShapes Search only for Media that has blend shapes. (optional)
     * @param requiresBlendShapes Search only for Media that requires blend shapes. (optional)
     * @return TrendingResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TrendingResponse getTrending(List<MediaType> type, String stereoscopicType, String category, Integer size, Integer minimumWidth, Integer pageNum, Boolean isFaceFilter, Boolean hasBlendShapes, Boolean requiresBlendShapes) throws ApiException {
        ApiResponse<TrendingResponse> resp = getTrendingWithHttpInfo(type, stereoscopicType, category, size, minimumWidth, pageNum, isFaceFilter, hasBlendShapes, requiresBlendShapes);
        return resp.getData();
    }

    /**
     * Trending Endpoint
     * The SVRF Trending Endpoint provides your app or project with the hottest immersive content curated by real humans. The experiences returned mirror the [SVRF homepage](https://www.svrf.com), from timely cultural content to trending pop-culture references. The trending experiences are updated regularly to ensure users always get fresh updates of immersive content.
     * @param type The type(s) of Media to be returned (comma separated). (optional)
     * @param stereoscopicType Search only for Media with a particular stereoscopic type. (optional)
     * @param category Search only for Media with a particular category. (optional)
     * @param size The number of results per page. (optional, default to 10)
     * @param minimumWidth The minimum width for video and photo Media, in pixels. (optional)
     * @param pageNum Pagination control to fetch the next page of results, if applicable. (optional)
     * @param isFaceFilter Search only for Face Filters. (optional)
     * @param hasBlendShapes Search only for Media that has blend shapes. (optional)
     * @param requiresBlendShapes Search only for Media that requires blend shapes. (optional)
     * @return ApiResponse&lt;TrendingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TrendingResponse> getTrendingWithHttpInfo(List<MediaType> type, String stereoscopicType, String category, Integer size, Integer minimumWidth, Integer pageNum, Boolean isFaceFilter, Boolean hasBlendShapes, Boolean requiresBlendShapes) throws ApiException {
        com.squareup.okhttp.Call call = getTrendingValidateBeforeCall(type, stereoscopicType, category, size, minimumWidth, pageNum, isFaceFilter, hasBlendShapes, requiresBlendShapes, null, null);
        Type localVarReturnType = new TypeToken<TrendingResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Trending Endpoint (asynchronously)
     * The SVRF Trending Endpoint provides your app or project with the hottest immersive content curated by real humans. The experiences returned mirror the [SVRF homepage](https://www.svrf.com), from timely cultural content to trending pop-culture references. The trending experiences are updated regularly to ensure users always get fresh updates of immersive content.
     * @param type The type(s) of Media to be returned (comma separated). (optional)
     * @param stereoscopicType Search only for Media with a particular stereoscopic type. (optional)
     * @param category Search only for Media with a particular category. (optional)
     * @param size The number of results per page. (optional, default to 10)
     * @param minimumWidth The minimum width for video and photo Media, in pixels. (optional)
     * @param pageNum Pagination control to fetch the next page of results, if applicable. (optional)
     * @param isFaceFilter Search only for Face Filters. (optional)
     * @param hasBlendShapes Search only for Media that has blend shapes. (optional)
     * @param requiresBlendShapes Search only for Media that requires blend shapes. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTrendingAsync(List<MediaType> type, String stereoscopicType, String category, Integer size, Integer minimumWidth, Integer pageNum, Boolean isFaceFilter, Boolean hasBlendShapes, Boolean requiresBlendShapes, final ApiCallback<TrendingResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTrendingValidateBeforeCall(type, stereoscopicType, category, size, minimumWidth, pageNum, isFaceFilter, hasBlendShapes, requiresBlendShapes, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TrendingResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for search
     * @param q Url-encoded search query. (required)
     * @param type The type(s) of Media to be returned (comma separated). (optional)
     * @param stereoscopicType Search only for Media with a particular stereoscopic type. (optional)
     * @param category Search only for Media with a particular category. (optional)
     * @param size The number of results to return per-page, from 1 to 100. (optional, default to 10)
     * @param minimumWidth The minimum width for video and photo Media, in pixels. (optional)
     * @param pageNum Pagination control to fetch the next page of results, if applicable. (optional)
     * @param isFaceFilter Search only for Face Filters. (optional)
     * @param hasBlendShapes Search only for Media that has blend shapes. (optional)
     * @param requiresBlendShapes Search only for Media that requires blend shapes. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchCall(String q, List<MediaType> type, String stereoscopicType, String category, Integer size, Integer minimumWidth, Integer pageNum, Boolean isFaceFilter, Boolean hasBlendShapes, Boolean requiresBlendShapes, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/vr/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
        if (type != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "type", type));
        if (stereoscopicType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("stereoscopicType", stereoscopicType));
        if (category != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("category", category));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));
        if (minimumWidth != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("minimumWidth", minimumWidth));
        if (pageNum != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageNum", pageNum));
        if (isFaceFilter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("isFaceFilter", isFaceFilter));
        if (hasBlendShapes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("hasBlendShapes", hasBlendShapes));
        if (requiresBlendShapes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("requiresBlendShapes", requiresBlendShapes));

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
    private com.squareup.okhttp.Call searchValidateBeforeCall(String q, List<MediaType> type, String stereoscopicType, String category, Integer size, Integer minimumWidth, Integer pageNum, Boolean isFaceFilter, Boolean hasBlendShapes, Boolean requiresBlendShapes, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new ApiException("Missing the required parameter 'q' when calling search(Async)");
        }
        

        com.squareup.okhttp.Call call = searchCall(q, type, stereoscopicType, category, size, minimumWidth, pageNum, isFaceFilter, hasBlendShapes, requiresBlendShapes, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Endpoint
     * The SVRF Search Endpoint brings the power of immersive search found on [SVRF.com](https://www.svrf.com) to your app or project. SVRF&#39;s search engine enables your users to instantly find the immersive experience they&#39;re seeking. Content is sorted by the SVRF rating system, ensuring that the highest quality content and most prevalent search results are returned. 
     * @param q Url-encoded search query. (required)
     * @param type The type(s) of Media to be returned (comma separated). (optional)
     * @param stereoscopicType Search only for Media with a particular stereoscopic type. (optional)
     * @param category Search only for Media with a particular category. (optional)
     * @param size The number of results to return per-page, from 1 to 100. (optional, default to 10)
     * @param minimumWidth The minimum width for video and photo Media, in pixels. (optional)
     * @param pageNum Pagination control to fetch the next page of results, if applicable. (optional)
     * @param isFaceFilter Search only for Face Filters. (optional)
     * @param hasBlendShapes Search only for Media that has blend shapes. (optional)
     * @param requiresBlendShapes Search only for Media that requires blend shapes. (optional)
     * @return SearchMediaResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SearchMediaResponse search(String q, List<MediaType> type, String stereoscopicType, String category, Integer size, Integer minimumWidth, Integer pageNum, Boolean isFaceFilter, Boolean hasBlendShapes, Boolean requiresBlendShapes) throws ApiException {
        ApiResponse<SearchMediaResponse> resp = searchWithHttpInfo(q, type, stereoscopicType, category, size, minimumWidth, pageNum, isFaceFilter, hasBlendShapes, requiresBlendShapes);
        return resp.getData();
    }

    /**
     * Search Endpoint
     * The SVRF Search Endpoint brings the power of immersive search found on [SVRF.com](https://www.svrf.com) to your app or project. SVRF&#39;s search engine enables your users to instantly find the immersive experience they&#39;re seeking. Content is sorted by the SVRF rating system, ensuring that the highest quality content and most prevalent search results are returned. 
     * @param q Url-encoded search query. (required)
     * @param type The type(s) of Media to be returned (comma separated). (optional)
     * @param stereoscopicType Search only for Media with a particular stereoscopic type. (optional)
     * @param category Search only for Media with a particular category. (optional)
     * @param size The number of results to return per-page, from 1 to 100. (optional, default to 10)
     * @param minimumWidth The minimum width for video and photo Media, in pixels. (optional)
     * @param pageNum Pagination control to fetch the next page of results, if applicable. (optional)
     * @param isFaceFilter Search only for Face Filters. (optional)
     * @param hasBlendShapes Search only for Media that has blend shapes. (optional)
     * @param requiresBlendShapes Search only for Media that requires blend shapes. (optional)
     * @return ApiResponse&lt;SearchMediaResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SearchMediaResponse> searchWithHttpInfo(String q, List<MediaType> type, String stereoscopicType, String category, Integer size, Integer minimumWidth, Integer pageNum, Boolean isFaceFilter, Boolean hasBlendShapes, Boolean requiresBlendShapes) throws ApiException {
        com.squareup.okhttp.Call call = searchValidateBeforeCall(q, type, stereoscopicType, category, size, minimumWidth, pageNum, isFaceFilter, hasBlendShapes, requiresBlendShapes, null, null);
        Type localVarReturnType = new TypeToken<SearchMediaResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Endpoint (asynchronously)
     * The SVRF Search Endpoint brings the power of immersive search found on [SVRF.com](https://www.svrf.com) to your app or project. SVRF&#39;s search engine enables your users to instantly find the immersive experience they&#39;re seeking. Content is sorted by the SVRF rating system, ensuring that the highest quality content and most prevalent search results are returned. 
     * @param q Url-encoded search query. (required)
     * @param type The type(s) of Media to be returned (comma separated). (optional)
     * @param stereoscopicType Search only for Media with a particular stereoscopic type. (optional)
     * @param category Search only for Media with a particular category. (optional)
     * @param size The number of results to return per-page, from 1 to 100. (optional, default to 10)
     * @param minimumWidth The minimum width for video and photo Media, in pixels. (optional)
     * @param pageNum Pagination control to fetch the next page of results, if applicable. (optional)
     * @param isFaceFilter Search only for Face Filters. (optional)
     * @param hasBlendShapes Search only for Media that has blend shapes. (optional)
     * @param requiresBlendShapes Search only for Media that requires blend shapes. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchAsync(String q, List<MediaType> type, String stereoscopicType, String category, Integer size, Integer minimumWidth, Integer pageNum, Boolean isFaceFilter, Boolean hasBlendShapes, Boolean requiresBlendShapes, final ApiCallback<SearchMediaResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchValidateBeforeCall(q, type, stereoscopicType, category, size, minimumWidth, pageNum, isFaceFilter, hasBlendShapes, requiresBlendShapes, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SearchMediaResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
