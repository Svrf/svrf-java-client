# MediaApi

All URIs are relative to *https://api.svrf.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getById**](MediaApi.md#getById) | **GET** /vr/{id} | Media by ID Endpoint
[**getTrending**](MediaApi.md#getTrending) | **GET** /vr/trending | Trending Endpoint
[**search**](MediaApi.md#search) | **GET** /vr/search | Search Endpoint


<a name="getById"></a>
# **getById**
> SingleMediaResponse getById(id)

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
    SingleMediaResponse result = apiInstance.getById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#getById");
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

<a name="getTrending"></a>
# **getTrending**
> TrendingResponse getTrending(type, stereoscopicType, category, size, nextPageCursor)

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
String type = "type_example"; // String | The type of Media to be returned.
String stereoscopicType = "stereoscopicType_example"; // String | Search only for Media with a particular stereoscopic type.
String category = "category_example"; // String | Search only for Media with a particular category.
Integer size = 56; // Integer | The number of results per page.
String nextPageCursor = "nextPageCursor_example"; // String | Pass this cursor ID to get the next page of results.
try {
    TrendingResponse result = apiInstance.getTrending(type, stereoscopicType, category, size, nextPageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#getTrending");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type of Media to be returned. | [optional]
 **stereoscopicType** | **String**| Search only for Media with a particular stereoscopic type. | [optional]
 **category** | **String**| Search only for Media with a particular category. | [optional]
 **size** | **Integer**| The number of results per page. | [optional]
 **nextPageCursor** | **String**| Pass this cursor ID to get the next page of results. | [optional]

### Return type

[**TrendingResponse**](TrendingResponse.md)

### Authorization

[XAppToken](../README.md#XAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="search"></a>
# **search**
> SearchMediaResponse search(q, type, stereoscopicType, category, size, pageNum)

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
String q = "q_example"; // String | Url-encoded search query.
String type = "type_example"; // String | The type of Media to be returned.
String stereoscopicType = "stereoscopicType_example"; // String | Search only for Media with a particular stereoscopic type.
String category = "category_example"; // String | Search only for Media with a particular category.
Integer size = 56; // Integer | The number of results to return per-page, from 1 to 100 default: 10.
Integer pageNum = 56; // Integer | Pagination control to fetch the next page of results, if applicable.
try {
    SearchMediaResponse result = apiInstance.search(q, type, stereoscopicType, category, size, pageNum);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Url-encoded search query. |
 **type** | **String**| The type of Media to be returned. | [optional]
 **stereoscopicType** | **String**| Search only for Media with a particular stereoscopic type. | [optional]
 **category** | **String**| Search only for Media with a particular category. | [optional]
 **size** | **Integer**| The number of results to return per-page, from 1 to 100 default: 10. | [optional]
 **pageNum** | **Integer**| Pagination control to fetch the next page of results, if applicable. | [optional]

### Return type

[**SearchMediaResponse**](SearchMediaResponse.md)

### Authorization

[XAppToken](../README.md#XAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

