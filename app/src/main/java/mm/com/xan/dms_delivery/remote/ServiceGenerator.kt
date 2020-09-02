package mm.com.xan.dms_delivery.remote

import mm.com.xan.dms_delivery.ShieldApplication
import mm.com.xan.dms_delivery.remote.models.BaseResponseModel
import mm.com.xan.dms_delivery.remote.models.TestResponseModel
import mm.com.xan.dms_delivery.repository.Resource
import mm.com.xan.dms_delivery.responseHandler.Error
import mm.com.xan.dms_delivery.utilities.Log.INSTANCE.d
import mm.com.xan.dms_delivery.utilities.Network
import retrofit2.Response
import retrofit2.Retrofit
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ServiceGenerator @Inject
constructor(private val retrofit: Retrofit) {

    fun <S> createService(serviceClass: Class<S>): S {
        return retrofit.create(serviceClass)
    }

    fun handleResponse(responseCall: Any?): Resource<BaseResponseModel> {
        return when (responseCall) {
            is TestResponseModel -> {
                d("FullName", responseCall.FullName)
                Resource.Success(data = responseCall)
            }
            else -> {
                Resource.DataError(errorCode = responseCall as Int)
            }
        }

    }


    suspend fun processCall(responseCall: suspend () -> Response<*>): Any? {
        if (!Network.isConnected(ShieldApplication.context)) {
            return Error.NO_INTERNET_CONNECTION
        }
        return try {
            val response = responseCall.invoke()
            val responseCode = response.code()
            if (response.isSuccessful) {
                response.body()
            } else {
                responseCode
            }
        } catch (e: IOException) {
            Error.NETWORK_ERROR
        }
    }
}