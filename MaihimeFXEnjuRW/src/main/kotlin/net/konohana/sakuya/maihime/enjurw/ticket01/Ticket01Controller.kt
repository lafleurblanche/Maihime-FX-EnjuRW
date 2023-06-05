package net.konohana.sakuya.maihime.enjurw.ticket01

import java.net.URL
import java.util.*
import javafx.beans.property.BooleanProperty
import javafx.beans.property.SimpleBooleanProperty
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Button
import javafx.scene.control.ButtonType
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.control.TextInputDialog
import net.konohana.sakuya.maihime.enjurw.constant.code.TicketTypeCodeConst
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_D001
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_D002
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_D003
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_D004
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_D005
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_D006
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_D007
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_PP001
import net.konohana.sakuya.maihime.enjurw.constant.psgrkbn.PassengerKbnConst.Companion.PSGR_KBN_PP002
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
import net.konohana.sakuya.maihime.enjurw.utils.showAlertDialog
import net.konohana.sakuya.maihime.enjurw.utils.date.getDayAfterTomorrowDate
import net.konohana.sakuya.maihime.enjurw.utils.date.getDayMonthLaterDate
import net.konohana.sakuya.maihime.enjurw.utils.date.getTodayDate
import net.konohana.sakuya.maihime.enjurw.utils.date.getTomorrowDate


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

    @FXML
    private fun onBtnInquiryClick() {
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

    /** 経路1ボタン押下時処理 */
    @FXML
    private fun onRoute1Click() {
        var data = toStaCodeTextField.text
        if (data.equals("")) {
            showAlertDialog("降車駅が未入力です。")
        }  else {
            viaTextField.text = ""
        }
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
    }

    /** 乗車駅設定ボタン押下時処理 */
    @FXML
    private fun onSetToStaNameClick() {

    }

    /** 通信試験ボタン押下時修正 */
    @FXML
    private fun onSendTestClick() {

    }

    /** 通信試験2ボタン押下時修正 */
    @FXML
    private fun onSendTest2Click() {

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

    /** 姫橋(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn10Click() {
        fromStaTextField.text = "姫橋"
        fromStaCodeTextField.text = "KNHN10"
    }

    /** 襅町(乗車駅)ボタン押下時処理 */
    @FXML
    private fun onFromStaBtn11Click() {
        fromStaTextField.text = "襅町"
        fromStaCodeTextField.text = "KNHN12"
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
        // Nothing
    }
}