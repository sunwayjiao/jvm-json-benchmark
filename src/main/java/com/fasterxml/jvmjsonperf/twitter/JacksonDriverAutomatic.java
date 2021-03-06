package com.fasterxml.jvmjsonperf.twitter;

import com.fasterxml.jvmjsonperf.std.StdJacksonConverter;

/**
 * Driver that uses "automatic" (bean/annotation-based) serialization with
 * Jackson (compared to hand-written one)
 */
public final class JacksonDriverAutomatic
    extends TwitterDriver
{
    public JacksonDriverAutomatic() throws Exception
    {
        super(new StdJacksonConverter<TwitterSearch>(TwitterSearch.class));
    }

    public static StdJacksonConverter<TwitterSearch> getConverter() {
        return new StdJacksonConverter<TwitterSearch>(TwitterSearch.class);
    }
}
