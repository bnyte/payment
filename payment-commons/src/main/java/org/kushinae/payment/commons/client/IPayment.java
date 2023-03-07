package org.kushinae.payment.commons.client;

import org.kushinae.payment.commons.enums.EPaymentChannel;

/**
 * @author kaisa.liu
 * @since 1.0.0
 */
public interface IPayment {

    EPaymentChannel getChannel();

    String verify();


}
