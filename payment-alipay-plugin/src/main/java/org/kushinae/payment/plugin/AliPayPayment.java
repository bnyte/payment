package org.kushinae.payment.plugin;

import org.kushinae.payment.commons.client.IPayment;
import org.kushinae.payment.commons.enums.EPaymentChannel;

/**
 * @author kaisa.liu
 * @since 1.0.0
 */
public class AliPayPayment implements IPayment {

    @Override
    public EPaymentChannel getChannel() {
        return EPaymentChannel.ALI_PAY;
    }

    @Override
    public String verify() {
        return null;
    }
    
}
