package harshbarash.github.retrofit.api

import okhttp3.Interceptor
import okhttp3.Response

class MyInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
            .newBuilder()
            .addHeader("Content-Type","application/json")
            .addHeader("X-Platform","Android")
            .addHeader("X-Auth-Token","1234567890")
            .build()
        return chain.proceed(request)
    }
}