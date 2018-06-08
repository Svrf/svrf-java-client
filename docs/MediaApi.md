# MediaApi

All URIs are relative to *https://api.svrf.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vrIdGet**](MediaApi.md#vrIdGet) | **GET** /vr/{id} | Media by ID Endpoint
[**vrSearchGet**](MediaApi.md#vrSearchGet) | **GET** /vr/search | Search Endpoint
[**vrTrendingGet**](MediaApi.md#vrTrendingGet) | **GET** /vr/trending | Trending Endpoint


<a name="vrIdGet"></a>
# **vrIdGet**
> SingleMediaResponse vrIdGet(id)

Media by ID Endpoint

Fetch media by its ID.

### Example
```java
// Import classes:
//import com.svrf.client.ApiClient;
//import com.svrf.client.ApiException;
//import com.svrf.client.Configuration;
//import com.svrf.client.auth.*;
//import com.svrf.client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: XAppToken
ApiKeyAuth XAppToken = (ApiKeyAuth) defaultClient.getAuthentication("XAppToken");
XAppToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//XAppToken.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
String id = "id_example"; // String | ID of Media
try {
    SingleMediaResponse result = apiInstance.vrIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#vrIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of Media |

### Return type

[**SingleMediaResponse**](SingleMediaResponse.md)

### Authorization

[XAppToken](../README.md#XAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="vrSearchGet"></a>
# **vrSearchGet**
> SearchMediaResponse vrSearchGet(q, type, stereoscopicType, size, pageNum)

Search Endpoint

The SVRF Search Endpoint brings the power of immersive search found on [SVRF.com](https://www.svrf.com) to your app or project. SVRF&#39;s search engine enables your users to instantly find the immersive experience they&#39;re seeking. Content is sorted by the SVRF rating system, ensuring that the highest quality content and most prevalent search results are returned. 

### Example
```java
// Import classes:
//import com.svrf.client.ApiClient;
//import com.svrf.client.ApiException;
//import com.svrf.client.Configuration;
//import com.svrf.client.auth.*;
//import com.svrf.client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: XAppToken
ApiKeyAuth XAppToken = (ApiKeyAuth) defaultClient.getAuthentication("XAppToken");
XAppToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//XAppToken.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
String q = "q_example"; // String | Url-encoded search query
String type = "type_example"; // String | The type of Media to be returned
String stereoscopicType = "stereoscopicType_example"; // String | Search only for Media with a particular stereoscopic type
Integer size = 56; // Integer | The number of results to return per-page, from 1 to 100 default: 10
Integer pageNum = 56; // Integer | Pagination control to fetch the next page of results, if applicable
try {
    SearchMediaResponse result = apiInstance.vrSearchGet(q, type, stereoscopicType, size, pageNum);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#vrSearchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Url-encoded search query |
 **type** | **String**| The type of Media to be returned | [optional] [enum: photo, video]
 **stereoscopicType** | **String**| Search only for Media with a particular stereoscopic type | [optional] [enum: none, top-bottom, left-right]
 **size** | **Integer**| The number of results to return per-page, from 1 to 100 default: 10 | [optional]
 **pageNum** | **Integer**| Pagination control to fetch the next page of results, if applicable | [optional]

### Return type

[**SearchMediaResponse**](SearchMediaResponse.md)

### Authorization

[XAppToken](../README.md#XAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="vrTrendingGet"></a>
# **vrTrendingGet**
> TrendingResponse vrTrendingGet(size, nextPageCursor)

Trending Endpoint

The SVRF Trending Endpoint provides your app or project with the hottest immersive content curated by real humans. The experiences returned mirror the [SVRF homepage](https://www.svrf.com), from timely cultural content to trending pop-culture references. The trending experiences are updated regularly to ensure users always get fresh updates of immersive content.

### Example
```java
// Import classes:
//import com.svrf.client.ApiClient;
//import com.svrf.client.ApiException;
//import com.svrf.client.Configuration;
//import com.svrf.client.auth.*;
//import com.svrf.client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: XAppToken
ApiKeyAuth XAppToken = (ApiKeyAuth) defaultClient.getAuthentication("XAppToken");
XAppToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//XAppToken.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
Integer size = 56; // Integer | The number of results per page.
String nextPageCursor = "nextPageCursor_example"; // String | Pass this cursor ID to get the next page of results.
try {
    TrendingResponse result = apiInstance.vrTrendingGet(size, nextPageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#vrTrendingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of results per page. | [optional]
 **nextPageCursor** | **String**| Pass this cursor ID to get the next page of results. | [optional]

### Return type

[**TrendingResponse**](TrendingResponse.md)

### Authorization

[XAppToken](../README.md#XAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json
