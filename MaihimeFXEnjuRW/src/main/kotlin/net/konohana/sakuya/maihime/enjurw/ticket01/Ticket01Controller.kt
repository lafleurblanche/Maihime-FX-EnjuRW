package net.konohana.sakuya.maihime.enjurw.ticket01

import java.net.URL
import java.util.*
import javafx.beans.property.BooleanProperty
import javafx.beans.property.SimpleBooleanProperty
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.ButtonType
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.control.TextInputDialog
import javafx.stage.Stage
import net.konohana.sakuya.maihime.enjurw.MaihimeFXEnjuRWApplication
import net.konohana.sakuya.maihime.enjurw.constant.code.TicketTypeCodeConst
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_D001
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_D002
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_D003
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_D004
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_D005
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_D006
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_D007
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_D008
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_PP001
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_PP002
import net.konohana.sakuya.maihime.enjurw.service.CerintheApiService
import net.konohana.sakuya.maihime.enjurw.service.InquiryApiService
import net.konohana.sakuya.maihime.enjurw.utils.checkInputValue
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn01
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn02
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn03
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn04
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn05
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn06
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn07
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn08
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn09
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn10
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn11
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn12
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn13
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn14
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn15
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn16
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn17
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn18
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn19
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn20
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn21
import net.konohana.sakuya.maihime.enjurw.utils.code.getFromStaCodeBtn22
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn01
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn02
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn03
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn04
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn05
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn06
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn07
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn08
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn09
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn10
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn11
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn12
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn13
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn14
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn15
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn16
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn17
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn18
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn19
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn20
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn21
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn22
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn23
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn24
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn25
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn26
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn27
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn28
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn29
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn30
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn31
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn32
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn33
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn34
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeBtn35
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeOp2Btn01
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeOp2Btn02
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeOp2Btn03
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeOp2Btn04
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeOp2Btn05
import net.konohana.sakuya.maihime.enjurw.utils.code.getToStaCodeOp2Btn07
import net.konohana.sakuya.maihime.enjurw.utils.date.getDayAfterTomorrowDate
import net.konohana.sakuya.maihime.enjurw.utils.date.getDayMonthLaterDate
import net.konohana.sakuya.maihime.enjurw.utils.date.getTodayDate
import net.konohana.sakuya.maihime.enjurw.utils.date.getTomorrowDate
import net.konohana.sakuya.maihime.enjurw.utils.showAlertDialog
import net.konohana.sakuya.maihime.enjurw.utils.showInfoDialog
import net.konohana.sakuya.maihime.enjurw.utils.url.fromStaInquiryApiUrlJudge
import net.konohana.sakuya.maihime.enjurw.utils.url.toStaInquiryApiUrlJudge

/**
 * ## FXMLコントローラー
 * * 乗車券要求画面
 * * 霞台総合管轄
 * @author lafleurblanche
 */
class Ticket01Controller : Initializable {

    /** モード表示ラベル */
    @FXML
    private lateinit var modeShowLbl: Label

    /** LCMボタン */
    @FXML
    private lateinit var btnLCM: Button

    /** 照会ボタン */
    @FXML
    private lateinit var btnInquiry: Button

    /** 発信ボタン */
    @FXML
    private lateinit var btnRequest: Button

    @FXML
    private fun onBtnInquiryClick() {
    }

    /**
     * 発信ボタン押下時処理
     */
    @FXML
    private fun onBtnRequestClick() {
        val cerintheApiService = CerintheApiService()
        //specialNoteTextField.text = cerintheApiService.postTicketRequest(fromStaCode)
        val res = cerintheApiService.postTicketRequestSample(
            fromSta = fromStaTextField.text,
            toSta = toStaTextField.text,
            viaRouteConfig = viaTextField.text,
            adultMember = adultTextField.text,
            halfMember = halfTextField.text,
            childMember = childTextField.text,
            monthOfUse = monthField.text,
            dayOfUse = dayTextField.text,
            ticketType = ticketTypeTextField.text,
            fromStaCode = fromStaCodeTextField.text,
            toStaCode = toStaCodeTextField.text,
            specialNote = specialNoteTextField.text,
        )
        if (res != null) {
            if (res.status == "OK") {
                showInfoDialog(res.reqNo)
            } else {
                showAlertDialog(res.result)
            }
        }
    }

    @FXML
    private fun onBtnLCMClick() {
        modeFlg.set(true)
        if (modeFlg.value) {
            modeShowLbl.text = "ローカルモード"
        }
        println(modeFlg.value)
    }

    /** OLMボタン */
    @FXML
    private lateinit var btnOLM: Button

    @FXML
    private fun onBtnOLMClick() {
        modeFlg.set(false)
        if (!modeFlg.value) {
            modeShowLbl.text = "オンラインモード"
        }
        println(modeFlg.value)
    }

    private var modeFlg: BooleanProperty = SimpleBooleanProperty(false)

    /** 発信時用変数(乗車駅コード) */
    private lateinit var fromStaCode: String

    /** 発信時用変数(降車駅コード) */
    private lateinit var toStaCode: String

    /** 発信時用変数(降車駅事務管コード) */
    private lateinit var  toStaManageCode: String

    /** 発信時用変数(経由コード) */
    private lateinit var viaRouteCode: String

    /** 発信時用変数(券種別コード) */
    private lateinit var ticketTypeCode: String

    /** 発信時用変数(特記事項) */
    private lateinit var specialNote: String

    /** 発信時用変数(大人人数) */
    private lateinit var adultMember: String

    /** 発信時用変数(半額人数) */
    private lateinit var halfMember: String

    /** 発信時用変数(小児人数) */
    private lateinit var childMember: String

    /** 乗車駅TextField */
    @FXML
    private lateinit var fromStaTextField: TextField

    /** 降車駅TextField */
    @FXML
    private lateinit var toStaTextField: TextField

    /** 降車駅事務管コードTextField */
    @FXML
    private lateinit var toStaManageCDTextField: TextField

    /** 月TextField */
    @FXML
    private lateinit var monthField: TextField

    /** 月TextField */
    @FXML
    private lateinit var dayTextField: TextField

    /** 大人人数入力TextField */
    @FXML
    private lateinit var adultTextField: TextField

    /** 半額人数入力TextField */
    @FXML
    private lateinit var halfTextField: TextField

    /** 小児人数入力extField */
    @FXML
    private lateinit var childTextField: TextField

    /** 券種別TextField */
    @FXML
    private lateinit var ticketTypeTextField: TextField

    /** 経由TextField */
    @FXML
    private lateinit var viaTextField: TextField

    /** 特記事項 */
    @FXML
    private lateinit var specialNoteTextField: TextField

    /** 乗車駅コード */
    @FXML
    private lateinit var fromStaCodeTextField: TextField

    /** 降車駅コード */
    @FXML
    private lateinit var  toStaCodeTextField: TextField

    /** 本日ボタン押下時処理 */
    @FXML
    private fun onTodayClick() {
        val date = getTodayDate()
        monthField.text = date.first
        dayTextField.text = date.second
    }

    /** 明日ボタン押下時処理 */
    @FXML
    private fun onTomorrowClick() {
        val date = getTomorrowDate()
        monthField.text = date.first
        dayTextField.text = date.second
    }

    /** 明後日ボタン押下時処理 */
    @FXML
    private fun onDayAfterTomorrowClick() {
        val date = getDayAfterTomorrowDate()
        monthField.text = date.first
        dayTextField.text = date.second
    }

    /** 明日ボタン押下時処理 */
    @FXML
    private fun onOneMonthLaterClick() {
        val date = getDayMonthLaterDate()
        monthField.text = date.first
        dayTextField.text = date.second
    }

    /** 大人1ボタン押下時処理 */
    @FXML
    private fun onAdult1Click() {
        adultTextField.text = "1"
        adultMember = "1"
    }

    /** 大人2ボタン押下時処理 */
    @FXML
    private fun onAdult2Click() {
        adultTextField.text = "2"
        adultMember = "2"
    }

    /** 半額1ボタン押下時処理 */
    @FXML
    private fun onHalf1Click() {
        halfTextField.text = "1"
        halfMember = "1"
    }

    /** 半額2ボタン押下時処理 */
    @FXML
    private fun onHalf2Click() {
        halfTextField.text = "2"
        halfMember = "2"
    }

    /** 小児1ボタン押下時処理 */
    @FXML
    private fun onChild1Click() {
        childTextField.text = "1"
        childMember = "1"
    }

    /** 小児2ボタン押下時処理 */
    @FXML
    private fun onChild2Click() {
        childTextField.text = "2"
        childMember = "2"
    }

    /** 大人1小児1ボタン押下時処理 */
    @FXML
    private fun onAdultAndChild1Click() {
        adultTextField.text = "1"
        adultMember = "1"
        childTextField.text = "1"
        childMember = "1"
    }

    /** 大人1小児2ボタン押下時処理 */
    @FXML
    private fun onAdultAndChild2Click() {
        adultTextField.text = "1"
        adultMember = "1"
        childTextField.text = "2"
        adultMember = "2"
    }

    /** 大人人数入力ボタン押下時処理 */
    @FXML
    private fun onInputAdultNumberClick() {

        val adultNumInputDialog = TextInputDialog("0")
        adultNumInputDialog.title = "大人人数入力"
        adultNumInputDialog.headerText = ""
        adultNumInputDialog.contentText = "人数を入力"
        adultNumInputDialog.dialogPane.lookupButton(ButtonType.CANCEL).isDisable = true
        adultNumInputDialog.dialogPane.lookupButton(ButtonType.CANCEL).isVisible = false
        adultNumInputDialog.dialogPane.lookupButton(ButtonType.CANCEL).isManaged = false
        adultNumInputDialog.showAndWait()

        val inputValue: String? = adultNumInputDialog.result
        adultTextField.text = checkInputValue(inputValue)

    }

    /** 半額人数入力ボタン押下時処理 */
    @FXML
    private fun onInputHalfNumberClick() {
        val halfNumInputDialog = TextInputDialog("0")
        halfNumInputDialog.title = "半額人数入力"
        halfNumInputDialog.headerText = ""
        halfNumInputDialog.contentText = "人数を入力"
        halfNumInputDialog.dialogPane.lookupButton(ButtonType.CANCEL).isDisable = true
        halfNumInputDialog.dialogPane.lookupButton(ButtonType.CANCEL).isVisible = false
        halfNumInputDialog.dialogPane.lookupButton(ButtonType.CANCEL).isManaged = false
        halfNumInputDialog.showAndWait()

        val halfInputValue: String? = halfNumInputDialog.result
        halfTextField.text = checkInputValue(halfInputValue)
    }

    /** 小児人数入力ボタン押下時処理 */
    @FXML
    private fun onInputChildNumberClick() {
        val childNumInputDialog = TextInputDialog("0")
        childNumInputDialog.title = "小児人数入力"
        childNumInputDialog.headerText = ""
        childNumInputDialog.contentText = "人数を入力"
        childNumInputDialog.dialogPane.lookupButton(ButtonType.CANCEL).isDisable = true
        childNumInputDialog.dialogPane.lookupButton(ButtonType.CANCEL).isVisible = false
        childNumInputDialog.dialogPane.lookupButton(ButtonType.CANCEL).isManaged = false
        childNumInputDialog.showAndWait()

        val childInputValue: String? = childNumInputDialog.result
        childTextField.text = checkInputValue(childInputValue)
    }

    /** 経路自動設定ボタン押下時処理 */
    @FXML
    private fun onRouteAutoDetectClick() {
        viaTextField.text = "経路自動設定"
    }

    /** 片道ボタン押下時処理 */
    @FXML
    private fun onOneWayClick() {
        ticketTypeTextField.text = "片道乗車券"
        ticketTypeCode = TicketTypeCodeConst.TICKET_TYPE_ONEWAY
    }

    /** 往復ボタン押下時処理 */
    @FXML
    private fun onRoundTripClick() {
        ticketTypeTextField.text = "往復乗車券"
        ticketTypeCode = TicketTypeCodeConst.TICKET_TYPE_ROUND_TRIP
    }

    /** 乗車駅設定ボタン押下時処理 */
    @FXML
    private fun onSetFromStaNameClick() {
        val stage = Stage()
        val fxmlLoader = FXMLLoader(MaihimeFXEnjuRWApplication::class.java.getResource("inquiry/fromsta-inquiry.fxml"))
        val scene = Scene(fxmlLoader.load(), 585.0, 620.0)
        stage.title = "乗車駅照会"
        stage.scene = scene
        stage.show()
    }

    /** 降車駅設定ボタン押下時処理 */
    @FXML
    private fun onSetToStaNameClick() {
        val stage = Stage()
        val fxmlLoader = FXMLLoader(MaihimeFXEnjuRWApplication::class.java.getResource("inquiry/tosta-inquiry.fxml"))
        val scene = Scene(fxmlLoader.load(), 585.0, 620.0)
        stage.title = "降車駅照会"
        stage.scene = scene
        stage.show()
    }

    /** 乗車駅設定ボタン押下時修正 */
    @FXML
    private fun onSendTestClick() {
        val inquiryApiService = InquiryApiService()
        val url = fromStaInquiryApiUrlJudge(fromStaCodeTextField.text)
        if (url == "未入力") {
            showAlertDialog("乗車駅コードが未入力です。")
        } else {
            val apiResponse = inquiryApiService.getFromStaName(url)
            fromStaTextField.text = apiResponse?.fromStaName
        }
    }

    /** 降車駅設定ボタン押下時修正 */
    @FXML
    private fun onSendTest2Click() {
        val inquiryApiService = InquiryApiService()
        val url = toStaInquiryApiUrlJudge(toStaCodeTextField.text)
        if (url == "未入力") {
            showAlertDialog("降車駅コードが未入力です。")
        } else {
            val apiResponse = inquiryApiService.getToStaName(url)
            toStaTextField.text = apiResponse?.toStaName
        }
    }

    /** 駅名カナボタン押下時処理 */
    @FXML
    private fun onStaNameKanaClick() {
        TODO("not implemented.")
    }

    /** 事務官コードボタン押下時処理*/
    @FXML
    private fun onManageCDInputClick() {
        TODO("not implemented.")
    }

    /** 特定7割ボタン押下時処理 */
    @FXML
    private fun onSp07BtnClick() {
        specialNoteTextField.text = PSGR_KBN_D001
    }

    /** 特7付添ボタン押下時処理 */
    @FXML
    private fun onSp7dBtnClick() {
        specialNoteTextField.text = PSGR_KBN_D002
    }

    /** 身障者単独ボタン押下時処理 */
    @FXML
    private fun onHandySingleBtnClick() {
        specialNoteTextField.text = PSGR_KBN_D005
    }

    /** 身障介助者ボタン押下時処理 */
    @FXML
    private fun onHandyCaregiverBtnClick() {
        specialNoteTextField.text = PSGR_KBN_D006
    }

    /** 被救護者ボタン押下時処理 */
    @FXML
    private fun onRescuedPersonBtnClick() {
        specialNoteTextField.text = PSGR_KBN_D007
    }

    /** 老年割引ボタン押下時処理 */
    @FXML
    private fun onSeniorDiscountBtnClick() {
        specialNoteTextField.text = PSGR_KBN_D008
    }

    /** 高校通学ボタン押下時処理 */
    @FXML
    private fun onSchoolBtnClick() {
        specialNoteTextField.text = PSGR_KBN_D003
    }

    /** 私学通学ボタン押下時処理 */
    @FXML
    private fun onSchoolPrivateScholarshipBtnClick() {
        specialNoteTextField.text = PSGR_KBN_PP001
    }

    /** 私学通学ボタン押下時処理 */
    @FXML
    private fun onSchoolPrivateBtnClick() {
        specialNoteTextField.text = PSGR_KBN_PP002
    }

    /** 高校通学ボタン押下時処理 */
    @FXML
    private fun onSchoolCorrespondenceBtnClick() {
        specialNoteTextField.text = PSGR_KBN_D004
    }

    /** 梼谷(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn01Click() {
        val fromStaCodeText = getFromStaCodeBtn01()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 東梼谷(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn02Click() {
        val fromStaCodeText = getFromStaCodeBtn02()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 卯花(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn03Click() {
        val fromStaCodeText = getFromStaCodeBtn03()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 上卯花(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn04Click() {
        val fromStaCodeText = getFromStaCodeBtn04()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 槐谷(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn05Click() {
        val fromStaCodeText = getFromStaCodeBtn05()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 苆谷(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn06Click() {
        val fromStaCodeText = getFromStaCodeBtn06()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 拯川(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn07Click() {
        val fromStaCodeText = getFromStaCodeBtn07()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 上拯川(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn08Click() {
        val fromStaCodeText = getFromStaCodeBtn08()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 茄谷(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn09Click() {
        val fromStaCodeText = getFromStaCodeBtn09()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 笥谷(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn10Click() {
        val fromStaCodeText = getFromStaCodeBtn10()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 筏谷(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn11Click() {
        val fromStaCodeText = getFromStaCodeBtn11()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 瑞堂(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn12Click() {
        val fromStaCodeText = getFromStaCodeBtn12()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 筮谷(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn13Click() {
        val fromStaCodeText = getFromStaCodeBtn13()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 和瀬(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn14Click() {
        val fromStaCodeText = getFromStaCodeBtn14()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 卯塚(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn15Click() {
        val fromStaCodeText = getFromStaCodeBtn15()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 東卯塚(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn16Click() {
        val fromStaCodeText = getFromStaCodeBtn16()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 筁谷(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn17Click() {
        val fromStaCodeText = getFromStaCodeBtn17()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 筥谷(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn18Click() {
        val fromStaCodeText = getFromStaCodeBtn18()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 粥坂(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn19Click() {
        val fromStaCodeText = getFromStaCodeBtn19()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 笒谷(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn20Click() {
        val fromStaCodeText = getFromStaCodeBtn20()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 箬谷(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn21Click() {
        val fromStaCodeText = getFromStaCodeBtn21()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 梧谷(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn22Click() {
        val fromStaCodeText = getFromStaCodeBtn22()
        fromStaTextField.text = fromStaCodeText.first
        fromStaCodeTextField.text = fromStaCodeText.second
        fromStaCode = fromStaCodeText.second
    }

    /** 苆谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn01Click() {
        val toStaCodeText = getToStaCodeBtn01()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 東苆谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn02Click() {
        val toStaCodeText = getToStaCodeBtn02()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 茄谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn03Click() {
        val toStaCodeText = getToStaCodeBtn03()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 上茄谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn04Click() {
        val toStaCodeText = getToStaCodeBtn04()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 笥谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn05Click() {
        val toStaCodeText = getToStaCodeBtn05()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 鵩山(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn06Click() {
        val toStaCodeText = getToStaCodeBtn06()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 上鵩山(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn07Click() {
        val toStaCodeText = getToStaCodeBtn07()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 筏谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn08Click() {
        val toStaCodeText = getToStaCodeBtn08()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 中筏谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn09Click() {
        val toStaCodeText = getToStaCodeBtn09()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 蛞川(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn10Click() {
        val toStaCodeText = getToStaCodeBtn10()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 筮谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn11Click() {
        val toStaCodeText = getToStaCodeBtn11()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 中筮谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn12Click() {
        val toStaCodeText = getToStaCodeBtn12()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 上筮谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn13Click() {
        val toStaCodeText = getToStaCodeBtn13()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 筁谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn14Click() {
        val toStaCodeText = getToStaCodeBtn14()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 諾川(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn15Click() {
        val toStaCodeText = getToStaCodeBtn15()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 筥谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn16Click() {
        val toStaCodeText = getToStaCodeBtn16()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 本筥谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn17Click() {
        val toStaCodeText = getToStaCodeBtn17()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 笒谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn18Click() {
        val toStaCodeText = getToStaCodeBtn18()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 畭谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn19Click() {
        val toStaCodeText = getToStaCodeBtn19()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 上畭谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn20Click() {
        val toStaCodeText = getToStaCodeBtn20()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 箬谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn21Click() {
        val toStaCodeText = getToStaCodeBtn21()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 西箬谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn22Click() {
        val toStaCodeText = getToStaCodeBtn22()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 苕谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn23Click() {
        val toStaCodeText = getToStaCodeBtn23()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 東苕谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn24Click() {
        val toStaCodeText = getToStaCodeBtn24()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 扆谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn25Click() {
        val toStaCodeText = getToStaCodeBtn25()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 奥扆谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn26Click() {
        val toStaCodeText = getToStaCodeBtn26()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 珩谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn27Click() {
        val toStaCodeText = getToStaCodeBtn27()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 中珩谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn28Click() {
        val toStaCodeText = getToStaCodeBtn28()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 上珩谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn29Click() {
        val toStaCodeText = getToStaCodeBtn29()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 玿谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn30Click() {
        val toStaCodeText = getToStaCodeBtn30()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 上玿谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn31Click() {
        val toStaCodeText = getToStaCodeBtn31()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 珮谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn32Click() {
        val toStaCodeText = getToStaCodeBtn32()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 上珮谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn33Click() {
        val toStaCodeText = getToStaCodeBtn33()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 荍谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn34Click() {
        val toStaCodeText = getToStaCodeBtn34()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 上荍谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaBtn35Click() {
        val toStaCodeText = getToStaCodeBtn35()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 梼谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaOp2Btn01Click() {
        val toStaCodeText = getToStaCodeOp2Btn01()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 東梼谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaOp2Btn02Click() {
        val toStaCodeText = getToStaCodeOp2Btn02()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 卯花(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaOp2Btn03Click() {
        val toStaCodeText = getToStaCodeOp2Btn03()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 上卯花(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaOp2Btn04Click() {
        val toStaCodeText = getToStaCodeOp2Btn04()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 槐谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaOp2Btn05Click() {
        val toStaCodeText = getToStaCodeOp2Btn05()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 槐谷(降車駅)ボタン押下時処理 */
    @FXML
    private fun onToStaOp2Btn07Click() {
        val toStaCodeText = getToStaCodeOp2Btn07()
        toStaTextField.text = toStaCodeText.first
        toStaCodeTextField.text = toStaCodeText.second
        toStaCode = toStaCodeText.second
    }

    /** 乗車駅クリアボタン押下時処理 */
    @FXML
    private fun onClearFromStaTextFieldClick() {
        fromStaTextField.text = ""
    }

    /** 降車駅クリアボタン押下時処理 */
    @FXML
    private fun onClearToStaTextFieldClick() {
        toStaTextField.text = ""
    }

    /** 大人人数クリアボタン押下時処理 */
    @FXML
    private fun onClearAdultTextFieldClick() {
        adultTextField.text = ""
    }

    /** 半額人数クリアボタン押下時処理 */
    @FXML
    private fun onClearHalfTextFieldClick() {
        halfTextField.text = ""
    }

    /** 小児人数クリアボタン押下時処理 */
    @FXML
    private fun onClearChildTextFieldClick() {
        childTextField.text = ""
    }

    /** 券種別クリアボタン押下時処理 */
    @FXML
    private fun onClearTicketTypeTextFieldClick() {
        ticketTypeTextField.text = ""
    }
    override fun initialize(location: URL?, resources: ResourceBundle?) {
        fromStaCode = "乗車駅コード"
    }
}
