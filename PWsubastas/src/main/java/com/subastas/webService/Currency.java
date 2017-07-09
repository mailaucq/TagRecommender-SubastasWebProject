
package com.subastas.webService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Currency")
@XmlEnum
public enum Currency {

    AFA,
    ALL,
    DZD,
    ARS,
    AWG,
    AUD,
    BSD,
    BHD,
    BDT,
    BBD,
    BZD,
    BMD,
    BTN,
    BOB,
    BWP,
    BRL,
    GBP,
    BND,
    BIF,
    XOF,
    XAF,
    KHR,
    CAD,
    CVE,
    KYD,
    CLP,
    CNY,
    COP,
    KMF,
    CRC,
    HRK,
    CUP,
    CYP,
    CZK,
    DKK,
    DJF,
    DOP,
    XCD,
    EGP,
    SVC,
    EEK,
    ETB,
    EUR,
    FKP,
    GMD,
    GHC,
    GIP,
    XAU,
    GTQ,
    GNF,
    GYD,
    HTG,
    HNL,
    HKD,
    HUF,
    ISK,
    INR,
    IDR,
    IQD,
    ILS,
    JMD,
    JPY,
    JOD,
    KZT,
    KES,
    KRW,
    KWD,
    LAK,
    LVL,
    LBP,
    LSL,
    LRD,
    LYD,
    LTL,
    MOP,
    MKD,
    MGF,
    MWK,
    MYR,
    MVR,
    MTL,
    MRO,
    MUR,
    MXN,
    MDL,
    MNT,
    MAD,
    MZM,
    MMK,
    NAD,
    NPR,
    ANG,
    NZD,
    NIO,
    NGN,
    KPW,
    NOK,
    OMR,
    XPF,
    PKR,
    XPD,
    PAB,
    PGK,
    PYG,
    PEN,
    PHP,
    XPT,
    PLN,
    QAR,
    ROL,
    RUB,
    WST,
    STD,
    SAR,
    SCR,
    SLL,
    XAG,
    SGD,
    SKK,
    SIT,
    SBD,
    SOS,
    ZAR,
    LKR,
    SHP,
    SDD,
    SRG,
    SZL,
    SEK,
    CHF,
    SYP,
    TWD,
    TZS,
    THB,
    TOP,
    TTD,
    TND,
    TRL,
    USD,
    AED,
    UGX,
    UAH,
    UYU,
    VUV,
    VEB,
    VND,
    YER,
    YUM,
    ZMK,
    ZWD,
    TRY;

    public String value() {
        return name();
    }

    public static Currency fromValue(String v) {
        return valueOf(v);
    }

}
