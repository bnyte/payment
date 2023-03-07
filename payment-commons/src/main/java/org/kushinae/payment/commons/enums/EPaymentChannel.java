package org.kushinae.payment.commons.enums;

/**
 * @author kaisa.liu
 * @since 1.0.0
 */
public enum EPaymentChannel implements ICodeEnum<Integer> {
    APPLE(0, "apple"),
    GOOGLE(1, "google"),
    WECHAT(2, "wechat"),
    ALI_PAY(3, "alipay"),
    ;

    private final Integer code;

    private final String channel;

    EPaymentChannel(Integer code, String channel) {
        this.code = code;
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }
}
