# MediaApi

All URIs are relative to *https://api.svrf.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vrIdGet**](MediaApi.md#vrIdGet) | **GET** /vr/{id} | Media by ID Endpoint
[**vrSearchqqGet**](MediaApi.md#vrSearchqqGet) | **GET** /vr/search?q&#x3D;{q} | Search Endpoint
[**vrTrendingGet**](MediaApi.md#vrTrendingGet) | **GET** /vr/trending | Trending Endpoint




<a name="vrIdGet"></a>
# **vrIdGet**
> Media vrIdGet(id)

Media by ID Endpoint

Fetch media by its ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MediaApi;



MediaApi apiInstance = new MediaApi();

String id = Arrays.asList("id_example"); // String | ID of Media

try {
    Media result = apiInstance.vrIdGet(id);
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

[**Media**](Media.md)

### Authorization

[XAppToken](../README.md#XAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a name="vrSearchqqGet"></a>
# **vrSearchqqGet**
> InlineResponse200 vrSearchqqGet(q, type, stereoscopicType, size, pageNum)

Search Endpoint

The SVRF Search Endpoint brings the power of immersive search found on [SVRF.com](https://www.svrf.com) to your app or project. SVRF&#x27;s search engine enables your users to instantly find the immersive experience they&#x27;re seeking. Content is sorted by the SVRF rating system, ensuring that the highest quality content and most prevalent search results are returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MediaApi;



MediaApi apiInstance = new MediaApi();

String q = Arrays.asList("q_example"); // String | Url-encoded search query

String type = Arrays.asList("type_example"); // String | The type of Media to be returned

String stereoscopicType = Arrays.asList("stereoscopicType_example"); // String | Search only for Media with a particular stereoscopic type

Integer size = Arrays.asList(56); // Integer | The number of results to return per-page, from 1 to 100 default: 10

Integer pageNum = Arrays.asList(56); // Integer | Pagination control to fetch the next page of results, if applicable

try {
    InlineResponse200 result = apiInstance.vrSearchqqGet(q, type, stereoscopicType, size, pageNum);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#vrSearchqqGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Url-encoded search query |
 **type** | **String**| The type of Media to be returned | [optional] [enum: photo, video]
 **stereoscopicType** | **String**| Search only for Media with a particular stereoscopic type | [optional] [enum: none, top-bottom, left-right]
 **size** | **Integer**| The number of results to return per-page, from 1 to 100 default: 10 | [optional] [enum: ]
 **pageNum** | **Integer**| Pagination control to fetch the next page of results, if applicable | [optional] [enum: ]


### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[XAppToken](../README.md#XAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a name="vrTrendingGet"></a>
# **vrTrendingGet**
> InlineResponse2002 vrTrendingGet(size, nextPageCursor)

Trending Endpoint

The SVRF Trending Endpoint provides your app or project with the hottest immersive content curated by real humans. The experiences returned mirror the [SVRF homepage](https://www.svrf.com), from timely cultural content to trending pop-culture references. The trending experiences are updated regularly to ensure users always get fresh updates of immersive content.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MediaApi;



MediaApi apiInstance = new MediaApi();

Integer size = Arrays.asList(56); // Integer | The number of results per page.

String nextPageCursor = Arrays.asList("nextPageCursor_example"); // String | Pass this cursor ID to get the next page of results.

try {
    InlineResponse2002 result = apiInstance.vrTrendingGet(size, nextPageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#vrTrendingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of results per page. | [optional] [enum: ]
 **nextPageCursor** | **String**| Pass this cursor ID to get the next page of results. | [optional]


### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[XAppToken](../README.md#XAppToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



