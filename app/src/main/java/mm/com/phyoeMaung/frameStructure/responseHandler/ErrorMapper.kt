package mm.com.phyoeMaung.frameStructure.responseHandler

import mm.com.phyoeMaung.frameStructure.Application
import mm.com.phyoeMaung.frameStructure.R
import javax.inject.Inject

class ErrorMapper @Inject constructor() : ErrorMapperInterface {

    override fun getErrorString(errorId: Int): String {
        return Application.context.getString(errorId)
    }

    override val errorsMap: Map<Int, String>
        get() = mapOf(
            Pair(Error.NO_INTERNET_CONNECTION, getErrorString(R.string.no_internet)),
            Pair(Error.NETWORK_ERROR, getErrorString(R.string.network_error))
        ).withDefault { getErrorString(R.string.network_error) }
}