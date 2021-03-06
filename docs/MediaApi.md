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
> TrendingResponse getTrending(type, stereoscopicType, category, size, minimumWidth, pageNum, isFaceFilter, hasBlendShapes, requiresBlendShapes)

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
List<MediaType> type = Arrays.asList(new MediaType()); // List<MediaType> | The type(s) of Media to be returned (comma separated).
String stereoscopicType = "stereoscopicType_example"; // String | Search only for Media with a particular stereoscopic type.
String category = "category_example"; // String | Search only for Media with a particular category.
Integer size = 10; // Integer | The number of results per page.
Integer minimumWidth = 56; // Integer | The minimum width for video and photo Media, in pixels.
Integer pageNum = 56; // Integer | Pagination control to fetch the next page of results, if applicable.
Boolean isFaceFilter = true; // Boolean | Search only for Face Filters.
Boolean hasBlendShapes = true; // Boolean | Search only for Media that has blend shapes.
Boolean requiresBlendShapes = true; // Boolean | Search only for Media that requires blend shapes.
try {
    TrendingResponse result = apiInstance.getTrending(type, stereoscopicType, category, size, minimumWidth, pageNum, isFaceFilter, hasBlendShapes, requiresBlendShapes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#getTrending");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**List&lt;MediaType&gt;**](MediaType.md)| The type(s) of Media to be returned (comma separated). | [optional]
 **stereoscopicType** | **String**| Search only for Media with a particular stereoscopic type. | [optional] [enum: none, top-bottom, left-right]
 **category** | **String**| Search only for Media with a particular category. | [optional] [enum: Face Filters]
 **size** | **Integer**| The number of results per page. | [optional] [default to 10]
 **minimumWidth** | **Integer**| The minimum width for video and photo Media, in pixels. | [optional]
 **pageNum** | **Integer**| Pagination control to fetch the next page of results, if applicable. | [optional]
 **isFaceFilter** | **Boolean**| Search only for Face Filters. | [optional]
 **hasBlendShapes** | **Boolean**| Search only for Media that has blend shapes. | [optional]
 **requiresBlendShapes** | **Boolean**| Search only for Media that requires blend shapes. | [optional]

### Return type

[**TrendingResponse**](TrendingResponse.md)

### Authorization

[XAppToken](../README.md#XAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="search"></a>
# **search**
> SearchMediaResponse search(q, type, stereoscopicType, category, size, minimumWidth, pageNum, isFaceFilter, hasBlendShapes, requiresBlendShapes)

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
List<MediaType> type = Arrays.asList(new MediaType()); // List<MediaType> | The type(s) of Media to be returned (comma separated).
String stereoscopicType = "stereoscopicType_example"; // String | Search only for Media with a particular stereoscopic type.
String category = "category_example"; // String | Search only for Media with a particular category.
Integer size = 10; // Integer | The number of results to return per-page, from 1 to 100.
Integer minimumWidth = 56; // Integer | The minimum width for video and photo Media, in pixels.
Integer pageNum = 56; // Integer | Pagination control to fetch the next page of results, if applicable.
Boolean isFaceFilter = true; // Boolean | Search only for Face Filters.
Boolean hasBlendShapes = true; // Boolean | Search only for Media that has blend shapes.
Boolean requiresBlendShapes = true; // Boolean | Search only for Media that requires blend shapes.
try {
    SearchMediaResponse result = apiInstance.search(q, type, stereoscopicType, category, size, minimumWidth, pageNum, isFaceFilter, hasBlendShapes, requiresBlendShapes);
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
 **type** | [**List&lt;MediaType&gt;**](MediaType.md)| The type(s) of Media to be returned (comma separated). | [optional]
 **stereoscopicType** | **String**| Search only for Media with a particular stereoscopic type. | [optional] [enum: none, top-bottom, left-right]
 **category** | **String**| Search only for Media with a particular category. | [optional] [enum: Face Filters]
 **size** | **Integer**| The number of results to return per-page, from 1 to 100. | [optional] [default to 10]
 **minimumWidth** | **Integer**| The minimum width for video and photo Media, in pixels. | [optional]
 **pageNum** | **Integer**| Pagination control to fetch the next page of results, if applicable. | [optional]
 **isFaceFilter** | **Boolean**| Search only for Face Filters. | [optional]
 **hasBlendShapes** | **Boolean**| Search only for Media that has blend shapes. | [optional]
 **requiresBlendShapes** | **Boolean**| Search only for Media that requires blend shapes. | [optional]

### Return type

[**SearchMediaResponse**](SearchMediaResponse.md)

### Authorization

[XAppToken](../README.md#XAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

