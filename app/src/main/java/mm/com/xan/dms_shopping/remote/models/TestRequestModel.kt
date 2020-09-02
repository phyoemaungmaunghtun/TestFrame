package mm.com.xan.dms_shopping.remote.models

data class TestRequestModel(
    override var ClientVersion: String,
    override var DeviceOS: String,
    override var DeviceModel: String,
    override var DeviceID: String,
    var UserName: String,
    var loginPassword: String,
    var Firebasetoken: String,
    var UserType: String,
    var IV: String
): BaseRequestModel(ClientVersion, DeviceOS,DeviceModel,DeviceID)