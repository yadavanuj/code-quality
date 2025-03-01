package com.agiledcoders.solid.bettersingle;

/**
 * IT SIMULATES A CLASS READING FROM CONFIG FILES
 */
public class ConfigProvider {
    private final EmailMessenger.EmailConfig emailConfig;
    private final SMSMessenger.SMSConfig smsConfig;

    public ConfigProvider() {
        this.emailConfig = new EmailMessenger.EmailConfig();
        this.smsConfig = new SMSMessenger.SMSConfig();
    }

    public EmailMessenger.EmailConfig getEmailConfig() {
        return emailConfig;
    }

    public SMSMessenger.SMSConfig getSmsConfig() {
        return smsConfig;
    }
}
