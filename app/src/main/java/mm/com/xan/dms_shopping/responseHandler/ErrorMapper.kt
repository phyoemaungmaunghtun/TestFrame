package mm.com.xan.dms_shopping.responseHandler

import mm.com.xan.dms_shopping.ShieldApplication
import mm.com.xan.dms_shopping.delivery.R
import javax.inject.Inject

class ErrorMapper @Inject constructor() : ErrorMapperInterface {

    override fun getErrorString(errorId: Int): String {
        return ShieldApplication.context.getString(errorId)
    }

    override val errorsMap: Map<Int, String>
        get() = mapOf(
            Pair(Error.NO_INTERNET_CONNECTION, getErrorString(R.string.no_internet)),
            Pair(Error.NETWORK_ERROR, getErrorString(R.string.network_error))
        ).withDefault { getErrorString(R.string.network_error) }
}