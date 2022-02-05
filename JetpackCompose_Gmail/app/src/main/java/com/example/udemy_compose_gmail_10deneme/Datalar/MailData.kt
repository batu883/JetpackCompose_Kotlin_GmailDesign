package com.example.udemy_compose_gmail_10deneme.Datalar

sealed class MailData(
    val mailId:Int,
    val userName:String,
    val subject:String,
    val body:String,
    val time:String
) {
    object MailOne: MailData(
        mailId = 1,
        userName = "Özge",
        subject = "Özgemail1mail1mail1",
        body = "Özgemail1mail1mail1Özgemail1mail1mail1Özgemail1mail1mail1" +
                "Özgemail1mail1mail1Özgemail1mail1mail1Özgemail1mail1mail1" +
                "Özgemail1mail1mail1Özgemail1mail1mail1Özgemail1mail1mail1",
        time = "21:10"
    )
    object MailTwo: MailData(
        mailId = 2,
        userName = "Doğan",
        subject = "Mailkonusu2",
        body = "Mailkonusu2Mailkonusu2Mailkonusu2Mailkonusu2Mailkonusu2Mailkonusu2Mailkonusu2Mailkonusu2" +
                "Mailkonusu2Mailkonusu2Mailkonusu2Mailkonusu2Mailkonusu2Mailkonusu2Mailkonusu2",
        time = "19:10"
    )
    object MailThree: MailData(
        mailId = 3,
        userName = "Doğan",
        subject = "Mailkonusu3",
        body = "Mailkonusu3Mailkonusu3Mailkonusu3",
        time = "20:10"
    )
    object MailFour: MailData(
        mailId = 4,
        userName = "ÇiçekSepeti",
        subject = "Siparişinizi Aldık",
        body = "Siparişinizi aldık,yola çıkınca bilgi vereceğiz.",
        time = "21:10"
    )
    object MailFive: MailData(
        mailId = 5,
        userName = "ÇiçeekSepeti",
        subject = "Siparişiniz yolda",
        body = "Siparişiniz muhteşem Karınıza iletilmek üzere yola çıkmıştır",
        time = "22:10"
    )
    object MailSix: MailData(
        mailId = 6,
        userName = "ÇiçekSepeti",
        subject = "Sipariş iletildi",
        body = "Karşı taraf siparişinizi aldı",
        time = "23:10"
    )
    object MailSeven: MailData(
        mailId = 7,
        userName = "Nilnaz Akbaşoğullar",
        subject = "Incudemy",
        body = "Akşamki meeting blablablablabla",
        time = "00:10"
    )
    object MailEight: MailData(
        mailId = 8,
        userName = "Çağdaş Özer",
        subject = "Incudemy +",
        body = "Incudemy+ programı için şu testleri yapınız test1-test2-test3",
        time = "09:10"
    )
    object MailNine: MailData(
        mailId = 9,
        userName = "Kadir",
        subject = "Kadir Batuhan Demir",
        body = "Kadir Batuhan Demir yazlığınız onarıma girmiştir",
        time = "1:10"
    )
    object MailTen: MailData(
        mailId = 10,
        userName = "Batuhan",
        subject = "batubatu",
        body = "batubatubatubatubatubatubatubatubatubatu",
        time = "21:30"
    )

}
