<h2>TMDB App</h2>  
  
TMDB is an android application that lists [popular movies](https://developers.themoviedb.org/3/movies/get-popular-movies), [popular tv shows](https://developers.themoviedb.org/3/tv/get-popular-tv-shows) and [popular artists](https://developers.themoviedb.org/3/people/get-popular-people) based on MVVM architecture.

## API
- [Tmdb Api](https://developers.themoviedb.org/3)

## Prerequisite
- minSdkVersion: 21
- Add Api_key from [TMDB](https://developers.themoviedb.org/3) to gradle.properties named API_KEY
  
## Libraries
This app takes use of the following libraries:
- [JetPack](https://developer.android.com/jetpack) 🚀
    - [Data Binding](https://developer.android.com/topic/libraries/data-binding) - Declaratively bind observable data to UI elements
    - [Viewmodel](https://developer.android.com/jetpack/androidx/releases/room) - Manage UI data to survive configuration changes and is lifecycle-aware
    - [Room DB](https://developer.android.com/training/data-storage/room) - Fluent SQLite database access
    - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Notify views when underlying database changes
- [Room](https://developer.android.com/jetpack/androidx/releases/room)
- [Retrofit2](https://github.com/square/retrofit) - type safe http client with coroutines support
- [Gson](https://github.com/google/gson) - A Java serialization/deserialization library to convert Java Objects into JSON and back
- [Glide](https://github.com/bumptech/glide) - Hassle-free image loading
- [Dagger2](https://github.com/google/dagger) - A fast dependency injector for Android and Java.
- [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) - Library Support for coroutines
- [okhttp-logging-interceptor](https://github.com/square/okhttp/blob/master/okhttp-logging-interceptor/README.md) - logging HTTP request related data.
- Timber - A logger with a small, extensible API which provides utility on top of Android's normal Log class.