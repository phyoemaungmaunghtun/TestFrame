package mm.com.phyoeMaung.frameStructure.remote.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class TestResponseModel(
   override var RespCode: String,
   override var RespDescription: String,
            @SerializedName("lstAccount")
            var lstAccount: List<AccountDetail>?,
            @SerializedName("UserID")
            var UserID: String,
            @SerializedName("FullName")
            var FullName: String,
            @SerializedName("SessionID")
            var SessionID: String,
            @SerializedName("DynemicKey")
            var DynemicKey: String,
            @SerializedName("LastLoginDate")
            var LastLoginDate: String,
            @SerializedName("FirstTimeFlag")
            var FirstTimeFlag: String?):BaseResponseModel(
    RespCode,
    RespDescription
){
class AccountDetail(
    @SerializedName("ResponseCode")
    var ResponseCode:String,
    @SerializedName("ResponseDesc")
    var ResponseDesc:String,
    @SerializedName("CustID")
    var CustID:String,
    @SerializedName("AccountID")
    var AccountID:String,
    @SerializedName("AccountType")
    var AccountType:String,
    @SerializedName("Currency")
    var Currency:String,
    @SerializedName("AcctOpenDate")
    var AcctOpenDate:String,
    @SerializedName("BranchCode")
    var BranchCode:String,
    @SerializedName("ModeOfOper")
    var ModeOfOper:String,
    @SerializedName("AvailableBal")
    var AvailableBal:String,
    @SerializedName("LedgerBal")
    var LedgerBal:String,
    @SerializedName("InstallmentAmt")
    var InstallmentAmt:String,
    @SerializedName("InterestRate")
    var InterestRate:String,
    @SerializedName("SanctionAmt")
    var SanctionAmt:String,
    @SerializedName("OverdueAmt")
    var OverdueAmt:String,
    @SerializedName("LienAmt")
    var LienAmt:String,
    @SerializedName("DisburseAmt")
    var DisburseAmt:String,
    @SerializedName("NextInstallDueDate")
    var NextInstallDueDate:String
):Serializable
}