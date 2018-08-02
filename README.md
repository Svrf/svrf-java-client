# svrf-client - the Java client library for the SVRF API

For more information, please visit [https://github.com/svrf/svrf-api](https://github.com/svrf/svrf-api)

## Getting Started

SVRF's API allows you to supercharge your project or app with the first and largest search engine for immersive experiences. We make it simple for any developer to incorporate highly immersive experiences with all kinds of applications: virtual reality, augmented reality, mixed reality, mobile, and web.

The SVRF API Documentation is available at <https://developers.svrf.com>.

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.svrf</groupId>
  <artifactId>svrf-client</artifactId>
  <version>1.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.svrf:svrf-client:1.1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/svrf-client-1.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.svrf.client.*;
import com.svrf.client.auth.*;
import com.svrf.client.model.*;
import com.svrf.client.api.AuthenticateApi;

import java.io.File;
import java.util.*;

public class AuthenticateApiExample {

    public static void main(String[] args) {
        
        AuthenticateApi apiInstance = new AuthenticateApi();
        Body body = new Body(); // Body | 
        try {
            AuthResponse result = apiInstance.authenticate(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticateApi#authenticate");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.svrf.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticateApi* | [**authenticate**](docs/AuthenticateApi.md#authenticate) | **POST** /app/authenticate | Authenticate application
*MediaApi* | [**getById**](docs/MediaApi.md#getById) | **GET** /vr/{id} | Media by ID Endpoint
*MediaApi* | [**getTrending**](docs/MediaApi.md#getTrending) | **GET** /vr/trending | Trending Endpoint
*MediaApi* | [**search**](docs/MediaApi.md#search) | **GET** /vr/search | Search Endpoint


## Documentation for Models

 - [APIKey](docs/APIKey.md)
 - [Body](docs/Body.md)
 - [Category](docs/Category.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Media](docs/Media.md)
 - [MediaFiles](docs/MediaFiles.md)
 - [MediaImages](docs/MediaImages.md)
 - [MediaStereo](docs/MediaStereo.md)
 - [MediaType](docs/MediaType.md)
 - [MediaVideos](docs/MediaVideos.md)
 - [StereoscopicType](docs/StereoscopicType.md)
 - [SuccessResponse](docs/SuccessResponse.md)
 - [AuthResponse](docs/AuthResponse.md)
 - [RateLimitResponse](docs/RateLimitResponse.md)
 - [SearchMediaResponse](docs/SearchMediaResponse.md)
 - [SingleMediaResponse](docs/SingleMediaResponse.md)
 - [TrendingResponse](docs/TrendingResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### XAppToken

- **Type**: API key
- **API key parameter name**: x-app-token
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

api@svrf.com

